import org.antlr.v4.runtime.tree.ParseTree;

import java.util.List;

@SuppressWarnings({"DuplicatedCode", "SameParameterValue"})
public class JavaClassFormatter extends JavaClassBaseVisitor<Void> {
    private static final String TAB = "    ";
    private static final String EMPTY = "";
    private static final String SPACE = " ";

    private final StringBuilder stringBuilder;
    private int depth;

    public JavaClassFormatter() {
        stringBuilder = new StringBuilder();
        depth = 0;
    }

    public String getFormattedClassString() {
        return stringBuilder.toString();
    }

    private void newLine() {
        stringBuilder.append(System.lineSeparator());
    }

    private void newLine(int tabs) {
        depth += tabs;

        stringBuilder.append(System.lineSeparator());
        stringBuilder.append(TAB.repeat(Math.max(0, depth)));
    }

    private boolean safeWriteText(ParseTree ctx, String before, String after) {
        if (ctx != null) {
            stringBuilder.append(before);
            stringBuilder.append(ctx.getText());
            stringBuilder.append(after);

            return true;
        } else {
            return false;
        }
    }

    private void safeWriteText(List<? extends ParseTree> ctx, String before, String after) {
        if (ctx != null) {
            ctx.forEach(parseTree -> safeWriteText(parseTree, before, after));
        }
    }

    private void writeText(String text) {
        stringBuilder.append(text);
    }

    @Override
    public Void visitJavaClass(JavaClassParser.JavaClassContext ctx) {
        visitAccessModifier(ctx.accessModifier());
        visitNonAccessModifiers(ctx.nonAccessModifiers());
        safeWriteText(ctx.CLASS(), EMPTY, SPACE);
        safeWriteText(ctx.IDENTIFIER(), EMPTY, EMPTY);

        if (safeWriteText(ctx.EXTENDS(), SPACE, SPACE)) {
            safeWriteText(ctx.type(), EMPTY, EMPTY);
        }

        if (safeWriteText(ctx.IMPLEMENTS(), SPACE, SPACE)) {
            visitClassImpls(ctx.classImpls());
        }

        newLine();
        writeText(ctx.L_BRACE().getText());
        if (ctx.classBody().getChildCount() != 0) {
            newLine(1);
            visitClassBody(ctx.classBody());
            newLine(-1);
        } else {
            newLine(0);
        }
        writeText(ctx.R_BRACE().getText());

        return null;
    }

    @Override
    public Void visitType(JavaClassParser.TypeContext ctx) {
        safeWriteText(ctx, EMPTY, SPACE);

        return null;
    }

    @Override
    public Void visitAccessModifier(JavaClassParser.AccessModifierContext ctx) {
        safeWriteText(ctx, EMPTY, SPACE);

        return null;
    }

    @Override
    public Void visitNonAccessModifiers(JavaClassParser.NonAccessModifiersContext ctx) {
        if (ctx != null) {
            safeWriteText(ctx.ABSTRACT(), EMPTY, SPACE);
            safeWriteText(ctx.STATIC(), EMPTY, SPACE);
            safeWriteText(ctx.FINAL(), EMPTY, SPACE);
        }

        return null;
    }

    @Override
    public Void visitClassImpls(JavaClassParser.ClassImplsContext ctx) {
        safeWriteText(ctx.type().get(0), EMPTY, EMPTY);
        ctx.type()
           .subList(1, ctx.type().size())
           .forEach(type -> safeWriteText(type, ctx.COMMA(0).getText() + SPACE, EMPTY));

        return null;
    }

    @Override
    public Void visitClassBody(JavaClassParser.ClassBodyContext ctx) {
        List<JavaClassParser.FieldContext> fields = ctx.field();
        List<JavaClassParser.ConstructorContext> constructors = ctx.constructor();
        List<JavaClassParser.MethodContext> methods = ctx.method();

        if (!fields.isEmpty()) {
            visitField(fields.get(0));
            fields.subList(1, fields.size()).forEach(field -> {
                newLine(0);
                visitField(field);
            });
        }

        if (!constructors.isEmpty()) {
            if (!fields.isEmpty()) {
                newLine();
                newLine(0);
            }

            visitConstructor(constructors.get(0));
            constructors.subList(1, constructors.size()).forEach(constructor -> {
                newLine();
                newLine(0);
                visitConstructor(constructor);
            });
        }

        if (!methods.isEmpty()) {
            if (!fields.isEmpty() || !constructors.isEmpty()) {
                newLine();
                newLine(0);
            }

            visitMethod(methods.get(0));
            methods.subList(1, methods.size()).forEach(method -> {
                newLine();
                newLine(0);
                visitMethod(method);
            });
        }

        return null;
    }

    @Override
    public Void visitField(JavaClassParser.FieldContext ctx) {
        visitAccessModifier(ctx.accessModifier());
        visitNonAccessModifiers(ctx.nonAccessModifiers());
        safeWriteText(ctx.type(), EMPTY, EMPTY);

        ctx.L_BRACK().forEach(p -> safeWriteText(p, EMPTY, ctx.R_BRACK().get(0).getText()));

        writeText(SPACE + ctx.IDENTIFIER().getText());

        if (safeWriteText(ctx.assignmentOp(), SPACE, SPACE)) {
            visitAssignmentValue(ctx.assignmentValue());
        }

        writeText(ctx.SEMICOLON().getText());

        return null;
    }

    @Override
    public Void visitAssignmentValue(JavaClassParser.AssignmentValueContext ctx) {
        if (safeWriteText(ctx.NEW(), EMPTY, SPACE)) {
            writeText(ctx.type().getText());
            if (safeWriteText(ctx.L_PARAN(), EMPTY, EMPTY)) {
                visitMethodParams(ctx.methodParams());
                writeText(ctx.R_PARAN().getText());
            } else if (ctx.L_BRACK() != null) {
                ctx.expression().forEach(expression -> {
                    writeText(ctx.L_BRACK().get(0).getText());
                    visitExpression(expression);
                    writeText(ctx.R_BRACK().get(0).getText());
                });
            }
        } else {
            visitExpression(ctx.expression().get(0));
        }

        return null;
    }

    @Override
    public Void visitExpression(JavaClassParser.ExpressionContext ctx) {
        if (!safeWriteText(ctx.LITERAL(), EMPTY, EMPTY)) {
            if (!safeWriteText(ctx.IDENTIFIER(), EMPTY, EMPTY)) {
                if (ctx.bool() != null) {
                    writeText(ctx.bool().getText());
                } else if (ctx.arrayAccess() != null) {
                    visitArrayAccess(ctx.arrayAccess());
                } else if (ctx.methodCall() != null) {
                    visitMethodCall(ctx.methodCall());
                } else if (ctx.UNARY_OP() != null) {
                    writeText(ctx.UNARY_OP().getText());
                    visitExpression(ctx.expression().get(0));
                } else if (ctx.L_PARAN() != null) {
                    writeText(ctx.L_PARAN().getText());
                    visitExpression(ctx.expression().get(0));
                    writeText(ctx.R_PARAN().getText());
                } else {
                    visitExpression(ctx.expression().get(0));
                    writeText(SPACE + ctx.BINARY_OP().getText() + SPACE);
                    visitExpression(ctx.expression().get(1));
                }
            }
        }

        return null;
    }

    @Override
    public Void visitArrayAccess(JavaClassParser.ArrayAccessContext ctx) {
        writeText(ctx.IDENTIFIER().getText());
        ctx.expression().forEach(expression -> {
            writeText(ctx.L_BRACK().get(0).getText());
            visitExpression(expression);
            writeText(ctx.R_BRACK().get(0).getText());
        });

        return null;
    }

    @Override
    public Void visitMethodCall(JavaClassParser.MethodCallContext ctx) {
        writeText(ctx.IDENTIFIER().getText());

        if (safeWriteText(ctx.DOT(), EMPTY, EMPTY)) {
            visitMethodCall(ctx.methodCall());
        } else {
            writeText(ctx.L_PARAN().getText());
            visitMethodParams(ctx.methodParams());
            writeText(ctx.R_PARAN().getText());
        }

        return null;
    }

    @Override
    public Void visitMethodParams(JavaClassParser.MethodParamsContext ctx) {
        if (!ctx.expression().isEmpty()) {
            visitExpression(ctx.expression().get(0));
            ctx.expression().subList(1, ctx.expression().size()).forEach(expression -> {
                safeWriteText(ctx.COMMA().get(0), EMPTY, SPACE);
                visitExpression(expression);
            });
        }

        return null;
    }

    @Override
    public Void visitMethod(JavaClassParser.MethodContext ctx) {
        visitAccessModifier(ctx.accessModifier());
        visitNonAccessModifiers(ctx.nonAccessModifiers());
        safeWriteText(ctx.type(), EMPTY, SPACE);
        safeWriteText(ctx.IDENTIFIER(), EMPTY, EMPTY);
        safeWriteText(ctx.L_PARAN(), EMPTY, EMPTY);
        visitArguments(ctx.arguments());
        safeWriteText(ctx.R_PARAN(), EMPTY, EMPTY);
        newLine(0);
        safeWriteText(ctx.L_BRACE(), EMPTY, EMPTY);

        if (ctx.methodBody().getChildCount() != 0) {
            newLine(1);
            visitMethodBody(ctx.methodBody());
            newLine(-1);
        } else {
            newLine(0);
        }

        safeWriteText(ctx.R_BRACE(), EMPTY, EMPTY);
        return null;
    }

    @Override
    public Void visitArguments(JavaClassParser.ArgumentsContext ctx) {
        if (!ctx.argument().isEmpty()) {
            visitArgument(ctx.argument().get(0));
            ctx.argument().subList(1, ctx.argument().size()).forEach(argument -> {
                safeWriteText(ctx.COMMA().get(0), EMPTY, SPACE);
                visitArgument(argument);
            });
        }

        return null;
    }

    @Override
    public Void visitArgument(JavaClassParser.ArgumentContext ctx) {
        safeWriteText(ctx.FINAL(), EMPTY, SPACE);
        safeWriteText(ctx.type(), EMPTY, SPACE);
        safeWriteText(ctx.IDENTIFIER(), EMPTY, EMPTY);

        return null;
    }

    @Override
    public Void visitMethodBody(JavaClassParser.MethodBodyContext ctx) {
        visitCodeBlock(ctx.codeBlock().get(0));
        ctx.codeBlock().subList(1, ctx.codeBlock().size()).forEach(codeBlock -> {
            newLine(0);
            visitCodeBlock(codeBlock);
        });

        return null;
    }

    @Override
    public Void visitCodeBlock(JavaClassParser.CodeBlockContext ctx) {
        if (ctx.statement() != null) {
            visitStatement(ctx.statement());
        } else if (ctx.forLoop() != null) {
            visitForLoop(ctx.forLoop());
        } else if (ctx.whileLoop() != null) {
            visitWhileLoop(ctx.whileLoop());
        } else if (ctx.doWhileLoop() != null) {
            visitDoWhileLoop(ctx.doWhileLoop());
        } else {
            visitIfElseStatement(ctx.ifElseStatement());
        }

        return null;
    }

    @Override
    public Void visitStatement(JavaClassParser.StatementContext ctx) {
        if (ctx.assignment() != null) {
            visitAssignment(ctx.assignment());
        } else if (ctx.methodCall() != null) {
            visitMethodCall(ctx.methodCall());
        } else if (ctx.jumpStatement() != null) {
            visitJumpStatement(ctx.jumpStatement());
        }

        safeWriteText(ctx.SEMICOLON(), EMPTY, EMPTY);
        return null;
    }

    @Override
    public Void visitJumpStatement(JavaClassParser.JumpStatementContext ctx) {
        if (safeWriteText(ctx.RETURN(), EMPTY, SPACE)) {
            visitExpression(ctx.expression());
        } else {
            safeWriteText(ctx, EMPTY, EMPTY);
        }

        return null;
    }

    @Override
    public Void visitAssignment(JavaClassParser.AssignmentContext ctx) {
        if (ctx.type() != null) {
            safeWriteText(ctx.FINAL(), EMPTY, SPACE);
            safeWriteText(ctx.type(), EMPTY, SPACE);
            safeWriteText(ctx.IDENTIFIER(), EMPTY, EMPTY);

            if (safeWriteText(ctx.assignmentOp(), SPACE, SPACE)) {
                visitAssignmentValue(ctx.assignmentValue());
            }
        } else if (safeWriteText(ctx.IDENTIFIER(), EMPTY, SPACE)) {
            safeWriteText(ctx.assignmentOp(), EMPTY, SPACE);
            visitAssignmentValue(ctx.assignmentValue());
        } else {
            visitArrayAccess(ctx.arrayAccess());
            safeWriteText(ctx.assignmentOp(), SPACE, SPACE);
            visitAssignmentValue(ctx.assignmentValue());
        }

        return null;
    }

    @Override
    public Void visitConstructor(JavaClassParser.ConstructorContext ctx) {
        visitAccessModifier(ctx.accessModifier());
        safeWriteText(ctx.IDENTIFIER(), EMPTY, EMPTY);
        safeWriteText(ctx.L_PARAN(), EMPTY, EMPTY);
        visitArguments(ctx.arguments());
        safeWriteText(ctx.R_PARAN(), EMPTY, EMPTY);
        newLine(0);
        safeWriteText(ctx.L_BRACE(), EMPTY, EMPTY);
        visitConstructorBody(ctx.constructorBody());
        safeWriteText(ctx.R_BRACE(), EMPTY, EMPTY);
        return null;
    }

    @Override
    public Void visitConstructorBody(JavaClassParser.ConstructorBodyContext ctx) {
        if (ctx.methodBody().getChildCount() != 0) {
            newLine(1);
            if (safeWriteText(ctx.SUPER(), EMPTY, EMPTY)) {
                safeWriteText(ctx.L_PARAN(), EMPTY, EMPTY);
                visitMethodParams(ctx.methodParams());
                safeWriteText(ctx.R_PARAN(), EMPTY, EMPTY);
                safeWriteText(ctx.SEMICOLON(), EMPTY, EMPTY);
                newLine(0);
            }
            visitMethodBody(ctx.methodBody());
            newLine(-1);
        } else {
            if (ctx.SUPER() != null) {
                newLine(1);
                safeWriteText(ctx.SUPER(), EMPTY, EMPTY);
                safeWriteText(ctx.L_PARAN(), EMPTY, EMPTY);
                visitMethodParams(ctx.methodParams());
                safeWriteText(ctx.R_PARAN(), EMPTY, EMPTY);
                safeWriteText(ctx.SEMICOLON(), EMPTY, EMPTY);
                newLine(-1);
            } else {
                newLine(0);
            }
        }

        return null;
    }

    @Override
    public Void visitIfElseStatement(JavaClassParser.IfElseStatementContext ctx) {
        safeWriteText(ctx.IF(), EMPTY, SPACE);
        safeWriteText(ctx.L_PARAN(), EMPTY, EMPTY);
        visitExpression(ctx.expression());
        safeWriteText(ctx.R_PARAN(), EMPTY, EMPTY);
        newLine(0);
        safeWriteText(ctx.L_BRACE().get(0), EMPTY, EMPTY);

        if (ctx.methodBody().get(0).getChildCount() != 0) {
            newLine(1);
            visitMethodBody(ctx.methodBody().get(0));
            newLine(-1);
        } else {
            newLine(0);
        }

        safeWriteText(ctx.R_BRACE().get(0), EMPTY, EMPTY);

        if (safeWriteText(ctx.ELSE(), SPACE, EMPTY)) {
            if (ctx.methodBody().get(1).getChildCount() != 0) {
                newLine(0);
                safeWriteText(ctx.L_BRACE().get(0), EMPTY, EMPTY);
                newLine(1);
                visitMethodBody(ctx.methodBody().get(1));
                newLine(-1);
            } else {
                newLine(0);
            }

            safeWriteText(ctx.R_BRACE().get(0), EMPTY, EMPTY);
        }

        return null;
    }

    @Override
    public Void visitWhileLoop(JavaClassParser.WhileLoopContext ctx) {
        safeWriteText(ctx.WHILE(), EMPTY, SPACE);
        safeWriteText(ctx.L_PARAN(), EMPTY, EMPTY);
        visitExpression(ctx.expression());
        safeWriteText(ctx.R_PARAN(), EMPTY, EMPTY);
        newLine(0);
        safeWriteText(ctx.L_BRACE(), EMPTY, EMPTY);

        if (ctx.methodBody().getChildCount() != 0) {
            newLine(1);
            visitMethodBody(ctx.methodBody());
            newLine(-1);
        } else {
            newLine(0);
        }

        safeWriteText(ctx.R_BRACE(), EMPTY, EMPTY);
        return null;
    }

    @Override
    public Void visitDoWhileLoop(JavaClassParser.DoWhileLoopContext ctx) {
        safeWriteText(ctx.DO(), EMPTY, EMPTY);
        newLine(0);
        safeWriteText(ctx.L_BRACE(), EMPTY, EMPTY);

        if (ctx.methodBody().getChildCount() != 0) {
            newLine(1);
            visitMethodBody(ctx.methodBody());
            newLine(-1);
        } else {
            newLine(0);
        }

        safeWriteText(ctx.R_BRACE(), EMPTY, SPACE);
        safeWriteText(ctx.WHILE(), EMPTY, SPACE);
        safeWriteText(ctx.L_PARAN(), EMPTY, EMPTY);
        visitExpression(ctx.expression());
        safeWriteText(ctx.R_PARAN(), EMPTY, EMPTY);
        safeWriteText(ctx.SEMICOLON(), EMPTY, EMPTY);
        return null;
    }

    @Override
    public Void visitForLoop(JavaClassParser.ForLoopContext ctx) {
        safeWriteText(ctx.FOR(), EMPTY, SPACE);
        safeWriteText(ctx.L_PARAN(), EMPTY, EMPTY);

        visitAssignment(ctx.assignment().get(0));
        safeWriteText(ctx.SEMICOLON().get(0), EMPTY, SPACE);
        visitExpression(ctx.expression());
        safeWriteText(ctx.SEMICOLON().get(0), EMPTY, SPACE);
        visitAssignment(ctx.assignment().get(1));

        safeWriteText(ctx.R_PARAN(), EMPTY, EMPTY);
        newLine(0);
        safeWriteText(ctx.L_BRACE(), EMPTY, EMPTY);

        if (ctx.methodBody().getChildCount() != 0) {
            newLine(1);
            visitMethodBody(ctx.methodBody());
            newLine(-1);
        } else {
            newLine(0);
        }

        safeWriteText(ctx.R_BRACE(), EMPTY, EMPTY);
        return null;
    }
}
