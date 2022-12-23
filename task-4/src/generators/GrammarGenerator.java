package generators;

import Utils.Pair;
import gen.GrammarLexer;
import gen.GrammarParser;
import grammar.Grammar;
import grammar.GrammarRule;
import grammar.LexerRule;
import grammar.ParserRule;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class GrammarGenerator {
    private static final String SPACE = " ";
    private final String pathToGrammar;

    public GrammarGenerator(String path) {
        this.pathToGrammar = path;
    }

    private List<String> generateCommonAttributes(GrammarParser.NewGrammarContext ctx) {
        List<String> attributes = new ArrayList<>();

        for (GrammarParser.CommonAttributeContext attribute : ctx.commonAttributes().commonAttribute()) {
            attributes.add(attribute.NTERM_ID(0).getText() + SPACE + attribute.NTERM_ID(1).getText() +
                    attribute.SEMICOLON().getText());
        }

        return attributes;
    }

    private String generateName(GrammarParser.NewGrammarContext ctx) {
        return ctx.grammarName().TERM_ID().getText();
    }

    private void generateParserRule(GrammarParser.ParserSubRuleContext ctx, String name, String attribute,
                                    List<GrammarRule> rules) {
        if (ctx.OR() != null) {
            generateParserRule(ctx.parserSubRule(0), name, attribute, rules);
            generateParserRule(ctx.parserSubRule(1), name, attribute, rules);
        } else {
            String code = "";
            List<Pair<String, String>> children = new ArrayList<>();

            if (ctx.CODE() != null) {
                code = ctx.CODE().getText();
            }

            for (GrammarParser.ParserRuleSectionContext section : ctx.parserRuleSection()) {
                String sectionName;
                String sectionAttribute = "()";

                if (section.TERM_ID() != null) {
                    sectionName = section.TERM_ID().getText();
                } else {
                    sectionName = section.NTERM_ID().getText();

                    if (section.ATTRIBUTE() != null) {
                        sectionAttribute = section.ATTRIBUTE().getText();
                    }
                }

                children.add(new Pair<>(sectionName, sectionAttribute));
            }

            rules.add(new ParserRule(name, code, attribute, children));
        }
    }

    private List<GrammarRule> generateRules(GrammarParser.NewGrammarContext ctx) {
        List<GrammarRule> rules = new ArrayList<>();

        for (GrammarParser.GrammarRuleContext rule : ctx.grammarRules().grammarRule()) {
            if (rule.grammarParserRule() != null) {
                String name = rule.grammarParserRule().NTERM_ID().getText();
                String attribute = "";
                if (rule.grammarParserRule().attributeDeclaration() != null) {
                    attribute = rule.grammarParserRule().attributeDeclaration().NTERM_ID(0).getText() + SPACE +
                            rule.grammarParserRule().attributeDeclaration().NTERM_ID(1).getText();
                }

                generateParserRule(rule.grammarParserRule().parserSubRule(), name, attribute, rules);
            } else {
                String name = rule.grammarLexerRule().TERM_ID().getText();
                String pattern = rule.grammarLexerRule().REGEX().getText();
                pattern = pattern.substring(1, pattern.length() - 1);
                String code = "";
                if (rule.grammarLexerRule().CODE() != null) {
                    code = rule.grammarLexerRule().CODE().getText();
                }

                rules.add(new LexerRule(name, code, pattern));
            }
        }

        rules.add(new LexerRule("EPS", "", ""));
        return rules;
    }

    public Grammar generateGrammar() throws IOException {
        String text = Files.readString(Paths.get(pathToGrammar));

        GrammarLexer lexer = new GrammarLexer(CharStreams.fromString(text));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        GrammarParser parser = new GrammarParser(tokens);
        GrammarParser.NewGrammarContext newGrammarContext = parser.newGrammar();

        String name = generateName(newGrammarContext);
        List<GrammarRule> rules = generateRules(newGrammarContext);
        List<String> attributes = generateCommonAttributes(newGrammarContext);
        return new Grammar(name, rules, attributes);
    }
}
