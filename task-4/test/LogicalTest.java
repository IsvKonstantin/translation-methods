import Logical.LogicalParser;
import Utils.Visualizer;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class LogicalTest {
    @SuppressWarnings({"ResultOfMethodCallIgnored", "unused"})
    @AfterEach
    private void removeTempFiles() {
        File file = new File("temp.dot");
        file.delete();
    }

    @SuppressWarnings("ResultOfMethodCallIgnored")
    @BeforeAll
    static void removeImages() {
        File dir = new File("images");
        File[] files = dir.listFiles();

        if (files != null) {
            for (File file : files) {
                if (!file.isDirectory()) {
                    file.delete();
                }
            }
        }
    }

    private void runTestCorrect(String test, String name) throws ParseException, IOException {
        LogicalParser parser = new LogicalParser();
        Visualizer visualizer = new Visualizer();
        LogicalParser.Node node = parser.parse(test);
        visualizer.printToFile("temp.dot", node, test);

        try {
            Process p = Runtime.getRuntime().exec(String.format("cmd /c dot -Tsvg temp.dot -o images/%s.svg", name));
            p.waitFor();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void runTestIncorrect(String test, String message, int position) {
        LogicalParser parser = new LogicalParser();

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
        String test = "a and b";
        String name = "test_simple_input";

        runTestCorrect(test, name);
    }

    @Test
    public void testExampleInput() throws IOException, ParseException {
        String test = "(a in b) or (c in b)";
        String name = "test_example_input";

        runTestCorrect(test, name);
    }

    @Test
    public void testSingleVariable() throws IOException, ParseException {
        String test = "x";
        String name = "test_single_variable";

        runTestCorrect(test, name);
    }

    @Test
    public void testManyBrackets() throws IOException, ParseException {
        String test = "(((a and c) in b))";
        String name = "test_many_brackets";

        runTestCorrect(test, name);
    }

    @Test
    public void testPriority() throws IOException, ParseException {
        String test = "a and not b";
        String name = "test_priority";

        runTestCorrect(test, name);
    }

    @Test
    public void testMissingOperator() {
        String test = "(a and b) (c or d)";
        String message = "Incorrect token: (";
        int position = 11;

        runTestIncorrect(test, message, position);
    }

    @Test
    public void testMissingOperand() {
        String test = "(a and) or c";
        String message = "Incorrect token: )";
        int position = 7;

        runTestIncorrect(test, message, position);
    }

    @Test
    public void testMismatchingBrackets() {
        String test = "(a and b) or (not c";
        String message = "Incorrect token: ";
        int position = 19;

        runTestIncorrect(test, message, position);
    }

    @Test
    public void testEndOfExpression() {
        String test = "(a and b))";
        String message = "Incorrect token: )";
        int position = 10;

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
        String test = "(not a) xor and b";
        String message = "Incorrect token: and";
        int position = 15;

        runTestIncorrect(test, message, position);
    }

    @Test
    public void testIncorrectInput2() {
        String test = "a xor b not";
        String message = "Incorrect token: not";
        int position = 11;

        runTestIncorrect(test, message, position);
    }

    @Test
    public void testOrXor() throws IOException, ParseException {
        String test = "a xor b or c";
        String name = "test_or_xor";

        runTestCorrect(test, name);
    }
}
