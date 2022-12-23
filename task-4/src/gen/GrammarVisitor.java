package gen;// Generated from C:/Users/Flexatroid/Desktop/MT/Lab4/src\Grammar.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GrammarParser#newGrammar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewGrammar(GrammarParser.NewGrammarContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#grammarName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrammarName(GrammarParser.GrammarNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#commonAttributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommonAttributes(GrammarParser.CommonAttributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#grammarRules}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrammarRules(GrammarParser.GrammarRulesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#grammarRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrammarRule(GrammarParser.GrammarRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#grammarLexerRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrammarLexerRule(GrammarParser.GrammarLexerRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#grammarParserRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrammarParserRule(GrammarParser.GrammarParserRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#parserSubRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParserSubRule(GrammarParser.ParserSubRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#parserRuleSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParserRuleSection(GrammarParser.ParserRuleSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#attributeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeDeclaration(GrammarParser.AttributeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#commonAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommonAttribute(GrammarParser.CommonAttributeContext ctx);
}