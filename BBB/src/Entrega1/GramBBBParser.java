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
		CTBT=46, CTBF=47, CTEC=48, CTES=49, CTEF=50, CTEI=51, ID=52;
	public static final int
		RULE_init = 0, RULE_body = 1, RULE_includes = 2, RULE_include = 3, RULE_include2 = 4, 
		RULE_functiondecl = 5, RULE_maindecl = 6, RULE_type = 7, RULE_params = 8, 
		RULE_params2 = 9, RULE_params3 = 10, RULE_declaration = 11, RULE_multivar = 12, 
		RULE_multivar2 = 13, RULE_dasign = 14, RULE_multidim = 15, RULE_dimd = 16, 
		RULE_dimd2 = 17, RULE_asignations = 18, RULE_asignation = 19, RULE_asignation2 = 20, 
		RULE_dima = 21, RULE_dima2 = 22, RULE_estatutos = 23, RULE_estatuto = 24, 
		RULE_loops = 25, RULE_llwhile = 26, RULE_llfor = 27, RULE_lldowhile = 28, 
		RULE_functioncall = 29, RULE_conditional = 30, RULE_conditional2 = 31, 
		RULE_print = 32, RULE_instructions = 33, RULE_exp = 34, RULE_exp2 = 35, 
		RULE_exo = 36, RULE_exo2 = 37, RULE_exn = 38, RULE_exn2 = 39, RULE_exi = 40, 
		RULE_exi2 = 41, RULE_exm = 42, RULE_exm2 = 43, RULE_ex = 44, RULE_ex2 = 45, 
		RULE_termino = 46, RULE_termino2 = 47, RULE_factor = 48, RULE_var = 49, 
		RULE_multidimv = 50, RULE_dimv = 51, RULE_dimv2 = 52, RULE_cte = 53;
	public static final String[] ruleNames = {
		"init", "body", "includes", "include", "include2", "functiondecl", "maindecl", 
		"type", "params", "params2", "params3", "declaration", "multivar", "multivar2", 
		"dasign", "multidim", "dimd", "dimd2", "asignations", "asignation", "asignation2", 
		"dima", "dima2", "estatutos", "estatuto", "loops", "llwhile", "llfor", 
		"lldowhile", "functioncall", "conditional", "conditional2", "print", "instructions", 
		"exp", "exp2", "exo", "exo2", "exn", "exn2", "exi", "exi2", "exm", "exm2", 
		"ex", "ex2", "termino", "termino2", "factor", "var", "multidimv", "dimv", 
		"dimv2", "cte"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'('", "')'", "'{'", "'}'", "'['", "']'", "','", "'ent'", 
		"'dec'", "'bool'", "'car'", "'cadena'", "'nada'", "'incluir'", "'main'", 
		"'mientras'", "'hacer'", "'para'", "'si'", "'sino'", "'romper'", "'regresar'", 
		"'pintar'", "'flotar'", "'color'", "'imprime'", "'mover'", "'&&'", "'||'", 
		"'!'", "'#'", "'='", "';'", "'*'", "'/'", "'%'", "'+'", "'-'", "'>='", 
		"'<='", "'=='", "'!='", "'>'", "'<'", "'verdadero'", "'falso'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WS", "OP", "CP", "OK", "CK", "OB", "CB", "COM", "INT", "FLT", "BOL", 
		"CHA", "STR", "VOID", "INCL", "MAIN", "LWHILE", "LDO", "LFOR", "CIF", 
		"CELSE", "BRK", "RTRN", "PINU", "PIND", "COL", "PRNT", "MOV", "OAND", 
		"OOR", "ONOT", "HT", "IGU", "DEL", "MLT", "DIV", "MOD", "PLS", "SUB", 
		"MAI", "MEI", "OIG", "DIF", "MAY", "MEN", "CTBT", "CTBF", "CTEC", "CTES", 
		"CTEF", "CTEI", "ID"
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
			setState(108);
			CompiAPI.INIT.ins1();includes();
			setState(109);
			body();
			setState(110);
			maindecl();CompiAPI.INIT.ins2();
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
		public FunctiondeclContext functiondecl() {
			return getRuleContext(FunctiondeclContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public AsignationContext asignation() {
			return getRuleContext(AsignationContext.class,0);
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
			setState(122);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				functiondecl();
				setState(114);
				body();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(116);
				declaration();
				setState(117);
				body();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(119);
				asignation();
				setState(120);
				body();
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
			setState(128);
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
				setState(125);
				include();
				setState(126);
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
			setState(130);
			match(HT);
			setState(131);
			match(INCL);
			setState(132);
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
			setState(138);
			switch (_input.LA(1)) {
			case CTES:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				match(CTES);
				}
				break;
			case MEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				match(MEN);
				setState(136);
				match(CTES);
				setState(137);
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
		enterRule(_localctx, 10, RULE_functiondecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			type();CompiAPI.FUNCDECL.ins1();
			setState(141);
			CompiAPI.FUNCDECL.ins2(this.getCurrentToken().getText());match(ID);
			setState(142);
			match(OP);
			setState(143);
			params();
			setState(144);
			match(CP);CompiAPI.FUNCDECL.ins3();
			setState(145);
			match(OK);
			setState(146);
			estatutos();
			setState(147);
			match(CK);CompiAPI.FUNCDECL.ins4();
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
		enterRule(_localctx, 12, RULE_maindecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(INT);
			setState(150);
			match(MAIN);CompiAPI.MAINDECL.ins1();
			setState(151);
			match(OP);
			setState(152);
			match(CP);
			setState(153);
			match(OK);
			setState(154);
			estatutos();
			setState(155);
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
		enterRule(_localctx, 14, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
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
		enterRule(_localctx, 16, RULE_params);
		try {
			setState(161);
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
				setState(160);
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
		enterRule(_localctx, 18, RULE_params2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			declaration();
			setState(164);
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
		enterRule(_localctx, 20, RULE_params3);
		try {
			setState(169);
			switch (_input.LA(1)) {
			case CP:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case COM:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				match(COM);
				setState(168);
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
		enterRule(_localctx, 22, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			type();CompiAPI.DECL.ins1();
			setState(172);
			multivar();
			setState(173);
			match(DEL);CompiAPI.DECL.ins4();
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
		enterRule(_localctx, 24, RULE_multivar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			CompiAPI.DECL.ins2(getCurrentToken().getText());match(ID);
			setState(176);
			dasign();
			setState(177);
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
		enterRule(_localctx, 26, RULE_multivar2);
		try {
			setState(182);
			switch (_input.LA(1)) {
			case DEL:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case COM:
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				match(COM);CompiAPI.DECL.ins4();
				setState(181);
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
		enterRule(_localctx, 28, RULE_dasign);
		try {
			setState(188);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				match(IGU);CompiAPI.DECL.ins3();
				setState(186);
				exp();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(187);
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
		enterRule(_localctx, 30, RULE_multidim);
		try {
			setState(195);
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
				setState(191);
				match(OB);
				setState(192);
				dimd();CompiAPI.DECL.ins6();
				setState(193);
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
		enterRule(_localctx, 32, RULE_dimd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			exp();CompiAPI.DECL.ins5();
			setState(198);
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
		enterRule(_localctx, 34, RULE_dimd2);
		try {
			setState(203);
			switch (_input.LA(1)) {
			case CB:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case COM:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				match(COM);
				setState(202);
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
		enterRule(_localctx, 36, RULE_asignations);
		try {
			setState(209);
			switch (_input.LA(1)) {
			case CP:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				asignation();
				setState(207);
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
		public TerminalNode DEL() { return getToken(GramBBBParser.DEL, 0); }
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
		enterRule(_localctx, 38, RULE_asignation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			CompiAPI.ASIGNATION.ins1(this.getCurrentToken().getText()); match(ID);
			setState(212);
			asignation2();
			setState(213);
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
		enterRule(_localctx, 40, RULE_asignation2);
		try {
			setState(223);
			switch (_input.LA(1)) {
			case IGU:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				match(IGU);
				setState(216);
				exp();CompiAPI.ASIGNATION.ins2();
				}
				break;
			case OB:
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				match(OB);CompiAPI.ASIGNATION.ins3();
				setState(218);
				dima();
				setState(219);
				match(CB);CompiAPI.ASIGNATION.ins5();
				setState(220);
				match(IGU);
				setState(221);
				exp();CompiAPI.ASIGNATION.ins6();
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
		enterRule(_localctx, 42, RULE_dima);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			exp();CompiAPI.ASIGNATION.ins4();
			setState(226);
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
		enterRule(_localctx, 44, RULE_dima2);
		try {
			setState(231);
			switch (_input.LA(1)) {
			case CB:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case COM:
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				match(COM);
				setState(230);
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
		enterRule(_localctx, 46, RULE_estatutos);
		try {
			setState(237);
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
				setState(234);
				estatuto();
				setState(235);
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
		enterRule(_localctx, 48, RULE_estatuto);
		try {
			setState(248);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(239);
				match(BRK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
				match(RTRN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(241);
				functioncall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(242);
				asignation();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(243);
				declaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(244);
				print();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(245);
				instructions();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(246);
				loops();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(247);
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
		enterRule(_localctx, 50, RULE_loops);
		try {
			setState(253);
			switch (_input.LA(1)) {
			case LWHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				llwhile();
				}
				break;
			case LDO:
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				lldowhile();
				}
				break;
			case LFOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(252);
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
		enterRule(_localctx, 52, RULE_llwhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(LWHILE);
			setState(256);
			match(OP);CompiAPI.WHILE.ins1();
			setState(257);
			exp();
			setState(258);
			match(CP);CompiAPI.WHILE.ins2();
			setState(259);
			match(OK);
			setState(260);
			estatutos();
			setState(261);
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
		enterRule(_localctx, 54, RULE_llfor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(LFOR);
			setState(264);
			match(OP);
			setState(265);
			asignation();
			setState(266);
			match(DEL);CompiAPI.FOR.ins1();
			setState(267);
			exp();
			setState(268);
			match(DEL);CompiAPI.FOR.ins2();
			setState(269);
			asignations();
			setState(270);
			match(CP);CompiAPI.FOR.ins3();
			setState(271);
			match(OK);
			setState(272);
			estatutos();
			setState(273);
			match(CK);CompiAPI.FOR.ins4();
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
		enterRule(_localctx, 56, RULE_lldowhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(LDO);CompiAPI.DOWHILE.ins1();
			setState(276);
			match(OK);
			setState(277);
			estatutos();
			setState(278);
			match(CK);
			setState(279);
			match(LWHILE);
			setState(280);
			match(OP);
			setState(281);
			exp();
			setState(282);
			match(CP);CompiAPI.DOWHILE.ins2();
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
		enterRule(_localctx, 58, RULE_functioncall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(ID);
			setState(285);
			match(OP);
			setState(286);
			params();
			setState(287);
			match(CP);
			setState(288);
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
		enterRule(_localctx, 60, RULE_conditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(CIF);
			setState(291);
			match(OP);
			setState(292);
			exp();
			setState(293);
			match(CP);CompiAPI.IF.ins1();
			setState(294);
			match(OK);
			setState(295);
			estatutos();
			setState(296);
			match(CK);CompiAPI.IF.ins2();
			setState(297);
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
		enterRule(_localctx, 62, RULE_conditional2);
		try {
			setState(305);
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
				setState(300);
				match(CELSE);
				setState(301);
				match(OK);
				setState(302);
				estatutos();
				setState(303);
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
		enterRule(_localctx, 64, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(PRNT);
			setState(308);
			exp();
			setState(309);
			match(DEL);CompiAPI.PRINT.ins1();
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
		enterRule(_localctx, 66, RULE_instructions);
		try {
			setState(329);
			switch (_input.LA(1)) {
			case PINU:
				enterOuterAlt(_localctx, 1);
				{
				setState(311);
				match(PINU);
				setState(312);
				match(DEL);
				}
				break;
			case PIND:
				enterOuterAlt(_localctx, 2);
				{
				setState(313);
				match(PIND);
				setState(314);
				match(DEL);
				}
				break;
			case COL:
				enterOuterAlt(_localctx, 3);
				{
				setState(315);
				match(COL);
				setState(316);
				match(OP);
				setState(317);
				match(CTEI);
				setState(318);
				match(COM);
				setState(319);
				match(CTEI);
				setState(320);
				match(COM);
				setState(321);
				match(CTEI);
				setState(322);
				match(CP);
				}
				break;
			case MOV:
				enterOuterAlt(_localctx, 4);
				{
				setState(323);
				match(MOV);
				setState(324);
				match(OP);
				setState(325);
				match(CTEI);
				setState(326);
				match(COM);
				setState(327);
				match(CTEI);
				setState(328);
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
		enterRule(_localctx, 68, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			exo();
			setState(332);
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
		enterRule(_localctx, 70, RULE_exp2);
		try {
			setState(337);
			switch (_input.LA(1)) {
			case CP:
			case CB:
			case COM:
			case DEL:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case OAND:
				enterOuterAlt(_localctx, 2);
				{
				setState(335);
				match(OAND);CompiAPI.EXP.ins9(DATA.AND);
				setState(336);
				exp();CompiAPI.EXP.ins10();
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
		enterRule(_localctx, 72, RULE_exo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			exn();
			setState(340);
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
		enterRule(_localctx, 74, RULE_exo2);
		try {
			setState(345);
			switch (_input.LA(1)) {
			case CP:
			case CB:
			case COM:
			case OAND:
			case DEL:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case OOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(343);
				match(OOR);CompiAPI.EXP.ins9(DATA.OOR);
				setState(344);
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
		enterRule(_localctx, 76, RULE_exn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			exi();
			setState(348);
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
		enterRule(_localctx, 78, RULE_exn2);
		try {
			setState(353);
			switch (_input.LA(1)) {
			case CP:
			case CB:
			case COM:
			case OAND:
			case OOR:
			case DEL:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case ONOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(351);
				match(ONOT);
				setState(352);
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
		enterRule(_localctx, 80, RULE_exi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			exm();
			setState(356);
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
		enterRule(_localctx, 82, RULE_exi2);
		try {
			setState(371);
			switch (_input.LA(1)) {
			case CP:
			case CB:
			case COM:
			case OAND:
			case OOR:
			case ONOT:
			case DEL:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case MAI:
				enterOuterAlt(_localctx, 2);
				{
				setState(359);
				match(MAI);CompiAPI.EXP.ins9(DATA.GOE);
				setState(360);
				exm();CompiAPI.EXP.ins10();
				}
				break;
			case MEI:
				enterOuterAlt(_localctx, 3);
				{
				setState(361);
				match(MEI);CompiAPI.EXP.ins9(DATA.LOE);
				setState(362);
				exm();CompiAPI.EXP.ins10();
				}
				break;
			case OIG:
				enterOuterAlt(_localctx, 4);
				{
				setState(363);
				match(OIG);CompiAPI.EXP.ins9(DATA.EQT);
				setState(364);
				exm();CompiAPI.EXP.ins10();
				}
				break;
			case DIF:
				enterOuterAlt(_localctx, 5);
				{
				setState(365);
				match(DIF);CompiAPI.EXP.ins9(DATA.DIF);
				setState(366);
				exm();CompiAPI.EXP.ins10();
				}
				break;
			case MAY:
				enterOuterAlt(_localctx, 6);
				{
				setState(367);
				match(MAY);CompiAPI.EXP.ins9(DATA.OGT);
				setState(368);
				exm();CompiAPI.EXP.ins10();
				}
				break;
			case MEN:
				enterOuterAlt(_localctx, 7);
				{
				setState(369);
				match(MEN);CompiAPI.EXP.ins9(DATA.OLT);
				setState(370);
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
		enterRule(_localctx, 84, RULE_exm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			ex();CompiAPI.EXP.ins8();
			setState(374);
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
		enterRule(_localctx, 86, RULE_exm2);
		try {
			setState(379);
			switch (_input.LA(1)) {
			case CP:
			case CB:
			case COM:
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
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case MOD:
				enterOuterAlt(_localctx, 2);
				{
				setState(377);
				match(MOD);CompiAPI.EXP.ins9(DATA.MOD);
				setState(378);
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
		enterRule(_localctx, 88, RULE_ex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			termino();CompiAPI.EXP.ins6();
			setState(382);
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
		enterRule(_localctx, 90, RULE_ex2);
		try {
			setState(389);
			switch (_input.LA(1)) {
			case CP:
			case CB:
			case COM:
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
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case PLS:
				enterOuterAlt(_localctx, 2);
				{
				setState(385);
				match(PLS);CompiAPI.EXP.ins7(DATA.ADD);
				setState(386);
				ex();   
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 3);
				{
				setState(387);
				match(SUB);CompiAPI.EXP.ins7(DATA.SUB);
				setState(388);
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
		enterRule(_localctx, 92, RULE_termino);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			factor();
			setState(392);
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
		enterRule(_localctx, 94, RULE_termino2);
		try {
			setState(399);
			switch (_input.LA(1)) {
			case CP:
			case CB:
			case COM:
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
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case MLT:
				enterOuterAlt(_localctx, 2);
				{
				setState(395);
				match(MLT);CompiAPI.EXP.ins5(DATA.MUL);
				setState(396);
				termino();
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 3);
				{
				setState(397);
				match(DIV);CompiAPI.EXP.ins5(DATA.DIV);
				setState(398);
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
		enterRule(_localctx, 96, RULE_factor);
		try {
			setState(410);
			switch (_input.LA(1)) {
			case OP:
				enterOuterAlt(_localctx, 1);
				{
				setState(401);
				match(OP);CompiAPI.EXP.ins1();
				setState(402);
				exp();
				setState(403);
				match(CP);CompiAPI.EXP.ins2();
				}
				break;
			case PLS:
				enterOuterAlt(_localctx, 2);
				{
				setState(405);
				match(PLS);
				setState(406);
				var();CompiAPI.EXP.ins3();
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 3);
				{
				setState(407);
				match(SUB);CompiAPI.EXP.ins4();
				setState(408);
				var();CompiAPI.EXP.ins3();
				}
				break;
			case CTBT:
			case CTBF:
			case CTES:
			case CTEF:
			case CTEI:
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(409);
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
		public MultidimvContext multidimv() {
			return getRuleContext(MultidimvContext.class,0);
		}
		public CteContext cte() {
			return getRuleContext(CteContext.class,0);
		}
		public FunctioncallContext functioncall() {
			return getRuleContext(FunctioncallContext.class,0);
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
		enterRule(_localctx, 98, RULE_var);
		try {
			setState(416);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(412);
				CompiAPI.VAR.ins2(this.getCurrentToken().getText());match(ID);
				setState(413);
				multidimv();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(414);
				cte();CompiAPI.VAR.ins1();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(415);
				functioncall();
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

	public static class MultidimvContext extends ParserRuleContext {
		public TerminalNode OB() { return getToken(GramBBBParser.OB, 0); }
		public DimvContext dimv() {
			return getRuleContext(DimvContext.class,0);
		}
		public TerminalNode CB() { return getToken(GramBBBParser.CB, 0); }
		public MultidimvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multidimv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).enterMultidimv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).exitMultidimv(this);
		}
	}

	public final MultidimvContext multidimv() throws RecognitionException {
		MultidimvContext _localctx = new MultidimvContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_multidimv);
		try {
			setState(423);
			switch (_input.LA(1)) {
			case CP:
			case CB:
			case COM:
			case OAND:
			case OOR:
			case ONOT:
			case DEL:
			case MLT:
			case DIV:
			case MOD:
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
			case OB:
				enterOuterAlt(_localctx, 2);
				{
				setState(419);
				match(OB);
				setState(420);
				dimv();
				setState(421);
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

	public static class DimvContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Dimv2Context dimv2() {
			return getRuleContext(Dimv2Context.class,0);
		}
		public DimvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).enterDimv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).exitDimv(this);
		}
	}

	public final DimvContext dimv() throws RecognitionException {
		DimvContext _localctx = new DimvContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_dimv);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			exp();
			setState(426);
			dimv2();
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

	public static class Dimv2Context extends ParserRuleContext {
		public TerminalNode COM() { return getToken(GramBBBParser.COM, 0); }
		public DimvContext dimv() {
			return getRuleContext(DimvContext.class,0);
		}
		public Dimv2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimv2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).enterDimv2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramBBBListener ) ((GramBBBListener)listener).exitDimv2(this);
		}
	}

	public final Dimv2Context dimv2() throws RecognitionException {
		Dimv2Context _localctx = new Dimv2Context(_ctx, getState());
		enterRule(_localctx, 104, RULE_dimv2);
		try {
			setState(431);
			switch (_input.LA(1)) {
			case CB:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case COM:
				enterOuterAlt(_localctx, 2);
				{
				setState(429);
				match(COM);
				setState(430);
				dimv();
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
		public TerminalNode CTBT() { return getToken(GramBBBParser.CTBT, 0); }
		public TerminalNode CTBF() { return getToken(GramBBBParser.CTBF, 0); }
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
		enterRule(_localctx, 106, RULE_cte);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CTBT) | (1L << CTBF) | (1L << CTES) | (1L << CTEF) | (1L << CTEI))) != 0)) ) {
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\66\u01b6\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\5\3}\n\3\3\4\3\4\3\4\3\4\5\4\u0083\n\4\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\5\6\u008d\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\5\n\u00a4\n\n\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\5\f\u00ac\n\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\17\3\17\3\17\5\17\u00b9\n\17\3\20\3\20\3\20\3\20\5\20\u00bf\n\20"+
		"\3\21\3\21\3\21\3\21\3\21\5\21\u00c6\n\21\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\5\23\u00ce\n\23\3\24\3\24\3\24\3\24\5\24\u00d4\n\24\3\25\3\25\3\25\3"+
		"\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00e2\n\26\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\5\30\u00ea\n\30\3\31\3\31\3\31\3\31\5\31\u00f0\n"+
		"\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u00fb\n\32\3\33"+
		"\3\33\3\33\5\33\u0100\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 "+
		"\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\5!\u0134\n!\3\"\3\"\3\"\3\"\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u014c\n#\3$\3$\3"+
		"$\3%\3%\3%\5%\u0154\n%\3&\3&\3&\3\'\3\'\3\'\5\'\u015c\n\'\3(\3(\3(\3)"+
		"\3)\3)\5)\u0164\n)\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+"+
		"\u0176\n+\3,\3,\3,\3-\3-\3-\5-\u017e\n-\3.\3.\3.\3/\3/\3/\3/\3/\5/\u0188"+
		"\n/\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\5\61\u0192\n\61\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u019d\n\62\3\63\3\63\3\63\3\63"+
		"\5\63\u01a3\n\63\3\64\3\64\3\64\3\64\3\64\5\64\u01aa\n\64\3\65\3\65\3"+
		"\65\3\66\3\66\3\66\5\66\u01b2\n\66\3\67\3\67\3\67\2\28\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bd"+
		"fhjl\2\4\4\2\13\r\17\20\4\2\60\61\63\65\u01b2\2n\3\2\2\2\4|\3\2\2\2\6"+
		"\u0082\3\2\2\2\b\u0084\3\2\2\2\n\u008c\3\2\2\2\f\u008e\3\2\2\2\16\u0097"+
		"\3\2\2\2\20\u009f\3\2\2\2\22\u00a3\3\2\2\2\24\u00a5\3\2\2\2\26\u00ab\3"+
		"\2\2\2\30\u00ad\3\2\2\2\32\u00b1\3\2\2\2\34\u00b8\3\2\2\2\36\u00be\3\2"+
		"\2\2 \u00c5\3\2\2\2\"\u00c7\3\2\2\2$\u00cd\3\2\2\2&\u00d3\3\2\2\2(\u00d5"+
		"\3\2\2\2*\u00e1\3\2\2\2,\u00e3\3\2\2\2.\u00e9\3\2\2\2\60\u00ef\3\2\2\2"+
		"\62\u00fa\3\2\2\2\64\u00ff\3\2\2\2\66\u0101\3\2\2\28\u0109\3\2\2\2:\u0115"+
		"\3\2\2\2<\u011e\3\2\2\2>\u0124\3\2\2\2@\u0133\3\2\2\2B\u0135\3\2\2\2D"+
		"\u014b\3\2\2\2F\u014d\3\2\2\2H\u0153\3\2\2\2J\u0155\3\2\2\2L\u015b\3\2"+
		"\2\2N\u015d\3\2\2\2P\u0163\3\2\2\2R\u0165\3\2\2\2T\u0175\3\2\2\2V\u0177"+
		"\3\2\2\2X\u017d\3\2\2\2Z\u017f\3\2\2\2\\\u0187\3\2\2\2^\u0189\3\2\2\2"+
		"`\u0191\3\2\2\2b\u019c\3\2\2\2d\u01a2\3\2\2\2f\u01a9\3\2\2\2h\u01ab\3"+
		"\2\2\2j\u01b1\3\2\2\2l\u01b3\3\2\2\2no\5\6\4\2op\5\4\3\2pq\5\16\b\2q\3"+
		"\3\2\2\2r}\3\2\2\2st\5\f\7\2tu\5\4\3\2u}\3\2\2\2vw\5\30\r\2wx\5\4\3\2"+
		"x}\3\2\2\2yz\5(\25\2z{\5\4\3\2{}\3\2\2\2|r\3\2\2\2|s\3\2\2\2|v\3\2\2\2"+
		"|y\3\2\2\2}\5\3\2\2\2~\u0083\3\2\2\2\177\u0080\5\b\5\2\u0080\u0081\5\6"+
		"\4\2\u0081\u0083\3\2\2\2\u0082~\3\2\2\2\u0082\177\3\2\2\2\u0083\7\3\2"+
		"\2\2\u0084\u0085\7\"\2\2\u0085\u0086\7\21\2\2\u0086\u0087\5\n\6\2\u0087"+
		"\t\3\2\2\2\u0088\u008d\7\63\2\2\u0089\u008a\7/\2\2\u008a\u008b\7\63\2"+
		"\2\u008b\u008d\7.\2\2\u008c\u0088\3\2\2\2\u008c\u0089\3\2\2\2\u008d\13"+
		"\3\2\2\2\u008e\u008f\5\20\t\2\u008f\u0090\7\66\2\2\u0090\u0091\7\4\2\2"+
		"\u0091\u0092\5\22\n\2\u0092\u0093\7\5\2\2\u0093\u0094\7\6\2\2\u0094\u0095"+
		"\5\60\31\2\u0095\u0096\7\7\2\2\u0096\r\3\2\2\2\u0097\u0098\7\13\2\2\u0098"+
		"\u0099\7\22\2\2\u0099\u009a\7\4\2\2\u009a\u009b\7\5\2\2\u009b\u009c\7"+
		"\6\2\2\u009c\u009d\5\60\31\2\u009d\u009e\7\7\2\2\u009e\17\3\2\2\2\u009f"+
		"\u00a0\t\2\2\2\u00a0\21\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a4\5\24\13"+
		"\2\u00a3\u00a1\3\2\2\2\u00a3\u00a2\3\2\2\2\u00a4\23\3\2\2\2\u00a5\u00a6"+
		"\5\30\r\2\u00a6\u00a7\5\26\f\2\u00a7\25\3\2\2\2\u00a8\u00ac\3\2\2\2\u00a9"+
		"\u00aa\7\n\2\2\u00aa\u00ac\5\24\13\2\u00ab\u00a8\3\2\2\2\u00ab\u00a9\3"+
		"\2\2\2\u00ac\27\3\2\2\2\u00ad\u00ae\5\20\t\2\u00ae\u00af\5\32\16\2\u00af"+
		"\u00b0\7$\2\2\u00b0\31\3\2\2\2\u00b1\u00b2\7\66\2\2\u00b2\u00b3\5\36\20"+
		"\2\u00b3\u00b4\5\34\17\2\u00b4\33\3\2\2\2\u00b5\u00b9\3\2\2\2\u00b6\u00b7"+
		"\7\n\2\2\u00b7\u00b9\5\32\16\2\u00b8\u00b5\3\2\2\2\u00b8\u00b6\3\2\2\2"+
		"\u00b9\35\3\2\2\2\u00ba\u00bf\3\2\2\2\u00bb\u00bc\7#\2\2\u00bc\u00bf\5"+
		"F$\2\u00bd\u00bf\5 \21\2\u00be\u00ba\3\2\2\2\u00be\u00bb\3\2\2\2\u00be"+
		"\u00bd\3\2\2\2\u00bf\37\3\2\2\2\u00c0\u00c6\3\2\2\2\u00c1\u00c2\7\b\2"+
		"\2\u00c2\u00c3\5\"\22\2\u00c3\u00c4\7\t\2\2\u00c4\u00c6\3\2\2\2\u00c5"+
		"\u00c0\3\2\2\2\u00c5\u00c1\3\2\2\2\u00c6!\3\2\2\2\u00c7\u00c8\5F$\2\u00c8"+
		"\u00c9\5$\23\2\u00c9#\3\2\2\2\u00ca\u00ce\3\2\2\2\u00cb\u00cc\7\n\2\2"+
		"\u00cc\u00ce\5\"\22\2\u00cd\u00ca\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce%\3"+
		"\2\2\2\u00cf\u00d4\3\2\2\2\u00d0\u00d1\5(\25\2\u00d1\u00d2\5&\24\2\u00d2"+
		"\u00d4\3\2\2\2\u00d3\u00cf\3\2\2\2\u00d3\u00d0\3\2\2\2\u00d4\'\3\2\2\2"+
		"\u00d5\u00d6\7\66\2\2\u00d6\u00d7\5*\26\2\u00d7\u00d8\7$\2\2\u00d8)\3"+
		"\2\2\2\u00d9\u00da\7#\2\2\u00da\u00e2\5F$\2\u00db\u00dc\7\b\2\2\u00dc"+
		"\u00dd\5,\27\2\u00dd\u00de\7\t\2\2\u00de\u00df\7#\2\2\u00df\u00e0\5F$"+
		"\2\u00e0\u00e2\3\2\2\2\u00e1\u00d9\3\2\2\2\u00e1\u00db\3\2\2\2\u00e2+"+
		"\3\2\2\2\u00e3\u00e4\5F$\2\u00e4\u00e5\5.\30\2\u00e5-\3\2\2\2\u00e6\u00ea"+
		"\3\2\2\2\u00e7\u00e8\7\n\2\2\u00e8\u00ea\5,\27\2\u00e9\u00e6\3\2\2\2\u00e9"+
		"\u00e7\3\2\2\2\u00ea/\3\2\2\2\u00eb\u00f0\3\2\2\2\u00ec\u00ed\5\62\32"+
		"\2\u00ed\u00ee\5\60\31\2\u00ee\u00f0\3\2\2\2\u00ef\u00eb\3\2\2\2\u00ef"+
		"\u00ec\3\2\2\2\u00f0\61\3\2\2\2\u00f1\u00fb\7\30\2\2\u00f2\u00fb\7\31"+
		"\2\2\u00f3\u00fb\5<\37\2\u00f4\u00fb\5(\25\2\u00f5\u00fb\5\30\r\2\u00f6"+
		"\u00fb\5B\"\2\u00f7\u00fb\5D#\2\u00f8\u00fb\5\64\33\2\u00f9\u00fb\5> "+
		"\2\u00fa\u00f1\3\2\2\2\u00fa\u00f2\3\2\2\2\u00fa\u00f3\3\2\2\2\u00fa\u00f4"+
		"\3\2\2\2\u00fa\u00f5\3\2\2\2\u00fa\u00f6\3\2\2\2\u00fa\u00f7\3\2\2\2\u00fa"+
		"\u00f8\3\2\2\2\u00fa\u00f9\3\2\2\2\u00fb\63\3\2\2\2\u00fc\u0100\5\66\34"+
		"\2\u00fd\u0100\5:\36\2\u00fe\u0100\58\35\2\u00ff\u00fc\3\2\2\2\u00ff\u00fd"+
		"\3\2\2\2\u00ff\u00fe\3\2\2\2\u0100\65\3\2\2\2\u0101\u0102\7\23\2\2\u0102"+
		"\u0103\7\4\2\2\u0103\u0104\5F$\2\u0104\u0105\7\5\2\2\u0105\u0106\7\6\2"+
		"\2\u0106\u0107\5\60\31\2\u0107\u0108\7\7\2\2\u0108\67\3\2\2\2\u0109\u010a"+
		"\7\25\2\2\u010a\u010b\7\4\2\2\u010b\u010c\5(\25\2\u010c\u010d\7$\2\2\u010d"+
		"\u010e\5F$\2\u010e\u010f\7$\2\2\u010f\u0110\5&\24\2\u0110\u0111\7\5\2"+
		"\2\u0111\u0112\7\6\2\2\u0112\u0113\5\60\31\2\u0113\u0114\7\7\2\2\u0114"+
		"9\3\2\2\2\u0115\u0116\7\24\2\2\u0116\u0117\7\6\2\2\u0117\u0118\5\60\31"+
		"\2\u0118\u0119\7\7\2\2\u0119\u011a\7\23\2\2\u011a\u011b\7\4\2\2\u011b"+
		"\u011c\5F$\2\u011c\u011d\7\5\2\2\u011d;\3\2\2\2\u011e\u011f\7\66\2\2\u011f"+
		"\u0120\7\4\2\2\u0120\u0121\5\22\n\2\u0121\u0122\7\5\2\2\u0122\u0123\7"+
		"$\2\2\u0123=\3\2\2\2\u0124\u0125\7\26\2\2\u0125\u0126\7\4\2\2\u0126\u0127"+
		"\5F$\2\u0127\u0128\7\5\2\2\u0128\u0129\7\6\2\2\u0129\u012a\5\60\31\2\u012a"+
		"\u012b\7\7\2\2\u012b\u012c\5@!\2\u012c?\3\2\2\2\u012d\u0134\3\2\2\2\u012e"+
		"\u012f\7\27\2\2\u012f\u0130\7\6\2\2\u0130\u0131\5\60\31\2\u0131\u0132"+
		"\7\7\2\2\u0132\u0134\3\2\2\2\u0133\u012d\3\2\2\2\u0133\u012e\3\2\2\2\u0134"+
		"A\3\2\2\2\u0135\u0136\7\35\2\2\u0136\u0137\5F$\2\u0137\u0138\7$\2\2\u0138"+
		"C\3\2\2\2\u0139\u013a\7\32\2\2\u013a\u014c\7$\2\2\u013b\u013c\7\33\2\2"+
		"\u013c\u014c\7$\2\2\u013d\u013e\7\34\2\2\u013e\u013f\7\4\2\2\u013f\u0140"+
		"\7\65\2\2\u0140\u0141\7\n\2\2\u0141\u0142\7\65\2\2\u0142\u0143\7\n\2\2"+
		"\u0143\u0144\7\65\2\2\u0144\u014c\7\5\2\2\u0145\u0146\7\36\2\2\u0146\u0147"+
		"\7\4\2\2\u0147\u0148\7\65\2\2\u0148\u0149\7\n\2\2\u0149\u014a\7\65\2\2"+
		"\u014a\u014c\7\5\2\2\u014b\u0139\3\2\2\2\u014b\u013b\3\2\2\2\u014b\u013d"+
		"\3\2\2\2\u014b\u0145\3\2\2\2\u014cE\3\2\2\2\u014d\u014e\5J&\2\u014e\u014f"+
		"\5H%\2\u014fG\3\2\2\2\u0150\u0154\3\2\2\2\u0151\u0152\7\37\2\2\u0152\u0154"+
		"\5F$\2\u0153\u0150\3\2\2\2\u0153\u0151\3\2\2\2\u0154I\3\2\2\2\u0155\u0156"+
		"\5N(\2\u0156\u0157\5L\'\2\u0157K\3\2\2\2\u0158\u015c\3\2\2\2\u0159\u015a"+
		"\7 \2\2\u015a\u015c\5J&\2\u015b\u0158\3\2\2\2\u015b\u0159\3\2\2\2\u015c"+
		"M\3\2\2\2\u015d\u015e\5R*\2\u015e\u015f\5P)\2\u015fO\3\2\2\2\u0160\u0164"+
		"\3\2\2\2\u0161\u0162\7!\2\2\u0162\u0164\5N(\2\u0163\u0160\3\2\2\2\u0163"+
		"\u0161\3\2\2\2\u0164Q\3\2\2\2\u0165\u0166\5V,\2\u0166\u0167\5T+\2\u0167"+
		"S\3\2\2\2\u0168\u0176\3\2\2\2\u0169\u016a\7*\2\2\u016a\u0176\5V,\2\u016b"+
		"\u016c\7+\2\2\u016c\u0176\5V,\2\u016d\u016e\7,\2\2\u016e\u0176\5V,\2\u016f"+
		"\u0170\7-\2\2\u0170\u0176\5V,\2\u0171\u0172\7.\2\2\u0172\u0176\5V,\2\u0173"+
		"\u0174\7/\2\2\u0174\u0176\5V,\2\u0175\u0168\3\2\2\2\u0175\u0169\3\2\2"+
		"\2\u0175\u016b\3\2\2\2\u0175\u016d\3\2\2\2\u0175\u016f\3\2\2\2\u0175\u0171"+
		"\3\2\2\2\u0175\u0173\3\2\2\2\u0176U\3\2\2\2\u0177\u0178\5Z.\2\u0178\u0179"+
		"\5X-\2\u0179W\3\2\2\2\u017a\u017e\3\2\2\2\u017b\u017c\7\'\2\2\u017c\u017e"+
		"\5V,\2\u017d\u017a\3\2\2\2\u017d\u017b\3\2\2\2\u017eY\3\2\2\2\u017f\u0180"+
		"\5^\60\2\u0180\u0181\5\\/\2\u0181[\3\2\2\2\u0182\u0188\3\2\2\2\u0183\u0184"+
		"\7(\2\2\u0184\u0188\5Z.\2\u0185\u0186\7)\2\2\u0186\u0188\5Z.\2\u0187\u0182"+
		"\3\2\2\2\u0187\u0183\3\2\2\2\u0187\u0185\3\2\2\2\u0188]\3\2\2\2\u0189"+
		"\u018a\5b\62\2\u018a\u018b\5`\61\2\u018b_\3\2\2\2\u018c\u0192\3\2\2\2"+
		"\u018d\u018e\7%\2\2\u018e\u0192\5^\60\2\u018f\u0190\7&\2\2\u0190\u0192"+
		"\5^\60\2\u0191\u018c\3\2\2\2\u0191\u018d\3\2\2\2\u0191\u018f\3\2\2\2\u0192"+
		"a\3\2\2\2\u0193\u0194\7\4\2\2\u0194\u0195\5F$\2\u0195\u0196\7\5\2\2\u0196"+
		"\u019d\3\2\2\2\u0197\u0198\7(\2\2\u0198\u019d\5d\63\2\u0199\u019a\7)\2"+
		"\2\u019a\u019d\5d\63\2\u019b\u019d\5d\63\2\u019c\u0193\3\2\2\2\u019c\u0197"+
		"\3\2\2\2\u019c\u0199\3\2\2\2\u019c\u019b\3\2\2\2\u019dc\3\2\2\2\u019e"+
		"\u019f\7\66\2\2\u019f\u01a3\5f\64\2\u01a0\u01a3\5l\67\2\u01a1\u01a3\5"+
		"<\37\2\u01a2\u019e\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a2\u01a1\3\2\2\2\u01a3"+
		"e\3\2\2\2\u01a4\u01aa\3\2\2\2\u01a5\u01a6\7\b\2\2\u01a6\u01a7\5h\65\2"+
		"\u01a7\u01a8\7\t\2\2\u01a8\u01aa\3\2\2\2\u01a9\u01a4\3\2\2\2\u01a9\u01a5"+
		"\3\2\2\2\u01aag\3\2\2\2\u01ab\u01ac\5F$\2\u01ac\u01ad\5j\66\2\u01adi\3"+
		"\2\2\2\u01ae\u01b2\3\2\2\2\u01af\u01b0\7\n\2\2\u01b0\u01b2\5h\65\2\u01b1"+
		"\u01ae\3\2\2\2\u01b1\u01af\3\2\2\2\u01b2k\3\2\2\2\u01b3\u01b4\t\3\2\2"+
		"\u01b4m\3\2\2\2\36|\u0082\u008c\u00a3\u00ab\u00b8\u00be\u00c5\u00cd\u00d3"+
		"\u00e1\u00e9\u00ef\u00fa\u00ff\u0133\u014b\u0153\u015b\u0163\u0175\u017d"+
		"\u0187\u0191\u019c\u01a2\u01a9\u01b1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}