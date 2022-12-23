package generators;

import grammar.Grammar;
import grammar.GrammarRule;
import grammar.LexerRule;
import org.apache.commons.text.StringSubstitutor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;

public class LexerGenerator {
    private static final String LS = System.lineSeparator();
    private static final String TAB = "    ";
    private final Grammar grammar;

    public LexerGenerator(Grammar grammar) {
        this.grammar = grammar;
    }

    public void generateLexer() throws IOException {
        StringBuilder patternsBuilder = new StringBuilder();
        StringBuilder lexerRulesBuilder = new StringBuilder();
        String skip = "";

        for (GrammarRule rule : grammar.getRules()) {
            if (rule instanceof LexerRule) {
                if (rule.getName().equals("SKIP")) {
                    skip = " = new ArrayList<>(Collections.singletonList(Rule." + rule.getName() + "))";
                }

                if (((LexerRule) rule).getPattern().isEmpty()) {
                    continue;
                }

                LexerRule currentRule = (LexerRule) rule;
                patternsBuilder.append("(").append(currentRule.getPattern()).append(")|");
                lexerRulesBuilder.append(LS).append(TAB).append(TAB).append("new Pair<>(");
                lexerRulesBuilder.append("Rule.").append(currentRule.getName()).append(", ");
                lexerRulesBuilder.append("Pattern.compile(\"").append(currentRule.getPattern()).append("\")),");
            }
        }

        patternsBuilder.deleteCharAt(patternsBuilder.toString().length() - 1).append("\"");
        lexerRulesBuilder.deleteCharAt(lexerRulesBuilder.toString().length() - 1);
        String patterns = patternsBuilder.toString().replace("\\", "\\\\");
        String lexerRules = lexerRulesBuilder.toString().replace("\\", "\\\\");

        String name = grammar.getName();
        String path = "src/templates/LexerTemplate.txt";
        Map<String, String> substitutionMap = Map.of("name", name,
                "patterns", patterns, "rules", lexerRules, "skipRules", skip);
        String code = new StringSubstitutor(substitutionMap).replace(Files.readString(Paths.get(path)));
        Files.writeString(Paths.get("src/" + name + "/" + name + "Lexer.java"), code);
    }
}
