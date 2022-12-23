package grammar;

import java.util.List;

public class Grammar {
    private final String name;
    private final List<GrammarRule> rules;
    private final List<String> commonAttributes;

    public Grammar(String name, List<GrammarRule> rules, List<String> commonAttributes) {
        this.name = name;
        this.rules = rules;
        this.commonAttributes = commonAttributes;
    }

    public String getName() {
        return this.name;
    }

    public List<GrammarRule> getRules() {
        return this.rules;
    }

    public List<String> getCommonAttributes() {
        return this.commonAttributes;
    }
}
