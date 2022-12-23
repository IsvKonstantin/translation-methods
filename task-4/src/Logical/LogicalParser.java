package Logical;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"DuplicateBranchesInSwitch", "EnhancedSwitchMigration"})
public class LogicalParser {
    private LogicalLexer lexer;

    public Node parse(String text) throws ParseException {
        this.lexer = new LogicalLexer(text);
        lexer.nextToken();
        Node answer = e();

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

    public Node eprime() throws ParseException {
        Node res = new Node("eprime", Rule.eprime);
        switch (lexer.getTokenRule()) {
            case OR: {
                Node OR = new Node(lexer.getTokenText(), Rule.OR);
                res.children.add(OR);
                checkToken(Rule.OR);
                Node c = c();
                res.children.add(c);
                Node eprime = eprime();
                res.children.add(eprime);
                break;
            }
            case XOR: {
                Node XOR = new Node(lexer.getTokenText(), Rule.XOR);
                res.children.add(XOR);
                checkToken(Rule.XOR);
                Node c = c();
                res.children.add(c);
                Node eprime = eprime();
                res.children.add(eprime);
                break;
            }
            case R_PARAN:
                break;
            case END:
                break;
            default:
                throw new ParseException("Incorrect token: " + lexer.getTokenText(), lexer.getIndex());
        }
        return res;
    }

    public Node c() throws ParseException {
        Node res = new Node("c", Rule.c);
        switch (lexer.getTokenRule()) {
            case NOT: {
                Node n = n();
                res.children.add(n);
                Node cprime = cprime();
                res.children.add(cprime);
                break;
            }
            case VAR: {
                Node n = n();
                res.children.add(n);
                Node cprime = cprime();
                res.children.add(cprime);
                break;
            }
            case L_PARAN: {
                Node n = n();
                res.children.add(n);
                Node cprime = cprime();
                res.children.add(cprime);
                break;
            }
            default:
                throw new ParseException("Incorrect token: " + lexer.getTokenText(), lexer.getIndex());
        }
        return res;
    }

    public Node cprime() throws ParseException {
        Node res = new Node("cprime", Rule.cprime);
        switch (lexer.getTokenRule()) {
            case AND: {
                Node AND = new Node(lexer.getTokenText(), Rule.AND);
                res.children.add(AND);
                checkToken(Rule.AND);
                Node n = n();
                res.children.add(n);
                Node cprime = cprime();
                res.children.add(cprime);
                break;
            }
            case R_PARAN:
                break;
            case OR:
                break;
            case XOR:
                break;
            case END:
                break;
            default:
                throw new ParseException("Incorrect token: " + lexer.getTokenText(), lexer.getIndex());
        }
        return res;
    }

    public Node e() throws ParseException {
        Node res = new Node("e", Rule.e);
        switch (lexer.getTokenRule()) {
            case NOT: {
                Node c = c();
                res.children.add(c);
                Node eprime = eprime();
                res.children.add(eprime);
                break;
            }
            case VAR: {
                Node c = c();
                res.children.add(c);
                Node eprime = eprime();
                res.children.add(eprime);
                break;
            }
            case L_PARAN: {
                Node c = c();
                res.children.add(c);
                Node eprime = eprime();
                res.children.add(eprime);
                break;
            }
            default:
                throw new ParseException("Incorrect token: " + lexer.getTokenText(), lexer.getIndex());
        }
        return res;
    }

    public Node u() throws ParseException {
        Node res = new Node("u", Rule.u);
        switch (lexer.getTokenRule()) {
            case L_PARAN: {
                Node L_PARAN = new Node(lexer.getTokenText(), Rule.L_PARAN);
                res.children.add(L_PARAN);
                checkToken(Rule.L_PARAN);
                Node e = e();
                res.children.add(e);
                Node R_PARAN = new Node(lexer.getTokenText(), Rule.R_PARAN);
                res.children.add(R_PARAN);
                checkToken(Rule.R_PARAN);
                Node uprime = uprime();
                res.children.add(uprime);
                break;
            }
            case VAR: {
                Node VAR = new Node(lexer.getTokenText(), Rule.VAR);
                res.children.add(VAR);
                checkToken(Rule.VAR);
                Node uprime = uprime();
                res.children.add(uprime);
                break;
            }
            default:
                throw new ParseException("Incorrect token: " + lexer.getTokenText(), lexer.getIndex());
        }
        return res;
    }

    public Node uprime() throws ParseException {
        Node res = new Node("uprime", Rule.uprime);
        switch (lexer.getTokenRule()) {
            case IN: {
                Node IN = new Node(lexer.getTokenText(), Rule.IN);
                res.children.add(IN);
                checkToken(Rule.IN);
                Node VAR = new Node(lexer.getTokenText(), Rule.VAR);
                res.children.add(VAR);
                checkToken(Rule.VAR);
                Node uprime = uprime();
                res.children.add(uprime);
                break;
            }
            case R_PARAN:
                break;
            case OR:
                break;
            case AND:
                break;
            case XOR:
                break;
            case END:
                break;
            default:
                throw new ParseException("Incorrect token: " + lexer.getTokenText(), lexer.getIndex());
        }
        return res;
    }

    public Node n() throws ParseException {
        Node res = new Node("n", Rule.n);
        switch (lexer.getTokenRule()) {
            case NOT: {
                Node NOT = new Node(lexer.getTokenText(), Rule.NOT);
                res.children.add(NOT);
                checkToken(Rule.NOT);
                Node u = u();
                res.children.add(u);
                break;
            }
            case VAR: {
                Node u = u();
                res.children.add(u);
                break;
            }
            case L_PARAN: {
                Node u = u();
                res.children.add(u);
                break;
            }
            default:
                throw new ParseException("Incorrect token: " + lexer.getTokenText(), lexer.getIndex());
        }
        return res;
    }

}