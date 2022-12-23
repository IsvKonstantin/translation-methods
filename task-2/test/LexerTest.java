import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class LexerTest {

    private List<Token> collectTokens(Lexer lexer) {
        List<Token> tokens = new ArrayList<>();

        while (lexer.hasNextToken()) {
            tokens.add(lexer.getToken());
            lexer.nextToken();
        }

        tokens.add(lexer.getToken());
        return tokens;
    }

    private void runTestCorrect(String test, List<Token> tokens) throws ParseException {
        Lexer lexer = new Lexer();
        lexer.tokenize(test);

        assertEquals(tokens, collectTokens(lexer));
    }

    private void runTestIncorrect(String test, String message, int position) {
        Lexer lexer = new Lexer();

        ParseException e = assertThrows(
                ParseException.class,
                () -> lexer.tokenize(test),
                "Expected Lexer to throw an exception"
        );

        assertEquals(message, e.getMessage());
        assertEquals(position, e.getErrorOffset());
    }

    @Test
    public void testSimpleInput() throws ParseException {
        String test = "a and b";
        List<Token> tokens = List.of(Token.VAR, Token.AND, Token.VAR, Token.END);

        runTestCorrect(test, tokens);
    }

    @Test
    public void testEmptyInput() throws ParseException {
        String test = "";
        List<Token> tokens = List.of(Token.END);

        runTestCorrect(test, tokens);
    }

    @Test
    public void testAllTokens() throws ParseException {
        String test = "(a and b) xor (c in d) or ((not a) not in f)";
        List<Token> tokens = List.of(Token.LPAREN, Token.VAR, Token.AND, Token.VAR, Token.RPAREN, Token.XOR,
                Token.LPAREN, Token.VAR, Token.IN, Token.VAR, Token.RPAREN, Token.OR,
                Token.LPAREN, Token.LPAREN, Token.NOT, Token.VAR, Token.RPAREN, Token.NIN, Token.VAR, Token.RPAREN, Token.END);

        runTestCorrect(test, tokens);
    }

    @Test
    public void testCorrectVariables() throws ParseException {
        Lexer lexer = new Lexer();
        String test = "(a and b) xor (c in d) or ((not a) not in f)";
        List<String> variables = List.of("a", "b", "c", "d", "a", "f");
        lexer.tokenize(test);

        int counter = 0;
        while (lexer.hasNextToken()) {
            if (lexer.getToken() == Token.VAR) {
                assertEquals(variables.get(counter), lexer.getVariable());
                counter += 1;
            }

            lexer.nextToken();
        }
        assertEquals(lexer.getToken(), Token.END);
    }

    @Test
    public void testWrongVariableName1() {
        String test = " a and B";
        String message = "Illegal character: B";
        int position = 7;

        runTestIncorrect(test, message, position);
    }

    @Test
    public void testWrongVariableName2() {
        String test = "a and variable";
        String message = "Unknown operator: variable";
        int position = 6;

        runTestIncorrect(test, message, position);
    }

    @Test
    public void testWrongLogicalOperator1() {
        String test = "a & B";
        String message = "Illegal character: &";
        int position = 2;

        runTestIncorrect(test, message, position);
    }

    @Test
    public void testWrongLogicalOperator2() {
        String test = "a ant b";
        String message = "Unknown operator: ant";
        int position = 2;

        runTestIncorrect(test, message, position);
    }
}
