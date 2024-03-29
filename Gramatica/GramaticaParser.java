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
		WS=1, OP=2, CP=3, OK=4, CK=5, OB=6, CB=7, COM=8, INT=9, FLT=10, BOL=11, 
		CHA=12, STR=13, VOID=14, INCL=15, MAIN=16, LWHILE=17, LDO=18, LFOR=19, 
		CIF=20, CELSE=21, BRK=22, RTRN=23, PINU=24, PIND=25, COL=26, PRNT=27, 
		MOV=28, OAND=29, OOR=30, ONOT=31, HT=32, IGU=33, DEL=34, MLT=35, DIV=36, 
		MOD=37, PLS=38, SUB=39, MAI=40, MEI=41, OIG=42, DIF=43, MAY=44, MEN=45, 
		CTEC=46, CTES=47, CTEF=48, CTEI=49, ID=50;
	public static final int
		RULE_init = 0, RULE_includes = 1, RULE_include = 2, RULE_include2 = 3, 
		RULE_functions = 4, RULE_functiondecl = 5, RULE_maindecl = 6, RULE_type = 7, 
		RULE_params = 8, RULE_params2 = 9, RULE_params3 = 10, RULE_declaration = 11, 
		RULE_declaration2 = 12, RULE_singledim = 13, RULE_multidim = 14, RULE_dimd = 15, 
		RULE_dimd2 = 16, RULE_asignations = 17, RULE_asignations2 = 18, RULE_asignation = 19, 
		RULE_asignation2 = 20, RULE_dima = 21, RULE_dima2 = 22, RULE_estatutos = 23, 
		RULE_estatuto = 24, RULE_loops = 25, RULE_llwhile = 26, RULE_llfor = 27, 
		RULE_lldowhile = 28, RULE_functioncall = 29, RULE_conditional = 30, RULE_conditional2 = 31, 
		RULE_print = 32, RULE_instructions = 33, RULE_exp = 34, RULE_exp2 = 35, 
		RULE_exo = 36, RULE_exo2 = 37, RULE_exn = 38, RULE_exn2 = 39, RULE_exi = 40, 
		RULE_exi2 = 41, RULE_exm = 42, RULE_exm2 = 43, RULE_ex = 44, RULE_ex2 = 45, 
		RULE_termino = 46, RULE_termino2 = 47, RULE_factor = 48, RULE_var = 49, 
		RULE_cte = 50;
	public static final String[] ruleNames = {
		"init", "includes", "include", "include2", "functions", "functiondecl", 
		"maindecl", "type", "params", "params2", "params3", "declaration", "declaration2", 
		"singledim", "multidim", "dimd", "dimd2", "asignations", "asignations2", 
		"asignation", "asignation2", "dima", "dima2", "estatutos", "estatuto", 
		"loops", "llwhile", "llfor", "lldowhile", "functioncall", "conditional", 
		"conditional2", "print", "instructions", "exp", "exp2", "exo", "exo2", 
		"exn", "exn2", "exi", "exi2", "exm", "exm2", "ex", "ex2", "termino", "termino2", 
		"factor", "var", "cte"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'('", "')'", "'{'", "'}'", "'['", "']'", "','", "'ent'", 
		"'dec'", "'bool'", "'cad'", "'car'", "'nada'", "'incluir'", "'main'", 
		"'mientras'", "'hacer'", "'para'", "'si'", "'sino'", "'romper'", "'regresar'", 
		"'pintar'", "'flotar'", "'color'", "'imprime'", "'mover'", "'&&'", "'||'", 
		"'!'", "'#'", "'='", "';'", "'*'", "'/'", "'%'", "'+'", "'-'", "'>='", 
		"'<='", "'=='", "'!='", "'>'", "'<'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WS", "OP", "CP", "OK", "CK", "OB", "CB", "COM", "INT", "FLT", "BOL", 
		"CHA", "STR", "VOID", "INCL", "MAIN", "LWHILE", "LDO", "LFOR", "CIF", 
		"CELSE", "BRK", "RTRN", "PINU", "PIND", "COL", "PRNT", "MOV", "OAND", 
		"OOR", "ONOT", "HT", "IGU", "DEL", "MLT", "DIV", "MOD", "PLS", "SUB", 
		"MAI", "MEI", "OIG", "DIF", "MAY", "MEN", "CTEC", "CTES", "CTEF", "CTEI", 
		"ID"
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
	public static class InitContext extends ParserRuleContext {
		public IncludesContext includes() {
			return getRuleContext(IncludesContext.class,0);
		}
		public FunctionsContext functions() {
			return getRuleContext(FunctionsContext.class,0);
		}
		public MaindeclContext maindecl() {
			return getRuleContext(MaindeclContext.class,0);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitInit(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			includes();
			setState(103);
			functions();
			setState(104);
			maindecl();
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

	public static class IncludesContext extends ParserRuleContext {
		public IncludeContext include() {
			return getRuleContext(IncludeContext.class,0);
		}
		public IncludesContext includes() {
			return getRuleContext(IncludesContext.class,0);
		}
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
		enterRule(_localctx, 2, RULE_includes);
		try {
			setState(110);
			switch (_input.LA(1)) {
			case INT:
			case FLT:
			case BOL:
			case STR:
			case VOID:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case HT:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				include();
				setState(108);
				includes();
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

	public static class IncludeContext extends ParserRuleContext {
		public TerminalNode HT() { return getToken(GramaticaParser.HT, 0); }
		public TerminalNode INCL() { return getToken(GramaticaParser.INCL, 0); }
		public Include2Context include2() {
			return getRuleContext(Include2Context.class,0);
		}
		public IncludeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_include; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterInclude(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitInclude(this);
		}
	}

	public final IncludeContext include() throws RecognitionException {
		IncludeContext _localctx = new IncludeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_include);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(HT);
			setState(113);
			match(INCL);
			setState(114);
			include2();
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

	public static class Include2Context extends ParserRuleContext {
		public TerminalNode CTES() { return getToken(GramaticaParser.CTES, 0); }
		public TerminalNode MEN() { return getToken(GramaticaParser.MEN, 0); }
		public TerminalNode MAY() { return getToken(GramaticaParser.MAY, 0); }
		public Include2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_include2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterInclude2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitInclude2(this);
		}
	}

	public final Include2Context include2() throws RecognitionException {
		Include2Context _localctx = new Include2Context(_ctx, getState());
		enterRule(_localctx, 6, RULE_include2);
		try {
			setState(120);
			switch (_input.LA(1)) {
			case CTES:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				match(CTES);
				}
				break;
			case MEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				match(MEN);
				setState(118);
				match(CTES);
				setState(119);
				match(MAY);
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

	public static class FunctionsContext extends ParserRuleContext {
		public FunctiondeclContext functiondecl() {
			return getRuleContext(FunctiondeclContext.class,0);
		}
		public FunctionsContext functions() {
			return getRuleContext(FunctionsContext.class,0);
		}
		public FunctionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterFunctions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitFunctions(this);
		}
	}

	public final FunctionsContext functions() throws RecognitionException {
		FunctionsContext _localctx = new FunctionsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_functions);
		try {
			setState(126);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				functiondecl();
				setState(124);
				functions();
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

	public static class FunctiondeclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public TerminalNode OP() { return getToken(GramaticaParser.OP, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode CP() { return getToken(GramaticaParser.CP, 0); }
		public TerminalNode OK() { return getToken(GramaticaParser.OK, 0); }
		public EstatutosContext estatutos() {
			return getRuleContext(EstatutosContext.class,0);
		}
		public TerminalNode CK() { return getToken(GramaticaParser.CK, 0); }
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
			setState(128);
			type();
			setState(129);
			match(ID);
			setState(130);
			match(OP);
			setState(131);
			params();
			setState(132);
			match(CP);
			setState(133);
			match(OK);
			setState(134);
			estatutos();
			setState(135);
			match(CK);
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

	public static class MaindeclContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GramaticaParser.INT, 0); }
		public TerminalNode MAIN() { return getToken(GramaticaParser.MAIN, 0); }
		public TerminalNode OP() { return getToken(GramaticaParser.OP, 0); }
		public TerminalNode CP() { return getToken(GramaticaParser.CP, 0); }
		public TerminalNode OK() { return getToken(GramaticaParser.OK, 0); }
		public EstatutosContext estatutos() {
			return getRuleContext(EstatutosContext.class,0);
		}
		public TerminalNode CK() { return getToken(GramaticaParser.CK, 0); }
		public MaindeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maindecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterMaindecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitMaindecl(this);
		}
	}

	public final MaindeclContext maindecl() throws RecognitionException {
		MaindeclContext _localctx = new MaindeclContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_maindecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(INT);
			setState(138);
			match(MAIN);
			setState(139);
			match(OP);
			setState(140);
			match(CP);
			setState(141);
			match(OK);
			setState(142);
			estatutos();
			setState(143);
			match(CK);
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
		enterRule(_localctx, 14, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLT) | (1L << BOL) | (1L << STR) | (1L << VOID))) != 0)) ) {
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
		enterRule(_localctx, 16, RULE_params);
		try {
			setState(149);
			switch (_input.LA(1)) {
			case CP:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case INT:
			case FLT:
			case BOL:
			case STR:
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
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
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public Params3Context params3() {
			return getRuleContext(Params3Context.class,0);
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
		enterRule(_localctx, 18, RULE_params2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			declaration();
			setState(152);
			params3();
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
		enterRule(_localctx, 20, RULE_params3);
		try {
			setState(157);
			switch (_input.LA(1)) {
			case CP:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case COM:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				match(COM);
				setState(156);
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

	public static class DeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Declaration2Context declaration2() {
			return getRuleContext(Declaration2Context.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			type();
			setState(160);
			declaration2();
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

	public static class Declaration2Context extends ParserRuleContext {
		public SingledimContext singledim() {
			return getRuleContext(SingledimContext.class,0);
		}
		public MultidimContext multidim() {
			return getRuleContext(MultidimContext.class,0);
		}
		public Declaration2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterDeclaration2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitDeclaration2(this);
		}
	}

	public final Declaration2Context declaration2() throws RecognitionException {
		Declaration2Context _localctx = new Declaration2Context(_ctx, getState());
		enterRule(_localctx, 24, RULE_declaration2);
		try {
			setState(164);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				singledim();
				}
				break;
			case OB:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				multidim();
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

	public static class SingledimContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public TerminalNode DEL() { return getToken(GramaticaParser.DEL, 0); }
		public SingledimContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singledim; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterSingledim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitSingledim(this);
		}
	}

	public final SingledimContext singledim() throws RecognitionException {
		SingledimContext _localctx = new SingledimContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_singledim);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(ID);
			setState(167);
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

	public static class MultidimContext extends ParserRuleContext {
		public TerminalNode OB() { return getToken(GramaticaParser.OB, 0); }
		public DimdContext dimd() {
			return getRuleContext(DimdContext.class,0);
		}
		public TerminalNode CB() { return getToken(GramaticaParser.CB, 0); }
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public TerminalNode DEL() { return getToken(GramaticaParser.DEL, 0); }
		public MultidimContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multidim; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterMultidim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitMultidim(this);
		}
	}

	public final MultidimContext multidim() throws RecognitionException {
		MultidimContext _localctx = new MultidimContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_multidim);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(OB);
			setState(170);
			dimd();
			setState(171);
			match(CB);
			setState(172);
			match(ID);
			setState(173);
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

	public static class DimdContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Dimd2Context dimd2() {
			return getRuleContext(Dimd2Context.class,0);
		}
		public DimdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterDimd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitDimd(this);
		}
	}

	public final DimdContext dimd() throws RecognitionException {
		DimdContext _localctx = new DimdContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_dimd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			exp();
			setState(176);
			dimd2();
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

	public static class Dimd2Context extends ParserRuleContext {
		public TerminalNode COM() { return getToken(GramaticaParser.COM, 0); }
		public DimdContext dimd() {
			return getRuleContext(DimdContext.class,0);
		}
		public Dimd2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimd2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterDimd2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitDimd2(this);
		}
	}

	public final Dimd2Context dimd2() throws RecognitionException {
		Dimd2Context _localctx = new Dimd2Context(_ctx, getState());
		enterRule(_localctx, 32, RULE_dimd2);
		try {
			setState(181);
			switch (_input.LA(1)) {
			case CB:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case COM:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				match(COM);
				setState(180);
				dimd();
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

	public static class AsignationsContext extends ParserRuleContext {
		public AsignationContext asignation() {
			return getRuleContext(AsignationContext.class,0);
		}
		public Asignations2Context asignations2() {
			return getRuleContext(Asignations2Context.class,0);
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
		enterRule(_localctx, 34, RULE_asignations);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			asignation();
			setState(184);
			asignations2();
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

	public static class Asignations2Context extends ParserRuleContext {
		public AsignationContext asignation() {
			return getRuleContext(AsignationContext.class,0);
		}
		public Asignations2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignations2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterAsignations2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitAsignations2(this);
		}
	}

	public final Asignations2Context asignations2() throws RecognitionException {
		Asignations2Context _localctx = new Asignations2Context(_ctx, getState());
		enterRule(_localctx, 36, RULE_asignations2);
		try {
			setState(188);
			switch (_input.LA(1)) {
			case CP:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				asignation();
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
		public Asignation2Context asignation2() {
			return getRuleContext(Asignation2Context.class,0);
		}
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
		enterRule(_localctx, 38, RULE_asignation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(ID);
			setState(191);
			asignation2();
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

	public static class Asignation2Context extends ParserRuleContext {
		public TerminalNode IGU() { return getToken(GramaticaParser.IGU, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode OB() { return getToken(GramaticaParser.OB, 0); }
		public DimaContext dima() {
			return getRuleContext(DimaContext.class,0);
		}
		public TerminalNode CB() { return getToken(GramaticaParser.CB, 0); }
		public Asignation2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignation2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterAsignation2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitAsignation2(this);
		}
	}

	public final Asignation2Context asignation2() throws RecognitionException {
		Asignation2Context _localctx = new Asignation2Context(_ctx, getState());
		enterRule(_localctx, 40, RULE_asignation2);
		try {
			setState(201);
			switch (_input.LA(1)) {
			case IGU:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				match(IGU);
				setState(194);
				exp();
				}
				break;
			case OB:
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				match(OB);
				setState(196);
				dima();
				setState(197);
				match(CB);
				setState(198);
				match(IGU);
				setState(199);
				exp();
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

	public static class DimaContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Dima2Context dima2() {
			return getRuleContext(Dima2Context.class,0);
		}
		public DimaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dima; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterDima(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitDima(this);
		}
	}

	public final DimaContext dima() throws RecognitionException {
		DimaContext _localctx = new DimaContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_dima);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			exp();
			setState(204);
			dima2();
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

	public static class Dima2Context extends ParserRuleContext {
		public TerminalNode COM() { return getToken(GramaticaParser.COM, 0); }
		public DimaContext dima() {
			return getRuleContext(DimaContext.class,0);
		}
		public Dima2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dima2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterDima2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitDima2(this);
		}
	}

	public final Dima2Context dima2() throws RecognitionException {
		Dima2Context _localctx = new Dima2Context(_ctx, getState());
		enterRule(_localctx, 44, RULE_dima2);
		try {
			setState(209);
			switch (_input.LA(1)) {
			case CB:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case COM:
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				match(COM);
				setState(208);
				dima();
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
		enterRule(_localctx, 46, RULE_estatutos);
		try {
			setState(215);
			switch (_input.LA(1)) {
			case CK:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case INT:
			case FLT:
			case BOL:
			case STR:
			case VOID:
			case LWHILE:
			case LDO:
			case LFOR:
			case CIF:
			case BRK:
			case RTRN:
			case PINU:
			case PIND:
			case COL:
			case PRNT:
			case MOV:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				estatuto();
				setState(213);
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
		public TerminalNode BRK() { return getToken(GramaticaParser.BRK, 0); }
		public TerminalNode RTRN() { return getToken(GramaticaParser.RTRN, 0); }
		public FunctioncallContext functioncall() {
			return getRuleContext(FunctioncallContext.class,0);
		}
		public AsignationContext asignation() {
			return getRuleContext(AsignationContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
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
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
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
		enterRule(_localctx, 48, RULE_estatuto);
		try {
			setState(226);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				match(BRK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
				match(RTRN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(219);
				functioncall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(220);
				asignation();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(221);
				declaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(222);
				print();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(223);
				instructions();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(224);
				loops();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(225);
				conditional();
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

	public static class LoopsContext extends ParserRuleContext {
		public LlwhileContext llwhile() {
			return getRuleContext(LlwhileContext.class,0);
		}
		public LldowhileContext lldowhile() {
			return getRuleContext(LldowhileContext.class,0);
		}
		public LlforContext llfor() {
			return getRuleContext(LlforContext.class,0);
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
		enterRule(_localctx, 50, RULE_loops);
		try {
			setState(231);
			switch (_input.LA(1)) {
			case LWHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(228);
				llwhile();
				}
				break;
			case LDO:
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				lldowhile();
				}
				break;
			case LFOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(230);
				llfor();
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

	public static class LlwhileContext extends ParserRuleContext {
		public TerminalNode LWHILE() { return getToken(GramaticaParser.LWHILE, 0); }
		public TerminalNode OP() { return getToken(GramaticaParser.OP, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode CP() { return getToken(GramaticaParser.CP, 0); }
		public TerminalNode OK() { return getToken(GramaticaParser.OK, 0); }
		public EstatutosContext estatutos() {
			return getRuleContext(EstatutosContext.class,0);
		}
		public TerminalNode CK() { return getToken(GramaticaParser.CK, 0); }
		public LlwhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llwhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterLlwhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitLlwhile(this);
		}
	}

	public final LlwhileContext llwhile() throws RecognitionException {
		LlwhileContext _localctx = new LlwhileContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_llwhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(LWHILE);
			setState(234);
			match(OP);
			setState(235);
			exp();
			setState(236);
			match(CP);
			setState(237);
			match(OK);
			setState(238);
			estatutos();
			setState(239);
			match(CK);
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

	public static class LlforContext extends ParserRuleContext {
		public TerminalNode LFOR() { return getToken(GramaticaParser.LFOR, 0); }
		public TerminalNode OP() { return getToken(GramaticaParser.OP, 0); }
		public AsignationContext asignation() {
			return getRuleContext(AsignationContext.class,0);
		}
		public List<TerminalNode> DEL() { return getTokens(GramaticaParser.DEL); }
		public TerminalNode DEL(int i) {
			return getToken(GramaticaParser.DEL, i);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public AsignationsContext asignations() {
			return getRuleContext(AsignationsContext.class,0);
		}
		public TerminalNode CP() { return getToken(GramaticaParser.CP, 0); }
		public TerminalNode OK() { return getToken(GramaticaParser.OK, 0); }
		public EstatutosContext estatutos() {
			return getRuleContext(EstatutosContext.class,0);
		}
		public TerminalNode CK() { return getToken(GramaticaParser.CK, 0); }
		public LlforContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llfor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterLlfor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitLlfor(this);
		}
	}

	public final LlforContext llfor() throws RecognitionException {
		LlforContext _localctx = new LlforContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_llfor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(LFOR);
			setState(242);
			match(OP);
			setState(243);
			asignation();
			setState(244);
			match(DEL);
			setState(245);
			exp();
			setState(246);
			match(DEL);
			setState(247);
			asignations();
			setState(248);
			match(CP);
			setState(249);
			match(OK);
			setState(250);
			estatutos();
			setState(251);
			match(CK);
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

	public static class LldowhileContext extends ParserRuleContext {
		public TerminalNode LDO() { return getToken(GramaticaParser.LDO, 0); }
		public TerminalNode OK() { return getToken(GramaticaParser.OK, 0); }
		public EstatutosContext estatutos() {
			return getRuleContext(EstatutosContext.class,0);
		}
		public TerminalNode CK() { return getToken(GramaticaParser.CK, 0); }
		public TerminalNode LWHILE() { return getToken(GramaticaParser.LWHILE, 0); }
		public TerminalNode OP() { return getToken(GramaticaParser.OP, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode CP() { return getToken(GramaticaParser.CP, 0); }
		public LldowhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lldowhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterLldowhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitLldowhile(this);
		}
	}

	public final LldowhileContext lldowhile() throws RecognitionException {
		LldowhileContext _localctx = new LldowhileContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_lldowhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(LDO);
			setState(254);
			match(OK);
			setState(255);
			estatutos();
			setState(256);
			match(CK);
			setState(257);
			match(LWHILE);
			setState(258);
			match(OP);
			setState(259);
			exp();
			setState(260);
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

	public static class FunctioncallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public TerminalNode OP() { return getToken(GramaticaParser.OP, 0); }
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
		enterRule(_localctx, 58, RULE_functioncall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(ID);
			setState(263);
			match(OP);
			setState(264);
			params();
			setState(265);
			match(CP);
			setState(266);
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

	public static class ConditionalContext extends ParserRuleContext {
		public TerminalNode CIF() { return getToken(GramaticaParser.CIF, 0); }
		public TerminalNode OP() { return getToken(GramaticaParser.OP, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode CP() { return getToken(GramaticaParser.CP, 0); }
		public TerminalNode OK() { return getToken(GramaticaParser.OK, 0); }
		public EstatutosContext estatutos() {
			return getRuleContext(EstatutosContext.class,0);
		}
		public TerminalNode CK() { return getToken(GramaticaParser.CK, 0); }
		public Conditional2Context conditional2() {
			return getRuleContext(Conditional2Context.class,0);
		}
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitConditional(this);
		}
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_conditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(CIF);
			setState(269);
			match(OP);
			setState(270);
			exp();
			setState(271);
			match(CP);
			setState(272);
			match(OK);
			setState(273);
			estatutos();
			setState(274);
			match(CK);
			setState(275);
			conditional2();
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

	public static class Conditional2Context extends ParserRuleContext {
		public TerminalNode CELSE() { return getToken(GramaticaParser.CELSE, 0); }
		public TerminalNode OK() { return getToken(GramaticaParser.OK, 0); }
		public EstatutosContext estatutos() {
			return getRuleContext(EstatutosContext.class,0);
		}
		public TerminalNode CK() { return getToken(GramaticaParser.CK, 0); }
		public Conditional2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterConditional2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitConditional2(this);
		}
	}

	public final Conditional2Context conditional2() throws RecognitionException {
		Conditional2Context _localctx = new Conditional2Context(_ctx, getState());
		enterRule(_localctx, 62, RULE_conditional2);
		try {
			setState(283);
			switch (_input.LA(1)) {
			case CK:
			case INT:
			case FLT:
			case BOL:
			case STR:
			case VOID:
			case LWHILE:
			case LDO:
			case LFOR:
			case CIF:
			case BRK:
			case RTRN:
			case PINU:
			case PIND:
			case COL:
			case PRNT:
			case MOV:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case CELSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(278);
				match(CELSE);
				setState(279);
				match(OK);
				setState(280);
				estatutos();
				setState(281);
				match(CK);
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
		enterRule(_localctx, 64, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(PRNT);
			setState(286);
			exp();
			setState(287);
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

	public static class InstructionsContext extends ParserRuleContext {
		public TerminalNode PINU() { return getToken(GramaticaParser.PINU, 0); }
		public TerminalNode DEL() { return getToken(GramaticaParser.DEL, 0); }
		public TerminalNode PIND() { return getToken(GramaticaParser.PIND, 0); }
		public TerminalNode COL() { return getToken(GramaticaParser.COL, 0); }
		public TerminalNode OP() { return getToken(GramaticaParser.OP, 0); }
		public List<TerminalNode> CTEI() { return getTokens(GramaticaParser.CTEI); }
		public TerminalNode CTEI(int i) {
			return getToken(GramaticaParser.CTEI, i);
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
		enterRule(_localctx, 66, RULE_instructions);
		try {
			setState(307);
			switch (_input.LA(1)) {
			case PINU:
				enterOuterAlt(_localctx, 1);
				{
				setState(289);
				match(PINU);
				setState(290);
				match(DEL);
				}
				break;
			case PIND:
				enterOuterAlt(_localctx, 2);
				{
				setState(291);
				match(PIND);
				setState(292);
				match(DEL);
				}
				break;
			case COL:
				enterOuterAlt(_localctx, 3);
				{
				setState(293);
				match(COL);
				setState(294);
				match(OP);
				setState(295);
				match(CTEI);
				setState(296);
				match(COM);
				setState(297);
				match(CTEI);
				setState(298);
				match(COM);
				setState(299);
				match(CTEI);
				setState(300);
				match(CP);
				}
				break;
			case MOV:
				enterOuterAlt(_localctx, 4);
				{
				setState(301);
				match(MOV);
				setState(302);
				match(OP);
				setState(303);
				match(CTEI);
				setState(304);
				match(COM);
				setState(305);
				match(CTEI);
				setState(306);
				match(CP);
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

	public static class ExpContext extends ParserRuleContext {
		public ExoContext exo() {
			return getRuleContext(ExoContext.class,0);
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
		enterRule(_localctx, 68, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			exo();
			setState(310);
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
		public TerminalNode OAND() { return getToken(GramaticaParser.OAND, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
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
		enterRule(_localctx, 70, RULE_exp2);
		try {
			setState(315);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(313);
				match(OAND);
				setState(314);
				exp();
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

	public static class ExoContext extends ParserRuleContext {
		public ExnContext exn() {
			return getRuleContext(ExnContext.class,0);
		}
		public Exo2Context exo2() {
			return getRuleContext(Exo2Context.class,0);
		}
		public ExoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterExo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitExo(this);
		}
	}

	public final ExoContext exo() throws RecognitionException {
		ExoContext _localctx = new ExoContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_exo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			exn();
			setState(318);
			exo2();
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

	public static class Exo2Context extends ParserRuleContext {
		public TerminalNode OOR() { return getToken(GramaticaParser.OOR, 0); }
		public ExoContext exo() {
			return getRuleContext(ExoContext.class,0);
		}
		public Exo2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exo2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterExo2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitExo2(this);
		}
	}

	public final Exo2Context exo2() throws RecognitionException {
		Exo2Context _localctx = new Exo2Context(_ctx, getState());
		enterRule(_localctx, 74, RULE_exo2);
		try {
			setState(323);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(321);
				match(OOR);
				setState(322);
				exo();
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

	public static class ExnContext extends ParserRuleContext {
		public ExiContext exi() {
			return getRuleContext(ExiContext.class,0);
		}
		public Exn2Context exn2() {
			return getRuleContext(Exn2Context.class,0);
		}
		public ExnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterExn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitExn(this);
		}
	}

	public final ExnContext exn() throws RecognitionException {
		ExnContext _localctx = new ExnContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_exn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			exi();
			setState(326);
			exn2();
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

	public static class Exn2Context extends ParserRuleContext {
		public TerminalNode ONOT() { return getToken(GramaticaParser.ONOT, 0); }
		public ExnContext exn() {
			return getRuleContext(ExnContext.class,0);
		}
		public Exn2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exn2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterExn2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitExn2(this);
		}
	}

	public final Exn2Context exn2() throws RecognitionException {
		Exn2Context _localctx = new Exn2Context(_ctx, getState());
		enterRule(_localctx, 78, RULE_exn2);
		try {
			setState(331);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(329);
				match(ONOT);
				setState(330);
				exn();
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

	public static class ExiContext extends ParserRuleContext {
		public ExmContext exm() {
			return getRuleContext(ExmContext.class,0);
		}
		public Exp2Context exp2() {
			return getRuleContext(Exp2Context.class,0);
		}
		public ExiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterExi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitExi(this);
		}
	}

	public final ExiContext exi() throws RecognitionException {
		ExiContext _localctx = new ExiContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_exi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			exm();
			setState(334);
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

	public static class Exi2Context extends ParserRuleContext {
		public TerminalNode MAI() { return getToken(GramaticaParser.MAI, 0); }
		public ExmContext exm() {
			return getRuleContext(ExmContext.class,0);
		}
		public TerminalNode MEI() { return getToken(GramaticaParser.MEI, 0); }
		public TerminalNode OIG() { return getToken(GramaticaParser.OIG, 0); }
		public TerminalNode DIF() { return getToken(GramaticaParser.DIF, 0); }
		public TerminalNode MAY() { return getToken(GramaticaParser.MAY, 0); }
		public TerminalNode MEN() { return getToken(GramaticaParser.MEN, 0); }
		public Exi2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exi2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterExi2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitExi2(this);
		}
	}

	public final Exi2Context exi2() throws RecognitionException {
		Exi2Context _localctx = new Exi2Context(_ctx, getState());
		enterRule(_localctx, 82, RULE_exi2);
		try {
			setState(348);
			switch (_input.LA(1)) {
			case MAI:
				enterOuterAlt(_localctx, 1);
				{
				setState(336);
				match(MAI);
				setState(337);
				exm();
				}
				break;
			case MEI:
				enterOuterAlt(_localctx, 2);
				{
				setState(338);
				match(MEI);
				setState(339);
				exm();
				}
				break;
			case OIG:
				enterOuterAlt(_localctx, 3);
				{
				setState(340);
				match(OIG);
				setState(341);
				exm();
				}
				break;
			case DIF:
				enterOuterAlt(_localctx, 4);
				{
				setState(342);
				match(DIF);
				setState(343);
				exm();
				}
				break;
			case MAY:
				enterOuterAlt(_localctx, 5);
				{
				setState(344);
				match(MAY);
				setState(345);
				exm();
				}
				break;
			case MEN:
				enterOuterAlt(_localctx, 6);
				{
				setState(346);
				match(MEN);
				setState(347);
				exm();
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

	public static class ExmContext extends ParserRuleContext {
		public ExContext ex() {
			return getRuleContext(ExContext.class,0);
		}
		public Exm2Context exm2() {
			return getRuleContext(Exm2Context.class,0);
		}
		public ExmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterExm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitExm(this);
		}
	}

	public final ExmContext exm() throws RecognitionException {
		ExmContext _localctx = new ExmContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_exm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			ex();
			setState(351);
			exm2();
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

	public static class Exm2Context extends ParserRuleContext {
		public TerminalNode MOD() { return getToken(GramaticaParser.MOD, 0); }
		public ExmContext exm() {
			return getRuleContext(ExmContext.class,0);
		}
		public Exm2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exm2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterExm2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitExm2(this);
		}
	}

	public final Exm2Context exm2() throws RecognitionException {
		Exm2Context _localctx = new Exm2Context(_ctx, getState());
		enterRule(_localctx, 86, RULE_exm2);
		try {
			setState(356);
			switch (_input.LA(1)) {
			case EOF:
			case OAND:
			case OOR:
			case ONOT:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case MOD:
				enterOuterAlt(_localctx, 2);
				{
				setState(354);
				match(MOD);
				setState(355);
				exm();
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
		enterRule(_localctx, 88, RULE_ex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			termino();
			setState(359);
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
		enterRule(_localctx, 90, RULE_ex2);
		try {
			setState(366);
			switch (_input.LA(1)) {
			case EOF:
			case OAND:
			case OOR:
			case ONOT:
			case MOD:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case PLS:
				enterOuterAlt(_localctx, 2);
				{
				setState(362);
				match(PLS);
				setState(363);
				ex();
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 3);
				{
				setState(364);
				match(SUB);
				setState(365);
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
		enterRule(_localctx, 92, RULE_termino);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			factor();
			setState(369);
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
		enterRule(_localctx, 94, RULE_termino2);
		try {
			setState(376);
			switch (_input.LA(1)) {
			case EOF:
			case OAND:
			case OOR:
			case ONOT:
			case MOD:
			case PLS:
			case SUB:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case MLT:
				enterOuterAlt(_localctx, 2);
				{
				setState(372);
				match(MLT);
				setState(373);
				termino();
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 3);
				{
				setState(374);
				match(DIV);
				setState(375);
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
		public TerminalNode OP() { return getToken(GramaticaParser.OP, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode CP() { return getToken(GramaticaParser.CP, 0); }
		public TerminalNode PLS() { return getToken(GramaticaParser.PLS, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
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
		enterRule(_localctx, 96, RULE_factor);
		try {
			setState(387);
			switch (_input.LA(1)) {
			case OP:
				enterOuterAlt(_localctx, 1);
				{
				setState(378);
				match(OP);
				setState(379);
				exp();
				setState(380);
				match(CP);
				}
				break;
			case PLS:
				enterOuterAlt(_localctx, 2);
				{
				setState(382);
				match(PLS);
				setState(383);
				var();
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 3);
				{
				setState(384);
				match(SUB);
				setState(385);
				var();
				}
				break;
			case CTES:
			case CTEF:
			case CTEI:
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(386);
				var();
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

	public static class VarContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public CteContext cte() {
			return getRuleContext(CteContext.class,0);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitVar(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_var);
		try {
			setState(391);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(389);
				match(ID);
				}
				break;
			case CTES:
			case CTEF:
			case CTEI:
				enterOuterAlt(_localctx, 2);
				{
				setState(390);
				cte();
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

	public static class CteContext extends ParserRuleContext {
		public TerminalNode CTEF() { return getToken(GramaticaParser.CTEF, 0); }
		public TerminalNode CTEI() { return getToken(GramaticaParser.CTEI, 0); }
		public TerminalNode CTES() { return getToken(GramaticaParser.CTES, 0); }
		public CteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cte; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterCte(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitCte(this);
		}
	}

	public final CteContext cte() throws RecognitionException {
		CteContext _localctx = new CteContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_cte);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CTES) | (1L << CTEF) | (1L << CTEI))) != 0)) ) {
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\64\u018e\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3q\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\5\5{\n\5\3\6\3\6\3\6\3\6\5\6\u0081\n\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\5\n\u0098"+
		"\n\n\3\13\3\13\3\13\3\f\3\f\3\f\5\f\u00a0\n\f\3\r\3\r\3\r\3\16\3\16\5"+
		"\16\u00a7\n\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\5\22\u00b8\n\22\3\23\3\23\3\23\3\24\3\24\5\24\u00bf"+
		"\n\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00cc"+
		"\n\26\3\27\3\27\3\27\3\30\3\30\3\30\5\30\u00d4\n\30\3\31\3\31\3\31\3\31"+
		"\5\31\u00da\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u00e5"+
		"\n\32\3\33\3\33\3\33\5\33\u00ea\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\5!\u011e\n!\3\"\3\"\3\""+
		"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u0136\n"+
		"#\3$\3$\3$\3%\3%\3%\5%\u013e\n%\3&\3&\3&\3\'\3\'\3\'\5\'\u0146\n\'\3("+
		"\3(\3(\3)\3)\3)\5)\u014e\n)\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+"+
		"\3+\5+\u015f\n+\3,\3,\3,\3-\3-\3-\5-\u0167\n-\3.\3.\3.\3/\3/\3/\3/\3/"+
		"\5/\u0171\n/\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\5\61\u017b\n\61\3"+
		"\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u0186\n\62\3\63\3\63"+
		"\5\63\u018a\n\63\3\64\3\64\3\64\2\2\65\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdf\2\4\4\2\13\r\17\20"+
		"\3\2\61\63\u0184\2h\3\2\2\2\4p\3\2\2\2\6r\3\2\2\2\bz\3\2\2\2\n\u0080\3"+
		"\2\2\2\f\u0082\3\2\2\2\16\u008b\3\2\2\2\20\u0093\3\2\2\2\22\u0097\3\2"+
		"\2\2\24\u0099\3\2\2\2\26\u009f\3\2\2\2\30\u00a1\3\2\2\2\32\u00a6\3\2\2"+
		"\2\34\u00a8\3\2\2\2\36\u00ab\3\2\2\2 \u00b1\3\2\2\2\"\u00b7\3\2\2\2$\u00b9"+
		"\3\2\2\2&\u00be\3\2\2\2(\u00c0\3\2\2\2*\u00cb\3\2\2\2,\u00cd\3\2\2\2."+
		"\u00d3\3\2\2\2\60\u00d9\3\2\2\2\62\u00e4\3\2\2\2\64\u00e9\3\2\2\2\66\u00eb"+
		"\3\2\2\28\u00f3\3\2\2\2:\u00ff\3\2\2\2<\u0108\3\2\2\2>\u010e\3\2\2\2@"+
		"\u011d\3\2\2\2B\u011f\3\2\2\2D\u0135\3\2\2\2F\u0137\3\2\2\2H\u013d\3\2"+
		"\2\2J\u013f\3\2\2\2L\u0145\3\2\2\2N\u0147\3\2\2\2P\u014d\3\2\2\2R\u014f"+
		"\3\2\2\2T\u015e\3\2\2\2V\u0160\3\2\2\2X\u0166\3\2\2\2Z\u0168\3\2\2\2\\"+
		"\u0170\3\2\2\2^\u0172\3\2\2\2`\u017a\3\2\2\2b\u0185\3\2\2\2d\u0189\3\2"+
		"\2\2f\u018b\3\2\2\2hi\5\4\3\2ij\5\n\6\2jk\5\16\b\2k\3\3\2\2\2lq\3\2\2"+
		"\2mn\5\6\4\2no\5\4\3\2oq\3\2\2\2pl\3\2\2\2pm\3\2\2\2q\5\3\2\2\2rs\7\""+
		"\2\2st\7\21\2\2tu\5\b\5\2u\7\3\2\2\2v{\7\61\2\2wx\7/\2\2xy\7\61\2\2y{"+
		"\7.\2\2zv\3\2\2\2zw\3\2\2\2{\t\3\2\2\2|\u0081\3\2\2\2}~\5\f\7\2~\177\5"+
		"\n\6\2\177\u0081\3\2\2\2\u0080|\3\2\2\2\u0080}\3\2\2\2\u0081\13\3\2\2"+
		"\2\u0082\u0083\5\20\t\2\u0083\u0084\7\64\2\2\u0084\u0085\7\4\2\2\u0085"+
		"\u0086\5\22\n\2\u0086\u0087\7\5\2\2\u0087\u0088\7\6\2\2\u0088\u0089\5"+
		"\60\31\2\u0089\u008a\7\7\2\2\u008a\r\3\2\2\2\u008b\u008c\7\13\2\2\u008c"+
		"\u008d\7\22\2\2\u008d\u008e\7\4\2\2\u008e\u008f\7\5\2\2\u008f\u0090\7"+
		"\6\2\2\u0090\u0091\5\60\31\2\u0091\u0092\7\7\2\2\u0092\17\3\2\2\2\u0093"+
		"\u0094\t\2\2\2\u0094\21\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0098\5\24\13"+
		"\2\u0097\u0095\3\2\2\2\u0097\u0096\3\2\2\2\u0098\23\3\2\2\2\u0099\u009a"+
		"\5\30\r\2\u009a\u009b\5\26\f\2\u009b\25\3\2\2\2\u009c\u00a0\3\2\2\2\u009d"+
		"\u009e\7\n\2\2\u009e\u00a0\5\24\13\2\u009f\u009c\3\2\2\2\u009f\u009d\3"+
		"\2\2\2\u00a0\27\3\2\2\2\u00a1\u00a2\5\20\t\2\u00a2\u00a3\5\32\16\2\u00a3"+
		"\31\3\2\2\2\u00a4\u00a7\5\34\17\2\u00a5\u00a7\5\36\20\2\u00a6\u00a4\3"+
		"\2\2\2\u00a6\u00a5\3\2\2\2\u00a7\33\3\2\2\2\u00a8\u00a9\7\64\2\2\u00a9"+
		"\u00aa\7$\2\2\u00aa\35\3\2\2\2\u00ab\u00ac\7\b\2\2\u00ac\u00ad\5 \21\2"+
		"\u00ad\u00ae\7\t\2\2\u00ae\u00af\7\64\2\2\u00af\u00b0\7$\2\2\u00b0\37"+
		"\3\2\2\2\u00b1\u00b2\5F$\2\u00b2\u00b3\5\"\22\2\u00b3!\3\2\2\2\u00b4\u00b8"+
		"\3\2\2\2\u00b5\u00b6\7\n\2\2\u00b6\u00b8\5 \21\2\u00b7\u00b4\3\2\2\2\u00b7"+
		"\u00b5\3\2\2\2\u00b8#\3\2\2\2\u00b9\u00ba\5(\25\2\u00ba\u00bb\5&\24\2"+
		"\u00bb%\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bf\5(\25\2\u00be\u00bc\3"+
		"\2\2\2\u00be\u00bd\3\2\2\2\u00bf\'\3\2\2\2\u00c0\u00c1\7\64\2\2\u00c1"+
		"\u00c2\5*\26\2\u00c2)\3\2\2\2\u00c3\u00c4\7#\2\2\u00c4\u00cc\5F$\2\u00c5"+
		"\u00c6\7\b\2\2\u00c6\u00c7\5,\27\2\u00c7\u00c8\7\t\2\2\u00c8\u00c9\7#"+
		"\2\2\u00c9\u00ca\5F$\2\u00ca\u00cc\3\2\2\2\u00cb\u00c3\3\2\2\2\u00cb\u00c5"+
		"\3\2\2\2\u00cc+\3\2\2\2\u00cd\u00ce\5F$\2\u00ce\u00cf\5.\30\2\u00cf-\3"+
		"\2\2\2\u00d0\u00d4\3\2\2\2\u00d1\u00d2\7\n\2\2\u00d2\u00d4\5,\27\2\u00d3"+
		"\u00d0\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4/\3\2\2\2\u00d5\u00da\3\2\2\2"+
		"\u00d6\u00d7\5\62\32\2\u00d7\u00d8\5\60\31\2\u00d8\u00da\3\2\2\2\u00d9"+
		"\u00d5\3\2\2\2\u00d9\u00d6\3\2\2\2\u00da\61\3\2\2\2\u00db\u00e5\7\30\2"+
		"\2\u00dc\u00e5\7\31\2\2\u00dd\u00e5\5<\37\2\u00de\u00e5\5(\25\2\u00df"+
		"\u00e5\5\30\r\2\u00e0\u00e5\5B\"\2\u00e1\u00e5\5D#\2\u00e2\u00e5\5\64"+
		"\33\2\u00e3\u00e5\5> \2\u00e4\u00db\3\2\2\2\u00e4\u00dc\3\2\2\2\u00e4"+
		"\u00dd\3\2\2\2\u00e4\u00de\3\2\2\2\u00e4\u00df\3\2\2\2\u00e4\u00e0\3\2"+
		"\2\2\u00e4\u00e1\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e3\3\2\2\2\u00e5"+
		"\63\3\2\2\2\u00e6\u00ea\5\66\34\2\u00e7\u00ea\5:\36\2\u00e8\u00ea\58\35"+
		"\2\u00e9\u00e6\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00e8\3\2\2\2\u00ea\65"+
		"\3\2\2\2\u00eb\u00ec\7\23\2\2\u00ec\u00ed\7\4\2\2\u00ed\u00ee\5F$\2\u00ee"+
		"\u00ef\7\5\2\2\u00ef\u00f0\7\6\2\2\u00f0\u00f1\5\60\31\2\u00f1\u00f2\7"+
		"\7\2\2\u00f2\67\3\2\2\2\u00f3\u00f4\7\25\2\2\u00f4\u00f5\7\4\2\2\u00f5"+
		"\u00f6\5(\25\2\u00f6\u00f7\7$\2\2\u00f7\u00f8\5F$\2\u00f8\u00f9\7$\2\2"+
		"\u00f9\u00fa\5$\23\2\u00fa\u00fb\7\5\2\2\u00fb\u00fc\7\6\2\2\u00fc\u00fd"+
		"\5\60\31\2\u00fd\u00fe\7\7\2\2\u00fe9\3\2\2\2\u00ff\u0100\7\24\2\2\u0100"+
		"\u0101\7\6\2\2\u0101\u0102\5\60\31\2\u0102\u0103\7\7\2\2\u0103\u0104\7"+
		"\23\2\2\u0104\u0105\7\4\2\2\u0105\u0106\5F$\2\u0106\u0107\7\5\2\2\u0107"+
		";\3\2\2\2\u0108\u0109\7\64\2\2\u0109\u010a\7\4\2\2\u010a\u010b\5\22\n"+
		"\2\u010b\u010c\7\5\2\2\u010c\u010d\7$\2\2\u010d=\3\2\2\2\u010e\u010f\7"+
		"\26\2\2\u010f\u0110\7\4\2\2\u0110\u0111\5F$\2\u0111\u0112\7\5\2\2\u0112"+
		"\u0113\7\6\2\2\u0113\u0114\5\60\31\2\u0114\u0115\7\7\2\2\u0115\u0116\5"+
		"@!\2\u0116?\3\2\2\2\u0117\u011e\3\2\2\2\u0118\u0119\7\27\2\2\u0119\u011a"+
		"\7\6\2\2\u011a\u011b\5\60\31\2\u011b\u011c\7\7\2\2\u011c\u011e\3\2\2\2"+
		"\u011d\u0117\3\2\2\2\u011d\u0118\3\2\2\2\u011eA\3\2\2\2\u011f\u0120\7"+
		"\35\2\2\u0120\u0121\5F$\2\u0121\u0122\7$\2\2\u0122C\3\2\2\2\u0123\u0124"+
		"\7\32\2\2\u0124\u0136\7$\2\2\u0125\u0126\7\33\2\2\u0126\u0136\7$\2\2\u0127"+
		"\u0128\7\34\2\2\u0128\u0129\7\4\2\2\u0129\u012a\7\63\2\2\u012a\u012b\7"+
		"\n\2\2\u012b\u012c\7\63\2\2\u012c\u012d\7\n\2\2\u012d\u012e\7\63\2\2\u012e"+
		"\u0136\7\5\2\2\u012f\u0130\7\36\2\2\u0130\u0131\7\4\2\2\u0131\u0132\7"+
		"\63\2\2\u0132\u0133\7\n\2\2\u0133\u0134\7\63\2\2\u0134\u0136\7\5\2\2\u0135"+
		"\u0123\3\2\2\2\u0135\u0125\3\2\2\2\u0135\u0127\3\2\2\2\u0135\u012f\3\2"+
		"\2\2\u0136E\3\2\2\2\u0137\u0138\5J&\2\u0138\u0139\5H%\2\u0139G\3\2\2\2"+
		"\u013a\u013e\3\2\2\2\u013b\u013c\7\37\2\2\u013c\u013e\5F$\2\u013d\u013a"+
		"\3\2\2\2\u013d\u013b\3\2\2\2\u013eI\3\2\2\2\u013f\u0140\5N(\2\u0140\u0141"+
		"\5L\'\2\u0141K\3\2\2\2\u0142\u0146\3\2\2\2\u0143\u0144\7 \2\2\u0144\u0146"+
		"\5J&\2\u0145\u0142\3\2\2\2\u0145\u0143\3\2\2\2\u0146M\3\2\2\2\u0147\u0148"+
		"\5R*\2\u0148\u0149\5P)\2\u0149O\3\2\2\2\u014a\u014e\3\2\2\2\u014b\u014c"+
		"\7!\2\2\u014c\u014e\5N(\2\u014d\u014a\3\2\2\2\u014d\u014b\3\2\2\2\u014e"+
		"Q\3\2\2\2\u014f\u0150\5V,\2\u0150\u0151\5H%\2\u0151S\3\2\2\2\u0152\u0153"+
		"\7*\2\2\u0153\u015f\5V,\2\u0154\u0155\7+\2\2\u0155\u015f\5V,\2\u0156\u0157"+
		"\7,\2\2\u0157\u015f\5V,\2\u0158\u0159\7-\2\2\u0159\u015f\5V,\2\u015a\u015b"+
		"\7.\2\2\u015b\u015f\5V,\2\u015c\u015d\7/\2\2\u015d\u015f\5V,\2\u015e\u0152"+
		"\3\2\2\2\u015e\u0154\3\2\2\2\u015e\u0156\3\2\2\2\u015e\u0158\3\2\2\2\u015e"+
		"\u015a\3\2\2\2\u015e\u015c\3\2\2\2\u015fU\3\2\2\2\u0160\u0161\5Z.\2\u0161"+
		"\u0162\5X-\2\u0162W\3\2\2\2\u0163\u0167\3\2\2\2\u0164\u0165\7\'\2\2\u0165"+
		"\u0167\5V,\2\u0166\u0163\3\2\2\2\u0166\u0164\3\2\2\2\u0167Y\3\2\2\2\u0168"+
		"\u0169\5^\60\2\u0169\u016a\5\\/\2\u016a[\3\2\2\2\u016b\u0171\3\2\2\2\u016c"+
		"\u016d\7(\2\2\u016d\u0171\5Z.\2\u016e\u016f\7)\2\2\u016f\u0171\5Z.\2\u0170"+
		"\u016b\3\2\2\2\u0170\u016c\3\2\2\2\u0170\u016e\3\2\2\2\u0171]\3\2\2\2"+
		"\u0172\u0173\5b\62\2\u0173\u0174\5`\61\2\u0174_\3\2\2\2\u0175\u017b\3"+
		"\2\2\2\u0176\u0177\7%\2\2\u0177\u017b\5^\60\2\u0178\u0179\7&\2\2\u0179"+
		"\u017b\5^\60\2\u017a\u0175\3\2\2\2\u017a\u0176\3\2\2\2\u017a\u0178\3\2"+
		"\2\2\u017ba\3\2\2\2\u017c\u017d\7\4\2\2\u017d\u017e\5F$\2\u017e\u017f"+
		"\7\5\2\2\u017f\u0186\3\2\2\2\u0180\u0181\7(\2\2\u0181\u0186\5d\63\2\u0182"+
		"\u0183\7)\2\2\u0183\u0186\5d\63\2\u0184\u0186\5d\63\2\u0185\u017c\3\2"+
		"\2\2\u0185\u0180\3\2\2\2\u0185\u0182\3\2\2\2\u0185\u0184\3\2\2\2\u0186"+
		"c\3\2\2\2\u0187\u018a\7\64\2\2\u0188\u018a\5f\64\2\u0189\u0187\3\2\2\2"+
		"\u0189\u0188\3\2\2\2\u018ae\3\2\2\2\u018b\u018c\t\3\2\2\u018cg\3\2\2\2"+
		"\32pz\u0080\u0097\u009f\u00a6\u00b7\u00be\u00cb\u00d3\u00d9\u00e4\u00e9"+
		"\u011d\u0135\u013d\u0145\u014d\u015e\u0166\u0170\u017a\u0185\u0189";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}