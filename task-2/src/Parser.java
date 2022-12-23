import java.text.ParseException;

public class Parser {
    private Lexer lexer;

    private Tree E() throws ParseException {
        switch (lexer.getToken()) {
            case NOT:
            case LPAREN:
            case VAR:
                Tree x = X();
                Tree ePrime = EPrime();
                return new Tree("E", x, ePrime);
            case END:
                return new Tree("E", new Tree("ε"));
            default:
                throw new ParseException("Incorrect token: " + lexer.getToken(), lexer.getTokenPosition());
        }
    }

    private Tree EPrime() throws ParseException {
        switch (lexer.getToken()) {
            case OR:
                lexer.nextToken();
                Tree x = X();
                Tree ePrime = EPrime();
                return new Tree("E'", new Tree("or"), x, ePrime);
            case RPAREN:
            case END:
                return new Tree("E'", new Tree("ε"));
            default:
                throw new ParseException("Incorrect token: " + lexer.getToken(), lexer.getTokenPosition());
        }
    }

    private Tree X() throws ParseException {
        switch (lexer.getToken()) {
            case NOT:
            case LPAREN:
            case VAR:
                Tree c = C();
                Tree xPrime = XPrime();
                return new Tree("X", c, xPrime);
            default:
                throw new ParseException("Incorrect token: " + lexer.getToken(), lexer.getTokenPosition());
        }
    }

    private Tree XPrime() throws ParseException {
        switch (lexer.getToken()) {
            case XOR:
                lexer.nextToken();
                Tree c = C();
                Tree xPrime = XPrime();
                return new Tree("X'", new Tree("xor"), c, xPrime);
            case OR:
            case RPAREN:
            case END:
                return new Tree("X'", new Tree("ε"));
            default:
                throw new ParseException("Incorrect token: " + lexer.getToken(), lexer.getTokenPosition());
        }
    }

    private Tree C() throws ParseException {
        switch (lexer.getToken()) {
            case NOT:
            case LPAREN:
            case VAR:
                Tree n = N();
                Tree cPrime = CPrime();
                return new Tree("C", n, cPrime);
            default:
                throw new ParseException("Incorrect token: " + lexer.getToken(), lexer.getTokenPosition());
        }
    }

    private Tree CPrime() throws ParseException {
        switch (lexer.getToken()) {
            case AND:
                lexer.nextToken();
                Tree n = N();
                Tree cPrime = CPrime();
                return new Tree("C'", new Tree("and"), n, cPrime);
            case OR:
            case XOR:
            case RPAREN:
            case END:
                return new Tree("C'", new Tree("ε"));
            default:
                throw new ParseException("Incorrect token: " + lexer.getToken(), lexer.getTokenPosition());
        }
    }

    private Tree N() throws ParseException {
        Tree u;

        switch (lexer.getToken()) {
            case NOT:
                lexer.nextToken();
                if (lexer.getToken() != Token.LPAREN) {
                    //throw new ParseException("Incorrect token: " + lexer.getToken(), lexer.getTokenPosition());
                    throw new ParseException("Expected '(' after 'NOT'", lexer.getTokenPosition());
                }
                lexer.nextToken();
                u = E();
                if (lexer.getToken() != Token.RPAREN) {
                    //throw new ParseException("Incorrect token: " + lexer.getToken(), lexer.getTokenPosition());
                    throw new ParseException("Missing ')' after expression negation", lexer.getTokenPosition());
                }
                // ??????????????
                lexer.nextToken();
                return new Tree("N", new Tree("not"), new Tree("("), u, new Tree(")"));
            case LPAREN:
            case VAR:
                u = U();
                return new Tree("N", u);
            default:
                throw new ParseException("Incorrect token: " + lexer.getToken(), lexer.getTokenPosition());
        }
    }

    private Tree U() throws ParseException {
        Tree uPrime;

        switch (lexer.getToken()) {
            case LPAREN:
                Tree lParen = new Tree("(");
                lexer.nextToken();
                Tree e = E();

                if (lexer.getToken() != Token.RPAREN) {
                    throw new ParseException("Incorrect token: " + lexer.getToken(), lexer.getTokenPosition());
                }

                Tree rParen = new Tree(")");
                lexer.nextToken();
                uPrime = UPrime();
                return new Tree("U", lParen, e, rParen, uPrime);
            case VAR:
                String name = lexer.getVariable();
                lexer.nextToken();
                uPrime = UPrime();
                return new Tree("U", new Tree(name), uPrime);
            default:
                throw new ParseException("Incorrect token: " + lexer.getToken(), lexer.getTokenPosition());
        }
    }

    private Tree UPrime() throws ParseException {
        String name;
        Tree uPrime;

        switch (lexer.getToken()) {
            case IN:
                lexer.nextToken();
                name = lexer.getVariable();
                lexer.nextToken();
                uPrime = UPrime();
                return new Tree("U'", new Tree("in"), new Tree(name), uPrime);
            case NIN:
                lexer.nextToken();
                name = lexer.getVariable();
                lexer.nextToken();
                uPrime = UPrime();
                return new Tree("U'", new Tree("not in"), new Tree(name), uPrime);
            case OR:
            case XOR:
            case AND:
            case RPAREN:
            case END:
                return new Tree("U'", new Tree("ε"));
            default:
                throw new ParseException("Incorrect token: " + lexer.getToken(), lexer.getTokenPosition());
        }
    }

    public Tree parse(String expression) throws ParseException {
        lexer = new Lexer();
        lexer.tokenize(expression);
        Tree tree = E();

        if (lexer.getToken() != Token.END) {
            throw new ParseException("Expected end of the expression, but found: " + lexer.getToken(),
                    lexer.getTokenPosition());
        }

        return tree;
    }
}