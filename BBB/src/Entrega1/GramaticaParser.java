// Generated from Gramatica.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramaticaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, AP=2, CP=3, AL=4, CL=5, COM=6, INT=7, FLT=8, BOL=9, CHA=10, STR=11, 
		VOID=12, PRNT=13, COL=14, MOV=15, INCL=16, MAIN=17, LWHILE=18, LDO=19, 
		LFOR=20, IF=21, BRK=22, RTRN=23, PINU=24, PIND=25, HT=26, IGU=27, DEL=28, 
		MLT=29, DIV=30, MOD=31, PLS=32, SUB=33, MAI=34, MEI=35, OIG=36, DIF=37, 
		MAY=38, MEN=39, CTEC=40, CTES=41, CTEF=42, CTEI=43, ID=44;
	public static final int
		RULE_includes = 0, RULE_params = 1, RULE_params2 = 2, RULE_params3 = 3, 
		RULE_functioncall = 4, RULE_functiondecl = 5, RULE_main = 6, RULE_asignations = 7, 
		RULE_asignation = 8, RULE_print = 9, RULE_condition = 10, RULE_loops = 11, 
		RULE_whle = 12, RULE_dowhle = 13, RULE_fr = 14, RULE_instructions = 15, 
		RULE_estatutos = 16, RULE_estatuto = 17, RULE_opc = 18, RULE_exp = 19, 
		RULE_exp2 = 20, RULE_ex = 21, RULE_ex2 = 22, RULE_termino = 23, RULE_termino2 = 24, 
		RULE_factor = 25, RULE_val = 26, RULE_type = 27;
	public static final String[] ruleNames = {
		"includes", "params", "params2", "params3", "functioncall", "functiondecl", 
		"main", "asignations", "asignation", "print", "condition", "loops", "whle", 
		"dowhle", "fr", "instructions", "estatutos", "estatuto", "opc", "exp", 
		"exp2", "ex", "ex2", "termino", "termino2", "factor", "val", "type"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'('", "')'", "'{'", "'}'", "','", "'ent'", "'dec'", "'bool'", 
		"'cad'", "'car'", "'nada'", "'imprime'", "'color'", "'mover'", "'incluir'", 
		"'main'", "'mientras'", "'hacer'", "'para'", "'si'", "'romper'", "'regresar'", 
		"'pintar'", "'flotar'", "'#'", "'='", "';'", "'*'", "'/'", "'%'", "'+'", 
		"'-'", "'>='", "'<='", "'=='", "'!='", "'>'", "'<'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WS", "AP", "CP", "AL", "CL", "COM", "INT", "FLT", "BOL", "CHA", 
		"STR", "VOID", "PRNT", "COL", "MOV", "INCL", "MAIN", "LWHILE", "LDO", 
		"LFOR", "IF", "BRK", "RTRN", "PINU", "PIND", "HT", "IGU", "DEL", "MLT", 
		"DIV", "MOD", "PLS", "SUB", "MAI", "MEI", "OIG", "DIF", "MAY", "MEN", 
		"CTEC", "CTES", "CTEF", "CTEI", "ID"
	};
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
	public String getGrammarFileName() { return "Gramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GramaticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class IncludesContext extends ParserRuleContext {
		public TerminalNode HT() { return getToken(GramaticaParser.HT, 0); }
		public TerminalNode INCL() { return getToken(GramaticaParser.INCL, 0); }
		public TerminalNode CTES() { return getToken(GramaticaParser.CTES, 0); }
		public TerminalNode DEL() { return getToken(GramaticaParser.DEL, 0); }
		public IncludesContext includes() {
			return getRuleContext(IncludesContext.class,0);
		}
		public TerminalNode MEN() { return getToken(GramaticaParser.MEN, 0); }
		public TerminalNode MAY() { return getToken(GramaticaParser.MAY, 0); }
		public IncludesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_includes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterIncludes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitIncludes(this);
		}
	}

	public final IncludesContext includes() throws RecognitionException {
		IncludesContext _localctx = new IncludesContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_includes);
		try {
			setState(69);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				match(HT);
				setState(58);
				match(INCL);
				setState(59);
				match(CTES);
				setState(60);
				match(DEL);
				setState(61);
				includes();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(62);
				match(HT);
				setState(63);
				match(INCL);
				setState(64);
				match(MEN);
				setState(65);
				match(CTES);
				setState(66);
				match(MAY);
				setState(67);
				match(DEL);
				setState(68);
				includes();
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

	public static class ParamsContext extends ParserRuleContext {
		public Params2Context params2() {
			return getRuleContext(Params2Context.class,0);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitParams(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_params);
		try {
			setState(73);
			switch (_input.LA(1)) {
			case CP:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case AP:
			case PLS:
			case SUB:
			case CTEC:
			case CTES:
			case CTEF:
			case CTEI:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				params2();
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

	public static class Params2Context extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Params2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterParams2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitParams2(this);
		}
	}

	public final Params2Context params2() throws RecognitionException {
		Params2Context _localctx = new Params2Context(_ctx, getState());
		enterRule(_localctx, 4, RULE_params2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			exp();
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

	public static class Params3Context extends ParserRuleContext {
		public TerminalNode COM() { return getToken(GramaticaParser.COM, 0); }
		public Params2Context params2() {
			return getRuleContext(Params2Context.class,0);
		}
		public Params3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterParams3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitParams3(this);
		}
	}

	public final Params3Context params3() throws RecognitionException {
		Params3Context _localctx = new Params3Context(_ctx, getState());
		enterRule(_localctx, 6, RULE_params3);
		try {
			setState(80);
			switch (_input.LA(1)) {
			case EOF:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case COM:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				match(COM);
				setState(79);
				params2();
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

	public static class FunctioncallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public TerminalNode AP() { return getToken(GramaticaParser.AP, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode CP() { return getToken(GramaticaParser.CP, 0); }
		public TerminalNode DEL() { return getToken(GramaticaParser.DEL, 0); }
		public FunctioncallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functioncall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterFunctioncall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitFunctioncall(this);
		}
	}

	public final FunctioncallContext functioncall() throws RecognitionException {
		FunctioncallContext _localctx = new FunctioncallContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_functioncall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(ID);
			setState(83);
			match(AP);
			setState(84);
			params();
			setState(85);
			match(CP);
			setState(86);
			match(DEL);
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

	public static class FunctiondeclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public TerminalNode AP() { return getToken(GramaticaParser.AP, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode CP() { return getToken(GramaticaParser.CP, 0); }
		public TerminalNode AL() { return getToken(GramaticaParser.AL, 0); }
		public EstatutosContext estatutos() {
			return getRuleContext(EstatutosContext.class,0);
		}
		public TerminalNode CL() { return getToken(GramaticaParser.CL, 0); }
		public FunctiondeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functiondecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterFunctiondecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitFunctiondecl(this);
		}
	}

	public final FunctiondeclContext functiondecl() throws RecognitionException {
		FunctiondeclContext _localctx = new FunctiondeclContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_functiondecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			type();
			setState(89);
			match(ID);
			setState(90);
			match(AP);
			setState(91);
			params();
			setState(92);
			match(CP);
			setState(93);
			match(AL);
			setState(94);
			estatutos();
			setState(95);
			match(CL);
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

	public static class MainContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GramaticaParser.INT, 0); }
		public TerminalNode MAIN() { return getToken(GramaticaParser.MAIN, 0); }
		public TerminalNode AP() { return getToken(GramaticaParser.AP, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode CP() { return getToken(GramaticaParser.CP, 0); }
		public TerminalNode AL() { return getToken(GramaticaParser.AL, 0); }
		public EstatutosContext estatutos() {
			return getRuleContext(EstatutosContext.class,0);
		}
		public TerminalNode CL() { return getToken(GramaticaParser.CL, 0); }
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitMain(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(INT);
			setState(98);
			match(MAIN);
			setState(99);
			match(AP);
			setState(100);
			params();
			setState(101);
			match(CP);
			setState(102);
			match(AL);
			setState(103);
			estatutos();
			setState(104);
			match(CL);
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

	public static class AsignationsContext extends ParserRuleContext {
		public AsignationContext asignation() {
			return getRuleContext(AsignationContext.class,0);
		}
		public AsignationsContext asignations() {
			return getRuleContext(AsignationsContext.class,0);
		}
		public AsignationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterAsignations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitAsignations(this);
		}
	}

	public final AsignationsContext asignations() throws RecognitionException {
		AsignationsContext _localctx = new AsignationsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_asignations);
		try {
			setState(110);
			switch (_input.LA(1)) {
			case DEL:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				asignation();
				setState(108);
				asignations();
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

	public static class AsignationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public TerminalNode IGU() { return getToken(GramaticaParser.IGU, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode DEL() { return getToken(GramaticaParser.DEL, 0); }
		public AsignationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterAsignation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitAsignation(this);
		}
	}

	public final AsignationContext asignation() throws RecognitionException {
		AsignationContext _localctx = new AsignationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_asignation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(ID);
			setState(113);
			match(IGU);
			setState(114);
			exp();
			setState(115);
			match(DEL);
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRNT() { return getToken(GramaticaParser.PRNT, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode DEL() { return getToken(GramaticaParser.DEL, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitPrint(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(PRNT);
			setState(118);
			exp();
			setState(119);
			match(DEL);
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

	public static class ConditionContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(GramaticaParser.IF, 0); }
		public TerminalNode AP() { return getToken(GramaticaParser.AP, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode CP() { return getToken(GramaticaParser.CP, 0); }
		public TerminalNode AL() { return getToken(GramaticaParser.AL, 0); }
		public EstatutosContext estatutos() {
			return getRuleContext(EstatutosContext.class,0);
		}
		public TerminalNode CL() { return getToken(GramaticaParser.CL, 0); }
		public TerminalNode DEL() { return getToken(GramaticaParser.DEL, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(IF);
			setState(122);
			match(AP);
			setState(123);
			exp();
			setState(124);
			match(CP);
			setState(125);
			match(AL);
			setState(126);
			estatutos();
			setState(127);
			match(CL);
			setState(128);
			match(DEL);
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

	public static class LoopsContext extends ParserRuleContext {
		public WhleContext whle() {
			return getRuleContext(WhleContext.class,0);
		}
		public FrContext fr() {
			return getRuleContext(FrContext.class,0);
		}
		public DowhleContext dowhle() {
			return getRuleContext(DowhleContext.class,0);
		}
		public LoopsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loops; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterLoops(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitLoops(this);
		}
	}

	public final LoopsContext loops() throws RecognitionException {
		LoopsContext _localctx = new LoopsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_loops);
		try {
			setState(133);
			switch (_input.LA(1)) {
			case LWHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				whle();
				}
				break;
			case LFOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				fr();
				}
				break;
			case LDO:
				enterOuterAlt(_localctx, 3);
				{
				setState(132);
				dowhle();
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

	public static class WhleContext extends ParserRuleContext {
		public TerminalNode LWHILE() { return getToken(GramaticaParser.LWHILE, 0); }
		public TerminalNode AP() { return getToken(GramaticaParser.AP, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode CP() { return getToken(GramaticaParser.CP, 0); }
		public TerminalNode AL() { return getToken(GramaticaParser.AL, 0); }
		public EstatutosContext estatutos() {
			return getRuleContext(EstatutosContext.class,0);
		}
		public TerminalNode CL() { return getToken(GramaticaParser.CL, 0); }
		public WhleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterWhle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitWhle(this);
		}
	}

	public final WhleContext whle() throws RecognitionException {
		WhleContext _localctx = new WhleContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_whle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(LWHILE);
			setState(136);
			match(AP);
			setState(137);
			exp();
			setState(138);
			match(CP);
			setState(139);
			match(AL);
			setState(140);
			estatutos();
			setState(141);
			match(CL);
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

	public static class DowhleContext extends ParserRuleContext {
		public TerminalNode LDO() { return getToken(GramaticaParser.LDO, 0); }
		public TerminalNode AL() { return getToken(GramaticaParser.AL, 0); }
		public EstatutosContext estatutos() {
			return getRuleContext(EstatutosContext.class,0);
		}
		public TerminalNode CL() { return getToken(GramaticaParser.CL, 0); }
		public TerminalNode LWHILE() { return getToken(GramaticaParser.LWHILE, 0); }
		public TerminalNode AP() { return getToken(GramaticaParser.AP, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode CP() { return getToken(GramaticaParser.CP, 0); }
		public DowhleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dowhle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterDowhle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitDowhle(this);
		}
	}

	public final DowhleContext dowhle() throws RecognitionException {
		DowhleContext _localctx = new DowhleContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_dowhle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(LDO);
			setState(144);
			match(AL);
			setState(145);
			estatutos();
			setState(146);
			match(CL);
			setState(147);
			match(LWHILE);
			setState(148);
			match(AP);
			setState(149);
			exp();
			setState(150);
			match(CP);
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

	public static class FrContext extends ParserRuleContext {
		public TerminalNode LFOR() { return getToken(GramaticaParser.LFOR, 0); }
		public TerminalNode AP() { return getToken(GramaticaParser.AP, 0); }
		public AsignationsContext asignations() {
			return getRuleContext(AsignationsContext.class,0);
		}
		public List<TerminalNode> DEL() { return getTokens(GramaticaParser.DEL); }
		public TerminalNode DEL(int i) {
			return getToken(GramaticaParser.DEL, i);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<EstatutosContext> estatutos() {
			return getRuleContexts(EstatutosContext.class);
		}
		public EstatutosContext estatutos(int i) {
			return getRuleContext(EstatutosContext.class,i);
		}
		public TerminalNode CP() { return getToken(GramaticaParser.CP, 0); }
		public TerminalNode AL() { return getToken(GramaticaParser.AL, 0); }
		public TerminalNode CL() { return getToken(GramaticaParser.CL, 0); }
		public FrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterFr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitFr(this);
		}
	}

	public final FrContext fr() throws RecognitionException {
		FrContext _localctx = new FrContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_fr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(LFOR);
			setState(153);
			match(AP);
			setState(154);
			asignations();
			setState(155);
			match(DEL);
			setState(156);
			exp();
			setState(157);
			match(DEL);
			setState(158);
			estatutos();
			setState(159);
			match(CP);
			setState(160);
			match(AL);
			setState(161);
			estatutos();
			setState(162);
			match(CL);
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

	public static class InstructionsContext extends ParserRuleContext {
		public TerminalNode PINU() { return getToken(GramaticaParser.PINU, 0); }
		public TerminalNode DEL() { return getToken(GramaticaParser.DEL, 0); }
		public TerminalNode PIND() { return getToken(GramaticaParser.PIND, 0); }
		public TerminalNode COL() { return getToken(GramaticaParser.COL, 0); }
		public TerminalNode AP() { return getToken(GramaticaParser.AP, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<TerminalNode> COM() { return getTokens(GramaticaParser.COM); }
		public TerminalNode COM(int i) {
			return getToken(GramaticaParser.COM, i);
		}
		public TerminalNode CP() { return getToken(GramaticaParser.CP, 0); }
		public TerminalNode MOV() { return getToken(GramaticaParser.MOV, 0); }
		public InstructionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instructions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterInstructions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitInstructions(this);
		}
	}

	public final InstructionsContext instructions() throws RecognitionException {
		InstructionsContext _localctx = new InstructionsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_instructions);
		try {
			setState(186);
			switch (_input.LA(1)) {
			case PINU:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				match(PINU);
				setState(165);
				match(DEL);
				}
				break;
			case PIND:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				match(PIND);
				setState(167);
				match(DEL);
				}
				break;
			case COL:
				enterOuterAlt(_localctx, 3);
				{
				setState(168);
				match(COL);
				setState(169);
				match(AP);
				setState(170);
				exp();
				setState(171);
				match(COM);
				setState(172);
				exp();
				setState(173);
				match(COM);
				setState(174);
				exp();
				setState(175);
				match(CP);
				setState(176);
				match(DEL);
				}
				break;
			case MOV:
				enterOuterAlt(_localctx, 4);
				{
				setState(178);
				match(MOV);
				setState(179);
				match(AP);
				setState(180);
				exp();
				setState(181);
				match(COM);
				setState(182);
				exp();
				setState(183);
				match(CP);
				setState(184);
				match(DEL);
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

	public static class EstatutosContext extends ParserRuleContext {
		public EstatutoContext estatuto() {
			return getRuleContext(EstatutoContext.class,0);
		}
		public EstatutosContext estatutos() {
			return getRuleContext(EstatutosContext.class,0);
		}
		public EstatutosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estatutos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterEstatutos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitEstatutos(this);
		}
	}

	public final EstatutosContext estatutos() throws RecognitionException {
		EstatutosContext _localctx = new EstatutosContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_estatutos);
		try {
			setState(192);
			switch (_input.LA(1)) {
			case CP:
			case CL:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case INT:
			case FLT:
			case BOL:
			case CHA:
			case STR:
			case VOID:
			case PRNT:
			case COL:
			case MOV:
			case LWHILE:
			case LDO:
			case LFOR:
			case IF:
			case BRK:
			case RTRN:
			case PINU:
			case PIND:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				estatuto();
				setState(190);
				estatutos();
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

	public static class EstatutoContext extends ParserRuleContext {
		public FunctioncallContext functioncall() {
			return getRuleContext(FunctioncallContext.class,0);
		}
		public FunctiondeclContext functiondecl() {
			return getRuleContext(FunctiondeclContext.class,0);
		}
		public AsignationContext asignation() {
			return getRuleContext(AsignationContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public LoopsContext loops() {
			return getRuleContext(LoopsContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode BRK() { return getToken(GramaticaParser.BRK, 0); }
		public TerminalNode RTRN() { return getToken(GramaticaParser.RTRN, 0); }
		public EstatutoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estatuto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterEstatuto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitEstatuto(this);
		}
	}

	public final EstatutoContext estatuto() throws RecognitionException {
		EstatutoContext _localctx = new EstatutoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_estatuto);
		try {
			setState(203);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				functioncall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				functiondecl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(196);
				asignation();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(197);
				print();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(198);
				instructions();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(199);
				loops();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(200);
				condition();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(201);
				match(BRK);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(202);
				match(RTRN);
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

	public static class OpcContext extends ParserRuleContext {
		public TerminalNode MAY() { return getToken(GramaticaParser.MAY, 0); }
		public TerminalNode MEN() { return getToken(GramaticaParser.MEN, 0); }
		public TerminalNode MAI() { return getToken(GramaticaParser.MAI, 0); }
		public TerminalNode MEI() { return getToken(GramaticaParser.MEI, 0); }
		public TerminalNode OIG() { return getToken(GramaticaParser.OIG, 0); }
		public TerminalNode DIF() { return getToken(GramaticaParser.DIF, 0); }
		public OpcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterOpc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitOpc(this);
		}
	}

	public final OpcContext opc() throws RecognitionException {
		OpcContext _localctx = new OpcContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_opc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAI) | (1L << MEI) | (1L << OIG) | (1L << DIF) | (1L << MAY) | (1L << MEN))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class ExpContext extends ParserRuleContext {
		public ExContext ex() {
			return getRuleContext(ExContext.class,0);
		}
		public Exp2Context exp2() {
			return getRuleContext(Exp2Context.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitExp(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			ex();
			setState(208);
			exp2();
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

	public static class Exp2Context extends ParserRuleContext {
		public OpcContext opc() {
			return getRuleContext(OpcContext.class,0);
		}
		public ExContext ex() {
			return getRuleContext(ExContext.class,0);
		}
		public Exp2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterExp2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitExp2(this);
		}
	}

	public final Exp2Context exp2() throws RecognitionException {
		Exp2Context _localctx = new Exp2Context(_ctx, getState());
		enterRule(_localctx, 40, RULE_exp2);
		try {
			setState(214);
			switch (_input.LA(1)) {
			case EOF:
			case CP:
			case COM:
			case DEL:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case MAI:
			case MEI:
			case OIG:
			case DIF:
			case MAY:
			case MEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				opc();
				setState(212);
				ex();
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

	public static class ExContext extends ParserRuleContext {
		public TerminoContext termino() {
			return getRuleContext(TerminoContext.class,0);
		}
		public Ex2Context ex2() {
			return getRuleContext(Ex2Context.class,0);
		}
		public ExContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterEx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitEx(this);
		}
	}

	public final ExContext ex() throws RecognitionException {
		ExContext _localctx = new ExContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_ex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			termino();
			setState(217);
			ex2();
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

	public static class Ex2Context extends ParserRuleContext {
		public TerminalNode PLS() { return getToken(GramaticaParser.PLS, 0); }
		public ExContext ex() {
			return getRuleContext(ExContext.class,0);
		}
		public TerminalNode SUB() { return getToken(GramaticaParser.SUB, 0); }
		public Ex2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ex2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterEx2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitEx2(this);
		}
	}

	public final Ex2Context ex2() throws RecognitionException {
		Ex2Context _localctx = new Ex2Context(_ctx, getState());
		enterRule(_localctx, 44, RULE_ex2);
		try {
			setState(224);
			switch (_input.LA(1)) {
			case EOF:
			case CP:
			case COM:
			case DEL:
			case MAI:
			case MEI:
			case OIG:
			case DIF:
			case MAY:
			case MEN:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case PLS:
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				match(PLS);
				setState(221);
				ex();
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 3);
				{
				setState(222);
				match(SUB);
				setState(223);
				ex();
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

	public static class TerminoContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public Termino2Context termino2() {
			return getRuleContext(Termino2Context.class,0);
		}
		public TerminoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termino; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterTermino(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitTermino(this);
		}
	}

	public final TerminoContext termino() throws RecognitionException {
		TerminoContext _localctx = new TerminoContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_termino);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			factor();
			setState(227);
			termino2();
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

	public static class Termino2Context extends ParserRuleContext {
		public TerminalNode MLT() { return getToken(GramaticaParser.MLT, 0); }
		public TerminoContext termino() {
			return getRuleContext(TerminoContext.class,0);
		}
		public TerminalNode DIV() { return getToken(GramaticaParser.DIV, 0); }
		public Termino2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termino2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterTermino2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitTermino2(this);
		}
	}

	public final Termino2Context termino2() throws RecognitionException {
		Termino2Context _localctx = new Termino2Context(_ctx, getState());
		enterRule(_localctx, 48, RULE_termino2);
		try {
			setState(234);
			switch (_input.LA(1)) {
			case EOF:
			case CP:
			case COM:
			case DEL:
			case PLS:
			case SUB:
			case MAI:
			case MEI:
			case OIG:
			case DIF:
			case MAY:
			case MEN:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case MLT:
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				match(MLT);
				setState(231);
				termino();
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 3);
				{
				setState(232);
				match(DIV);
				setState(233);
				termino();
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

	public static class FactorContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(GramaticaParser.AP, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode CP() { return getToken(GramaticaParser.CP, 0); }
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public TerminalNode PLS() { return getToken(GramaticaParser.PLS, 0); }
		public TerminalNode SUB() { return getToken(GramaticaParser.SUB, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_factor);
		try {
			setState(245);
			switch (_input.LA(1)) {
			case AP:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				match(AP);
				setState(237);
				exp();
				setState(238);
				match(CP);
				}
				break;
			case CTEC:
			case CTES:
			case CTEF:
			case CTEI:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
				val();
				}
				break;
			case PLS:
				enterOuterAlt(_localctx, 3);
				{
				setState(241);
				match(PLS);
				setState(242);
				val();
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 4);
				{
				setState(243);
				match(SUB);
				setState(244);
				val();
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

	public static class ValContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public TerminalNode CTES() { return getToken(GramaticaParser.CTES, 0); }
		public TerminalNode CTEC() { return getToken(GramaticaParser.CTEC, 0); }
		public TerminalNode CTEI() { return getToken(GramaticaParser.CTEI, 0); }
		public TerminalNode CTEF() { return getToken(GramaticaParser.CTEF, 0); }
		public ValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitVal(this);
		}
	}

	public final ValContext val() throws RecognitionException {
		ValContext _localctx = new ValContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_val);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CTEC) | (1L << CTES) | (1L << CTEF) | (1L << CTEI) | (1L << ID))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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
		public TerminalNode INT() { return getToken(GramaticaParser.INT, 0); }
		public TerminalNode FLT() { return getToken(GramaticaParser.FLT, 0); }
		public TerminalNode BOL() { return getToken(GramaticaParser.BOL, 0); }
		public TerminalNode CHA() { return getToken(GramaticaParser.CHA, 0); }
		public TerminalNode STR() { return getToken(GramaticaParser.STR, 0); }
		public TerminalNode VOID() { return getToken(GramaticaParser.VOID, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLT) | (1L << BOL) | (1L << CHA) | (1L << STR) | (1L << VOID))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3.\u00fe\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\5\2H\n\2\3\3\3\3\5\3L\n\3\3\4\3\4\3\5\3\5\3\5\5"+
		"\5S\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\5\tq\n\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\5\r\u0088\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5"+
		"\21\u00bd\n\21\3\22\3\22\3\22\3\22\5\22\u00c3\n\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\5\23\u00ce\n\23\3\24\3\24\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\5\26\u00d9\n\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30"+
		"\5\30\u00e3\n\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\5\32\u00ed\n"+
		"\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u00f8\n\33\3\34"+
		"\3\34\3\35\3\35\3\35\2\2\36\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\668\2\5\3\2$)\3\2*.\3\2\t\16\u00fc\2G\3\2\2\2\4K\3\2\2"+
		"\2\6M\3\2\2\2\bR\3\2\2\2\nT\3\2\2\2\fZ\3\2\2\2\16c\3\2\2\2\20p\3\2\2\2"+
		"\22r\3\2\2\2\24w\3\2\2\2\26{\3\2\2\2\30\u0087\3\2\2\2\32\u0089\3\2\2\2"+
		"\34\u0091\3\2\2\2\36\u009a\3\2\2\2 \u00bc\3\2\2\2\"\u00c2\3\2\2\2$\u00cd"+
		"\3\2\2\2&\u00cf\3\2\2\2(\u00d1\3\2\2\2*\u00d8\3\2\2\2,\u00da\3\2\2\2."+
		"\u00e2\3\2\2\2\60\u00e4\3\2\2\2\62\u00ec\3\2\2\2\64\u00f7\3\2\2\2\66\u00f9"+
		"\3\2\2\28\u00fb\3\2\2\2:H\3\2\2\2;<\7\34\2\2<=\7\22\2\2=>\7+\2\2>?\7\36"+
		"\2\2?H\5\2\2\2@A\7\34\2\2AB\7\22\2\2BC\7)\2\2CD\7+\2\2DE\7(\2\2EF\7\36"+
		"\2\2FH\5\2\2\2G:\3\2\2\2G;\3\2\2\2G@\3\2\2\2H\3\3\2\2\2IL\3\2\2\2JL\5"+
		"\6\4\2KI\3\2\2\2KJ\3\2\2\2L\5\3\2\2\2MN\5(\25\2N\7\3\2\2\2OS\3\2\2\2P"+
		"Q\7\b\2\2QS\5\6\4\2RO\3\2\2\2RP\3\2\2\2S\t\3\2\2\2TU\7.\2\2UV\7\4\2\2"+
		"VW\5\4\3\2WX\7\5\2\2XY\7\36\2\2Y\13\3\2\2\2Z[\58\35\2[\\\7.\2\2\\]\7\4"+
		"\2\2]^\5\4\3\2^_\7\5\2\2_`\7\6\2\2`a\5\"\22\2ab\7\7\2\2b\r\3\2\2\2cd\7"+
		"\t\2\2de\7\23\2\2ef\7\4\2\2fg\5\4\3\2gh\7\5\2\2hi\7\6\2\2ij\5\"\22\2j"+
		"k\7\7\2\2k\17\3\2\2\2lq\3\2\2\2mn\5\22\n\2no\5\20\t\2oq\3\2\2\2pl\3\2"+
		"\2\2pm\3\2\2\2q\21\3\2\2\2rs\7.\2\2st\7\35\2\2tu\5(\25\2uv\7\36\2\2v\23"+
		"\3\2\2\2wx\7\17\2\2xy\5(\25\2yz\7\36\2\2z\25\3\2\2\2{|\7\27\2\2|}\7\4"+
		"\2\2}~\5(\25\2~\177\7\5\2\2\177\u0080\7\6\2\2\u0080\u0081\5\"\22\2\u0081"+
		"\u0082\7\7\2\2\u0082\u0083\7\36\2\2\u0083\27\3\2\2\2\u0084\u0088\5\32"+
		"\16\2\u0085\u0088\5\36\20\2\u0086\u0088\5\34\17\2\u0087\u0084\3\2\2\2"+
		"\u0087\u0085\3\2\2\2\u0087\u0086\3\2\2\2\u0088\31\3\2\2\2\u0089\u008a"+
		"\7\24\2\2\u008a\u008b\7\4\2\2\u008b\u008c\5(\25\2\u008c\u008d\7\5\2\2"+
		"\u008d\u008e\7\6\2\2\u008e\u008f\5\"\22\2\u008f\u0090\7\7\2\2\u0090\33"+
		"\3\2\2\2\u0091\u0092\7\25\2\2\u0092\u0093\7\6\2\2\u0093\u0094\5\"\22\2"+
		"\u0094\u0095\7\7\2\2\u0095\u0096\7\24\2\2\u0096\u0097\7\4\2\2\u0097\u0098"+
		"\5(\25\2\u0098\u0099\7\5\2\2\u0099\35\3\2\2\2\u009a\u009b\7\26\2\2\u009b"+
		"\u009c\7\4\2\2\u009c\u009d\5\20\t\2\u009d\u009e\7\36\2\2\u009e\u009f\5"+
		"(\25\2\u009f\u00a0\7\36\2\2\u00a0\u00a1\5\"\22\2\u00a1\u00a2\7\5\2\2\u00a2"+
		"\u00a3\7\6\2\2\u00a3\u00a4\5\"\22\2\u00a4\u00a5\7\7\2\2\u00a5\37\3\2\2"+
		"\2\u00a6\u00a7\7\32\2\2\u00a7\u00bd\7\36\2\2\u00a8\u00a9\7\33\2\2\u00a9"+
		"\u00bd\7\36\2\2\u00aa\u00ab\7\20\2\2\u00ab\u00ac\7\4\2\2\u00ac\u00ad\5"+
		"(\25\2\u00ad\u00ae\7\b\2\2\u00ae\u00af\5(\25\2\u00af\u00b0\7\b\2\2\u00b0"+
		"\u00b1\5(\25\2\u00b1\u00b2\7\5\2\2\u00b2\u00b3\7\36\2\2\u00b3\u00bd\3"+
		"\2\2\2\u00b4\u00b5\7\21\2\2\u00b5\u00b6\7\4\2\2\u00b6\u00b7\5(\25\2\u00b7"+
		"\u00b8\7\b\2\2\u00b8\u00b9\5(\25\2\u00b9\u00ba\7\5\2\2\u00ba\u00bb\7\36"+
		"\2\2\u00bb\u00bd\3\2\2\2\u00bc\u00a6\3\2\2\2\u00bc\u00a8\3\2\2\2\u00bc"+
		"\u00aa\3\2\2\2\u00bc\u00b4\3\2\2\2\u00bd!\3\2\2\2\u00be\u00c3\3\2\2\2"+
		"\u00bf\u00c0\5$\23\2\u00c0\u00c1\5\"\22\2\u00c1\u00c3\3\2\2\2\u00c2\u00be"+
		"\3\2\2\2\u00c2\u00bf\3\2\2\2\u00c3#\3\2\2\2\u00c4\u00ce\5\n\6\2\u00c5"+
		"\u00ce\5\f\7\2\u00c6\u00ce\5\22\n\2\u00c7\u00ce\5\24\13\2\u00c8\u00ce"+
		"\5 \21\2\u00c9\u00ce\5\30\r\2\u00ca\u00ce\5\26\f\2\u00cb\u00ce\7\30\2"+
		"\2\u00cc\u00ce\7\31\2\2\u00cd\u00c4\3\2\2\2\u00cd\u00c5\3\2\2\2\u00cd"+
		"\u00c6\3\2\2\2\u00cd\u00c7\3\2\2\2\u00cd\u00c8\3\2\2\2\u00cd\u00c9\3\2"+
		"\2\2\u00cd\u00ca\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00cc\3\2\2\2\u00ce"+
		"%\3\2\2\2\u00cf\u00d0\t\2\2\2\u00d0\'\3\2\2\2\u00d1\u00d2\5,\27\2\u00d2"+
		"\u00d3\5*\26\2\u00d3)\3\2\2\2\u00d4\u00d9\3\2\2\2\u00d5\u00d6\5&\24\2"+
		"\u00d6\u00d7\5,\27\2\u00d7\u00d9\3\2\2\2\u00d8\u00d4\3\2\2\2\u00d8\u00d5"+
		"\3\2\2\2\u00d9+\3\2\2\2\u00da\u00db\5\60\31\2\u00db\u00dc\5.\30\2\u00dc"+
		"-\3\2\2\2\u00dd\u00e3\3\2\2\2\u00de\u00df\7\"\2\2\u00df\u00e3\5,\27\2"+
		"\u00e0\u00e1\7#\2\2\u00e1\u00e3\5,\27\2\u00e2\u00dd\3\2\2\2\u00e2\u00de"+
		"\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3/\3\2\2\2\u00e4\u00e5\5\64\33\2\u00e5"+
		"\u00e6\5\62\32\2\u00e6\61\3\2\2\2\u00e7\u00ed\3\2\2\2\u00e8\u00e9\7\37"+
		"\2\2\u00e9\u00ed\5\60\31\2\u00ea\u00eb\7 \2\2\u00eb\u00ed\5\60\31\2\u00ec"+
		"\u00e7\3\2\2\2\u00ec\u00e8\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\63\3\2\2"+
		"\2\u00ee\u00ef\7\4\2\2\u00ef\u00f0\5(\25\2\u00f0\u00f1\7\5\2\2\u00f1\u00f8"+
		"\3\2\2\2\u00f2\u00f8\5\66\34\2\u00f3\u00f4\7\"\2\2\u00f4\u00f8\5\66\34"+
		"\2\u00f5\u00f6\7#\2\2\u00f6\u00f8\5\66\34\2\u00f7\u00ee\3\2\2\2\u00f7"+
		"\u00f2\3\2\2\2\u00f7\u00f3\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8\65\3\2\2"+
		"\2\u00f9\u00fa\t\3\2\2\u00fa\67\3\2\2\2\u00fb\u00fc\t\4\2\2\u00fc9\3\2"+
		"\2\2\16GKRp\u0087\u00bc\u00c2\u00cd\u00d8\u00e2\u00ec\u00f7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}