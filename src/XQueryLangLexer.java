// Generated from src/XQueryLang.g4 by ANTLR 4.6
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class XQueryLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, FOR=2, LET=3, IN=4, RETURN=5, IS=6, EMPTY=7, SOME=8, SATISFIES=9, 
		EQ=10, WHERE=11, DOC=12, TEXT=13, AND=14, OR=15, NOT=16, NAMESTRING=17, 
		VARSTRING=18, LPAREN=19, RPAREN=20, LBRACKET=21, RBRACKET=22, LBRACE=23, 
		RBRACE=24, LESS=25, GREATER=26, DEQUAL=27, ASSIGN=28, EQUAL=29, AT=30, 
		DOT=31, COMMA=32, STAR=33, LSLASH=34, COMMENT=35, SPACE=36, PATHSTRING=37, 
		STRING=38;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "FOR", "LET", "IN", "RETURN", "IS", "EMPTY", "SOME", "SATISFIES", 
		"EQ", "WHERE", "DOC", "TEXT", "AND", "OR", "NOT", "NAMESTRING", "VARSTRING", 
		"LPAREN", "RPAREN", "LBRACKET", "RBRACKET", "LBRACE", "RBRACE", "LESS", 
		"GREATER", "DEQUAL", "ASSIGN", "EQUAL", "AT", "DOT", "COMMA", "STAR", 
		"LSLASH", "COMMENT", "SPACE", "PATHSTRING", "STRING"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'$'", "'for'", "'let'", "'in'", "'return'", "'is'", "'empty'", 
		"'some'", "'satisfies'", "'eq'", "'where'", "'doc'", "'text'", "'and'", 
		"'or'", "'not'", null, null, "'('", "')'", "'['", "']'", "'{'", "'}'", 
		"'<'", "'>'", "'=='", "':='", "'='", "'@'", "'.'", "','", "'*'", "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "FOR", "LET", "IN", "RETURN", "IS", "EMPTY", "SOME", "SATISFIES", 
		"EQ", "WHERE", "DOC", "TEXT", "AND", "OR", "NOT", "NAMESTRING", "VARSTRING", 
		"LPAREN", "RPAREN", "LBRACKET", "RBRACKET", "LBRACE", "RBRACE", "LESS", 
		"GREATER", "DEQUAL", "ASSIGN", "EQUAL", "AT", "DOT", "COMMA", "STAR", 
		"LSLASH", "COMMENT", "SPACE", "PATHSTRING", "STRING"
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


	public XQueryLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "XQueryLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2(\u00e9\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\22\6\22\u009a\n\22\r\22\16\22\u009b\3\23\5\23\u009f\n\23\3\23"+
		"\7\23\u00a2\n\23\f\23\16\23\u00a5\13\23\3\24\3\24\3\25\3\25\3\26\3\26"+
		"\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35"+
		"\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\7$\u00cb"+
		"\n$\f$\16$\u00ce\13$\3$\3$\3%\3%\3%\3%\3&\3&\7&\u00d8\n&\f&\16&\u00db"+
		"\13&\3&\3&\3\'\3\'\3\'\3\'\7\'\u00e3\n\'\f\'\16\'\u00e6\13\'\3\'\3\'\2"+
		"\2(\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(\3\2\t\6\2\62;C\\aac|\5\2C\\aac|\5\2\62;C\\c|"+
		"\4\2\f\f\17\17\5\2\13\f\17\17\"\"\6\2\60;C\\aac|\5\2\f\f\17\17$$\u00ee"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\3O\3\2\2\2\5Q\3\2\2\2\7U\3\2\2\2\t"+
		"Y\3\2\2\2\13\\\3\2\2\2\rc\3\2\2\2\17f\3\2\2\2\21l\3\2\2\2\23q\3\2\2\2"+
		"\25{\3\2\2\2\27~\3\2\2\2\31\u0084\3\2\2\2\33\u0088\3\2\2\2\35\u008d\3"+
		"\2\2\2\37\u0091\3\2\2\2!\u0094\3\2\2\2#\u0099\3\2\2\2%\u009e\3\2\2\2\'"+
		"\u00a6\3\2\2\2)\u00a8\3\2\2\2+\u00aa\3\2\2\2-\u00ac\3\2\2\2/\u00ae\3\2"+
		"\2\2\61\u00b0\3\2\2\2\63\u00b2\3\2\2\2\65\u00b4\3\2\2\2\67\u00b6\3\2\2"+
		"\29\u00b9\3\2\2\2;\u00bc\3\2\2\2=\u00be\3\2\2\2?\u00c0\3\2\2\2A\u00c2"+
		"\3\2\2\2C\u00c4\3\2\2\2E\u00c6\3\2\2\2G\u00c8\3\2\2\2I\u00d1\3\2\2\2K"+
		"\u00d5\3\2\2\2M\u00de\3\2\2\2OP\7&\2\2P\4\3\2\2\2QR\7h\2\2RS\7q\2\2ST"+
		"\7t\2\2T\6\3\2\2\2UV\7n\2\2VW\7g\2\2WX\7v\2\2X\b\3\2\2\2YZ\7k\2\2Z[\7"+
		"p\2\2[\n\3\2\2\2\\]\7t\2\2]^\7g\2\2^_\7v\2\2_`\7w\2\2`a\7t\2\2ab\7p\2"+
		"\2b\f\3\2\2\2cd\7k\2\2de\7u\2\2e\16\3\2\2\2fg\7g\2\2gh\7o\2\2hi\7r\2\2"+
		"ij\7v\2\2jk\7{\2\2k\20\3\2\2\2lm\7u\2\2mn\7q\2\2no\7o\2\2op\7g\2\2p\22"+
		"\3\2\2\2qr\7u\2\2rs\7c\2\2st\7v\2\2tu\7k\2\2uv\7u\2\2vw\7h\2\2wx\7k\2"+
		"\2xy\7g\2\2yz\7u\2\2z\24\3\2\2\2{|\7g\2\2|}\7s\2\2}\26\3\2\2\2~\177\7"+
		"y\2\2\177\u0080\7j\2\2\u0080\u0081\7g\2\2\u0081\u0082\7t\2\2\u0082\u0083"+
		"\7g\2\2\u0083\30\3\2\2\2\u0084\u0085\7f\2\2\u0085\u0086\7q\2\2\u0086\u0087"+
		"\7e\2\2\u0087\32\3\2\2\2\u0088\u0089\7v\2\2\u0089\u008a\7g\2\2\u008a\u008b"+
		"\7z\2\2\u008b\u008c\7v\2\2\u008c\34\3\2\2\2\u008d\u008e\7c\2\2\u008e\u008f"+
		"\7p\2\2\u008f\u0090\7f\2\2\u0090\36\3\2\2\2\u0091\u0092\7q\2\2\u0092\u0093"+
		"\7t\2\2\u0093 \3\2\2\2\u0094\u0095\7p\2\2\u0095\u0096\7q\2\2\u0096\u0097"+
		"\7v\2\2\u0097\"\3\2\2\2\u0098\u009a\t\2\2\2\u0099\u0098\3\2\2\2\u009a"+
		"\u009b\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c$\3\2\2\2"+
		"\u009d\u009f\t\3\2\2\u009e\u009d\3\2\2\2\u009f\u00a3\3\2\2\2\u00a0\u00a2"+
		"\t\4\2\2\u00a1\u00a0\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3"+
		"\u00a4\3\2\2\2\u00a4&\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00a7\7*\2\2\u00a7"+
		"(\3\2\2\2\u00a8\u00a9\7+\2\2\u00a9*\3\2\2\2\u00aa\u00ab\7]\2\2\u00ab,"+
		"\3\2\2\2\u00ac\u00ad\7_\2\2\u00ad.\3\2\2\2\u00ae\u00af\7}\2\2\u00af\60"+
		"\3\2\2\2\u00b0\u00b1\7\177\2\2\u00b1\62\3\2\2\2\u00b2\u00b3\7>\2\2\u00b3"+
		"\64\3\2\2\2\u00b4\u00b5\7@\2\2\u00b5\66\3\2\2\2\u00b6\u00b7\7?\2\2\u00b7"+
		"\u00b8\7?\2\2\u00b88\3\2\2\2\u00b9\u00ba\7<\2\2\u00ba\u00bb\7?\2\2\u00bb"+
		":\3\2\2\2\u00bc\u00bd\7?\2\2\u00bd<\3\2\2\2\u00be\u00bf\7B\2\2\u00bf>"+
		"\3\2\2\2\u00c0\u00c1\7\60\2\2\u00c1@\3\2\2\2\u00c2\u00c3\7.\2\2\u00c3"+
		"B\3\2\2\2\u00c4\u00c5\7,\2\2\u00c5D\3\2\2\2\u00c6\u00c7\7\61\2\2\u00c7"+
		"F\3\2\2\2\u00c8\u00cc\7%\2\2\u00c9\u00cb\n\5\2\2\u00ca\u00c9\3\2\2\2\u00cb"+
		"\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cf\3\2"+
		"\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d0\b$\2\2\u00d0H\3\2\2\2\u00d1\u00d2"+
		"\t\6\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\b%\2\2\u00d4J\3\2\2\2\u00d5\u00d9"+
		"\7$\2\2\u00d6\u00d8\t\7\2\2\u00d7\u00d6\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9"+
		"\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00dc\3\2\2\2\u00db\u00d9\3\2"+
		"\2\2\u00dc\u00dd\7$\2\2\u00ddL\3\2\2\2\u00de\u00e4\7$\2\2\u00df\u00e3"+
		"\n\b\2\2\u00e0\u00e1\7$\2\2\u00e1\u00e3\7$\2\2\u00e2\u00df\3\2\2\2\u00e2"+
		"\u00e0\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2"+
		"\2\2\u00e5\u00e7\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00e8\7$\2\2\u00e8"+
		"N\3\2\2\2\n\2\u009b\u009e\u00a3\u00cc\u00d9\u00e2\u00e4\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}