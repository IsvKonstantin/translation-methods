package Calculator;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"DuplicateBranchesInSwitch", "EnhancedSwitchMigration"})
public class CalculatorParser {
    private CalculatorLexer lexer;

    public Node parse(String text) throws ParseException {
        this.lexer = new CalculatorLexer(text);
        lexer.nextToken();
        Node answer = addSub();

        if (lexer.getTokenRule() != Rule.END) {
            throw new ParseException("Incorrect token: " + lexer.getTokenText(), lexer.getIndex());
        }

        return answer;
    }

    public static class Node {
        public int val;

        private String name;
        private Rule rule;
        private List<Node> children = new ArrayList<>();

        public Node(String name, Rule rule) {
            this.name = name;
            this.rule = rule;
        }

        public boolean isTerminal() {
            return !Character.isLowerCase(rule.toString().charAt(0));
        }

        public String getName() {
            return name;
        }

        public Rule getRule() {
            return rule;
        }

        public List<Node> getChildren() {
            return children;
        }
    }

    private void checkToken(Rule expected) throws ParseException {
        Rule rule = lexer.getTokenRule();

        if (expected != rule) {
            throw new ParseException("Incorrect token: " + lexer.getTokenText(), lexer.getIndex());
        }

        lexer.nextToken();
    }

    public Node mulDivPrime(int acc) throws ParseException {
        Node res = new Node("mulDivPrime", Rule.mulDivPrime);
        switch (lexer.getTokenRule()) {
            case MUL: {
                Node MUL = new Node(lexer.getTokenText(), Rule.MUL);
                res.children.add(MUL);
                checkToken(Rule.MUL);
                Node expr = expr();
                res.children.add(expr);
                Node mulDivPrime = mulDivPrime(acc * expr.val);
                res.children.add(mulDivPrime);
                res.val = mulDivPrime.val;break;
            }
            case DIV: {
                Node DIV = new Node(lexer.getTokenText(), Rule.DIV);
                res.children.add(DIV);
                checkToken(Rule.DIV);
                Node expr = expr();
                res.children.add(expr);
                Node mulDivPrime = mulDivPrime(acc / expr.val);
                res.children.add(mulDivPrime);
                res.val = mulDivPrime.val;break;
            }
            case R_PARAN:
                res.val = acc;break;
            case ADD:
                res.val = acc;break;
            case SUB:
                res.val = acc;break;
            case END:
                res.val = acc;break;
            default:
                throw new ParseException("Incorrect token: " + lexer.getTokenText(), lexer.getIndex());
        }
        return res;
    }

    public Node addSubPrime(int acc) throws ParseException {
        Node res = new Node("addSubPrime", Rule.addSubPrime);
        switch (lexer.getTokenRule()) {
            case ADD: {
                Node ADD = new Node(lexer.getTokenText(), Rule.ADD);
                res.children.add(ADD);
                checkToken(Rule.ADD);
                Node mulDiv = mulDiv();
                res.children.add(mulDiv);
                Node addSubPrime = addSubPrime(acc + mulDiv.val);
                res.children.add(addSubPrime);
                res.val = addSubPrime.val;break;
            }
            case SUB: {
                Node SUB = new Node(lexer.getTokenText(), Rule.SUB);
                res.children.add(SUB);
                checkToken(Rule.SUB);
                Node mulDiv = mulDiv();
                res.children.add(mulDiv);
                Node addSubPrime = addSubPrime(acc - mulDiv.val);
                res.children.add(addSubPrime);
                res.val = addSubPrime.val;break;
            }
            case R_PARAN:
                res.val = acc;break;
            case END:
                res.val = acc;break;
            default:
                throw new ParseException("Incorrect token: " + lexer.getTokenText(), lexer.getIndex());
        }
        return res;
    }

    public Node addSub() throws ParseException {
        Node res = new Node("addSub", Rule.addSub);
        switch (lexer.getTokenRule()) {
            case NUM: {
                Node mulDiv = mulDiv();
                res.children.add(mulDiv);
                Node addSubPrime = addSubPrime(mulDiv.val);
                res.children.add(addSubPrime);
                res.val = addSubPrime.val;break;
            }
            case L_PARAN: {
                Node mulDiv = mulDiv();
                res.children.add(mulDiv);
                Node addSubPrime = addSubPrime(mulDiv.val);
                res.children.add(addSubPrime);
                res.val = addSubPrime.val;break;
            }
            default:
                throw new ParseException("Incorrect token: " + lexer.getTokenText(), lexer.getIndex());
        }
        return res;
    }

    public Node expr() throws ParseException {
        Node res = new Node("expr", Rule.expr);
        switch (lexer.getTokenRule()) {
            case NUM: {
                Node NUM = new Node(lexer.getTokenText(), Rule.NUM);
                res.children.add(NUM);
                checkToken(Rule.NUM);
                res.val = Integer.parseInt(NUM.getName());break;
            }
            case L_PARAN: {
                Node L_PARAN = new Node(lexer.getTokenText(), Rule.L_PARAN);
                res.children.add(L_PARAN);
                checkToken(Rule.L_PARAN);
                Node addSub = addSub();
                res.children.add(addSub);
                Node R_PARAN = new Node(lexer.getTokenText(), Rule.R_PARAN);
                res.children.add(R_PARAN);
                checkToken(Rule.R_PARAN);
                res.val = addSub.val;break;
            }
            default:
                throw new ParseException("Incorrect token: " + lexer.getTokenText(), lexer.getIndex());
        }
        return res;
    }

    public Node mulDiv() throws ParseException {
        Node res = new Node("mulDiv", Rule.mulDiv);
        switch (lexer.getTokenRule()) {
            case NUM: {
                Node expr = expr();
                res.children.add(expr);
                Node mulDivPrime = mulDivPrime(expr.val);
                res.children.add(mulDivPrime);
                res.val = mulDivPrime.val;break;
            }
            case L_PARAN: {
                Node expr = expr();
                res.children.add(expr);
                Node mulDivPrime = mulDivPrime(expr.val);
                res.children.add(mulDivPrime);
                res.val = mulDivPrime.val;break;
            }
            default:
                throw new ParseException("Incorrect token: " + lexer.getTokenText(), lexer.getIndex());
        }
        return res;
    }

}