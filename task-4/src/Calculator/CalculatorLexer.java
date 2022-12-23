package Calculator;

import Utils.Pair;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

public class CalculatorLexer {
    private Token currentToken;
    private int index;
    private final String text;

    private final Pattern availablePatterns = Pattern.compile("([a-zA-Z]+)|(\\+)|(-)|(\\*)|(/)|(\\()|(\\))|(\\d+)|([ \\n\\t\\r]+)");
    private final List<Rule> skipRules = new ArrayList<>(Collections.singletonList(Rule.SKIP));
    private final List<Pair<Rule, Pattern>> lexerRules = new ArrayList<>(Arrays.asList(
        new Pair<>(Rule.ADD, Pattern.compile("\\+")),
        new Pair<>(Rule.SUB, Pattern.compile("-")),
        new Pair<>(Rule.MUL, Pattern.compile("\\*")),
        new Pair<>(Rule.DIV, Pattern.compile("/")),
        new Pair<>(Rule.L_PARAN, Pattern.compile("\\(")),
        new Pair<>(Rule.R_PARAN, Pattern.compile("\\)")),
        new Pair<>(Rule.NUM, Pattern.compile("\\d+")),
        new Pair<>(Rule.SKIP, Pattern.compile("[ \\n\\t\\r]+")),new Pair<>(Rule.ANY_ID, Pattern.compile("[a-zA-Z]+"))));

    private static class Token {
        private final Rule rule;
        private final String text;

        Token(Rule rule, String text) {
            this.rule = rule;
            this.text = text;
        }

        Rule getRule() {
            return this.rule;
        }

        String getText() {
            return this.text;
        }
    }

    public CalculatorLexer(String text) {
        this.currentToken = new Token(Rule.EPS, "");
        this.index = 0;
        this.text = text;
    }

    private Rule getCurrentRule(String string) {
        for (Pair<Rule, Pattern> p : lexerRules) {
            if (p.getSecond().matcher(string).matches()) {
                return p.getFirst();
            }
        }

        return Rule.EPS;
    }

    public Rule getTokenRule() {
        return this.currentToken.getRule();
    }

    public String getTokenText() {
        return this.currentToken.getText();
    }

    public int getIndex() {
        return this.index;
    }

    public void nextToken() throws ParseException {
        if (index == text.length()) {
            currentToken = new Token(Rule.END, "");
            return;
        }

        StringBuilder stringBuilder = new StringBuilder();
        char currentChar = text.charAt(index);
        index += 1;
        stringBuilder.append(currentChar);
        String currentString = stringBuilder.toString();

        if (availablePatterns.matcher(currentString).matches()) {
            Rule currentRule = getCurrentRule(currentString);
            Rule previousRule = currentRule;
            String previousString = currentString;

            while(index < text.length()) {
                currentChar = text.charAt(index);
                index += 1;
                stringBuilder.append(currentChar);
                currentString = stringBuilder.toString();
                currentRule = getCurrentRule(currentString);

                if (availablePatterns.matcher(currentString).matches()) {
                    previousString = currentString;
                    previousRule = currentRule;
                } else {
                    index -= 1;

                    if (skipRules.contains(previousRule)) {
                        nextToken();
                        if (getTokenRule() == Rule.ANY_ID) {
                            throw new ParseException("Illegal token: " + getTokenText(), index);
                        }
                        return;
                    }

                    if (previousRule == Rule.ANY_ID) {
                        throw new ParseException("Illegal token: " + previousString, index);
                    }
                    currentToken = new Token(previousRule, previousString);
                    return;
                }
            }
            if (currentRule == Rule.ANY_ID) {
                throw new ParseException("Illegal token: " + currentString, index);
            }
            currentToken = new Token(currentRule, currentString);
        } else {
            throw new ParseException("Illegal token: " + currentString, index);
        }
    }
}
