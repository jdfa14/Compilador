// Generated from Gramatica.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramaticaLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"WS", "OP", "CP", "OK", "CK", "OB", "CB", "COM", "INT", "FLT", "BOL", 
		"CHA", "STR", "VOID", "INCL", "MAIN", "LWHILE", "LDO", "LFOR", "CIF", 
		"CELSE", "BRK", "RTRN", "PINU", "PIND", "COL", "PRNT", "MOV", "OAND", 
		"OOR", "ONOT", "HT", "IGU", "DEL", "MLT", "DIV", "MOD", "PLS", "SUB", 
		"MAI", "MEI", "OIG", "DIF", "MAY", "MEN", "CTEC", "CTES", "CTEF", "CTEI", 
		"ID"
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


	public GramaticaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Gramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\64\u013c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2"+
		"\6\2i\n\2\r\2\16\2j\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3"+
		"\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3!\3!\3"+
		"\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3"+
		"+\3,\3,\3,\3-\3-\3.\3.\3/\3/\3/\3/\3\60\3\60\7\60\u0120\n\60\f\60\16\60"+
		"\u0123\13\60\3\60\3\60\3\61\7\61\u0128\n\61\f\61\16\61\u012b\13\61\3\61"+
		"\3\61\6\61\u012f\n\61\r\61\16\61\u0130\3\62\6\62\u0134\n\62\r\62\16\62"+
		"\u0135\3\63\6\63\u0139\n\63\r\63\16\63\u013a\2\2\64\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'"+
		"M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64\3\2\5\5\2\13\f\17\17\"\"\5\2\62;"+
		"C\\c|\3\2\62;\u0141\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2"+
		"\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2"+
		"\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q"+
		"\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2"+
		"\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\3h\3\2\2\2\5n\3\2\2\2"+
		"\7p\3\2\2\2\tr\3\2\2\2\13t\3\2\2\2\rv\3\2\2\2\17x\3\2\2\2\21z\3\2\2\2"+
		"\23|\3\2\2\2\25\u0080\3\2\2\2\27\u0084\3\2\2\2\31\u0089\3\2\2\2\33\u008d"+
		"\3\2\2\2\35\u0091\3\2\2\2\37\u0096\3\2\2\2!\u009e\3\2\2\2#\u00a3\3\2\2"+
		"\2%\u00ac\3\2\2\2\'\u00b2\3\2\2\2)\u00b7\3\2\2\2+\u00ba\3\2\2\2-\u00bf"+
		"\3\2\2\2/\u00c6\3\2\2\2\61\u00cf\3\2\2\2\63\u00d6\3\2\2\2\65\u00dd\3\2"+
		"\2\2\67\u00e3\3\2\2\29\u00eb\3\2\2\2;\u00f1\3\2\2\2=\u00f4\3\2\2\2?\u00f7"+
		"\3\2\2\2A\u00f9\3\2\2\2C\u00fb\3\2\2\2E\u00fd\3\2\2\2G\u00ff\3\2\2\2I"+
		"\u0101\3\2\2\2K\u0103\3\2\2\2M\u0105\3\2\2\2O\u0107\3\2\2\2Q\u0109\3\2"+
		"\2\2S\u010c\3\2\2\2U\u010f\3\2\2\2W\u0112\3\2\2\2Y\u0115\3\2\2\2[\u0117"+
		"\3\2\2\2]\u0119\3\2\2\2_\u011d\3\2\2\2a\u0129\3\2\2\2c\u0133\3\2\2\2e"+
		"\u0138\3\2\2\2gi\t\2\2\2hg\3\2\2\2ij\3\2\2\2jh\3\2\2\2jk\3\2\2\2kl\3\2"+
		"\2\2lm\b\2\2\2m\4\3\2\2\2no\7*\2\2o\6\3\2\2\2pq\7+\2\2q\b\3\2\2\2rs\7"+
		"}\2\2s\n\3\2\2\2tu\7\177\2\2u\f\3\2\2\2vw\7]\2\2w\16\3\2\2\2xy\7_\2\2"+
		"y\20\3\2\2\2z{\7.\2\2{\22\3\2\2\2|}\7g\2\2}~\7p\2\2~\177\7v\2\2\177\24"+
		"\3\2\2\2\u0080\u0081\7f\2\2\u0081\u0082\7g\2\2\u0082\u0083\7e\2\2\u0083"+
		"\26\3\2\2\2\u0084\u0085\7d\2\2\u0085\u0086\7q\2\2\u0086\u0087\7q\2\2\u0087"+
		"\u0088\7n\2\2\u0088\30\3\2\2\2\u0089\u008a\7e\2\2\u008a\u008b\7c\2\2\u008b"+
		"\u008c\7f\2\2\u008c\32\3\2\2\2\u008d\u008e\7e\2\2\u008e\u008f\7c\2\2\u008f"+
		"\u0090\7t\2\2\u0090\34\3\2\2\2\u0091\u0092\7p\2\2\u0092\u0093\7c\2\2\u0093"+
		"\u0094\7f\2\2\u0094\u0095\7c\2\2\u0095\36\3\2\2\2\u0096\u0097\7k\2\2\u0097"+
		"\u0098\7p\2\2\u0098\u0099\7e\2\2\u0099\u009a\7n\2\2\u009a\u009b\7w\2\2"+
		"\u009b\u009c\7k\2\2\u009c\u009d\7t\2\2\u009d \3\2\2\2\u009e\u009f\7o\2"+
		"\2\u009f\u00a0\7c\2\2\u00a0\u00a1\7k\2\2\u00a1\u00a2\7p\2\2\u00a2\"\3"+
		"\2\2\2\u00a3\u00a4\7o\2\2\u00a4\u00a5\7k\2\2\u00a5\u00a6\7g\2\2\u00a6"+
		"\u00a7\7p\2\2\u00a7\u00a8\7v\2\2\u00a8\u00a9\7t\2\2\u00a9\u00aa\7c\2\2"+
		"\u00aa\u00ab\7u\2\2\u00ab$\3\2\2\2\u00ac\u00ad\7j\2\2\u00ad\u00ae\7c\2"+
		"\2\u00ae\u00af\7e\2\2\u00af\u00b0\7g\2\2\u00b0\u00b1\7t\2\2\u00b1&\3\2"+
		"\2\2\u00b2\u00b3\7r\2\2\u00b3\u00b4\7c\2\2\u00b4\u00b5\7t\2\2\u00b5\u00b6"+
		"\7c\2\2\u00b6(\3\2\2\2\u00b7\u00b8\7u\2\2\u00b8\u00b9\7k\2\2\u00b9*\3"+
		"\2\2\2\u00ba\u00bb\7u\2\2\u00bb\u00bc\7k\2\2\u00bc\u00bd\7p\2\2\u00bd"+
		"\u00be\7q\2\2\u00be,\3\2\2\2\u00bf\u00c0\7t\2\2\u00c0\u00c1\7q\2\2\u00c1"+
		"\u00c2\7o\2\2\u00c2\u00c3\7r\2\2\u00c3\u00c4\7g\2\2\u00c4\u00c5\7t\2\2"+
		"\u00c5.\3\2\2\2\u00c6\u00c7\7t\2\2\u00c7\u00c8\7g\2\2\u00c8\u00c9\7i\2"+
		"\2\u00c9\u00ca\7t\2\2\u00ca\u00cb\7g\2\2\u00cb\u00cc\7u\2\2\u00cc\u00cd"+
		"\7c\2\2\u00cd\u00ce\7t\2\2\u00ce\60\3\2\2\2\u00cf\u00d0\7r\2\2\u00d0\u00d1"+
		"\7k\2\2\u00d1\u00d2\7p\2\2\u00d2\u00d3\7v\2\2\u00d3\u00d4\7c\2\2\u00d4"+
		"\u00d5\7t\2\2\u00d5\62\3\2\2\2\u00d6\u00d7\7h\2\2\u00d7\u00d8\7n\2\2\u00d8"+
		"\u00d9\7q\2\2\u00d9\u00da\7v\2\2\u00da\u00db\7c\2\2\u00db\u00dc\7t\2\2"+
		"\u00dc\64\3\2\2\2\u00dd\u00de\7e\2\2\u00de\u00df\7q\2\2\u00df\u00e0\7"+
		"n\2\2\u00e0\u00e1\7q\2\2\u00e1\u00e2\7t\2\2\u00e2\66\3\2\2\2\u00e3\u00e4"+
		"\7k\2\2\u00e4\u00e5\7o\2\2\u00e5\u00e6\7r\2\2\u00e6\u00e7\7t\2\2\u00e7"+
		"\u00e8\7k\2\2\u00e8\u00e9\7o\2\2\u00e9\u00ea\7g\2\2\u00ea8\3\2\2\2\u00eb"+
		"\u00ec\7o\2\2\u00ec\u00ed\7q\2\2\u00ed\u00ee\7x\2\2\u00ee\u00ef\7g\2\2"+
		"\u00ef\u00f0\7t\2\2\u00f0:\3\2\2\2\u00f1\u00f2\7(\2\2\u00f2\u00f3\7(\2"+
		"\2\u00f3<\3\2\2\2\u00f4\u00f5\7~\2\2\u00f5\u00f6\7~\2\2\u00f6>\3\2\2\2"+
		"\u00f7\u00f8\7#\2\2\u00f8@\3\2\2\2\u00f9\u00fa\7%\2\2\u00faB\3\2\2\2\u00fb"+
		"\u00fc\7?\2\2\u00fcD\3\2\2\2\u00fd\u00fe\7=\2\2\u00feF\3\2\2\2\u00ff\u0100"+
		"\7,\2\2\u0100H\3\2\2\2\u0101\u0102\7\61\2\2\u0102J\3\2\2\2\u0103\u0104"+
		"\7\'\2\2\u0104L\3\2\2\2\u0105\u0106\7-\2\2\u0106N\3\2\2\2\u0107\u0108"+
		"\7/\2\2\u0108P\3\2\2\2\u0109\u010a\7@\2\2\u010a\u010b\7?\2\2\u010bR\3"+
		"\2\2\2\u010c\u010d\7>\2\2\u010d\u010e\7?\2\2\u010eT\3\2\2\2\u010f\u0110"+
		"\7?\2\2\u0110\u0111\7?\2\2\u0111V\3\2\2\2\u0112\u0113\7#\2\2\u0113\u0114"+
		"\7?\2\2\u0114X\3\2\2\2\u0115\u0116\7@\2\2\u0116Z\3\2\2\2\u0117\u0118\7"+
		">\2\2\u0118\\\3\2\2\2\u0119\u011a\7$\2\2\u011a\u011b\t\3\2\2\u011b\u011c"+
		"\7$\2\2\u011c^\3\2\2\2\u011d\u0121\7$\2\2\u011e\u0120\t\3\2\2\u011f\u011e"+
		"\3\2\2\2\u0120\u0123\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122"+
		"\u0124\3\2\2\2\u0123\u0121\3\2\2\2\u0124\u0125\7$\2\2\u0125`\3\2\2\2\u0126"+
		"\u0128\t\4\2\2\u0127\u0126\3\2\2\2\u0128\u012b\3\2\2\2\u0129\u0127\3\2"+
		"\2\2\u0129\u012a\3\2\2\2\u012a\u012c\3\2\2\2\u012b\u0129\3\2\2\2\u012c"+
		"\u012e\7\60\2\2\u012d\u012f\t\4\2\2\u012e\u012d\3\2\2\2\u012f\u0130\3"+
		"\2\2\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131b\3\2\2\2\u0132\u0134"+
		"\t\4\2\2\u0133\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0133\3\2\2\2\u0135"+
		"\u0136\3\2\2\2\u0136d\3\2\2\2\u0137\u0139\t\3\2\2\u0138\u0137\3\2\2\2"+
		"\u0139\u013a\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013bf\3"+
		"\2\2\2\t\2j\u0121\u0129\u0130\u0135\u013a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}