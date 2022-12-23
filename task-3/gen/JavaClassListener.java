// Generated from C:/Users/Flexatroid/Desktop/MT/Lab3/src\JavaClass.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JavaClassParser}.
 */
public interface JavaClassListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JavaClassParser#javaClass}.
	 * @param ctx the parse tree
	 */
	void enterJavaClass(JavaClassParser.JavaClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaClassParser#javaClass}.
	 * @param ctx the parse tree
	 */
	void exitJavaClass(JavaClassParser.JavaClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaClassParser#classImpls}.
	 * @param ctx the parse tree
	 */
	void enterClassImpls(JavaClassParser.ClassImplsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaClassParser#classImpls}.
	 * @param ctx the parse tree
	 */
	void exitClassImpls(JavaClassParser.ClassImplsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaClassParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(JavaClassParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaClassParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(JavaClassParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaClassParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(JavaClassParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaClassParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(JavaClassParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaClassParser#constructor}.
	 * @param ctx the parse tree
	 */
	void enterConstructor(JavaClassParser.ConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaClassParser#constructor}.
	 * @param ctx the parse tree
	 */
	void exitConstructor(JavaClassParser.ConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaClassParser#method}.
	 * @param ctx the parse tree
	 */
	void enterMethod(JavaClassParser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaClassParser#method}.
	 * @param ctx the parse tree
	 */
	void exitMethod(JavaClassParser.MethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaClassParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(JavaClassParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaClassParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(JavaClassParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaClassParser#codeBlock}.
	 * @param ctx the parse tree
	 */
	void enterCodeBlock(JavaClassParser.CodeBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaClassParser#codeBlock}.
	 * @param ctx the parse tree
	 */
	void exitCodeBlock(JavaClassParser.CodeBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaClassParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void enterConstructorBody(JavaClassParser.ConstructorBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaClassParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void exitConstructorBody(JavaClassParser.ConstructorBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaClassParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(JavaClassParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaClassParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(JavaClassParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaClassParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(JavaClassParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaClassParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(JavaClassParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaClassParser#methodParams}.
	 * @param ctx the parse tree
	 */
	void enterMethodParams(JavaClassParser.MethodParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaClassParser#methodParams}.
	 * @param ctx the parse tree
	 */
	void exitMethodParams(JavaClassParser.MethodParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaClassParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(JavaClassParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaClassParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(JavaClassParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaClassParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess(JavaClassParser.ArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaClassParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess(JavaClassParser.ArrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaClassParser#assignmentValue}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentValue(JavaClassParser.AssignmentValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaClassParser#assignmentValue}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentValue(JavaClassParser.AssignmentValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaClassParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(JavaClassParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaClassParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(JavaClassParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaClassParser#ifElseStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfElseStatement(JavaClassParser.IfElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaClassParser#ifElseStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfElseStatement(JavaClassParser.IfElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaClassParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(JavaClassParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaClassParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(JavaClassParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaClassParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(JavaClassParser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaClassParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(JavaClassParser.ForLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaClassParser#doWhileLoop}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileLoop(JavaClassParser.DoWhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaClassParser#doWhileLoop}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileLoop(JavaClassParser.DoWhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaClassParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(JavaClassParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaClassParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(JavaClassParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaClassParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void enterJumpStatement(JavaClassParser.JumpStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaClassParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void exitJumpStatement(JavaClassParser.JumpStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaClassParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(JavaClassParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaClassParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(JavaClassParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaClassParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(JavaClassParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaClassParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(JavaClassParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaClassParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(JavaClassParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaClassParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(JavaClassParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaClassParser#accessModifier}.
	 * @param ctx the parse tree
	 */
	void enterAccessModifier(JavaClassParser.AccessModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaClassParser#accessModifier}.
	 * @param ctx the parse tree
	 */
	void exitAccessModifier(JavaClassParser.AccessModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaClassParser#nonAccessModifiers}.
	 * @param ctx the parse tree
	 */
	void enterNonAccessModifiers(JavaClassParser.NonAccessModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaClassParser#nonAccessModifiers}.
	 * @param ctx the parse tree
	 */
	void exitNonAccessModifiers(JavaClassParser.NonAccessModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaClassParser#assignmentOp}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOp(JavaClassParser.AssignmentOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaClassParser#assignmentOp}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOp(JavaClassParser.AssignmentOpContext ctx);
}