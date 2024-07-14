
package quickfix.fix50sp1.component;

import quickfix.FieldNotFound;

import quickfix.Group;

public class TradingSessionRulesGrp extends quickfix.MessageComponent {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "";
	
	private int[] componentFields = {  };
	protected int[] getFields() { return componentFields; }
	private int[] componentGroups = { 1309,  };
	protected int[] getGroupFields() { return componentGroups; }
	

	public TradingSessionRulesGrp() {
		super();
	}
	
	public void set(quickfix.field.NoTradingSessionRules value) {
		setField(value);
	}

	public quickfix.field.NoTradingSessionRules get(quickfix.field.NoTradingSessionRules value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoTradingSessionRules getNoTradingSessionRules() throws FieldNotFound {
		return get(new quickfix.field.NoTradingSessionRules());
	}

	public boolean isSet(quickfix.field.NoTradingSessionRules field) {
		return isSetField(field);
	}

	public boolean isSetNoTradingSessionRules() {
		return isSetField(1309);
	}

	public static class NoTradingSessionRules extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {336, 625, 1237, 1239, 1232, 1235, 1141, 0};

		public NoTradingSessionRules() {
			super(1309, 336, ORDER);
		}
		
	public void set(quickfix.field.TradingSessionID value) {
		setField(value);
	}

	public quickfix.field.TradingSessionID get(quickfix.field.TradingSessionID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TradingSessionID getTradingSessionID() throws FieldNotFound {
		return get(new quickfix.field.TradingSessionID());
	}

	public boolean isSet(quickfix.field.TradingSessionID field) {
		return isSetField(field);
	}

	public boolean isSetTradingSessionID() {
		return isSetField(336);
	}

	public void set(quickfix.field.TradingSessionSubID value) {
		setField(value);
	}

	public quickfix.field.TradingSessionSubID get(quickfix.field.TradingSessionSubID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TradingSessionSubID getTradingSessionSubID() throws FieldNotFound {
		return get(new quickfix.field.TradingSessionSubID());
	}

	public boolean isSet(quickfix.field.TradingSessionSubID field) {
		return isSetField(field);
	}

	public boolean isSetTradingSessionSubID() {
		return isSetField(625);
	}

	public void set(quickfix.fix50sp1.component.TradingSessionRules component) {
		setComponent(component);
	}

	public quickfix.fix50sp1.component.TradingSessionRules get(quickfix.fix50sp1.component.TradingSessionRules component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp1.component.TradingSessionRules getTradingSessionRules() throws FieldNotFound {
		return get(new quickfix.fix50sp1.component.TradingSessionRules());
	}

	public void set(quickfix.fix50sp1.component.OrdTypeRules component) {
		setComponent(component);
	}

	public quickfix.fix50sp1.component.OrdTypeRules get(quickfix.fix50sp1.component.OrdTypeRules component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp1.component.OrdTypeRules getOrdTypeRules() throws FieldNotFound {
		return get(new quickfix.fix50sp1.component.OrdTypeRules());
	}

	public void set(quickfix.field.NoOrdTypeRules value) {
		setField(value);
	}

	public quickfix.field.NoOrdTypeRules get(quickfix.field.NoOrdTypeRules value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoOrdTypeRules getNoOrdTypeRules() throws FieldNotFound {
		return get(new quickfix.field.NoOrdTypeRules());
	}

	public boolean isSet(quickfix.field.NoOrdTypeRules field) {
		return isSetField(field);
	}

	public boolean isSetNoOrdTypeRules() {
		return isSetField(1237);
	}

	public static class NoOrdTypeRules extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {40, 0};

		public NoOrdTypeRules() {
			super(1237, 40, ORDER);
		}
		
	public void set(quickfix.field.OrdType value) {
		setField(value);
	}

	public quickfix.field.OrdType get(quickfix.field.OrdType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.OrdType getOrdType() throws FieldNotFound {
		return get(new quickfix.field.OrdType());
	}

	public boolean isSet(quickfix.field.OrdType field) {
		return isSetField(field);
	}

	public boolean isSetOrdType() {
		return isSetField(40);
	}

	}

	public void set(quickfix.fix50sp1.component.TimeInForceRules component) {
		setComponent(component);
	}

	public quickfix.fix50sp1.component.TimeInForceRules get(quickfix.fix50sp1.component.TimeInForceRules component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp1.component.TimeInForceRules getTimeInForceRules() throws FieldNotFound {
		return get(new quickfix.fix50sp1.component.TimeInForceRules());
	}

	public void set(quickfix.field.NoTimeInForceRules value) {
		setField(value);
	}

	public quickfix.field.NoTimeInForceRules get(quickfix.field.NoTimeInForceRules value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoTimeInForceRules getNoTimeInForceRules() throws FieldNotFound {
		return get(new quickfix.field.NoTimeInForceRules());
	}

	public boolean isSet(quickfix.field.NoTimeInForceRules field) {
		return isSetField(field);
	}

	public boolean isSetNoTimeInForceRules() {
		return isSetField(1239);
	}

	public static class NoTimeInForceRules extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {59, 0};

		public NoTimeInForceRules() {
			super(1239, 59, ORDER);
		}
		
	public void set(quickfix.field.TimeInForce value) {
		setField(value);
	}

	public quickfix.field.TimeInForce get(quickfix.field.TimeInForce value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TimeInForce getTimeInForce() throws FieldNotFound {
		return get(new quickfix.field.TimeInForce());
	}

	public boolean isSet(quickfix.field.TimeInForce field) {
		return isSetField(field);
	}

	public boolean isSetTimeInForce() {
		return isSetField(59);
	}

	}

	public void set(quickfix.fix50sp1.component.ExecInstRules component) {
		setComponent(component);
	}

	public quickfix.fix50sp1.component.ExecInstRules get(quickfix.fix50sp1.component.ExecInstRules component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp1.component.ExecInstRules getExecInstRules() throws FieldNotFound {
		return get(new quickfix.fix50sp1.component.ExecInstRules());
	}

	public void set(quickfix.field.NoExecInstRules value) {
		setField(value);
	}

	public quickfix.field.NoExecInstRules get(quickfix.field.NoExecInstRules value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoExecInstRules getNoExecInstRules() throws FieldNotFound {
		return get(new quickfix.field.NoExecInstRules());
	}

	public boolean isSet(quickfix.field.NoExecInstRules field) {
		return isSetField(field);
	}

	public boolean isSetNoExecInstRules() {
		return isSetField(1232);
	}

	public static class NoExecInstRules extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {1308, 0};

		public NoExecInstRules() {
			super(1232, 1308, ORDER);
		}
		
	public void set(quickfix.field.ExecInstValue value) {
		setField(value);
	}

	public quickfix.field.ExecInstValue get(quickfix.field.ExecInstValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ExecInstValue getExecInstValue() throws FieldNotFound {
		return get(new quickfix.field.ExecInstValue());
	}

	public boolean isSet(quickfix.field.ExecInstValue field) {
		return isSetField(field);
	}

	public boolean isSetExecInstValue() {
		return isSetField(1308);
	}

	}

	public void set(quickfix.fix50sp1.component.MatchRules component) {
		setComponent(component);
	}

	public quickfix.fix50sp1.component.MatchRules get(quickfix.fix50sp1.component.MatchRules component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp1.component.MatchRules getMatchRules() throws FieldNotFound {
		return get(new quickfix.fix50sp1.component.MatchRules());
	}

	public void set(quickfix.field.NoMatchRules value) {
		setField(value);
	}

	public quickfix.field.NoMatchRules get(quickfix.field.NoMatchRules value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoMatchRules getNoMatchRules() throws FieldNotFound {
		return get(new quickfix.field.NoMatchRules());
	}

	public boolean isSet(quickfix.field.NoMatchRules field) {
		return isSetField(field);
	}

	public boolean isSetNoMatchRules() {
		return isSetField(1235);
	}

	public static class NoMatchRules extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {1142, 574, 0};

		public NoMatchRules() {
			super(1235, 1142, ORDER);
		}
		
	public void set(quickfix.field.MatchAlgorithm value) {
		setField(value);
	}

	public quickfix.field.MatchAlgorithm get(quickfix.field.MatchAlgorithm value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MatchAlgorithm getMatchAlgorithm() throws FieldNotFound {
		return get(new quickfix.field.MatchAlgorithm());
	}

	public boolean isSet(quickfix.field.MatchAlgorithm field) {
		return isSetField(field);
	}

	public boolean isSetMatchAlgorithm() {
		return isSetField(1142);
	}

	public void set(quickfix.field.MatchType value) {
		setField(value);
	}

	public quickfix.field.MatchType get(quickfix.field.MatchType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MatchType getMatchType() throws FieldNotFound {
		return get(new quickfix.field.MatchType());
	}

	public boolean isSet(quickfix.field.MatchType field) {
		return isSetField(field);
	}

	public boolean isSetMatchType() {
		return isSetField(574);
	}

	}

	public void set(quickfix.fix50sp1.component.MarketDataFeedTypes component) {
		setComponent(component);
	}

	public quickfix.fix50sp1.component.MarketDataFeedTypes get(quickfix.fix50sp1.component.MarketDataFeedTypes component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp1.component.MarketDataFeedTypes getMarketDataFeedTypes() throws FieldNotFound {
		return get(new quickfix.fix50sp1.component.MarketDataFeedTypes());
	}

	public void set(quickfix.field.NoMDFeedTypes value) {
		setField(value);
	}

	public quickfix.field.NoMDFeedTypes get(quickfix.field.NoMDFeedTypes value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoMDFeedTypes getNoMDFeedTypes() throws FieldNotFound {
		return get(new quickfix.field.NoMDFeedTypes());
	}

	public boolean isSet(quickfix.field.NoMDFeedTypes field) {
		return isSetField(field);
	}

	public boolean isSetNoMDFeedTypes() {
		return isSetField(1141);
	}

	public static class NoMDFeedTypes extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {1022, 264, 1021, 0};

		public NoMDFeedTypes() {
			super(1141, 1022, ORDER);
		}
		
	public void set(quickfix.field.MDFeedType value) {
		setField(value);
	}

	public quickfix.field.MDFeedType get(quickfix.field.MDFeedType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MDFeedType getMDFeedType() throws FieldNotFound {
		return get(new quickfix.field.MDFeedType());
	}

	public boolean isSet(quickfix.field.MDFeedType field) {
		return isSetField(field);
	}

	public boolean isSetMDFeedType() {
		return isSetField(1022);
	}

	public void set(quickfix.field.MarketDepth value) {
		setField(value);
	}

	public quickfix.field.MarketDepth get(quickfix.field.MarketDepth value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MarketDepth getMarketDepth() throws FieldNotFound {
		return get(new quickfix.field.MarketDepth());
	}

	public boolean isSet(quickfix.field.MarketDepth field) {
		return isSetField(field);
	}

	public boolean isSetMarketDepth() {
		return isSetField(264);
	}

	public void set(quickfix.field.MDBookType value) {
		setField(value);
	}

	public quickfix.field.MDBookType get(quickfix.field.MDBookType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MDBookType getMDBookType() throws FieldNotFound {
		return get(new quickfix.field.MDBookType());
	}

	public boolean isSet(quickfix.field.MDBookType field) {
		return isSetField(field);
	}

	public boolean isSetMDBookType() {
		return isSetField(1021);
	}

	}

	}

}
