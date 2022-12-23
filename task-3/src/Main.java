import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("test.txt");
        String text = String.join(System.lineSeparator(), Files.readAllLines(path));

        JavaClassLexer lexer = new JavaClassLexer(CharStreams.fromString(text));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JavaClassParser parser = new JavaClassParser(tokens);
        JavaClassFormatter formatter = new JavaClassFormatter();
        formatter.visit(parser.javaClass());

        String formattedText = formatter.getFormattedClassString();
        System.out.println(formattedText);
    }
}