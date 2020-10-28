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
		Struct=37, Impl=38, True=39, False=40, Import=41, If=42, Else=43, While=44, 
		Do=45, OpMul=46, OpAdd=47, OpComp=48, OpComparison=49, Symbol=50, StringLiteral=51, 
		CharLiteral=52, FloatingLiteral=53, IntegerLiteral=54, NumericLiteral=55, 
		MultiComment=56, LineComment=57, WhiteSpace=58;
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
			"Impl", "True", "False", "Import", "If", "Else", "While", "Do", "OpMul", 
			"OpAdd", "OpComp", "OpComparison", "Symbol", "SingleStringChar", "DoubleStringChar", 
			"NonNewlineChar", "EscapeSequence", "SingleEscape", "SuffixFloat", "SuffixDouble", 
			"SuffixLong", "SuffixUnsigned", "SuffixShort", "SuffixDecimal", "NumericSuffix", 
			"StringLiteral", "CharLiteral", "FloatingLiteral", "IntegerLiteral", 
			"NumericLiteral", "MultiComment", "LineComment", "WhiteSpace"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'...'", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", "'+'", "'-'", 
			"'*'", "'/'", "'%'", "'('", "')'", "'{'", "'}'", "'['", "']'", "'&'", 
			"'|'", "'^'", "'#'", "';'", "'::'", "':'", "','", "'.'", "'='", "'namespace'", 
			"'let'", "'operator'", "'using'", "'return'", "'delegate'", "'extern'", 
			"'packed'", "'struct'", "'impl'", "'true'", "'false'", "'import'", "'if'", 
			"'else'", "'while'", "'do'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "LT", "GT", "LE", "GE", "EQ", "NE", "ADD", "SUB", "MUL", 
			"DIV", "MOD", "LP", "RP", "LB", "RB", "LQ", "RQ", "AND", "OR", "XOR", 
			"HASH", "SC", "NSDiv", "Colon", "Comma", "Period", "Equals", "Namespace", 
			"Let", "Operator", "Using", "Return", "Delegate", "Extern", "Packed", 
			"Struct", "Impl", "True", "False", "Import", "If", "Else", "While", "Do", 
			"OpMul", "OpAdd", "OpComp", "OpComparison", "Symbol", "StringLiteral", 
			"CharLiteral", "FloatingLiteral", "IntegerLiteral", "NumericLiteral", 
			"MultiComment", "LineComment", "WhiteSpace"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2<\u01cb\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3"+
		"\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3"+
		"\27\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3"+
		"%\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)"+
		"\3)\3)\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-"+
		"\3.\3.\3.\3/\3/\3/\5/\u013c\n/\3\60\3\60\5\60\u0140\n\60\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\5\61\u0148\n\61\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u0150"+
		"\n\62\3\63\3\63\7\63\u0154\n\63\f\63\16\63\u0157\13\63\3\64\3\64\3\64"+
		"\5\64\u015c\n\64\3\65\3\65\3\65\5\65\u0161\n\65\3\66\3\66\3\67\3\67\3"+
		"8\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3?\3?\3?\3?\5?\u017b\n"+
		"?\3@\3@\7@\u017f\n@\f@\16@\u0182\13@\3@\3@\3A\3A\3A\3A\3B\5B\u018b\nB"+
		"\3B\3B\6B\u018f\nB\rB\16B\u0190\3C\3C\3C\7C\u0196\nC\fC\16C\u0199\13C"+
		"\3C\3C\3C\3C\3C\3C\3C\6C\u01a2\nC\rC\16C\u01a3\5C\u01a6\nC\3D\3D\5D\u01aa"+
		"\nD\3E\3E\3E\3E\7E\u01b0\nE\fE\16E\u01b3\13E\3E\3E\3E\3E\3E\3F\3F\3F\3"+
		"F\7F\u01be\nF\fF\16F\u01c1\13F\3F\3F\3G\6G\u01c6\nG\rG\16G\u01c7\3G\3"+
		"G\3\u01b1\2H\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34"+
		"\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g"+
		"\2i\2k\2m\2o\2q\2s\2u\2w\2y\2{\2}\2\177\65\u0081\66\u0083\67\u00858\u0087"+
		"9\u0089:\u008b;\u008d<\3\2\25\5\2C\\aac|\6\2\62;C\\aac|\6\2\f\f\17\17"+
		"))^^\6\2\f\f\17\17$$^^\3\2\f\f\13\2$$))^^ddhhppttvvxx\4\2HHhh\4\2FFff"+
		"\4\2NNnn\4\2WWww\4\2UUuu\4\2OOoo\3\2\62;\3\2\63;\4\2ZZzz\5\2\62;CHch\3"+
		"\2\62\63\5\2\f\f\17\17\u202a\u202b\5\2\13\f\17\17\"\"\2\u01df\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2"+
		"=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3"+
		"\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2"+
		"\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2"+
		"c\3\2\2\2\2e\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085"+
		"\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2"+
		"\2\3\u008f\3\2\2\2\5\u0093\3\2\2\2\7\u0095\3\2\2\2\t\u0097\3\2\2\2\13"+
		"\u009a\3\2\2\2\r\u009d\3\2\2\2\17\u00a0\3\2\2\2\21\u00a3\3\2\2\2\23\u00a5"+
		"\3\2\2\2\25\u00a7\3\2\2\2\27\u00a9\3\2\2\2\31\u00ab\3\2\2\2\33\u00ad\3"+
		"\2\2\2\35\u00af\3\2\2\2\37\u00b1\3\2\2\2!\u00b3\3\2\2\2#\u00b5\3\2\2\2"+
		"%\u00b7\3\2\2\2\'\u00b9\3\2\2\2)\u00bb\3\2\2\2+\u00bd\3\2\2\2-\u00bf\3"+
		"\2\2\2/\u00c1\3\2\2\2\61\u00c3\3\2\2\2\63\u00c6\3\2\2\2\65\u00c8\3\2\2"+
		"\2\67\u00ca\3\2\2\29\u00cc\3\2\2\2;\u00ce\3\2\2\2=\u00d8\3\2\2\2?\u00dc"+
		"\3\2\2\2A\u00e5\3\2\2\2C\u00eb\3\2\2\2E\u00f2\3\2\2\2G\u00fb\3\2\2\2I"+
		"\u0102\3\2\2\2K\u0109\3\2\2\2M\u0110\3\2\2\2O\u0115\3\2\2\2Q\u011a\3\2"+
		"\2\2S\u0120\3\2\2\2U\u0127\3\2\2\2W\u012a\3\2\2\2Y\u012f\3\2\2\2[\u0135"+
		"\3\2\2\2]\u013b\3\2\2\2_\u013f\3\2\2\2a\u0147\3\2\2\2c\u014f\3\2\2\2e"+
		"\u0151\3\2\2\2g\u015b\3\2\2\2i\u0160\3\2\2\2k\u0162\3\2\2\2m\u0164\3\2"+
		"\2\2o\u0166\3\2\2\2q\u0168\3\2\2\2s\u016a\3\2\2\2u\u016c\3\2\2\2w\u016e"+
		"\3\2\2\2y\u0170\3\2\2\2{\u0172\3\2\2\2}\u017a\3\2\2\2\177\u017c\3\2\2"+
		"\2\u0081\u0185\3\2\2\2\u0083\u018a\3\2\2\2\u0085\u01a5\3\2\2\2\u0087\u01a9"+
		"\3\2\2\2\u0089\u01ab\3\2\2\2\u008b\u01b9\3\2\2\2\u008d\u01c5\3\2\2\2\u008f"+
		"\u0090\7\60\2\2\u0090\u0091\7\60\2\2\u0091\u0092\7\60\2\2\u0092\4\3\2"+
		"\2\2\u0093\u0094\7>\2\2\u0094\6\3\2\2\2\u0095\u0096\7@\2\2\u0096\b\3\2"+
		"\2\2\u0097\u0098\7>\2\2\u0098\u0099\7?\2\2\u0099\n\3\2\2\2\u009a\u009b"+
		"\7@\2\2\u009b\u009c\7?\2\2\u009c\f\3\2\2\2\u009d\u009e\7?\2\2\u009e\u009f"+
		"\7?\2\2\u009f\16\3\2\2\2\u00a0\u00a1\7#\2\2\u00a1\u00a2\7?\2\2\u00a2\20"+
		"\3\2\2\2\u00a3\u00a4\7-\2\2\u00a4\22\3\2\2\2\u00a5\u00a6\7/\2\2\u00a6"+
		"\24\3\2\2\2\u00a7\u00a8\7,\2\2\u00a8\26\3\2\2\2\u00a9\u00aa\7\61\2\2\u00aa"+
		"\30\3\2\2\2\u00ab\u00ac\7\'\2\2\u00ac\32\3\2\2\2\u00ad\u00ae\7*\2\2\u00ae"+
		"\34\3\2\2\2\u00af\u00b0\7+\2\2\u00b0\36\3\2\2\2\u00b1\u00b2\7}\2\2\u00b2"+
		" \3\2\2\2\u00b3\u00b4\7\177\2\2\u00b4\"\3\2\2\2\u00b5\u00b6\7]\2\2\u00b6"+
		"$\3\2\2\2\u00b7\u00b8\7_\2\2\u00b8&\3\2\2\2\u00b9\u00ba\7(\2\2\u00ba("+
		"\3\2\2\2\u00bb\u00bc\7~\2\2\u00bc*\3\2\2\2\u00bd\u00be\7`\2\2\u00be,\3"+
		"\2\2\2\u00bf\u00c0\7%\2\2\u00c0.\3\2\2\2\u00c1\u00c2\7=\2\2\u00c2\60\3"+
		"\2\2\2\u00c3\u00c4\7<\2\2\u00c4\u00c5\7<\2\2\u00c5\62\3\2\2\2\u00c6\u00c7"+
		"\7<\2\2\u00c7\64\3\2\2\2\u00c8\u00c9\7.\2\2\u00c9\66\3\2\2\2\u00ca\u00cb"+
		"\7\60\2\2\u00cb8\3\2\2\2\u00cc\u00cd\7?\2\2\u00cd:\3\2\2\2\u00ce\u00cf"+
		"\7p\2\2\u00cf\u00d0\7c\2\2\u00d0\u00d1\7o\2\2\u00d1\u00d2\7g\2\2\u00d2"+
		"\u00d3\7u\2\2\u00d3\u00d4\7r\2\2\u00d4\u00d5\7c\2\2\u00d5\u00d6\7e\2\2"+
		"\u00d6\u00d7\7g\2\2\u00d7<\3\2\2\2\u00d8\u00d9\7n\2\2\u00d9\u00da\7g\2"+
		"\2\u00da\u00db\7v\2\2\u00db>\3\2\2\2\u00dc\u00dd\7q\2\2\u00dd\u00de\7"+
		"r\2\2\u00de\u00df\7g\2\2\u00df\u00e0\7t\2\2\u00e0\u00e1\7c\2\2\u00e1\u00e2"+
		"\7v\2\2\u00e2\u00e3\7q\2\2\u00e3\u00e4\7t\2\2\u00e4@\3\2\2\2\u00e5\u00e6"+
		"\7w\2\2\u00e6\u00e7\7u\2\2\u00e7\u00e8\7k\2\2\u00e8\u00e9\7p\2\2\u00e9"+
		"\u00ea\7i\2\2\u00eaB\3\2\2\2\u00eb\u00ec\7t\2\2\u00ec\u00ed\7g\2\2\u00ed"+
		"\u00ee\7v\2\2\u00ee\u00ef\7w\2\2\u00ef\u00f0\7t\2\2\u00f0\u00f1\7p\2\2"+
		"\u00f1D\3\2\2\2\u00f2\u00f3\7f\2\2\u00f3\u00f4\7g\2\2\u00f4\u00f5\7n\2"+
		"\2\u00f5\u00f6\7g\2\2\u00f6\u00f7\7i\2\2\u00f7\u00f8\7c\2\2\u00f8\u00f9"+
		"\7v\2\2\u00f9\u00fa\7g\2\2\u00faF\3\2\2\2\u00fb\u00fc\7g\2\2\u00fc\u00fd"+
		"\7z\2\2\u00fd\u00fe\7v\2\2\u00fe\u00ff\7g\2\2\u00ff\u0100\7t\2\2\u0100"+
		"\u0101\7p\2\2\u0101H\3\2\2\2\u0102\u0103\7r\2\2\u0103\u0104\7c\2\2\u0104"+
		"\u0105\7e\2\2\u0105\u0106\7m\2\2\u0106\u0107\7g\2\2\u0107\u0108\7f\2\2"+
		"\u0108J\3\2\2\2\u0109\u010a\7u\2\2\u010a\u010b\7v\2\2\u010b\u010c\7t\2"+
		"\2\u010c\u010d\7w\2\2\u010d\u010e\7e\2\2\u010e\u010f\7v\2\2\u010fL\3\2"+
		"\2\2\u0110\u0111\7k\2\2\u0111\u0112\7o\2\2\u0112\u0113\7r\2\2\u0113\u0114"+
		"\7n\2\2\u0114N\3\2\2\2\u0115\u0116\7v\2\2\u0116\u0117\7t\2\2\u0117\u0118"+
		"\7w\2\2\u0118\u0119\7g\2\2\u0119P\3\2\2\2\u011a\u011b\7h\2\2\u011b\u011c"+
		"\7c\2\2\u011c\u011d\7n\2\2\u011d\u011e\7u\2\2\u011e\u011f\7g\2\2\u011f"+
		"R\3\2\2\2\u0120\u0121\7k\2\2\u0121\u0122\7o\2\2\u0122\u0123\7r\2\2\u0123"+
		"\u0124\7q\2\2\u0124\u0125\7t\2\2\u0125\u0126\7v\2\2\u0126T\3\2\2\2\u0127"+
		"\u0128\7k\2\2\u0128\u0129\7h\2\2\u0129V\3\2\2\2\u012a\u012b\7g\2\2\u012b"+
		"\u012c\7n\2\2\u012c\u012d\7u\2\2\u012d\u012e\7g\2\2\u012eX\3\2\2\2\u012f"+
		"\u0130\7y\2\2\u0130\u0131\7j\2\2\u0131\u0132\7k\2\2\u0132\u0133\7n\2\2"+
		"\u0133\u0134\7g\2\2\u0134Z\3\2\2\2\u0135\u0136\7f\2\2\u0136\u0137\7q\2"+
		"\2\u0137\\\3\2\2\2\u0138\u013c\5\25\13\2\u0139\u013c\5\27\f\2\u013a\u013c"+
		"\5\31\r\2\u013b\u0138\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013a\3\2\2\2"+
		"\u013c^\3\2\2\2\u013d\u0140\5\21\t\2\u013e\u0140\5\23\n\2\u013f\u013d"+
		"\3\2\2\2\u013f\u013e\3\2\2\2\u0140`\3\2\2\2\u0141\u0148\5\5\3\2\u0142"+
		"\u0148\5\7\4\2\u0143\u0148\5\t\5\2\u0144\u0148\5\13\6\2\u0145\u0148\5"+
		"\r\7\2\u0146\u0148\5\17\b\2\u0147\u0141\3\2\2\2\u0147\u0142\3\2\2\2\u0147"+
		"\u0143\3\2\2\2\u0147\u0144\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0146\3\2"+
		"\2\2\u0148b\3\2\2\2\u0149\u0150\5\5\3\2\u014a\u0150\5\7\4\2\u014b\u0150"+
		"\5\t\5\2\u014c\u0150\5\13\6\2\u014d\u0150\5\r\7\2\u014e\u0150\5\17\b\2"+
		"\u014f\u0149\3\2\2\2\u014f\u014a\3\2\2\2\u014f\u014b\3\2\2\2\u014f\u014c"+
		"\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u014e\3\2\2\2\u0150d\3\2\2\2\u0151"+
		"\u0155\t\2\2\2\u0152\u0154\t\3\2\2\u0153\u0152\3\2\2\2\u0154\u0157\3\2"+
		"\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156f\3\2\2\2\u0157\u0155"+
		"\3\2\2\2\u0158\u015c\n\4\2\2\u0159\u015a\7^\2\2\u015a\u015c\5m\67\2\u015b"+
		"\u0158\3\2\2\2\u015b\u0159\3\2\2\2\u015ch\3\2\2\2\u015d\u0161\n\5\2\2"+
		"\u015e\u015f\7^\2\2\u015f\u0161\5m\67\2\u0160\u015d\3\2\2\2\u0160\u015e"+
		"\3\2\2\2\u0161j\3\2\2\2\u0162\u0163\n\6\2\2\u0163l\3\2\2\2\u0164\u0165"+
		"\5o8\2\u0165n\3\2\2\2\u0166\u0167\t\7\2\2\u0167p\3\2\2\2\u0168\u0169\t"+
		"\b\2\2\u0169r\3\2\2\2\u016a\u016b\t\t\2\2\u016bt\3\2\2\2\u016c\u016d\t"+
		"\n\2\2\u016dv\3\2\2\2\u016e\u016f\t\13\2\2\u016fx\3\2\2\2\u0170\u0171"+
		"\t\f\2\2\u0171z\3\2\2\2\u0172\u0173\t\r\2\2\u0173|\3\2\2\2\u0174\u017b"+
		"\5q9\2\u0175\u017b\5s:\2\u0176\u017b\5u;\2\u0177\u017b\5w<\2\u0178\u017b"+
		"\5y=\2\u0179\u017b\5{>\2\u017a\u0174\3\2\2\2\u017a\u0175\3\2\2\2\u017a"+
		"\u0176\3\2\2\2\u017a\u0177\3\2\2\2\u017a\u0178\3\2\2\2\u017a\u0179\3\2"+
		"\2\2\u017b~\3\2\2\2\u017c\u0180\7$\2\2\u017d\u017f\5i\65\2\u017e\u017d"+
		"\3\2\2\2\u017f\u0182\3\2\2\2\u0180\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181"+
		"\u0183\3\2\2\2\u0182\u0180\3\2\2\2\u0183\u0184\7$\2\2\u0184\u0080\3\2"+
		"\2\2\u0185\u0186\7)\2\2\u0186\u0187\5g\64\2\u0187\u0188\7)\2\2\u0188\u0082"+
		"\3\2\2\2\u0189\u018b\5\u0085C\2\u018a\u0189\3\2\2\2\u018a\u018b\3\2\2"+
		"\2\u018b\u018c\3\2\2\2\u018c\u018e\7\60\2\2\u018d\u018f\t\16\2\2\u018e"+
		"\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u018e\3\2\2\2\u0190\u0191\3\2"+
		"\2\2\u0191\u0084\3\2\2\2\u0192\u01a6\7\62\2\2\u0193\u0197\t\17\2\2\u0194"+
		"\u0196\t\16\2\2\u0195\u0194\3\2\2\2\u0196\u0199\3\2\2\2\u0197\u0195\3"+
		"\2\2\2\u0197\u0198\3\2\2\2\u0198\u01a6\3\2\2\2\u0199\u0197\3\2\2\2\u019a"+
		"\u019b\7\62\2\2\u019b\u019c\t\20\2\2\u019c\u01a6\t\21\2\2\u019d\u019e"+
		"\7\62\2\2\u019e\u019f\7d\2\2\u019f\u01a1\3\2\2\2\u01a0\u01a2\t\22\2\2"+
		"\u01a1\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a3\u01a4"+
		"\3\2\2\2\u01a4\u01a6\3\2\2\2\u01a5\u0192\3\2\2\2\u01a5\u0193\3\2\2\2\u01a5"+
		"\u019a\3\2\2\2\u01a5\u019d\3\2\2\2\u01a6\u0086\3\2\2\2\u01a7\u01aa\5\u0083"+
		"B\2\u01a8\u01aa\5\u0085C\2\u01a9\u01a7\3\2\2\2\u01a9\u01a8\3\2\2\2\u01aa"+
		"\u0088\3\2\2\2\u01ab\u01ac\7\61\2\2\u01ac\u01ad\7,\2\2\u01ad\u01b1\3\2"+
		"\2\2\u01ae\u01b0\13\2\2\2\u01af\u01ae\3\2\2\2\u01b0\u01b3\3\2\2\2\u01b1"+
		"\u01b2\3\2\2\2\u01b1\u01af\3\2\2\2\u01b2\u01b4\3\2\2\2\u01b3\u01b1\3\2"+
		"\2\2\u01b4\u01b5\7,\2\2\u01b5\u01b6\7\61\2\2\u01b6\u01b7\3\2\2\2\u01b7"+
		"\u01b8\bE\2\2\u01b8\u008a\3\2\2\2\u01b9\u01ba\7\61\2\2\u01ba\u01bb\7\61"+
		"\2\2\u01bb\u01bf\3\2\2\2\u01bc\u01be\n\23\2\2\u01bd\u01bc\3\2\2\2\u01be"+
		"\u01c1\3\2\2\2\u01bf\u01bd\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c2\3\2"+
		"\2\2\u01c1\u01bf\3\2\2\2\u01c2\u01c3\bF\2\2\u01c3\u008c\3\2\2\2\u01c4"+
		"\u01c6\t\24\2\2\u01c5\u01c4\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c5\3"+
		"\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01ca\bG\3\2\u01ca"+
		"\u008e\3\2\2\2\25\2\u013b\u013f\u0147\u014f\u0155\u015b\u0160\u017a\u0180"+
		"\u018a\u0190\u0197\u01a3\u01a5\u01a9\u01b1\u01bf\u01c7\4\2\3\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}