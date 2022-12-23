// Generated from C:/Users/Flexatroid/Desktop/MT/Lab3/src\JavaClass.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaClassParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PUBLIC=1, PRIVATE=2, PROTECTED=3, CLASS=4, SUPER=5, EXTENDS=6, IMPLEMENTS=7, 
		STATIC=8, FINAL=9, ABSTRACT=10, NEW=11, L_BRACE=12, R_BRACE=13, L_PARAN=14, 
		R_PARAN=15, L_BRACK=16, R_BRACK=17, COMMA=18, SEMICOLON=19, DOT=20, IF=21, 
		ELSE=22, FOR=23, DO=24, WHILE=25, BREAK=26, CONTINUE=27, RETURN=28, TRUE=29, 
		FALSE=30, PRIMITIVE=31, LITERAL=32, IDENTIFIER=33, ASSIGN=34, ASSIGN_ADD=35, 
		ASSIGN_SUB=36, ASSIGN_MUL=37, ASSIGN_DIV=38, UNARY_OP=39, BINARY_OP=40, 
		WS=41;
	public static final int
		RULE_javaClass = 0, RULE_classImpls = 1, RULE_classBody = 2, RULE_field = 3, 
		RULE_constructor = 4, RULE_method = 5, RULE_methodBody = 6, RULE_codeBlock = 7, 
		RULE_constructorBody = 8, RULE_argument = 9, RULE_arguments = 10, RULE_methodParams = 11, 
		RULE_methodCall = 12, RULE_arrayAccess = 13, RULE_assignmentValue = 14, 
		RULE_assignment = 15, RULE_ifElseStatement = 16, RULE_whileLoop = 17, 
		RULE_forLoop = 18, RULE_doWhileLoop = 19, RULE_statement = 20, RULE_jumpStatement = 21, 
		RULE_expression = 22, RULE_bool = 23, RULE_type = 24, RULE_accessModifier = 25, 
		RULE_nonAccessModifiers = 26, RULE_assignmentOp = 27;
	private static String[] makeRuleNames() {
		return new String[] {
			"javaClass", "classImpls", "classBody", "field", "constructor", "method", 
			"methodBody", "codeBlock", "constructorBody", "argument", "arguments", 
			"methodParams", "methodCall", "arrayAccess", "assignmentValue", "assignment", 
			"ifElseStatement", "whileLoop", "forLoop", "doWhileLoop", "statement", 
			"jumpStatement", "expression", "bool", "type", "accessModifier", "nonAccessModifiers", 
			"assignmentOp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'public'", "'private'", "'protected'", "'class'", "'super'", "'extends'", 
			"'implements'", "'static'", "'final'", "'abstract'", "'new'", "'{'", 
			"'}'", "'('", "')'", "'['", "']'", "','", "';'", "'.'", "'if'", "'else'", 
			"'for'", "'do'", "'while'", "'break'", "'continue'", "'return'", "'true'", 
			"'false'", null, null, null, "'='", "'+='", "'-='", "'*='", "'/='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PUBLIC", "PRIVATE", "PROTECTED", "CLASS", "SUPER", "EXTENDS", 
			"IMPLEMENTS", "STATIC", "FINAL", "ABSTRACT", "NEW", "L_BRACE", "R_BRACE", 
			"L_PARAN", "R_PARAN", "L_BRACK", "R_BRACK", "COMMA", "SEMICOLON", "DOT", 
			"IF", "ELSE", "FOR", "DO", "WHILE", "BREAK", "CONTINUE", "RETURN", "TRUE", 
			"FALSE", "PRIMITIVE", "LITERAL", "IDENTIFIER", "ASSIGN", "ASSIGN_ADD", 
			"ASSIGN_SUB", "ASSIGN_MUL", "ASSIGN_DIV", "UNARY_OP", "BINARY_OP", "WS"
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
	public String getGrammarFileName() { return "JavaClass.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JavaClassParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class JavaClassContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(JavaClassParser.CLASS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(JavaClassParser.IDENTIFIER, 0); }
		public TerminalNode L_BRACE() { return getToken(JavaClassParser.L_BRACE, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TerminalNode R_BRACE() { return getToken(JavaClassParser.R_BRACE, 0); }
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public NonAccessModifiersContext nonAccessModifiers() {
			return getRuleContext(NonAccessModifiersContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(JavaClassParser.EXTENDS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IMPLEMENTS() { return getToken(JavaClassParser.IMPLEMENTS, 0); }
		public ClassImplsContext classImpls() {
			return getRuleContext(ClassImplsContext.class,0);
		}
		public JavaClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_javaClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaClassListener ) ((JavaClassListener)listener).enterJavaClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaClassListener ) ((JavaClassListener)listener).exitJavaClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaClassVisitor ) return ((JavaClassVisitor<? extends T>)visitor).visitJavaClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JavaClassContext javaClass() throws RecognitionException {
		JavaClassContext _localctx = new JavaClassContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_javaClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED))) != 0)) {
				{
				setState(56);
				accessModifier();
				}
			}

			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STATIC) | (1L << FINAL) | (1L << ABSTRACT))) != 0)) {
				{
				setState(59);
				nonAccessModifiers();
				}
			}

			setState(62);
			match(CLASS);
			setState(63);
			match(IDENTIFIER);
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(64);
				match(EXTENDS);
				setState(65);
				type();
				}
			}

			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(68);
				match(IMPLEMENTS);
				setState(69);
				classImpls();
				}
			}

			setState(72);
			match(L_BRACE);
			setState(73);
			classBody();
			setState(74);
			match(R_BRACE);
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

	public static class ClassImplsContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaClassParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaClassParser.COMMA, i);
		}
		public ClassImplsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classImpls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaClassListener ) ((JavaClassListener)listener).enterClassImpls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaClassListener ) ((JavaClassListener)listener).exitClassImpls(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaClassVisitor ) return ((JavaClassVisitor<? extends T>)visitor).visitClassImpls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassImplsContext classImpls() throws RecognitionException {
		ClassImplsContext _localctx = new ClassImplsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_classImpls);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			type();
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(77);
				match(COMMA);
				setState(78);
				type();
				}
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class ClassBodyContext extends ParserRuleContext {
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public List<ConstructorContext> constructor() {
			return getRuleContexts(ConstructorContext.class);
		}
		public ConstructorContext constructor(int i) {
			return getRuleContext(ConstructorContext.class,i);
		}
		public List<MethodContext> method() {
			return getRuleContexts(MethodContext.class);
		}
		public MethodContext method(int i) {
			return getRuleContext(MethodContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaClassListener ) ((JavaClassListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaClassListener ) ((JavaClassListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaClassVisitor ) return ((JavaClassVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << STATIC) | (1L << FINAL) | (1L << ABSTRACT) | (1L << PRIMITIVE) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(87);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(84);
					field();
					}
					break;
				case 2:
					{
					setState(85);
					constructor();
					}
					break;
				case 3:
					{
					setState(86);
					method();
					}
					break;
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class FieldContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(JavaClassParser.IDENTIFIER, 0); }
		public TerminalNode SEMICOLON() { return getToken(JavaClassParser.SEMICOLON, 0); }
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public NonAccessModifiersContext nonAccessModifiers() {
			return getRuleContext(NonAccessModifiersContext.class,0);
		}
		public List<TerminalNode> L_BRACK() { return getTokens(JavaClassParser.L_BRACK); }
		public TerminalNode L_BRACK(int i) {
			return getToken(JavaClassParser.L_BRACK, i);
		}
		public List<TerminalNode> R_BRACK() { return getTokens(JavaClassParser.R_BRACK); }
		public TerminalNode R_BRACK(int i) {
			return getToken(JavaClassParser.R_BRACK, i);
		}
		public AssignmentOpContext assignmentOp() {
			return getRuleContext(AssignmentOpContext.class,0);
		}
		public AssignmentValueContext assignmentValue() {
			return getRuleContext(AssignmentValueContext.class,0);
		}
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaClassListener ) ((JavaClassListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaClassListener ) ((JavaClassListener)listener).exitField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaClassVisitor ) return ((JavaClassVisitor<? extends T>)visitor).visitField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED))) != 0)) {
				{
				setState(92);
				accessModifier();
				}
			}

			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STATIC) | (1L << FINAL) | (1L << ABSTRACT))) != 0)) {
				{
				setState(95);
				nonAccessModifiers();
				}
			}

			setState(98);
			type();
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==L_BRACK) {
				{
				{
				setState(99);
				match(L_BRACK);
				setState(100);
				match(R_BRACK);
				}
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(106);
			match(IDENTIFIER);
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSIGN) | (1L << ASSIGN_ADD) | (1L << ASSIGN_SUB) | (1L << ASSIGN_MUL) | (1L << ASSIGN_DIV))) != 0)) {
				{
				setState(107);
				assignmentOp();
				setState(108);
				assignmentValue();
				}
			}

			setState(112);
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

	public static class ConstructorContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JavaClassParser.IDENTIFIER, 0); }
		public TerminalNode L_PARAN() { return getToken(JavaClassParser.L_PARAN, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode R_PARAN() { return getToken(JavaClassParser.R_PARAN, 0); }
		public TerminalNode L_BRACE() { return getToken(JavaClassParser.L_BRACE, 0); }
		public ConstructorBodyContext constructorBody() {
			return getRuleContext(ConstructorBodyContext.class,0);
		}
		public TerminalNode R_BRACE() { return getToken(JavaClassParser.R_BRACE, 0); }
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public ConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaClassListener ) ((JavaClassListener)listener).enterConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaClassListener ) ((JavaClassListener)listener).exitConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaClassVisitor ) return ((JavaClassVisitor<? extends T>)visitor).visitConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorContext constructor() throws RecognitionException {
		ConstructorContext _localctx = new ConstructorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_constructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED))) != 0)) {
				{
				setState(114);
				accessModifier();
				}
			}

			setState(117);
			match(IDENTIFIER);
			setState(118);
			match(L_PARAN);
			setState(119);
			arguments();
			setState(120);
			match(R_PARAN);
			setState(121);
			match(L_BRACE);
			setState(122);
			constructorBody();
			setState(123);
			match(R_BRACE);
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

	public static class MethodContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(JavaClassParser.IDENTIFIER, 0); }
		public TerminalNode L_PARAN() { return getToken(JavaClassParser.L_PARAN, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode R_PARAN() { return getToken(JavaClassParser.R_PARAN, 0); }
		public TerminalNode L_BRACE() { return getToken(JavaClassParser.L_BRACE, 0); }
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public TerminalNode R_BRACE() { return getToken(JavaClassParser.R_BRACE, 0); }
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public NonAccessModifiersContext nonAccessModifiers() {
			return getRuleContext(NonAccessModifiersContext.class,0);
		}
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaClassListener ) ((JavaClassListener)listener).enterMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaClassListener ) ((JavaClassListener)listener).exitMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaClassVisitor ) return ((JavaClassVisitor<? extends T>)visitor).visitMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED))) != 0)) {
				{
				setState(125);
				accessModifier();
				}
			}

			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STATIC) | (1L << FINAL) | (1L << ABSTRACT))) != 0)) {
				{
				setState(128);
				nonAccessModifiers();
				}
			}

			setState(131);
			type();
			setState(132);
			match(IDENTIFIER);
			setState(133);
			match(L_PARAN);
			setState(134);
			arguments();
			setState(135);
			match(R_PARAN);
			setState(136);
			match(L_BRACE);
			setState(137);
			methodBody();
			setState(138);
			match(R_BRACE);
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

	public static class MethodBodyContext extends ParserRuleContext {
		public List<CodeBlockContext> codeBlock() {
			return getRuleContexts(CodeBlockContext.class);
		}
		public CodeBlockContext codeBlock(int i) {
			return getRuleContext(CodeBlockContext.class,i);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaClassListener ) ((JavaClassListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaClassListener ) ((JavaClassListener)listener).exitMethodBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaClassVisitor ) return ((JavaClassVisitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_methodBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FINAL) | (1L << IF) | (1L << FOR) | (1L << DO) | (1L << WHILE) | (1L << BREAK) | (1L << CONTINUE) | (1L << RETURN) | (1L << PRIMITIVE) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(140);
				codeBlock();
				}
				}
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class CodeBlockContext extends ParserRuleContext {
		public ForLoopContext forLoop() {
			return getRuleContext(ForLoopContext.class,0);
		}
		public WhileLoopContext whileLoop() {
			return getRuleContext(WhileLoopContext.class,0);
		}
		public DoWhileLoopContext doWhileLoop() {
			return getRuleContext(DoWhileLoopContext.class,0);
		}
		public IfElseStatementContext ifElseStatement() {
			return getRuleContext(IfElseStatementContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public CodeBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaClassListener ) ((JavaClassListener)listener).enterCodeBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaClassListener ) ((JavaClassListener)listener).exitCodeBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaClassVisitor ) return ((JavaClassVisitor<? extends T>)visitor).visitCodeBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeBlockContext codeBlock() throws RecognitionException {
		CodeBlockContext _localctx = new CodeBlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_codeBlock);
		try {
			setState(151);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				forLoop();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				whileLoop();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 3);
				{
				setState(148);
				doWhileLoop();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 4);
				{
				setState(149);
				ifElseStatement();
				}
				break;
			case FINAL:
			case BREAK:
			case CONTINUE:
			case RETURN:
			case PRIMITIVE:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 5);
				{
				setState(150);
				statement();
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

	public static class ConstructorBodyContext extends ParserRuleContext {
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public TerminalNode SUPER() { return getToken(JavaClassParser.SUPER, 0); }
		public TerminalNode L_PARAN() { return getToken(JavaClassParser.L_PARAN, 0); }
		public MethodParamsContext methodParams() {
			return getRuleContext(MethodParamsContext.class,0);
		}
		public TerminalNode R_PARAN() { return getToken(JavaClassParser.R_PARAN, 0); }
		public TerminalNode SEMICOLON() { return getToken(JavaClassParser.SEMICOLON, 0); }
		public ConstructorBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaClassListener ) ((JavaClassListener)listener).enterConstructorBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaClassListener ) ((JavaClassListener)listener).exitConstructorBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaClassVisitor ) return ((JavaClassVisitor<? extends T>)visitor).visitConstructorBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorBodyContext constructorBody() throws RecognitionException {
		ConstructorBodyContext _localctx = new ConstructorBodyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_constructorBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SUPER) {
				{
				setState(153);
				match(SUPER);
				setState(154);
				match(L_PARAN);
				setState(155);
				methodParams();
				setState(156);
				match(R_PARAN);
				setState(157);
				match(SEMICOLON);
				}
			}

			setState(161);
			methodBody();
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

	public static class ArgumentContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(JavaClassParser.IDENTIFIER, 0); }
		public TerminalNode FINAL() { return getToken(JavaClassParser.FINAL, 0); }
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaClassListener ) ((JavaClassListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaClassListener ) ((JavaClassListener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaClassVisitor ) return ((JavaClassVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_argument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINAL) {
				{
				setState(163);
				match(FINAL);
				}
			}

			setState(166);
			type();
			setState(167);
			match(IDENTIFIER);
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

	public static class ArgumentsContext extends ParserRuleContext {
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaClassParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaClassParser.COMMA, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaClassListener ) ((JavaClassListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaClassListener ) ((JavaClassListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaClassVisitor ) return ((JavaClassVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FINAL) | (1L << PRIMITIVE) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(169);
				argument();
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(170);
					match(COMMA);
					setState(171);
					argument();
					}
					}
					setState(176);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

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

	public static class MethodParamsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaClassParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaClassParser.COMMA, i);
		}
		public MethodParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaClassListener ) ((JavaClassListener)listener).enterMethodParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaClassListener ) ((JavaClassListener)listener).exitMethodParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaClassVisitor ) return ((JavaClassVisitor<? extends T>)visitor).visitMethodParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodParamsContext methodParams() throws RecognitionException {
		MethodParamsContext _localctx = new MethodParamsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_methodParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << L_PARAN) | (1L << TRUE) | (1L << FALSE) | (1L << LITERAL) | (1L << IDENTIFIER) | (1L << UNARY_OP))) != 0)) {
				{
				setState(179);
				expression(0);
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(180);
					match(COMMA);
					setState(181);
					expression(0);
					}
					}
					setState(186);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

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

	public static class MethodCallContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JavaClassParser.IDENTIFIER, 0); }
		public TerminalNode L_PARAN() { return getToken(JavaClassParser.L_PARAN, 0); }
		public MethodParamsContext methodParams() {
			return getRuleContext(MethodParamsContext.class,0);
		}
		public TerminalNode R_PARAN() { return getToken(JavaClassParser.R_PARAN, 0); }
		public TerminalNode DOT() { return getToken(JavaClassParser.DOT, 0); }
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaClassListener ) ((JavaClassListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaClassListener ) ((JavaClassListener)listener).exitMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaClassVisitor ) return ((JavaClassVisitor<? extends T>)visitor).visitMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_methodCall);
		try {
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				match(IDENTIFIER);
				setState(190);
				match(L_PARAN);
				setState(191);
				methodParams();
				setState(192);
				match(R_PARAN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				match(IDENTIFIER);
				setState(195);
				match(DOT);
				setState(196);
				methodCall();
				}
				break;
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

	public static class ArrayAccessContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JavaClassParser.IDENTIFIER, 0); }
		public List<TerminalNode> L_BRACK() { return getTokens(JavaClassParser.L_BRACK); }
		public TerminalNode L_BRACK(int i) {
			return getToken(JavaClassParser.L_BRACK, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> R_BRACK() { return getTokens(JavaClassParser.R_BRACK); }
		public TerminalNode R_BRACK(int i) {
			return getToken(JavaClassParser.R_BRACK, i);
		}
		public ArrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaClassListener ) ((JavaClassListener)listener).enterArrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaClassListener ) ((JavaClassListener)listener).exitArrayAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaClassVisitor ) return ((JavaClassVisitor<? extends T>)visitor).visitArrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayAccessContext arrayAccess() throws RecognitionException {
		ArrayAccessContext _localctx = new ArrayAccessContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_arrayAccess);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(IDENTIFIER);
			setState(204); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(200);
					match(L_BRACK);
					setState(201);
					expression(0);
					setState(202);
					match(R_BRACK);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(206); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class AssignmentValueContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NEW() { return getToken(JavaClassParser.NEW, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode L_PARAN() { return getToken(JavaClassParser.L_PARAN, 0); }
		public MethodParamsContext methodParams() {
			return getRuleContext(MethodParamsContext.class,0);
		}
		public TerminalNode R_PARAN() { return getToken(JavaClassParser.R_PARAN, 0); }
		public List<TerminalNode> L_BRACK() { return getTokens(JavaClassParser.L_BRACK); }
		public TerminalNode L_BRACK(int i) {
			return getToken(JavaClassParser.L_BRACK, i);
		}
		public List<TerminalNode> R_BRACK() { return getTokens(JavaClassParser.R_BRACK); }
		public TerminalNode R_BRACK(int i) {
			return getToken(JavaClassParser.R_BRACK, i);
		}
		public AssignmentValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaClassListener ) ((JavaClassListener)listener).enterAssignmentValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaClassListener ) ((JavaClassListener)listener).exitAssignmentValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaClassVisitor ) return ((JavaClassVisitor<? extends T>)visitor).visitAssignmentValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentValueContext assignmentValue() throws RecognitionException {
		AssignmentValueContext _localctx = new AssignmentValueContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_assignmentValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_PARAN:
			case TRUE:
			case FALSE:
			case LITERAL:
			case IDENTIFIER:
			case UNARY_OP:
				{
				setState(208);
				expression(0);
				}
				break;
			case NEW:
				{
				setState(209);
				match(NEW);
				setState(210);
				type();
				setState(224);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case R_PARAN:
				case L_BRACK:
				case SEMICOLON:
					{
					setState(217);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==L_BRACK) {
						{
						{
						setState(211);
						match(L_BRACK);
						setState(212);
						expression(0);
						setState(213);
						match(R_BRACK);
						}
						}
						setState(219);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case L_PARAN:
					{
					setState(220);
					match(L_PARAN);
					setState(221);
					methodParams();
					setState(222);
					match(R_PARAN);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JavaClassParser.IDENTIFIER, 0); }
		public AssignmentOpContext assignmentOp() {
			return getRuleContext(AssignmentOpContext.class,0);
		}
		public AssignmentValueContext assignmentValue() {
			return getRuleContext(AssignmentValueContext.class,0);
		}
		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode FINAL() { return getToken(JavaClassParser.FINAL, 0); }
		public List<TerminalNode> L_BRACK() { return getTokens(JavaClassParser.L_BRACK); }
		public TerminalNode L_BRACK(int i) {
			return getToken(JavaClassParser.L_BRACK, i);
		}
		public List<TerminalNode> R_BRACK() { return getTokens(JavaClassParser.R_BRACK); }
		public TerminalNode R_BRACK(int i) {
			return getToken(JavaClassParser.R_BRACK, i);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaClassListener ) ((JavaClassListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaClassListener ) ((JavaClassListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaClassVisitor ) return ((JavaClassVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_assignment);
		int _la;
		try {
			setState(253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(228);
				match(IDENTIFIER);
				setState(229);
				assignmentOp();
				setState(230);
				assignmentValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
				arrayAccess();
				setState(233);
				assignmentOp();
				setState(234);
				assignmentValue();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FINAL) {
					{
					setState(236);
					match(FINAL);
					}
				}

				setState(239);
				type();
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==L_BRACK) {
					{
					{
					setState(240);
					match(L_BRACK);
					setState(241);
					match(R_BRACK);
					}
					}
					setState(246);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(247);
				match(IDENTIFIER);
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSIGN) | (1L << ASSIGN_ADD) | (1L << ASSIGN_SUB) | (1L << ASSIGN_MUL) | (1L << ASSIGN_DIV))) != 0)) {
					{
					setState(248);
					assignmentOp();
					setState(249);
					assignmentValue();
					}
				}

				}
				break;
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

	public static class IfElseStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(JavaClassParser.IF, 0); }
		public TerminalNode L_PARAN() { return getToken(JavaClassParser.L_PARAN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode R_PARAN() { return getToken(JavaClassParser.R_PARAN, 0); }
		public List<TerminalNode> L_BRACE() { return getTokens(JavaClassParser.L_BRACE); }
		public TerminalNode L_BRACE(int i) {
			return getToken(JavaClassParser.L_BRACE, i);
		}
		public List<MethodBodyContext> methodBody() {
			return getRuleContexts(MethodBodyContext.class);
		}
		public MethodBodyContext methodBody(int i) {
			return getRuleContext(MethodBodyContext.class,i);
		}
		public List<TerminalNode> R_BRACE() { return getTokens(JavaClassParser.R_BRACE); }
		public TerminalNode R_BRACE(int i) {
			return getToken(JavaClassParser.R_BRACE, i);
		}
		public TerminalNode ELSE() { return getToken(JavaClassParser.ELSE, 0); }
		public IfElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifElseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaClassListener ) ((JavaClassListener)listener).enterIfElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaClassListener ) ((JavaClassListener)listener).exitIfElseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaClassVisitor ) return ((JavaClassVisitor<? extends T>)visitor).visitIfElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfElseStatementContext ifElseStatement() throws RecognitionException {
		IfElseStatementContext _localctx = new IfElseStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_ifElseStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(IF);
			setState(256);
			match(L_PARAN);
			setState(257);
			expression(0);
			setState(258);
			match(R_PARAN);
			setState(259);
			match(L_BRACE);
			setState(260);
			methodBody();
			setState(261);
			match(R_BRACE);
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(262);
				match(ELSE);
				setState(263);
				match(L_BRACE);
				setState(264);
				methodBody();
				setState(265);
				match(R_BRACE);
				}
			}

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

	public static class WhileLoopContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(JavaClassParser.WHILE, 0); }
		public TerminalNode L_PARAN() { return getToken(JavaClassParser.L_PARAN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode R_PARAN() { return getToken(JavaClassParser.R_PARAN, 0); }
		public TerminalNode L_BRACE() { return getToken(JavaClassParser.L_BRACE, 0); }
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public TerminalNode R_BRACE() { return getToken(JavaClassParser.R_BRACE, 0); }
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaClassListener ) ((JavaClassListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaClassListener ) ((JavaClassListener)listener).exitWhileLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaClassVisitor ) return ((JavaClassVisitor<? extends T>)visitor).visitWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(WHILE);
			setState(270);
			match(L_PARAN);
			setState(271);
			expression(0);
			setState(272);
			match(R_PARAN);
			setState(273);
			match(L_BRACE);
			setState(274);
			methodBody();
			setState(275);
			match(R_BRACE);
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

	public static class ForLoopContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(JavaClassParser.FOR, 0); }
		public TerminalNode L_PARAN() { return getToken(JavaClassParser.L_PARAN, 0); }
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(JavaClassParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(JavaClassParser.SEMICOLON, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode R_PARAN() { return getToken(JavaClassParser.R_PARAN, 0); }
		public TerminalNode L_BRACE() { return getToken(JavaClassParser.L_BRACE, 0); }
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public TerminalNode R_BRACE() { return getToken(JavaClassParser.R_BRACE, 0); }
		public ForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaClassListener ) ((JavaClassListener)listener).enterForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaClassListener ) ((JavaClassListener)listener).exitForLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaClassVisitor ) return ((JavaClassVisitor<? extends T>)visitor).visitForLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_forLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(FOR);
			setState(278);
			match(L_PARAN);
			setState(279);
			assignment();
			setState(280);
			match(SEMICOLON);
			setState(281);
			expression(0);
			setState(282);
			match(SEMICOLON);
			setState(283);
			assignment();
			setState(284);
			match(R_PARAN);
			setState(285);
			match(L_BRACE);
			setState(286);
			methodBody();
			setState(287);
			match(R_BRACE);
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

	public static class DoWhileLoopContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(JavaClassParser.DO, 0); }
		public TerminalNode L_BRACE() { return getToken(JavaClassParser.L_BRACE, 0); }
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public TerminalNode R_BRACE() { return getToken(JavaClassParser.R_BRACE, 0); }
		public TerminalNode WHILE() { return getToken(JavaClassParser.WHILE, 0); }
		public TerminalNode L_PARAN() { return getToken(JavaClassParser.L_PARAN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode R_PARAN() { return getToken(JavaClassParser.R_PARAN, 0); }
		public TerminalNode SEMICOLON() { return getToken(JavaClassParser.SEMICOLON, 0); }
		public DoWhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaClassListener ) ((JavaClassListener)listener).enterDoWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaClassListener ) ((JavaClassListener)listener).exitDoWhileLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaClassVisitor ) return ((JavaClassVisitor<? extends T>)visitor).visitDoWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoWhileLoopContext doWhileLoop() throws RecognitionException {
		DoWhileLoopContext _localctx = new DoWhileLoopContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_doWhileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(DO);
			setState(290);
			match(L_BRACE);
			setState(291);
			methodBody();
			setState(292);
			match(R_BRACE);
			setState(293);
			match(WHILE);
			setState(294);
			match(L_PARAN);
			setState(295);
			expression(0);
			setState(296);
			match(R_PARAN);
			setState(297);
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

	public static class StatementContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(JavaClassParser.SEMICOLON, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public JumpStatementContext jumpStatement() {
			return getRuleContext(JumpStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaClassListener ) ((JavaClassListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaClassListener ) ((JavaClassListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaClassVisitor ) return ((JavaClassVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(299);
				assignment();
				}
				break;
			case 2:
				{
				setState(300);
				methodCall();
				}
				break;
			case 3:
				{
				setState(301);
				jumpStatement();
				}
				break;
			}
			setState(304);
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

	public static class JumpStatementContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(JavaClassParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(JavaClassParser.CONTINUE, 0); }
		public TerminalNode RETURN() { return getToken(JavaClassParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public JumpStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jumpStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaClassListener ) ((JavaClassListener)listener).enterJumpStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaClassListener ) ((JavaClassListener)listener).exitJumpStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaClassVisitor ) return ((JavaClassVisitor<? extends T>)visitor).visitJumpStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JumpStatementContext jumpStatement() throws RecognitionException {
		JumpStatementContext _localctx = new JumpStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_jumpStatement);
		try {
			setState(310);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BREAK:
				enterOuterAlt(_localctx, 1);
				{
				setState(306);
				match(BREAK);
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(307);
				match(CONTINUE);
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 3);
				{
				setState(308);
				match(RETURN);
				setState(309);
				expression(0);
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

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode L_PARAN() { return getToken(JavaClassParser.L_PARAN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode R_PARAN() { return getToken(JavaClassParser.R_PARAN, 0); }
		public TerminalNode UNARY_OP() { return getToken(JavaClassParser.UNARY_OP, 0); }
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(JavaClassParser.IDENTIFIER, 0); }
		public TerminalNode LITERAL() { return getToken(JavaClassParser.LITERAL, 0); }
		public TerminalNode BINARY_OP() { return getToken(JavaClassParser.BINARY_OP, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaClassListener ) ((JavaClassListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaClassListener ) ((JavaClassListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaClassVisitor ) return ((JavaClassVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(313);
				match(L_PARAN);
				setState(314);
				expression(0);
				setState(315);
				match(R_PARAN);
				}
				break;
			case 2:
				{
				setState(317);
				match(UNARY_OP);
				setState(318);
				expression(6);
				}
				break;
			case 3:
				{
				setState(319);
				bool();
				}
				break;
			case 4:
				{
				setState(320);
				methodCall();
				}
				break;
			case 5:
				{
				setState(321);
				arrayAccess();
				}
				break;
			case 6:
				{
				setState(322);
				match(IDENTIFIER);
				}
				break;
			case 7:
				{
				setState(323);
				match(LITERAL);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(331);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(326);
					if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
					setState(327);
					match(BINARY_OP);
					setState(328);
					expression(9);
					}
					} 
				}
				setState(333);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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

	public static class BoolContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(JavaClassParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(JavaClassParser.FALSE, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaClassListener ) ((JavaClassListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaClassListener ) ((JavaClassListener)listener).exitBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaClassVisitor ) return ((JavaClassVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class TypeContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(JavaClassParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(JavaClassParser.IDENTIFIER, i);
		}
		public List<TerminalNode> DOT() { return getTokens(JavaClassParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(JavaClassParser.DOT, i);
		}
		public List<TerminalNode> L_BRACK() { return getTokens(JavaClassParser.L_BRACK); }
		public TerminalNode L_BRACK(int i) {
			return getToken(JavaClassParser.L_BRACK, i);
		}
		public List<TerminalNode> R_BRACK() { return getTokens(JavaClassParser.R_BRACK); }
		public TerminalNode R_BRACK(int i) {
			return getToken(JavaClassParser.R_BRACK, i);
		}
		public TerminalNode PRIMITIVE() { return getToken(JavaClassParser.PRIMITIVE, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaClassListener ) ((JavaClassListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaClassListener ) ((JavaClassListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaClassVisitor ) return ((JavaClassVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_type);
		int _la;
		try {
			int _alt;
			setState(359);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(336);
				match(IDENTIFIER);
				setState(341);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(337);
					match(DOT);
					setState(338);
					match(IDENTIFIER);
					}
					}
					setState(343);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(348);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(344);
						match(L_BRACK);
						setState(345);
						match(R_BRACK);
						}
						} 
					}
					setState(350);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				}
				}
				break;
			case PRIMITIVE:
				enterOuterAlt(_localctx, 2);
				{
				setState(351);
				match(PRIMITIVE);
				setState(356);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(352);
						match(L_BRACK);
						setState(353);
						match(R_BRACK);
						}
						} 
					}
					setState(358);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
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

	public static class AccessModifierContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(JavaClassParser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(JavaClassParser.PROTECTED, 0); }
		public TerminalNode PRIVATE() { return getToken(JavaClassParser.PRIVATE, 0); }
		public AccessModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaClassListener ) ((JavaClassListener)listener).enterAccessModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaClassListener ) ((JavaClassListener)listener).exitAccessModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaClassVisitor ) return ((JavaClassVisitor<? extends T>)visitor).visitAccessModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessModifierContext accessModifier() throws RecognitionException {
		AccessModifierContext _localctx = new AccessModifierContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_accessModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class NonAccessModifiersContext extends ParserRuleContext {
		public List<TerminalNode> FINAL() { return getTokens(JavaClassParser.FINAL); }
		public TerminalNode FINAL(int i) {
			return getToken(JavaClassParser.FINAL, i);
		}
		public List<TerminalNode> STATIC() { return getTokens(JavaClassParser.STATIC); }
		public TerminalNode STATIC(int i) {
			return getToken(JavaClassParser.STATIC, i);
		}
		public List<TerminalNode> ABSTRACT() { return getTokens(JavaClassParser.ABSTRACT); }
		public TerminalNode ABSTRACT(int i) {
			return getToken(JavaClassParser.ABSTRACT, i);
		}
		public NonAccessModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonAccessModifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaClassListener ) ((JavaClassListener)listener).enterNonAccessModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaClassListener ) ((JavaClassListener)listener).exitNonAccessModifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaClassVisitor ) return ((JavaClassVisitor<? extends T>)visitor).visitNonAccessModifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonAccessModifiersContext nonAccessModifiers() throws RecognitionException {
		NonAccessModifiersContext _localctx = new NonAccessModifiersContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_nonAccessModifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(363);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STATIC) | (1L << FINAL) | (1L << ABSTRACT))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(366); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STATIC) | (1L << FINAL) | (1L << ABSTRACT))) != 0) );
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

	public static class AssignmentOpContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(JavaClassParser.ASSIGN, 0); }
		public TerminalNode ASSIGN_ADD() { return getToken(JavaClassParser.ASSIGN_ADD, 0); }
		public TerminalNode ASSIGN_DIV() { return getToken(JavaClassParser.ASSIGN_DIV, 0); }
		public TerminalNode ASSIGN_MUL() { return getToken(JavaClassParser.ASSIGN_MUL, 0); }
		public TerminalNode ASSIGN_SUB() { return getToken(JavaClassParser.ASSIGN_SUB, 0); }
		public AssignmentOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaClassListener ) ((JavaClassListener)listener).enterAssignmentOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaClassListener ) ((JavaClassListener)listener).exitAssignmentOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaClassVisitor ) return ((JavaClassVisitor<? extends T>)visitor).visitAssignmentOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentOpContext assignmentOp() throws RecognitionException {
		AssignmentOpContext _localctx = new AssignmentOpContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_assignmentOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSIGN) | (1L << ASSIGN_ADD) | (1L << ASSIGN_SUB) | (1L << ASSIGN_MUL) | (1L << ASSIGN_DIV))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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
		case 22:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u0175\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\5\2<\n\2\3\2\5\2?\n\2\3\2"+
		"\3\2\3\2\3\2\5\2E\n\2\3\2\3\2\5\2I\n\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\7\3"+
		"R\n\3\f\3\16\3U\13\3\3\4\3\4\3\4\7\4Z\n\4\f\4\16\4]\13\4\3\5\5\5`\n\5"+
		"\3\5\5\5c\n\5\3\5\3\5\3\5\7\5h\n\5\f\5\16\5k\13\5\3\5\3\5\3\5\3\5\5\5"+
		"q\n\5\3\5\3\5\3\6\5\6v\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\5\7\u0081"+
		"\n\7\3\7\5\7\u0084\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\7\b\u0090"+
		"\n\b\f\b\16\b\u0093\13\b\3\t\3\t\3\t\3\t\3\t\5\t\u009a\n\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\5\n\u00a2\n\n\3\n\3\n\3\13\5\13\u00a7\n\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\7\f\u00af\n\f\f\f\16\f\u00b2\13\f\5\f\u00b4\n\f\3\r\3\r\3"+
		"\r\7\r\u00b9\n\r\f\r\16\r\u00bc\13\r\5\r\u00be\n\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\5\16\u00c8\n\16\3\17\3\17\3\17\3\17\3\17\6\17\u00cf"+
		"\n\17\r\17\16\17\u00d0\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00da\n"+
		"\20\f\20\16\20\u00dd\13\20\3\20\3\20\3\20\3\20\5\20\u00e3\n\20\5\20\u00e5"+
		"\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00f0\n\21\3\21"+
		"\3\21\3\21\7\21\u00f5\n\21\f\21\16\21\u00f8\13\21\3\21\3\21\3\21\3\21"+
		"\5\21\u00fe\n\21\5\21\u0100\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\5\22\u010e\n\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\5\26"+
		"\u0131\n\26\3\26\3\26\3\27\3\27\3\27\3\27\5\27\u0139\n\27\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0147\n\30\3\30"+
		"\3\30\3\30\7\30\u014c\n\30\f\30\16\30\u014f\13\30\3\31\3\31\3\32\3\32"+
		"\3\32\7\32\u0156\n\32\f\32\16\32\u0159\13\32\3\32\3\32\7\32\u015d\n\32"+
		"\f\32\16\32\u0160\13\32\3\32\3\32\3\32\7\32\u0165\n\32\f\32\16\32\u0168"+
		"\13\32\5\32\u016a\n\32\3\33\3\33\3\34\6\34\u016f\n\34\r\34\16\34\u0170"+
		"\3\35\3\35\3\35\2\3.\36\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*"+
		",.\60\62\64\668\2\6\3\2\37 \3\2\3\5\3\2\n\f\3\2$(\2\u018d\2;\3\2\2\2\4"+
		"N\3\2\2\2\6[\3\2\2\2\b_\3\2\2\2\nu\3\2\2\2\f\u0080\3\2\2\2\16\u0091\3"+
		"\2\2\2\20\u0099\3\2\2\2\22\u00a1\3\2\2\2\24\u00a6\3\2\2\2\26\u00b3\3\2"+
		"\2\2\30\u00bd\3\2\2\2\32\u00c7\3\2\2\2\34\u00c9\3\2\2\2\36\u00e4\3\2\2"+
		"\2 \u00ff\3\2\2\2\"\u0101\3\2\2\2$\u010f\3\2\2\2&\u0117\3\2\2\2(\u0123"+
		"\3\2\2\2*\u0130\3\2\2\2,\u0138\3\2\2\2.\u0146\3\2\2\2\60\u0150\3\2\2\2"+
		"\62\u0169\3\2\2\2\64\u016b\3\2\2\2\66\u016e\3\2\2\28\u0172\3\2\2\2:<\5"+
		"\64\33\2;:\3\2\2\2;<\3\2\2\2<>\3\2\2\2=?\5\66\34\2>=\3\2\2\2>?\3\2\2\2"+
		"?@\3\2\2\2@A\7\6\2\2AD\7#\2\2BC\7\b\2\2CE\5\62\32\2DB\3\2\2\2DE\3\2\2"+
		"\2EH\3\2\2\2FG\7\t\2\2GI\5\4\3\2HF\3\2\2\2HI\3\2\2\2IJ\3\2\2\2JK\7\16"+
		"\2\2KL\5\6\4\2LM\7\17\2\2M\3\3\2\2\2NS\5\62\32\2OP\7\24\2\2PR\5\62\32"+
		"\2QO\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2T\5\3\2\2\2US\3\2\2\2VZ\5\b"+
		"\5\2WZ\5\n\6\2XZ\5\f\7\2YV\3\2\2\2YW\3\2\2\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2"+
		"\2\2[\\\3\2\2\2\\\7\3\2\2\2][\3\2\2\2^`\5\64\33\2_^\3\2\2\2_`\3\2\2\2"+
		"`b\3\2\2\2ac\5\66\34\2ba\3\2\2\2bc\3\2\2\2cd\3\2\2\2di\5\62\32\2ef\7\22"+
		"\2\2fh\7\23\2\2ge\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2jl\3\2\2\2ki\3"+
		"\2\2\2lp\7#\2\2mn\58\35\2no\5\36\20\2oq\3\2\2\2pm\3\2\2\2pq\3\2\2\2qr"+
		"\3\2\2\2rs\7\25\2\2s\t\3\2\2\2tv\5\64\33\2ut\3\2\2\2uv\3\2\2\2vw\3\2\2"+
		"\2wx\7#\2\2xy\7\20\2\2yz\5\26\f\2z{\7\21\2\2{|\7\16\2\2|}\5\22\n\2}~\7"+
		"\17\2\2~\13\3\2\2\2\177\u0081\5\64\33\2\u0080\177\3\2\2\2\u0080\u0081"+
		"\3\2\2\2\u0081\u0083\3\2\2\2\u0082\u0084\5\66\34\2\u0083\u0082\3\2\2\2"+
		"\u0083\u0084\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\5\62\32\2\u0086\u0087"+
		"\7#\2\2\u0087\u0088\7\20\2\2\u0088\u0089\5\26\f\2\u0089\u008a\7\21\2\2"+
		"\u008a\u008b\7\16\2\2\u008b\u008c\5\16\b\2\u008c\u008d\7\17\2\2\u008d"+
		"\r\3\2\2\2\u008e\u0090\5\20\t\2\u008f\u008e\3\2\2\2\u0090\u0093\3\2\2"+
		"\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\17\3\2\2\2\u0093\u0091"+
		"\3\2\2\2\u0094\u009a\5&\24\2\u0095\u009a\5$\23\2\u0096\u009a\5(\25\2\u0097"+
		"\u009a\5\"\22\2\u0098\u009a\5*\26\2\u0099\u0094\3\2\2\2\u0099\u0095\3"+
		"\2\2\2\u0099\u0096\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u0098\3\2\2\2\u009a"+
		"\21\3\2\2\2\u009b\u009c\7\7\2\2\u009c\u009d\7\20\2\2\u009d\u009e\5\30"+
		"\r\2\u009e\u009f\7\21\2\2\u009f\u00a0\7\25\2\2\u00a0\u00a2\3\2\2\2\u00a1"+
		"\u009b\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\5\16"+
		"\b\2\u00a4\23\3\2\2\2\u00a5\u00a7\7\13\2\2\u00a6\u00a5\3\2\2\2\u00a6\u00a7"+
		"\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\5\62\32\2\u00a9\u00aa\7#\2\2"+
		"\u00aa\25\3\2\2\2\u00ab\u00b0\5\24\13\2\u00ac\u00ad\7\24\2\2\u00ad\u00af"+
		"\5\24\13\2\u00ae\u00ac\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2"+
		"\u00b0\u00b1\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00ab"+
		"\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\27\3\2\2\2\u00b5\u00ba\5.\30\2\u00b6"+
		"\u00b7\7\24\2\2\u00b7\u00b9\5.\30\2\u00b8\u00b6\3\2\2\2\u00b9\u00bc\3"+
		"\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc"+
		"\u00ba\3\2\2\2\u00bd\u00b5\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\31\3\2\2"+
		"\2\u00bf\u00c0\7#\2\2\u00c0\u00c1\7\20\2\2\u00c1\u00c2\5\30\r\2\u00c2"+
		"\u00c3\7\21\2\2\u00c3\u00c8\3\2\2\2\u00c4\u00c5\7#\2\2\u00c5\u00c6\7\26"+
		"\2\2\u00c6\u00c8\5\32\16\2\u00c7\u00bf\3\2\2\2\u00c7\u00c4\3\2\2\2\u00c8"+
		"\33\3\2\2\2\u00c9\u00ce\7#\2\2\u00ca\u00cb\7\22\2\2\u00cb\u00cc\5.\30"+
		"\2\u00cc\u00cd\7\23\2\2\u00cd\u00cf\3\2\2\2\u00ce\u00ca\3\2\2\2\u00cf"+
		"\u00d0\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\35\3\2\2"+
		"\2\u00d2\u00e5\5.\30\2\u00d3\u00d4\7\r\2\2\u00d4\u00e2\5\62\32\2\u00d5"+
		"\u00d6\7\22\2\2\u00d6\u00d7\5.\30\2\u00d7\u00d8\7\23\2\2\u00d8\u00da\3"+
		"\2\2\2\u00d9\u00d5\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db"+
		"\u00dc\3\2\2\2\u00dc\u00e3\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00df\7\20"+
		"\2\2\u00df\u00e0\5\30\r\2\u00e0\u00e1\7\21\2\2\u00e1\u00e3\3\2\2\2\u00e2"+
		"\u00db\3\2\2\2\u00e2\u00de\3\2\2\2\u00e3\u00e5\3\2\2\2\u00e4\u00d2\3\2"+
		"\2\2\u00e4\u00d3\3\2\2\2\u00e5\37\3\2\2\2\u00e6\u00e7\7#\2\2\u00e7\u00e8"+
		"\58\35\2\u00e8\u00e9\5\36\20\2\u00e9\u0100\3\2\2\2\u00ea\u00eb\5\34\17"+
		"\2\u00eb\u00ec\58\35\2\u00ec\u00ed\5\36\20\2\u00ed\u0100\3\2\2\2\u00ee"+
		"\u00f0\7\13\2\2\u00ef\u00ee\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\3"+
		"\2\2\2\u00f1\u00f6\5\62\32\2\u00f2\u00f3\7\22\2\2\u00f3\u00f5\7\23\2\2"+
		"\u00f4\u00f2\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7"+
		"\3\2\2\2\u00f7\u00f9\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00fd\7#\2\2\u00fa"+
		"\u00fb\58\35\2\u00fb\u00fc\5\36\20\2\u00fc\u00fe\3\2\2\2\u00fd\u00fa\3"+
		"\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0100\3\2\2\2\u00ff\u00e6\3\2\2\2\u00ff"+
		"\u00ea\3\2\2\2\u00ff\u00ef\3\2\2\2\u0100!\3\2\2\2\u0101\u0102\7\27\2\2"+
		"\u0102\u0103\7\20\2\2\u0103\u0104\5.\30\2\u0104\u0105\7\21\2\2\u0105\u0106"+
		"\7\16\2\2\u0106\u0107\5\16\b\2\u0107\u010d\7\17\2\2\u0108\u0109\7\30\2"+
		"\2\u0109\u010a\7\16\2\2\u010a\u010b\5\16\b\2\u010b\u010c\7\17\2\2\u010c"+
		"\u010e\3\2\2\2\u010d\u0108\3\2\2\2\u010d\u010e\3\2\2\2\u010e#\3\2\2\2"+
		"\u010f\u0110\7\33\2\2\u0110\u0111\7\20\2\2\u0111\u0112\5.\30\2\u0112\u0113"+
		"\7\21\2\2\u0113\u0114\7\16\2\2\u0114\u0115\5\16\b\2\u0115\u0116\7\17\2"+
		"\2\u0116%\3\2\2\2\u0117\u0118\7\31\2\2\u0118\u0119\7\20\2\2\u0119\u011a"+
		"\5 \21\2\u011a\u011b\7\25\2\2\u011b\u011c\5.\30\2\u011c\u011d\7\25\2\2"+
		"\u011d\u011e\5 \21\2\u011e\u011f\7\21\2\2\u011f\u0120\7\16\2\2\u0120\u0121"+
		"\5\16\b\2\u0121\u0122\7\17\2\2\u0122\'\3\2\2\2\u0123\u0124\7\32\2\2\u0124"+
		"\u0125\7\16\2\2\u0125\u0126\5\16\b\2\u0126\u0127\7\17\2\2\u0127\u0128"+
		"\7\33\2\2\u0128\u0129\7\20\2\2\u0129\u012a\5.\30\2\u012a\u012b\7\21\2"+
		"\2\u012b\u012c\7\25\2\2\u012c)\3\2\2\2\u012d\u0131\5 \21\2\u012e\u0131"+
		"\5\32\16\2\u012f\u0131\5,\27\2\u0130\u012d\3\2\2\2\u0130\u012e\3\2\2\2"+
		"\u0130\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0133\7\25\2\2\u0133+\3"+
		"\2\2\2\u0134\u0139\7\34\2\2\u0135\u0139\7\35\2\2\u0136\u0137\7\36\2\2"+
		"\u0137\u0139\5.\30\2\u0138\u0134\3\2\2\2\u0138\u0135\3\2\2\2\u0138\u0136"+
		"\3\2\2\2\u0139-\3\2\2\2\u013a\u013b\b\30\1\2\u013b\u013c\7\20\2\2\u013c"+
		"\u013d\5.\30\2\u013d\u013e\7\21\2\2\u013e\u0147\3\2\2\2\u013f\u0140\7"+
		")\2\2\u0140\u0147\5.\30\b\u0141\u0147\5\60\31\2\u0142\u0147\5\32\16\2"+
		"\u0143\u0147\5\34\17\2\u0144\u0147\7#\2\2\u0145\u0147\7\"\2\2\u0146\u013a"+
		"\3\2\2\2\u0146\u013f\3\2\2\2\u0146\u0141\3\2\2\2\u0146\u0142\3\2\2\2\u0146"+
		"\u0143\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0145\3\2\2\2\u0147\u014d\3\2"+
		"\2\2\u0148\u0149\f\n\2\2\u0149\u014a\7*\2\2\u014a\u014c\5.\30\13\u014b"+
		"\u0148\3\2\2\2\u014c\u014f\3\2\2\2\u014d\u014b\3\2\2\2\u014d\u014e\3\2"+
		"\2\2\u014e/\3\2\2\2\u014f\u014d\3\2\2\2\u0150\u0151\t\2\2\2\u0151\61\3"+
		"\2\2\2\u0152\u0157\7#\2\2\u0153\u0154\7\26\2\2\u0154\u0156\7#\2\2\u0155"+
		"\u0153\3\2\2\2\u0156\u0159\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2"+
		"\2\2\u0158\u015e\3\2\2\2\u0159\u0157\3\2\2\2\u015a\u015b\7\22\2\2\u015b"+
		"\u015d\7\23\2\2\u015c\u015a\3\2\2\2\u015d\u0160\3\2\2\2\u015e\u015c\3"+
		"\2\2\2\u015e\u015f\3\2\2\2\u015f\u016a\3\2\2\2\u0160\u015e\3\2\2\2\u0161"+
		"\u0166\7!\2\2\u0162\u0163\7\22\2\2\u0163\u0165\7\23\2\2\u0164\u0162\3"+
		"\2\2\2\u0165\u0168\3\2\2\2\u0166\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167"+
		"\u016a\3\2\2\2\u0168\u0166\3\2\2\2\u0169\u0152\3\2\2\2\u0169\u0161\3\2"+
		"\2\2\u016a\63\3\2\2\2\u016b\u016c\t\3\2\2\u016c\65\3\2\2\2\u016d\u016f"+
		"\t\4\2\2\u016e\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u016e\3\2\2\2\u0170"+
		"\u0171\3\2\2\2\u0171\67\3\2\2\2\u0172\u0173\t\5\2\2\u01739\3\2\2\2+;>"+
		"DHSY[_bipu\u0080\u0083\u0091\u0099\u00a1\u00a6\u00b0\u00b3\u00ba\u00bd"+
		"\u00c7\u00d0\u00db\u00e2\u00e4\u00ef\u00f6\u00fd\u00ff\u010d\u0130\u0138"+
		"\u0146\u014d\u0157\u015e\u0166\u0169\u0170";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}