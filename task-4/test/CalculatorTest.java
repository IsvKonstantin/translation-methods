import Calculator.CalculatorParser;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    private void runTestCorrect(String test, int expected) throws ParseException, IOException {
        CalculatorParser parser = new CalculatorParser();
        CalculatorParser.Node node = parser.parse(test);

        assertEquals(node.val, expected);
    }

    private void runTestIncorrect(String test, String message, int position) {
        CalculatorParser parser = new CalculatorParser();

        ParseException e = assertThrows(
                ParseException.class,
                () -> parser.parse(test),
                "Expected Parser to throw an exception"
        );

        assertEquals(message, e.getMessage());
        assertEquals(position, e.getErrorOffset());
    }

    @Test
    public void testSimpleInput() throws IOException, ParseException {
        runTestCorrect("2 + 2", 4);
        runTestCorrect("2 * 3", 6);
        runTestCorrect("5 - 2", 3);
        runTestCorrect("20 / 4", 5);
    }

    @Test
    public void testComplexInput() throws IOException, ParseException {
        runTestCorrect("15  *   6 + (8 + 16  /2)   / 2", 98);
    }

    @Test
    public void testSingleNumber() throws IOException, ParseException {
        runTestCorrect("123", 123);
    }

    @Test
    public void testManyBrackets() throws IOException, ParseException {
        runTestCorrect("(((5)))*((1)+(((6))))", 35);
    }

    @Test
    public void testPriority() throws IOException, ParseException {
        runTestCorrect("2 + 2 * 2", 6);
    }

    @Test
    public void testEmpty() {
        String test = "";
        String message = "Incorrect token: ";
        int position = 0;

        runTestIncorrect(test, message, position);
    }

    @Test
    public void testMissingOperator() {
        String test = "(1 + 2) (3 + 4)";
        String message = "Incorrect token: (";
        int position = 9;

        runTestIncorrect(test, message, position);
    }

    @Test
    public void testMissingOperand() {
        String test = "(1 *) + 2";
        String message = "Incorrect token: )";
        int position = 5;

        runTestIncorrect(test, message, position);
    }

    @Test
    public void testMismatchingBrackets() {
        String test = "(1 + 2) * (3";
        String message = "Incorrect token: ";
        int position = 12;

        runTestIncorrect(test, message, position);
    }

    @Test
    public void testEndOfExpression() {
        String test = "(1 + 2))";
        String message = "Incorrect token: )";
        int position = 8;

        runTestIncorrect(test, message, position);
    }

    @Test
    public void testEmptyBrackets() {
        String test = "()";
        String message = "Incorrect token: )";
        int position = 2;

        runTestIncorrect(test, message, position);
    }

    @Test
    public void testIncorrectInput1() {
        String test = "(1) + * 2";
        String message = "Incorrect token: *";
        int position = 7;

        runTestIncorrect(test, message, position);
    }

    @Test
    public void testIncorrectInput2() {
        String test = "1 * 2 +";
        String message = "Incorrect token: ";
        int position = 7;

        runTestIncorrect(test, message, position);
    }
}
