package grammar;

public class GrammarRule {
    private final String name;
    private final String code;

    public GrammarRule(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return this.name;
    }

    public String getCode() {
        if (!code.isEmpty()) {
            return code.substring(2, code.length() - 2);
        } else {
            return code;
        }
    }
}
