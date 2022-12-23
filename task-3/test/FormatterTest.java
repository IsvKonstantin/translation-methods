import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FormatterTest {
    private void runTest(int name) {
        try {
            Path unformattedPath = Paths.get(String.format("test/files/test%d", name));
            Path formattedPath = Paths.get(String.format("test/files/test%de", name));
            String unformattedCode = String.join(System.lineSeparator(), Files.readAllLines(unformattedPath));

            JavaClassLexer lexer = new JavaClassLexer(CharStreams.fromString(unformattedCode));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            JavaClassParser parser = new JavaClassParser(tokens);
            JavaClassFormatter formatter = new JavaClassFormatter();
            formatter.visit(parser.javaClass());

            String expected = String.join(System.lineSeparator(), Files.readAllLines(formattedPath));
            String actual = formatter.getFormattedClassString();

            assertEquals(expected, actual);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    @DisplayName("Simple class, no modifiers, empty class body")
    public void test1() {
        runTest(1);
    }

    @Test
    @DisplayName("Class with modifiers, empty class body")
    public void test2() {
        runTest(2);
    }

    @Test
    @DisplayName("Class with modifiers and fields, no constructors and methods")
    public void test3() {
        runTest(3);
    }

    @Test
    @DisplayName("Class with fields and constructors")
    public void test4() {
        runTest(4);
    }

    @Test
    @DisplayName("Class with a constructor and without fields or methods")
    public void test5() {
        runTest(5);
    }

    @Test
    @DisplayName("Class with fields, constructors and methods")
    public void test6() {
        runTest(6);
    }

    @Test
    @DisplayName("Testing loops and if/else statements")
    public void test7() {
        runTest(7);
    }

    @Test
    @DisplayName("Testing complex class")
    public void test8() {
        runTest(8);
    }

    @Test
    @DisplayName("Testing Modification")
    public void test9() {
        runTest(9);
    }

    @Test
    @DisplayName("Testing Modification")
    public void test10() {
        runTest(10);
    }
}
