import java.text.ParseException;
import java.util.*;

public class Lexer {
    private List<Token> tokens;
    private Map<Integer, Integer> tokenPositions;
    private Map<Integer, String> variables;
    private String source;
    private int index;
    private int tokenIndex;

    Lexer() {
        tokens = new ArrayList<>();
        tokenPositions = new HashMap<>();
        variables = new HashMap<>();
        this.source = "";
        this.index = 0;
        this.tokenIndex = 0;
    }

    public String getVariable() {
        return variables.get(tokenIndex);
    }

    public boolean hasNextToken() {
        return tokenIndex < tokens.size() - 1;
    }

    public Token getToken() {
        return tokens.get(tokenIndex);
    }

    public void nextToken() {
        tokenIndex++;
    }

    public int getTokenPosition() {
        return tokenPositions.get(tokenIndex);
    }

    private boolean isLetter(char ch) {
        return ch >= 'a' && ch <= 'z';
    }

    private String getNextWord() {
        StringBuilder word = new StringBuilder();

        while (index < source.length() && isLetter(source.charAt(index))) {
            word.append(source.charAt(index));
            index++;
        }

        if (word.toString().equals("not")) {
            word = new StringBuilder();
            int tempIndex = index;

            while (tempIndex < source.length() && Character.isWhitespace(source.charAt(tempIndex))) {
                tempIndex++;
            }

            while (tempIndex < source.length() && isLetter(source.charAt(tempIndex))) {
                word.append(source.charAt(tempIndex));
                tempIndex++;
            }

            if (word.toString().equals("in")) {
                index = tempIndex;
                return "not in";
            } else {
                return "not";
            }
        } else {
            return word.toString();
        }
    }

    public void tokenize(String source) throws ParseException {
        index = 0;
        tokenIndex = 0;
        tokens = new ArrayList<>();
        tokenPositions = new HashMap<>();
        variables = new HashMap<>();
        this.source = source;

        while (index < source.length()) {
            char currentCharacter = source.charAt(index);

            if (!Character.isWhitespace(currentCharacter)) {
                if (isLetter(currentCharacter)) {
                    int wordStart = index;
                    String word = getNextWord();
                    index--;

                    if (word.length() > 1) {
                        switch (word) {
                            case "or":
                                tokenPositions.put(tokens.size(), wordStart);
                                tokens.add(Token.OR);
                                break;
                            case "xor":
                                tokenPositions.put(tokens.size(), wordStart);
                                tokens.add(Token.XOR);
                                break;
                            case "and":
                                tokenPositions.put(tokens.size(), wordStart);
                                tokens.add(Token.AND);
                                break;
                            case "not":
                                tokenPositions.put(tokens.size(), wordStart);
                                tokens.add(Token.NOT);
                                break;
                            case "in":
                                tokenPositions.put(tokens.size(), wordStart);
                                tokens.add(Token.IN);
                                break;
                            case "not in":
                                tokenPositions.put(tokens.size(), wordStart);
                                tokens.add(Token.NIN);
                                break;
                            default:
                                throw new ParseException("Unknown operator: " + word, wordStart);
                        }
                    } else {
                        tokenPositions.put(tokens.size(), wordStart);
                        tokens.add(Token.VAR);
                        variables.put(tokens.size() - 1, word);
                    }
                } else if (currentCharacter == '(') {
                    tokenPositions.put(tokens.size(), index);
                    tokens.add(Token.LPAREN);
                } else if (currentCharacter == ')') {
                    tokenPositions.put(tokens.size(), index);
                    tokens.add(Token.RPAREN);
                } else {
                    throw new ParseException("Illegal character: " + currentCharacter, index);
                }
            }

            index++;
        }

        tokenPositions.put(tokens.size(), index);
        tokens.add(Token.END);
    }
}
