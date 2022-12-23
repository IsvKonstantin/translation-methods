// Generated from C:/Users/Flexatroid/Desktop/MT/Lab3/src\JavaClass.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JavaClassParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JavaClassVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JavaClassParser#javaClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJavaClass(JavaClassParser.JavaClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaClassParser#classImpls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassImpls(JavaClassParser.ClassImplsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaClassParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(JavaClassParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaClassParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(JavaClassParser.FieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaClassParser#constructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor(JavaClassParser.ConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaClassParser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod(JavaClassParser.MethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaClassParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(JavaClassParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaClassParser#codeBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeBlock(JavaClassParser.CodeBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaClassParser#constructorBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorBody(JavaClassParser.ConstructorBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaClassParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(JavaClassParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaClassParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(JavaClassParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaClassParser#methodParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodParams(JavaClassParser.MethodParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaClassParser#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(JavaClassParser.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaClassParser#arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess(JavaClassParser.ArrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaClassParser#assignmentValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentValue(JavaClassParser.AssignmentValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaClassParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(JavaClassParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaClassParser#ifElseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElseStatement(JavaClassParser.IfElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaClassParser#whileLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoop(JavaClassParser.WhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaClassParser#forLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoop(JavaClassParser.ForLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaClassParser#doWhileLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileLoop(JavaClassParser.DoWhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaClassParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(JavaClassParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaClassParser#jumpStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJumpStatement(JavaClassParser.JumpStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaClassParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(JavaClassParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaClassParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(JavaClassParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaClassParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(JavaClassParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaClassParser#accessModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessModifier(JavaClassParser.AccessModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaClassParser#nonAccessModifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonAccessModifiers(JavaClassParser.NonAccessModifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaClassParser#assignmentOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOp(JavaClassParser.AssignmentOpContext ctx);
}