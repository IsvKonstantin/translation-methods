package generators;

import Utils.Pair;
import grammar.Grammar;
import grammar.GrammarRule;
import grammar.ParserRule;
import org.apache.commons.text.StringSubstitutor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class ParserGenerator {

    private static final String LS = System.lineSeparator();
    private static final String NODE_TEMPLATE = "${t1}public Node ${name}(${attr}) throws ParseException {" + LS +
            "${t2}Node res = new Node(\"${name}\", Rule.${name});" + LS + "${t2}switch (lexer.getTokenRule()) {" + LS;

    private static final String TAB1 = "    ";
    private static final String TAB2 = "        ";
    private static final String TAB3 = "            ";
    private static final String TAB4 = "                ";
    private static final String END = "END";
    private static final String EPS = "EPS";

    private final Grammar grammar;
    private Map<String, Set<String>> first;
    private Map<String, Set<String>> follow;

    public ParserGenerator(Grammar grammar) {
        this.grammar = grammar;
        this.first = new HashMap<>();
        this.follow = new HashMap<>();
    }

    public void constructFirst() {
        for (GrammarRule rule : grammar.getRules()) {
            first.put(rule.getName(), new HashSet<>());
        }

        boolean changed = true;
        while (changed) {
            changed = false;

            for (GrammarRule rule : grammar.getRules()) {
                String name = rule.getName();
                Set<String> previous = new HashSet<>(first.get(name));

                if (rule instanceof ParserRule) {
                    List<String> children = ((ParserRule) rule).getChildrenNames();
                    first.get(name).addAll(first.get(children.get(0)));
                } else {
                    first.get(name).add(name);
                }

                changed = !previous.equals(first.get(name)) || changed;
            }
        }
    }

    public void constructFollow() {
        Set<String> parserRulesNames = new HashSet<>();
        for (GrammarRule rule : grammar.getRules()) {
            if (rule instanceof ParserRule) {
                parserRulesNames.add(rule.getName());
            }

            follow.put(rule.getName(), new HashSet<>());
        }

        follow.get(grammar.getRules().get(0).getName()).add(END);
        boolean changed = true;
        while (changed) {
            changed = false;

            for (GrammarRule rule : grammar.getRules()) {
                if (rule instanceof ParserRule) {
                    List<String> children = ((ParserRule) rule).getChildrenNames();

                    for (int i = 0; i < children.size(); i++) {
                        if (parserRulesNames.contains(children.get(i))) {
                            String name = children.get(i);
                            Set<String> previous = new HashSet<>(follow.get(name));
                            String nextName = (children.size() != i + 1) ? children.get(i + 1) : EPS;
                            Set<String> toAdd = new HashSet<>(first.get(nextName));
                            toAdd.remove(EPS);
                            follow.get(name).addAll(toAdd);

                            if (first.get(nextName).contains(EPS)) {
                                follow.get(name).addAll(follow.get(rule.getName()));
                            }

                            changed = !previous.equals(follow.get(name)) || changed;
                        }
                    }
                }
            }
        }
    }

    public void generateParser() throws IOException {
        constructFirst();
        constructFollow();

        Set<String> parserRulesNames = new HashSet<>();
        for (GrammarRule rule : grammar.getRules()) {
            if (rule instanceof ParserRule) {
                parserRulesNames.add(rule.getName());
            }
        }

        Map<String, StringBuilder> rulesMap = new HashMap<>();
        for (GrammarRule rule : grammar.getRules()) {
            if (rule instanceof ParserRule) {
                ParserRule parserRule = (ParserRule) rule;
                String name = parserRule.getName();

                if (!rulesMap.containsKey(name)) {
                    String attribute = parserRule.getAttribute();
                    Map<String, String> substitutionMap =
                            Map.of("name", name, "attr", attribute, "t1", TAB1, "t2", TAB2);
                    StringBuilder stringBuilder =
                            new StringBuilder(new StringSubstitutor(substitutionMap).replace(NODE_TEMPLATE));
                    rulesMap.put(name, stringBuilder);
                }

                StringBuilder stringBuilder = rulesMap.get(name);
                Set<String> tokens = first.get(parserRule.getChildrenNames().get(0));
                for (String token : tokens) {
                    if (token.equals(EPS)) {
                        for (String following : follow.get(name)) {
                            Map<String, String> substitutionMap = Map.of("t3", TAB3, "t4", TAB4);
                            stringBuilder.append(new StringSubstitutor(substitutionMap).replace(
                                    "${t3}case " + following + ":" + LS + "${t4}" +
                                            parserRule.getCode()+ "break;" + LS));
                        }
                    } else {
                        String caseTemplate = TAB3 + "case " + token + ": {" + LS;
                        stringBuilder.append(caseTemplate);

                        for (Pair<String, String> child : parserRule.getChildren()) {
                            String currentRule = child.getFirst();

                            if (parserRulesNames.contains(currentRule)) {
                                String attribute = child.getSecond();
                                Map<String, String> substitutionMap =
                                        Map.of("currentRule", currentRule, "attr", attribute, "t4", TAB4);
                                stringBuilder.append(new StringSubstitutor(substitutionMap).replace(
                                        "${t4}Node ${currentRule} = ${currentRule}${attr};" + LS +
                                                "${t4}res.children.add(${currentRule});" + LS));
                            } else {
                                Map<String, String> substitutionMap = Map.of("currentRule", currentRule, "t4", TAB4);
                                stringBuilder.append(new StringSubstitutor(substitutionMap).replace(
                                        "${t4}Node ${currentRule} = new Node(lexer.getTokenText(), Rule.${currentRule});" + LS +
                                                "${t4}res.children.add(${currentRule});" + LS +
                                                "${t4}checkToken(Rule.${currentRule});" + LS));
                            }
                        }

                        Map<String, String> valuesMap = Map.of("t3", TAB3, "t4", TAB4);
                        stringBuilder.append(new StringSubstitutor(valuesMap).replace(
                                "${t4}" + parserRule.getCode() + "break;" + LS + "${t3}}" + LS));
                    }
                }

                rulesMap.put(name, stringBuilder);
            }
        }

        String grammarName = grammar.getName();
        StringBuilder nodesBuilder = new StringBuilder();
        StringBuilder commonBuilder = new StringBuilder();
        for (String attribute : grammar.getCommonAttributes()) {
            commonBuilder.append(TAB2).append("public ").append(attribute).append(LS);
        }

        Map<String, String> substitutionMap = Map.of("name", grammarName, "vars", commonBuilder.toString(),
                "startRule", grammar.getRules().get(0).getName(), "t1", TAB1, "t2", TAB2, "t3", TAB3, "t4", TAB4);

        String path = "src/templates/ParserTemplate.txt";
        String code = new StringSubstitutor(substitutionMap).replace(Files.readString(Paths.get(path)));
        nodesBuilder.append(code);
        for (StringBuilder sb : rulesMap.values()) {
            String nodeEnd = "${t3}default:" + LS +
                    "${t4}throw new ParseException(\"Incorrect token: \" + lexer.getTokenText(), lexer.getIndex());" + LS +
                    "${t2}}" + LS + "${t2}return res;" + LS + "${t1}}" + LS;
            nodesBuilder.append(sb.toString()).append(new StringSubstitutor(substitutionMap).replace(nodeEnd)).append(LS);
        }
        nodesBuilder.append("}");

        Files.writeString(Paths.get("src/" + grammarName + "/" + grammarName + "Parser.java"), nodesBuilder.toString());
    }
}
