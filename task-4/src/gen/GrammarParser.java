package gen;// Generated from C:/Users/Flexatroid/Desktop/MT/Lab4/src\Grammar.g4 by ANTLR 4.9.1

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		GRAMMAR=1, COMMON=2, L_BRACE=3, R_BRACE=4, L_PARAN=5, R_PARAN=6, L_BRACK=7, 
		R_BRACK=8, COMMA=9, COLON=10, SEMICOLON=11, DOT=12, OR=13, SKIP_R=14, 
		TERM_ID=15, NTERM_ID=16, ATTRIBUTE=17, CODE=18, REGEX=19, WS=20;
	public static final int
		RULE_newGrammar = 0, RULE_grammarName = 1, RULE_commonAttributes = 2, 
		RULE_grammarRules = 3, RULE_grammarRule = 4, RULE_grammarLexerRule = 5, 
		RULE_grammarParserRule = 6, RULE_parserSubRule = 7, RULE_parserRuleSection = 8, 
		RULE_attributeDeclaration = 9, RULE_commonAttribute = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"newGrammar", "grammarName", "commonAttributes", "grammarRules", "grammarRule", 
			"grammarLexerRule", "grammarParserRule", "parserSubRule", "parserRuleSection", 
			"attributeDeclaration", "commonAttribute"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'grammar'", "'common'", "'{'", "'}'", "'('", "')'", "'['", "']'", 
			"','", "':'", "';'", "'.'", "'|'", "'-> skip'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "GRAMMAR", "COMMON", "L_BRACE", "R_BRACE", "L_PARAN", "R_PARAN", 
			"L_BRACK", "R_BRACK", "COMMA", "COLON", "SEMICOLON", "DOT", "OR", "SKIP_R", 
			"TERM_ID", "NTERM_ID", "ATTRIBUTE", "CODE", "REGEX", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class NewGrammarContext extends ParserRuleContext {
		public GrammarNameContext grammarName() {
			return getRuleContext(GrammarNameContext.class,0);
		}
		public GrammarRulesContext grammarRules() {
			return getRuleContext(GrammarRulesContext.class,0);
		}
		public CommonAttributesContext commonAttributes() {
			return getRuleContext(CommonAttributesContext.class,0);
		}
		public NewGrammarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newGrammar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener) ((GrammarListener)listener).enterNewGrammar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener) ((GrammarListener)listener).exitNewGrammar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor) return ((GrammarVisitor<? extends T>)visitor).visitNewGrammar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewGrammarContext newGrammar() throws RecognitionException {
		NewGrammarContext _localctx = new NewGrammarContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_newGrammar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			grammarName();
			setState(24);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMON) {
				{
				setState(23);
				commonAttributes();
				}
			}

			setState(26);
			grammarRules();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GrammarNameContext extends ParserRuleContext {
		public TerminalNode GRAMMAR() { return getToken(GrammarParser.GRAMMAR, 0); }
		public TerminalNode TERM_ID() { return getToken(GrammarParser.TERM_ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(GrammarParser.SEMICOLON, 0); }
		public GrammarNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grammarName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener) ((GrammarListener)listener).enterGrammarName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener) ((GrammarListener)listener).exitGrammarName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor) return ((GrammarVisitor<? extends T>)visitor).visitGrammarName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GrammarNameContext grammarName() throws RecognitionException {
		GrammarNameContext _localctx = new GrammarNameContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_grammarName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(GRAMMAR);
			setState(29);
			match(TERM_ID);
			setState(30);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommonAttributesContext extends ParserRuleContext {
		public TerminalNode COMMON() { return getToken(GrammarParser.COMMON, 0); }
		public TerminalNode L_BRACK() { return getToken(GrammarParser.L_BRACK, 0); }
		public TerminalNode R_BRACK() { return getToken(GrammarParser.R_BRACK, 0); }
		public List<CommonAttributeContext> commonAttribute() {
			return getRuleContexts(CommonAttributeContext.class);
		}
		public CommonAttributeContext commonAttribute(int i) {
			return getRuleContext(CommonAttributeContext.class,i);
		}
		public CommonAttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commonAttributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener) ((GrammarListener)listener).enterCommonAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener) ((GrammarListener)listener).exitCommonAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor) return ((GrammarVisitor<? extends T>)visitor).visitCommonAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommonAttributesContext commonAttributes() throws RecognitionException {
		CommonAttributesContext _localctx = new CommonAttributesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_commonAttributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(COMMON);
			setState(33);
			match(L_BRACK);
			setState(35); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(34);
				commonAttribute();
				}
				}
				setState(37); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NTERM_ID );
			setState(39);
			match(R_BRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GrammarRulesContext extends ParserRuleContext {
		public List<GrammarRuleContext> grammarRule() {
			return getRuleContexts(GrammarRuleContext.class);
		}
		public GrammarRuleContext grammarRule(int i) {
			return getRuleContext(GrammarRuleContext.class,i);
		}
		public GrammarRulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grammarRules; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener) ((GrammarListener)listener).enterGrammarRules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener) ((GrammarListener)listener).exitGrammarRules(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor) return ((GrammarVisitor<? extends T>)visitor).visitGrammarRules(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GrammarRulesContext grammarRules() throws RecognitionException {
		GrammarRulesContext _localctx = new GrammarRulesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_grammarRules);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(41);
				grammarRule();
				}
				}
				setState(44); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TERM_ID || _la==NTERM_ID );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GrammarRuleContext extends ParserRuleContext {
		public GrammarLexerRuleContext grammarLexerRule() {
			return getRuleContext(GrammarLexerRuleContext.class,0);
		}
		public GrammarParserRuleContext grammarParserRule() {
			return getRuleContext(GrammarParserRuleContext.class,0);
		}
		public GrammarRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grammarRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener) ((GrammarListener)listener).enterGrammarRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener) ((GrammarListener)listener).exitGrammarRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor) return ((GrammarVisitor<? extends T>)visitor).visitGrammarRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GrammarRuleContext grammarRule() throws RecognitionException {
		GrammarRuleContext _localctx = new GrammarRuleContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_grammarRule);
		try {
			setState(48);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TERM_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				grammarLexerRule();
				}
				break;
			case NTERM_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				grammarParserRule();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GrammarLexerRuleContext extends ParserRuleContext {
		public TerminalNode TERM_ID() { return getToken(GrammarParser.TERM_ID, 0); }
		public TerminalNode COLON() { return getToken(GrammarParser.COLON, 0); }
		public TerminalNode REGEX() { return getToken(GrammarParser.REGEX, 0); }
		public TerminalNode SEMICOLON() { return getToken(GrammarParser.SEMICOLON, 0); }
		public TerminalNode CODE() { return getToken(GrammarParser.CODE, 0); }
		public TerminalNode SKIP_R() { return getToken(GrammarParser.SKIP_R, 0); }
		public GrammarLexerRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grammarLexerRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener) ((GrammarListener)listener).enterGrammarLexerRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener) ((GrammarListener)listener).exitGrammarLexerRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor) return ((GrammarVisitor<? extends T>)visitor).visitGrammarLexerRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GrammarLexerRuleContext grammarLexerRule() throws RecognitionException {
		GrammarLexerRuleContext _localctx = new GrammarLexerRuleContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_grammarLexerRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(TERM_ID);
			setState(51);
			match(COLON);
			setState(52);
			match(REGEX);
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CODE) {
				{
				setState(53);
				match(CODE);
				}
			}

			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SKIP_R) {
				{
				setState(56);
				match(SKIP_R);
				}
			}

			setState(59);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GrammarParserRuleContext extends ParserRuleContext {
		public TerminalNode NTERM_ID() { return getToken(GrammarParser.NTERM_ID, 0); }
		public TerminalNode COLON() { return getToken(GrammarParser.COLON, 0); }
		public ParserSubRuleContext parserSubRule() {
			return getRuleContext(ParserSubRuleContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GrammarParser.SEMICOLON, 0); }
		public AttributeDeclarationContext attributeDeclaration() {
			return getRuleContext(AttributeDeclarationContext.class,0);
		}
		public GrammarParserRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grammarParserRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener) ((GrammarListener)listener).enterGrammarParserRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener) ((GrammarListener)listener).exitGrammarParserRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor) return ((GrammarVisitor<? extends T>)visitor).visitGrammarParserRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GrammarParserRuleContext grammarParserRule() throws RecognitionException {
		GrammarParserRuleContext _localctx = new GrammarParserRuleContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_grammarParserRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(NTERM_ID);
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==L_BRACK) {
				{
				setState(62);
				attributeDeclaration();
				}
			}

			setState(65);
			match(COLON);
			setState(66);
			parserSubRule(0);
			setState(67);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParserSubRuleContext extends ParserRuleContext {
		public List<ParserRuleSectionContext> parserRuleSection() {
			return getRuleContexts(ParserRuleSectionContext.class);
		}
		public ParserRuleSectionContext parserRuleSection(int i) {
			return getRuleContext(ParserRuleSectionContext.class,i);
		}
		public TerminalNode CODE() { return getToken(GrammarParser.CODE, 0); }
		public List<ParserSubRuleContext> parserSubRule() {
			return getRuleContexts(ParserSubRuleContext.class);
		}
		public ParserSubRuleContext parserSubRule(int i) {
			return getRuleContext(ParserSubRuleContext.class,i);
		}
		public TerminalNode OR() { return getToken(GrammarParser.OR, 0); }
		public ParserSubRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parserSubRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener) ((GrammarListener)listener).enterParserSubRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener) ((GrammarListener)listener).exitParserSubRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor) return ((GrammarVisitor<? extends T>)visitor).visitParserSubRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParserSubRuleContext parserSubRule() throws RecognitionException {
		return parserSubRule(0);
	}

	private ParserSubRuleContext parserSubRule(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ParserSubRuleContext _localctx = new ParserSubRuleContext(_ctx, _parentState);
		ParserSubRuleContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_parserSubRule, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(71); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(70);
					parserRuleSection();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(73); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(75);
				match(CODE);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(83);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ParserSubRuleContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_parserSubRule);
					setState(78);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(79);
					match(OR);
					setState(80);
					parserSubRule(2);
					}
					} 
				}
				setState(85);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ParserRuleSectionContext extends ParserRuleContext {
		public TerminalNode TERM_ID() { return getToken(GrammarParser.TERM_ID, 0); }
		public TerminalNode NTERM_ID() { return getToken(GrammarParser.NTERM_ID, 0); }
		public TerminalNode ATTRIBUTE() { return getToken(GrammarParser.ATTRIBUTE, 0); }
		public ParserRuleSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parserRuleSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener) ((GrammarListener)listener).enterParserRuleSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener) ((GrammarListener)listener).exitParserRuleSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor) return ((GrammarVisitor<? extends T>)visitor).visitParserRuleSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParserRuleSectionContext parserRuleSection() throws RecognitionException {
		ParserRuleSectionContext _localctx = new ParserRuleSectionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_parserRuleSection);
		try {
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TERM_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				match(TERM_ID);
				}
				break;
			case NTERM_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				match(NTERM_ID);
				setState(89);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(88);
					match(ATTRIBUTE);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeDeclarationContext extends ParserRuleContext {
		public TerminalNode L_BRACK() { return getToken(GrammarParser.L_BRACK, 0); }
		public List<TerminalNode> NTERM_ID() { return getTokens(GrammarParser.NTERM_ID); }
		public TerminalNode NTERM_ID(int i) {
			return getToken(GrammarParser.NTERM_ID, i);
		}
		public TerminalNode R_BRACK() { return getToken(GrammarParser.R_BRACK, 0); }
		public AttributeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener) ((GrammarListener)listener).enterAttributeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener) ((GrammarListener)listener).exitAttributeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor) return ((GrammarVisitor<? extends T>)visitor).visitAttributeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeDeclarationContext attributeDeclaration() throws RecognitionException {
		AttributeDeclarationContext _localctx = new AttributeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_attributeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(L_BRACK);
			setState(94);
			match(NTERM_ID);
			setState(95);
			match(NTERM_ID);
			setState(96);
			match(R_BRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommonAttributeContext extends ParserRuleContext {
		public List<TerminalNode> NTERM_ID() { return getTokens(GrammarParser.NTERM_ID); }
		public TerminalNode NTERM_ID(int i) {
			return getToken(GrammarParser.NTERM_ID, i);
		}
		public TerminalNode SEMICOLON() { return getToken(GrammarParser.SEMICOLON, 0); }
		public CommonAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commonAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener) ((GrammarListener)listener).enterCommonAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener) ((GrammarListener)listener).exitCommonAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor) return ((GrammarVisitor<? extends T>)visitor).visitCommonAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommonAttributeContext commonAttribute() throws RecognitionException {
		CommonAttributeContext _localctx = new CommonAttributeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_commonAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(NTERM_ID);
			setState(99);
			match(NTERM_ID);
			setState(100);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return parserSubRule_sempred((ParserSubRuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean parserSubRule_sempred(ParserSubRuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\26i\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\3\2\3\2\5\2\33\n\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\6\4&\n\4"+
		"\r\4\16\4\'\3\4\3\4\3\5\6\5-\n\5\r\5\16\5.\3\6\3\6\5\6\63\n\6\3\7\3\7"+
		"\3\7\3\7\5\79\n\7\3\7\5\7<\n\7\3\7\3\7\3\b\3\b\5\bB\n\b\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\6\tJ\n\t\r\t\16\tK\3\t\5\tO\n\t\3\t\3\t\3\t\7\tT\n\t\f\t\16"+
		"\tW\13\t\3\n\3\n\3\n\5\n\\\n\n\5\n^\n\n\3\13\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\2\3\20\r\2\4\6\b\n\f\16\20\22\24\26\2\2\2i\2\30\3\2\2\2"+
		"\4\36\3\2\2\2\6\"\3\2\2\2\b,\3\2\2\2\n\62\3\2\2\2\f\64\3\2\2\2\16?\3\2"+
		"\2\2\20G\3\2\2\2\22]\3\2\2\2\24_\3\2\2\2\26d\3\2\2\2\30\32\5\4\3\2\31"+
		"\33\5\6\4\2\32\31\3\2\2\2\32\33\3\2\2\2\33\34\3\2\2\2\34\35\5\b\5\2\35"+
		"\3\3\2\2\2\36\37\7\3\2\2\37 \7\21\2\2 !\7\r\2\2!\5\3\2\2\2\"#\7\4\2\2"+
		"#%\7\t\2\2$&\5\26\f\2%$\3\2\2\2&\'\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2()\3\2"+
		"\2\2)*\7\n\2\2*\7\3\2\2\2+-\5\n\6\2,+\3\2\2\2-.\3\2\2\2.,\3\2\2\2./\3"+
		"\2\2\2/\t\3\2\2\2\60\63\5\f\7\2\61\63\5\16\b\2\62\60\3\2\2\2\62\61\3\2"+
		"\2\2\63\13\3\2\2\2\64\65\7\21\2\2\65\66\7\f\2\2\668\7\25\2\2\679\7\24"+
		"\2\28\67\3\2\2\289\3\2\2\29;\3\2\2\2:<\7\20\2\2;:\3\2\2\2;<\3\2\2\2<="+
		"\3\2\2\2=>\7\r\2\2>\r\3\2\2\2?A\7\22\2\2@B\5\24\13\2A@\3\2\2\2AB\3\2\2"+
		"\2BC\3\2\2\2CD\7\f\2\2DE\5\20\t\2EF\7\r\2\2F\17\3\2\2\2GI\b\t\1\2HJ\5"+
		"\22\n\2IH\3\2\2\2JK\3\2\2\2KI\3\2\2\2KL\3\2\2\2LN\3\2\2\2MO\7\24\2\2N"+
		"M\3\2\2\2NO\3\2\2\2OU\3\2\2\2PQ\f\3\2\2QR\7\17\2\2RT\5\20\t\4SP\3\2\2"+
		"\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2V\21\3\2\2\2WU\3\2\2\2X^\7\21\2\2Y[\7"+
		"\22\2\2Z\\\7\23\2\2[Z\3\2\2\2[\\\3\2\2\2\\^\3\2\2\2]X\3\2\2\2]Y\3\2\2"+
		"\2^\23\3\2\2\2_`\7\t\2\2`a\7\22\2\2ab\7\22\2\2bc\7\n\2\2c\25\3\2\2\2d"+
		"e\7\22\2\2ef\7\22\2\2fg\7\r\2\2g\27\3\2\2\2\16\32\'.\628;AKNU[]";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}