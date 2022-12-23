package grammar;

import Utils.Pair;

import java.util.ArrayList;
import java.util.List;

public class ParserRule extends GrammarRule {
    private final String attribute;
    private final List<Pair<String, String>> children;

    public ParserRule(String name, String code, String attribute, List<Pair<String, String>> children) {
        super(name, code);
        this.attribute = attribute;
        this.children = children;
    }

    public String getAttribute() {
        return attribute;
    }

    public List<Pair<String, String>> getChildren() {
        return children;
    }

    public List<String> getChildrenNames() {
        List<String> names = new ArrayList<>();
        for (Pair<String, String> p : children) {
            names.add(p.getFirst());
        }

        return names;
    }
}
