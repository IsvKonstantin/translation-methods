package gen;// Generated from C:/Users/Flexatroid/Desktop/MT/Lab4/src\Grammar.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#newGrammar}.
	 * @param ctx the parse tree
	 */
	void enterNewGrammar(GrammarParser.NewGrammarContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#newGrammar}.
	 * @param ctx the parse tree
	 */
	void exitNewGrammar(GrammarParser.NewGrammarContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#grammarName}.
	 * @param ctx the parse tree
	 */
	void enterGrammarName(GrammarParser.GrammarNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#grammarName}.
	 * @param ctx the parse tree
	 */
	void exitGrammarName(GrammarParser.GrammarNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#commonAttributes}.
	 * @param ctx the parse tree
	 */
	void enterCommonAttributes(GrammarParser.CommonAttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#commonAttributes}.
	 * @param ctx the parse tree
	 */
	void exitCommonAttributes(GrammarParser.CommonAttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#grammarRules}.
	 * @param ctx the parse tree
	 */
	void enterGrammarRules(GrammarParser.GrammarRulesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#grammarRules}.
	 * @param ctx the parse tree
	 */
	void exitGrammarRules(GrammarParser.GrammarRulesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#grammarRule}.
	 * @param ctx the parse tree
	 */
	void enterGrammarRule(GrammarParser.GrammarRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#grammarRule}.
	 * @param ctx the parse tree
	 */
	void exitGrammarRule(GrammarParser.GrammarRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#grammarLexerRule}.
	 * @param ctx the parse tree
	 */
	void enterGrammarLexerRule(GrammarParser.GrammarLexerRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#grammarLexerRule}.
	 * @param ctx the parse tree
	 */
	void exitGrammarLexerRule(GrammarParser.GrammarLexerRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#grammarParserRule}.
	 * @param ctx the parse tree
	 */
	void enterGrammarParserRule(GrammarParser.GrammarParserRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#grammarParserRule}.
	 * @param ctx the parse tree
	 */
	void exitGrammarParserRule(GrammarParser.GrammarParserRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#parserSubRule}.
	 * @param ctx the parse tree
	 */
	void enterParserSubRule(GrammarParser.ParserSubRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#parserSubRule}.
	 * @param ctx the parse tree
	 */
	void exitParserSubRule(GrammarParser.ParserSubRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#parserRuleSection}.
	 * @param ctx the parse tree
	 */
	void enterParserRuleSection(GrammarParser.ParserRuleSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#parserRuleSection}.
	 * @param ctx the parse tree
	 */
	void exitParserRuleSection(GrammarParser.ParserRuleSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#attributeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAttributeDeclaration(GrammarParser.AttributeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#attributeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAttributeDeclaration(GrammarParser.AttributeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#commonAttribute}.
	 * @param ctx the parse tree
	 */
	void enterCommonAttribute(GrammarParser.CommonAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#commonAttribute}.
	 * @param ctx the parse tree
	 */
	void exitCommonAttribute(GrammarParser.CommonAttributeContext ctx);
}