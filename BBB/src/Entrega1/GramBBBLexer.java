// Generated from GramBBB.g4 by ANTLR 4.5.1
package Entrega1;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramBBBLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"WS", "OP", "CP", "OK", "CK", "OB", "CB", "COM", "INT", "FLT", "BOL", 
		"CHA", "STR", "VOID", "INCL", "MAIN", "LWHILE", "LDO", "LFOR", "CIF", 
		"CELSE", "BRK", "RTRN", "PINU", "PIND", "COL", "PRNT", "MOV", "OAND", 
		"OOR", "ONOT", "HT", "IGU", "DEL", "MLT", "DIV", "MOD", "PLS", "SUB", 
		"MAI", "MEI", "OIG", "DIF", "MAY", "MEN", "CTBT", "CTBF", "CTEC", "CTES", 
		"CTEF", "CTEI", "ID"
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


	public GramBBBLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GramBBB.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\66\u0153\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\3\2\6\2m\n\2\r\2\16\2n\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5"+
		"\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36"+
		"\3\36\3\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3"+
		"\'\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3.\3.\3/\3/\3/\3/\3"+
		"/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\62"+
		"\3\62\7\62\u0137\n\62\f\62\16\62\u013a\13\62\3\62\3\62\3\63\7\63\u013f"+
		"\n\63\f\63\16\63\u0142\13\63\3\63\3\63\6\63\u0146\n\63\r\63\16\63\u0147"+
		"\3\64\6\64\u014b\n\64\r\64\16\64\u014c\3\65\6\65\u0150\n\65\r\65\16\65"+
		"\u0151\2\2\66\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34"+
		"\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g"+
		"\65i\66\3\2\5\5\2\13\f\17\17\"\"\5\2\62;C\\c|\3\2\62;\u0158\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3"+
		"\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2"+
		"\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2"+
		"W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3"+
		"\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\3l\3\2\2\2\5r\3\2\2\2\7t\3\2\2"+
		"\2\tv\3\2\2\2\13x\3\2\2\2\rz\3\2\2\2\17|\3\2\2\2\21~\3\2\2\2\23\u0080"+
		"\3\2\2\2\25\u0084\3\2\2\2\27\u0088\3\2\2\2\31\u008d\3\2\2\2\33\u0091\3"+
		"\2\2\2\35\u0098\3\2\2\2\37\u009d\3\2\2\2!\u00a5\3\2\2\2#\u00aa\3\2\2\2"+
		"%\u00b3\3\2\2\2\'\u00b9\3\2\2\2)\u00be\3\2\2\2+\u00c1\3\2\2\2-\u00c6\3"+
		"\2\2\2/\u00cd\3\2\2\2\61\u00d6\3\2\2\2\63\u00dd\3\2\2\2\65\u00e4\3\2\2"+
		"\2\67\u00ea\3\2\2\29\u00f2\3\2\2\2;\u00f8\3\2\2\2=\u00fb\3\2\2\2?\u00fe"+
		"\3\2\2\2A\u0100\3\2\2\2C\u0102\3\2\2\2E\u0104\3\2\2\2G\u0106\3\2\2\2I"+
		"\u0108\3\2\2\2K\u010a\3\2\2\2M\u010c\3\2\2\2O\u010e\3\2\2\2Q\u0110\3\2"+
		"\2\2S\u0113\3\2\2\2U\u0116\3\2\2\2W\u0119\3\2\2\2Y\u011c\3\2\2\2[\u011e"+
		"\3\2\2\2]\u0120\3\2\2\2_\u012a\3\2\2\2a\u0130\3\2\2\2c\u0134\3\2\2\2e"+
		"\u0140\3\2\2\2g\u014a\3\2\2\2i\u014f\3\2\2\2km\t\2\2\2lk\3\2\2\2mn\3\2"+
		"\2\2nl\3\2\2\2no\3\2\2\2op\3\2\2\2pq\b\2\2\2q\4\3\2\2\2rs\7*\2\2s\6\3"+
		"\2\2\2tu\7+\2\2u\b\3\2\2\2vw\7}\2\2w\n\3\2\2\2xy\7\177\2\2y\f\3\2\2\2"+
		"z{\7]\2\2{\16\3\2\2\2|}\7_\2\2}\20\3\2\2\2~\177\7.\2\2\177\22\3\2\2\2"+
		"\u0080\u0081\7g\2\2\u0081\u0082\7p\2\2\u0082\u0083\7v\2\2\u0083\24\3\2"+
		"\2\2\u0084\u0085\7f\2\2\u0085\u0086\7g\2\2\u0086\u0087\7e\2\2\u0087\26"+
		"\3\2\2\2\u0088\u0089\7d\2\2\u0089\u008a\7q\2\2\u008a\u008b\7q\2\2\u008b"+
		"\u008c\7n\2\2\u008c\30\3\2\2\2\u008d\u008e\7e\2\2\u008e\u008f\7c\2\2\u008f"+
		"\u0090\7t\2\2\u0090\32\3\2\2\2\u0091\u0092\7e\2\2\u0092\u0093\7c\2\2\u0093"+
		"\u0094\7f\2\2\u0094\u0095\7g\2\2\u0095\u0096\7p\2\2\u0096\u0097\7c\2\2"+
		"\u0097\34\3\2\2\2\u0098\u0099\7p\2\2\u0099\u009a\7c\2\2\u009a\u009b\7"+
		"f\2\2\u009b\u009c\7c\2\2\u009c\36\3\2\2\2\u009d\u009e\7k\2\2\u009e\u009f"+
		"\7p\2\2\u009f\u00a0\7e\2\2\u00a0\u00a1\7n\2\2\u00a1\u00a2\7w\2\2\u00a2"+
		"\u00a3\7k\2\2\u00a3\u00a4\7t\2\2\u00a4 \3\2\2\2\u00a5\u00a6\7o\2\2\u00a6"+
		"\u00a7\7c\2\2\u00a7\u00a8\7k\2\2\u00a8\u00a9\7p\2\2\u00a9\"\3\2\2\2\u00aa"+
		"\u00ab\7o\2\2\u00ab\u00ac\7k\2\2\u00ac\u00ad\7g\2\2\u00ad\u00ae\7p\2\2"+
		"\u00ae\u00af\7v\2\2\u00af\u00b0\7t\2\2\u00b0\u00b1\7c\2\2\u00b1\u00b2"+
		"\7u\2\2\u00b2$\3\2\2\2\u00b3\u00b4\7j\2\2\u00b4\u00b5\7c\2\2\u00b5\u00b6"+
		"\7e\2\2\u00b6\u00b7\7g\2\2\u00b7\u00b8\7t\2\2\u00b8&\3\2\2\2\u00b9\u00ba"+
		"\7r\2\2\u00ba\u00bb\7c\2\2\u00bb\u00bc\7t\2\2\u00bc\u00bd\7c\2\2\u00bd"+
		"(\3\2\2\2\u00be\u00bf\7u\2\2\u00bf\u00c0\7k\2\2\u00c0*\3\2\2\2\u00c1\u00c2"+
		"\7u\2\2\u00c2\u00c3\7k\2\2\u00c3\u00c4\7p\2\2\u00c4\u00c5\7q\2\2\u00c5"+
		",\3\2\2\2\u00c6\u00c7\7t\2\2\u00c7\u00c8\7q\2\2\u00c8\u00c9\7o\2\2\u00c9"+
		"\u00ca\7r\2\2\u00ca\u00cb\7g\2\2\u00cb\u00cc\7t\2\2\u00cc.\3\2\2\2\u00cd"+
		"\u00ce\7t\2\2\u00ce\u00cf\7g\2\2\u00cf\u00d0\7i\2\2\u00d0\u00d1\7t\2\2"+
		"\u00d1\u00d2\7g\2\2\u00d2\u00d3\7u\2\2\u00d3\u00d4\7c\2\2\u00d4\u00d5"+
		"\7t\2\2\u00d5\60\3\2\2\2\u00d6\u00d7\7r\2\2\u00d7\u00d8\7k\2\2\u00d8\u00d9"+
		"\7p\2\2\u00d9\u00da\7v\2\2\u00da\u00db\7c\2\2\u00db\u00dc\7t\2\2\u00dc"+
		"\62\3\2\2\2\u00dd\u00de\7h\2\2\u00de\u00df\7n\2\2\u00df\u00e0\7q\2\2\u00e0"+
		"\u00e1\7v\2\2\u00e1\u00e2\7c\2\2\u00e2\u00e3\7t\2\2\u00e3\64\3\2\2\2\u00e4"+
		"\u00e5\7e\2\2\u00e5\u00e6\7q\2\2\u00e6\u00e7\7n\2\2\u00e7\u00e8\7q\2\2"+
		"\u00e8\u00e9\7t\2\2\u00e9\66\3\2\2\2\u00ea\u00eb\7k\2\2\u00eb\u00ec\7"+
		"o\2\2\u00ec\u00ed\7r\2\2\u00ed\u00ee\7t\2\2\u00ee\u00ef\7k\2\2\u00ef\u00f0"+
		"\7o\2\2\u00f0\u00f1\7g\2\2\u00f18\3\2\2\2\u00f2\u00f3\7o\2\2\u00f3\u00f4"+
		"\7q\2\2\u00f4\u00f5\7x\2\2\u00f5\u00f6\7g\2\2\u00f6\u00f7\7t\2\2\u00f7"+
		":\3\2\2\2\u00f8\u00f9\7(\2\2\u00f9\u00fa\7(\2\2\u00fa<\3\2\2\2\u00fb\u00fc"+
		"\7~\2\2\u00fc\u00fd\7~\2\2\u00fd>\3\2\2\2\u00fe\u00ff\7#\2\2\u00ff@\3"+
		"\2\2\2\u0100\u0101\7%\2\2\u0101B\3\2\2\2\u0102\u0103\7?\2\2\u0103D\3\2"+
		"\2\2\u0104\u0105\7=\2\2\u0105F\3\2\2\2\u0106\u0107\7,\2\2\u0107H\3\2\2"+
		"\2\u0108\u0109\7\61\2\2\u0109J\3\2\2\2\u010a\u010b\7\'\2\2\u010bL\3\2"+
		"\2\2\u010c\u010d\7-\2\2\u010dN\3\2\2\2\u010e\u010f\7/\2\2\u010fP\3\2\2"+
		"\2\u0110\u0111\7@\2\2\u0111\u0112\7?\2\2\u0112R\3\2\2\2\u0113\u0114\7"+
		">\2\2\u0114\u0115\7?\2\2\u0115T\3\2\2\2\u0116\u0117\7?\2\2\u0117\u0118"+
		"\7?\2\2\u0118V\3\2\2\2\u0119\u011a\7#\2\2\u011a\u011b\7?\2\2\u011bX\3"+
		"\2\2\2\u011c\u011d\7@\2\2\u011dZ\3\2\2\2\u011e\u011f\7>\2\2\u011f\\\3"+
		"\2\2\2\u0120\u0121\7x\2\2\u0121\u0122\7g\2\2\u0122\u0123\7t\2\2\u0123"+
		"\u0124\7f\2\2\u0124\u0125\7c\2\2\u0125\u0126\7f\2\2\u0126\u0127\7g\2\2"+
		"\u0127\u0128\7t\2\2\u0128\u0129\7q\2\2\u0129^\3\2\2\2\u012a\u012b\7h\2"+
		"\2\u012b\u012c\7c\2\2\u012c\u012d\7n\2\2\u012d\u012e\7u\2\2\u012e\u012f"+
		"\7q\2\2\u012f`\3\2\2\2\u0130\u0131\7$\2\2\u0131\u0132\t\3\2\2\u0132\u0133"+
		"\7$\2\2\u0133b\3\2\2\2\u0134\u0138\7$\2\2\u0135\u0137\t\3\2\2\u0136\u0135"+
		"\3\2\2\2\u0137\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139"+
		"\u013b\3\2\2\2\u013a\u0138\3\2\2\2\u013b\u013c\7$\2\2\u013cd\3\2\2\2\u013d"+
		"\u013f\t\4\2\2\u013e\u013d\3\2\2\2\u013f\u0142\3\2\2\2\u0140\u013e\3\2"+
		"\2\2\u0140\u0141\3\2\2\2\u0141\u0143\3\2\2\2\u0142\u0140\3\2\2\2\u0143"+
		"\u0145\7\60\2\2\u0144\u0146\t\4\2\2\u0145\u0144\3\2\2\2\u0146\u0147\3"+
		"\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148f\3\2\2\2\u0149\u014b"+
		"\t\4\2\2\u014a\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014a\3\2\2\2\u014c"+
		"\u014d\3\2\2\2\u014dh\3\2\2\2\u014e\u0150\t\3\2\2\u014f\u014e\3\2\2\2"+
		"\u0150\u0151\3\2\2\2\u0151\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152j\3"+
		"\2\2\2\t\2n\u0138\u0140\u0147\u014c\u0151\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}