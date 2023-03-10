// Generated from C:/Users/Flexatroid/Desktop/MT/Lab3/src\JavaClass.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaClassLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PUBLIC", "PRIVATE", "PROTECTED", "CLASS", "SUPER", "EXTENDS", "IMPLEMENTS", 
			"STATIC", "FINAL", "ABSTRACT", "NEW", "L_BRACE", "R_BRACE", "L_PARAN", 
			"R_PARAN", "L_BRACK", "R_BRACK", "COMMA", "SEMICOLON", "DOT", "IF", "ELSE", 
			"FOR", "DO", "WHILE", "BREAK", "CONTINUE", "RETURN", "TRUE", "FALSE", 
			"PRIMITIVE", "LITERAL", "IDENTIFIER", "ASSIGN", "ASSIGN_ADD", "ASSIGN_SUB", 
			"ASSIGN_MUL", "ASSIGN_DIV", "UNARY_OP", "BINARY_OP", "WS"
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


	public JavaClassLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JavaClass.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2+\u016b\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3"+
		"\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3"+
		"\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3"+
		"\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u0116\n \3!\5!\u0119\n!\3!\7!\u011c"+
		"\n!\f!\16!\u011f\13!\3!\5!\u0122\n!\3!\6!\u0125\n!\r!\16!\u0126\3!\3!"+
		"\7!\u012b\n!\f!\16!\u012e\13!\3!\3!\3!\3!\3!\5!\u0135\n!\3\"\3\"\7\"\u0139"+
		"\n\"\f\"\16\"\u013c\13\"\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'"+
		"\3(\3(\3(\3(\3(\5(\u0151\n(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)"+
		"\3)\3)\5)\u0163\n)\3*\6*\u0166\n*\r*\16*\u0167\3*\3*\3\u012c\2+\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+\3\2\13\4\2--//\3\2\62;\3\2\60\60\4\2C\\c|\6\2\62"+
		";C\\aac|\5\2,-//\61\61\5\2((``~~\4\2>>@@\5\2\13\f\17\17\"\"\2\u0185\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2"+
		"\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2"+
		"\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\3U"+
		"\3\2\2\2\5\\\3\2\2\2\7d\3\2\2\2\tn\3\2\2\2\13t\3\2\2\2\rz\3\2\2\2\17\u0082"+
		"\3\2\2\2\21\u008d\3\2\2\2\23\u0094\3\2\2\2\25\u009a\3\2\2\2\27\u00a3\3"+
		"\2\2\2\31\u00a7\3\2\2\2\33\u00a9\3\2\2\2\35\u00ab\3\2\2\2\37\u00ad\3\2"+
		"\2\2!\u00af\3\2\2\2#\u00b1\3\2\2\2%\u00b3\3\2\2\2\'\u00b5\3\2\2\2)\u00b7"+
		"\3\2\2\2+\u00b9\3\2\2\2-\u00bc\3\2\2\2/\u00c1\3\2\2\2\61\u00c5\3\2\2\2"+
		"\63\u00c8\3\2\2\2\65\u00ce\3\2\2\2\67\u00d4\3\2\2\29\u00dd\3\2\2\2;\u00e4"+
		"\3\2\2\2=\u00e9\3\2\2\2?\u0115\3\2\2\2A\u0134\3\2\2\2C\u0136\3\2\2\2E"+
		"\u013d\3\2\2\2G\u013f\3\2\2\2I\u0142\3\2\2\2K\u0145\3\2\2\2M\u0148\3\2"+
		"\2\2O\u0150\3\2\2\2Q\u0162\3\2\2\2S\u0165\3\2\2\2UV\7r\2\2VW\7w\2\2WX"+
		"\7d\2\2XY\7n\2\2YZ\7k\2\2Z[\7e\2\2[\4\3\2\2\2\\]\7r\2\2]^\7t\2\2^_\7k"+
		"\2\2_`\7x\2\2`a\7c\2\2ab\7v\2\2bc\7g\2\2c\6\3\2\2\2de\7r\2\2ef\7t\2\2"+
		"fg\7q\2\2gh\7v\2\2hi\7g\2\2ij\7e\2\2jk\7v\2\2kl\7g\2\2lm\7f\2\2m\b\3\2"+
		"\2\2no\7e\2\2op\7n\2\2pq\7c\2\2qr\7u\2\2rs\7u\2\2s\n\3\2\2\2tu\7u\2\2"+
		"uv\7w\2\2vw\7r\2\2wx\7g\2\2xy\7t\2\2y\f\3\2\2\2z{\7g\2\2{|\7z\2\2|}\7"+
		"v\2\2}~\7g\2\2~\177\7p\2\2\177\u0080\7f\2\2\u0080\u0081\7u\2\2\u0081\16"+
		"\3\2\2\2\u0082\u0083\7k\2\2\u0083\u0084\7o\2\2\u0084\u0085\7r\2\2\u0085"+
		"\u0086\7n\2\2\u0086\u0087\7g\2\2\u0087\u0088\7o\2\2\u0088\u0089\7g\2\2"+
		"\u0089\u008a\7p\2\2\u008a\u008b\7v\2\2\u008b\u008c\7u\2\2\u008c\20\3\2"+
		"\2\2\u008d\u008e\7u\2\2\u008e\u008f\7v\2\2\u008f\u0090\7c\2\2\u0090\u0091"+
		"\7v\2\2\u0091\u0092\7k\2\2\u0092\u0093\7e\2\2\u0093\22\3\2\2\2\u0094\u0095"+
		"\7h\2\2\u0095\u0096\7k\2\2\u0096\u0097\7p\2\2\u0097\u0098\7c\2\2\u0098"+
		"\u0099\7n\2\2\u0099\24\3\2\2\2\u009a\u009b\7c\2\2\u009b\u009c\7d\2\2\u009c"+
		"\u009d\7u\2\2\u009d\u009e\7v\2\2\u009e\u009f\7t\2\2\u009f\u00a0\7c\2\2"+
		"\u00a0\u00a1\7e\2\2\u00a1\u00a2\7v\2\2\u00a2\26\3\2\2\2\u00a3\u00a4\7"+
		"p\2\2\u00a4\u00a5\7g\2\2\u00a5\u00a6\7y\2\2\u00a6\30\3\2\2\2\u00a7\u00a8"+
		"\7}\2\2\u00a8\32\3\2\2\2\u00a9\u00aa\7\177\2\2\u00aa\34\3\2\2\2\u00ab"+
		"\u00ac\7*\2\2\u00ac\36\3\2\2\2\u00ad\u00ae\7+\2\2\u00ae \3\2\2\2\u00af"+
		"\u00b0\7]\2\2\u00b0\"\3\2\2\2\u00b1\u00b2\7_\2\2\u00b2$\3\2\2\2\u00b3"+
		"\u00b4\7.\2\2\u00b4&\3\2\2\2\u00b5\u00b6\7=\2\2\u00b6(\3\2\2\2\u00b7\u00b8"+
		"\7\60\2\2\u00b8*\3\2\2\2\u00b9\u00ba\7k\2\2\u00ba\u00bb\7h\2\2\u00bb,"+
		"\3\2\2\2\u00bc\u00bd\7g\2\2\u00bd\u00be\7n\2\2\u00be\u00bf\7u\2\2\u00bf"+
		"\u00c0\7g\2\2\u00c0.\3\2\2\2\u00c1\u00c2\7h\2\2\u00c2\u00c3\7q\2\2\u00c3"+
		"\u00c4\7t\2\2\u00c4\60\3\2\2\2\u00c5\u00c6\7f\2\2\u00c6\u00c7\7q\2\2\u00c7"+
		"\62\3\2\2\2\u00c8\u00c9\7y\2\2\u00c9\u00ca\7j\2\2\u00ca\u00cb\7k\2\2\u00cb"+
		"\u00cc\7n\2\2\u00cc\u00cd\7g\2\2\u00cd\64\3\2\2\2\u00ce\u00cf\7d\2\2\u00cf"+
		"\u00d0\7t\2\2\u00d0\u00d1\7g\2\2\u00d1\u00d2\7c\2\2\u00d2\u00d3\7m\2\2"+
		"\u00d3\66\3\2\2\2\u00d4\u00d5\7e\2\2\u00d5\u00d6\7q\2\2\u00d6\u00d7\7"+
		"p\2\2\u00d7\u00d8\7v\2\2\u00d8\u00d9\7k\2\2\u00d9\u00da\7p\2\2\u00da\u00db"+
		"\7w\2\2\u00db\u00dc\7g\2\2\u00dc8\3\2\2\2\u00dd\u00de\7t\2\2\u00de\u00df"+
		"\7g\2\2\u00df\u00e0\7v\2\2\u00e0\u00e1\7w\2\2\u00e1\u00e2\7t\2\2\u00e2"+
		"\u00e3\7p\2\2\u00e3:\3\2\2\2\u00e4\u00e5\7v\2\2\u00e5\u00e6\7t\2\2\u00e6"+
		"\u00e7\7w\2\2\u00e7\u00e8\7g\2\2\u00e8<\3\2\2\2\u00e9\u00ea\7h\2\2\u00ea"+
		"\u00eb\7c\2\2\u00eb\u00ec\7n\2\2\u00ec\u00ed\7u\2\2\u00ed\u00ee\7g\2\2"+
		"\u00ee>\3\2\2\2\u00ef\u00f0\7e\2\2\u00f0\u00f1\7j\2\2\u00f1\u00f2\7c\2"+
		"\2\u00f2\u0116\7t\2\2\u00f3\u00f4\7d\2\2\u00f4\u00f5\7{\2\2\u00f5\u00f6"+
		"\7v\2\2\u00f6\u0116\7g\2\2\u00f7\u00f8\7k\2\2\u00f8\u00f9\7p\2\2\u00f9"+
		"\u0116\7v\2\2\u00fa\u00fb\7u\2\2\u00fb\u00fc\7j\2\2\u00fc\u00fd\7q\2\2"+
		"\u00fd\u00fe\7t\2\2\u00fe\u0116\7v\2\2\u00ff\u0100\7n\2\2\u0100\u0101"+
		"\7q\2\2\u0101\u0102\7p\2\2\u0102\u0116\7i\2\2\u0103\u0104\7h\2\2\u0104"+
		"\u0105\7n\2\2\u0105\u0106\7q\2\2\u0106\u0107\7c\2\2\u0107\u0116\7v\2\2"+
		"\u0108\u0109\7f\2\2\u0109\u010a\7q\2\2\u010a\u010b\7w\2\2\u010b\u010c"+
		"\7d\2\2\u010c\u010d\7n\2\2\u010d\u0116\7g\2\2\u010e\u010f\7d\2\2\u010f"+
		"\u0110\7q\2\2\u0110\u0111\7q\2\2\u0111\u0112\7n\2\2\u0112\u0113\7g\2\2"+
		"\u0113\u0114\7c\2\2\u0114\u0116\7p\2\2\u0115\u00ef\3\2\2\2\u0115\u00f3"+
		"\3\2\2\2\u0115\u00f7\3\2\2\2\u0115\u00fa\3\2\2\2\u0115\u00ff\3\2\2\2\u0115"+
		"\u0103\3\2\2\2\u0115\u0108\3\2\2\2\u0115\u010e\3\2\2\2\u0116@\3\2\2\2"+
		"\u0117\u0119\t\2\2\2\u0118\u0117\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u0121"+
		"\3\2\2\2\u011a\u011c\t\3\2\2\u011b\u011a\3\2\2\2\u011c\u011f\3\2\2\2\u011d"+
		"\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u0120\3\2\2\2\u011f\u011d\3\2"+
		"\2\2\u0120\u0122\t\4\2\2\u0121\u011d\3\2\2\2\u0121\u0122\3\2\2\2\u0122"+
		"\u0124\3\2\2\2\u0123\u0125\t\3\2\2\u0124\u0123\3\2\2\2\u0125\u0126\3\2"+
		"\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0135\3\2\2\2\u0128"+
		"\u012c\7$\2\2\u0129\u012b\13\2\2\2\u012a\u0129\3\2\2\2\u012b\u012e\3\2"+
		"\2\2\u012c\u012d\3\2\2\2\u012c\u012a\3\2\2\2\u012d\u012f\3\2\2\2\u012e"+
		"\u012c\3\2\2\2\u012f\u0135\7$\2\2\u0130\u0131\7p\2\2\u0131\u0132\7w\2"+
		"\2\u0132\u0133\7n\2\2\u0133\u0135\7n\2\2\u0134\u0118\3\2\2\2\u0134\u0128"+
		"\3\2\2\2\u0134\u0130\3\2\2\2\u0135B\3\2\2\2\u0136\u013a\t\5\2\2\u0137"+
		"\u0139\t\6\2\2\u0138\u0137\3\2\2\2\u0139\u013c\3\2\2\2\u013a\u0138\3\2"+
		"\2\2\u013a\u013b\3\2\2\2\u013bD\3\2\2\2\u013c\u013a\3\2\2\2\u013d\u013e"+
		"\7?\2\2\u013eF\3\2\2\2\u013f\u0140\7-\2\2\u0140\u0141\7?\2\2\u0141H\3"+
		"\2\2\2\u0142\u0143\7/\2\2\u0143\u0144\7?\2\2\u0144J\3\2\2\2\u0145\u0146"+
		"\7,\2\2\u0146\u0147\7?\2\2\u0147L\3\2\2\2\u0148\u0149\7\61\2\2\u0149\u014a"+
		"\7?\2\2\u014aN\3\2\2\2\u014b\u0151\7#\2\2\u014c\u014d\7-\2\2\u014d\u0151"+
		"\7-\2\2\u014e\u014f\7/\2\2\u014f\u0151\7/\2\2\u0150\u014b\3\2\2\2\u0150"+
		"\u014c\3\2\2\2\u0150\u014e\3\2\2\2\u0151P\3\2\2\2\u0152\u0163\t\7\2\2"+
		"\u0153\u0154\7(\2\2\u0154\u0163\7(\2\2\u0155\u0156\7~\2\2\u0156\u0163"+
		"\7~\2\2\u0157\u0163\t\b\2\2\u0158\u0159\7?\2\2\u0159\u0163\7?\2\2\u015a"+
		"\u015b\7#\2\2\u015b\u0163\7?\2\2\u015c\u0163\t\t\2\2\u015d\u015e\7>\2"+
		"\2\u015e\u0163\7?\2\2\u015f\u0160\7@\2\2\u0160\u0163\7?\2\2\u0161\u0163"+
		"\7\'\2\2\u0162\u0152\3\2\2\2\u0162\u0153\3\2\2\2\u0162\u0155\3\2\2\2\u0162"+
		"\u0157\3\2\2\2\u0162\u0158\3\2\2\2\u0162\u015a\3\2\2\2\u0162\u015c\3\2"+
		"\2\2\u0162\u015d\3\2\2\2\u0162\u015f\3\2\2\2\u0162\u0161\3\2\2\2\u0163"+
		"R\3\2\2\2\u0164\u0166\t\n\2\2\u0165\u0164\3\2\2\2\u0166\u0167\3\2\2\2"+
		"\u0167\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016a"+
		"\b*\2\2\u016aT\3\2\2\2\17\2\u0115\u0118\u011d\u0121\u0126\u012c\u0134"+
		"\u0138\u013a\u0150\u0162\u0167\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}