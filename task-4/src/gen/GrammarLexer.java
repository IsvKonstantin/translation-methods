package gen;// Generated from C:/Users/Flexatroid/Desktop/MT/Lab4/src\Grammar.g4 by ANTLR 4.9.1

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		GRAMMAR=1, COMMON=2, L_BRACE=3, R_BRACE=4, L_PARAN=5, R_PARAN=6, L_BRACK=7, 
		R_BRACK=8, COMMA=9, COLON=10, SEMICOLON=11, DOT=12, OR=13, SKIP_R=14, 
		TERM_ID=15, NTERM_ID=16, ATTRIBUTE=17, CODE=18, REGEX=19, WS=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"GRAMMAR", "COMMON", "L_BRACE", "R_BRACE", "L_PARAN", "R_PARAN", "L_BRACK", 
			"R_BRACK", "COMMA", "COLON", "SEMICOLON", "DOT", "OR", "SKIP_R", "TERM_ID", 
			"NTERM_ID", "ATTRIBUTE", "CODE", "REGEX", "WS"
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


	public GrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26\u0088\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t"+
		"\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\20\3\20\7\20[\n\20\f\20\16\20^\13\20\3\21\3\21\7"+
		"\21b\n\21\f\21\16\21e\13\21\3\22\3\22\7\22i\n\22\f\22\16\22l\13\22\3\22"+
		"\3\22\3\23\3\23\7\23r\n\23\f\23\16\23u\13\23\3\23\3\23\3\24\3\24\7\24"+
		"{\n\24\f\24\16\24~\13\24\3\24\3\24\3\25\6\25\u0083\n\25\r\25\16\25\u0084"+
		"\3\25\3\25\5js|\2\26\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26\3\2\6\3\2C\\\6\2\62;C"+
		"\\aac|\3\2c|\5\2\13\f\17\17\"\"\2\u008d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\3+\3\2\2\2\5\63\3\2\2\2\7:\3\2\2\2\t<\3\2\2\2\13>\3\2\2\2\r@"+
		"\3\2\2\2\17B\3\2\2\2\21D\3\2\2\2\23F\3\2\2\2\25H\3\2\2\2\27J\3\2\2\2\31"+
		"L\3\2\2\2\33N\3\2\2\2\35P\3\2\2\2\37X\3\2\2\2!_\3\2\2\2#f\3\2\2\2%o\3"+
		"\2\2\2\'x\3\2\2\2)\u0082\3\2\2\2+,\7i\2\2,-\7t\2\2-.\7c\2\2./\7o\2\2/"+
		"\60\7o\2\2\60\61\7c\2\2\61\62\7t\2\2\62\4\3\2\2\2\63\64\7e\2\2\64\65\7"+
		"q\2\2\65\66\7o\2\2\66\67\7o\2\2\678\7q\2\289\7p\2\29\6\3\2\2\2:;\7}\2"+
		"\2;\b\3\2\2\2<=\7\177\2\2=\n\3\2\2\2>?\7*\2\2?\f\3\2\2\2@A\7+\2\2A\16"+
		"\3\2\2\2BC\7]\2\2C\20\3\2\2\2DE\7_\2\2E\22\3\2\2\2FG\7.\2\2G\24\3\2\2"+
		"\2HI\7<\2\2I\26\3\2\2\2JK\7=\2\2K\30\3\2\2\2LM\7\60\2\2M\32\3\2\2\2NO"+
		"\7~\2\2O\34\3\2\2\2PQ\7/\2\2QR\7@\2\2RS\7\"\2\2ST\7u\2\2TU\7m\2\2UV\7"+
		"k\2\2VW\7r\2\2W\36\3\2\2\2X\\\t\2\2\2Y[\t\3\2\2ZY\3\2\2\2[^\3\2\2\2\\"+
		"Z\3\2\2\2\\]\3\2\2\2] \3\2\2\2^\\\3\2\2\2_c\t\4\2\2`b\t\3\2\2a`\3\2\2"+
		"\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2d\"\3\2\2\2ec\3\2\2\2fj\7*\2\2gi\13\2"+
		"\2\2hg\3\2\2\2il\3\2\2\2jk\3\2\2\2jh\3\2\2\2km\3\2\2\2lj\3\2\2\2mn\7+"+
		"\2\2n$\3\2\2\2os\7}\2\2pr\13\2\2\2qp\3\2\2\2ru\3\2\2\2st\3\2\2\2sq\3\2"+
		"\2\2tv\3\2\2\2us\3\2\2\2vw\7\177\2\2w&\3\2\2\2x|\7$\2\2y{\13\2\2\2zy\3"+
		"\2\2\2{~\3\2\2\2|}\3\2\2\2|z\3\2\2\2}\177\3\2\2\2~|\3\2\2\2\177\u0080"+
		"\7$\2\2\u0080(\3\2\2\2\u0081\u0083\t\5\2\2\u0082\u0081\3\2\2\2\u0083\u0084"+
		"\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\3\2\2\2\u0086"+
		"\u0087\b\25\2\2\u0087*\3\2\2\2\t\2\\cjs|\u0084\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}