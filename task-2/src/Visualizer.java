import java.io.*;
import java.nio.charset.StandardCharsets;

public class Visualizer {
    private int nodeId;

    public Visualizer() {
        nodeId = 0;
    }

    private String getNodeColor(String node) {
        if (node.equals("ε")) {
            return "coral3";
        }

        if (node.length() == 1 && (node.charAt(0) >= 'a' && node.charAt(0) <= 'z')) {
            return "blue";
        }

        if (node.equals("(") || node.equals(")") || node.equals("and") || node.equals("or") || node.equals("xor")
                || node.equals("in") || node.equals("not in") || node.equals("not")) {
            return "darkviolet";
        }

        return "black";
    }

    public void printToFile(String filename, Tree tree, String expression) {
        try (Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filename), StandardCharsets.UTF_8))) {
            nodeId = 0;

            writer.write("digraph {" + System.lineSeparator());
            writer.write(String.format("label =\"%s\"%s", expression, System.lineSeparator()));
            writer.write("labelloc = t" + System.lineSeparator());
            writer.write("fontsize = 50" + System.lineSeparator());
            writer.write("fontcolor = black" + System.lineSeparator());
            writer.write(dfs(tree));
            writer.write("}");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String dfs(Tree tree) {
        int currentId = nodeId;
        String color = getNodeColor(tree.node);
        String nodeParams = String.format("v%d [label=\"%s\", color=%s]%s", currentId, tree.node, color, System.lineSeparator());
        StringBuilder sb = new StringBuilder(nodeParams);

        for (Tree child : tree.children) {
            sb.append(String.format("v%d -> v%d%s", currentId, nodeId + 1, System.lineSeparator()));
            nodeId += 1;
            sb.append(dfs(child));
        }

        return sb.toString();
    }
}
