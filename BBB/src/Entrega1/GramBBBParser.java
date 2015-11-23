// Generated from GramBBB.g4 by ANTLR 4.5.1

package Entrega1;

import API.CompiAPI;
import API.CompiAPI.EXP;
import Entrega3.DATA;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramBBBParser extends Parser {
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
		RULE_init = 0, RULE_body = 1, RULE_includes = 2, RULE_include = 3, RULE_include2 = 4, 
		RULE_functions = 5, RULE_functiondecl = 6, RULE_maindecl = 7, RULE_type = 8, 
		RULE_params = 9, RULE_params2 = 10, RULE_params3 = 11, RULE_declarations = 12, 
		RULE_declaration = 13, RULE_multivar = 14, RULE_multivar2 = 15, RULE_dasign = 16, 
		RULE_multidim = 17, RULE_dimd = 18, RULE_dimd2 = 19, RULE_asignations = 20, 
		RULE_asignation = 21, RULE_asignation2 = 22, RULE_dima = 23, RULE_dima2 = 24, 
		RULE_estatutos = 25, RULE_estatuto = 26, RULE_loops = 27, RULE_llwhile = 28, 
		RULE_llfor = 29, RULE_lldowhile = 30, RULE_functioncall = 31, RULE_conditional = 32, 
		RULE_conditional2 = 33, RULE_print = 34, RULE_instructions = 35, RULE_exp = 36, 
		RULE_exp2 = 37, RULE_exo = 38, RULE_exo2 = 39, RULE_exn = 40, RULE_exn2 = 41, 
		RULE_exi = 42, RULE_exi2 = 43, RULE_exm = 44, RULE_exm2 = 45, RULE_ex = 46, 
		RULE_ex2 = 47, RULE_termino = 48, RULE_termino2 = 49, RULE_factor = 50, 
		RULE_var = 51, RULE_cte = 52;
	public static final String[] ruleNames = {
		"init", "body", "includes", "include", "include2", "functions", "functiondecl", 
		"maindecl", "type", "params", "params2", "params3", "declarations", "declaration", 
		"multivar", "multivar2", "dasign", "multidim", "dimd", "dimd2", "asignations", 
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
	public String getGrammarFileName() { return "GramBBB.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GramBBBParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class InitContext extends ParserRuleContext {
		public IncludesContext includes() {
			return getRuleContext(IncludesContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
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
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).exitInit(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106); CompiAPI.INIT.ins1();
			includes();
			setState(107);
			body();
			setState(108);
			maindecl(); CompiAPI.INIT.ins2();
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

	public static class BodyContext extends ParserRuleContext {
		public FunctionsContext functions() {
			return getRuleContext(FunctionsContext.class,0);
		}
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public AsignationsContext asignations() {
			return getRuleContext(AsignationsContext.class,0);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).exitBody(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_body);
		try {
			setState(113);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				functions();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				declarations();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(112);
				asignations();
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
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).enterIncludes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).exitIncludes(this);
		}
	}

	public final IncludesContext includes() throws RecognitionException {
		IncludesContext _localctx = new IncludesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_includes);
		try {
			setState(119);
			switch (_input.LA(1)) {
			case INT:
			case FLT:
			case BOL:
			case STR:
			case VOID:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case HT:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				include();
				setState(117);
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
		public TerminalNode HT() { return getToken(GramBBBParser.HT, 0); }
		public TerminalNode INCL() { return getToken(GramBBBParser.INCL, 0); }
		public Include2Context include2() {
			return getRuleContext(Include2Context.class,0);
		}
		public IncludeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_include; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).enterInclude(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).exitInclude(this);
		}
	}

	public final IncludeContext include() throws RecognitionException {
		IncludeContext _localctx = new IncludeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_include);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(HT);
			setState(122);
			match(INCL);
			setState(123);
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
		public TerminalNode CTES() { return getToken(GramBBBParser.CTES, 0); }
		public TerminalNode MEN() { return getToken(GramBBBParser.MEN, 0); }
		public TerminalNode MAY() { return getToken(GramBBBParser.MAY, 0); }
		public Include2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_include2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).enterInclude2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).exitInclude2(this);
		}
	}

	public final Include2Context include2() throws RecognitionException {
		Include2Context _localctx = new Include2Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_include2);
		try {
			setState(129);
			switch (_input.LA(1)) {
			case CTES:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				match(CTES);
				}
				break;
			case MEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				match(MEN);
				setState(127);
				match(CTES);
				setState(128);
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
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).enterFunctions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).exitFunctions(this);
		}
	}

	public final FunctionsContext functions() throws RecognitionException {
		FunctionsContext _localctx = new FunctionsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_functions);
		try {
			setState(135);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				functiondecl();
				setState(133);
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
		public TerminalNode ID() { return getToken(GramBBBParser.ID, 0); }
		public TerminalNode OP() { return getToken(GramBBBParser.OP, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode CP() { return getToken(GramBBBParser.CP, 0); }
		public TerminalNode OK() { return getToken(GramBBBParser.OK, 0); }
		public EstatutosContext estatutos() {
			return getRuleContext(EstatutosContext.class,0);
		}
		public TerminalNode CK() { return getToken(GramBBBParser.CK, 0); }
		public FunctiondeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functiondecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).enterFunctiondecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).exitFunctiondecl(this);
		}
	}

	public final FunctiondeclContext functiondecl() throws RecognitionException {
		FunctiondeclContext _localctx = new FunctiondeclContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_functiondecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			type();
			setState(138);
			match(ID);
			setState(139);
			match(OP);
			setState(140);
			params();
			setState(141);
			match(CP);
			setState(142);
			match(OK);
			setState(143);
			estatutos();
			setState(144);
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
		public TerminalNode INT() { return getToken(GramBBBParser.INT, 0); }
		public TerminalNode MAIN() { return getToken(GramBBBParser.MAIN, 0); }
		public TerminalNode OP() { return getToken(GramBBBParser.OP, 0); }
		public TerminalNode CP() { return getToken(GramBBBParser.CP, 0); }
		public TerminalNode OK() { return getToken(GramBBBParser.OK, 0); }
		public EstatutosContext estatutos() {
			return getRuleContext(EstatutosContext.class,0);
		}
		public TerminalNode CK() { return getToken(GramBBBParser.CK, 0); }
		public MaindeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maindecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).enterMaindecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).exitMaindecl(this);
		}
	}

	public final MaindeclContext maindecl() throws RecognitionException {
		MaindeclContext _localctx = new MaindeclContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_maindecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(INT);
			setState(147);CompiAPI.MAINDECL.ins1();
			match(MAIN);
			setState(148);
			match(OP);
			setState(149);
			match(CP);
			setState(150);
			match(OK);
			setState(151);
			estatutos();
			setState(152);
			match(CK);CompiAPI.MAINDECL.ins2();
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
		public TerminalNode INT() { return getToken(GramBBBParser.INT, 0); }
		public TerminalNode FLT() { return getToken(GramBBBParser.FLT, 0); }
		public TerminalNode BOL() { return getToken(GramBBBParser.BOL, 0); }
		public TerminalNode STR() { return getToken(GramBBBParser.STR, 0); }
		public TerminalNode VOID() { return getToken(GramBBBParser.VOID, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLT) | (1L << BOL) | (1L << STR) | (1L << VOID))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
                            CompiAPI.TYPE.ins1(_la);
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
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).exitParams(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_params);
		try {
			setState(158);
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
				setState(157);
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
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).enterParams2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).exitParams2(this);
		}
	}

	public final Params2Context params2() throws RecognitionException {
		Params2Context _localctx = new Params2Context(_ctx, getState());
		enterRule(_localctx, 20, RULE_params2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			declaration();
			setState(161);
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
		public TerminalNode COM() { return getToken(GramBBBParser.COM, 0); }
		public Params2Context params2() {
			return getRuleContext(Params2Context.class,0);
		}
		public Params3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).enterParams3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).exitParams3(this);
		}
	}

	public final Params3Context params3() throws RecognitionException {
		Params3Context _localctx = new Params3Context(_ctx, getState());
		enterRule(_localctx, 22, RULE_params3);
		try {
			setState(166);
			switch (_input.LA(1)) {
			case CP:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case COM:
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				match(COM);
				setState(165);
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

	public static class DeclarationsContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).enterDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).exitDeclarations(this);
		}
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_declarations);
		try {
			setState(172);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				declaration();
				setState(170);
				declarations();
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

	public static class DeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public MultivarContext multivar() {
			return getRuleContext(MultivarContext.class,0);
		}
		public TerminalNode DEL() { return getToken(GramBBBParser.DEL, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			type();CompiAPI.DECL.ins1();
			setState(175);
			multivar();
			setState(176);CompiAPI.DECL.ins4();
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

	public static class MultivarContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GramBBBParser.ID, 0); }
		public DasignContext dasign() {
			return getRuleContext(DasignContext.class,0);
		}
		public Multivar2Context multivar2() {
			return getRuleContext(Multivar2Context.class,0);
		}
		public MultivarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multivar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).enterMultivar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).exitMultivar(this);
		}
	}

	public final MultivarContext multivar() throws RecognitionException {
		MultivarContext _localctx = new MultivarContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_multivar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);CompiAPI.DECL.ins2(this.getCurrentToken().getText());
			match(ID);
			setState(179);
			dasign();
			setState(180);
			multivar2();
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

	public static class Multivar2Context extends ParserRuleContext {
		public TerminalNode COM() { return getToken(GramBBBParser.COM, 0); }
		public MultivarContext multivar() {
			return getRuleContext(MultivarContext.class,0);
		}
		public Multivar2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multivar2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).enterMultivar2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).exitMultivar2(this);
		}
	}

	public final Multivar2Context multivar2() throws RecognitionException {
		Multivar2Context _localctx = new Multivar2Context(_ctx, getState());
		enterRule(_localctx, 30, RULE_multivar2);
		try {
			setState(185);
			switch (_input.LA(1)) {
			case DEL:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case COM:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);CompiAPI.DECL.ins4();
				match(COM);
				setState(184);
				multivar();
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

	public static class DasignContext extends ParserRuleContext {
		public TerminalNode IGU() { return getToken(GramBBBParser.IGU, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public MultidimContext multidim() {
			return getRuleContext(MultidimContext.class,0);
		}
		public DasignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dasign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).enterDasign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).exitDasign(this);
		}
	}

	public final DasignContext dasign() throws RecognitionException {
		DasignContext _localctx = new DasignContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_dasign);
		try {
			setState(191);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);CompiAPI.DECL.ins3();
				match(IGU);
				setState(189);
				exp();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(190);
				multidim();
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

	public static class MultidimContext extends ParserRuleContext {
		public TerminalNode OB() { return getToken(GramBBBParser.OB, 0); }
		public DimdContext dimd() {
			return getRuleContext(DimdContext.class,0);
		}
		public TerminalNode CB() { return getToken(GramBBBParser.CB, 0); }
		public MultidimContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multidim; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).enterMultidim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).exitMultidim(this);
		}
	}

	public final MultidimContext multidim() throws RecognitionException {
		MultidimContext _localctx = new MultidimContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_multidim);
		try {
			setState(198);
			switch (_input.LA(1)) {
			case COM:
			case DEL:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case OB:
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				match(OB);
				setState(195);
				dimd();
				setState(196);CompiAPI.DECL.ins6();
				match(CB);
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
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).enterDimd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).exitDimd(this);
		}
	}

	public final DimdContext dimd() throws RecognitionException {
		DimdContext _localctx = new DimdContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_dimd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			exp();
			setState(201);
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
		public TerminalNode COM() { return getToken(GramBBBParser.COM, 0); }
		public DimdContext dimd() {
			return getRuleContext(DimdContext.class,0);
		}
		public Dimd2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimd2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).enterDimd2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).exitDimd2(this);
		}
	}

	public final Dimd2Context dimd2() throws RecognitionException {
		Dimd2Context _localctx = new Dimd2Context(_ctx, getState());
		enterRule(_localctx, 38, RULE_dimd2);
		try {
			setState(206);
			switch (_input.LA(1)) {
			case CB:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case COM:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);CompiAPI.DECL.ins5();
				match(COM);
				setState(205);
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
		public AsignationsContext asignations() {
			return getRuleContext(AsignationsContext.class,0);
		}
		public AsignationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).enterAsignations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).exitAsignations(this);
		}
	}

	public final AsignationsContext asignations() throws RecognitionException {
		AsignationsContext _localctx = new AsignationsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_asignations);
		try {
			setState(212);
			switch (_input.LA(1)) {
			case CP:
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				asignation();
				setState(210);
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
		public TerminalNode ID() { return getToken(GramBBBParser.ID, 0); }
		public Asignation2Context asignation2() {
			return getRuleContext(Asignation2Context.class,0);
		}
		public AsignationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).enterAsignation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).exitAsignation(this);
		}
	}

	public final AsignationContext asignation() throws RecognitionException {
		AsignationContext _localctx = new AsignationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_asignation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(ID);
			setState(215);
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
		public TerminalNode IGU() { return getToken(GramBBBParser.IGU, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode OB() { return getToken(GramBBBParser.OB, 0); }
		public DimaContext dima() {
			return getRuleContext(DimaContext.class,0);
		}
		public TerminalNode CB() { return getToken(GramBBBParser.CB, 0); }
		public Asignation2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignation2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).enterAsignation2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).exitAsignation2(this);
		}
	}

	public final Asignation2Context asignation2() throws RecognitionException {
		Asignation2Context _localctx = new Asignation2Context(_ctx, getState());
		enterRule(_localctx, 44, RULE_asignation2);
		try {
			setState(225);
			switch (_input.LA(1)) {
			case IGU:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				match(IGU);
				setState(218);
				exp();
				}
				break;
			case OB:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				match(OB);
				setState(220);
				dima();
				setState(221);
				match(CB);
				setState(222);
				match(IGU);
				setState(223);
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
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).enterDima(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).exitDima(this);
		}
	}

	public final DimaContext dima() throws RecognitionException {
		DimaContext _localctx = new DimaContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_dima);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			exp();
			setState(228);
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
		public TerminalNode COM() { return getToken(GramBBBParser.COM, 0); }
		public DimaContext dima() {
			return getRuleContext(DimaContext.class,0);
		}
		public Dima2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dima2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).enterDima2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).exitDima2(this);
		}
	}

	public final Dima2Context dima2() throws RecognitionException {
		Dima2Context _localctx = new Dima2Context(_ctx, getState());
		enterRule(_localctx, 48, RULE_dima2);
		try {
			setState(233);
			switch (_input.LA(1)) {
			case CB:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case COM:
				enterOuterAlt(_localctx, 2);
				{
				setState(231);
				match(COM);
				setState(232);
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
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).enterEstatutos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).exitEstatutos(this);
		}
	}

	public final EstatutosContext estatutos() throws RecognitionException {
		EstatutosContext _localctx = new EstatutosContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_estatutos);
		try {
			setState(239);
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
				setState(236);
				estatuto();
				setState(237);
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
		public TerminalNode BRK() { return getToken(GramBBBParser.BRK, 0); }
		public TerminalNode RTRN() { return getToken(GramBBBParser.RTRN, 0); }
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
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).enterEstatuto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).exitEstatuto(this);
		}
	}

	public final EstatutoContext estatuto() throws RecognitionException {
		EstatutoContext _localctx = new EstatutoContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_estatuto);
		try {
			setState(250);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				match(BRK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(242);
				match(RTRN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(243);
				functioncall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(244);
				asignation();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(245);
				declaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(246);
				print();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(247);
				instructions();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(248);
				loops();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(249);
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
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).enterLoops(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).exitLoops(this);
		}
	}

	public final LoopsContext loops() throws RecognitionException {
		LoopsContext _localctx = new LoopsContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_loops);
		try {
			setState(255);
			switch (_input.LA(1)) {
			case LWHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				llwhile();
				}
				break;
			case LDO:
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
				lldowhile();
				}
				break;
			case LFOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(254);
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
		public TerminalNode LWHILE() { return getToken(GramBBBParser.LWHILE, 0); }
		public TerminalNode OP() { return getToken(GramBBBParser.OP, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode CP() { return getToken(GramBBBParser.CP, 0); }
		public TerminalNode OK() { return getToken(GramBBBParser.OK, 0); }
		public EstatutosContext estatutos() {
			return getRuleContext(EstatutosContext.class,0);
		}
		public TerminalNode CK() { return getToken(GramBBBParser.CK, 0); }
		public LlwhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llwhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).enterLlwhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).exitLlwhile(this);
		}
	}

	public final LlwhileContext llwhile() throws RecognitionException {
		LlwhileContext _localctx = new LlwhileContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_llwhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(LWHILE);
			setState(258);
			match(OP);CompiAPI.WHILE.ins1();
			setState(259);
			exp();
			setState(260);
			match(CP);CompiAPI.WHILE.ins2();
			setState(261);
			match(OK);
			setState(262);
			estatutos();
			setState(263);
			match(CK);CompiAPI.WHILE.ins3();
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
		public TerminalNode LFOR() { return getToken(GramBBBParser.LFOR, 0); }
		public TerminalNode OP() { return getToken(GramBBBParser.OP, 0); }
		public AsignationContext asignation() {
			return getRuleContext(AsignationContext.class,0);
		}
		public List<TerminalNode> DEL() { return getTokens(GramBBBParser.DEL); }
		public TerminalNode DEL(int i) {
			return getToken(GramBBBParser.DEL, i);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public AsignationsContext asignations() {
			return getRuleContext(AsignationsContext.class,0);
		}
		public TerminalNode CP() { return getToken(GramBBBParser.CP, 0); }
		public TerminalNode OK() { return getToken(GramBBBParser.OK, 0); }
		public EstatutosContext estatutos() {
			return getRuleContext(EstatutosContext.class,0);
		}
		public TerminalNode CK() { return getToken(GramBBBParser.CK, 0); }
		public LlforContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llfor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).enterLlfor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).exitLlfor(this);
		}
	}

	public final LlforContext llfor() throws RecognitionException {
		LlforContext _localctx = new LlforContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_llfor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(LFOR);
			setState(266);
			match(OP);
			setState(267);
			asignation();
			setState(268);
			match(DEL);
			setState(269);
			exp();
			setState(270);
			match(DEL);
			setState(271);
			asignations();
			setState(272);
			match(CP);
			setState(273);
			match(OK);
			setState(274);
			estatutos();
			setState(275);
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
		public TerminalNode LDO() { return getToken(GramBBBParser.LDO, 0); }
		public TerminalNode OK() { return getToken(GramBBBParser.OK, 0); }
		public EstatutosContext estatutos() {
			return getRuleContext(EstatutosContext.class,0);
		}
		public TerminalNode CK() { return getToken(GramBBBParser.CK, 0); }
		public TerminalNode LWHILE() { return getToken(GramBBBParser.LWHILE, 0); }
		public TerminalNode OP() { return getToken(GramBBBParser.OP, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode CP() { return getToken(GramBBBParser.CP, 0); }
		public LldowhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lldowhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).enterLldowhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).exitLldowhile(this);
		}
	}

	public final LldowhileContext lldowhile() throws RecognitionException {
		LldowhileContext _localctx = new LldowhileContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_lldowhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(LDO);
			setState(278);
			match(OK);
			setState(279);
			estatutos();
			setState(280);
			match(CK);
			setState(281);
			match(LWHILE);
			setState(282);
			match(OP);
			setState(283);
			exp();
			setState(284);
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
		public TerminalNode ID() { return getToken(GramBBBParser.ID, 0); }
		public TerminalNode OP() { return getToken(GramBBBParser.OP, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode CP() { return getToken(GramBBBParser.CP, 0); }
		public TerminalNode DEL() { return getToken(GramBBBParser.DEL, 0); }
		public FunctioncallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functioncall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).enterFunctioncall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).exitFunctioncall(this);
		}
	}

	public final FunctioncallContext functioncall() throws RecognitionException {
		FunctioncallContext _localctx = new FunctioncallContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_functioncall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(ID);
			setState(287);
			match(OP);
			setState(288);
			params();
			setState(289);
			match(CP);
			setState(290);
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
		public TerminalNode CIF() { return getToken(GramBBBParser.CIF, 0); }
		public TerminalNode OP() { return getToken(GramBBBParser.OP, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode CP() { return getToken(GramBBBParser.CP, 0); }
		public TerminalNode OK() { return getToken(GramBBBParser.OK, 0); }
		public EstatutosContext estatutos() {
			return getRuleContext(EstatutosContext.class,0);
		}
		public TerminalNode CK() { return getToken(GramBBBParser.CK, 0); }
		public Conditional2Context conditional2() {
			return getRuleContext(Conditional2Context.class,0);
		}
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).enterConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).exitConditional(this);
		}
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_conditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(CIF);
			setState(293);
			match(OP);
			setState(294);
			exp();
			setState(295);CompiAPI.IF.ins1();
			match(CP);
			setState(296);
			match(OK);
			setState(297);
			estatutos();
			setState(298);CompiAPI.IF.ins2();
			match(CK);
			setState(299);
			conditional2();CompiAPI.IF.ins3();
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
		public TerminalNode CELSE() { return getToken(GramBBBParser.CELSE, 0); }
		public TerminalNode OK() { return getToken(GramBBBParser.OK, 0); }
		public EstatutosContext estatutos() {
			return getRuleContext(EstatutosContext.class,0);
		}
		public TerminalNode CK() { return getToken(GramBBBParser.CK, 0); }
		public Conditional2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).enterConditional2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).exitConditional2(this);
		}
	}

	public final Conditional2Context conditional2() throws RecognitionException {
		Conditional2Context _localctx = new Conditional2Context(_ctx, getState());
		enterRule(_localctx, 66, RULE_conditional2);
		try {
			setState(307);
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
				setState(302);
				match(CELSE);
				setState(303);
				match(OK);
				setState(304);
				estatutos();
				setState(305);
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
		public TerminalNode PRNT() { return getToken(GramBBBParser.PRNT, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode DEL() { return getToken(GramBBBParser.DEL, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).exitPrint(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(PRNT);
			setState(310);
			exp();
			setState(311); CompiAPI.PRINT.ins1();
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
		public TerminalNode PINU() { return getToken(GramBBBParser.PINU, 0); }
		public TerminalNode DEL() { return getToken(GramBBBParser.DEL, 0); }
		public TerminalNode PIND() { return getToken(GramBBBParser.PIND, 0); }
		public TerminalNode COL() { return getToken(GramBBBParser.COL, 0); }
		public TerminalNode OP() { return getToken(GramBBBParser.OP, 0); }
		public List<TerminalNode> CTEI() { return getTokens(GramBBBParser.CTEI); }
		public TerminalNode CTEI(int i) {
			return getToken(GramBBBParser.CTEI, i);
		}
		public List<TerminalNode> COM() { return getTokens(GramBBBParser.COM); }
		public TerminalNode COM(int i) {
			return getToken(GramBBBParser.COM, i);
		}
		public TerminalNode CP() { return getToken(GramBBBParser.CP, 0); }
		public TerminalNode MOV() { return getToken(GramBBBParser.MOV, 0); }
		public InstructionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instructions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).enterInstructions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).exitInstructions(this);
		}
	}

	public final InstructionsContext instructions() throws RecognitionException {
		InstructionsContext _localctx = new InstructionsContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_instructions);
		try {
			setState(331);
			switch (_input.LA(1)) {
			case PINU:
				enterOuterAlt(_localctx, 1);
				{
				setState(313);
				match(PINU);
				setState(314);
				match(DEL);
				}
				break;
			case PIND:
				enterOuterAlt(_localctx, 2);
				{
				setState(315);
				match(PIND);
				setState(316);
				match(DEL);
				}
				break;
			case COL:
				enterOuterAlt(_localctx, 3);
				{
				setState(317);
				match(COL);
				setState(318);
				match(OP);
				setState(319);
				match(CTEI);
				setState(320);
				match(COM);
				setState(321);
				match(CTEI);
				setState(322);
				match(COM);
				setState(323);
				match(CTEI);
				setState(324);
				match(CP);
				}
				break;
			case MOV:
				enterOuterAlt(_localctx, 4);
				{
				setState(325);
				match(MOV);
				setState(326);
				match(OP);
				setState(327);
				match(CTEI);
				setState(328);
				match(COM);
				setState(329);
				match(CTEI);
				setState(330);
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
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).exitExp(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			exo();
			setState(334);
			exp2();CompiAPI.EXP.evaluate();
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
		public TerminalNode OAND() { return getToken(GramBBBParser.OAND, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Exp2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).enterExp2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).exitExp2(this);
		}
	}

	public final Exp2Context exp2() throws RecognitionException {
		Exp2Context _localctx = new Exp2Context(_ctx, getState());
		enterRule(_localctx, 74, RULE_exp2);
		try {
			setState(339);
			switch (_input.LA(1)) {
			case CP:
			case CK:
			case CB:
			case COM:
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
			case DEL:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case OAND:
				enterOuterAlt(_localctx, 2);
				{
				setState(337);  CompiAPI.EXP.ins9(DATA.AND);
				match(OAND);
				setState(338);
				exp();          CompiAPI.EXP.ins10();
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
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).enterExo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).exitExo(this);
		}
	}

	public final ExoContext exo() throws RecognitionException {
		ExoContext _localctx = new ExoContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_exo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			exn();
			setState(342);
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
		public TerminalNode OOR() { return getToken(GramBBBParser.OOR, 0); }
		public ExoContext exo() {
			return getRuleContext(ExoContext.class,0);
		}
		public Exo2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exo2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).enterExo2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).exitExo2(this);
		}
	}

	public final Exo2Context exo2() throws RecognitionException {
		Exo2Context _localctx = new Exo2Context(_ctx, getState());
		enterRule(_localctx, 78, RULE_exo2);
		try {
			setState(347);
			switch (_input.LA(1)) {
			case CP:
			case CK:
			case CB:
			case COM:
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
			case OAND:
			case DEL:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case OOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(345);CompiAPI.EXP.ins9(DATA.OOR);
				match(OOR);
				setState(346);
				exo();CompiAPI.EXP.ins10();
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
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).enterExn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).exitExn(this);
		}
	}

	public final ExnContext exn() throws RecognitionException {
		ExnContext _localctx = new ExnContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_exn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			exi();
			setState(350);
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
		public TerminalNode ONOT() { return getToken(GramBBBParser.ONOT, 0); }
		public ExnContext exn() {
			return getRuleContext(ExnContext.class,0);
		}
		public Exn2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exn2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).enterExn2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).exitExn2(this);
		}
	}

	public final Exn2Context exn2() throws RecognitionException {
		Exn2Context _localctx = new Exn2Context(_ctx, getState());
		enterRule(_localctx, 82, RULE_exn2);
		try {
			setState(355);
			switch (_input.LA(1)) {
			case CP:
			case CK:
			case CB:
			case COM:
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
			case OAND:
			case OOR:
			case DEL:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case ONOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(353);// TODO implementar NOT desues
				match(ONOT);
				setState(354);
				exn();
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

	public static class ExiContext extends ParserRuleContext {
		public ExmContext exm() {
			return getRuleContext(ExmContext.class,0);
		}
		public Exi2Context exi2() {
			return getRuleContext(Exi2Context.class,0);
		}
		public ExiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).enterExi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).exitExi(this);
		}
	}

	public final ExiContext exi() throws RecognitionException {
		ExiContext _localctx = new ExiContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_exi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			exm();
			setState(358);
			exi2();
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
		public TerminalNode MAI() { return getToken(GramBBBParser.MAI, 0); }
		public ExmContext exm() {
			return getRuleContext(ExmContext.class,0);
		}
		public TerminalNode MEI() { return getToken(GramBBBParser.MEI, 0); }
		public TerminalNode OIG() { return getToken(GramBBBParser.OIG, 0); }
		public TerminalNode DIF() { return getToken(GramBBBParser.DIF, 0); }
		public TerminalNode MAY() { return getToken(GramBBBParser.MAY, 0); }
		public TerminalNode MEN() { return getToken(GramBBBParser.MEN, 0); }
		public Exi2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exi2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).enterExi2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).exitExi2(this);
		}
	}

	public final Exi2Context exi2() throws RecognitionException {
		Exi2Context _localctx = new Exi2Context(_ctx, getState());
		enterRule(_localctx, 86, RULE_exi2);
		try {
			setState(373);
			switch (_input.LA(1)) {
			case CP:
			case CK:
			case CB:
			case COM:
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
			case OAND:
			case OOR:
			case ONOT:
			case DEL:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case MAI:
				enterOuterAlt(_localctx, 2);
				{
				setState(361);CompiAPI.EXP.ins9(DATA.GOE);
				match(MAI);
				setState(362);
				exm();CompiAPI.EXP.ins10();
				}
				break;
			case MEI:
				enterOuterAlt(_localctx, 3);
				{
				setState(363);CompiAPI.EXP.ins9(DATA.LOE);
				match(MEI);
				setState(364);
				exm();CompiAPI.EXP.ins10();
				}
				break;
			case OIG:
				enterOuterAlt(_localctx, 4);
				{
				setState(365);CompiAPI.EXP.ins9(DATA.EQT);
				match(OIG);
				setState(366);
				exm();CompiAPI.EXP.ins10();
				}
				break;
			case DIF:
				enterOuterAlt(_localctx, 5);
				{
				setState(367);CompiAPI.EXP.ins9(DATA.DIF);
				match(DIF);
				setState(368);
				exm();CompiAPI.EXP.ins10();
				}
				break;
			case MAY:
				enterOuterAlt(_localctx, 6);
				{
				setState(369);CompiAPI.EXP.ins9(DATA.OGT);
				match(MAY);
				setState(370);
				exm();CompiAPI.EXP.ins10();
				}
				break;
			case MEN:
				enterOuterAlt(_localctx, 7);
				{
				setState(371);CompiAPI.EXP.ins9(DATA.OLT);
				match(MEN);
				setState(372);
				exm();CompiAPI.EXP.ins10();
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
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).enterExm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).exitExm(this);
		}
	}

	public final ExmContext exm() throws RecognitionException {
		ExmContext _localctx = new ExmContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_exm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			ex();CompiAPI.EXP.ins8();
			setState(376);
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
		public TerminalNode MOD() { return getToken(GramBBBParser.MOD, 0); }
		public ExmContext exm() {
			return getRuleContext(ExmContext.class,0);
		}
		public Exm2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exm2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).enterExm2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).exitExm2(this);
		}
	}

	public final Exm2Context exm2() throws RecognitionException {
		Exm2Context _localctx = new Exm2Context(_ctx, getState());
		enterRule(_localctx, 90, RULE_exm2);
		try {
			setState(381);
			switch (_input.LA(1)) {
			case CP:
			case CK:
			case CB:
			case COM:
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
			case OAND:
			case OOR:
			case ONOT:
			case DEL:
			case MAI:
			case MEI:
			case OIG:
			case DIF:
			case MAY:
			case MEN:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case MOD:
				enterOuterAlt(_localctx, 2);
				{
				setState(379);CompiAPI.EXP.ins9(DATA.MOD);
				match(MOD);
				setState(380);
				exm();CompiAPI.EXP.ins10();
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
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).enterEx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).exitEx(this);
		}
	}

	public final ExContext ex() throws RecognitionException {
		ExContext _localctx = new ExContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_ex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			termino();
                        CompiAPI.EXP.ins6();
                        //CompiAPI.EXP.ins6();
			setState(384);
			ex2();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
                catch (Exception e){
                    e.printStackTrace();
                }
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ex2Context extends ParserRuleContext {
		public TerminalNode PLS() { return getToken(GramBBBParser.PLS, 0); }
		public ExContext ex() {
			return getRuleContext(ExContext.class,0);
		}
		public TerminalNode SUB() { return getToken(GramBBBParser.SUB, 0); }
		public Ex2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ex2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).enterEx2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).exitEx2(this);
		}
	}

	public final Ex2Context ex2() throws RecognitionException {
		Ex2Context _localctx = new Ex2Context(_ctx, getState());
		enterRule(_localctx, 94, RULE_ex2);
		try {
			setState(391);
			switch (_input.LA(1)) {
			case CP:
			case CK:
			case CB:
			case COM:
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
			case OAND:
			case OOR:
			case ONOT:
			case DEL:
			case MOD:
			case MAI:
			case MEI:
			case OIG:
			case DIF:
			case MAY:
			case MEN:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case PLS:
				enterOuterAlt(_localctx, 2);
				{
				setState(387);CompiAPI.EXP.ins7(DATA.ADD);
				match(PLS);
				setState(388);
				ex();
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 3);
				{
				setState(389);CompiAPI.EXP.ins7(DATA.SUB);
				match(SUB);
				setState(390);
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
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).enterTermino(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).exitTermino(this);
		}
	}

	public final TerminoContext termino() throws RecognitionException {
		TerminoContext _localctx = new TerminoContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_termino);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			factor();
			setState(394);
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
		public TerminalNode MLT() { return getToken(GramBBBParser.MLT, 0); }
		public TerminoContext termino() {
			return getRuleContext(TerminoContext.class,0);
		}
		public TerminalNode DIV() { return getToken(GramBBBParser.DIV, 0); }
		public Termino2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termino2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).enterTermino2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).exitTermino2(this);
		}
	}

	public final Termino2Context termino2() throws RecognitionException {
		Termino2Context _localctx = new Termino2Context(_ctx, getState());
		enterRule(_localctx, 98, RULE_termino2);
		try {
			setState(401);
			switch (_input.LA(1)) {
			case CP:
			case CK:
			case CB:
			case COM:
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
			case OAND:
			case OOR:
			case ONOT:
			case DEL:
			case MOD:
			case PLS:
			case SUB:
			case MAI:
			case MEI:
			case OIG:
			case DIF:
			case MAY:
			case MEN:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case MLT:
				enterOuterAlt(_localctx, 2);
				{
				setState(397);CompiAPI.EXP.ins5(DATA.MUL);
				match(MLT);
				setState(398);
				termino();
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 3);
				{
				setState(399);CompiAPI.EXP.ins5(DATA.DIV);
				match(DIV);
				setState(400);
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
		public TerminalNode OP() { return getToken(GramBBBParser.OP, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode CP() { return getToken(GramBBBParser.CP, 0); }
		public TerminalNode PLS() { return getToken(GramBBBParser.PLS, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode SUB() { return getToken(GramBBBParser.SUB, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_factor);
		try {
			setState(412);
			switch (_input.LA(1)) {
			case OP:
				enterOuterAlt(_localctx, 1);
				{
				setState(403);CompiAPI.EXP.ins1();
				match(OP);
				setState(404);
				exp();
				setState(405);CompiAPI.EXP.ins2();
				match(CP);
				}
				break;
			case PLS:
				enterOuterAlt(_localctx, 2);
				{
				setState(407);
				match(PLS);
				setState(408);
				var();CompiAPI.EXP.ins3();
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 3);
				{
				setState(409);CompiAPI.EXP.ins4();
				match(SUB);
				setState(410);
				var();
				}
				break;
			case CTES:
			case CTEF:
			case CTEI:
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(411);
				var();CompiAPI.EXP.ins3();
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
		public TerminalNode ID() { return getToken(GramBBBParser.ID, 0); }
		public CteContext cte() {
			return getRuleContext(CteContext.class,0);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).exitVar(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_var);
		try {
			setState(416);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(414);CompiAPI.VAR.ins2(this.getCurrentToken().getText());
				match(ID);
				}
				break;
			case CTES:
			case CTEF:
			case CTEI:
				enterOuterAlt(_localctx, 2);
				{
				setState(415);
				cte();CompiAPI.VAR.ins1();
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
		public TerminalNode CTEF() { return getToken(GramBBBParser.CTEF, 0); }
		public TerminalNode CTEI() { return getToken(GramBBBParser.CTEI, 0); }
		public TerminalNode CTES() { return getToken(GramBBBParser.CTES, 0); }
		public CteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cte; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).enterCte(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).exitCte(this);
		}
	}

	public final CteContext cte() throws RecognitionException {
		CteContext _localctx = new CteContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_cte);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CTES) | (1L << CTEF) | (1L << CTEI))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
                            CompiAPI.CTE.ins1(_la,this.getCurrentToken().getText());
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\64\u01a7\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\3\2\3\2\3\2\3\2\3\3\3\3\3\3\5\3t\n\3\3\4\3\4\3"+
		"\4\3\4\5\4z\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6\u0084\n\6\3\7\3\7"+
		"\3\7\3\7\5\7\u008a\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\5\13\u00a1\n\13\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\5\r\u00a9\n\r\3\16\3\16\3\16\3\16\5\16\u00af\n\16\3\17\3\17\3"+
		"\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\5\21\u00bc\n\21\3\22\3\22"+
		"\3\22\3\22\5\22\u00c2\n\22\3\23\3\23\3\23\3\23\3\23\5\23\u00c9\n\23\3"+
		"\24\3\24\3\24\3\25\3\25\3\25\5\25\u00d1\n\25\3\26\3\26\3\26\3\26\5\26"+
		"\u00d7\n\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30"+
		"\u00e4\n\30\3\31\3\31\3\31\3\32\3\32\3\32\5\32\u00ec\n\32\3\33\3\33\3"+
		"\33\3\33\5\33\u00f2\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\5\34\u00fd\n\34\3\35\3\35\3\35\5\35\u0102\n\35\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\5#\u0136\n#\3$\3$\3$\3$\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u014e\n%\3&\3&\3&\3"+
		"\'\3\'\3\'\5\'\u0156\n\'\3(\3(\3(\3)\3)\3)\5)\u015e\n)\3*\3*\3*\3+\3+"+
		"\3+\5+\u0166\n+\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u0178"+
		"\n-\3.\3.\3.\3/\3/\3/\5/\u0180\n/\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3"+
		"\61\5\61\u018a\n\61\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\5\63\u0194"+
		"\n\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u019f\n\64\3\65"+
		"\3\65\5\65\u01a3\n\65\3\66\3\66\3\66\2\2\67\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhj\2\4\4\2\13"+
		"\r\17\20\3\2\61\63\u01a2\2l\3\2\2\2\4s\3\2\2\2\6y\3\2\2\2\b{\3\2\2\2\n"+
		"\u0083\3\2\2\2\f\u0089\3\2\2\2\16\u008b\3\2\2\2\20\u0094\3\2\2\2\22\u009c"+
		"\3\2\2\2\24\u00a0\3\2\2\2\26\u00a2\3\2\2\2\30\u00a8\3\2\2\2\32\u00ae\3"+
		"\2\2\2\34\u00b0\3\2\2\2\36\u00b4\3\2\2\2 \u00bb\3\2\2\2\"\u00c1\3\2\2"+
		"\2$\u00c8\3\2\2\2&\u00ca\3\2\2\2(\u00d0\3\2\2\2*\u00d6\3\2\2\2,\u00d8"+
		"\3\2\2\2.\u00e3\3\2\2\2\60\u00e5\3\2\2\2\62\u00eb\3\2\2\2\64\u00f1\3\2"+
		"\2\2\66\u00fc\3\2\2\28\u0101\3\2\2\2:\u0103\3\2\2\2<\u010b\3\2\2\2>\u0117"+
		"\3\2\2\2@\u0120\3\2\2\2B\u0126\3\2\2\2D\u0135\3\2\2\2F\u0137\3\2\2\2H"+
		"\u014d\3\2\2\2J\u014f\3\2\2\2L\u0155\3\2\2\2N\u0157\3\2\2\2P\u015d\3\2"+
		"\2\2R\u015f\3\2\2\2T\u0165\3\2\2\2V\u0167\3\2\2\2X\u0177\3\2\2\2Z\u0179"+
		"\3\2\2\2\\\u017f\3\2\2\2^\u0181\3\2\2\2`\u0189\3\2\2\2b\u018b\3\2\2\2"+
		"d\u0193\3\2\2\2f\u019e\3\2\2\2h\u01a2\3\2\2\2j\u01a4\3\2\2\2lm\5\6\4\2"+
		"mn\5\4\3\2no\5\20\t\2o\3\3\2\2\2pt\5\f\7\2qt\5\32\16\2rt\5*\26\2sp\3\2"+
		"\2\2sq\3\2\2\2sr\3\2\2\2t\5\3\2\2\2uz\3\2\2\2vw\5\b\5\2wx\5\6\4\2xz\3"+
		"\2\2\2yu\3\2\2\2yv\3\2\2\2z\7\3\2\2\2{|\7\"\2\2|}\7\21\2\2}~\5\n\6\2~"+
		"\t\3\2\2\2\177\u0084\7\61\2\2\u0080\u0081\7/\2\2\u0081\u0082\7\61\2\2"+
		"\u0082\u0084\7.\2\2\u0083\177\3\2\2\2\u0083\u0080\3\2\2\2\u0084\13\3\2"+
		"\2\2\u0085\u008a\3\2\2\2\u0086\u0087\5\16\b\2\u0087\u0088\5\f\7\2\u0088"+
		"\u008a\3\2\2\2\u0089\u0085\3\2\2\2\u0089\u0086\3\2\2\2\u008a\r\3\2\2\2"+
		"\u008b\u008c\5\22\n\2\u008c\u008d\7\64\2\2\u008d\u008e\7\4\2\2\u008e\u008f"+
		"\5\24\13\2\u008f\u0090\7\5\2\2\u0090\u0091\7\6\2\2\u0091\u0092\5\64\33"+
		"\2\u0092\u0093\7\7\2\2\u0093\17\3\2\2\2\u0094\u0095\7\13\2\2\u0095\u0096"+
		"\7\22\2\2\u0096\u0097\7\4\2\2\u0097\u0098\7\5\2\2\u0098\u0099\7\6\2\2"+
		"\u0099\u009a\5\64\33\2\u009a\u009b\7\7\2\2\u009b\21\3\2\2\2\u009c\u009d"+
		"\t\2\2\2\u009d\23\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u00a1\5\26\f\2\u00a0"+
		"\u009e\3\2\2\2\u00a0\u009f\3\2\2\2\u00a1\25\3\2\2\2\u00a2\u00a3\5\34\17"+
		"\2\u00a3\u00a4\5\30\r\2\u00a4\27\3\2\2\2\u00a5\u00a9\3\2\2\2\u00a6\u00a7"+
		"\7\n\2\2\u00a7\u00a9\5\26\f\2\u00a8\u00a5\3\2\2\2\u00a8\u00a6\3\2\2\2"+
		"\u00a9\31\3\2\2\2\u00aa\u00af\3\2\2\2\u00ab\u00ac\5\34\17\2\u00ac\u00ad"+
		"\5\32\16\2\u00ad\u00af\3\2\2\2\u00ae\u00aa\3\2\2\2\u00ae\u00ab\3\2\2\2"+
		"\u00af\33\3\2\2\2\u00b0\u00b1\5\22\n\2\u00b1\u00b2\5\36\20\2\u00b2\u00b3"+
		"\7$\2\2\u00b3\35\3\2\2\2\u00b4\u00b5\7\64\2\2\u00b5\u00b6\5\"\22\2\u00b6"+
		"\u00b7\5 \21\2\u00b7\37\3\2\2\2\u00b8\u00bc\3\2\2\2\u00b9\u00ba\7\n\2"+
		"\2\u00ba\u00bc\5\36\20\2\u00bb\u00b8\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc"+
		"!\3\2\2\2\u00bd\u00c2\3\2\2\2\u00be\u00bf\7#\2\2\u00bf\u00c2\5J&\2\u00c0"+
		"\u00c2\5$\23\2\u00c1\u00bd\3\2\2\2\u00c1\u00be\3\2\2\2\u00c1\u00c0\3\2"+
		"\2\2\u00c2#\3\2\2\2\u00c3\u00c9\3\2\2\2\u00c4\u00c5\7\b\2\2\u00c5\u00c6"+
		"\5&\24\2\u00c6\u00c7\7\t\2\2\u00c7\u00c9\3\2\2\2\u00c8\u00c3\3\2\2\2\u00c8"+
		"\u00c4\3\2\2\2\u00c9%\3\2\2\2\u00ca\u00cb\5J&\2\u00cb\u00cc\5(\25\2\u00cc"+
		"\'\3\2\2\2\u00cd\u00d1\3\2\2\2\u00ce\u00cf\7\n\2\2\u00cf\u00d1\5&\24\2"+
		"\u00d0\u00cd\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1)\3\2\2\2\u00d2\u00d7\3"+
		"\2\2\2\u00d3\u00d4\5,\27\2\u00d4\u00d5\5*\26\2\u00d5\u00d7\3\2\2\2\u00d6"+
		"\u00d2\3\2\2\2\u00d6\u00d3\3\2\2\2\u00d7+\3\2\2\2\u00d8\u00d9\7\64\2\2"+
		"\u00d9\u00da\5.\30\2\u00da-\3\2\2\2\u00db\u00dc\7#\2\2\u00dc\u00e4\5J"+
		"&\2\u00dd\u00de\7\b\2\2\u00de\u00df\5\60\31\2\u00df\u00e0\7\t\2\2\u00e0"+
		"\u00e1\7#\2\2\u00e1\u00e2\5J&\2\u00e2\u00e4\3\2\2\2\u00e3\u00db\3\2\2"+
		"\2\u00e3\u00dd\3\2\2\2\u00e4/\3\2\2\2\u00e5\u00e6\5J&\2\u00e6\u00e7\5"+
		"\62\32\2\u00e7\61\3\2\2\2\u00e8\u00ec\3\2\2\2\u00e9\u00ea\7\n\2\2\u00ea"+
		"\u00ec\5\60\31\2\u00eb\u00e8\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec\63\3\2"+
		"\2\2\u00ed\u00f2\3\2\2\2\u00ee\u00ef\5\66\34\2\u00ef\u00f0\5\64\33\2\u00f0"+
		"\u00f2\3\2\2\2\u00f1\u00ed\3\2\2\2\u00f1\u00ee\3\2\2\2\u00f2\65\3\2\2"+
		"\2\u00f3\u00fd\7\30\2\2\u00f4\u00fd\7\31\2\2\u00f5\u00fd\5@!\2\u00f6\u00fd"+
		"\5,\27\2\u00f7\u00fd\5\34\17\2\u00f8\u00fd\5F$\2\u00f9\u00fd\5H%\2\u00fa"+
		"\u00fd\58\35\2\u00fb\u00fd\5B\"\2\u00fc\u00f3\3\2\2\2\u00fc\u00f4\3\2"+
		"\2\2\u00fc\u00f5\3\2\2\2\u00fc\u00f6\3\2\2\2\u00fc\u00f7\3\2\2\2\u00fc"+
		"\u00f8\3\2\2\2\u00fc\u00f9\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fb\3\2"+
		"\2\2\u00fd\67\3\2\2\2\u00fe\u0102\5:\36\2\u00ff\u0102\5> \2\u0100\u0102"+
		"\5<\37\2\u0101\u00fe\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0100\3\2\2\2\u0102"+
		"9\3\2\2\2\u0103\u0104\7\23\2\2\u0104\u0105\7\4\2\2\u0105\u0106\5J&\2\u0106"+
		"\u0107\7\5\2\2\u0107\u0108\7\6\2\2\u0108\u0109\5\64\33\2\u0109\u010a\7"+
		"\7\2\2\u010a;\3\2\2\2\u010b\u010c\7\25\2\2\u010c\u010d\7\4\2\2\u010d\u010e"+
		"\5,\27\2\u010e\u010f\7$\2\2\u010f\u0110\5J&\2\u0110\u0111\7$\2\2\u0111"+
		"\u0112\5*\26\2\u0112\u0113\7\5\2\2\u0113\u0114\7\6\2\2\u0114\u0115\5\64"+
		"\33\2\u0115\u0116\7\7\2\2\u0116=\3\2\2\2\u0117\u0118\7\24\2\2\u0118\u0119"+
		"\7\6\2\2\u0119\u011a\5\64\33\2\u011a\u011b\7\7\2\2\u011b\u011c\7\23\2"+
		"\2\u011c\u011d\7\4\2\2\u011d\u011e\5J&\2\u011e\u011f\7\5\2\2\u011f?\3"+
		"\2\2\2\u0120\u0121\7\64\2\2\u0121\u0122\7\4\2\2\u0122\u0123\5\24\13\2"+
		"\u0123\u0124\7\5\2\2\u0124\u0125\7$\2\2\u0125A\3\2\2\2\u0126\u0127\7\26"+
		"\2\2\u0127\u0128\7\4\2\2\u0128\u0129\5J&\2\u0129\u012a\7\5\2\2\u012a\u012b"+
		"\7\6\2\2\u012b\u012c\5\64\33\2\u012c\u012d\7\7\2\2\u012d\u012e\5D#\2\u012e"+
		"C\3\2\2\2\u012f\u0136\3\2\2\2\u0130\u0131\7\27\2\2\u0131\u0132\7\6\2\2"+
		"\u0132\u0133\5\64\33\2\u0133\u0134\7\7\2\2\u0134\u0136\3\2\2\2\u0135\u012f"+
		"\3\2\2\2\u0135\u0130\3\2\2\2\u0136E\3\2\2\2\u0137\u0138\7\35\2\2\u0138"+
		"\u0139\5J&\2\u0139\u013a\7$\2\2\u013aG\3\2\2\2\u013b\u013c\7\32\2\2\u013c"+
		"\u014e\7$\2\2\u013d\u013e\7\33\2\2\u013e\u014e\7$\2\2\u013f\u0140\7\34"+
		"\2\2\u0140\u0141\7\4\2\2\u0141\u0142\7\63\2\2\u0142\u0143\7\n\2\2\u0143"+
		"\u0144\7\63\2\2\u0144\u0145\7\n\2\2\u0145\u0146\7\63\2\2\u0146\u014e\7"+
		"\5\2\2\u0147\u0148\7\36\2\2\u0148\u0149\7\4\2\2\u0149\u014a\7\63\2\2\u014a"+
		"\u014b\7\n\2\2\u014b\u014c\7\63\2\2\u014c\u014e\7\5\2\2\u014d\u013b\3"+
		"\2\2\2\u014d\u013d\3\2\2\2\u014d\u013f\3\2\2\2\u014d\u0147\3\2\2\2\u014e"+
		"I\3\2\2\2\u014f\u0150\5N(\2\u0150\u0151\5L\'\2\u0151K\3\2\2\2\u0152\u0156"+
		"\3\2\2\2\u0153\u0154\7\37\2\2\u0154\u0156\5J&\2\u0155\u0152\3\2\2\2\u0155"+
		"\u0153\3\2\2\2\u0156M\3\2\2\2\u0157\u0158\5R*\2\u0158\u0159\5P)\2\u0159"+
		"O\3\2\2\2\u015a\u015e\3\2\2\2\u015b\u015c\7 \2\2\u015c\u015e\5N(\2\u015d"+
		"\u015a\3\2\2\2\u015d\u015b\3\2\2\2\u015eQ\3\2\2\2\u015f\u0160\5V,\2\u0160"+
		"\u0161\5T+\2\u0161S\3\2\2\2\u0162\u0166\3\2\2\2\u0163\u0164\7!\2\2\u0164"+
		"\u0166\5R*\2\u0165\u0162\3\2\2\2\u0165\u0163\3\2\2\2\u0166U\3\2\2\2\u0167"+
		"\u0168\5Z.\2\u0168\u0169\5X-\2\u0169W\3\2\2\2\u016a\u0178\3\2\2\2\u016b"+
		"\u016c\7*\2\2\u016c\u0178\5Z.\2\u016d\u016e\7+\2\2\u016e\u0178\5Z.\2\u016f"+
		"\u0170\7,\2\2\u0170\u0178\5Z.\2\u0171\u0172\7-\2\2\u0172\u0178\5Z.\2\u0173"+
		"\u0174\7.\2\2\u0174\u0178\5Z.\2\u0175\u0176\7/\2\2\u0176\u0178\5Z.\2\u0177"+
		"\u016a\3\2\2\2\u0177\u016b\3\2\2\2\u0177\u016d\3\2\2\2\u0177\u016f\3\2"+
		"\2\2\u0177\u0171\3\2\2\2\u0177\u0173\3\2\2\2\u0177\u0175\3\2\2\2\u0178"+
		"Y\3\2\2\2\u0179\u017a\5^\60\2\u017a\u017b\5\\/\2\u017b[\3\2\2\2\u017c"+
		"\u0180\3\2\2\2\u017d\u017e\7\'\2\2\u017e\u0180\5Z.\2\u017f\u017c\3\2\2"+
		"\2\u017f\u017d\3\2\2\2\u0180]\3\2\2\2\u0181\u0182\5b\62\2\u0182\u0183"+
		"\5`\61\2\u0183_\3\2\2\2\u0184\u018a\3\2\2\2\u0185\u0186\7(\2\2\u0186\u018a"+
		"\5^\60\2\u0187\u0188\7)\2\2\u0188\u018a\5^\60\2\u0189\u0184\3\2\2\2\u0189"+
		"\u0185\3\2\2\2\u0189\u0187\3\2\2\2\u018aa\3\2\2\2\u018b\u018c\5f\64\2"+
		"\u018c\u018d\5d\63\2\u018dc\3\2\2\2\u018e\u0194\3\2\2\2\u018f\u0190\7"+
		"%\2\2\u0190\u0194\5b\62\2\u0191\u0192\7&\2\2\u0192\u0194\5b\62\2\u0193"+
		"\u018e\3\2\2\2\u0193\u018f\3\2\2\2\u0193\u0191\3\2\2\2\u0194e\3\2\2\2"+
		"\u0195\u0196\7\4\2\2\u0196\u0197\5J&\2\u0197\u0198\7\5\2\2\u0198\u019f"+
		"\3\2\2\2\u0199\u019a\7(\2\2\u019a\u019f\5h\65\2\u019b\u019c\7)\2\2\u019c"+
		"\u019f\5h\65\2\u019d\u019f\5h\65\2\u019e\u0195\3\2\2\2\u019e\u0199\3\2"+
		"\2\2\u019e\u019b\3\2\2\2\u019e\u019d\3\2\2\2\u019fg\3\2\2\2\u01a0\u01a3"+
		"\7\64\2\2\u01a1\u01a3\5j\66\2\u01a2\u01a0\3\2\2\2\u01a2\u01a1\3\2\2\2"+
		"\u01a3i\3\2\2\2\u01a4\u01a5\t\3\2\2\u01a5k\3\2\2\2\36sy\u0083\u0089\u00a0"+
		"\u00a8\u00ae\u00bb\u00c1\u00c8\u00d0\u00d6\u00e3\u00eb\u00f1\u00fc\u0101"+
		"\u0135\u014d\u0155\u015d\u0165\u0177\u017f\u0189\u0193\u019e\u01a2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}