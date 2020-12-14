// Generated from /home/yahya/source/Gama/Gama.Antlr/Gama.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GamaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, LT=2, GT=3, LE=4, GE=5, EQ=6, NE=7, ADD=8, SUB=9, MUL=10, DIV=11, 
		MOD=12, LP=13, RP=14, LB=15, RB=16, LQ=17, RQ=18, AND=19, OR=20, XOR=21, 
		HASH=22, SC=23, NSDiv=24, Colon=25, Comma=26, Period=27, Equals=28, Namespace=29, 
		Let=30, Operator=31, Using=32, Return=33, Delegate=34, Extern=35, Packed=36, 
		Struct=37, Impl=38, True=39, False=40, Import=41, StackAlloc=42, New=43, 
		If=44, Else=45, While=46, Do=47, OpMul=48, OpAdd=49, OpComp=50, OpComparison=51, 
		Symbol=52, StringLiteral=53, CharLiteral=54, FloatingLiteral=55, IntegerLiteral=56, 
		NumericLiteral=57, MultiComment=58, LineComment=59, WhiteSpace=60;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "LT", "GT", "LE", "GE", "EQ", "NE", "ADD", "SUB", "MUL", "DIV", 
			"MOD", "LP", "RP", "LB", "RB", "LQ", "RQ", "AND", "OR", "XOR", "HASH", 
			"SC", "NSDiv", "Colon", "Comma", "Period", "Equals", "Namespace", "Let", 
			"Operator", "Using", "Return", "Delegate", "Extern", "Packed", "Struct", 
			"Impl", "True", "False", "Import", "StackAlloc", "New", "If", "Else", 
			"While", "Do", "OpMul", "OpAdd", "OpComp", "OpComparison", "Symbol", 
			"SingleStringChar", "DoubleStringChar", "NonNewlineChar", "EscapeSequence", 
			"SingleEscape", "SuffixFloat", "SuffixDouble", "SuffixLong", "SuffixUnsigned", 
			"SuffixShort", "SuffixDecimal", "NumericSuffix", "StringLiteral", "CharLiteral", 
			"FloatingLiteral", "IntegerLiteral", "NumericLiteral", "MultiComment", 
			"LineComment", "WhiteSpace"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'...'", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", "'+'", "'-'", 
			"'*'", "'/'", "'%'", "'('", "')'", "'{'", "'}'", "'['", "']'", "'&'", 
			"'|'", "'^'", "'#'", "';'", "'::'", "':'", "','", "'.'", "'='", "'namespace'", 
			"'let'", "'operator'", "'using'", "'return'", "'delegate'", "'extern'", 
			"'packed'", "'struct'", "'impl'", "'true'", "'false'", "'import'", "'stackalloc'", 
			"'new'", "'if'", "'else'", "'while'", "'do'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "LT", "GT", "LE", "GE", "EQ", "NE", "ADD", "SUB", "MUL", 
			"DIV", "MOD", "LP", "RP", "LB", "RB", "LQ", "RQ", "AND", "OR", "XOR", 
			"HASH", "SC", "NSDiv", "Colon", "Comma", "Period", "Equals", "Namespace", 
			"Let", "Operator", "Using", "Return", "Delegate", "Extern", "Packed", 
			"Struct", "Impl", "True", "False", "Import", "StackAlloc", "New", "If", 
			"Else", "While", "Do", "OpMul", "OpAdd", "OpComp", "OpComparison", "Symbol", 
			"StringLiteral", "CharLiteral", "FloatingLiteral", "IntegerLiteral", 
			"NumericLiteral", "MultiComment", "LineComment", "WhiteSpace"
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


	public GamaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Gama.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2>\u01de\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26"+
		"\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34"+
		"\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37"+
		"\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3"+
		"%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3("+
		"\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+"+
		"\3+\3,\3,\3,\3,\3-\3-\3-\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3\60\3\60\3"+
		"\60\3\61\3\61\3\61\5\61\u014f\n\61\3\62\3\62\5\62\u0153\n\62\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\5\63\u015b\n\63\3\64\3\64\3\64\3\64\3\64\3\64\5\64"+
		"\u0163\n\64\3\65\3\65\7\65\u0167\n\65\f\65\16\65\u016a\13\65\3\66\3\66"+
		"\3\66\5\66\u016f\n\66\3\67\3\67\3\67\5\67\u0174\n\67\38\38\39\39\3:\3"+
		":\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3A\3A\3A\3A\5A\u018e\nA\3"+
		"B\3B\7B\u0192\nB\fB\16B\u0195\13B\3B\3B\3C\3C\3C\3C\3D\5D\u019e\nD\3D"+
		"\3D\6D\u01a2\nD\rD\16D\u01a3\3E\3E\3E\7E\u01a9\nE\fE\16E\u01ac\13E\3E"+
		"\3E\3E\3E\3E\3E\3E\6E\u01b5\nE\rE\16E\u01b6\5E\u01b9\nE\3F\3F\5F\u01bd"+
		"\nF\3G\3G\3G\3G\7G\u01c3\nG\fG\16G\u01c6\13G\3G\3G\3G\3G\3G\3H\3H\3H\3"+
		"H\7H\u01d1\nH\fH\16H\u01d4\13H\3H\3H\3I\6I\u01d9\nI\rI\16I\u01da\3I\3"+
		"I\3\u01c4\2J\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34"+
		"\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g"+
		"\65i\66k\2m\2o\2q\2s\2u\2w\2y\2{\2}\2\177\2\u0081\2\u0083\67\u00858\u0087"+
		"9\u0089:\u008b;\u008d<\u008f=\u0091>\3\2\25\5\2C\\aac|\6\2\62;C\\aac|"+
		"\6\2\f\f\17\17))^^\6\2\f\f\17\17$$^^\3\2\f\f\13\2$$))^^ddhhppttvvxx\4"+
		"\2HHhh\4\2FFff\4\2NNnn\4\2WWww\4\2UUuu\4\2OOoo\3\2\62;\3\2\63;\4\2ZZz"+
		"z\5\2\62;CHch\3\2\62\63\5\2\f\f\17\17\u202a\u202b\5\2\13\f\17\17\"\"\2"+
		"\u01f2\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3"+
		"\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2"+
		"\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2\u0083\3\2"+
		"\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2"+
		"\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\3\u0093\3\2\2\2\5\u0097"+
		"\3\2\2\2\7\u0099\3\2\2\2\t\u009b\3\2\2\2\13\u009e\3\2\2\2\r\u00a1\3\2"+
		"\2\2\17\u00a4\3\2\2\2\21\u00a7\3\2\2\2\23\u00a9\3\2\2\2\25\u00ab\3\2\2"+
		"\2\27\u00ad\3\2\2\2\31\u00af\3\2\2\2\33\u00b1\3\2\2\2\35\u00b3\3\2\2\2"+
		"\37\u00b5\3\2\2\2!\u00b7\3\2\2\2#\u00b9\3\2\2\2%\u00bb\3\2\2\2\'\u00bd"+
		"\3\2\2\2)\u00bf\3\2\2\2+\u00c1\3\2\2\2-\u00c3\3\2\2\2/\u00c5\3\2\2\2\61"+
		"\u00c7\3\2\2\2\63\u00ca\3\2\2\2\65\u00cc\3\2\2\2\67\u00ce\3\2\2\29\u00d0"+
		"\3\2\2\2;\u00d2\3\2\2\2=\u00dc\3\2\2\2?\u00e0\3\2\2\2A\u00e9\3\2\2\2C"+
		"\u00ef\3\2\2\2E\u00f6\3\2\2\2G\u00ff\3\2\2\2I\u0106\3\2\2\2K\u010d\3\2"+
		"\2\2M\u0114\3\2\2\2O\u0119\3\2\2\2Q\u011e\3\2\2\2S\u0124\3\2\2\2U\u012b"+
		"\3\2\2\2W\u0136\3\2\2\2Y\u013a\3\2\2\2[\u013d\3\2\2\2]\u0142\3\2\2\2_"+
		"\u0148\3\2\2\2a\u014e\3\2\2\2c\u0152\3\2\2\2e\u015a\3\2\2\2g\u0162\3\2"+
		"\2\2i\u0164\3\2\2\2k\u016e\3\2\2\2m\u0173\3\2\2\2o\u0175\3\2\2\2q\u0177"+
		"\3\2\2\2s\u0179\3\2\2\2u\u017b\3\2\2\2w\u017d\3\2\2\2y\u017f\3\2\2\2{"+
		"\u0181\3\2\2\2}\u0183\3\2\2\2\177\u0185\3\2\2\2\u0081\u018d\3\2\2\2\u0083"+
		"\u018f\3\2\2\2\u0085\u0198\3\2\2\2\u0087\u019d\3\2\2\2\u0089\u01b8\3\2"+
		"\2\2\u008b\u01bc\3\2\2\2\u008d\u01be\3\2\2\2\u008f\u01cc\3\2\2\2\u0091"+
		"\u01d8\3\2\2\2\u0093\u0094\7\60\2\2\u0094\u0095\7\60\2\2\u0095\u0096\7"+
		"\60\2\2\u0096\4\3\2\2\2\u0097\u0098\7>\2\2\u0098\6\3\2\2\2\u0099\u009a"+
		"\7@\2\2\u009a\b\3\2\2\2\u009b\u009c\7>\2\2\u009c\u009d\7?\2\2\u009d\n"+
		"\3\2\2\2\u009e\u009f\7@\2\2\u009f\u00a0\7?\2\2\u00a0\f\3\2\2\2\u00a1\u00a2"+
		"\7?\2\2\u00a2\u00a3\7?\2\2\u00a3\16\3\2\2\2\u00a4\u00a5\7#\2\2\u00a5\u00a6"+
		"\7?\2\2\u00a6\20\3\2\2\2\u00a7\u00a8\7-\2\2\u00a8\22\3\2\2\2\u00a9\u00aa"+
		"\7/\2\2\u00aa\24\3\2\2\2\u00ab\u00ac\7,\2\2\u00ac\26\3\2\2\2\u00ad\u00ae"+
		"\7\61\2\2\u00ae\30\3\2\2\2\u00af\u00b0\7\'\2\2\u00b0\32\3\2\2\2\u00b1"+
		"\u00b2\7*\2\2\u00b2\34\3\2\2\2\u00b3\u00b4\7+\2\2\u00b4\36\3\2\2\2\u00b5"+
		"\u00b6\7}\2\2\u00b6 \3\2\2\2\u00b7\u00b8\7\177\2\2\u00b8\"\3\2\2\2\u00b9"+
		"\u00ba\7]\2\2\u00ba$\3\2\2\2\u00bb\u00bc\7_\2\2\u00bc&\3\2\2\2\u00bd\u00be"+
		"\7(\2\2\u00be(\3\2\2\2\u00bf\u00c0\7~\2\2\u00c0*\3\2\2\2\u00c1\u00c2\7"+
		"`\2\2\u00c2,\3\2\2\2\u00c3\u00c4\7%\2\2\u00c4.\3\2\2\2\u00c5\u00c6\7="+
		"\2\2\u00c6\60\3\2\2\2\u00c7\u00c8\7<\2\2\u00c8\u00c9\7<\2\2\u00c9\62\3"+
		"\2\2\2\u00ca\u00cb\7<\2\2\u00cb\64\3\2\2\2\u00cc\u00cd\7.\2\2\u00cd\66"+
		"\3\2\2\2\u00ce\u00cf\7\60\2\2\u00cf8\3\2\2\2\u00d0\u00d1\7?\2\2\u00d1"+
		":\3\2\2\2\u00d2\u00d3\7p\2\2\u00d3\u00d4\7c\2\2\u00d4\u00d5\7o\2\2\u00d5"+
		"\u00d6\7g\2\2\u00d6\u00d7\7u\2\2\u00d7\u00d8\7r\2\2\u00d8\u00d9\7c\2\2"+
		"\u00d9\u00da\7e\2\2\u00da\u00db\7g\2\2\u00db<\3\2\2\2\u00dc\u00dd\7n\2"+
		"\2\u00dd\u00de\7g\2\2\u00de\u00df\7v\2\2\u00df>\3\2\2\2\u00e0\u00e1\7"+
		"q\2\2\u00e1\u00e2\7r\2\2\u00e2\u00e3\7g\2\2\u00e3\u00e4\7t\2\2\u00e4\u00e5"+
		"\7c\2\2\u00e5\u00e6\7v\2\2\u00e6\u00e7\7q\2\2\u00e7\u00e8\7t\2\2\u00e8"+
		"@\3\2\2\2\u00e9\u00ea\7w\2\2\u00ea\u00eb\7u\2\2\u00eb\u00ec\7k\2\2\u00ec"+
		"\u00ed\7p\2\2\u00ed\u00ee\7i\2\2\u00eeB\3\2\2\2\u00ef\u00f0\7t\2\2\u00f0"+
		"\u00f1\7g\2\2\u00f1\u00f2\7v\2\2\u00f2\u00f3\7w\2\2\u00f3\u00f4\7t\2\2"+
		"\u00f4\u00f5\7p\2\2\u00f5D\3\2\2\2\u00f6\u00f7\7f\2\2\u00f7\u00f8\7g\2"+
		"\2\u00f8\u00f9\7n\2\2\u00f9\u00fa\7g\2\2\u00fa\u00fb\7i\2\2\u00fb\u00fc"+
		"\7c\2\2\u00fc\u00fd\7v\2\2\u00fd\u00fe\7g\2\2\u00feF\3\2\2\2\u00ff\u0100"+
		"\7g\2\2\u0100\u0101\7z\2\2\u0101\u0102\7v\2\2\u0102\u0103\7g\2\2\u0103"+
		"\u0104\7t\2\2\u0104\u0105\7p\2\2\u0105H\3\2\2\2\u0106\u0107\7r\2\2\u0107"+
		"\u0108\7c\2\2\u0108\u0109\7e\2\2\u0109\u010a\7m\2\2\u010a\u010b\7g\2\2"+
		"\u010b\u010c\7f\2\2\u010cJ\3\2\2\2\u010d\u010e\7u\2\2\u010e\u010f\7v\2"+
		"\2\u010f\u0110\7t\2\2\u0110\u0111\7w\2\2\u0111\u0112\7e\2\2\u0112\u0113"+
		"\7v\2\2\u0113L\3\2\2\2\u0114\u0115\7k\2\2\u0115\u0116\7o\2\2\u0116\u0117"+
		"\7r\2\2\u0117\u0118\7n\2\2\u0118N\3\2\2\2\u0119\u011a\7v\2\2\u011a\u011b"+
		"\7t\2\2\u011b\u011c\7w\2\2\u011c\u011d\7g\2\2\u011dP\3\2\2\2\u011e\u011f"+
		"\7h\2\2\u011f\u0120\7c\2\2\u0120\u0121\7n\2\2\u0121\u0122\7u\2\2\u0122"+
		"\u0123\7g\2\2\u0123R\3\2\2\2\u0124\u0125\7k\2\2\u0125\u0126\7o\2\2\u0126"+
		"\u0127\7r\2\2\u0127\u0128\7q\2\2\u0128\u0129\7t\2\2\u0129\u012a\7v\2\2"+
		"\u012aT\3\2\2\2\u012b\u012c\7u\2\2\u012c\u012d\7v\2\2\u012d\u012e\7c\2"+
		"\2\u012e\u012f\7e\2\2\u012f\u0130\7m\2\2\u0130\u0131\7c\2\2\u0131\u0132"+
		"\7n\2\2\u0132\u0133\7n\2\2\u0133\u0134\7q\2\2\u0134\u0135\7e\2\2\u0135"+
		"V\3\2\2\2\u0136\u0137\7p\2\2\u0137\u0138\7g\2\2\u0138\u0139\7y\2\2\u0139"+
		"X\3\2\2\2\u013a\u013b\7k\2\2\u013b\u013c\7h\2\2\u013cZ\3\2\2\2\u013d\u013e"+
		"\7g\2\2\u013e\u013f\7n\2\2\u013f\u0140\7u\2\2\u0140\u0141\7g\2\2\u0141"+
		"\\\3\2\2\2\u0142\u0143\7y\2\2\u0143\u0144\7j\2\2\u0144\u0145\7k\2\2\u0145"+
		"\u0146\7n\2\2\u0146\u0147\7g\2\2\u0147^\3\2\2\2\u0148\u0149\7f\2\2\u0149"+
		"\u014a\7q\2\2\u014a`\3\2\2\2\u014b\u014f\5\25\13\2\u014c\u014f\5\27\f"+
		"\2\u014d\u014f\5\31\r\2\u014e\u014b\3\2\2\2\u014e\u014c\3\2\2\2\u014e"+
		"\u014d\3\2\2\2\u014fb\3\2\2\2\u0150\u0153\5\21\t\2\u0151\u0153\5\23\n"+
		"\2\u0152\u0150\3\2\2\2\u0152\u0151\3\2\2\2\u0153d\3\2\2\2\u0154\u015b"+
		"\5\5\3\2\u0155\u015b\5\7\4\2\u0156\u015b\5\t\5\2\u0157\u015b\5\13\6\2"+
		"\u0158\u015b\5\r\7\2\u0159\u015b\5\17\b\2\u015a\u0154\3\2\2\2\u015a\u0155"+
		"\3\2\2\2\u015a\u0156\3\2\2\2\u015a\u0157\3\2\2\2\u015a\u0158\3\2\2\2\u015a"+
		"\u0159\3\2\2\2\u015bf\3\2\2\2\u015c\u0163\5\5\3\2\u015d\u0163\5\7\4\2"+
		"\u015e\u0163\5\t\5\2\u015f\u0163\5\13\6\2\u0160\u0163\5\r\7\2\u0161\u0163"+
		"\5\17\b\2\u0162\u015c\3\2\2\2\u0162\u015d\3\2\2\2\u0162\u015e\3\2\2\2"+
		"\u0162\u015f\3\2\2\2\u0162\u0160\3\2\2\2\u0162\u0161\3\2\2\2\u0163h\3"+
		"\2\2\2\u0164\u0168\t\2\2\2\u0165\u0167\t\3\2\2\u0166\u0165\3\2\2\2\u0167"+
		"\u016a\3\2\2\2\u0168\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169j\3\2\2\2"+
		"\u016a\u0168\3\2\2\2\u016b\u016f\n\4\2\2\u016c\u016d\7^\2\2\u016d\u016f"+
		"\5q9\2\u016e\u016b\3\2\2\2\u016e\u016c\3\2\2\2\u016fl\3\2\2\2\u0170\u0174"+
		"\n\5\2\2\u0171\u0172\7^\2\2\u0172\u0174\5q9\2\u0173\u0170\3\2\2\2\u0173"+
		"\u0171\3\2\2\2\u0174n\3\2\2\2\u0175\u0176\n\6\2\2\u0176p\3\2\2\2\u0177"+
		"\u0178\5s:\2\u0178r\3\2\2\2\u0179\u017a\t\7\2\2\u017at\3\2\2\2\u017b\u017c"+
		"\t\b\2\2\u017cv\3\2\2\2\u017d\u017e\t\t\2\2\u017ex\3\2\2\2\u017f\u0180"+
		"\t\n\2\2\u0180z\3\2\2\2\u0181\u0182\t\13\2\2\u0182|\3\2\2\2\u0183\u0184"+
		"\t\f\2\2\u0184~\3\2\2\2\u0185\u0186\t\r\2\2\u0186\u0080\3\2\2\2\u0187"+
		"\u018e\5u;\2\u0188\u018e\5w<\2\u0189\u018e\5y=\2\u018a\u018e\5{>\2\u018b"+
		"\u018e\5}?\2\u018c\u018e\5\177@\2\u018d\u0187\3\2\2\2\u018d\u0188\3\2"+
		"\2\2\u018d\u0189\3\2\2\2\u018d\u018a\3\2\2\2\u018d\u018b\3\2\2\2\u018d"+
		"\u018c\3\2\2\2\u018e\u0082\3\2\2\2\u018f\u0193\7$\2\2\u0190\u0192\5m\67"+
		"\2\u0191\u0190\3\2\2\2\u0192\u0195\3\2\2\2\u0193\u0191\3\2\2\2\u0193\u0194"+
		"\3\2\2\2\u0194\u0196\3\2\2\2\u0195\u0193\3\2\2\2\u0196\u0197\7$\2\2\u0197"+
		"\u0084\3\2\2\2\u0198\u0199\7)\2\2\u0199\u019a\5k\66\2\u019a\u019b\7)\2"+
		"\2\u019b\u0086\3\2\2\2\u019c\u019e\5\u0089E\2\u019d\u019c\3\2\2\2\u019d"+
		"\u019e\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a1\7\60\2\2\u01a0\u01a2\t"+
		"\16\2\2\u01a1\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a3"+
		"\u01a4\3\2\2\2\u01a4\u0088\3\2\2\2\u01a5\u01b9\7\62\2\2\u01a6\u01aa\t"+
		"\17\2\2\u01a7\u01a9\t\16\2\2\u01a8\u01a7\3\2\2\2\u01a9\u01ac\3\2\2\2\u01aa"+
		"\u01a8\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01b9\3\2\2\2\u01ac\u01aa\3\2"+
		"\2\2\u01ad\u01ae\7\62\2\2\u01ae\u01af\t\20\2\2\u01af\u01b9\t\21\2\2\u01b0"+
		"\u01b1\7\62\2\2\u01b1\u01b2\7d\2\2\u01b2\u01b4\3\2\2\2\u01b3\u01b5\t\22"+
		"\2\2\u01b4\u01b3\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b6"+
		"\u01b7\3\2\2\2\u01b7\u01b9\3\2\2\2\u01b8\u01a5\3\2\2\2\u01b8\u01a6\3\2"+
		"\2\2\u01b8\u01ad\3\2\2\2\u01b8\u01b0\3\2\2\2\u01b9\u008a\3\2\2\2\u01ba"+
		"\u01bd\5\u0087D\2\u01bb\u01bd\5\u0089E\2\u01bc\u01ba\3\2\2\2\u01bc\u01bb"+
		"\3\2\2\2\u01bd\u008c\3\2\2\2\u01be\u01bf\7\61\2\2\u01bf\u01c0\7,\2\2\u01c0"+
		"\u01c4\3\2\2\2\u01c1\u01c3\13\2\2\2\u01c2\u01c1\3\2\2\2\u01c3\u01c6\3"+
		"\2\2\2\u01c4\u01c5\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c5\u01c7\3\2\2\2\u01c6"+
		"\u01c4\3\2\2\2\u01c7\u01c8\7,\2\2\u01c8\u01c9\7\61\2\2\u01c9\u01ca\3\2"+
		"\2\2\u01ca\u01cb\bG\2\2\u01cb\u008e\3\2\2\2\u01cc\u01cd\7\61\2\2\u01cd"+
		"\u01ce\7\61\2\2\u01ce\u01d2\3\2\2\2\u01cf\u01d1\n\23\2\2\u01d0\u01cf\3"+
		"\2\2\2\u01d1\u01d4\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3"+
		"\u01d5\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d5\u01d6\bH\2\2\u01d6\u0090\3\2"+
		"\2\2\u01d7\u01d9\t\24\2\2\u01d8\u01d7\3\2\2\2\u01d9\u01da\3\2\2\2\u01da"+
		"\u01d8\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01dd\bI"+
		"\3\2\u01dd\u0092\3\2\2\2\25\2\u014e\u0152\u015a\u0162\u0168\u016e\u0173"+
		"\u018d\u0193\u019d\u01a3\u01aa\u01b6\u01b8\u01bc\u01c4\u01d2\u01da\4\2"+
		"\3\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}