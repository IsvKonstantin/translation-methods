import java.io.IOException;
import java.text.ParseException;

public class Main {

    public static void main(String[] args) throws IOException {
        String test = "a and b";
        Parser parser = new Parser();
        Visualizer visualizer = new Visualizer();

        try {
            Tree tree = parser.parse(test);
            visualizer.printToFile("tree.dot", tree, test);
            Runtime.getRuntime().exec("cmd /c dot -Tsvg tree.dot -o tree.svg");
        } catch (ParseException e) {
            System.out.println(e.getMessage() + System.lineSeparator() + "Position: " + e.getErrorOffset());
        }
    }
}
