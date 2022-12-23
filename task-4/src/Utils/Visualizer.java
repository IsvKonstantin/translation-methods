package Utils;

import Logical.LogicalParser;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Visualizer {
    private int nodeId;

    public Visualizer() {
        nodeId = 0;
    }

    public void printToFile(String filename, LogicalParser.Node node, String expression) {
        try (Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filename), StandardCharsets.UTF_8))) {
            nodeId = 0;

            writer.write("digraph {" + System.lineSeparator());
            writer.write(String.format("label =\"%s\"%s", expression, System.lineSeparator()));
            writer.write("labelloc = t" + System.lineSeparator());
            writer.write("fontsize = 50" + System.lineSeparator());
            writer.write("fontcolor = black" + System.lineSeparator());
            writer.write(dfs(node));
            writer.write("}");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String dfs(LogicalParser.Node node) {
        int currentId = nodeId;
        String color = (!node.isTerminal()) ? "black" : "blue";
        String nodeParams = String.format("v%d [label=\"%s\", color=%s]%s", currentId, node.getName(), color, System.lineSeparator());
        StringBuilder sb = new StringBuilder(nodeParams);

        for (LogicalParser.Node child : node.getChildren()) {
            sb.append(String.format("v%d -> v%d%s", currentId, nodeId + 1, System.lineSeparator()));
            nodeId += 1;
            sb.append(dfs(child));
        }

        if (node.getChildren().size() == 0) {
            if (!node.isTerminal()) {
                sb.append(String.format("v%d -> v%d%s", currentId, nodeId + 1, System.lineSeparator()));
                nodeId += 1;
                sb.append(String.format("v%d [label=\"%s\", color=%s]%s", nodeId, "ε", "coral3", System.lineSeparator()));
            }
        }

        return sb.toString();
    }
}
