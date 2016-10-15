// Generated from MyLanguage.g by ANTLR 4.5.3
package classes;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MyLanguageLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMENT=1, LINE_COMMENT=2, WS=3, Verdadero=4, Falso=5, Algoritmo=6, Proceso=7, 
		Finproceso=8, Finalgoritmo=9, Definir=10, Como=11, Entero=12, Numero=13, 
		Numerico=14, Real=15, Logico=16, Caracter=17, Texto=18, Cadena=19, Dimension=20, 
		Mientras=21, Hacer=22, Finmientras=23, Milisegundos=24, Segundos=25, Leer=26, 
		Limpiar=27, Pantalla=28, Repetir=29, Funcion=30, Tecla=31, Escribir=32, 
		Esperar=33, Hasta=34, Que=35, Para=36, Finpara=37, Con=38, Paso=39, Si=40, 
		Finsi=41, Sino=42, Entonces=43, Segun=44, Finsegun=45, Finfuncion=46, 
		De=47, Otro=48, Modo=49, Mod=50, Subproceso=51, Finsubproceso=52, Borrar=53, 
		Finsubalgoritmo=54, Subalgoritmo=55, Caso=56, TOKEN_ENTERO=57, TOKEN_REAL=58, 
		TOKEN_CADENA=59, TOKEN_PAR_IZQ=60, TOKEN_PAR_DER=61, TOKEN_COR_IZQ=62, 
		TOKEN_COR_DER=63, TOKEN_PYC=64, TOKEN_ASIG=65, TOKEN_DIF=66, TOKEN_MENOR=67, 
		TOKEN_MAYOR=68, TOKEN_MENOR_IGUAL=69, TOKEN_MAYOR_IGUAL=70, TOKEN_COMA=71, 
		TOKEN_O=72, TOKEN_Y=73, TOKEN_NEG=74, TOKEN_IGUAL=75, TOKEN_MAS=76, TOKEN_MENOS=77, 
		TOKEN_DIV=78, TOKEN_MUL=79, TOKEN_MOD=80, TOKEN_DOSP=81, TOKEN_POT=82, 
		TOKEN_EOF=83, ID=84;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"COMMENT", "LINE_COMMENT", "WS", "Verdadero", "Falso", "Algoritmo", "Proceso", 
		"Finproceso", "Finalgoritmo", "Definir", "Como", "Entero", "Numero", "Numerico", 
		"Real", "Logico", "Caracter", "Texto", "Cadena", "Dimension", "Mientras", 
		"Hacer", "Finmientras", "Milisegundos", "Segundos", "Leer", "Limpiar", 
		"Pantalla", "Repetir", "Funcion", "Tecla", "Escribir", "Esperar", "Hasta", 
		"Que", "Para", "Finpara", "Con", "Paso", "Si", "Finsi", "Sino", "Entonces", 
		"Segun", "Finsegun", "Finfuncion", "De", "Otro", "Modo", "Mod", "Subproceso", 
		"Finsubproceso", "Borrar", "Finsubalgoritmo", "Subalgoritmo", "Caso", 
		"TOKEN_ENTERO", "TOKEN_REAL", "TOKEN_CADENA", "TOKEN_PAR_IZQ", "TOKEN_PAR_DER", 
		"TOKEN_COR_IZQ", "TOKEN_COR_DER", "TOKEN_PYC", "TOKEN_ASIG", "TOKEN_DIF", 
		"TOKEN_MENOR", "TOKEN_MAYOR", "TOKEN_MENOR_IGUAL", "TOKEN_MAYOR_IGUAL", 
		"TOKEN_COMA", "TOKEN_O", "TOKEN_Y", "TOKEN_NEG", "TOKEN_IGUAL", "TOKEN_MAS", 
		"TOKEN_MENOS", "TOKEN_DIV", "TOKEN_MUL", "TOKEN_MOD", "TOKEN_DOSP", "TOKEN_POT", 
		"TOKEN_EOF", "ID"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, "'verdadero'", "'falso'", "'algoritmo'", "'proceso'", 
		"'finproceso'", "'finalgoritmo'", "'definir'", "'como'", "'entero'", "'numero'", 
		"'numerico'", "'real'", "'logico'", "'caracter'", "'texto'", "'cadena'", 
		"'dimension'", "'mientras'", "'hacer'", "'finmientras'", "'milisegundos'", 
		"'segundos'", "'leer'", "'limpiar'", "'pantalla'", "'repetir'", "'funcion'", 
		"'tecla'", "'escribir'", "'esperar'", "'hasta'", "'que'", "'para'", "'finpara'", 
		"'con'", "'paso'", "'si'", "'finsi'", "'sino'", "'entonces'", "'segun'", 
		"'finsegun'", "'finfuncion'", "'de'", "'otro'", "'modo'", "'mod'", "'subproceso'", 
		"'finsubproceso'", "'borrar'", "'finsubalgoritmo'", "'subalgoritmo'", 
		"'caso'", null, null, null, "'('", "')'", "'['", "']'", "';'", "'<-'", 
		"'<>'", "'<'", "'>'", "'<='", "'>='", "','", null, null, null, null, "'+'", 
		"'-'", "'/'", "'*'", null, "':'", "'^'", "'$'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "COMMENT", "LINE_COMMENT", "WS", "Verdadero", "Falso", "Algoritmo", 
		"Proceso", "Finproceso", "Finalgoritmo", "Definir", "Como", "Entero", 
		"Numero", "Numerico", "Real", "Logico", "Caracter", "Texto", "Cadena", 
		"Dimension", "Mientras", "Hacer", "Finmientras", "Milisegundos", "Segundos", 
		"Leer", "Limpiar", "Pantalla", "Repetir", "Funcion", "Tecla", "Escribir", 
		"Esperar", "Hasta", "Que", "Para", "Finpara", "Con", "Paso", "Si", "Finsi", 
		"Sino", "Entonces", "Segun", "Finsegun", "Finfuncion", "De", "Otro", "Modo", 
		"Mod", "Subproceso", "Finsubproceso", "Borrar", "Finsubalgoritmo", "Subalgoritmo", 
		"Caso", "TOKEN_ENTERO", "TOKEN_REAL", "TOKEN_CADENA", "TOKEN_PAR_IZQ", 
		"TOKEN_PAR_DER", "TOKEN_COR_IZQ", "TOKEN_COR_DER", "TOKEN_PYC", "TOKEN_ASIG", 
		"TOKEN_DIF", "TOKEN_MENOR", "TOKEN_MAYOR", "TOKEN_MENOR_IGUAL", "TOKEN_MAYOR_IGUAL", 
		"TOKEN_COMA", "TOKEN_O", "TOKEN_Y", "TOKEN_NEG", "TOKEN_IGUAL", "TOKEN_MAS", 
		"TOKEN_MENOS", "TOKEN_DIV", "TOKEN_MUL", "TOKEN_MOD", "TOKEN_DOSP", "TOKEN_POT", 
		"TOKEN_EOF", "ID"
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


	public MyLanguageLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MyLanguage.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2V\u02c1\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\3\2\3\2\3\2\3\2\7\2\u00b0\n\2\f\2\16\2\u00b3\13\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\7\3\u00be\n\3\f\3\16\3\u00c1\13\3\3\3\3\3\3\4\6"+
		"\4\u00c6\n\4\r\4\16\4\u00c7\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3"+
		"!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$"+
		"\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3(\3"+
		"(\3(\3(\3(\3)\3)\3)\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3"+
		",\3,\3,\3,\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3"+
		"/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\62\3\62"+
		"\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\38\3"+
		"8\38\38\38\38\38\38\38\38\38\38\38\39\39\39\39\39\3:\6:\u0269\n:\r:\16"+
		":\u026a\3;\6;\u026e\n;\r;\16;\u026f\3;\3;\6;\u0274\n;\r;\16;\u0275\3<"+
		"\3<\7<\u027a\n<\f<\16<\u027d\13<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3"+
		"B\3C\3C\3C\3D\3D\3E\3E\3F\3F\3F\3G\3G\3G\3H\3H\3I\3I\3J\3J\3K\3K\3K\5"+
		"K\u02a2\nK\3L\3L\3L\5L\u02a7\nL\3M\3M\3N\3N\3O\3O\3P\3P\3Q\3Q\5Q\u02b3"+
		"\nQ\3R\3R\3S\3S\3T\3T\3U\3U\7U\u02bd\nU\fU\16U\u02c0\13U\3\u00b1\2V\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37="+
		" ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9"+
		"q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008f"+
		"I\u0091J\u0093K\u0095L\u0097M\u0099N\u009bO\u009dP\u009fQ\u00a1R\u00a3"+
		"S\u00a5T\u00a7U\u00a9V\3\2\n\4\2\f\f\17\17\5\2\13\f\17\17\"\"\3\2\62;"+
		"\3\2\60\60\4\2qq~~\4\2(({{\4\2C\\c|\6\2\62;C\\aac|\u02cb\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2"+
		"K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3"+
		"\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2"+
		"\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2"+
		"q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3"+
		"\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2"+
		"\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f"+
		"\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2"+
		"\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1"+
		"\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2"+
		"\2\3\u00ab\3\2\2\2\5\u00b9\3\2\2\2\7\u00c5\3\2\2\2\t\u00cb\3\2\2\2\13"+
		"\u00d5\3\2\2\2\r\u00db\3\2\2\2\17\u00e5\3\2\2\2\21\u00ed\3\2\2\2\23\u00f8"+
		"\3\2\2\2\25\u0105\3\2\2\2\27\u010d\3\2\2\2\31\u0112\3\2\2\2\33\u0119\3"+
		"\2\2\2\35\u0120\3\2\2\2\37\u0129\3\2\2\2!\u012e\3\2\2\2#\u0135\3\2\2\2"+
		"%\u013e\3\2\2\2\'\u0144\3\2\2\2)\u014b\3\2\2\2+\u0155\3\2\2\2-\u015e\3"+
		"\2\2\2/\u0164\3\2\2\2\61\u0170\3\2\2\2\63\u017d\3\2\2\2\65\u0186\3\2\2"+
		"\2\67\u018b\3\2\2\29\u0193\3\2\2\2;\u019c\3\2\2\2=\u01a4\3\2\2\2?\u01ac"+
		"\3\2\2\2A\u01b2\3\2\2\2C\u01bb\3\2\2\2E\u01c3\3\2\2\2G\u01c9\3\2\2\2I"+
		"\u01cd\3\2\2\2K\u01d2\3\2\2\2M\u01da\3\2\2\2O\u01de\3\2\2\2Q\u01e3\3\2"+
		"\2\2S\u01e6\3\2\2\2U\u01ec\3\2\2\2W\u01f1\3\2\2\2Y\u01fa\3\2\2\2[\u0200"+
		"\3\2\2\2]\u0209\3\2\2\2_\u0214\3\2\2\2a\u0217\3\2\2\2c\u021c\3\2\2\2e"+
		"\u0221\3\2\2\2g\u0225\3\2\2\2i\u0230\3\2\2\2k\u023e\3\2\2\2m\u0245\3\2"+
		"\2\2o\u0255\3\2\2\2q\u0262\3\2\2\2s\u0268\3\2\2\2u\u026d\3\2\2\2w\u0277"+
		"\3\2\2\2y\u027e\3\2\2\2{\u0280\3\2\2\2}\u0282\3\2\2\2\177\u0284\3\2\2"+
		"\2\u0081\u0286\3\2\2\2\u0083\u0288\3\2\2\2\u0085\u028b\3\2\2\2\u0087\u028e"+
		"\3\2\2\2\u0089\u0290\3\2\2\2\u008b\u0292\3\2\2\2\u008d\u0295\3\2\2\2\u008f"+
		"\u0298\3\2\2\2\u0091\u029a\3\2\2\2\u0093\u029c\3\2\2\2\u0095\u02a1\3\2"+
		"\2\2\u0097\u02a6\3\2\2\2\u0099\u02a8\3\2\2\2\u009b\u02aa\3\2\2\2\u009d"+
		"\u02ac\3\2\2\2\u009f\u02ae\3\2\2\2\u00a1\u02b2\3\2\2\2\u00a3\u02b4\3\2"+
		"\2\2\u00a5\u02b6\3\2\2\2\u00a7\u02b8\3\2\2\2\u00a9\u02ba\3\2\2\2\u00ab"+
		"\u00ac\7\61\2\2\u00ac\u00ad\7,\2\2\u00ad\u00b1\3\2\2\2\u00ae\u00b0\13"+
		"\2\2\2\u00af\u00ae\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b1"+
		"\u00af\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b5\7,"+
		"\2\2\u00b5\u00b6\7\61\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\b\2\2\2\u00b8"+
		"\4\3\2\2\2\u00b9\u00ba\7\61\2\2\u00ba\u00bb\7\61\2\2\u00bb\u00bf\3\2\2"+
		"\2\u00bc\u00be\n\2\2\2\u00bd\u00bc\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd"+
		"\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2"+
		"\u00c3\b\3\2\2\u00c3\6\3\2\2\2\u00c4\u00c6\t\3\2\2\u00c5\u00c4\3\2\2\2"+
		"\u00c6\u00c7\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9"+
		"\3\2\2\2\u00c9\u00ca\b\4\2\2\u00ca\b\3\2\2\2\u00cb\u00cc\7x\2\2\u00cc"+
		"\u00cd\7g\2\2\u00cd\u00ce\7t\2\2\u00ce\u00cf\7f\2\2\u00cf\u00d0\7c\2\2"+
		"\u00d0\u00d1\7f\2\2\u00d1\u00d2\7g\2\2\u00d2\u00d3\7t\2\2\u00d3\u00d4"+
		"\7q\2\2\u00d4\n\3\2\2\2\u00d5\u00d6\7h\2\2\u00d6\u00d7\7c\2\2\u00d7\u00d8"+
		"\7n\2\2\u00d8\u00d9\7u\2\2\u00d9\u00da\7q\2\2\u00da\f\3\2\2\2\u00db\u00dc"+
		"\7c\2\2\u00dc\u00dd\7n\2\2\u00dd\u00de\7i\2\2\u00de\u00df\7q\2\2\u00df"+
		"\u00e0\7t\2\2\u00e0\u00e1\7k\2\2\u00e1\u00e2\7v\2\2\u00e2\u00e3\7o\2\2"+
		"\u00e3\u00e4\7q\2\2\u00e4\16\3\2\2\2\u00e5\u00e6\7r\2\2\u00e6\u00e7\7"+
		"t\2\2\u00e7\u00e8\7q\2\2\u00e8\u00e9\7e\2\2\u00e9\u00ea\7g\2\2\u00ea\u00eb"+
		"\7u\2\2\u00eb\u00ec\7q\2\2\u00ec\20\3\2\2\2\u00ed\u00ee\7h\2\2\u00ee\u00ef"+
		"\7k\2\2\u00ef\u00f0\7p\2\2\u00f0\u00f1\7r\2\2\u00f1\u00f2\7t\2\2\u00f2"+
		"\u00f3\7q\2\2\u00f3\u00f4\7e\2\2\u00f4\u00f5\7g\2\2\u00f5\u00f6\7u\2\2"+
		"\u00f6\u00f7\7q\2\2\u00f7\22\3\2\2\2\u00f8\u00f9\7h\2\2\u00f9\u00fa\7"+
		"k\2\2\u00fa\u00fb\7p\2\2\u00fb\u00fc\7c\2\2\u00fc\u00fd\7n\2\2\u00fd\u00fe"+
		"\7i\2\2\u00fe\u00ff\7q\2\2\u00ff\u0100\7t\2\2\u0100\u0101\7k\2\2\u0101"+
		"\u0102\7v\2\2\u0102\u0103\7o\2\2\u0103\u0104\7q\2\2\u0104\24\3\2\2\2\u0105"+
		"\u0106\7f\2\2\u0106\u0107\7g\2\2\u0107\u0108\7h\2\2\u0108\u0109\7k\2\2"+
		"\u0109\u010a\7p\2\2\u010a\u010b\7k\2\2\u010b\u010c\7t\2\2\u010c\26\3\2"+
		"\2\2\u010d\u010e\7e\2\2\u010e\u010f\7q\2\2\u010f\u0110\7o\2\2\u0110\u0111"+
		"\7q\2\2\u0111\30\3\2\2\2\u0112\u0113\7g\2\2\u0113\u0114\7p\2\2\u0114\u0115"+
		"\7v\2\2\u0115\u0116\7g\2\2\u0116\u0117\7t\2\2\u0117\u0118\7q\2\2\u0118"+
		"\32\3\2\2\2\u0119\u011a\7p\2\2\u011a\u011b\7w\2\2\u011b\u011c\7o\2\2\u011c"+
		"\u011d\7g\2\2\u011d\u011e\7t\2\2\u011e\u011f\7q\2\2\u011f\34\3\2\2\2\u0120"+
		"\u0121\7p\2\2\u0121\u0122\7w\2\2\u0122\u0123\7o\2\2\u0123\u0124\7g\2\2"+
		"\u0124\u0125\7t\2\2\u0125\u0126\7k\2\2\u0126\u0127\7e\2\2\u0127\u0128"+
		"\7q\2\2\u0128\36\3\2\2\2\u0129\u012a\7t\2\2\u012a\u012b\7g\2\2\u012b\u012c"+
		"\7c\2\2\u012c\u012d\7n\2\2\u012d \3\2\2\2\u012e\u012f\7n\2\2\u012f\u0130"+
		"\7q\2\2\u0130\u0131\7i\2\2\u0131\u0132\7k\2\2\u0132\u0133\7e\2\2\u0133"+
		"\u0134\7q\2\2\u0134\"\3\2\2\2\u0135\u0136\7e\2\2\u0136\u0137\7c\2\2\u0137"+
		"\u0138\7t\2\2\u0138\u0139\7c\2\2\u0139\u013a\7e\2\2\u013a\u013b\7v\2\2"+
		"\u013b\u013c\7g\2\2\u013c\u013d\7t\2\2\u013d$\3\2\2\2\u013e\u013f\7v\2"+
		"\2\u013f\u0140\7g\2\2\u0140\u0141\7z\2\2\u0141\u0142\7v\2\2\u0142\u0143"+
		"\7q\2\2\u0143&\3\2\2\2\u0144\u0145\7e\2\2\u0145\u0146\7c\2\2\u0146\u0147"+
		"\7f\2\2\u0147\u0148\7g\2\2\u0148\u0149\7p\2\2\u0149\u014a\7c\2\2\u014a"+
		"(\3\2\2\2\u014b\u014c\7f\2\2\u014c\u014d\7k\2\2\u014d\u014e\7o\2\2\u014e"+
		"\u014f\7g\2\2\u014f\u0150\7p\2\2\u0150\u0151\7u\2\2\u0151\u0152\7k\2\2"+
		"\u0152\u0153\7q\2\2\u0153\u0154\7p\2\2\u0154*\3\2\2\2\u0155\u0156\7o\2"+
		"\2\u0156\u0157\7k\2\2\u0157\u0158\7g\2\2\u0158\u0159\7p\2\2\u0159\u015a"+
		"\7v\2\2\u015a\u015b\7t\2\2\u015b\u015c\7c\2\2\u015c\u015d\7u\2\2\u015d"+
		",\3\2\2\2\u015e\u015f\7j\2\2\u015f\u0160\7c\2\2\u0160\u0161\7e\2\2\u0161"+
		"\u0162\7g\2\2\u0162\u0163\7t\2\2\u0163.\3\2\2\2\u0164\u0165\7h\2\2\u0165"+
		"\u0166\7k\2\2\u0166\u0167\7p\2\2\u0167\u0168\7o\2\2\u0168\u0169\7k\2\2"+
		"\u0169\u016a\7g\2\2\u016a\u016b\7p\2\2\u016b\u016c\7v\2\2\u016c\u016d"+
		"\7t\2\2\u016d\u016e\7c\2\2\u016e\u016f\7u\2\2\u016f\60\3\2\2\2\u0170\u0171"+
		"\7o\2\2\u0171\u0172\7k\2\2\u0172\u0173\7n\2\2\u0173\u0174\7k\2\2\u0174"+
		"\u0175\7u\2\2\u0175\u0176\7g\2\2\u0176\u0177\7i\2\2\u0177\u0178\7w\2\2"+
		"\u0178\u0179\7p\2\2\u0179\u017a\7f\2\2\u017a\u017b\7q\2\2\u017b\u017c"+
		"\7u\2\2\u017c\62\3\2\2\2\u017d\u017e\7u\2\2\u017e\u017f\7g\2\2\u017f\u0180"+
		"\7i\2\2\u0180\u0181\7w\2\2\u0181\u0182\7p\2\2\u0182\u0183\7f\2\2\u0183"+
		"\u0184\7q\2\2\u0184\u0185\7u\2\2\u0185\64\3\2\2\2\u0186\u0187\7n\2\2\u0187"+
		"\u0188\7g\2\2\u0188\u0189\7g\2\2\u0189\u018a\7t\2\2\u018a\66\3\2\2\2\u018b"+
		"\u018c\7n\2\2\u018c\u018d\7k\2\2\u018d\u018e\7o\2\2\u018e\u018f\7r\2\2"+
		"\u018f\u0190\7k\2\2\u0190\u0191\7c\2\2\u0191\u0192\7t\2\2\u01928\3\2\2"+
		"\2\u0193\u0194\7r\2\2\u0194\u0195\7c\2\2\u0195\u0196\7p\2\2\u0196\u0197"+
		"\7v\2\2\u0197\u0198\7c\2\2\u0198\u0199\7n\2\2\u0199\u019a\7n\2\2\u019a"+
		"\u019b\7c\2\2\u019b:\3\2\2\2\u019c\u019d\7t\2\2\u019d\u019e\7g\2\2\u019e"+
		"\u019f\7r\2\2\u019f\u01a0\7g\2\2\u01a0\u01a1\7v\2\2\u01a1\u01a2\7k\2\2"+
		"\u01a2\u01a3\7t\2\2\u01a3<\3\2\2\2\u01a4\u01a5\7h\2\2\u01a5\u01a6\7w\2"+
		"\2\u01a6\u01a7\7p\2\2\u01a7\u01a8\7e\2\2\u01a8\u01a9\7k\2\2\u01a9\u01aa"+
		"\7q\2\2\u01aa\u01ab\7p\2\2\u01ab>\3\2\2\2\u01ac\u01ad\7v\2\2\u01ad\u01ae"+
		"\7g\2\2\u01ae\u01af\7e\2\2\u01af\u01b0\7n\2\2\u01b0\u01b1\7c\2\2\u01b1"+
		"@\3\2\2\2\u01b2\u01b3\7g\2\2\u01b3\u01b4\7u\2\2\u01b4\u01b5\7e\2\2\u01b5"+
		"\u01b6\7t\2\2\u01b6\u01b7\7k\2\2\u01b7\u01b8\7d\2\2\u01b8\u01b9\7k\2\2"+
		"\u01b9\u01ba\7t\2\2\u01baB\3\2\2\2\u01bb\u01bc\7g\2\2\u01bc\u01bd\7u\2"+
		"\2\u01bd\u01be\7r\2\2\u01be\u01bf\7g\2\2\u01bf\u01c0\7t\2\2\u01c0\u01c1"+
		"\7c\2\2\u01c1\u01c2\7t\2\2\u01c2D\3\2\2\2\u01c3\u01c4\7j\2\2\u01c4\u01c5"+
		"\7c\2\2\u01c5\u01c6\7u\2\2\u01c6\u01c7\7v\2\2\u01c7\u01c8\7c\2\2\u01c8"+
		"F\3\2\2\2\u01c9\u01ca\7s\2\2\u01ca\u01cb\7w\2\2\u01cb\u01cc\7g\2\2\u01cc"+
		"H\3\2\2\2\u01cd\u01ce\7r\2\2\u01ce\u01cf\7c\2\2\u01cf\u01d0\7t\2\2\u01d0"+
		"\u01d1\7c\2\2\u01d1J\3\2\2\2\u01d2\u01d3\7h\2\2\u01d3\u01d4\7k\2\2\u01d4"+
		"\u01d5\7p\2\2\u01d5\u01d6\7r\2\2\u01d6\u01d7\7c\2\2\u01d7\u01d8\7t\2\2"+
		"\u01d8\u01d9\7c\2\2\u01d9L\3\2\2\2\u01da\u01db\7e\2\2\u01db\u01dc\7q\2"+
		"\2\u01dc\u01dd\7p\2\2\u01ddN\3\2\2\2\u01de\u01df\7r\2\2\u01df\u01e0\7"+
		"c\2\2\u01e0\u01e1\7u\2\2\u01e1\u01e2\7q\2\2\u01e2P\3\2\2\2\u01e3\u01e4"+
		"\7u\2\2\u01e4\u01e5\7k\2\2\u01e5R\3\2\2\2\u01e6\u01e7\7h\2\2\u01e7\u01e8"+
		"\7k\2\2\u01e8\u01e9\7p\2\2\u01e9\u01ea\7u\2\2\u01ea\u01eb\7k\2\2\u01eb"+
		"T\3\2\2\2\u01ec\u01ed\7u\2\2\u01ed\u01ee\7k\2\2\u01ee\u01ef\7p\2\2\u01ef"+
		"\u01f0\7q\2\2\u01f0V\3\2\2\2\u01f1\u01f2\7g\2\2\u01f2\u01f3\7p\2\2\u01f3"+
		"\u01f4\7v\2\2\u01f4\u01f5\7q\2\2\u01f5\u01f6\7p\2\2\u01f6\u01f7\7e\2\2"+
		"\u01f7\u01f8\7g\2\2\u01f8\u01f9\7u\2\2\u01f9X\3\2\2\2\u01fa\u01fb\7u\2"+
		"\2\u01fb\u01fc\7g\2\2\u01fc\u01fd\7i\2\2\u01fd\u01fe\7w\2\2\u01fe\u01ff"+
		"\7p\2\2\u01ffZ\3\2\2\2\u0200\u0201\7h\2\2\u0201\u0202\7k\2\2\u0202\u0203"+
		"\7p\2\2\u0203\u0204\7u\2\2\u0204\u0205\7g\2\2\u0205\u0206\7i\2\2\u0206"+
		"\u0207\7w\2\2\u0207\u0208\7p\2\2\u0208\\\3\2\2\2\u0209\u020a\7h\2\2\u020a"+
		"\u020b\7k\2\2\u020b\u020c\7p\2\2\u020c\u020d\7h\2\2\u020d\u020e\7w\2\2"+
		"\u020e\u020f\7p\2\2\u020f\u0210\7e\2\2\u0210\u0211\7k\2\2\u0211\u0212"+
		"\7q\2\2\u0212\u0213\7p\2\2\u0213^\3\2\2\2\u0214\u0215\7f\2\2\u0215\u0216"+
		"\7g\2\2\u0216`\3\2\2\2\u0217\u0218\7q\2\2\u0218\u0219\7v\2\2\u0219\u021a"+
		"\7t\2\2\u021a\u021b\7q\2\2\u021bb\3\2\2\2\u021c\u021d\7o\2\2\u021d\u021e"+
		"\7q\2\2\u021e\u021f\7f\2\2\u021f\u0220\7q\2\2\u0220d\3\2\2\2\u0221\u0222"+
		"\7o\2\2\u0222\u0223\7q\2\2\u0223\u0224\7f\2\2\u0224f\3\2\2\2\u0225\u0226"+
		"\7u\2\2\u0226\u0227\7w\2\2\u0227\u0228\7d\2\2\u0228\u0229\7r\2\2\u0229"+
		"\u022a\7t\2\2\u022a\u022b\7q\2\2\u022b\u022c\7e\2\2\u022c\u022d\7g\2\2"+
		"\u022d\u022e\7u\2\2\u022e\u022f\7q\2\2\u022fh\3\2\2\2\u0230\u0231\7h\2"+
		"\2\u0231\u0232\7k\2\2\u0232\u0233\7p\2\2\u0233\u0234\7u\2\2\u0234\u0235"+
		"\7w\2\2\u0235\u0236\7d\2\2\u0236\u0237\7r\2\2\u0237\u0238\7t\2\2\u0238"+
		"\u0239\7q\2\2\u0239\u023a\7e\2\2\u023a\u023b\7g\2\2\u023b\u023c\7u\2\2"+
		"\u023c\u023d\7q\2\2\u023dj\3\2\2\2\u023e\u023f\7d\2\2\u023f\u0240\7q\2"+
		"\2\u0240\u0241\7t\2\2\u0241\u0242\7t\2\2\u0242\u0243\7c\2\2\u0243\u0244"+
		"\7t\2\2\u0244l\3\2\2\2\u0245\u0246\7h\2\2\u0246\u0247\7k\2\2\u0247\u0248"+
		"\7p\2\2\u0248\u0249\7u\2\2\u0249\u024a\7w\2\2\u024a\u024b\7d\2\2\u024b"+
		"\u024c\7c\2\2\u024c\u024d\7n\2\2\u024d\u024e\7i\2\2\u024e\u024f\7q\2\2"+
		"\u024f\u0250\7t\2\2\u0250\u0251\7k\2\2\u0251\u0252\7v\2\2\u0252\u0253"+
		"\7o\2\2\u0253\u0254\7q\2\2\u0254n\3\2\2\2\u0255\u0256\7u\2\2\u0256\u0257"+
		"\7w\2\2\u0257\u0258\7d\2\2\u0258\u0259\7c\2\2\u0259\u025a\7n\2\2\u025a"+
		"\u025b\7i\2\2\u025b\u025c\7q\2\2\u025c\u025d\7t\2\2\u025d\u025e\7k\2\2"+
		"\u025e\u025f\7v\2\2\u025f\u0260\7o\2\2\u0260\u0261\7q\2\2\u0261p\3\2\2"+
		"\2\u0262\u0263\7e\2\2\u0263\u0264\7c\2\2\u0264\u0265\7u\2\2\u0265\u0266"+
		"\7q\2\2\u0266r\3\2\2\2\u0267\u0269\t\4\2\2\u0268\u0267\3\2\2\2\u0269\u026a"+
		"\3\2\2\2\u026a\u0268\3\2\2\2\u026a\u026b\3\2\2\2\u026bt\3\2\2\2\u026c"+
		"\u026e\t\4\2\2\u026d\u026c\3\2\2\2\u026e\u026f\3\2\2\2\u026f\u026d\3\2"+
		"\2\2\u026f\u0270\3\2\2\2\u0270\u0271\3\2\2\2\u0271\u0273\t\5\2\2\u0272"+
		"\u0274\t\4\2\2\u0273\u0272\3\2\2\2\u0274\u0275\3\2\2\2\u0275\u0273\3\2"+
		"\2\2\u0275\u0276\3\2\2\2\u0276v\3\2\2\2\u0277\u027b\7$\2\2\u0278\u027a"+
		"\t\5\2\2\u0279\u0278\3\2\2\2\u027a\u027d\3\2\2\2\u027b\u0279\3\2\2\2\u027b"+
		"\u027c\3\2\2\2\u027cx\3\2\2\2\u027d\u027b\3\2\2\2\u027e\u027f\7*\2\2\u027f"+
		"z\3\2\2\2\u0280\u0281\7+\2\2\u0281|\3\2\2\2\u0282\u0283\7]\2\2\u0283~"+
		"\3\2\2\2\u0284\u0285\7_\2\2\u0285\u0080\3\2\2\2\u0286\u0287\7=\2\2\u0287"+
		"\u0082\3\2\2\2\u0288\u0289\7>\2\2\u0289\u028a\7/\2\2\u028a\u0084\3\2\2"+
		"\2\u028b\u028c\7>\2\2\u028c\u028d\7@\2\2\u028d\u0086\3\2\2\2\u028e\u028f"+
		"\7>\2\2\u028f\u0088\3\2\2\2\u0290\u0291\7@\2\2\u0291\u008a\3\2\2\2\u0292"+
		"\u0293\7>\2\2\u0293\u0294\7?\2\2\u0294\u008c\3\2\2\2\u0295\u0296\7@\2"+
		"\2\u0296\u0297\7?\2\2\u0297\u008e\3\2\2\2\u0298\u0299\7.\2\2\u0299\u0090"+
		"\3\2\2\2\u029a\u029b\t\6\2\2\u029b\u0092\3\2\2\2\u029c\u029d\t\7\2\2\u029d"+
		"\u0094\3\2\2\2\u029e\u02a2\7\u0080\2\2\u029f\u02a0\7p\2\2\u02a0\u02a2"+
		"\7q\2\2\u02a1\u029e\3\2\2\2\u02a1\u029f\3\2\2\2\u02a2\u0096\3\2\2\2\u02a3"+
		"\u02a7\7?\2\2\u02a4\u02a5\7?\2\2\u02a5\u02a7\7?\2\2\u02a6\u02a3\3\2\2"+
		"\2\u02a6\u02a4\3\2\2\2\u02a7\u0098\3\2\2\2\u02a8\u02a9\7-\2\2\u02a9\u009a"+
		"\3\2\2\2\u02aa\u02ab\7/\2\2\u02ab\u009c\3\2\2\2\u02ac\u02ad\7\61\2\2\u02ad"+
		"\u009e\3\2\2\2\u02ae\u02af\7,\2\2\u02af\u00a0\3\2\2\2\u02b0\u02b3\7\'"+
		"\2\2\u02b1\u02b3\5e\63\2\u02b2\u02b0\3\2\2\2\u02b2\u02b1\3\2\2\2\u02b3"+
		"\u00a2\3\2\2\2\u02b4\u02b5\7<\2\2\u02b5\u00a4\3\2\2\2\u02b6\u02b7\7`\2"+
		"\2\u02b7\u00a6\3\2\2\2\u02b8\u02b9\7&\2\2\u02b9\u00a8\3\2\2\2\u02ba\u02be"+
		"\t\b\2\2\u02bb\u02bd\t\t\2\2\u02bc\u02bb\3\2\2\2\u02bd\u02c0\3\2\2\2\u02be"+
		"\u02bc\3\2\2\2\u02be\u02bf\3\2\2\2\u02bf\u00aa\3\2\2\2\u02c0\u02be\3\2"+
		"\2\2\16\2\u00b1\u00bf\u00c7\u026a\u026f\u0275\u027b\u02a1\u02a6\u02b2"+
		"\u02be\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}