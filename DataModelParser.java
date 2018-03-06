// Generated from DataModel.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DataModelParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, KEY=8, TEXT=9, 
		WS=10;
	public static final int
		RULE_start = 0, RULE_datamodel = 1, RULE_value = 2, RULE_object = 3, RULE_keyvalue = 4, 
		RULE_array = 5, RULE_encapsulated = 6;
	public static final String[] ruleNames = {
		"start", "datamodel", "value", "object", "keyvalue", "array", "encapsulated"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'<'", "','", "'>'", "'->'", "'['", "']'", "'\"'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "KEY", "TEXT", "WS"
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
	public String getGrammarFileName() { return "DataModel.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DataModelParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public DatamodelContext datamodel() {
			return getRuleContext(DatamodelContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelListener ) ((DataModelListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelListener ) ((DataModelListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			datamodel();
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

	public static class DatamodelContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public DatamodelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datamodel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelListener ) ((DataModelListener)listener).enterDatamodel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelListener ) ((DataModelListener)listener).exitDatamodel(this);
		}
	}

	public final DatamodelContext datamodel() throws RecognitionException {
		DatamodelContext _localctx = new DatamodelContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_datamodel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			value();
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

	public static class ValueContext extends ParserRuleContext {
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public TerminalNode TEXT() { return getToken(DataModelParser.TEXT, 0); }
		public EncapsulatedContext encapsulated() {
			return getRuleContext(EncapsulatedContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelListener ) ((DataModelListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelListener ) ((DataModelListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_value);
		try {
			setState(22);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(18);
				object();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(19);
				array();
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 3);
				{
				setState(20);
				match(TEXT);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 4);
				{
				setState(21);
				encapsulated();
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

	public static class ObjectContext extends ParserRuleContext {
		public List<KeyvalueContext> keyvalue() {
			return getRuleContexts(KeyvalueContext.class);
		}
		public KeyvalueContext keyvalue(int i) {
			return getRuleContext(KeyvalueContext.class,i);
		}
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelListener ) ((DataModelListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelListener ) ((DataModelListener)listener).exitObject(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_object);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			match(T__0);
			setState(25);
			keyvalue();
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(26);
				match(T__1);
				setState(27);
				keyvalue();
				}
				}
				setState(32);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(33);
			match(T__2);
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

	public static class KeyvalueContext extends ParserRuleContext {
		public TerminalNode KEY() { return getToken(DataModelParser.KEY, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public KeyvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelListener ) ((DataModelListener)listener).enterKeyvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelListener ) ((DataModelListener)listener).exitKeyvalue(this);
		}
	}

	public final KeyvalueContext keyvalue() throws RecognitionException {
		KeyvalueContext _localctx = new KeyvalueContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_keyvalue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(KEY);
			setState(36);
			match(T__3);
			setState(37);
			value();
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

	public static class ArrayContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelListener ) ((DataModelListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelListener ) ((DataModelListener)listener).exitArray(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(T__4);
			setState(40);
			value();
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(41);
				match(T__1);
				setState(42);
				value();
				}
				}
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(48);
			match(T__5);
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

	public static class EncapsulatedContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(DataModelParser.TEXT, 0); }
		public EncapsulatedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_encapsulated; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelListener ) ((DataModelListener)listener).enterEncapsulated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelListener ) ((DataModelListener)listener).exitEncapsulated(this);
		}
	}

	public final EncapsulatedContext encapsulated() throws RecognitionException {
		EncapsulatedContext _localctx = new EncapsulatedContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_encapsulated);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(T__6);
			setState(51);
			match(TEXT);
			setState(52);
			match(T__6);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\f9\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\5\4\31\n\4\3\5\3\5\3\5\3\5\7\5\37\n\5\f\5\16\5\"\13\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\7\7\7.\n\7\f\7\16\7\61\13\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\2\2\t\2\4\6\b\n\f\16\2\2\2\66\2\20\3\2\2\2\4\22\3\2\2\2\6"+
		"\30\3\2\2\2\b\32\3\2\2\2\n%\3\2\2\2\f)\3\2\2\2\16\64\3\2\2\2\20\21\5\4"+
		"\3\2\21\3\3\2\2\2\22\23\5\6\4\2\23\5\3\2\2\2\24\31\5\b\5\2\25\31\5\f\7"+
		"\2\26\31\7\13\2\2\27\31\5\16\b\2\30\24\3\2\2\2\30\25\3\2\2\2\30\26\3\2"+
		"\2\2\30\27\3\2\2\2\31\7\3\2\2\2\32\33\7\3\2\2\33 \5\n\6\2\34\35\7\4\2"+
		"\2\35\37\5\n\6\2\36\34\3\2\2\2\37\"\3\2\2\2 \36\3\2\2\2 !\3\2\2\2!#\3"+
		"\2\2\2\" \3\2\2\2#$\7\5\2\2$\t\3\2\2\2%&\7\n\2\2&\'\7\6\2\2\'(\5\6\4\2"+
		"(\13\3\2\2\2)*\7\7\2\2*/\5\6\4\2+,\7\4\2\2,.\5\6\4\2-+\3\2\2\2.\61\3\2"+
		"\2\2/-\3\2\2\2/\60\3\2\2\2\60\62\3\2\2\2\61/\3\2\2\2\62\63\7\b\2\2\63"+
		"\r\3\2\2\2\64\65\7\t\2\2\65\66\7\13\2\2\66\67\7\t\2\2\67\17\3\2\2\2\5"+
		"\30 /";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}