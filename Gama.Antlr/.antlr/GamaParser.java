// Generated from /home/yahya/source/Gama/Gama.Antlr/Gama.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GamaParser extends Parser {
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
	public static final int
		RULE_program = 0, RULE_namespace = 1, RULE_topLevelStatement = 2, RULE_structLevelStatement = 3, 
		RULE_statement = 4, RULE_stmtVarDef = 5, RULE_stmtAssign = 6, RULE_stmtIf = 7, 
		RULE_stmtReturn = 8, RULE_stmtWhile = 9, RULE_stmtFnCall = 10, RULE_topLevelBlock = 11, 
		RULE_block = 12, RULE_expr = 13, RULE_exprList = 14, RULE_topLevelUsingNamespace = 15, 
		RULE_topLevelDelegate = 16, RULE_topLevelExternDef = 17, RULE_topLevelFuncDef = 18, 
		RULE_topLevelStructDef = 19, RULE_topLevelImpl = 20, RULE_symbolTypePairList = 21, 
		RULE_symbolTypePair = 22, RULE_ellipsis = 23, RULE_funcAttr = 24, RULE_symbolList = 25, 
		RULE_opMul = 26, RULE_opAdd = 27, RULE_opComp = 28, RULE_opLogic = 29, 
		RULE_fqtnRoot = 30, RULE_fqtn = 31, RULE_fqtnList = 32, RULE_typeList = 33, 
		RULE_typeName = 34, RULE_ptr = 35;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "namespace", "topLevelStatement", "structLevelStatement", 
			"statement", "stmtVarDef", "stmtAssign", "stmtIf", "stmtReturn", "stmtWhile", 
			"stmtFnCall", "topLevelBlock", "block", "expr", "exprList", "topLevelUsingNamespace", 
			"topLevelDelegate", "topLevelExternDef", "topLevelFuncDef", "topLevelStructDef", 
			"topLevelImpl", "symbolTypePairList", "symbolTypePair", "ellipsis", "funcAttr", 
			"symbolList", "opMul", "opAdd", "opComp", "opLogic", "fqtnRoot", "fqtn", 
			"fqtnList", "typeList", "typeName", "ptr"
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

	@Override
	public String getGrammarFileName() { return "Gama.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GamaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(GamaParser.EOF, 0); }
		public List<NamespaceContext> namespace() {
			return getRuleContexts(NamespaceContext.class);
		}
		public NamespaceContext namespace(int i) {
			return getRuleContext(NamespaceContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Namespace || _la==Import) {
				{
				{
				setState(72);
				namespace();
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(78);
			match(EOF);
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

	public static class NamespaceContext extends ParserRuleContext {
		public NamespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace; }
	 
		public NamespaceContext() { }
		public void copyFrom(NamespaceContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NamespaceRootStartContext extends NamespaceContext {
		public TerminalNode Namespace() { return getToken(GamaParser.Namespace, 0); }
		public FqtnRootContext fqtnRoot() {
			return getRuleContext(FqtnRootContext.class,0);
		}
		public TopLevelBlockContext topLevelBlock() {
			return getRuleContext(TopLevelBlockContext.class,0);
		}
		public NamespaceRootStartContext(NamespaceContext ctx) { copyFrom(ctx); }
	}
	public static class ImportStmtContext extends NamespaceContext {
		public TerminalNode Import() { return getToken(GamaParser.Import, 0); }
		public TerminalNode StringLiteral() { return getToken(GamaParser.StringLiteral, 0); }
		public TerminalNode SC() { return getToken(GamaParser.SC, 0); }
		public ImportStmtContext(NamespaceContext ctx) { copyFrom(ctx); }
	}
	public static class NamespaceRootContext extends NamespaceContext {
		public TerminalNode Namespace() { return getToken(GamaParser.Namespace, 0); }
		public TopLevelBlockContext topLevelBlock() {
			return getRuleContext(TopLevelBlockContext.class,0);
		}
		public NamespaceRootContext(NamespaceContext ctx) { copyFrom(ctx); }
	}
	public static class NamespaceDefaultContext extends NamespaceContext {
		public TerminalNode Namespace() { return getToken(GamaParser.Namespace, 0); }
		public FqtnContext fqtn() {
			return getRuleContext(FqtnContext.class,0);
		}
		public TopLevelBlockContext topLevelBlock() {
			return getRuleContext(TopLevelBlockContext.class,0);
		}
		public NamespaceDefaultContext(NamespaceContext ctx) { copyFrom(ctx); }
	}

	public final NamespaceContext namespace() throws RecognitionException {
		NamespaceContext _localctx = new NamespaceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_namespace);
		try {
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new NamespaceDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				match(Namespace);
				setState(81);
				fqtn();
				setState(82);
				topLevelBlock();
				}
				break;
			case 2:
				_localctx = new NamespaceRootStartContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				match(Namespace);
				setState(85);
				fqtnRoot();
				setState(86);
				topLevelBlock();
				}
				break;
			case 3:
				_localctx = new NamespaceRootContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(88);
				match(Namespace);
				setState(89);
				topLevelBlock();
				}
				break;
			case 4:
				_localctx = new ImportStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(90);
				match(Import);
				setState(91);
				match(StringLiteral);
				setState(92);
				match(SC);
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

	public static class TopLevelStatementContext extends ParserRuleContext {
		public TopLevelUsingNamespaceContext topLevelUsingNamespace() {
			return getRuleContext(TopLevelUsingNamespaceContext.class,0);
		}
		public TerminalNode SC() { return getToken(GamaParser.SC, 0); }
		public TopLevelDelegateContext topLevelDelegate() {
			return getRuleContext(TopLevelDelegateContext.class,0);
		}
		public TopLevelExternDefContext topLevelExternDef() {
			return getRuleContext(TopLevelExternDefContext.class,0);
		}
		public TopLevelFuncDefContext topLevelFuncDef() {
			return getRuleContext(TopLevelFuncDefContext.class,0);
		}
		public TopLevelStructDefContext topLevelStructDef() {
			return getRuleContext(TopLevelStructDefContext.class,0);
		}
		public TopLevelImplContext topLevelImpl() {
			return getRuleContext(TopLevelImplContext.class,0);
		}
		public TopLevelStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topLevelStatement; }
	}

	public final TopLevelStatementContext topLevelStatement() throws RecognitionException {
		TopLevelStatementContext _localctx = new TopLevelStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_topLevelStatement);
		try {
			setState(107);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Using:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				topLevelUsingNamespace();
				setState(96);
				match(SC);
				}
				break;
			case Delegate:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				topLevelDelegate();
				setState(99);
				match(SC);
				}
				break;
			case Extern:
				enterOuterAlt(_localctx, 3);
				{
				setState(101);
				topLevelExternDef();
				setState(102);
				match(SC);
				}
				break;
			case LQ:
			case Symbol:
				enterOuterAlt(_localctx, 4);
				{
				setState(104);
				topLevelFuncDef();
				}
				break;
			case Packed:
			case Struct:
				enterOuterAlt(_localctx, 5);
				{
				setState(105);
				topLevelStructDef();
				}
				break;
			case Impl:
				enterOuterAlt(_localctx, 6);
				{
				setState(106);
				topLevelImpl();
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

	public static class StructLevelStatementContext extends ParserRuleContext {
		public StructLevelStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structLevelStatement; }
	 
		public StructLevelStatementContext() { }
		public void copyFrom(StructLevelStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StructLevelDelegateContext extends StructLevelStatementContext {
		public TopLevelDelegateContext topLevelDelegate() {
			return getRuleContext(TopLevelDelegateContext.class,0);
		}
		public TerminalNode SC() { return getToken(GamaParser.SC, 0); }
		public StructLevelDelegateContext(StructLevelStatementContext ctx) { copyFrom(ctx); }
	}
	public static class StructLevelMethodContext extends StructLevelStatementContext {
		public TopLevelFuncDefContext topLevelFuncDef() {
			return getRuleContext(TopLevelFuncDefContext.class,0);
		}
		public StructLevelMethodContext(StructLevelStatementContext ctx) { copyFrom(ctx); }
	}

	public final StructLevelStatementContext structLevelStatement() throws RecognitionException {
		StructLevelStatementContext _localctx = new StructLevelStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_structLevelStatement);
		try {
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Delegate:
				_localctx = new StructLevelDelegateContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				topLevelDelegate();
				setState(110);
				match(SC);
				}
				break;
			case LQ:
			case Symbol:
				_localctx = new StructLevelMethodContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				topLevelFuncDef();
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

	public static class StatementContext extends ParserRuleContext {
		public StmtVarDefContext stmtVarDef() {
			return getRuleContext(StmtVarDefContext.class,0);
		}
		public TerminalNode SC() { return getToken(GamaParser.SC, 0); }
		public StmtAssignContext stmtAssign() {
			return getRuleContext(StmtAssignContext.class,0);
		}
		public StmtIfContext stmtIf() {
			return getRuleContext(StmtIfContext.class,0);
		}
		public StmtWhileContext stmtWhile() {
			return getRuleContext(StmtWhileContext.class,0);
		}
		public StmtFnCallContext stmtFnCall() {
			return getRuleContext(StmtFnCallContext.class,0);
		}
		public StmtReturnContext stmtReturn() {
			return getRuleContext(StmtReturnContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statement);
		try {
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				stmtVarDef();
				setState(116);
				match(SC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				stmtAssign();
				setState(119);
				match(SC);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(121);
				stmtIf();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(122);
				stmtWhile();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(123);
				stmtFnCall();
				setState(124);
				match(SC);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(126);
				stmtReturn();
				setState(127);
				match(SC);
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

	public static class StmtVarDefContext extends ParserRuleContext {
		public StmtVarDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmtVarDef; }
	 
		public StmtVarDefContext() { }
		public void copyFrom(StmtVarDefContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StmtVarDefNullContext extends StmtVarDefContext {
		public TerminalNode Let() { return getToken(GamaParser.Let, 0); }
		public TerminalNode Symbol() { return getToken(GamaParser.Symbol, 0); }
		public TerminalNode Colon() { return getToken(GamaParser.Colon, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public StmtVarDefNullContext(StmtVarDefContext ctx) { copyFrom(ctx); }
	}
	public static class StmtVarDefBaseContext extends StmtVarDefContext {
		public TerminalNode Let() { return getToken(GamaParser.Let, 0); }
		public TerminalNode Symbol() { return getToken(GamaParser.Symbol, 0); }
		public TerminalNode Equals() { return getToken(GamaParser.Equals, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StmtVarDefBaseContext(StmtVarDefContext ctx) { copyFrom(ctx); }
	}
	public static class StmtVarDefFullContext extends StmtVarDefContext {
		public TerminalNode Let() { return getToken(GamaParser.Let, 0); }
		public TerminalNode Symbol() { return getToken(GamaParser.Symbol, 0); }
		public TerminalNode Colon() { return getToken(GamaParser.Colon, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode Equals() { return getToken(GamaParser.Equals, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StmtVarDefFullContext(StmtVarDefContext ctx) { copyFrom(ctx); }
	}

	public final StmtVarDefContext stmtVarDef() throws RecognitionException {
		StmtVarDefContext _localctx = new StmtVarDefContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_stmtVarDef);
		try {
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new StmtVarDefBaseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				match(Let);
				setState(132);
				match(Symbol);
				setState(133);
				match(Equals);
				setState(134);
				expr(0);
				}
				break;
			case 2:
				_localctx = new StmtVarDefFullContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				match(Let);
				setState(136);
				match(Symbol);
				setState(137);
				match(Colon);
				setState(138);
				typeName();
				setState(139);
				match(Equals);
				setState(140);
				expr(0);
				}
				break;
			case 3:
				_localctx = new StmtVarDefNullContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(142);
				match(Let);
				setState(143);
				match(Symbol);
				setState(144);
				match(Colon);
				setState(145);
				typeName();
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

	public static class StmtAssignContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode Equals() { return getToken(GamaParser.Equals, 0); }
		public StmtAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmtAssign; }
	}

	public final StmtAssignContext stmtAssign() throws RecognitionException {
		StmtAssignContext _localctx = new StmtAssignContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_stmtAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			expr(0);
			setState(149);
			match(Equals);
			setState(150);
			expr(0);
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

	public static class StmtIfContext extends ParserRuleContext {
		public StmtIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmtIf; }
	 
		public StmtIfContext() { }
		public void copyFrom(StmtIfContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StmtIfElseIfContext extends StmtIfContext {
		public List<TerminalNode> If() { return getTokens(GamaParser.If); }
		public TerminalNode If(int i) {
			return getToken(GamaParser.If, i);
		}
		public List<TerminalNode> LP() { return getTokens(GamaParser.LP); }
		public TerminalNode LP(int i) {
			return getToken(GamaParser.LP, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> RP() { return getTokens(GamaParser.RP); }
		public TerminalNode RP(int i) {
			return getToken(GamaParser.RP, i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<TerminalNode> Else() { return getTokens(GamaParser.Else); }
		public TerminalNode Else(int i) {
			return getToken(GamaParser.Else, i);
		}
		public StmtIfElseIfContext(StmtIfContext ctx) { copyFrom(ctx); }
	}
	public static class StmtIfBaseContext extends StmtIfContext {
		public TerminalNode If() { return getToken(GamaParser.If, 0); }
		public TerminalNode LP() { return getToken(GamaParser.LP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RP() { return getToken(GamaParser.RP, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StmtIfBaseContext(StmtIfContext ctx) { copyFrom(ctx); }
	}
	public static class StmtIfElseIfElseContext extends StmtIfContext {
		public List<TerminalNode> If() { return getTokens(GamaParser.If); }
		public TerminalNode If(int i) {
			return getToken(GamaParser.If, i);
		}
		public List<TerminalNode> LP() { return getTokens(GamaParser.LP); }
		public TerminalNode LP(int i) {
			return getToken(GamaParser.LP, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> RP() { return getTokens(GamaParser.RP); }
		public TerminalNode RP(int i) {
			return getToken(GamaParser.RP, i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<TerminalNode> Else() { return getTokens(GamaParser.Else); }
		public TerminalNode Else(int i) {
			return getToken(GamaParser.Else, i);
		}
		public StmtIfElseIfElseContext(StmtIfContext ctx) { copyFrom(ctx); }
	}
	public static class StmtIfElseContext extends StmtIfContext {
		public TerminalNode If() { return getToken(GamaParser.If, 0); }
		public TerminalNode LP() { return getToken(GamaParser.LP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RP() { return getToken(GamaParser.RP, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode Else() { return getToken(GamaParser.Else, 0); }
		public StmtIfElseContext(StmtIfContext ctx) { copyFrom(ctx); }
	}

	public final StmtIfContext stmtIf() throws RecognitionException {
		StmtIfContext _localctx = new StmtIfContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_stmtIf);
		int _la;
		try {
			int _alt;
			setState(201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new StmtIfBaseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				match(If);
				setState(153);
				match(LP);
				setState(154);
				expr(0);
				setState(155);
				match(RP);
				setState(156);
				block();
				}
				break;
			case 2:
				_localctx = new StmtIfElseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				match(If);
				setState(159);
				match(LP);
				setState(160);
				expr(0);
				setState(161);
				match(RP);
				setState(162);
				block();
				setState(163);
				match(Else);
				setState(164);
				block();
				}
				break;
			case 3:
				_localctx = new StmtIfElseIfContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(166);
				match(If);
				setState(167);
				match(LP);
				setState(168);
				expr(0);
				setState(169);
				match(RP);
				setState(170);
				block();
				setState(178); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(171);
					match(Else);
					setState(172);
					match(If);
					setState(173);
					match(LP);
					setState(174);
					expr(0);
					setState(175);
					match(RP);
					setState(176);
					block();
					}
					}
					setState(180); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Else );
				}
				break;
			case 4:
				_localctx = new StmtIfElseIfElseContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(182);
				match(If);
				setState(183);
				match(LP);
				setState(184);
				expr(0);
				setState(185);
				match(RP);
				setState(186);
				block();
				setState(194); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(187);
						match(Else);
						setState(188);
						match(If);
						setState(189);
						match(LP);
						setState(190);
						expr(0);
						setState(191);
						match(RP);
						setState(192);
						block();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(196); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(198);
				match(Else);
				setState(199);
				block();
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

	public static class StmtReturnContext extends ParserRuleContext {
		public StmtReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmtReturn; }
	 
		public StmtReturnContext() { }
		public void copyFrom(StmtReturnContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StmtReturnVoidContext extends StmtReturnContext {
		public TerminalNode Return() { return getToken(GamaParser.Return, 0); }
		public StmtReturnVoidContext(StmtReturnContext ctx) { copyFrom(ctx); }
	}
	public static class StmtReturnValueContext extends StmtReturnContext {
		public TerminalNode Return() { return getToken(GamaParser.Return, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StmtReturnValueContext(StmtReturnContext ctx) { copyFrom(ctx); }
	}

	public final StmtReturnContext stmtReturn() throws RecognitionException {
		StmtReturnContext _localctx = new StmtReturnContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_stmtReturn);
		try {
			setState(206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new StmtReturnVoidContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				match(Return);
				}
				break;
			case 2:
				_localctx = new StmtReturnValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				match(Return);
				setState(205);
				expr(0);
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

	public static class StmtWhileContext extends ParserRuleContext {
		public StmtWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmtWhile; }
	 
		public StmtWhileContext() { }
		public void copyFrom(StmtWhileContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StmtDoWhileContext extends StmtWhileContext {
		public TerminalNode Do() { return getToken(GamaParser.Do, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode While() { return getToken(GamaParser.While, 0); }
		public TerminalNode LP() { return getToken(GamaParser.LP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RP() { return getToken(GamaParser.RP, 0); }
		public StmtDoWhileContext(StmtWhileContext ctx) { copyFrom(ctx); }
	}
	public static class StmtWhileBaseContext extends StmtWhileContext {
		public TerminalNode While() { return getToken(GamaParser.While, 0); }
		public TerminalNode LP() { return getToken(GamaParser.LP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RP() { return getToken(GamaParser.RP, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StmtWhileBaseContext(StmtWhileContext ctx) { copyFrom(ctx); }
	}

	public final StmtWhileContext stmtWhile() throws RecognitionException {
		StmtWhileContext _localctx = new StmtWhileContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_stmtWhile);
		try {
			setState(221);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case While:
				_localctx = new StmtWhileBaseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				match(While);
				setState(209);
				match(LP);
				setState(210);
				expr(0);
				setState(211);
				match(RP);
				setState(212);
				block();
				}
				break;
			case Do:
				_localctx = new StmtDoWhileContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(214);
				match(Do);
				setState(215);
				block();
				setState(216);
				match(While);
				setState(217);
				match(LP);
				setState(218);
				expr(0);
				setState(219);
				match(RP);
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

	public static class StmtFnCallContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode LP() { return getToken(GamaParser.LP, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public TerminalNode RP() { return getToken(GamaParser.RP, 0); }
		public StmtFnCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmtFnCall; }
	}

	public final StmtFnCallContext stmtFnCall() throws RecognitionException {
		StmtFnCallContext _localctx = new StmtFnCallContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_stmtFnCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			expr(0);
			setState(224);
			match(LP);
			setState(225);
			exprList();
			setState(226);
			match(RP);
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

	public static class TopLevelBlockContext extends ParserRuleContext {
		public TerminalNode LB() { return getToken(GamaParser.LB, 0); }
		public TerminalNode RB() { return getToken(GamaParser.RB, 0); }
		public List<TopLevelStatementContext> topLevelStatement() {
			return getRuleContexts(TopLevelStatementContext.class);
		}
		public TopLevelStatementContext topLevelStatement(int i) {
			return getRuleContext(TopLevelStatementContext.class,i);
		}
		public TopLevelBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topLevelBlock; }
	}

	public final TopLevelBlockContext topLevelBlock() throws RecognitionException {
		TopLevelBlockContext _localctx = new TopLevelBlockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_topLevelBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(LB);
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LQ) | (1L << Using) | (1L << Delegate) | (1L << Extern) | (1L << Packed) | (1L << Struct) | (1L << Impl) | (1L << Symbol))) != 0)) {
				{
				{
				setState(229);
				topLevelStatement();
				}
				}
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(235);
			match(RB);
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LB() { return getToken(GamaParser.LB, 0); }
		public TerminalNode RB() { return getToken(GamaParser.RB, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(LB);
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << LP) | (1L << AND) | (1L << Let) | (1L << Return) | (1L << True) | (1L << False) | (1L << If) | (1L << While) | (1L << Do) | (1L << Symbol) | (1L << StringLiteral) | (1L << CharLiteral) | (1L << FloatingLiteral) | (1L << IntegerLiteral))) != 0)) {
				{
				{
				setState(238);
				statement();
				}
				}
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(244);
			match(RB);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprOpMulContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OpMulContext opMul() {
			return getRuleContext(OpMulContext.class,0);
		}
		public ExprOpMulContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprLiteralStringContext extends ExprContext {
		public TerminalNode StringLiteral() { return getToken(GamaParser.StringLiteral, 0); }
		public ExprLiteralStringContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprIndexContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode LQ() { return getToken(GamaParser.LQ, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public TerminalNode RQ() { return getToken(GamaParser.RQ, 0); }
		public ExprIndexContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprOpAddContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OpAddContext opAdd() {
			return getRuleContext(OpAddContext.class,0);
		}
		public ExprOpAddContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprOpCompContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OpCompContext opComp() {
			return getRuleContext(OpCompContext.class,0);
		}
		public ExprOpCompContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprParenthesisContext extends ExprContext {
		public TerminalNode LP() { return getToken(GamaParser.LP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RP() { return getToken(GamaParser.RP, 0); }
		public ExprParenthesisContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprPointerLoadContext extends ExprContext {
		public TerminalNode MUL() { return getToken(GamaParser.MUL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprPointerLoadContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprCallContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode LP() { return getToken(GamaParser.LP, 0); }
		public TerminalNode RP() { return getToken(GamaParser.RP, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public ExprCallContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprLiteralIntegerContext extends ExprContext {
		public TerminalNode IntegerLiteral() { return getToken(GamaParser.IntegerLiteral, 0); }
		public ExprLiteralIntegerContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprLiteralBooleanContext extends ExprContext {
		public TerminalNode True() { return getToken(GamaParser.True, 0); }
		public TerminalNode False() { return getToken(GamaParser.False, 0); }
		public ExprLiteralBooleanContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprLiteralCharContext extends ExprContext {
		public TerminalNode CharLiteral() { return getToken(GamaParser.CharLiteral, 0); }
		public ExprLiteralCharContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprFQMBContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> Period() { return getTokens(GamaParser.Period); }
		public TerminalNode Period(int i) {
			return getToken(GamaParser.Period, i);
		}
		public List<TerminalNode> Symbol() { return getTokens(GamaParser.Symbol); }
		public TerminalNode Symbol(int i) {
			return getToken(GamaParser.Symbol, i);
		}
		public ExprFQMBContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprLiteralFloatingContext extends ExprContext {
		public TerminalNode FloatingLiteral() { return getToken(GamaParser.FloatingLiteral, 0); }
		public ExprLiteralFloatingContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprFQTNContext extends ExprContext {
		public FqtnContext fqtn() {
			return getRuleContext(FqtnContext.class,0);
		}
		public ExprFQTNContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprAddressOfContext extends ExprContext {
		public TerminalNode AND() { return getToken(GamaParser.AND, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprAddressOfContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprOpLogicContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OpLogicContext opLogic() {
			return getRuleContext(OpLogicContext.class,0);
		}
		public ExprOpLogicContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LP:
				{
				_localctx = new ExprParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(247);
				match(LP);
				setState(248);
				expr(0);
				setState(249);
				match(RP);
				}
				break;
			case AND:
				{
				_localctx = new ExprAddressOfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(251);
				match(AND);
				setState(252);
				expr(15);
				}
				break;
			case MUL:
				{
				_localctx = new ExprPointerLoadContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(253);
				match(MUL);
				setState(254);
				expr(14);
				}
				break;
			case IntegerLiteral:
				{
				_localctx = new ExprLiteralIntegerContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(255);
				match(IntegerLiteral);
				}
				break;
			case FloatingLiteral:
				{
				_localctx = new ExprLiteralFloatingContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(256);
				match(FloatingLiteral);
				}
				break;
			case True:
			case False:
				{
				_localctx = new ExprLiteralBooleanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(257);
				_la = _input.LA(1);
				if ( !(_la==True || _la==False) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case CharLiteral:
				{
				_localctx = new ExprLiteralCharContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(258);
				match(CharLiteral);
				}
				break;
			case StringLiteral:
				{
				_localctx = new ExprLiteralStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(259);
				match(StringLiteral);
				}
				break;
			case Symbol:
				{
				_localctx = new ExprFQTNContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(260);
				fqtn();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(299);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(297);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new ExprOpMulContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(263);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(264);
						opMul();
						setState(265);
						expr(5);
						}
						break;
					case 2:
						{
						_localctx = new ExprOpAddContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(267);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(268);
						opAdd();
						setState(269);
						expr(4);
						}
						break;
					case 3:
						{
						_localctx = new ExprOpCompContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(271);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(272);
						opComp();
						setState(273);
						expr(3);
						}
						break;
					case 4:
						{
						_localctx = new ExprOpLogicContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(275);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(276);
						opLogic();
						setState(277);
						expr(2);
						}
						break;
					case 5:
						{
						_localctx = new ExprCallContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(279);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(280);
						match(LP);
						setState(282);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << LP) | (1L << AND) | (1L << True) | (1L << False) | (1L << Symbol) | (1L << StringLiteral) | (1L << CharLiteral) | (1L << FloatingLiteral) | (1L << IntegerLiteral))) != 0)) {
							{
							setState(281);
							exprList();
							}
						}

						setState(284);
						match(RP);
						}
						break;
					case 6:
						{
						_localctx = new ExprIndexContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(285);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(286);
						match(LQ);
						setState(287);
						exprList();
						setState(288);
						match(RQ);
						}
						break;
					case 7:
						{
						_localctx = new ExprFQMBContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(290);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(293); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(291);
								match(Period);
								setState(292);
								match(Symbol);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(295); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					}
					} 
				}
				setState(301);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	public static class ExprListContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(GamaParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(GamaParser.Comma, i);
		}
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_exprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			expr(0);
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(303);
				match(Comma);
				setState(304);
				expr(0);
				}
				}
				setState(309);
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

	public static class TopLevelUsingNamespaceContext extends ParserRuleContext {
		public TerminalNode Using() { return getToken(GamaParser.Using, 0); }
		public TerminalNode Namespace() { return getToken(GamaParser.Namespace, 0); }
		public FqtnContext fqtn() {
			return getRuleContext(FqtnContext.class,0);
		}
		public TopLevelUsingNamespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topLevelUsingNamespace; }
	}

	public final TopLevelUsingNamespaceContext topLevelUsingNamespace() throws RecognitionException {
		TopLevelUsingNamespaceContext _localctx = new TopLevelUsingNamespaceContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_topLevelUsingNamespace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(Using);
			setState(311);
			match(Namespace);
			setState(312);
			fqtn();
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

	public static class TopLevelDelegateContext extends ParserRuleContext {
		public TerminalNode Delegate() { return getToken(GamaParser.Delegate, 0); }
		public TerminalNode Symbol() { return getToken(GamaParser.Symbol, 0); }
		public TerminalNode LP() { return getToken(GamaParser.LP, 0); }
		public TerminalNode RP() { return getToken(GamaParser.RP, 0); }
		public TerminalNode Colon() { return getToken(GamaParser.Colon, 0); }
		public FqtnContext fqtn() {
			return getRuleContext(FqtnContext.class,0);
		}
		public FqtnListContext fqtnList() {
			return getRuleContext(FqtnListContext.class,0);
		}
		public TopLevelDelegateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topLevelDelegate; }
	}

	public final TopLevelDelegateContext topLevelDelegate() throws RecognitionException {
		TopLevelDelegateContext _localctx = new TopLevelDelegateContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_topLevelDelegate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(Delegate);
			setState(315);
			match(Symbol);
			setState(316);
			match(LP);
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Symbol) {
				{
				setState(317);
				fqtnList();
				}
			}

			setState(320);
			match(RP);
			{
			setState(321);
			match(Colon);
			setState(322);
			fqtn();
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

	public static class TopLevelExternDefContext extends ParserRuleContext {
		public TerminalNode Extern() { return getToken(GamaParser.Extern, 0); }
		public TerminalNode Symbol() { return getToken(GamaParser.Symbol, 0); }
		public TerminalNode LP() { return getToken(GamaParser.LP, 0); }
		public TerminalNode RP() { return getToken(GamaParser.RP, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public EllipsisContext ellipsis() {
			return getRuleContext(EllipsisContext.class,0);
		}
		public TerminalNode Colon() { return getToken(GamaParser.Colon, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TopLevelExternDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topLevelExternDef; }
	}

	public final TopLevelExternDefContext topLevelExternDef() throws RecognitionException {
		TopLevelExternDefContext _localctx = new TopLevelExternDefContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_topLevelExternDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(Extern);
			setState(325);
			match(Symbol);
			setState(326);
			match(LP);
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Symbol) {
				{
				setState(327);
				typeList();
				}
			}

			setState(330);
			match(RP);
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(331);
				ellipsis();
				}
			}

			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(334);
				match(Colon);
				setState(335);
				typeName();
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

	public static class TopLevelFuncDefContext extends ParserRuleContext {
		public TerminalNode Symbol() { return getToken(GamaParser.Symbol, 0); }
		public TerminalNode LP() { return getToken(GamaParser.LP, 0); }
		public TerminalNode RP() { return getToken(GamaParser.RP, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FuncAttrContext funcAttr() {
			return getRuleContext(FuncAttrContext.class,0);
		}
		public SymbolTypePairListContext symbolTypePairList() {
			return getRuleContext(SymbolTypePairListContext.class,0);
		}
		public TerminalNode Colon() { return getToken(GamaParser.Colon, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TopLevelFuncDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topLevelFuncDef; }
	}

	public final TopLevelFuncDefContext topLevelFuncDef() throws RecognitionException {
		TopLevelFuncDefContext _localctx = new TopLevelFuncDefContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_topLevelFuncDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LQ) {
				{
				setState(338);
				funcAttr();
				}
			}

			setState(341);
			match(Symbol);
			setState(342);
			match(LP);
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Symbol) {
				{
				setState(343);
				symbolTypePairList();
				}
			}

			setState(346);
			match(RP);
			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(347);
				match(Colon);
				setState(348);
				typeName();
				}
			}

			setState(351);
			block();
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

	public static class TopLevelStructDefContext extends ParserRuleContext {
		public TerminalNode Struct() { return getToken(GamaParser.Struct, 0); }
		public TerminalNode Symbol() { return getToken(GamaParser.Symbol, 0); }
		public TerminalNode LB() { return getToken(GamaParser.LB, 0); }
		public TerminalNode RB() { return getToken(GamaParser.RB, 0); }
		public TerminalNode Packed() { return getToken(GamaParser.Packed, 0); }
		public SymbolTypePairListContext symbolTypePairList() {
			return getRuleContext(SymbolTypePairListContext.class,0);
		}
		public TopLevelStructDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topLevelStructDef; }
	}

	public final TopLevelStructDefContext topLevelStructDef() throws RecognitionException {
		TopLevelStructDefContext _localctx = new TopLevelStructDefContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_topLevelStructDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Packed) {
				{
				setState(353);
				match(Packed);
				}
			}

			setState(356);
			match(Struct);
			setState(357);
			match(Symbol);
			setState(358);
			match(LB);
			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Symbol) {
				{
				setState(359);
				symbolTypePairList();
				}
			}

			setState(362);
			match(RB);
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

	public static class TopLevelImplContext extends ParserRuleContext {
		public TerminalNode Impl() { return getToken(GamaParser.Impl, 0); }
		public FqtnContext fqtn() {
			return getRuleContext(FqtnContext.class,0);
		}
		public TerminalNode LB() { return getToken(GamaParser.LB, 0); }
		public TerminalNode RB() { return getToken(GamaParser.RB, 0); }
		public List<StructLevelStatementContext> structLevelStatement() {
			return getRuleContexts(StructLevelStatementContext.class);
		}
		public StructLevelStatementContext structLevelStatement(int i) {
			return getRuleContext(StructLevelStatementContext.class,i);
		}
		public TopLevelImplContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topLevelImpl; }
	}

	public final TopLevelImplContext topLevelImpl() throws RecognitionException {
		TopLevelImplContext _localctx = new TopLevelImplContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_topLevelImpl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			match(Impl);
			setState(365);
			fqtn();
			setState(366);
			match(LB);
			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LQ) | (1L << Delegate) | (1L << Symbol))) != 0)) {
				{
				{
				setState(367);
				structLevelStatement();
				}
				}
				setState(372);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(373);
			match(RB);
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

	public static class SymbolTypePairListContext extends ParserRuleContext {
		public List<SymbolTypePairContext> symbolTypePair() {
			return getRuleContexts(SymbolTypePairContext.class);
		}
		public SymbolTypePairContext symbolTypePair(int i) {
			return getRuleContext(SymbolTypePairContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(GamaParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(GamaParser.Comma, i);
		}
		public SymbolTypePairListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbolTypePairList; }
	}

	public final SymbolTypePairListContext symbolTypePairList() throws RecognitionException {
		SymbolTypePairListContext _localctx = new SymbolTypePairListContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_symbolTypePairList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			symbolTypePair();
			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(376);
				match(Comma);
				setState(377);
				symbolTypePair();
				}
				}
				setState(382);
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

	public static class SymbolTypePairContext extends ParserRuleContext {
		public TerminalNode Symbol() { return getToken(GamaParser.Symbol, 0); }
		public TerminalNode Colon() { return getToken(GamaParser.Colon, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public SymbolTypePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbolTypePair; }
	}

	public final SymbolTypePairContext symbolTypePair() throws RecognitionException {
		SymbolTypePairContext _localctx = new SymbolTypePairContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_symbolTypePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			match(Symbol);
			setState(384);
			match(Colon);
			setState(385);
			typeName();
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

	public static class EllipsisContext extends ParserRuleContext {
		public EllipsisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ellipsis; }
	}

	public final EllipsisContext ellipsis() throws RecognitionException {
		EllipsisContext _localctx = new EllipsisContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_ellipsis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			match(T__0);
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

	public static class FuncAttrContext extends ParserRuleContext {
		public TerminalNode LQ() { return getToken(GamaParser.LQ, 0); }
		public TerminalNode RQ() { return getToken(GamaParser.RQ, 0); }
		public List<TerminalNode> Symbol() { return getTokens(GamaParser.Symbol); }
		public TerminalNode Symbol(int i) {
			return getToken(GamaParser.Symbol, i);
		}
		public List<TerminalNode> LP() { return getTokens(GamaParser.LP); }
		public TerminalNode LP(int i) {
			return getToken(GamaParser.LP, i);
		}
		public List<SymbolListContext> symbolList() {
			return getRuleContexts(SymbolListContext.class);
		}
		public SymbolListContext symbolList(int i) {
			return getRuleContext(SymbolListContext.class,i);
		}
		public List<TerminalNode> RP() { return getTokens(GamaParser.RP); }
		public TerminalNode RP(int i) {
			return getToken(GamaParser.RP, i);
		}
		public FuncAttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcAttr; }
	}

	public final FuncAttrContext funcAttr() throws RecognitionException {
		FuncAttrContext _localctx = new FuncAttrContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_funcAttr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			match(LQ);
			setState(397); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(390);
				match(Symbol);
				setState(395);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP) {
					{
					setState(391);
					match(LP);
					setState(392);
					symbolList();
					setState(393);
					match(RP);
					}
				}

				}
				}
				setState(399); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Symbol );
			setState(401);
			match(RQ);
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

	public static class SymbolListContext extends ParserRuleContext {
		public List<TerminalNode> Symbol() { return getTokens(GamaParser.Symbol); }
		public TerminalNode Symbol(int i) {
			return getToken(GamaParser.Symbol, i);
		}
		public List<TerminalNode> Comma() { return getTokens(GamaParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(GamaParser.Comma, i);
		}
		public SymbolListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbolList; }
	}

	public final SymbolListContext symbolList() throws RecognitionException {
		SymbolListContext _localctx = new SymbolListContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_symbolList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			match(Symbol);
			setState(408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(404);
				match(Comma);
				setState(405);
				match(Symbol);
				}
				}
				setState(410);
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

	public static class OpMulContext extends ParserRuleContext {
		public TerminalNode MUL() { return getToken(GamaParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(GamaParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(GamaParser.MOD, 0); }
		public OpMulContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opMul; }
	}

	public final OpMulContext opMul() throws RecognitionException {
		OpMulContext _localctx = new OpMulContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_opMul);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
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

	public static class OpAddContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(GamaParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(GamaParser.SUB, 0); }
		public OpAddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opAdd; }
	}

	public final OpAddContext opAdd() throws RecognitionException {
		OpAddContext _localctx = new OpAddContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_opAdd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			_la = _input.LA(1);
			if ( !(_la==ADD || _la==SUB) ) {
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

	public static class OpCompContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(GamaParser.LT, 0); }
		public TerminalNode GT() { return getToken(GamaParser.GT, 0); }
		public TerminalNode LE() { return getToken(GamaParser.LE, 0); }
		public TerminalNode GE() { return getToken(GamaParser.GE, 0); }
		public TerminalNode EQ() { return getToken(GamaParser.EQ, 0); }
		public TerminalNode NE() { return getToken(GamaParser.NE, 0); }
		public OpCompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opComp; }
	}

	public final OpCompContext opComp() throws RecognitionException {
		OpCompContext _localctx = new OpCompContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_opComp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << GT) | (1L << LE) | (1L << GE) | (1L << EQ) | (1L << NE))) != 0)) ) {
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

	public static class OpLogicContext extends ParserRuleContext {
		public List<TerminalNode> AND() { return getTokens(GamaParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(GamaParser.AND, i);
		}
		public List<TerminalNode> OR() { return getTokens(GamaParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(GamaParser.OR, i);
		}
		public TerminalNode XOR() { return getToken(GamaParser.XOR, 0); }
		public OpLogicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opLogic; }
	}

	public final OpLogicContext opLogic() throws RecognitionException {
		OpLogicContext _localctx = new OpLogicContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_opLogic);
		try {
			setState(422);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(417);
				match(AND);
				setState(418);
				match(AND);
				}
				break;
			case OR:
				enterOuterAlt(_localctx, 2);
				{
				setState(419);
				match(OR);
				setState(420);
				match(OR);
				}
				break;
			case XOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(421);
				match(XOR);
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

	public static class FqtnRootContext extends ParserRuleContext {
		public List<TerminalNode> Symbol() { return getTokens(GamaParser.Symbol); }
		public TerminalNode Symbol(int i) {
			return getToken(GamaParser.Symbol, i);
		}
		public List<TerminalNode> NSDiv() { return getTokens(GamaParser.NSDiv); }
		public TerminalNode NSDiv(int i) {
			return getToken(GamaParser.NSDiv, i);
		}
		public FqtnRootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fqtnRoot; }
	}

	public final FqtnRootContext fqtnRoot() throws RecognitionException {
		FqtnRootContext _localctx = new FqtnRootContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_fqtnRoot);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			match(Symbol);
			setState(429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NSDiv) {
				{
				{
				setState(425);
				match(NSDiv);
				setState(426);
				match(Symbol);
				}
				}
				setState(431);
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

	public static class FqtnContext extends ParserRuleContext {
		public List<TerminalNode> Symbol() { return getTokens(GamaParser.Symbol); }
		public TerminalNode Symbol(int i) {
			return getToken(GamaParser.Symbol, i);
		}
		public List<TerminalNode> NSDiv() { return getTokens(GamaParser.NSDiv); }
		public TerminalNode NSDiv(int i) {
			return getToken(GamaParser.NSDiv, i);
		}
		public FqtnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fqtn; }
	}

	public final FqtnContext fqtn() throws RecognitionException {
		FqtnContext _localctx = new FqtnContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_fqtn);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			match(Symbol);
			setState(437);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(433);
					match(NSDiv);
					setState(434);
					match(Symbol);
					}
					} 
				}
				setState(439);
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
			exitRule();
		}
		return _localctx;
	}

	public static class FqtnListContext extends ParserRuleContext {
		public List<FqtnContext> fqtn() {
			return getRuleContexts(FqtnContext.class);
		}
		public FqtnContext fqtn(int i) {
			return getRuleContext(FqtnContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(GamaParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(GamaParser.Comma, i);
		}
		public FqtnListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fqtnList; }
	}

	public final FqtnListContext fqtnList() throws RecognitionException {
		FqtnListContext _localctx = new FqtnListContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_fqtnList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			fqtn();
			setState(445);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(441);
				match(Comma);
				setState(442);
				fqtn();
				}
				}
				setState(447);
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

	public static class TypeListContext extends ParserRuleContext {
		public List<TypeNameContext> typeName() {
			return getRuleContexts(TypeNameContext.class);
		}
		public TypeNameContext typeName(int i) {
			return getRuleContext(TypeNameContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(GamaParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(GamaParser.Comma, i);
		}
		public TypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeList; }
	}

	public final TypeListContext typeList() throws RecognitionException {
		TypeListContext _localctx = new TypeListContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			typeName();
			setState(453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(449);
				match(Comma);
				setState(450);
				typeName();
				}
				}
				setState(455);
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

	public static class TypeNameContext extends ParserRuleContext {
		public FqtnContext fqtn() {
			return getRuleContext(FqtnContext.class,0);
		}
		public List<PtrContext> ptr() {
			return getRuleContexts(PtrContext.class);
		}
		public PtrContext ptr(int i) {
			return getRuleContext(PtrContext.class,i);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_typeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			fqtn();
			setState(460);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MUL) {
				{
				{
				setState(457);
				ptr();
				}
				}
				setState(462);
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

	public static class PtrContext extends ParserRuleContext {
		public TerminalNode MUL() { return getToken(GamaParser.MUL, 0); }
		public PtrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ptr; }
	}

	public final PtrContext ptr() throws RecognitionException {
		PtrContext _localctx = new PtrContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_ptr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			match(MUL);
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
		case 13:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 1);
		case 4:
			return precpred(_ctx, 7);
		case 5:
			return precpred(_ctx, 6);
		case 6:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3>\u01d4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\7\2L\n\2\f\2\16\2O\13\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3`\n\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4n\n\4\3\5\3\5\3\5\3\5\5\5t\n\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0084\n\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0095"+
		"\n\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\6\t\u00b5\n\t\r"+
		"\t\16\t\u00b6\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\6\t\u00c5"+
		"\n\t\r\t\16\t\u00c6\3\t\3\t\3\t\5\t\u00cc\n\t\3\n\3\n\3\n\5\n\u00d1\n"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5"+
		"\13\u00e0\n\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\7\r\u00e9\n\r\f\r\16\r\u00ec"+
		"\13\r\3\r\3\r\3\16\3\16\7\16\u00f2\n\16\f\16\16\16\u00f5\13\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\5\17\u0108\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u011d\n\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\6\17\u0128\n\17\r\17\16\17\u0129"+
		"\7\17\u012c\n\17\f\17\16\17\u012f\13\17\3\20\3\20\3\20\7\20\u0134\n\20"+
		"\f\20\16\20\u0137\13\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\5\22\u0141"+
		"\n\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\5\23\u014b\n\23\3\23\3\23"+
		"\5\23\u014f\n\23\3\23\3\23\5\23\u0153\n\23\3\24\5\24\u0156\n\24\3\24\3"+
		"\24\3\24\5\24\u015b\n\24\3\24\3\24\3\24\5\24\u0160\n\24\3\24\3\24\3\25"+
		"\5\25\u0165\n\25\3\25\3\25\3\25\3\25\5\25\u016b\n\25\3\25\3\25\3\26\3"+
		"\26\3\26\3\26\7\26\u0173\n\26\f\26\16\26\u0176\13\26\3\26\3\26\3\27\3"+
		"\27\3\27\7\27\u017d\n\27\f\27\16\27\u0180\13\27\3\30\3\30\3\30\3\30\3"+
		"\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u018e\n\32\6\32\u0190\n\32"+
		"\r\32\16\32\u0191\3\32\3\32\3\33\3\33\3\33\7\33\u0199\n\33\f\33\16\33"+
		"\u019c\13\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3\37\3\37\5"+
		"\37\u01a9\n\37\3 \3 \3 \7 \u01ae\n \f \16 \u01b1\13 \3!\3!\3!\7!\u01b6"+
		"\n!\f!\16!\u01b9\13!\3\"\3\"\3\"\7\"\u01be\n\"\f\"\16\"\u01c1\13\"\3#"+
		"\3#\3#\7#\u01c6\n#\f#\16#\u01c9\13#\3$\3$\7$\u01cd\n$\f$\16$\u01d0\13"+
		"$\3%\3%\3%\2\3\34&\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>@BDFH\2\6\3\2)*\3\2\f\16\3\2\n\13\3\2\4\t\2\u01f0\2M\3\2"+
		"\2\2\4_\3\2\2\2\6m\3\2\2\2\bs\3\2\2\2\n\u0083\3\2\2\2\f\u0094\3\2\2\2"+
		"\16\u0096\3\2\2\2\20\u00cb\3\2\2\2\22\u00d0\3\2\2\2\24\u00df\3\2\2\2\26"+
		"\u00e1\3\2\2\2\30\u00e6\3\2\2\2\32\u00ef\3\2\2\2\34\u0107\3\2\2\2\36\u0130"+
		"\3\2\2\2 \u0138\3\2\2\2\"\u013c\3\2\2\2$\u0146\3\2\2\2&\u0155\3\2\2\2"+
		"(\u0164\3\2\2\2*\u016e\3\2\2\2,\u0179\3\2\2\2.\u0181\3\2\2\2\60\u0185"+
		"\3\2\2\2\62\u0187\3\2\2\2\64\u0195\3\2\2\2\66\u019d\3\2\2\28\u019f\3\2"+
		"\2\2:\u01a1\3\2\2\2<\u01a8\3\2\2\2>\u01aa\3\2\2\2@\u01b2\3\2\2\2B\u01ba"+
		"\3\2\2\2D\u01c2\3\2\2\2F\u01ca\3\2\2\2H\u01d1\3\2\2\2JL\5\4\3\2KJ\3\2"+
		"\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2NP\3\2\2\2OM\3\2\2\2PQ\7\2\2\3Q\3\3"+
		"\2\2\2RS\7\37\2\2ST\5@!\2TU\5\30\r\2U`\3\2\2\2VW\7\37\2\2WX\5> \2XY\5"+
		"\30\r\2Y`\3\2\2\2Z[\7\37\2\2[`\5\30\r\2\\]\7+\2\2]^\7\67\2\2^`\7\31\2"+
		"\2_R\3\2\2\2_V\3\2\2\2_Z\3\2\2\2_\\\3\2\2\2`\5\3\2\2\2ab\5 \21\2bc\7\31"+
		"\2\2cn\3\2\2\2de\5\"\22\2ef\7\31\2\2fn\3\2\2\2gh\5$\23\2hi\7\31\2\2in"+
		"\3\2\2\2jn\5&\24\2kn\5(\25\2ln\5*\26\2ma\3\2\2\2md\3\2\2\2mg\3\2\2\2m"+
		"j\3\2\2\2mk\3\2\2\2ml\3\2\2\2n\7\3\2\2\2op\5\"\22\2pq\7\31\2\2qt\3\2\2"+
		"\2rt\5&\24\2so\3\2\2\2sr\3\2\2\2t\t\3\2\2\2uv\5\f\7\2vw\7\31\2\2w\u0084"+
		"\3\2\2\2xy\5\16\b\2yz\7\31\2\2z\u0084\3\2\2\2{\u0084\5\20\t\2|\u0084\5"+
		"\24\13\2}~\5\26\f\2~\177\7\31\2\2\177\u0084\3\2\2\2\u0080\u0081\5\22\n"+
		"\2\u0081\u0082\7\31\2\2\u0082\u0084\3\2\2\2\u0083u\3\2\2\2\u0083x\3\2"+
		"\2\2\u0083{\3\2\2\2\u0083|\3\2\2\2\u0083}\3\2\2\2\u0083\u0080\3\2\2\2"+
		"\u0084\13\3\2\2\2\u0085\u0086\7 \2\2\u0086\u0087\7\66\2\2\u0087\u0088"+
		"\7\36\2\2\u0088\u0095\5\34\17\2\u0089\u008a\7 \2\2\u008a\u008b\7\66\2"+
		"\2\u008b\u008c\7\33\2\2\u008c\u008d\5F$\2\u008d\u008e\7\36\2\2\u008e\u008f"+
		"\5\34\17\2\u008f\u0095\3\2\2\2\u0090\u0091\7 \2\2\u0091\u0092\7\66\2\2"+
		"\u0092\u0093\7\33\2\2\u0093\u0095\5F$\2\u0094\u0085\3\2\2\2\u0094\u0089"+
		"\3\2\2\2\u0094\u0090\3\2\2\2\u0095\r\3\2\2\2\u0096\u0097\5\34\17\2\u0097"+
		"\u0098\7\36\2\2\u0098\u0099\5\34\17\2\u0099\17\3\2\2\2\u009a\u009b\7."+
		"\2\2\u009b\u009c\7\17\2\2\u009c\u009d\5\34\17\2\u009d\u009e\7\20\2\2\u009e"+
		"\u009f\5\32\16\2\u009f\u00cc\3\2\2\2\u00a0\u00a1\7.\2\2\u00a1\u00a2\7"+
		"\17\2\2\u00a2\u00a3\5\34\17\2\u00a3\u00a4\7\20\2\2\u00a4\u00a5\5\32\16"+
		"\2\u00a5\u00a6\7/\2\2\u00a6\u00a7\5\32\16\2\u00a7\u00cc\3\2\2\2\u00a8"+
		"\u00a9\7.\2\2\u00a9\u00aa\7\17\2\2\u00aa\u00ab\5\34\17\2\u00ab\u00ac\7"+
		"\20\2\2\u00ac\u00b4\5\32\16\2\u00ad\u00ae\7/\2\2\u00ae\u00af\7.\2\2\u00af"+
		"\u00b0\7\17\2\2\u00b0\u00b1\5\34\17\2\u00b1\u00b2\7\20\2\2\u00b2\u00b3"+
		"\5\32\16\2\u00b3\u00b5\3\2\2\2\u00b4\u00ad\3\2\2\2\u00b5\u00b6\3\2\2\2"+
		"\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00cc\3\2\2\2\u00b8\u00b9"+
		"\7.\2\2\u00b9\u00ba\7\17\2\2\u00ba\u00bb\5\34\17\2\u00bb\u00bc\7\20\2"+
		"\2\u00bc\u00c4\5\32\16\2\u00bd\u00be\7/\2\2\u00be\u00bf\7.\2\2\u00bf\u00c0"+
		"\7\17\2\2\u00c0\u00c1\5\34\17\2\u00c1\u00c2\7\20\2\2\u00c2\u00c3\5\32"+
		"\16\2\u00c3\u00c5\3\2\2\2\u00c4\u00bd\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6"+
		"\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\7/"+
		"\2\2\u00c9\u00ca\5\32\16\2\u00ca\u00cc\3\2\2\2\u00cb\u009a\3\2\2\2\u00cb"+
		"\u00a0\3\2\2\2\u00cb\u00a8\3\2\2\2\u00cb\u00b8\3\2\2\2\u00cc\21\3\2\2"+
		"\2\u00cd\u00d1\7#\2\2\u00ce\u00cf\7#\2\2\u00cf\u00d1\5\34\17\2\u00d0\u00cd"+
		"\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\23\3\2\2\2\u00d2\u00d3\7\60\2\2\u00d3"+
		"\u00d4\7\17\2\2\u00d4\u00d5\5\34\17\2\u00d5\u00d6\7\20\2\2\u00d6\u00d7"+
		"\5\32\16\2\u00d7\u00e0\3\2\2\2\u00d8\u00d9\7\61\2\2\u00d9\u00da\5\32\16"+
		"\2\u00da\u00db\7\60\2\2\u00db\u00dc\7\17\2\2\u00dc\u00dd\5\34\17\2\u00dd"+
		"\u00de\7\20\2\2\u00de\u00e0\3\2\2\2\u00df\u00d2\3\2\2\2\u00df\u00d8\3"+
		"\2\2\2\u00e0\25\3\2\2\2\u00e1\u00e2\5\34\17\2\u00e2\u00e3\7\17\2\2\u00e3"+
		"\u00e4\5\36\20\2\u00e4\u00e5\7\20\2\2\u00e5\27\3\2\2\2\u00e6\u00ea\7\21"+
		"\2\2\u00e7\u00e9\5\6\4\2\u00e8\u00e7\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea"+
		"\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ed\3\2\2\2\u00ec\u00ea\3\2"+
		"\2\2\u00ed\u00ee\7\22\2\2\u00ee\31\3\2\2\2\u00ef\u00f3\7\21\2\2\u00f0"+
		"\u00f2\5\n\6\2\u00f1\u00f0\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2"+
		"\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f6\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6"+
		"\u00f7\7\22\2\2\u00f7\33\3\2\2\2\u00f8\u00f9\b\17\1\2\u00f9\u00fa\7\17"+
		"\2\2\u00fa\u00fb\5\34\17\2\u00fb\u00fc\7\20\2\2\u00fc\u0108\3\2\2\2\u00fd"+
		"\u00fe\7\25\2\2\u00fe\u0108\5\34\17\21\u00ff\u0100\7\f\2\2\u0100\u0108"+
		"\5\34\17\20\u0101\u0108\7:\2\2\u0102\u0108\79\2\2\u0103\u0108\t\2\2\2"+
		"\u0104\u0108\78\2\2\u0105\u0108\7\67\2\2\u0106\u0108\5@!\2\u0107\u00f8"+
		"\3\2\2\2\u0107\u00fd\3\2\2\2\u0107\u00ff\3\2\2\2\u0107\u0101\3\2\2\2\u0107"+
		"\u0102\3\2\2\2\u0107\u0103\3\2\2\2\u0107\u0104\3\2\2\2\u0107\u0105\3\2"+
		"\2\2\u0107\u0106\3\2\2\2\u0108\u012d\3\2\2\2\u0109\u010a\f\6\2\2\u010a"+
		"\u010b\5\66\34\2\u010b\u010c\5\34\17\7\u010c\u012c\3\2\2\2\u010d\u010e"+
		"\f\5\2\2\u010e\u010f\58\35\2\u010f\u0110\5\34\17\6\u0110\u012c\3\2\2\2"+
		"\u0111\u0112\f\4\2\2\u0112\u0113\5:\36\2\u0113\u0114\5\34\17\5\u0114\u012c"+
		"\3\2\2\2\u0115\u0116\f\3\2\2\u0116\u0117\5<\37\2\u0117\u0118\5\34\17\4"+
		"\u0118\u012c\3\2\2\2\u0119\u011a\f\t\2\2\u011a\u011c\7\17\2\2\u011b\u011d"+
		"\5\36\20\2\u011c\u011b\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011e\3\2\2\2"+
		"\u011e\u012c\7\20\2\2\u011f\u0120\f\b\2\2\u0120\u0121\7\23\2\2\u0121\u0122"+
		"\5\36\20\2\u0122\u0123\7\24\2\2\u0123\u012c\3\2\2\2\u0124\u0127\f\7\2"+
		"\2\u0125\u0126\7\35\2\2\u0126\u0128\7\66\2\2\u0127\u0125\3\2\2\2\u0128"+
		"\u0129\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012c\3\2"+
		"\2\2\u012b\u0109\3\2\2\2\u012b\u010d\3\2\2\2\u012b\u0111\3\2\2\2\u012b"+
		"\u0115\3\2\2\2\u012b\u0119\3\2\2\2\u012b\u011f\3\2\2\2\u012b\u0124\3\2"+
		"\2\2\u012c\u012f\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e"+
		"\35\3\2\2\2\u012f\u012d\3\2\2\2\u0130\u0135\5\34\17\2\u0131\u0132\7\34"+
		"\2\2\u0132\u0134\5\34\17\2\u0133\u0131\3\2\2\2\u0134\u0137\3\2\2\2\u0135"+
		"\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136\37\3\2\2\2\u0137\u0135\3\2\2"+
		"\2\u0138\u0139\7\"\2\2\u0139\u013a\7\37\2\2\u013a\u013b\5@!\2\u013b!\3"+
		"\2\2\2\u013c\u013d\7$\2\2\u013d\u013e\7\66\2\2\u013e\u0140\7\17\2\2\u013f"+
		"\u0141\5B\"\2\u0140\u013f\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0142\3\2"+
		"\2\2\u0142\u0143\7\20\2\2\u0143\u0144\7\33\2\2\u0144\u0145\5@!\2\u0145"+
		"#\3\2\2\2\u0146\u0147\7%\2\2\u0147\u0148\7\66\2\2\u0148\u014a\7\17\2\2"+
		"\u0149\u014b\5D#\2\u014a\u0149\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014c"+
		"\3\2\2\2\u014c\u014e\7\20\2\2\u014d\u014f\5\60\31\2\u014e\u014d\3\2\2"+
		"\2\u014e\u014f\3\2\2\2\u014f\u0152\3\2\2\2\u0150\u0151\7\33\2\2\u0151"+
		"\u0153\5F$\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153%\3\2\2\2\u0154"+
		"\u0156\5\62\32\2\u0155\u0154\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0157\3"+
		"\2\2\2\u0157\u0158\7\66\2\2\u0158\u015a\7\17\2\2\u0159\u015b\5,\27\2\u015a"+
		"\u0159\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015f\7\20"+
		"\2\2\u015d\u015e\7\33\2\2\u015e\u0160\5F$\2\u015f\u015d\3\2\2\2\u015f"+
		"\u0160\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0162\5\32\16\2\u0162\'\3\2\2"+
		"\2\u0163\u0165\7&\2\2\u0164\u0163\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0166"+
		"\3\2\2\2\u0166\u0167\7\'\2\2\u0167\u0168\7\66\2\2\u0168\u016a\7\21\2\2"+
		"\u0169\u016b\5,\27\2\u016a\u0169\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016c"+
		"\3\2\2\2\u016c\u016d\7\22\2\2\u016d)\3\2\2\2\u016e\u016f\7(\2\2\u016f"+
		"\u0170\5@!\2\u0170\u0174\7\21\2\2\u0171\u0173\5\b\5\2\u0172\u0171\3\2"+
		"\2\2\u0173\u0176\3\2\2\2\u0174\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175"+
		"\u0177\3\2\2\2\u0176\u0174\3\2\2\2\u0177\u0178\7\22\2\2\u0178+\3\2\2\2"+
		"\u0179\u017e\5.\30\2\u017a\u017b\7\34\2\2\u017b\u017d\5.\30\2\u017c\u017a"+
		"\3\2\2\2\u017d\u0180\3\2\2\2\u017e\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f"+
		"-\3\2\2\2\u0180\u017e\3\2\2\2\u0181\u0182\7\66\2\2\u0182\u0183\7\33\2"+
		"\2\u0183\u0184\5F$\2\u0184/\3\2\2\2\u0185\u0186\7\3\2\2\u0186\61\3\2\2"+
		"\2\u0187\u018f\7\23\2\2\u0188\u018d\7\66\2\2\u0189\u018a\7\17\2\2\u018a"+
		"\u018b\5\64\33\2\u018b\u018c\7\20\2\2\u018c\u018e\3\2\2\2\u018d\u0189"+
		"\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u0190\3\2\2\2\u018f\u0188\3\2\2\2\u0190"+
		"\u0191\3\2\2\2\u0191\u018f\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0193\3\2"+
		"\2\2\u0193\u0194\7\24\2\2\u0194\63\3\2\2\2\u0195\u019a\7\66\2\2\u0196"+
		"\u0197\7\34\2\2\u0197\u0199\7\66\2\2\u0198\u0196\3\2\2\2\u0199\u019c\3"+
		"\2\2\2\u019a\u0198\3\2\2\2\u019a\u019b\3\2\2\2\u019b\65\3\2\2\2\u019c"+
		"\u019a\3\2\2\2\u019d\u019e\t\3\2\2\u019e\67\3\2\2\2\u019f\u01a0\t\4\2"+
		"\2\u01a09\3\2\2\2\u01a1\u01a2\t\5\2\2\u01a2;\3\2\2\2\u01a3\u01a4\7\25"+
		"\2\2\u01a4\u01a9\7\25\2\2\u01a5\u01a6\7\26\2\2\u01a6\u01a9\7\26\2\2\u01a7"+
		"\u01a9\7\27\2\2\u01a8\u01a3\3\2\2\2\u01a8\u01a5\3\2\2\2\u01a8\u01a7\3"+
		"\2\2\2\u01a9=\3\2\2\2\u01aa\u01af\7\66\2\2\u01ab\u01ac\7\32\2\2\u01ac"+
		"\u01ae\7\66\2\2\u01ad\u01ab\3\2\2\2\u01ae\u01b1\3\2\2\2\u01af\u01ad\3"+
		"\2\2\2\u01af\u01b0\3\2\2\2\u01b0?\3\2\2\2\u01b1\u01af\3\2\2\2\u01b2\u01b7"+
		"\7\66\2\2\u01b3\u01b4\7\32\2\2\u01b4\u01b6\7\66\2\2\u01b5\u01b3\3\2\2"+
		"\2\u01b6\u01b9\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8A"+
		"\3\2\2\2\u01b9\u01b7\3\2\2\2\u01ba\u01bf\5@!\2\u01bb\u01bc\7\34\2\2\u01bc"+
		"\u01be\5@!\2\u01bd\u01bb\3\2\2\2\u01be\u01c1\3\2\2\2\u01bf\u01bd\3\2\2"+
		"\2\u01bf\u01c0\3\2\2\2\u01c0C\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c2\u01c7"+
		"\5F$\2\u01c3\u01c4\7\34\2\2\u01c4\u01c6\5F$\2\u01c5\u01c3\3\2\2\2\u01c6"+
		"\u01c9\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8E\3\2\2\2"+
		"\u01c9\u01c7\3\2\2\2\u01ca\u01ce\5@!\2\u01cb\u01cd\5H%\2\u01cc\u01cb\3"+
		"\2\2\2\u01cd\u01d0\3\2\2\2\u01ce\u01cc\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf"+
		"G\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d1\u01d2\7\f\2\2\u01d2I\3\2\2\2)M_ms"+
		"\u0083\u0094\u00b6\u00c6\u00cb\u00d0\u00df\u00ea\u00f3\u0107\u011c\u0129"+
		"\u012b\u012d\u0135\u0140\u014a\u014e\u0152\u0155\u015a\u015f\u0164\u016a"+
		"\u0174\u017e\u018d\u0191\u019a\u01a8\u01af\u01b7\u01bf\u01c7\u01ce";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}