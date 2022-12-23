import generators.GrammarGenerator;
import generators.LexerGenerator;
import generators.ParserGenerator;
import generators.RuleGenerator;
import grammar.Grammar;

import java.io.IOException;
import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws IOException, ParseException {
        generate("src/Logical.gg");
        generate("src/calculator.gg");
        generate("src/LogicalOld.gg");

//        LogicalLexer lexer = new LogicalLexer();
//
//        String text = "a and b";
//        LogicalParser parser = new LogicalParser();
//        LogicalParser.Node answer = parser.parse(text);
//        System.out.println(answer.toString());
    }

    static void generate(String path) throws IOException {
        GrammarGenerator generator = new GrammarGenerator(path);
        Grammar newGrammar = generator.generateGrammar();

        RuleGenerator ruleGenerator = new RuleGenerator(newGrammar);
        ruleGenerator.generateRules();

        LexerGenerator lexerGenerator = new LexerGenerator(newGrammar);
        lexerGenerator.generateLexer();

        ParserGenerator parserGenerator = new ParserGenerator(newGrammar);
        parserGenerator.generateParser();
    }
}
