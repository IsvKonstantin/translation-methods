package grammar;

public class LexerRule extends GrammarRule {
    private final String pattern;

    public LexerRule(String name, String code, String pattern) {
        super(name, code);
        this.pattern = pattern;
    }

    public String getPattern() {
        return pattern;
    }
}
