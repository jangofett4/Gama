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
		Struct=37, Impl=38, True=39, False=40, Import=41, If=42, Else=43, While=44, 
		Do=45, OpMul=46, OpAdd=47, OpComp=48, OpComparison=49, Symbol=50, StringLiteral=51, 
		CharLiteral=52, FloatingLiteral=53, IntegerLiteral=54, NumericLiteral=55, 
		MultiComment=56, LineComment=57, WhiteSpace=58;
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
		public TopLevelDelegateContext topLevelDelegate() {
			return getRuleContext(TopLevelDelegateContext.class,0);
		}
		public TerminalNode SC() { return getToken(GamaParser.SC, 0); }
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
			setState(105);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Using:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				topLevelUsingNamespace();
				}
				break;
			case Delegate:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				topLevelDelegate();
				setState(97);
				match(SC);
				}
				break;
			case Extern:
				enterOuterAlt(_localctx, 3);
				{
				setState(99);
				topLevelExternDef();
				setState(100);
				match(SC);
				}
				break;
			case LQ:
			case Symbol:
				enterOuterAlt(_localctx, 4);
				{
				setState(102);
				topLevelFuncDef();
				}
				break;
			case Packed:
			case Struct:
				enterOuterAlt(_localctx, 5);
				{
				setState(103);
				topLevelStructDef();
				}
				break;
			case Impl:
				enterOuterAlt(_localctx, 6);
				{
				setState(104);
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
			setState(111);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Delegate:
				_localctx = new StructLevelDelegateContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				topLevelDelegate();
				setState(108);
				match(SC);
				}
				break;
			case LQ:
			case Symbol:
				_localctx = new StructLevelMethodContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
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
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				stmtVarDef();
				setState(114);
				match(SC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				stmtAssign();
				setState(117);
				match(SC);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(119);
				stmtIf();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(120);
				stmtWhile();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(121);
				stmtFnCall();
				setState(122);
				match(SC);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(124);
				stmtReturn();
				setState(125);
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
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new StmtVarDefBaseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				match(Let);
				setState(130);
				match(Symbol);
				setState(131);
				match(Equals);
				setState(132);
				expr(0);
				}
				break;
			case 2:
				_localctx = new StmtVarDefFullContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				match(Let);
				setState(134);
				match(Symbol);
				setState(135);
				match(Colon);
				setState(136);
				typeName();
				setState(137);
				match(Equals);
				setState(138);
				expr(0);
				}
				break;
			case 3:
				_localctx = new StmtVarDefNullContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(140);
				match(Let);
				setState(141);
				match(Symbol);
				setState(142);
				match(Colon);
				setState(143);
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
			setState(146);
			expr(0);
			setState(147);
			match(Equals);
			setState(148);
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
			setState(199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new StmtIfBaseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				match(If);
				setState(151);
				match(LP);
				setState(152);
				expr(0);
				setState(153);
				match(RP);
				setState(154);
				block();
				}
				break;
			case 2:
				_localctx = new StmtIfElseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				match(If);
				setState(157);
				match(LP);
				setState(158);
				expr(0);
				setState(159);
				match(RP);
				setState(160);
				block();
				setState(161);
				match(Else);
				setState(162);
				block();
				}
				break;
			case 3:
				_localctx = new StmtIfElseIfContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(164);
				match(If);
				setState(165);
				match(LP);
				setState(166);
				expr(0);
				setState(167);
				match(RP);
				setState(168);
				block();
				setState(176); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(169);
					match(Else);
					setState(170);
					match(If);
					setState(171);
					match(LP);
					setState(172);
					expr(0);
					setState(173);
					match(RP);
					setState(174);
					block();
					}
					}
					setState(178); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Else );
				}
				break;
			case 4:
				_localctx = new StmtIfElseIfElseContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(180);
				match(If);
				setState(181);
				match(LP);
				setState(182);
				expr(0);
				setState(183);
				match(RP);
				setState(184);
				block();
				setState(192); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(185);
						match(Else);
						setState(186);
						match(If);
						setState(187);
						match(LP);
						setState(188);
						expr(0);
						setState(189);
						match(RP);
						setState(190);
						block();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(194); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(196);
				match(Else);
				setState(197);
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
			setState(204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new StmtReturnVoidContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				match(Return);
				}
				break;
			case 2:
				_localctx = new StmtReturnValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				match(Return);
				setState(203);
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
			setState(219);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case While:
				_localctx = new StmtWhileBaseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				match(While);
				setState(207);
				match(LP);
				setState(208);
				expr(0);
				setState(209);
				match(RP);
				setState(210);
				block();
				}
				break;
			case Do:
				_localctx = new StmtDoWhileContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				match(Do);
				setState(213);
				block();
				setState(214);
				match(While);
				setState(215);
				match(LP);
				setState(216);
				expr(0);
				setState(217);
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
			setState(221);
			expr(0);
			setState(222);
			match(LP);
			setState(223);
			exprList();
			setState(224);
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
			setState(226);
			match(LB);
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LQ) | (1L << Using) | (1L << Delegate) | (1L << Extern) | (1L << Packed) | (1L << Struct) | (1L << Impl) | (1L << Symbol))) != 0)) {
				{
				{
				setState(227);
				topLevelStatement();
				}
				}
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(233);
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
			setState(235);
			match(LB);
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << LP) | (1L << AND) | (1L << Let) | (1L << Return) | (1L << True) | (1L << False) | (1L << If) | (1L << While) | (1L << Do) | (1L << Symbol) | (1L << StringLiteral) | (1L << CharLiteral) | (1L << FloatingLiteral) | (1L << IntegerLiteral))) != 0)) {
				{
				{
				setState(236);
				statement();
				}
				}
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(242);
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
			setState(259);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LP:
				{
				_localctx = new ExprParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(245);
				match(LP);
				setState(246);
				expr(0);
				setState(247);
				match(RP);
				}
				break;
			case AND:
				{
				_localctx = new ExprAddressOfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(249);
				match(AND);
				setState(250);
				expr(14);
				}
				break;
			case MUL:
				{
				_localctx = new ExprPointerLoadContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(251);
				match(MUL);
				setState(252);
				expr(13);
				}
				break;
			case IntegerLiteral:
				{
				_localctx = new ExprLiteralIntegerContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(253);
				match(IntegerLiteral);
				}
				break;
			case FloatingLiteral:
				{
				_localctx = new ExprLiteralFloatingContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(254);
				match(FloatingLiteral);
				}
				break;
			case True:
			case False:
				{
				_localctx = new ExprLiteralBooleanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(255);
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
				setState(256);
				match(CharLiteral);
				}
				break;
			case StringLiteral:
				{
				_localctx = new ExprLiteralStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(257);
				match(StringLiteral);
				}
				break;
			case Symbol:
				{
				_localctx = new ExprFQTNContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(258);
				fqtn();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(292);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(290);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new ExprOpMulContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(261);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(262);
						opMul();
						setState(263);
						expr(5);
						}
						break;
					case 2:
						{
						_localctx = new ExprOpAddContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(265);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(266);
						opAdd();
						setState(267);
						expr(4);
						}
						break;
					case 3:
						{
						_localctx = new ExprOpCompContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(269);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(270);
						opComp();
						setState(271);
						expr(3);
						}
						break;
					case 4:
						{
						_localctx = new ExprOpLogicContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(273);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(274);
						opLogic();
						setState(275);
						expr(2);
						}
						break;
					case 5:
						{
						_localctx = new ExprCallContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(277);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(278);
						match(LP);
						setState(280);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << LP) | (1L << AND) | (1L << True) | (1L << False) | (1L << Symbol) | (1L << StringLiteral) | (1L << CharLiteral) | (1L << FloatingLiteral) | (1L << IntegerLiteral))) != 0)) {
							{
							setState(279);
							exprList();
							}
						}

						setState(282);
						match(RP);
						}
						break;
					case 6:
						{
						_localctx = new ExprFQMBContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(283);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(286); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(284);
								match(Period);
								setState(285);
								match(Symbol);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(288); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					}
					} 
				}
				setState(294);
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
			setState(295);
			expr(0);
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(296);
				match(Comma);
				setState(297);
				expr(0);
				}
				}
				setState(302);
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
			setState(303);
			match(Using);
			setState(304);
			match(Namespace);
			setState(305);
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
			setState(307);
			match(Delegate);
			setState(308);
			match(Symbol);
			setState(309);
			match(LP);
			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Symbol) {
				{
				setState(310);
				fqtnList();
				}
			}

			setState(313);
			match(RP);
			{
			setState(314);
			match(Colon);
			setState(315);
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
			setState(317);
			match(Extern);
			setState(318);
			match(Symbol);
			setState(319);
			match(LP);
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Symbol) {
				{
				setState(320);
				typeList();
				}
			}

			setState(323);
			match(RP);
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(324);
				ellipsis();
				}
			}

			setState(329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(327);
				match(Colon);
				setState(328);
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
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LQ) {
				{
				setState(331);
				funcAttr();
				}
			}

			setState(334);
			match(Symbol);
			setState(335);
			match(LP);
			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Symbol) {
				{
				setState(336);
				symbolTypePairList();
				}
			}

			setState(339);
			match(RP);
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(340);
				match(Colon);
				setState(341);
				typeName();
				}
			}

			setState(344);
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
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Packed) {
				{
				setState(346);
				match(Packed);
				}
			}

			setState(349);
			match(Struct);
			setState(350);
			match(Symbol);
			setState(351);
			match(LB);
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Symbol) {
				{
				setState(352);
				symbolTypePairList();
				}
			}

			setState(355);
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
			setState(357);
			match(Impl);
			setState(358);
			fqtn();
			setState(359);
			match(LB);
			setState(363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LQ) | (1L << Delegate) | (1L << Symbol))) != 0)) {
				{
				{
				setState(360);
				structLevelStatement();
				}
				}
				setState(365);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(366);
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
			setState(368);
			symbolTypePair();
			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(369);
				match(Comma);
				setState(370);
				symbolTypePair();
				}
				}
				setState(375);
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
			setState(376);
			match(Symbol);
			setState(377);
			match(Colon);
			setState(378);
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
			setState(380);
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
			setState(382);
			match(LQ);
			setState(390); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(383);
				match(Symbol);
				setState(388);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP) {
					{
					setState(384);
					match(LP);
					setState(385);
					symbolList();
					setState(386);
					match(RP);
					}
				}

				}
				}
				setState(392); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Symbol );
			setState(394);
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
			setState(396);
			match(Symbol);
			setState(401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(397);
				match(Comma);
				setState(398);
				match(Symbol);
				}
				}
				setState(403);
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
			setState(404);
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
			setState(406);
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
			setState(408);
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
			setState(415);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(410);
				match(AND);
				setState(411);
				match(AND);
				}
				break;
			case OR:
				enterOuterAlt(_localctx, 2);
				{
				setState(412);
				match(OR);
				setState(413);
				match(OR);
				}
				break;
			case XOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(414);
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
			setState(417);
			match(Symbol);
			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NSDiv) {
				{
				{
				setState(418);
				match(NSDiv);
				setState(419);
				match(Symbol);
				}
				}
				setState(424);
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
			setState(425);
			match(Symbol);
			setState(430);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(426);
					match(NSDiv);
					setState(427);
					match(Symbol);
					}
					} 
				}
				setState(432);
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
			setState(433);
			fqtn();
			setState(438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(434);
				match(Comma);
				setState(435);
				fqtn();
				}
				}
				setState(440);
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
			setState(441);
			typeName();
			setState(446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(442);
				match(Comma);
				setState(443);
				typeName();
				}
				}
				setState(448);
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
			setState(449);
			fqtn();
			setState(453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MUL) {
				{
				{
				setState(450);
				ptr();
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
			setState(456);
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
			return precpred(_ctx, 6);
		case 5:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3<\u01cd\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\7\2L\n\2\f\2\16\2O\13\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3`\n\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4l\n\4\3\5\3\5\3\5\3\5\5\5r\n\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0082\n\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0093\n\7\3\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\6\t\u00b3\n\t\r\t\16\t"+
		"\u00b4\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\6\t\u00c3\n\t\r"+
		"\t\16\t\u00c4\3\t\3\t\3\t\5\t\u00ca\n\t\3\n\3\n\3\n\5\n\u00cf\n\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00de"+
		"\n\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\7\r\u00e7\n\r\f\r\16\r\u00ea\13\r\3"+
		"\r\3\r\3\16\3\16\7\16\u00f0\n\16\f\16\16\16\u00f3\13\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\5\17\u0106\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u011b\n\17\3\17\3\17\3\17"+
		"\3\17\6\17\u0121\n\17\r\17\16\17\u0122\7\17\u0125\n\17\f\17\16\17\u0128"+
		"\13\17\3\20\3\20\3\20\7\20\u012d\n\20\f\20\16\20\u0130\13\20\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\5\22\u013a\n\22\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\5\23\u0144\n\23\3\23\3\23\5\23\u0148\n\23\3\23\3\23\5"+
		"\23\u014c\n\23\3\24\5\24\u014f\n\24\3\24\3\24\3\24\5\24\u0154\n\24\3\24"+
		"\3\24\3\24\5\24\u0159\n\24\3\24\3\24\3\25\5\25\u015e\n\25\3\25\3\25\3"+
		"\25\3\25\5\25\u0164\n\25\3\25\3\25\3\26\3\26\3\26\3\26\7\26\u016c\n\26"+
		"\f\26\16\26\u016f\13\26\3\26\3\26\3\27\3\27\3\27\7\27\u0176\n\27\f\27"+
		"\16\27\u0179\13\27\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\5\32\u0187\n\32\6\32\u0189\n\32\r\32\16\32\u018a\3\32\3\32\3"+
		"\33\3\33\3\33\7\33\u0192\n\33\f\33\16\33\u0195\13\33\3\34\3\34\3\35\3"+
		"\35\3\36\3\36\3\37\3\37\3\37\3\37\3\37\5\37\u01a2\n\37\3 \3 \3 \7 \u01a7"+
		"\n \f \16 \u01aa\13 \3!\3!\3!\7!\u01af\n!\f!\16!\u01b2\13!\3\"\3\"\3\""+
		"\7\"\u01b7\n\"\f\"\16\"\u01ba\13\"\3#\3#\3#\7#\u01bf\n#\f#\16#\u01c2\13"+
		"#\3$\3$\7$\u01c6\n$\f$\16$\u01c9\13$\3%\3%\3%\2\3\34&\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH\2\6\3\2)*\3\2\f\16"+
		"\3\2\n\13\3\2\4\t\2\u01e8\2M\3\2\2\2\4_\3\2\2\2\6k\3\2\2\2\bq\3\2\2\2"+
		"\n\u0081\3\2\2\2\f\u0092\3\2\2\2\16\u0094\3\2\2\2\20\u00c9\3\2\2\2\22"+
		"\u00ce\3\2\2\2\24\u00dd\3\2\2\2\26\u00df\3\2\2\2\30\u00e4\3\2\2\2\32\u00ed"+
		"\3\2\2\2\34\u0105\3\2\2\2\36\u0129\3\2\2\2 \u0131\3\2\2\2\"\u0135\3\2"+
		"\2\2$\u013f\3\2\2\2&\u014e\3\2\2\2(\u015d\3\2\2\2*\u0167\3\2\2\2,\u0172"+
		"\3\2\2\2.\u017a\3\2\2\2\60\u017e\3\2\2\2\62\u0180\3\2\2\2\64\u018e\3\2"+
		"\2\2\66\u0196\3\2\2\28\u0198\3\2\2\2:\u019a\3\2\2\2<\u01a1\3\2\2\2>\u01a3"+
		"\3\2\2\2@\u01ab\3\2\2\2B\u01b3\3\2\2\2D\u01bb\3\2\2\2F\u01c3\3\2\2\2H"+
		"\u01ca\3\2\2\2JL\5\4\3\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2NP\3\2"+
		"\2\2OM\3\2\2\2PQ\7\2\2\3Q\3\3\2\2\2RS\7\37\2\2ST\5@!\2TU\5\30\r\2U`\3"+
		"\2\2\2VW\7\37\2\2WX\5> \2XY\5\30\r\2Y`\3\2\2\2Z[\7\37\2\2[`\5\30\r\2\\"+
		"]\7+\2\2]^\7\65\2\2^`\7\31\2\2_R\3\2\2\2_V\3\2\2\2_Z\3\2\2\2_\\\3\2\2"+
		"\2`\5\3\2\2\2al\5 \21\2bc\5\"\22\2cd\7\31\2\2dl\3\2\2\2ef\5$\23\2fg\7"+
		"\31\2\2gl\3\2\2\2hl\5&\24\2il\5(\25\2jl\5*\26\2ka\3\2\2\2kb\3\2\2\2ke"+
		"\3\2\2\2kh\3\2\2\2ki\3\2\2\2kj\3\2\2\2l\7\3\2\2\2mn\5\"\22\2no\7\31\2"+
		"\2or\3\2\2\2pr\5&\24\2qm\3\2\2\2qp\3\2\2\2r\t\3\2\2\2st\5\f\7\2tu\7\31"+
		"\2\2u\u0082\3\2\2\2vw\5\16\b\2wx\7\31\2\2x\u0082\3\2\2\2y\u0082\5\20\t"+
		"\2z\u0082\5\24\13\2{|\5\26\f\2|}\7\31\2\2}\u0082\3\2\2\2~\177\5\22\n\2"+
		"\177\u0080\7\31\2\2\u0080\u0082\3\2\2\2\u0081s\3\2\2\2\u0081v\3\2\2\2"+
		"\u0081y\3\2\2\2\u0081z\3\2\2\2\u0081{\3\2\2\2\u0081~\3\2\2\2\u0082\13"+
		"\3\2\2\2\u0083\u0084\7 \2\2\u0084\u0085\7\64\2\2\u0085\u0086\7\36\2\2"+
		"\u0086\u0093\5\34\17\2\u0087\u0088\7 \2\2\u0088\u0089\7\64\2\2\u0089\u008a"+
		"\7\33\2\2\u008a\u008b\5F$\2\u008b\u008c\7\36\2\2\u008c\u008d\5\34\17\2"+
		"\u008d\u0093\3\2\2\2\u008e\u008f\7 \2\2\u008f\u0090\7\64\2\2\u0090\u0091"+
		"\7\33\2\2\u0091\u0093\5F$\2\u0092\u0083\3\2\2\2\u0092\u0087\3\2\2\2\u0092"+
		"\u008e\3\2\2\2\u0093\r\3\2\2\2\u0094\u0095\5\34\17\2\u0095\u0096\7\36"+
		"\2\2\u0096\u0097\5\34\17\2\u0097\17\3\2\2\2\u0098\u0099\7,\2\2\u0099\u009a"+
		"\7\17\2\2\u009a\u009b\5\34\17\2\u009b\u009c\7\20\2\2\u009c\u009d\5\32"+
		"\16\2\u009d\u00ca\3\2\2\2\u009e\u009f\7,\2\2\u009f\u00a0\7\17\2\2\u00a0"+
		"\u00a1\5\34\17\2\u00a1\u00a2\7\20\2\2\u00a2\u00a3\5\32\16\2\u00a3\u00a4"+
		"\7-\2\2\u00a4\u00a5\5\32\16\2\u00a5\u00ca\3\2\2\2\u00a6\u00a7\7,\2\2\u00a7"+
		"\u00a8\7\17\2\2\u00a8\u00a9\5\34\17\2\u00a9\u00aa\7\20\2\2\u00aa\u00b2"+
		"\5\32\16\2\u00ab\u00ac\7-\2\2\u00ac\u00ad\7,\2\2\u00ad\u00ae\7\17\2\2"+
		"\u00ae\u00af\5\34\17\2\u00af\u00b0\7\20\2\2\u00b0\u00b1\5\32\16\2\u00b1"+
		"\u00b3\3\2\2\2\u00b2\u00ab\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b2\3\2"+
		"\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00ca\3\2\2\2\u00b6\u00b7\7,\2\2\u00b7"+
		"\u00b8\7\17\2\2\u00b8\u00b9\5\34\17\2\u00b9\u00ba\7\20\2\2\u00ba\u00c2"+
		"\5\32\16\2\u00bb\u00bc\7-\2\2\u00bc\u00bd\7,\2\2\u00bd\u00be\7\17\2\2"+
		"\u00be\u00bf\5\34\17\2\u00bf\u00c0\7\20\2\2\u00c0\u00c1\5\32\16\2\u00c1"+
		"\u00c3\3\2\2\2\u00c2\u00bb\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c2\3\2"+
		"\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\7-\2\2\u00c7"+
		"\u00c8\5\32\16\2\u00c8\u00ca\3\2\2\2\u00c9\u0098\3\2\2\2\u00c9\u009e\3"+
		"\2\2\2\u00c9\u00a6\3\2\2\2\u00c9\u00b6\3\2\2\2\u00ca\21\3\2\2\2\u00cb"+
		"\u00cf\7#\2\2\u00cc\u00cd\7#\2\2\u00cd\u00cf\5\34\17\2\u00ce\u00cb\3\2"+
		"\2\2\u00ce\u00cc\3\2\2\2\u00cf\23\3\2\2\2\u00d0\u00d1\7.\2\2\u00d1\u00d2"+
		"\7\17\2\2\u00d2\u00d3\5\34\17\2\u00d3\u00d4\7\20\2\2\u00d4\u00d5\5\32"+
		"\16\2\u00d5\u00de\3\2\2\2\u00d6\u00d7\7/\2\2\u00d7\u00d8\5\32\16\2\u00d8"+
		"\u00d9\7.\2\2\u00d9\u00da\7\17\2\2\u00da\u00db\5\34\17\2\u00db\u00dc\7"+
		"\20\2\2\u00dc\u00de\3\2\2\2\u00dd\u00d0\3\2\2\2\u00dd\u00d6\3\2\2\2\u00de"+
		"\25\3\2\2\2\u00df\u00e0\5\34\17\2\u00e0\u00e1\7\17\2\2\u00e1\u00e2\5\36"+
		"\20\2\u00e2\u00e3\7\20\2\2\u00e3\27\3\2\2\2\u00e4\u00e8\7\21\2\2\u00e5"+
		"\u00e7\5\6\4\2\u00e6\u00e5\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2"+
		"\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00eb\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb"+
		"\u00ec\7\22\2\2\u00ec\31\3\2\2\2\u00ed\u00f1\7\21\2\2\u00ee\u00f0\5\n"+
		"\6\2\u00ef\u00ee\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1"+
		"\u00f2\3\2\2\2\u00f2\u00f4\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00f5\7\22"+
		"\2\2\u00f5\33\3\2\2\2\u00f6\u00f7\b\17\1\2\u00f7\u00f8\7\17\2\2\u00f8"+
		"\u00f9\5\34\17\2\u00f9\u00fa\7\20\2\2\u00fa\u0106\3\2\2\2\u00fb\u00fc"+
		"\7\25\2\2\u00fc\u0106\5\34\17\20\u00fd\u00fe\7\f\2\2\u00fe\u0106\5\34"+
		"\17\17\u00ff\u0106\78\2\2\u0100\u0106\7\67\2\2\u0101\u0106\t\2\2\2\u0102"+
		"\u0106\7\66\2\2\u0103\u0106\7\65\2\2\u0104\u0106\5@!\2\u0105\u00f6\3\2"+
		"\2\2\u0105\u00fb\3\2\2\2\u0105\u00fd\3\2\2\2\u0105\u00ff\3\2\2\2\u0105"+
		"\u0100\3\2\2\2\u0105\u0101\3\2\2\2\u0105\u0102\3\2\2\2\u0105\u0103\3\2"+
		"\2\2\u0105\u0104\3\2\2\2\u0106\u0126\3\2\2\2\u0107\u0108\f\6\2\2\u0108"+
		"\u0109\5\66\34\2\u0109\u010a\5\34\17\7\u010a\u0125\3\2\2\2\u010b\u010c"+
		"\f\5\2\2\u010c\u010d\58\35\2\u010d\u010e\5\34\17\6\u010e\u0125\3\2\2\2"+
		"\u010f\u0110\f\4\2\2\u0110\u0111\5:\36\2\u0111\u0112\5\34\17\5\u0112\u0125"+
		"\3\2\2\2\u0113\u0114\f\3\2\2\u0114\u0115\5<\37\2\u0115\u0116\5\34\17\4"+
		"\u0116\u0125\3\2\2\2\u0117\u0118\f\b\2\2\u0118\u011a\7\17\2\2\u0119\u011b"+
		"\5\36\20\2\u011a\u0119\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c\3\2\2\2"+
		"\u011c\u0125\7\20\2\2\u011d\u0120\f\7\2\2\u011e\u011f\7\35\2\2\u011f\u0121"+
		"\7\64\2\2\u0120\u011e\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0120\3\2\2\2"+
		"\u0122\u0123\3\2\2\2\u0123\u0125\3\2\2\2\u0124\u0107\3\2\2\2\u0124\u010b"+
		"\3\2\2\2\u0124\u010f\3\2\2\2\u0124\u0113\3\2\2\2\u0124\u0117\3\2\2\2\u0124"+
		"\u011d\3\2\2\2\u0125\u0128\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2"+
		"\2\2\u0127\35\3\2\2\2\u0128\u0126\3\2\2\2\u0129\u012e\5\34\17\2\u012a"+
		"\u012b\7\34\2\2\u012b\u012d\5\34\17\2\u012c\u012a\3\2\2\2\u012d\u0130"+
		"\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\37\3\2\2\2\u0130"+
		"\u012e\3\2\2\2\u0131\u0132\7\"\2\2\u0132\u0133\7\37\2\2\u0133\u0134\5"+
		"@!\2\u0134!\3\2\2\2\u0135\u0136\7$\2\2\u0136\u0137\7\64\2\2\u0137\u0139"+
		"\7\17\2\2\u0138\u013a\5B\"\2\u0139\u0138\3\2\2\2\u0139\u013a\3\2\2\2\u013a"+
		"\u013b\3\2\2\2\u013b\u013c\7\20\2\2\u013c\u013d\7\33\2\2\u013d\u013e\5"+
		"@!\2\u013e#\3\2\2\2\u013f\u0140\7%\2\2\u0140\u0141\7\64\2\2\u0141\u0143"+
		"\7\17\2\2\u0142\u0144\5D#\2\u0143\u0142\3\2\2\2\u0143\u0144\3\2\2\2\u0144"+
		"\u0145\3\2\2\2\u0145\u0147\7\20\2\2\u0146\u0148\5\60\31\2\u0147\u0146"+
		"\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u014b\3\2\2\2\u0149\u014a\7\33\2\2"+
		"\u014a\u014c\5F$\2\u014b\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c%\3\2"+
		"\2\2\u014d\u014f\5\62\32\2\u014e\u014d\3\2\2\2\u014e\u014f\3\2\2\2\u014f"+
		"\u0150\3\2\2\2\u0150\u0151\7\64\2\2\u0151\u0153\7\17\2\2\u0152\u0154\5"+
		",\27\2\u0153\u0152\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0155\3\2\2\2\u0155"+
		"\u0158\7\20\2\2\u0156\u0157\7\33\2\2\u0157\u0159\5F$\2\u0158\u0156\3\2"+
		"\2\2\u0158\u0159\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015b\5\32\16\2\u015b"+
		"\'\3\2\2\2\u015c\u015e\7&\2\2\u015d\u015c\3\2\2\2\u015d\u015e\3\2\2\2"+
		"\u015e\u015f\3\2\2\2\u015f\u0160\7\'\2\2\u0160\u0161\7\64\2\2\u0161\u0163"+
		"\7\21\2\2\u0162\u0164\5,\27\2\u0163\u0162\3\2\2\2\u0163\u0164\3\2\2\2"+
		"\u0164\u0165\3\2\2\2\u0165\u0166\7\22\2\2\u0166)\3\2\2\2\u0167\u0168\7"+
		"(\2\2\u0168\u0169\5@!\2\u0169\u016d\7\21\2\2\u016a\u016c\5\b\5\2\u016b"+
		"\u016a\3\2\2\2\u016c\u016f\3\2\2\2\u016d\u016b\3\2\2\2\u016d\u016e\3\2"+
		"\2\2\u016e\u0170\3\2\2\2\u016f\u016d\3\2\2\2\u0170\u0171\7\22\2\2\u0171"+
		"+\3\2\2\2\u0172\u0177\5.\30\2\u0173\u0174\7\34\2\2\u0174\u0176\5.\30\2"+
		"\u0175\u0173\3\2\2\2\u0176\u0179\3\2\2\2\u0177\u0175\3\2\2\2\u0177\u0178"+
		"\3\2\2\2\u0178-\3\2\2\2\u0179\u0177\3\2\2\2\u017a\u017b\7\64\2\2\u017b"+
		"\u017c\7\33\2\2\u017c\u017d\5F$\2\u017d/\3\2\2\2\u017e\u017f\7\3\2\2\u017f"+
		"\61\3\2\2\2\u0180\u0188\7\23\2\2\u0181\u0186\7\64\2\2\u0182\u0183\7\17"+
		"\2\2\u0183\u0184\5\64\33\2\u0184\u0185\7\20\2\2\u0185\u0187\3\2\2\2\u0186"+
		"\u0182\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0189\3\2\2\2\u0188\u0181\3\2"+
		"\2\2\u0189\u018a\3\2\2\2\u018a\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018b"+
		"\u018c\3\2\2\2\u018c\u018d\7\24\2\2\u018d\63\3\2\2\2\u018e\u0193\7\64"+
		"\2\2\u018f\u0190\7\34\2\2\u0190\u0192\7\64\2\2\u0191\u018f\3\2\2\2\u0192"+
		"\u0195\3\2\2\2\u0193\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194\65\3\2\2"+
		"\2\u0195\u0193\3\2\2\2\u0196\u0197\t\3\2\2\u0197\67\3\2\2\2\u0198\u0199"+
		"\t\4\2\2\u01999\3\2\2\2\u019a\u019b\t\5\2\2\u019b;\3\2\2\2\u019c\u019d"+
		"\7\25\2\2\u019d\u01a2\7\25\2\2\u019e\u019f\7\26\2\2\u019f\u01a2\7\26\2"+
		"\2\u01a0\u01a2\7\27\2\2\u01a1\u019c\3\2\2\2\u01a1\u019e\3\2\2\2\u01a1"+
		"\u01a0\3\2\2\2\u01a2=\3\2\2\2\u01a3\u01a8\7\64\2\2\u01a4\u01a5\7\32\2"+
		"\2\u01a5\u01a7\7\64\2\2\u01a6\u01a4\3\2\2\2\u01a7\u01aa\3\2\2\2\u01a8"+
		"\u01a6\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9?\3\2\2\2\u01aa\u01a8\3\2\2\2"+
		"\u01ab\u01b0\7\64\2\2\u01ac\u01ad\7\32\2\2\u01ad\u01af\7\64\2\2\u01ae"+
		"\u01ac\3\2\2\2\u01af\u01b2\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b0\u01b1\3\2"+
		"\2\2\u01b1A\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b3\u01b8\5@!\2\u01b4\u01b5"+
		"\7\34\2\2\u01b5\u01b7\5@!\2\u01b6\u01b4\3\2\2\2\u01b7\u01ba\3\2\2\2\u01b8"+
		"\u01b6\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9C\3\2\2\2\u01ba\u01b8\3\2\2\2"+
		"\u01bb\u01c0\5F$\2\u01bc\u01bd\7\34\2\2\u01bd\u01bf\5F$\2\u01be\u01bc"+
		"\3\2\2\2\u01bf\u01c2\3\2\2\2\u01c0\u01be\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1"+
		"E\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c3\u01c7\5@!\2\u01c4\u01c6\5H%\2\u01c5"+
		"\u01c4\3\2\2\2\u01c6\u01c9\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c7\u01c8\3\2"+
		"\2\2\u01c8G\3\2\2\2\u01c9\u01c7\3\2\2\2\u01ca\u01cb\7\f\2\2\u01cbI\3\2"+
		"\2\2)M_kq\u0081\u0092\u00b4\u00c4\u00c9\u00ce\u00dd\u00e8\u00f1\u0105"+
		"\u011a\u0122\u0124\u0126\u012e\u0139\u0143\u0147\u014b\u014e\u0153\u0158"+
		"\u015d\u0163\u016d\u0177\u0186\u018a\u0193\u01a1\u01a8\u01b0\u01b8\u01c0"+
		"\u01c7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}