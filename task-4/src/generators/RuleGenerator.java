package generators;

import grammar.Grammar;
import grammar.GrammarRule;
import grammar.ParserRule;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Set;

public class RuleGenerator {
    private static final String TAB = "    ";
    private static final String COMMA = ",";
    private static final String SEMICOLON = ";";
    private static final String LS = System.lineSeparator();
    private final Grammar grammar;

    public RuleGenerator(Grammar grammar) {
        this.grammar = grammar;
    }

    public void generateRules() throws IOException {
        Set<String> rules = new HashSet<>();
        StringBuilder lexerRulesBuilder = new StringBuilder();
        StringBuilder parserRulesBuilder = new StringBuilder();
        StringBuilder rulesBuilder = new StringBuilder();

        for (GrammarRule rule : grammar.getRules()) {
            if (!rules.contains(rule.getName())) {
                if (rule instanceof ParserRule) {
                    parserRulesBuilder.append(TAB).append(rule.getName()).append(COMMA).append(LS);
                } else {
                    lexerRulesBuilder.append(TAB).append(rule.getName()).append(COMMA).append(LS);
                }

                rules.add(rule.getName());
            }
        }

        rulesBuilder.append("package ").append(grammar.getName()).append(SEMICOLON).append(LS).append(LS);
        rulesBuilder.append("public enum Rule {").append(LS);
        rulesBuilder.append(parserRulesBuilder.toString()).append(LS);
        rulesBuilder.append(TAB).append("END,").append(LS).append(TAB).append("ANY_ID,").append(LS);
        rulesBuilder.append(lexerRulesBuilder.toString()).append("}");

        Files.createDirectories(Paths.get("src/" + grammar.getName()));
        Files.writeString(Paths.get("src/" + grammar.getName() + "/Rule.java"), rulesBuilder.toString());
    }
}
