
package quickfix.fix50sp2;

import quickfix.FieldNotFound;

import quickfix.Group;

public class QuoteRequest extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "R";
	

	public QuoteRequest() {
		super();
		getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
	}
	
	public QuoteRequest(quickfix.field.QuoteReqID quoteReqID) {
		this();
		setField(quoteReqID);
	}
	
	public void set(quickfix.field.QuoteReqID value) {
		setField(value);
	}

	public quickfix.field.QuoteReqID get(quickfix.field.QuoteReqID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.QuoteReqID getQuoteReqID() throws FieldNotFound {
		return get(new quickfix.field.QuoteReqID());
	}

	public boolean isSet(quickfix.field.QuoteReqID field) {
		return isSetField(field);
	}

	public boolean isSetQuoteReqID() {
		return isSetField(131);
	}

	public void set(quickfix.field.RFQReqID value) {
		setField(value);
	}

	public quickfix.field.RFQReqID get(quickfix.field.RFQReqID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.RFQReqID getRFQReqID() throws FieldNotFound {
		return get(new quickfix.field.RFQReqID());
	}

	public boolean isSet(quickfix.field.RFQReqID field) {
		return isSetField(field);
	}

	public boolean isSetRFQReqID() {
		return isSetField(644);
	}

	public void set(quickfix.field.ClOrdID value) {
		setField(value);
	}

	public quickfix.field.ClOrdID get(quickfix.field.ClOrdID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ClOrdID getClOrdID() throws FieldNotFound {
		return get(new quickfix.field.ClOrdID());
	}

	public boolean isSet(quickfix.field.ClOrdID field) {
		return isSetField(field);
	}

	public boolean isSetClOrdID() {
		return isSetField(11);
	}

	public void set(quickfix.field.BookingType value) {
		setField(value);
	}

	public quickfix.field.BookingType get(quickfix.field.BookingType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.BookingType getBookingType() throws FieldNotFound {
		return get(new quickfix.field.BookingType());
	}

	public boolean isSet(quickfix.field.BookingType field) {
		return isSetField(field);
	}

	public boolean isSetBookingType() {
		return isSetField(775);
	}

	public void set(quickfix.field.OrderCapacity value) {
		setField(value);
	}

	public quickfix.field.OrderCapacity get(quickfix.field.OrderCapacity value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.OrderCapacity getOrderCapacity() throws FieldNotFound {
		return get(new quickfix.field.OrderCapacity());
	}

	public boolean isSet(quickfix.field.OrderCapacity field) {
		return isSetField(field);
	}

	public boolean isSetOrderCapacity() {
		return isSetField(528);
	}

	public void set(quickfix.field.OrderRestrictions value) {
		setField(value);
	}

	public quickfix.field.OrderRestrictions get(quickfix.field.OrderRestrictions value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.OrderRestrictions getOrderRestrictions() throws FieldNotFound {
		return get(new quickfix.field.OrderRestrictions());
	}

	public boolean isSet(quickfix.field.OrderRestrictions field) {
		return isSetField(field);
	}

	public boolean isSetOrderRestrictions() {
		return isSetField(529);
	}

	public void set(quickfix.field.PrivateQuote value) {
		setField(value);
	}

	public quickfix.field.PrivateQuote get(quickfix.field.PrivateQuote value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PrivateQuote getPrivateQuote() throws FieldNotFound {
		return get(new quickfix.field.PrivateQuote());
	}

	public boolean isSet(quickfix.field.PrivateQuote field) {
		return isSetField(field);
	}

	public boolean isSetPrivateQuote() {
		return isSetField(1171);
	}

	public void set(quickfix.field.RespondentType value) {
		setField(value);
	}

	public quickfix.field.RespondentType get(quickfix.field.RespondentType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.RespondentType getRespondentType() throws FieldNotFound {
		return get(new quickfix.field.RespondentType());
	}

	public boolean isSet(quickfix.field.RespondentType field) {
		return isSetField(field);
	}

	public boolean isSetRespondentType() {
		return isSetField(1172);
	}

	public void set(quickfix.field.PreTradeAnonymity value) {
		setField(value);
	}

	public quickfix.field.PreTradeAnonymity get(quickfix.field.PreTradeAnonymity value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PreTradeAnonymity getPreTradeAnonymity() throws FieldNotFound {
		return get(new quickfix.field.PreTradeAnonymity());
	}

	public boolean isSet(quickfix.field.PreTradeAnonymity field) {
		return isSetField(field);
	}

	public boolean isSetPreTradeAnonymity() {
		return isSetField(1091);
	}

	public void set(quickfix.fix50sp2.component.RootParties component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.RootParties get(quickfix.fix50sp2.component.RootParties component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.RootParties getRootParties() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.RootParties());
	}

	public void set(quickfix.field.NoRootPartyIDs value) {
		setField(value);
	}

	public quickfix.field.NoRootPartyIDs get(quickfix.field.NoRootPartyIDs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoRootPartyIDs getNoRootPartyIDs() throws FieldNotFound {
		return get(new quickfix.field.NoRootPartyIDs());
	}

	public boolean isSet(quickfix.field.NoRootPartyIDs field) {
		return isSetField(field);
	}

	public boolean isSetNoRootPartyIDs() {
		return isSetField(1116);
	}

	public static class NoRootPartyIDs extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {1117, 1118, 1119, 1120, 0};

		public NoRootPartyIDs() {
			super(1116, 1117, ORDER);
		}
		
	public void set(quickfix.field.RootPartyID value) {
		setField(value);
	}

	public quickfix.field.RootPartyID get(quickfix.field.RootPartyID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.RootPartyID getRootPartyID() throws FieldNotFound {
		return get(new quickfix.field.RootPartyID());
	}

	public boolean isSet(quickfix.field.RootPartyID field) {
		return isSetField(field);
	}

	public boolean isSetRootPartyID() {
		return isSetField(1117);
	}

	public void set(quickfix.field.RootPartyIDSource value) {
		setField(value);
	}

	public quickfix.field.RootPartyIDSource get(quickfix.field.RootPartyIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.RootPartyIDSource getRootPartyIDSource() throws FieldNotFound {
		return get(new quickfix.field.RootPartyIDSource());
	}

	public boolean isSet(quickfix.field.RootPartyIDSource field) {
		return isSetField(field);
	}

	public boolean isSetRootPartyIDSource() {
		return isSetField(1118);
	}

	public void set(quickfix.field.RootPartyRole value) {
		setField(value);
	}

	public quickfix.field.RootPartyRole get(quickfix.field.RootPartyRole value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.RootPartyRole getRootPartyRole() throws FieldNotFound {
		return get(new quickfix.field.RootPartyRole());
	}

	public boolean isSet(quickfix.field.RootPartyRole field) {
		return isSetField(field);
	}

	public boolean isSetRootPartyRole() {
		return isSetField(1119);
	}

	public void set(quickfix.fix50sp2.component.RootSubParties component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.RootSubParties get(quickfix.fix50sp2.component.RootSubParties component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.RootSubParties getRootSubParties() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.RootSubParties());
	}

	public void set(quickfix.field.NoRootPartySubIDs value) {
		setField(value);
	}

	public quickfix.field.NoRootPartySubIDs get(quickfix.field.NoRootPartySubIDs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoRootPartySubIDs getNoRootPartySubIDs() throws FieldNotFound {
		return get(new quickfix.field.NoRootPartySubIDs());
	}

	public boolean isSet(quickfix.field.NoRootPartySubIDs field) {
		return isSetField(field);
	}

	public boolean isSetNoRootPartySubIDs() {
		return isSetField(1120);
	}

	public static class NoRootPartySubIDs extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {1121, 1122, 0};

		public NoRootPartySubIDs() {
			super(1120, 1121, ORDER);
		}
		
	public void set(quickfix.field.RootPartySubID value) {
		setField(value);
	}

	public quickfix.field.RootPartySubID get(quickfix.field.RootPartySubID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.RootPartySubID getRootPartySubID() throws FieldNotFound {
		return get(new quickfix.field.RootPartySubID());
	}

	public boolean isSet(quickfix.field.RootPartySubID field) {
		return isSetField(field);
	}

	public boolean isSetRootPartySubID() {
		return isSetField(1121);
	}

	public void set(quickfix.field.RootPartySubIDType value) {
		setField(value);
	}

	public quickfix.field.RootPartySubIDType get(quickfix.field.RootPartySubIDType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.RootPartySubIDType getRootPartySubIDType() throws FieldNotFound {
		return get(new quickfix.field.RootPartySubIDType());
	}

	public boolean isSet(quickfix.field.RootPartySubIDType field) {
		return isSetField(field);
	}

	public boolean isSetRootPartySubIDType() {
		return isSetField(1122);
	}

	}

	}

	public void set(quickfix.fix50sp2.component.QuotReqGrp component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.QuotReqGrp get(quickfix.fix50sp2.component.QuotReqGrp component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.QuotReqGrp getQuotReqGrp() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.QuotReqGrp());
	}

	public void set(quickfix.field.NoRelatedSym value) {
		setField(value);
	}

	public quickfix.field.NoRelatedSym get(quickfix.field.NoRelatedSym value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoRelatedSym getNoRelatedSym() throws FieldNotFound {
		return get(new quickfix.field.NoRelatedSym());
	}

	public boolean isSet(quickfix.field.NoRelatedSym field) {
		return isSetField(field);
	}

	public boolean isSetNoRelatedSym() {
		return isSetField(146);
	}

	public static class NoRelatedSym extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {55, 65, 48, 22, 454, 460, 1227, 1151, 461, 167, 762, 200, 541, 1079, 966, 1049, 965, 224, 1449, 1450, 1451, 1452, 1457, 1458, 225, 239, 226, 227, 228, 255, 543, 470, 471, 472, 240, 202, 947, 967, 968, 1478, 1479, 1480, 1481, 206, 231, 1435, 1439, 969, 1146, 996, 1147, 1191, 1192, 1193, 1194, 1482, 1195, 1196, 1197, 1198, 1199, 1200, 201, 1244, 1242, 997, 223, 207, 970, 971, 106, 348, 349, 107, 350, 351, 1184, 1185, 1186, 691, 667, 875, 876, 864, 873, 874, 1018, 1483, 913, 914, 915, 918, 788, 916, 917, 919, 898, 711, 140, 303, 537, 336, 625, 229, 54, 854, 38, 152, 516, 468, 469, 110, 63, 64, 193, 192, 15, 120, 1445, 232, 1, 660, 581, 555, 735, 692, 40, 62, 126, 60, 218, 220, 221, 222, 662, 663, 699, 761, 423, 44, 640, 235, 236, 701, 696, 697, 698, 453, 0};

		public NoRelatedSym() {
			super(146, 55, ORDER);
		}
		
	public void set(quickfix.fix50sp2.component.Instrument component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.Instrument get(quickfix.fix50sp2.component.Instrument component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.Instrument getInstrument() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.Instrument());
	}

	public void set(quickfix.field.Symbol value) {
		setField(value);
	}

	public quickfix.field.Symbol get(quickfix.field.Symbol value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Symbol getSymbol() throws FieldNotFound {
		return get(new quickfix.field.Symbol());
	}

	public boolean isSet(quickfix.field.Symbol field) {
		return isSetField(field);
	}

	public boolean isSetSymbol() {
		return isSetField(55);
	}

	public void set(quickfix.field.SymbolSfx value) {
		setField(value);
	}

	public quickfix.field.SymbolSfx get(quickfix.field.SymbolSfx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SymbolSfx getSymbolSfx() throws FieldNotFound {
		return get(new quickfix.field.SymbolSfx());
	}

	public boolean isSet(quickfix.field.SymbolSfx field) {
		return isSetField(field);
	}

	public boolean isSetSymbolSfx() {
		return isSetField(65);
	}

	public void set(quickfix.field.SecurityID value) {
		setField(value);
	}

	public quickfix.field.SecurityID get(quickfix.field.SecurityID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SecurityID getSecurityID() throws FieldNotFound {
		return get(new quickfix.field.SecurityID());
	}

	public boolean isSet(quickfix.field.SecurityID field) {
		return isSetField(field);
	}

	public boolean isSetSecurityID() {
		return isSetField(48);
	}

	public void set(quickfix.field.SecurityIDSource value) {
		setField(value);
	}

	public quickfix.field.SecurityIDSource get(quickfix.field.SecurityIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SecurityIDSource getSecurityIDSource() throws FieldNotFound {
		return get(new quickfix.field.SecurityIDSource());
	}

	public boolean isSet(quickfix.field.SecurityIDSource field) {
		return isSetField(field);
	}

	public boolean isSetSecurityIDSource() {
		return isSetField(22);
	}

	public void set(quickfix.fix50sp2.component.SecAltIDGrp component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.SecAltIDGrp get(quickfix.fix50sp2.component.SecAltIDGrp component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.SecAltIDGrp getSecAltIDGrp() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.SecAltIDGrp());
	}

	public void set(quickfix.field.NoSecurityAltID value) {
		setField(value);
	}

	public quickfix.field.NoSecurityAltID get(quickfix.field.NoSecurityAltID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoSecurityAltID getNoSecurityAltID() throws FieldNotFound {
		return get(new quickfix.field.NoSecurityAltID());
	}

	public boolean isSet(quickfix.field.NoSecurityAltID field) {
		return isSetField(field);
	}

	public boolean isSetNoSecurityAltID() {
		return isSetField(454);
	}

	public static class NoSecurityAltID extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {455, 456, 0};

		public NoSecurityAltID() {
			super(454, 455, ORDER);
		}
		
	public void set(quickfix.field.SecurityAltID value) {
		setField(value);
	}

	public quickfix.field.SecurityAltID get(quickfix.field.SecurityAltID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SecurityAltID getSecurityAltID() throws FieldNotFound {
		return get(new quickfix.field.SecurityAltID());
	}

	public boolean isSet(quickfix.field.SecurityAltID field) {
		return isSetField(field);
	}

	public boolean isSetSecurityAltID() {
		return isSetField(455);
	}

	public void set(quickfix.field.SecurityAltIDSource value) {
		setField(value);
	}

	public quickfix.field.SecurityAltIDSource get(quickfix.field.SecurityAltIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SecurityAltIDSource getSecurityAltIDSource() throws FieldNotFound {
		return get(new quickfix.field.SecurityAltIDSource());
	}

	public boolean isSet(quickfix.field.SecurityAltIDSource field) {
		return isSetField(field);
	}

	public boolean isSetSecurityAltIDSource() {
		return isSetField(456);
	}

	}

	public void set(quickfix.field.Product value) {
		setField(value);
	}

	public quickfix.field.Product get(quickfix.field.Product value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Product getProduct() throws FieldNotFound {
		return get(new quickfix.field.Product());
	}

	public boolean isSet(quickfix.field.Product field) {
		return isSetField(field);
	}

	public boolean isSetProduct() {
		return isSetField(460);
	}

	public void set(quickfix.field.ProductComplex value) {
		setField(value);
	}

	public quickfix.field.ProductComplex get(quickfix.field.ProductComplex value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ProductComplex getProductComplex() throws FieldNotFound {
		return get(new quickfix.field.ProductComplex());
	}

	public boolean isSet(quickfix.field.ProductComplex field) {
		return isSetField(field);
	}

	public boolean isSetProductComplex() {
		return isSetField(1227);
	}

	public void set(quickfix.field.SecurityGroup value) {
		setField(value);
	}

	public quickfix.field.SecurityGroup get(quickfix.field.SecurityGroup value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SecurityGroup getSecurityGroup() throws FieldNotFound {
		return get(new quickfix.field.SecurityGroup());
	}

	public boolean isSet(quickfix.field.SecurityGroup field) {
		return isSetField(field);
	}

	public boolean isSetSecurityGroup() {
		return isSetField(1151);
	}

	public void set(quickfix.field.CFICode value) {
		setField(value);
	}

	public quickfix.field.CFICode get(quickfix.field.CFICode value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.CFICode getCFICode() throws FieldNotFound {
		return get(new quickfix.field.CFICode());
	}

	public boolean isSet(quickfix.field.CFICode field) {
		return isSetField(field);
	}

	public boolean isSetCFICode() {
		return isSetField(461);
	}

	public void set(quickfix.field.SecurityType value) {
		setField(value);
	}

	public quickfix.field.SecurityType get(quickfix.field.SecurityType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SecurityType getSecurityType() throws FieldNotFound {
		return get(new quickfix.field.SecurityType());
	}

	public boolean isSet(quickfix.field.SecurityType field) {
		return isSetField(field);
	}

	public boolean isSetSecurityType() {
		return isSetField(167);
	}

	public void set(quickfix.field.SecuritySubType value) {
		setField(value);
	}

	public quickfix.field.SecuritySubType get(quickfix.field.SecuritySubType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SecuritySubType getSecuritySubType() throws FieldNotFound {
		return get(new quickfix.field.SecuritySubType());
	}

	public boolean isSet(quickfix.field.SecuritySubType field) {
		return isSetField(field);
	}

	public boolean isSetSecuritySubType() {
		return isSetField(762);
	}

	public void set(quickfix.field.MaturityMonthYear value) {
		setField(value);
	}

	public quickfix.field.MaturityMonthYear get(quickfix.field.MaturityMonthYear value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MaturityMonthYear getMaturityMonthYear() throws FieldNotFound {
		return get(new quickfix.field.MaturityMonthYear());
	}

	public boolean isSet(quickfix.field.MaturityMonthYear field) {
		return isSetField(field);
	}

	public boolean isSetMaturityMonthYear() {
		return isSetField(200);
	}

	public void set(quickfix.field.MaturityDate value) {
		setField(value);
	}

	public quickfix.field.MaturityDate get(quickfix.field.MaturityDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MaturityDate getMaturityDate() throws FieldNotFound {
		return get(new quickfix.field.MaturityDate());
	}

	public boolean isSet(quickfix.field.MaturityDate field) {
		return isSetField(field);
	}

	public boolean isSetMaturityDate() {
		return isSetField(541);
	}

	public void set(quickfix.field.MaturityTime value) {
		setField(value);
	}

	public quickfix.field.MaturityTime get(quickfix.field.MaturityTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MaturityTime getMaturityTime() throws FieldNotFound {
		return get(new quickfix.field.MaturityTime());
	}

	public boolean isSet(quickfix.field.MaturityTime field) {
		return isSetField(field);
	}

	public boolean isSetMaturityTime() {
		return isSetField(1079);
	}

	public void set(quickfix.field.SettleOnOpenFlag value) {
		setField(value);
	}

	public quickfix.field.SettleOnOpenFlag get(quickfix.field.SettleOnOpenFlag value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SettleOnOpenFlag getSettleOnOpenFlag() throws FieldNotFound {
		return get(new quickfix.field.SettleOnOpenFlag());
	}

	public boolean isSet(quickfix.field.SettleOnOpenFlag field) {
		return isSetField(field);
	}

	public boolean isSetSettleOnOpenFlag() {
		return isSetField(966);
	}

	public void set(quickfix.field.InstrmtAssignmentMethod value) {
		setField(value);
	}

	public quickfix.field.InstrmtAssignmentMethod get(quickfix.field.InstrmtAssignmentMethod value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.InstrmtAssignmentMethod getInstrmtAssignmentMethod() throws FieldNotFound {
		return get(new quickfix.field.InstrmtAssignmentMethod());
	}

	public boolean isSet(quickfix.field.InstrmtAssignmentMethod field) {
		return isSetField(field);
	}

	public boolean isSetInstrmtAssignmentMethod() {
		return isSetField(1049);
	}

	public void set(quickfix.field.SecurityStatus value) {
		setField(value);
	}

	public quickfix.field.SecurityStatus get(quickfix.field.SecurityStatus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SecurityStatus getSecurityStatus() throws FieldNotFound {
		return get(new quickfix.field.SecurityStatus());
	}

	public boolean isSet(quickfix.field.SecurityStatus field) {
		return isSetField(field);
	}

	public boolean isSetSecurityStatus() {
		return isSetField(965);
	}

	public void set(quickfix.field.CouponPaymentDate value) {
		setField(value);
	}

	public quickfix.field.CouponPaymentDate get(quickfix.field.CouponPaymentDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.CouponPaymentDate getCouponPaymentDate() throws FieldNotFound {
		return get(new quickfix.field.CouponPaymentDate());
	}

	public boolean isSet(quickfix.field.CouponPaymentDate field) {
		return isSetField(field);
	}

	public boolean isSetCouponPaymentDate() {
		return isSetField(224);
	}

	public void set(quickfix.field.RestructuringType value) {
		setField(value);
	}

	public quickfix.field.RestructuringType get(quickfix.field.RestructuringType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.RestructuringType getRestructuringType() throws FieldNotFound {
		return get(new quickfix.field.RestructuringType());
	}

	public boolean isSet(quickfix.field.RestructuringType field) {
		return isSetField(field);
	}

	public boolean isSetRestructuringType() {
		return isSetField(1449);
	}

	public void set(quickfix.field.Seniority value) {
		setField(value);
	}

	public quickfix.field.Seniority get(quickfix.field.Seniority value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Seniority getSeniority() throws FieldNotFound {
		return get(new quickfix.field.Seniority());
	}

	public boolean isSet(quickfix.field.Seniority field) {
		return isSetField(field);
	}

	public boolean isSetSeniority() {
		return isSetField(1450);
	}

	public void set(quickfix.field.NotionalPercentageOutstanding value) {
		setField(value);
	}

	public quickfix.field.NotionalPercentageOutstanding get(quickfix.field.NotionalPercentageOutstanding value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NotionalPercentageOutstanding getNotionalPercentageOutstanding() throws FieldNotFound {
		return get(new quickfix.field.NotionalPercentageOutstanding());
	}

	public boolean isSet(quickfix.field.NotionalPercentageOutstanding field) {
		return isSetField(field);
	}

	public boolean isSetNotionalPercentageOutstanding() {
		return isSetField(1451);
	}

	public void set(quickfix.field.OriginalNotionalPercentageOutstanding value) {
		setField(value);
	}

	public quickfix.field.OriginalNotionalPercentageOutstanding get(quickfix.field.OriginalNotionalPercentageOutstanding value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.OriginalNotionalPercentageOutstanding getOriginalNotionalPercentageOutstanding() throws FieldNotFound {
		return get(new quickfix.field.OriginalNotionalPercentageOutstanding());
	}

	public boolean isSet(quickfix.field.OriginalNotionalPercentageOutstanding field) {
		return isSetField(field);
	}

	public boolean isSetOriginalNotionalPercentageOutstanding() {
		return isSetField(1452);
	}

	public void set(quickfix.field.AttachmentPoint value) {
		setField(value);
	}

	public quickfix.field.AttachmentPoint get(quickfix.field.AttachmentPoint value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.AttachmentPoint getAttachmentPoint() throws FieldNotFound {
		return get(new quickfix.field.AttachmentPoint());
	}

	public boolean isSet(quickfix.field.AttachmentPoint field) {
		return isSetField(field);
	}

	public boolean isSetAttachmentPoint() {
		return isSetField(1457);
	}

	public void set(quickfix.field.DetachmentPoint value) {
		setField(value);
	}

	public quickfix.field.DetachmentPoint get(quickfix.field.DetachmentPoint value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DetachmentPoint getDetachmentPoint() throws FieldNotFound {
		return get(new quickfix.field.DetachmentPoint());
	}

	public boolean isSet(quickfix.field.DetachmentPoint field) {
		return isSetField(field);
	}

	public boolean isSetDetachmentPoint() {
		return isSetField(1458);
	}

	public void set(quickfix.field.IssueDate value) {
		setField(value);
	}

	public quickfix.field.IssueDate get(quickfix.field.IssueDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.IssueDate getIssueDate() throws FieldNotFound {
		return get(new quickfix.field.IssueDate());
	}

	public boolean isSet(quickfix.field.IssueDate field) {
		return isSetField(field);
	}

	public boolean isSetIssueDate() {
		return isSetField(225);
	}

	public void set(quickfix.field.RepoCollateralSecurityType value) {
		setField(value);
	}

	public quickfix.field.RepoCollateralSecurityType get(quickfix.field.RepoCollateralSecurityType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.RepoCollateralSecurityType getRepoCollateralSecurityType() throws FieldNotFound {
		return get(new quickfix.field.RepoCollateralSecurityType());
	}

	public boolean isSet(quickfix.field.RepoCollateralSecurityType field) {
		return isSetField(field);
	}

	public boolean isSetRepoCollateralSecurityType() {
		return isSetField(239);
	}

	public void set(quickfix.field.RepurchaseTerm value) {
		setField(value);
	}

	public quickfix.field.RepurchaseTerm get(quickfix.field.RepurchaseTerm value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.RepurchaseTerm getRepurchaseTerm() throws FieldNotFound {
		return get(new quickfix.field.RepurchaseTerm());
	}

	public boolean isSet(quickfix.field.RepurchaseTerm field) {
		return isSetField(field);
	}

	public boolean isSetRepurchaseTerm() {
		return isSetField(226);
	}

	public void set(quickfix.field.RepurchaseRate value) {
		setField(value);
	}

	public quickfix.field.RepurchaseRate get(quickfix.field.RepurchaseRate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.RepurchaseRate getRepurchaseRate() throws FieldNotFound {
		return get(new quickfix.field.RepurchaseRate());
	}

	public boolean isSet(quickfix.field.RepurchaseRate field) {
		return isSetField(field);
	}

	public boolean isSetRepurchaseRate() {
		return isSetField(227);
	}

	public void set(quickfix.field.Factor value) {
		setField(value);
	}

	public quickfix.field.Factor get(quickfix.field.Factor value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Factor getFactor() throws FieldNotFound {
		return get(new quickfix.field.Factor());
	}

	public boolean isSet(quickfix.field.Factor field) {
		return isSetField(field);
	}

	public boolean isSetFactor() {
		return isSetField(228);
	}

	public void set(quickfix.field.CreditRating value) {
		setField(value);
	}

	public quickfix.field.CreditRating get(quickfix.field.CreditRating value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.CreditRating getCreditRating() throws FieldNotFound {
		return get(new quickfix.field.CreditRating());
	}

	public boolean isSet(quickfix.field.CreditRating field) {
		return isSetField(field);
	}

	public boolean isSetCreditRating() {
		return isSetField(255);
	}

	public void set(quickfix.field.InstrRegistry value) {
		setField(value);
	}

	public quickfix.field.InstrRegistry get(quickfix.field.InstrRegistry value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.InstrRegistry getInstrRegistry() throws FieldNotFound {
		return get(new quickfix.field.InstrRegistry());
	}

	public boolean isSet(quickfix.field.InstrRegistry field) {
		return isSetField(field);
	}

	public boolean isSetInstrRegistry() {
		return isSetField(543);
	}

	public void set(quickfix.field.CountryOfIssue value) {
		setField(value);
	}

	public quickfix.field.CountryOfIssue get(quickfix.field.CountryOfIssue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.CountryOfIssue getCountryOfIssue() throws FieldNotFound {
		return get(new quickfix.field.CountryOfIssue());
	}

	public boolean isSet(quickfix.field.CountryOfIssue field) {
		return isSetField(field);
	}

	public boolean isSetCountryOfIssue() {
		return isSetField(470);
	}

	public void set(quickfix.field.StateOrProvinceOfIssue value) {
		setField(value);
	}

	public quickfix.field.StateOrProvinceOfIssue get(quickfix.field.StateOrProvinceOfIssue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.StateOrProvinceOfIssue getStateOrProvinceOfIssue() throws FieldNotFound {
		return get(new quickfix.field.StateOrProvinceOfIssue());
	}

	public boolean isSet(quickfix.field.StateOrProvinceOfIssue field) {
		return isSetField(field);
	}

	public boolean isSetStateOrProvinceOfIssue() {
		return isSetField(471);
	}

	public void set(quickfix.field.LocaleOfIssue value) {
		setField(value);
	}

	public quickfix.field.LocaleOfIssue get(quickfix.field.LocaleOfIssue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LocaleOfIssue getLocaleOfIssue() throws FieldNotFound {
		return get(new quickfix.field.LocaleOfIssue());
	}

	public boolean isSet(quickfix.field.LocaleOfIssue field) {
		return isSetField(field);
	}

	public boolean isSetLocaleOfIssue() {
		return isSetField(472);
	}

	public void set(quickfix.field.RedemptionDate value) {
		setField(value);
	}

	public quickfix.field.RedemptionDate get(quickfix.field.RedemptionDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.RedemptionDate getRedemptionDate() throws FieldNotFound {
		return get(new quickfix.field.RedemptionDate());
	}

	public boolean isSet(quickfix.field.RedemptionDate field) {
		return isSetField(field);
	}

	public boolean isSetRedemptionDate() {
		return isSetField(240);
	}

	public void set(quickfix.field.StrikePrice value) {
		setField(value);
	}

	public quickfix.field.StrikePrice get(quickfix.field.StrikePrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.StrikePrice getStrikePrice() throws FieldNotFound {
		return get(new quickfix.field.StrikePrice());
	}

	public boolean isSet(quickfix.field.StrikePrice field) {
		return isSetField(field);
	}

	public boolean isSetStrikePrice() {
		return isSetField(202);
	}

	public void set(quickfix.field.StrikeCurrency value) {
		setField(value);
	}

	public quickfix.field.StrikeCurrency get(quickfix.field.StrikeCurrency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.StrikeCurrency getStrikeCurrency() throws FieldNotFound {
		return get(new quickfix.field.StrikeCurrency());
	}

	public boolean isSet(quickfix.field.StrikeCurrency field) {
		return isSetField(field);
	}

	public boolean isSetStrikeCurrency() {
		return isSetField(947);
	}

	public void set(quickfix.field.StrikeMultiplier value) {
		setField(value);
	}

	public quickfix.field.StrikeMultiplier get(quickfix.field.StrikeMultiplier value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.StrikeMultiplier getStrikeMultiplier() throws FieldNotFound {
		return get(new quickfix.field.StrikeMultiplier());
	}

	public boolean isSet(quickfix.field.StrikeMultiplier field) {
		return isSetField(field);
	}

	public boolean isSetStrikeMultiplier() {
		return isSetField(967);
	}

	public void set(quickfix.field.StrikeValue value) {
		setField(value);
	}

	public quickfix.field.StrikeValue get(quickfix.field.StrikeValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.StrikeValue getStrikeValue() throws FieldNotFound {
		return get(new quickfix.field.StrikeValue());
	}

	public boolean isSet(quickfix.field.StrikeValue field) {
		return isSetField(field);
	}

	public boolean isSetStrikeValue() {
		return isSetField(968);
	}

	public void set(quickfix.field.StrikePriceDeterminationMethod value) {
		setField(value);
	}

	public quickfix.field.StrikePriceDeterminationMethod get(quickfix.field.StrikePriceDeterminationMethod value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.StrikePriceDeterminationMethod getStrikePriceDeterminationMethod() throws FieldNotFound {
		return get(new quickfix.field.StrikePriceDeterminationMethod());
	}

	public boolean isSet(quickfix.field.StrikePriceDeterminationMethod field) {
		return isSetField(field);
	}

	public boolean isSetStrikePriceDeterminationMethod() {
		return isSetField(1478);
	}

	public void set(quickfix.field.StrikePriceBoundaryMethod value) {
		setField(value);
	}

	public quickfix.field.StrikePriceBoundaryMethod get(quickfix.field.StrikePriceBoundaryMethod value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.StrikePriceBoundaryMethod getStrikePriceBoundaryMethod() throws FieldNotFound {
		return get(new quickfix.field.StrikePriceBoundaryMethod());
	}

	public boolean isSet(quickfix.field.StrikePriceBoundaryMethod field) {
		return isSetField(field);
	}

	public boolean isSetStrikePriceBoundaryMethod() {
		return isSetField(1479);
	}

	public void set(quickfix.field.StrikePriceBoundaryPrecision value) {
		setField(value);
	}

	public quickfix.field.StrikePriceBoundaryPrecision get(quickfix.field.StrikePriceBoundaryPrecision value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.StrikePriceBoundaryPrecision getStrikePriceBoundaryPrecision() throws FieldNotFound {
		return get(new quickfix.field.StrikePriceBoundaryPrecision());
	}

	public boolean isSet(quickfix.field.StrikePriceBoundaryPrecision field) {
		return isSetField(field);
	}

	public boolean isSetStrikePriceBoundaryPrecision() {
		return isSetField(1480);
	}

	public void set(quickfix.field.UnderlyingPriceDeterminationMethod value) {
		setField(value);
	}

	public quickfix.field.UnderlyingPriceDeterminationMethod get(quickfix.field.UnderlyingPriceDeterminationMethod value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingPriceDeterminationMethod getUnderlyingPriceDeterminationMethod() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingPriceDeterminationMethod());
	}

	public boolean isSet(quickfix.field.UnderlyingPriceDeterminationMethod field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingPriceDeterminationMethod() {
		return isSetField(1481);
	}

	public void set(quickfix.field.OptAttribute value) {
		setField(value);
	}

	public quickfix.field.OptAttribute get(quickfix.field.OptAttribute value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.OptAttribute getOptAttribute() throws FieldNotFound {
		return get(new quickfix.field.OptAttribute());
	}

	public boolean isSet(quickfix.field.OptAttribute field) {
		return isSetField(field);
	}

	public boolean isSetOptAttribute() {
		return isSetField(206);
	}

	public void set(quickfix.field.ContractMultiplier value) {
		setField(value);
	}

	public quickfix.field.ContractMultiplier get(quickfix.field.ContractMultiplier value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ContractMultiplier getContractMultiplier() throws FieldNotFound {
		return get(new quickfix.field.ContractMultiplier());
	}

	public boolean isSet(quickfix.field.ContractMultiplier field) {
		return isSetField(field);
	}

	public boolean isSetContractMultiplier() {
		return isSetField(231);
	}

	public void set(quickfix.field.ContractMultiplierUnit value) {
		setField(value);
	}

	public quickfix.field.ContractMultiplierUnit get(quickfix.field.ContractMultiplierUnit value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ContractMultiplierUnit getContractMultiplierUnit() throws FieldNotFound {
		return get(new quickfix.field.ContractMultiplierUnit());
	}

	public boolean isSet(quickfix.field.ContractMultiplierUnit field) {
		return isSetField(field);
	}

	public boolean isSetContractMultiplierUnit() {
		return isSetField(1435);
	}

	public void set(quickfix.field.FlowScheduleType value) {
		setField(value);
	}

	public quickfix.field.FlowScheduleType get(quickfix.field.FlowScheduleType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.FlowScheduleType getFlowScheduleType() throws FieldNotFound {
		return get(new quickfix.field.FlowScheduleType());
	}

	public boolean isSet(quickfix.field.FlowScheduleType field) {
		return isSetField(field);
	}

	public boolean isSetFlowScheduleType() {
		return isSetField(1439);
	}

	public void set(quickfix.field.MinPriceIncrement value) {
		setField(value);
	}

	public quickfix.field.MinPriceIncrement get(quickfix.field.MinPriceIncrement value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MinPriceIncrement getMinPriceIncrement() throws FieldNotFound {
		return get(new quickfix.field.MinPriceIncrement());
	}

	public boolean isSet(quickfix.field.MinPriceIncrement field) {
		return isSetField(field);
	}

	public boolean isSetMinPriceIncrement() {
		return isSetField(969);
	}

	public void set(quickfix.field.MinPriceIncrementAmount value) {
		setField(value);
	}

	public quickfix.field.MinPriceIncrementAmount get(quickfix.field.MinPriceIncrementAmount value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MinPriceIncrementAmount getMinPriceIncrementAmount() throws FieldNotFound {
		return get(new quickfix.field.MinPriceIncrementAmount());
	}

	public boolean isSet(quickfix.field.MinPriceIncrementAmount field) {
		return isSetField(field);
	}

	public boolean isSetMinPriceIncrementAmount() {
		return isSetField(1146);
	}

	public void set(quickfix.field.UnitOfMeasure value) {
		setField(value);
	}

	public quickfix.field.UnitOfMeasure get(quickfix.field.UnitOfMeasure value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnitOfMeasure getUnitOfMeasure() throws FieldNotFound {
		return get(new quickfix.field.UnitOfMeasure());
	}

	public boolean isSet(quickfix.field.UnitOfMeasure field) {
		return isSetField(field);
	}

	public boolean isSetUnitOfMeasure() {
		return isSetField(996);
	}

	public void set(quickfix.field.UnitOfMeasureQty value) {
		setField(value);
	}

	public quickfix.field.UnitOfMeasureQty get(quickfix.field.UnitOfMeasureQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnitOfMeasureQty getUnitOfMeasureQty() throws FieldNotFound {
		return get(new quickfix.field.UnitOfMeasureQty());
	}

	public boolean isSet(quickfix.field.UnitOfMeasureQty field) {
		return isSetField(field);
	}

	public boolean isSetUnitOfMeasureQty() {
		return isSetField(1147);
	}

	public void set(quickfix.field.PriceUnitOfMeasure value) {
		setField(value);
	}

	public quickfix.field.PriceUnitOfMeasure get(quickfix.field.PriceUnitOfMeasure value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PriceUnitOfMeasure getPriceUnitOfMeasure() throws FieldNotFound {
		return get(new quickfix.field.PriceUnitOfMeasure());
	}

	public boolean isSet(quickfix.field.PriceUnitOfMeasure field) {
		return isSetField(field);
	}

	public boolean isSetPriceUnitOfMeasure() {
		return isSetField(1191);
	}

	public void set(quickfix.field.PriceUnitOfMeasureQty value) {
		setField(value);
	}

	public quickfix.field.PriceUnitOfMeasureQty get(quickfix.field.PriceUnitOfMeasureQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PriceUnitOfMeasureQty getPriceUnitOfMeasureQty() throws FieldNotFound {
		return get(new quickfix.field.PriceUnitOfMeasureQty());
	}

	public boolean isSet(quickfix.field.PriceUnitOfMeasureQty field) {
		return isSetField(field);
	}

	public boolean isSetPriceUnitOfMeasureQty() {
		return isSetField(1192);
	}

	public void set(quickfix.field.SettlMethod value) {
		setField(value);
	}

	public quickfix.field.SettlMethod get(quickfix.field.SettlMethod value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SettlMethod getSettlMethod() throws FieldNotFound {
		return get(new quickfix.field.SettlMethod());
	}

	public boolean isSet(quickfix.field.SettlMethod field) {
		return isSetField(field);
	}

	public boolean isSetSettlMethod() {
		return isSetField(1193);
	}

	public void set(quickfix.field.ExerciseStyle value) {
		setField(value);
	}

	public quickfix.field.ExerciseStyle get(quickfix.field.ExerciseStyle value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ExerciseStyle getExerciseStyle() throws FieldNotFound {
		return get(new quickfix.field.ExerciseStyle());
	}

	public boolean isSet(quickfix.field.ExerciseStyle field) {
		return isSetField(field);
	}

	public boolean isSetExerciseStyle() {
		return isSetField(1194);
	}

	public void set(quickfix.field.OptPayoutType value) {
		setField(value);
	}

	public quickfix.field.OptPayoutType get(quickfix.field.OptPayoutType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.OptPayoutType getOptPayoutType() throws FieldNotFound {
		return get(new quickfix.field.OptPayoutType());
	}

	public boolean isSet(quickfix.field.OptPayoutType field) {
		return isSetField(field);
	}

	public boolean isSetOptPayoutType() {
		return isSetField(1482);
	}

	public void set(quickfix.field.OptPayoutAmount value) {
		setField(value);
	}

	public quickfix.field.OptPayoutAmount get(quickfix.field.OptPayoutAmount value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.OptPayoutAmount getOptPayoutAmount() throws FieldNotFound {
		return get(new quickfix.field.OptPayoutAmount());
	}

	public boolean isSet(quickfix.field.OptPayoutAmount field) {
		return isSetField(field);
	}

	public boolean isSetOptPayoutAmount() {
		return isSetField(1195);
	}

	public void set(quickfix.field.PriceQuoteMethod value) {
		setField(value);
	}

	public quickfix.field.PriceQuoteMethod get(quickfix.field.PriceQuoteMethod value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PriceQuoteMethod getPriceQuoteMethod() throws FieldNotFound {
		return get(new quickfix.field.PriceQuoteMethod());
	}

	public boolean isSet(quickfix.field.PriceQuoteMethod field) {
		return isSetField(field);
	}

	public boolean isSetPriceQuoteMethod() {
		return isSetField(1196);
	}

	public void set(quickfix.field.ValuationMethod value) {
		setField(value);
	}

	public quickfix.field.ValuationMethod get(quickfix.field.ValuationMethod value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ValuationMethod getValuationMethod() throws FieldNotFound {
		return get(new quickfix.field.ValuationMethod());
	}

	public boolean isSet(quickfix.field.ValuationMethod field) {
		return isSetField(field);
	}

	public boolean isSetValuationMethod() {
		return isSetField(1197);
	}

	public void set(quickfix.field.ListMethod value) {
		setField(value);
	}

	public quickfix.field.ListMethod get(quickfix.field.ListMethod value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ListMethod getListMethod() throws FieldNotFound {
		return get(new quickfix.field.ListMethod());
	}

	public boolean isSet(quickfix.field.ListMethod field) {
		return isSetField(field);
	}

	public boolean isSetListMethod() {
		return isSetField(1198);
	}

	public void set(quickfix.field.CapPrice value) {
		setField(value);
	}

	public quickfix.field.CapPrice get(quickfix.field.CapPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.CapPrice getCapPrice() throws FieldNotFound {
		return get(new quickfix.field.CapPrice());
	}

	public boolean isSet(quickfix.field.CapPrice field) {
		return isSetField(field);
	}

	public boolean isSetCapPrice() {
		return isSetField(1199);
	}

	public void set(quickfix.field.FloorPrice value) {
		setField(value);
	}

	public quickfix.field.FloorPrice get(quickfix.field.FloorPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.FloorPrice getFloorPrice() throws FieldNotFound {
		return get(new quickfix.field.FloorPrice());
	}

	public boolean isSet(quickfix.field.FloorPrice field) {
		return isSetField(field);
	}

	public boolean isSetFloorPrice() {
		return isSetField(1200);
	}

	public void set(quickfix.field.PutOrCall value) {
		setField(value);
	}

	public quickfix.field.PutOrCall get(quickfix.field.PutOrCall value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PutOrCall getPutOrCall() throws FieldNotFound {
		return get(new quickfix.field.PutOrCall());
	}

	public boolean isSet(quickfix.field.PutOrCall field) {
		return isSetField(field);
	}

	public boolean isSetPutOrCall() {
		return isSetField(201);
	}

	public void set(quickfix.field.FlexibleIndicator value) {
		setField(value);
	}

	public quickfix.field.FlexibleIndicator get(quickfix.field.FlexibleIndicator value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.FlexibleIndicator getFlexibleIndicator() throws FieldNotFound {
		return get(new quickfix.field.FlexibleIndicator());
	}

	public boolean isSet(quickfix.field.FlexibleIndicator field) {
		return isSetField(field);
	}

	public boolean isSetFlexibleIndicator() {
		return isSetField(1244);
	}

	public void set(quickfix.field.FlexProductEligibilityIndicator value) {
		setField(value);
	}

	public quickfix.field.FlexProductEligibilityIndicator get(quickfix.field.FlexProductEligibilityIndicator value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.FlexProductEligibilityIndicator getFlexProductEligibilityIndicator() throws FieldNotFound {
		return get(new quickfix.field.FlexProductEligibilityIndicator());
	}

	public boolean isSet(quickfix.field.FlexProductEligibilityIndicator field) {
		return isSetField(field);
	}

	public boolean isSetFlexProductEligibilityIndicator() {
		return isSetField(1242);
	}

	public void set(quickfix.field.TimeUnit value) {
		setField(value);
	}

	public quickfix.field.TimeUnit get(quickfix.field.TimeUnit value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TimeUnit getTimeUnit() throws FieldNotFound {
		return get(new quickfix.field.TimeUnit());
	}

	public boolean isSet(quickfix.field.TimeUnit field) {
		return isSetField(field);
	}

	public boolean isSetTimeUnit() {
		return isSetField(997);
	}

	public void set(quickfix.field.CouponRate value) {
		setField(value);
	}

	public quickfix.field.CouponRate get(quickfix.field.CouponRate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.CouponRate getCouponRate() throws FieldNotFound {
		return get(new quickfix.field.CouponRate());
	}

	public boolean isSet(quickfix.field.CouponRate field) {
		return isSetField(field);
	}

	public boolean isSetCouponRate() {
		return isSetField(223);
	}

	public void set(quickfix.field.SecurityExchange value) {
		setField(value);
	}

	public quickfix.field.SecurityExchange get(quickfix.field.SecurityExchange value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SecurityExchange getSecurityExchange() throws FieldNotFound {
		return get(new quickfix.field.SecurityExchange());
	}

	public boolean isSet(quickfix.field.SecurityExchange field) {
		return isSetField(field);
	}

	public boolean isSetSecurityExchange() {
		return isSetField(207);
	}

	public void set(quickfix.field.PositionLimit value) {
		setField(value);
	}

	public quickfix.field.PositionLimit get(quickfix.field.PositionLimit value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PositionLimit getPositionLimit() throws FieldNotFound {
		return get(new quickfix.field.PositionLimit());
	}

	public boolean isSet(quickfix.field.PositionLimit field) {
		return isSetField(field);
	}

	public boolean isSetPositionLimit() {
		return isSetField(970);
	}

	public void set(quickfix.field.NTPositionLimit value) {
		setField(value);
	}

	public quickfix.field.NTPositionLimit get(quickfix.field.NTPositionLimit value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NTPositionLimit getNTPositionLimit() throws FieldNotFound {
		return get(new quickfix.field.NTPositionLimit());
	}

	public boolean isSet(quickfix.field.NTPositionLimit field) {
		return isSetField(field);
	}

	public boolean isSetNTPositionLimit() {
		return isSetField(971);
	}

	public void set(quickfix.field.Issuer value) {
		setField(value);
	}

	public quickfix.field.Issuer get(quickfix.field.Issuer value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Issuer getIssuer() throws FieldNotFound {
		return get(new quickfix.field.Issuer());
	}

	public boolean isSet(quickfix.field.Issuer field) {
		return isSetField(field);
	}

	public boolean isSetIssuer() {
		return isSetField(106);
	}

	public void set(quickfix.field.EncodedIssuerLen value) {
		setField(value);
	}

	public quickfix.field.EncodedIssuerLen get(quickfix.field.EncodedIssuerLen value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EncodedIssuerLen getEncodedIssuerLen() throws FieldNotFound {
		return get(new quickfix.field.EncodedIssuerLen());
	}

	public boolean isSet(quickfix.field.EncodedIssuerLen field) {
		return isSetField(field);
	}

	public boolean isSetEncodedIssuerLen() {
		return isSetField(348);
	}

	public void set(quickfix.field.EncodedIssuer value) {
		setField(value);
	}

	public quickfix.field.EncodedIssuer get(quickfix.field.EncodedIssuer value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EncodedIssuer getEncodedIssuer() throws FieldNotFound {
		return get(new quickfix.field.EncodedIssuer());
	}

	public boolean isSet(quickfix.field.EncodedIssuer field) {
		return isSetField(field);
	}

	public boolean isSetEncodedIssuer() {
		return isSetField(349);
	}

	public void set(quickfix.field.SecurityDesc value) {
		setField(value);
	}

	public quickfix.field.SecurityDesc get(quickfix.field.SecurityDesc value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SecurityDesc getSecurityDesc() throws FieldNotFound {
		return get(new quickfix.field.SecurityDesc());
	}

	public boolean isSet(quickfix.field.SecurityDesc field) {
		return isSetField(field);
	}

	public boolean isSetSecurityDesc() {
		return isSetField(107);
	}

	public void set(quickfix.field.EncodedSecurityDescLen value) {
		setField(value);
	}

	public quickfix.field.EncodedSecurityDescLen get(quickfix.field.EncodedSecurityDescLen value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EncodedSecurityDescLen getEncodedSecurityDescLen() throws FieldNotFound {
		return get(new quickfix.field.EncodedSecurityDescLen());
	}

	public boolean isSet(quickfix.field.EncodedSecurityDescLen field) {
		return isSetField(field);
	}

	public boolean isSetEncodedSecurityDescLen() {
		return isSetField(350);
	}

	public void set(quickfix.field.EncodedSecurityDesc value) {
		setField(value);
	}

	public quickfix.field.EncodedSecurityDesc get(quickfix.field.EncodedSecurityDesc value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EncodedSecurityDesc getEncodedSecurityDesc() throws FieldNotFound {
		return get(new quickfix.field.EncodedSecurityDesc());
	}

	public boolean isSet(quickfix.field.EncodedSecurityDesc field) {
		return isSetField(field);
	}

	public boolean isSetEncodedSecurityDesc() {
		return isSetField(351);
	}

	public void set(quickfix.fix50sp2.component.SecurityXML component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.SecurityXML get(quickfix.fix50sp2.component.SecurityXML component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.SecurityXML getSecurityXML() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.SecurityXML());
	}

	public void set(quickfix.field.SecurityXMLLen value) {
		setField(value);
	}

	public quickfix.field.SecurityXMLLen get(quickfix.field.SecurityXMLLen value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SecurityXMLLen getSecurityXMLLen() throws FieldNotFound {
		return get(new quickfix.field.SecurityXMLLen());
	}

	public boolean isSet(quickfix.field.SecurityXMLLen field) {
		return isSetField(field);
	}

	public boolean isSetSecurityXMLLen() {
		return isSetField(1184);
	}

	public void set(quickfix.field.SecurityXMLData value) {
		setField(value);
	}

	public quickfix.field.SecurityXMLData get(quickfix.field.SecurityXMLData value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SecurityXMLData getSecurityXMLData() throws FieldNotFound {
		return get(new quickfix.field.SecurityXMLData());
	}

	public boolean isSet(quickfix.field.SecurityXMLData field) {
		return isSetField(field);
	}

	public boolean isSetSecurityXMLData() {
		return isSetField(1185);
	}

	public void set(quickfix.field.SecurityXMLSchema value) {
		setField(value);
	}

	public quickfix.field.SecurityXMLSchema get(quickfix.field.SecurityXMLSchema value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SecurityXMLSchema getSecurityXMLSchema() throws FieldNotFound {
		return get(new quickfix.field.SecurityXMLSchema());
	}

	public boolean isSet(quickfix.field.SecurityXMLSchema field) {
		return isSetField(field);
	}

	public boolean isSetSecurityXMLSchema() {
		return isSetField(1186);
	}

	public void set(quickfix.field.Pool value) {
		setField(value);
	}

	public quickfix.field.Pool get(quickfix.field.Pool value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Pool getPool() throws FieldNotFound {
		return get(new quickfix.field.Pool());
	}

	public boolean isSet(quickfix.field.Pool field) {
		return isSetField(field);
	}

	public boolean isSetPool() {
		return isSetField(691);
	}

	public void set(quickfix.field.ContractSettlMonth value) {
		setField(value);
	}

	public quickfix.field.ContractSettlMonth get(quickfix.field.ContractSettlMonth value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ContractSettlMonth getContractSettlMonth() throws FieldNotFound {
		return get(new quickfix.field.ContractSettlMonth());
	}

	public boolean isSet(quickfix.field.ContractSettlMonth field) {
		return isSetField(field);
	}

	public boolean isSetContractSettlMonth() {
		return isSetField(667);
	}

	public void set(quickfix.field.CPProgram value) {
		setField(value);
	}

	public quickfix.field.CPProgram get(quickfix.field.CPProgram value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.CPProgram getCPProgram() throws FieldNotFound {
		return get(new quickfix.field.CPProgram());
	}

	public boolean isSet(quickfix.field.CPProgram field) {
		return isSetField(field);
	}

	public boolean isSetCPProgram() {
		return isSetField(875);
	}

	public void set(quickfix.field.CPRegType value) {
		setField(value);
	}

	public quickfix.field.CPRegType get(quickfix.field.CPRegType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.CPRegType getCPRegType() throws FieldNotFound {
		return get(new quickfix.field.CPRegType());
	}

	public boolean isSet(quickfix.field.CPRegType field) {
		return isSetField(field);
	}

	public boolean isSetCPRegType() {
		return isSetField(876);
	}

	public void set(quickfix.fix50sp2.component.EvntGrp component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.EvntGrp get(quickfix.fix50sp2.component.EvntGrp component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.EvntGrp getEvntGrp() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.EvntGrp());
	}

	public void set(quickfix.field.NoEvents value) {
		setField(value);
	}

	public quickfix.field.NoEvents get(quickfix.field.NoEvents value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoEvents getNoEvents() throws FieldNotFound {
		return get(new quickfix.field.NoEvents());
	}

	public boolean isSet(quickfix.field.NoEvents field) {
		return isSetField(field);
	}

	public boolean isSetNoEvents() {
		return isSetField(864);
	}

	public static class NoEvents extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {865, 866, 1145, 867, 868, 0};

		public NoEvents() {
			super(864, 865, ORDER);
		}
		
	public void set(quickfix.field.EventType value) {
		setField(value);
	}

	public quickfix.field.EventType get(quickfix.field.EventType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EventType getEventType() throws FieldNotFound {
		return get(new quickfix.field.EventType());
	}

	public boolean isSet(quickfix.field.EventType field) {
		return isSetField(field);
	}

	public boolean isSetEventType() {
		return isSetField(865);
	}

	public void set(quickfix.field.EventDate value) {
		setField(value);
	}

	public quickfix.field.EventDate get(quickfix.field.EventDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EventDate getEventDate() throws FieldNotFound {
		return get(new quickfix.field.EventDate());
	}

	public boolean isSet(quickfix.field.EventDate field) {
		return isSetField(field);
	}

	public boolean isSetEventDate() {
		return isSetField(866);
	}

	public void set(quickfix.field.EventTime value) {
		setField(value);
	}

	public quickfix.field.EventTime get(quickfix.field.EventTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EventTime getEventTime() throws FieldNotFound {
		return get(new quickfix.field.EventTime());
	}

	public boolean isSet(quickfix.field.EventTime field) {
		return isSetField(field);
	}

	public boolean isSetEventTime() {
		return isSetField(1145);
	}

	public void set(quickfix.field.EventPx value) {
		setField(value);
	}

	public quickfix.field.EventPx get(quickfix.field.EventPx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EventPx getEventPx() throws FieldNotFound {
		return get(new quickfix.field.EventPx());
	}

	public boolean isSet(quickfix.field.EventPx field) {
		return isSetField(field);
	}

	public boolean isSetEventPx() {
		return isSetField(867);
	}

	public void set(quickfix.field.EventText value) {
		setField(value);
	}

	public quickfix.field.EventText get(quickfix.field.EventText value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EventText getEventText() throws FieldNotFound {
		return get(new quickfix.field.EventText());
	}

	public boolean isSet(quickfix.field.EventText field) {
		return isSetField(field);
	}

	public boolean isSetEventText() {
		return isSetField(868);
	}

	}

	public void set(quickfix.field.DatedDate value) {
		setField(value);
	}

	public quickfix.field.DatedDate get(quickfix.field.DatedDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DatedDate getDatedDate() throws FieldNotFound {
		return get(new quickfix.field.DatedDate());
	}

	public boolean isSet(quickfix.field.DatedDate field) {
		return isSetField(field);
	}

	public boolean isSetDatedDate() {
		return isSetField(873);
	}

	public void set(quickfix.field.InterestAccrualDate value) {
		setField(value);
	}

	public quickfix.field.InterestAccrualDate get(quickfix.field.InterestAccrualDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.InterestAccrualDate getInterestAccrualDate() throws FieldNotFound {
		return get(new quickfix.field.InterestAccrualDate());
	}

	public boolean isSet(quickfix.field.InterestAccrualDate field) {
		return isSetField(field);
	}

	public boolean isSetInterestAccrualDate() {
		return isSetField(874);
	}

	public void set(quickfix.fix50sp2.component.InstrumentParties component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.InstrumentParties get(quickfix.fix50sp2.component.InstrumentParties component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.InstrumentParties getInstrumentParties() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.InstrumentParties());
	}

	public void set(quickfix.field.NoInstrumentParties value) {
		setField(value);
	}

	public quickfix.field.NoInstrumentParties get(quickfix.field.NoInstrumentParties value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoInstrumentParties getNoInstrumentParties() throws FieldNotFound {
		return get(new quickfix.field.NoInstrumentParties());
	}

	public boolean isSet(quickfix.field.NoInstrumentParties field) {
		return isSetField(field);
	}

	public boolean isSetNoInstrumentParties() {
		return isSetField(1018);
	}

	public static class NoInstrumentParties extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {1019, 1050, 1051, 1052, 0};

		public NoInstrumentParties() {
			super(1018, 1019, ORDER);
		}
		
	public void set(quickfix.field.InstrumentPartyID value) {
		setField(value);
	}

	public quickfix.field.InstrumentPartyID get(quickfix.field.InstrumentPartyID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.InstrumentPartyID getInstrumentPartyID() throws FieldNotFound {
		return get(new quickfix.field.InstrumentPartyID());
	}

	public boolean isSet(quickfix.field.InstrumentPartyID field) {
		return isSetField(field);
	}

	public boolean isSetInstrumentPartyID() {
		return isSetField(1019);
	}

	public void set(quickfix.field.InstrumentPartyIDSource value) {
		setField(value);
	}

	public quickfix.field.InstrumentPartyIDSource get(quickfix.field.InstrumentPartyIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.InstrumentPartyIDSource getInstrumentPartyIDSource() throws FieldNotFound {
		return get(new quickfix.field.InstrumentPartyIDSource());
	}

	public boolean isSet(quickfix.field.InstrumentPartyIDSource field) {
		return isSetField(field);
	}

	public boolean isSetInstrumentPartyIDSource() {
		return isSetField(1050);
	}

	public void set(quickfix.field.InstrumentPartyRole value) {
		setField(value);
	}

	public quickfix.field.InstrumentPartyRole get(quickfix.field.InstrumentPartyRole value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.InstrumentPartyRole getInstrumentPartyRole() throws FieldNotFound {
		return get(new quickfix.field.InstrumentPartyRole());
	}

	public boolean isSet(quickfix.field.InstrumentPartyRole field) {
		return isSetField(field);
	}

	public boolean isSetInstrumentPartyRole() {
		return isSetField(1051);
	}

	public void set(quickfix.fix50sp2.component.InstrumentPtysSubGrp component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.InstrumentPtysSubGrp get(quickfix.fix50sp2.component.InstrumentPtysSubGrp component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.InstrumentPtysSubGrp getInstrumentPtysSubGrp() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.InstrumentPtysSubGrp());
	}

	public void set(quickfix.field.NoInstrumentPartySubIDs value) {
		setField(value);
	}

	public quickfix.field.NoInstrumentPartySubIDs get(quickfix.field.NoInstrumentPartySubIDs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoInstrumentPartySubIDs getNoInstrumentPartySubIDs() throws FieldNotFound {
		return get(new quickfix.field.NoInstrumentPartySubIDs());
	}

	public boolean isSet(quickfix.field.NoInstrumentPartySubIDs field) {
		return isSetField(field);
	}

	public boolean isSetNoInstrumentPartySubIDs() {
		return isSetField(1052);
	}

	public static class NoInstrumentPartySubIDs extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {1053, 1054, 0};

		public NoInstrumentPartySubIDs() {
			super(1052, 1053, ORDER);
		}
		
	public void set(quickfix.field.InstrumentPartySubID value) {
		setField(value);
	}

	public quickfix.field.InstrumentPartySubID get(quickfix.field.InstrumentPartySubID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.InstrumentPartySubID getInstrumentPartySubID() throws FieldNotFound {
		return get(new quickfix.field.InstrumentPartySubID());
	}

	public boolean isSet(quickfix.field.InstrumentPartySubID field) {
		return isSetField(field);
	}

	public boolean isSetInstrumentPartySubID() {
		return isSetField(1053);
	}

	public void set(quickfix.field.InstrumentPartySubIDType value) {
		setField(value);
	}

	public quickfix.field.InstrumentPartySubIDType get(quickfix.field.InstrumentPartySubIDType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.InstrumentPartySubIDType getInstrumentPartySubIDType() throws FieldNotFound {
		return get(new quickfix.field.InstrumentPartySubIDType());
	}

	public boolean isSet(quickfix.field.InstrumentPartySubIDType field) {
		return isSetField(field);
	}

	public boolean isSetInstrumentPartySubIDType() {
		return isSetField(1054);
	}

	}

	}

	public void set(quickfix.fix50sp2.component.ComplexEvents component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.ComplexEvents get(quickfix.fix50sp2.component.ComplexEvents component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.ComplexEvents getComplexEvents() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.ComplexEvents());
	}

	public void set(quickfix.field.NoComplexEvents value) {
		setField(value);
	}

	public quickfix.field.NoComplexEvents get(quickfix.field.NoComplexEvents value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoComplexEvents getNoComplexEvents() throws FieldNotFound {
		return get(new quickfix.field.NoComplexEvents());
	}

	public boolean isSet(quickfix.field.NoComplexEvents field) {
		return isSetField(field);
	}

	public boolean isSetNoComplexEvents() {
		return isSetField(1483);
	}

	public static class NoComplexEvents extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {1484, 1485, 1486, 1487, 1488, 1489, 1490, 1491, 0};

		public NoComplexEvents() {
			super(1483, 1484, ORDER);
		}
		
	public void set(quickfix.field.ComplexEventType value) {
		setField(value);
	}

	public quickfix.field.ComplexEventType get(quickfix.field.ComplexEventType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ComplexEventType getComplexEventType() throws FieldNotFound {
		return get(new quickfix.field.ComplexEventType());
	}

	public boolean isSet(quickfix.field.ComplexEventType field) {
		return isSetField(field);
	}

	public boolean isSetComplexEventType() {
		return isSetField(1484);
	}

	public void set(quickfix.field.ComplexOptPayoutAmount value) {
		setField(value);
	}

	public quickfix.field.ComplexOptPayoutAmount get(quickfix.field.ComplexOptPayoutAmount value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ComplexOptPayoutAmount getComplexOptPayoutAmount() throws FieldNotFound {
		return get(new quickfix.field.ComplexOptPayoutAmount());
	}

	public boolean isSet(quickfix.field.ComplexOptPayoutAmount field) {
		return isSetField(field);
	}

	public boolean isSetComplexOptPayoutAmount() {
		return isSetField(1485);
	}

	public void set(quickfix.field.ComplexEventPrice value) {
		setField(value);
	}

	public quickfix.field.ComplexEventPrice get(quickfix.field.ComplexEventPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ComplexEventPrice getComplexEventPrice() throws FieldNotFound {
		return get(new quickfix.field.ComplexEventPrice());
	}

	public boolean isSet(quickfix.field.ComplexEventPrice field) {
		return isSetField(field);
	}

	public boolean isSetComplexEventPrice() {
		return isSetField(1486);
	}

	public void set(quickfix.field.ComplexEventPriceBoundaryMethod value) {
		setField(value);
	}

	public quickfix.field.ComplexEventPriceBoundaryMethod get(quickfix.field.ComplexEventPriceBoundaryMethod value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ComplexEventPriceBoundaryMethod getComplexEventPriceBoundaryMethod() throws FieldNotFound {
		return get(new quickfix.field.ComplexEventPriceBoundaryMethod());
	}

	public boolean isSet(quickfix.field.ComplexEventPriceBoundaryMethod field) {
		return isSetField(field);
	}

	public boolean isSetComplexEventPriceBoundaryMethod() {
		return isSetField(1487);
	}

	public void set(quickfix.field.ComplexEventPriceBoundaryPrecision value) {
		setField(value);
	}

	public quickfix.field.ComplexEventPriceBoundaryPrecision get(quickfix.field.ComplexEventPriceBoundaryPrecision value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ComplexEventPriceBoundaryPrecision getComplexEventPriceBoundaryPrecision() throws FieldNotFound {
		return get(new quickfix.field.ComplexEventPriceBoundaryPrecision());
	}

	public boolean isSet(quickfix.field.ComplexEventPriceBoundaryPrecision field) {
		return isSetField(field);
	}

	public boolean isSetComplexEventPriceBoundaryPrecision() {
		return isSetField(1488);
	}

	public void set(quickfix.field.ComplexEventPriceTimeType value) {
		setField(value);
	}

	public quickfix.field.ComplexEventPriceTimeType get(quickfix.field.ComplexEventPriceTimeType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ComplexEventPriceTimeType getComplexEventPriceTimeType() throws FieldNotFound {
		return get(new quickfix.field.ComplexEventPriceTimeType());
	}

	public boolean isSet(quickfix.field.ComplexEventPriceTimeType field) {
		return isSetField(field);
	}

	public boolean isSetComplexEventPriceTimeType() {
		return isSetField(1489);
	}

	public void set(quickfix.field.ComplexEventCondition value) {
		setField(value);
	}

	public quickfix.field.ComplexEventCondition get(quickfix.field.ComplexEventCondition value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ComplexEventCondition getComplexEventCondition() throws FieldNotFound {
		return get(new quickfix.field.ComplexEventCondition());
	}

	public boolean isSet(quickfix.field.ComplexEventCondition field) {
		return isSetField(field);
	}

	public boolean isSetComplexEventCondition() {
		return isSetField(1490);
	}

	public void set(quickfix.fix50sp2.component.ComplexEventDates component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.ComplexEventDates get(quickfix.fix50sp2.component.ComplexEventDates component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.ComplexEventDates getComplexEventDates() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.ComplexEventDates());
	}

	public void set(quickfix.field.NoComplexEventDates value) {
		setField(value);
	}

	public quickfix.field.NoComplexEventDates get(quickfix.field.NoComplexEventDates value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoComplexEventDates getNoComplexEventDates() throws FieldNotFound {
		return get(new quickfix.field.NoComplexEventDates());
	}

	public boolean isSet(quickfix.field.NoComplexEventDates field) {
		return isSetField(field);
	}

	public boolean isSetNoComplexEventDates() {
		return isSetField(1491);
	}

	public static class NoComplexEventDates extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {1492, 1493, 1494, 0};

		public NoComplexEventDates() {
			super(1491, 1492, ORDER);
		}
		
	public void set(quickfix.field.ComplexEventStartDate value) {
		setField(value);
	}

	public quickfix.field.ComplexEventStartDate get(quickfix.field.ComplexEventStartDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ComplexEventStartDate getComplexEventStartDate() throws FieldNotFound {
		return get(new quickfix.field.ComplexEventStartDate());
	}

	public boolean isSet(quickfix.field.ComplexEventStartDate field) {
		return isSetField(field);
	}

	public boolean isSetComplexEventStartDate() {
		return isSetField(1492);
	}

	public void set(quickfix.field.ComplexEventEndDate value) {
		setField(value);
	}

	public quickfix.field.ComplexEventEndDate get(quickfix.field.ComplexEventEndDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ComplexEventEndDate getComplexEventEndDate() throws FieldNotFound {
		return get(new quickfix.field.ComplexEventEndDate());
	}

	public boolean isSet(quickfix.field.ComplexEventEndDate field) {
		return isSetField(field);
	}

	public boolean isSetComplexEventEndDate() {
		return isSetField(1493);
	}

	public void set(quickfix.fix50sp2.component.ComplexEventTimes component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.ComplexEventTimes get(quickfix.fix50sp2.component.ComplexEventTimes component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.ComplexEventTimes getComplexEventTimes() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.ComplexEventTimes());
	}

	public void set(quickfix.field.NoComplexEventTimes value) {
		setField(value);
	}

	public quickfix.field.NoComplexEventTimes get(quickfix.field.NoComplexEventTimes value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoComplexEventTimes getNoComplexEventTimes() throws FieldNotFound {
		return get(new quickfix.field.NoComplexEventTimes());
	}

	public boolean isSet(quickfix.field.NoComplexEventTimes field) {
		return isSetField(field);
	}

	public boolean isSetNoComplexEventTimes() {
		return isSetField(1494);
	}

	public static class NoComplexEventTimes extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {1495, 1496, 0};

		public NoComplexEventTimes() {
			super(1494, 1495, ORDER);
		}
		
	public void set(quickfix.field.ComplexEventStartTime value) {
		setField(value);
	}

	public quickfix.field.ComplexEventStartTime get(quickfix.field.ComplexEventStartTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ComplexEventStartTime getComplexEventStartTime() throws FieldNotFound {
		return get(new quickfix.field.ComplexEventStartTime());
	}

	public boolean isSet(quickfix.field.ComplexEventStartTime field) {
		return isSetField(field);
	}

	public boolean isSetComplexEventStartTime() {
		return isSetField(1495);
	}

	public void set(quickfix.field.ComplexEventEndTime value) {
		setField(value);
	}

	public quickfix.field.ComplexEventEndTime get(quickfix.field.ComplexEventEndTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ComplexEventEndTime getComplexEventEndTime() throws FieldNotFound {
		return get(new quickfix.field.ComplexEventEndTime());
	}

	public boolean isSet(quickfix.field.ComplexEventEndTime field) {
		return isSetField(field);
	}

	public boolean isSetComplexEventEndTime() {
		return isSetField(1496);
	}

	}

	}

	}

	public void set(quickfix.fix50sp2.component.FinancingDetails component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.FinancingDetails get(quickfix.fix50sp2.component.FinancingDetails component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.FinancingDetails getFinancingDetails() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.FinancingDetails());
	}

	public void set(quickfix.field.AgreementDesc value) {
		setField(value);
	}

	public quickfix.field.AgreementDesc get(quickfix.field.AgreementDesc value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.AgreementDesc getAgreementDesc() throws FieldNotFound {
		return get(new quickfix.field.AgreementDesc());
	}

	public boolean isSet(quickfix.field.AgreementDesc field) {
		return isSetField(field);
	}

	public boolean isSetAgreementDesc() {
		return isSetField(913);
	}

	public void set(quickfix.field.AgreementID value) {
		setField(value);
	}

	public quickfix.field.AgreementID get(quickfix.field.AgreementID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.AgreementID getAgreementID() throws FieldNotFound {
		return get(new quickfix.field.AgreementID());
	}

	public boolean isSet(quickfix.field.AgreementID field) {
		return isSetField(field);
	}

	public boolean isSetAgreementID() {
		return isSetField(914);
	}

	public void set(quickfix.field.AgreementDate value) {
		setField(value);
	}

	public quickfix.field.AgreementDate get(quickfix.field.AgreementDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.AgreementDate getAgreementDate() throws FieldNotFound {
		return get(new quickfix.field.AgreementDate());
	}

	public boolean isSet(quickfix.field.AgreementDate field) {
		return isSetField(field);
	}

	public boolean isSetAgreementDate() {
		return isSetField(915);
	}

	public void set(quickfix.field.AgreementCurrency value) {
		setField(value);
	}

	public quickfix.field.AgreementCurrency get(quickfix.field.AgreementCurrency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.AgreementCurrency getAgreementCurrency() throws FieldNotFound {
		return get(new quickfix.field.AgreementCurrency());
	}

	public boolean isSet(quickfix.field.AgreementCurrency field) {
		return isSetField(field);
	}

	public boolean isSetAgreementCurrency() {
		return isSetField(918);
	}

	public void set(quickfix.field.TerminationType value) {
		setField(value);
	}

	public quickfix.field.TerminationType get(quickfix.field.TerminationType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TerminationType getTerminationType() throws FieldNotFound {
		return get(new quickfix.field.TerminationType());
	}

	public boolean isSet(quickfix.field.TerminationType field) {
		return isSetField(field);
	}

	public boolean isSetTerminationType() {
		return isSetField(788);
	}

	public void set(quickfix.field.StartDate value) {
		setField(value);
	}

	public quickfix.field.StartDate get(quickfix.field.StartDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.StartDate getStartDate() throws FieldNotFound {
		return get(new quickfix.field.StartDate());
	}

	public boolean isSet(quickfix.field.StartDate field) {
		return isSetField(field);
	}

	public boolean isSetStartDate() {
		return isSetField(916);
	}

	public void set(quickfix.field.EndDate value) {
		setField(value);
	}

	public quickfix.field.EndDate get(quickfix.field.EndDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EndDate getEndDate() throws FieldNotFound {
		return get(new quickfix.field.EndDate());
	}

	public boolean isSet(quickfix.field.EndDate field) {
		return isSetField(field);
	}

	public boolean isSetEndDate() {
		return isSetField(917);
	}

	public void set(quickfix.field.DeliveryType value) {
		setField(value);
	}

	public quickfix.field.DeliveryType get(quickfix.field.DeliveryType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DeliveryType getDeliveryType() throws FieldNotFound {
		return get(new quickfix.field.DeliveryType());
	}

	public boolean isSet(quickfix.field.DeliveryType field) {
		return isSetField(field);
	}

	public boolean isSetDeliveryType() {
		return isSetField(919);
	}

	public void set(quickfix.field.MarginRatio value) {
		setField(value);
	}

	public quickfix.field.MarginRatio get(quickfix.field.MarginRatio value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MarginRatio getMarginRatio() throws FieldNotFound {
		return get(new quickfix.field.MarginRatio());
	}

	public boolean isSet(quickfix.field.MarginRatio field) {
		return isSetField(field);
	}

	public boolean isSetMarginRatio() {
		return isSetField(898);
	}

	public void set(quickfix.fix50sp2.component.UndInstrmtGrp component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.UndInstrmtGrp get(quickfix.fix50sp2.component.UndInstrmtGrp component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.UndInstrmtGrp getUndInstrmtGrp() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.UndInstrmtGrp());
	}

	public void set(quickfix.field.NoUnderlyings value) {
		setField(value);
	}

	public quickfix.field.NoUnderlyings get(quickfix.field.NoUnderlyings value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoUnderlyings getNoUnderlyings() throws FieldNotFound {
		return get(new quickfix.field.NoUnderlyings());
	}

	public boolean isSet(quickfix.field.NoUnderlyings field) {
		return isSetField(field);
	}

	public boolean isSetNoUnderlyings() {
		return isSetField(711);
	}

	public static class NoUnderlyings extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {311, 312, 309, 305, 457, 462, 463, 310, 763, 313, 542, 1213, 241, 1453, 1454, 1455, 1456, 1459, 1460, 242, 243, 244, 245, 246, 256, 595, 592, 593, 594, 247, 316, 941, 317, 436, 1437, 1441, 998, 1423, 1424, 1425, 1000, 1419, 435, 308, 306, 362, 363, 307, 364, 365, 877, 878, 972, 318, 879, 975, 973, 974, 810, 882, 883, 884, 885, 886, 887, 1044, 1045, 1046, 1038, 1058, 1039, 315, 0};

		public NoUnderlyings() {
			super(711, 311, ORDER);
		}
		
	public void set(quickfix.fix50sp2.component.UnderlyingInstrument component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.UnderlyingInstrument get(quickfix.fix50sp2.component.UnderlyingInstrument component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.UnderlyingInstrument getUnderlyingInstrument() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.UnderlyingInstrument());
	}

	public void set(quickfix.field.UnderlyingSymbol value) {
		setField(value);
	}

	public quickfix.field.UnderlyingSymbol get(quickfix.field.UnderlyingSymbol value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingSymbol getUnderlyingSymbol() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingSymbol());
	}

	public boolean isSet(quickfix.field.UnderlyingSymbol field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingSymbol() {
		return isSetField(311);
	}

	public void set(quickfix.field.UnderlyingSymbolSfx value) {
		setField(value);
	}

	public quickfix.field.UnderlyingSymbolSfx get(quickfix.field.UnderlyingSymbolSfx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingSymbolSfx getUnderlyingSymbolSfx() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingSymbolSfx());
	}

	public boolean isSet(quickfix.field.UnderlyingSymbolSfx field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingSymbolSfx() {
		return isSetField(312);
	}

	public void set(quickfix.field.UnderlyingSecurityID value) {
		setField(value);
	}

	public quickfix.field.UnderlyingSecurityID get(quickfix.field.UnderlyingSecurityID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingSecurityID getUnderlyingSecurityID() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingSecurityID());
	}

	public boolean isSet(quickfix.field.UnderlyingSecurityID field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingSecurityID() {
		return isSetField(309);
	}

	public void set(quickfix.field.UnderlyingSecurityIDSource value) {
		setField(value);
	}

	public quickfix.field.UnderlyingSecurityIDSource get(quickfix.field.UnderlyingSecurityIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingSecurityIDSource getUnderlyingSecurityIDSource() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingSecurityIDSource());
	}

	public boolean isSet(quickfix.field.UnderlyingSecurityIDSource field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingSecurityIDSource() {
		return isSetField(305);
	}

	public void set(quickfix.fix50sp2.component.UndSecAltIDGrp component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.UndSecAltIDGrp get(quickfix.fix50sp2.component.UndSecAltIDGrp component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.UndSecAltIDGrp getUndSecAltIDGrp() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.UndSecAltIDGrp());
	}

	public void set(quickfix.field.NoUnderlyingSecurityAltID value) {
		setField(value);
	}

	public quickfix.field.NoUnderlyingSecurityAltID get(quickfix.field.NoUnderlyingSecurityAltID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoUnderlyingSecurityAltID getNoUnderlyingSecurityAltID() throws FieldNotFound {
		return get(new quickfix.field.NoUnderlyingSecurityAltID());
	}

	public boolean isSet(quickfix.field.NoUnderlyingSecurityAltID field) {
		return isSetField(field);
	}

	public boolean isSetNoUnderlyingSecurityAltID() {
		return isSetField(457);
	}

	public static class NoUnderlyingSecurityAltID extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {458, 459, 0};

		public NoUnderlyingSecurityAltID() {
			super(457, 458, ORDER);
		}
		
	public void set(quickfix.field.UnderlyingSecurityAltID value) {
		setField(value);
	}

	public quickfix.field.UnderlyingSecurityAltID get(quickfix.field.UnderlyingSecurityAltID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingSecurityAltID getUnderlyingSecurityAltID() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingSecurityAltID());
	}

	public boolean isSet(quickfix.field.UnderlyingSecurityAltID field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingSecurityAltID() {
		return isSetField(458);
	}

	public void set(quickfix.field.UnderlyingSecurityAltIDSource value) {
		setField(value);
	}

	public quickfix.field.UnderlyingSecurityAltIDSource get(quickfix.field.UnderlyingSecurityAltIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingSecurityAltIDSource getUnderlyingSecurityAltIDSource() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingSecurityAltIDSource());
	}

	public boolean isSet(quickfix.field.UnderlyingSecurityAltIDSource field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingSecurityAltIDSource() {
		return isSetField(459);
	}

	}

	public void set(quickfix.field.UnderlyingProduct value) {
		setField(value);
	}

	public quickfix.field.UnderlyingProduct get(quickfix.field.UnderlyingProduct value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingProduct getUnderlyingProduct() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingProduct());
	}

	public boolean isSet(quickfix.field.UnderlyingProduct field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingProduct() {
		return isSetField(462);
	}

	public void set(quickfix.field.UnderlyingCFICode value) {
		setField(value);
	}

	public quickfix.field.UnderlyingCFICode get(quickfix.field.UnderlyingCFICode value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingCFICode getUnderlyingCFICode() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingCFICode());
	}

	public boolean isSet(quickfix.field.UnderlyingCFICode field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingCFICode() {
		return isSetField(463);
	}

	public void set(quickfix.field.UnderlyingSecurityType value) {
		setField(value);
	}

	public quickfix.field.UnderlyingSecurityType get(quickfix.field.UnderlyingSecurityType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingSecurityType getUnderlyingSecurityType() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingSecurityType());
	}

	public boolean isSet(quickfix.field.UnderlyingSecurityType field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingSecurityType() {
		return isSetField(310);
	}

	public void set(quickfix.field.UnderlyingSecuritySubType value) {
		setField(value);
	}

	public quickfix.field.UnderlyingSecuritySubType get(quickfix.field.UnderlyingSecuritySubType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingSecuritySubType getUnderlyingSecuritySubType() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingSecuritySubType());
	}

	public boolean isSet(quickfix.field.UnderlyingSecuritySubType field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingSecuritySubType() {
		return isSetField(763);
	}

	public void set(quickfix.field.UnderlyingMaturityMonthYear value) {
		setField(value);
	}

	public quickfix.field.UnderlyingMaturityMonthYear get(quickfix.field.UnderlyingMaturityMonthYear value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingMaturityMonthYear getUnderlyingMaturityMonthYear() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingMaturityMonthYear());
	}

	public boolean isSet(quickfix.field.UnderlyingMaturityMonthYear field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingMaturityMonthYear() {
		return isSetField(313);
	}

	public void set(quickfix.field.UnderlyingMaturityDate value) {
		setField(value);
	}

	public quickfix.field.UnderlyingMaturityDate get(quickfix.field.UnderlyingMaturityDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingMaturityDate getUnderlyingMaturityDate() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingMaturityDate());
	}

	public boolean isSet(quickfix.field.UnderlyingMaturityDate field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingMaturityDate() {
		return isSetField(542);
	}

	public void set(quickfix.field.UnderlyingMaturityTime value) {
		setField(value);
	}

	public quickfix.field.UnderlyingMaturityTime get(quickfix.field.UnderlyingMaturityTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingMaturityTime getUnderlyingMaturityTime() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingMaturityTime());
	}

	public boolean isSet(quickfix.field.UnderlyingMaturityTime field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingMaturityTime() {
		return isSetField(1213);
	}

	public void set(quickfix.field.UnderlyingCouponPaymentDate value) {
		setField(value);
	}

	public quickfix.field.UnderlyingCouponPaymentDate get(quickfix.field.UnderlyingCouponPaymentDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingCouponPaymentDate getUnderlyingCouponPaymentDate() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingCouponPaymentDate());
	}

	public boolean isSet(quickfix.field.UnderlyingCouponPaymentDate field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingCouponPaymentDate() {
		return isSetField(241);
	}

	public void set(quickfix.field.UnderlyingRestructuringType value) {
		setField(value);
	}

	public quickfix.field.UnderlyingRestructuringType get(quickfix.field.UnderlyingRestructuringType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingRestructuringType getUnderlyingRestructuringType() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingRestructuringType());
	}

	public boolean isSet(quickfix.field.UnderlyingRestructuringType field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingRestructuringType() {
		return isSetField(1453);
	}

	public void set(quickfix.field.UnderlyingSeniority value) {
		setField(value);
	}

	public quickfix.field.UnderlyingSeniority get(quickfix.field.UnderlyingSeniority value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingSeniority getUnderlyingSeniority() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingSeniority());
	}

	public boolean isSet(quickfix.field.UnderlyingSeniority field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingSeniority() {
		return isSetField(1454);
	}

	public void set(quickfix.field.UnderlyingNotionalPercentageOutstanding value) {
		setField(value);
	}

	public quickfix.field.UnderlyingNotionalPercentageOutstanding get(quickfix.field.UnderlyingNotionalPercentageOutstanding value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingNotionalPercentageOutstanding getUnderlyingNotionalPercentageOutstanding() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingNotionalPercentageOutstanding());
	}

	public boolean isSet(quickfix.field.UnderlyingNotionalPercentageOutstanding field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingNotionalPercentageOutstanding() {
		return isSetField(1455);
	}

	public void set(quickfix.field.UnderlyingOriginalNotionalPercentageOutstanding value) {
		setField(value);
	}

	public quickfix.field.UnderlyingOriginalNotionalPercentageOutstanding get(quickfix.field.UnderlyingOriginalNotionalPercentageOutstanding value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingOriginalNotionalPercentageOutstanding getUnderlyingOriginalNotionalPercentageOutstanding() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingOriginalNotionalPercentageOutstanding());
	}

	public boolean isSet(quickfix.field.UnderlyingOriginalNotionalPercentageOutstanding field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingOriginalNotionalPercentageOutstanding() {
		return isSetField(1456);
	}

	public void set(quickfix.field.UnderlyingAttachmentPoint value) {
		setField(value);
	}

	public quickfix.field.UnderlyingAttachmentPoint get(quickfix.field.UnderlyingAttachmentPoint value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingAttachmentPoint getUnderlyingAttachmentPoint() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingAttachmentPoint());
	}

	public boolean isSet(quickfix.field.UnderlyingAttachmentPoint field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingAttachmentPoint() {
		return isSetField(1459);
	}

	public void set(quickfix.field.UnderlyingDetachmentPoint value) {
		setField(value);
	}

	public quickfix.field.UnderlyingDetachmentPoint get(quickfix.field.UnderlyingDetachmentPoint value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingDetachmentPoint getUnderlyingDetachmentPoint() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingDetachmentPoint());
	}

	public boolean isSet(quickfix.field.UnderlyingDetachmentPoint field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingDetachmentPoint() {
		return isSetField(1460);
	}

	public void set(quickfix.field.UnderlyingIssueDate value) {
		setField(value);
	}

	public quickfix.field.UnderlyingIssueDate get(quickfix.field.UnderlyingIssueDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingIssueDate getUnderlyingIssueDate() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingIssueDate());
	}

	public boolean isSet(quickfix.field.UnderlyingIssueDate field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingIssueDate() {
		return isSetField(242);
	}

	public void set(quickfix.field.UnderlyingRepoCollateralSecurityType value) {
		setField(value);
	}

	public quickfix.field.UnderlyingRepoCollateralSecurityType get(quickfix.field.UnderlyingRepoCollateralSecurityType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingRepoCollateralSecurityType getUnderlyingRepoCollateralSecurityType() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingRepoCollateralSecurityType());
	}

	public boolean isSet(quickfix.field.UnderlyingRepoCollateralSecurityType field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingRepoCollateralSecurityType() {
		return isSetField(243);
	}

	public void set(quickfix.field.UnderlyingRepurchaseTerm value) {
		setField(value);
	}

	public quickfix.field.UnderlyingRepurchaseTerm get(quickfix.field.UnderlyingRepurchaseTerm value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingRepurchaseTerm getUnderlyingRepurchaseTerm() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingRepurchaseTerm());
	}

	public boolean isSet(quickfix.field.UnderlyingRepurchaseTerm field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingRepurchaseTerm() {
		return isSetField(244);
	}

	public void set(quickfix.field.UnderlyingRepurchaseRate value) {
		setField(value);
	}

	public quickfix.field.UnderlyingRepurchaseRate get(quickfix.field.UnderlyingRepurchaseRate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingRepurchaseRate getUnderlyingRepurchaseRate() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingRepurchaseRate());
	}

	public boolean isSet(quickfix.field.UnderlyingRepurchaseRate field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingRepurchaseRate() {
		return isSetField(245);
	}

	public void set(quickfix.field.UnderlyingFactor value) {
		setField(value);
	}

	public quickfix.field.UnderlyingFactor get(quickfix.field.UnderlyingFactor value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingFactor getUnderlyingFactor() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingFactor());
	}

	public boolean isSet(quickfix.field.UnderlyingFactor field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingFactor() {
		return isSetField(246);
	}

	public void set(quickfix.field.UnderlyingCreditRating value) {
		setField(value);
	}

	public quickfix.field.UnderlyingCreditRating get(quickfix.field.UnderlyingCreditRating value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingCreditRating getUnderlyingCreditRating() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingCreditRating());
	}

	public boolean isSet(quickfix.field.UnderlyingCreditRating field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingCreditRating() {
		return isSetField(256);
	}

	public void set(quickfix.field.UnderlyingInstrRegistry value) {
		setField(value);
	}

	public quickfix.field.UnderlyingInstrRegistry get(quickfix.field.UnderlyingInstrRegistry value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingInstrRegistry getUnderlyingInstrRegistry() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingInstrRegistry());
	}

	public boolean isSet(quickfix.field.UnderlyingInstrRegistry field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingInstrRegistry() {
		return isSetField(595);
	}

	public void set(quickfix.field.UnderlyingCountryOfIssue value) {
		setField(value);
	}

	public quickfix.field.UnderlyingCountryOfIssue get(quickfix.field.UnderlyingCountryOfIssue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingCountryOfIssue getUnderlyingCountryOfIssue() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingCountryOfIssue());
	}

	public boolean isSet(quickfix.field.UnderlyingCountryOfIssue field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingCountryOfIssue() {
		return isSetField(592);
	}

	public void set(quickfix.field.UnderlyingStateOrProvinceOfIssue value) {
		setField(value);
	}

	public quickfix.field.UnderlyingStateOrProvinceOfIssue get(quickfix.field.UnderlyingStateOrProvinceOfIssue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingStateOrProvinceOfIssue getUnderlyingStateOrProvinceOfIssue() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingStateOrProvinceOfIssue());
	}

	public boolean isSet(quickfix.field.UnderlyingStateOrProvinceOfIssue field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingStateOrProvinceOfIssue() {
		return isSetField(593);
	}

	public void set(quickfix.field.UnderlyingLocaleOfIssue value) {
		setField(value);
	}

	public quickfix.field.UnderlyingLocaleOfIssue get(quickfix.field.UnderlyingLocaleOfIssue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingLocaleOfIssue getUnderlyingLocaleOfIssue() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingLocaleOfIssue());
	}

	public boolean isSet(quickfix.field.UnderlyingLocaleOfIssue field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingLocaleOfIssue() {
		return isSetField(594);
	}

	public void set(quickfix.field.UnderlyingRedemptionDate value) {
		setField(value);
	}

	public quickfix.field.UnderlyingRedemptionDate get(quickfix.field.UnderlyingRedemptionDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingRedemptionDate getUnderlyingRedemptionDate() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingRedemptionDate());
	}

	public boolean isSet(quickfix.field.UnderlyingRedemptionDate field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingRedemptionDate() {
		return isSetField(247);
	}

	public void set(quickfix.field.UnderlyingStrikePrice value) {
		setField(value);
	}

	public quickfix.field.UnderlyingStrikePrice get(quickfix.field.UnderlyingStrikePrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingStrikePrice getUnderlyingStrikePrice() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingStrikePrice());
	}

	public boolean isSet(quickfix.field.UnderlyingStrikePrice field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingStrikePrice() {
		return isSetField(316);
	}

	public void set(quickfix.field.UnderlyingStrikeCurrency value) {
		setField(value);
	}

	public quickfix.field.UnderlyingStrikeCurrency get(quickfix.field.UnderlyingStrikeCurrency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingStrikeCurrency getUnderlyingStrikeCurrency() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingStrikeCurrency());
	}

	public boolean isSet(quickfix.field.UnderlyingStrikeCurrency field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingStrikeCurrency() {
		return isSetField(941);
	}

	public void set(quickfix.field.UnderlyingOptAttribute value) {
		setField(value);
	}

	public quickfix.field.UnderlyingOptAttribute get(quickfix.field.UnderlyingOptAttribute value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingOptAttribute getUnderlyingOptAttribute() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingOptAttribute());
	}

	public boolean isSet(quickfix.field.UnderlyingOptAttribute field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingOptAttribute() {
		return isSetField(317);
	}

	public void set(quickfix.field.UnderlyingContractMultiplier value) {
		setField(value);
	}

	public quickfix.field.UnderlyingContractMultiplier get(quickfix.field.UnderlyingContractMultiplier value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingContractMultiplier getUnderlyingContractMultiplier() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingContractMultiplier());
	}

	public boolean isSet(quickfix.field.UnderlyingContractMultiplier field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingContractMultiplier() {
		return isSetField(436);
	}

	public void set(quickfix.field.UnderlyingContractMultiplierUnit value) {
		setField(value);
	}

	public quickfix.field.UnderlyingContractMultiplierUnit get(quickfix.field.UnderlyingContractMultiplierUnit value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingContractMultiplierUnit getUnderlyingContractMultiplierUnit() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingContractMultiplierUnit());
	}

	public boolean isSet(quickfix.field.UnderlyingContractMultiplierUnit field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingContractMultiplierUnit() {
		return isSetField(1437);
	}

	public void set(quickfix.field.UnderlyingFlowScheduleType value) {
		setField(value);
	}

	public quickfix.field.UnderlyingFlowScheduleType get(quickfix.field.UnderlyingFlowScheduleType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingFlowScheduleType getUnderlyingFlowScheduleType() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingFlowScheduleType());
	}

	public boolean isSet(quickfix.field.UnderlyingFlowScheduleType field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingFlowScheduleType() {
		return isSetField(1441);
	}

	public void set(quickfix.field.UnderlyingUnitOfMeasure value) {
		setField(value);
	}

	public quickfix.field.UnderlyingUnitOfMeasure get(quickfix.field.UnderlyingUnitOfMeasure value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingUnitOfMeasure getUnderlyingUnitOfMeasure() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingUnitOfMeasure());
	}

	public boolean isSet(quickfix.field.UnderlyingUnitOfMeasure field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingUnitOfMeasure() {
		return isSetField(998);
	}

	public void set(quickfix.field.UnderlyingUnitOfMeasureQty value) {
		setField(value);
	}

	public quickfix.field.UnderlyingUnitOfMeasureQty get(quickfix.field.UnderlyingUnitOfMeasureQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingUnitOfMeasureQty getUnderlyingUnitOfMeasureQty() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingUnitOfMeasureQty());
	}

	public boolean isSet(quickfix.field.UnderlyingUnitOfMeasureQty field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingUnitOfMeasureQty() {
		return isSetField(1423);
	}

	public void set(quickfix.field.UnderlyingPriceUnitOfMeasure value) {
		setField(value);
	}

	public quickfix.field.UnderlyingPriceUnitOfMeasure get(quickfix.field.UnderlyingPriceUnitOfMeasure value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingPriceUnitOfMeasure getUnderlyingPriceUnitOfMeasure() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingPriceUnitOfMeasure());
	}

	public boolean isSet(quickfix.field.UnderlyingPriceUnitOfMeasure field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingPriceUnitOfMeasure() {
		return isSetField(1424);
	}

	public void set(quickfix.field.UnderlyingPriceUnitOfMeasureQty value) {
		setField(value);
	}

	public quickfix.field.UnderlyingPriceUnitOfMeasureQty get(quickfix.field.UnderlyingPriceUnitOfMeasureQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingPriceUnitOfMeasureQty getUnderlyingPriceUnitOfMeasureQty() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingPriceUnitOfMeasureQty());
	}

	public boolean isSet(quickfix.field.UnderlyingPriceUnitOfMeasureQty field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingPriceUnitOfMeasureQty() {
		return isSetField(1425);
	}

	public void set(quickfix.field.UnderlyingTimeUnit value) {
		setField(value);
	}

	public quickfix.field.UnderlyingTimeUnit get(quickfix.field.UnderlyingTimeUnit value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingTimeUnit getUnderlyingTimeUnit() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingTimeUnit());
	}

	public boolean isSet(quickfix.field.UnderlyingTimeUnit field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingTimeUnit() {
		return isSetField(1000);
	}

	public void set(quickfix.field.UnderlyingExerciseStyle value) {
		setField(value);
	}

	public quickfix.field.UnderlyingExerciseStyle get(quickfix.field.UnderlyingExerciseStyle value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingExerciseStyle getUnderlyingExerciseStyle() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingExerciseStyle());
	}

	public boolean isSet(quickfix.field.UnderlyingExerciseStyle field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingExerciseStyle() {
		return isSetField(1419);
	}

	public void set(quickfix.field.UnderlyingCouponRate value) {
		setField(value);
	}

	public quickfix.field.UnderlyingCouponRate get(quickfix.field.UnderlyingCouponRate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingCouponRate getUnderlyingCouponRate() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingCouponRate());
	}

	public boolean isSet(quickfix.field.UnderlyingCouponRate field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingCouponRate() {
		return isSetField(435);
	}

	public void set(quickfix.field.UnderlyingSecurityExchange value) {
		setField(value);
	}

	public quickfix.field.UnderlyingSecurityExchange get(quickfix.field.UnderlyingSecurityExchange value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingSecurityExchange getUnderlyingSecurityExchange() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingSecurityExchange());
	}

	public boolean isSet(quickfix.field.UnderlyingSecurityExchange field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingSecurityExchange() {
		return isSetField(308);
	}

	public void set(quickfix.field.UnderlyingIssuer value) {
		setField(value);
	}

	public quickfix.field.UnderlyingIssuer get(quickfix.field.UnderlyingIssuer value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingIssuer getUnderlyingIssuer() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingIssuer());
	}

	public boolean isSet(quickfix.field.UnderlyingIssuer field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingIssuer() {
		return isSetField(306);
	}

	public void set(quickfix.field.EncodedUnderlyingIssuerLen value) {
		setField(value);
	}

	public quickfix.field.EncodedUnderlyingIssuerLen get(quickfix.field.EncodedUnderlyingIssuerLen value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EncodedUnderlyingIssuerLen getEncodedUnderlyingIssuerLen() throws FieldNotFound {
		return get(new quickfix.field.EncodedUnderlyingIssuerLen());
	}

	public boolean isSet(quickfix.field.EncodedUnderlyingIssuerLen field) {
		return isSetField(field);
	}

	public boolean isSetEncodedUnderlyingIssuerLen() {
		return isSetField(362);
	}

	public void set(quickfix.field.EncodedUnderlyingIssuer value) {
		setField(value);
	}

	public quickfix.field.EncodedUnderlyingIssuer get(quickfix.field.EncodedUnderlyingIssuer value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EncodedUnderlyingIssuer getEncodedUnderlyingIssuer() throws FieldNotFound {
		return get(new quickfix.field.EncodedUnderlyingIssuer());
	}

	public boolean isSet(quickfix.field.EncodedUnderlyingIssuer field) {
		return isSetField(field);
	}

	public boolean isSetEncodedUnderlyingIssuer() {
		return isSetField(363);
	}

	public void set(quickfix.field.UnderlyingSecurityDesc value) {
		setField(value);
	}

	public quickfix.field.UnderlyingSecurityDesc get(quickfix.field.UnderlyingSecurityDesc value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingSecurityDesc getUnderlyingSecurityDesc() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingSecurityDesc());
	}

	public boolean isSet(quickfix.field.UnderlyingSecurityDesc field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingSecurityDesc() {
		return isSetField(307);
	}

	public void set(quickfix.field.EncodedUnderlyingSecurityDescLen value) {
		setField(value);
	}

	public quickfix.field.EncodedUnderlyingSecurityDescLen get(quickfix.field.EncodedUnderlyingSecurityDescLen value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EncodedUnderlyingSecurityDescLen getEncodedUnderlyingSecurityDescLen() throws FieldNotFound {
		return get(new quickfix.field.EncodedUnderlyingSecurityDescLen());
	}

	public boolean isSet(quickfix.field.EncodedUnderlyingSecurityDescLen field) {
		return isSetField(field);
	}

	public boolean isSetEncodedUnderlyingSecurityDescLen() {
		return isSetField(364);
	}

	public void set(quickfix.field.EncodedUnderlyingSecurityDesc value) {
		setField(value);
	}

	public quickfix.field.EncodedUnderlyingSecurityDesc get(quickfix.field.EncodedUnderlyingSecurityDesc value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EncodedUnderlyingSecurityDesc getEncodedUnderlyingSecurityDesc() throws FieldNotFound {
		return get(new quickfix.field.EncodedUnderlyingSecurityDesc());
	}

	public boolean isSet(quickfix.field.EncodedUnderlyingSecurityDesc field) {
		return isSetField(field);
	}

	public boolean isSetEncodedUnderlyingSecurityDesc() {
		return isSetField(365);
	}

	public void set(quickfix.field.UnderlyingCPProgram value) {
		setField(value);
	}

	public quickfix.field.UnderlyingCPProgram get(quickfix.field.UnderlyingCPProgram value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingCPProgram getUnderlyingCPProgram() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingCPProgram());
	}

	public boolean isSet(quickfix.field.UnderlyingCPProgram field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingCPProgram() {
		return isSetField(877);
	}

	public void set(quickfix.field.UnderlyingCPRegType value) {
		setField(value);
	}

	public quickfix.field.UnderlyingCPRegType get(quickfix.field.UnderlyingCPRegType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingCPRegType getUnderlyingCPRegType() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingCPRegType());
	}

	public boolean isSet(quickfix.field.UnderlyingCPRegType field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingCPRegType() {
		return isSetField(878);
	}

	public void set(quickfix.field.UnderlyingAllocationPercent value) {
		setField(value);
	}

	public quickfix.field.UnderlyingAllocationPercent get(quickfix.field.UnderlyingAllocationPercent value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingAllocationPercent getUnderlyingAllocationPercent() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingAllocationPercent());
	}

	public boolean isSet(quickfix.field.UnderlyingAllocationPercent field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingAllocationPercent() {
		return isSetField(972);
	}

	public void set(quickfix.field.UnderlyingCurrency value) {
		setField(value);
	}

	public quickfix.field.UnderlyingCurrency get(quickfix.field.UnderlyingCurrency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingCurrency getUnderlyingCurrency() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingCurrency());
	}

	public boolean isSet(quickfix.field.UnderlyingCurrency field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingCurrency() {
		return isSetField(318);
	}

	public void set(quickfix.field.UnderlyingQty value) {
		setField(value);
	}

	public quickfix.field.UnderlyingQty get(quickfix.field.UnderlyingQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingQty getUnderlyingQty() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingQty());
	}

	public boolean isSet(quickfix.field.UnderlyingQty field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingQty() {
		return isSetField(879);
	}

	public void set(quickfix.field.UnderlyingSettlementType value) {
		setField(value);
	}

	public quickfix.field.UnderlyingSettlementType get(quickfix.field.UnderlyingSettlementType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingSettlementType getUnderlyingSettlementType() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingSettlementType());
	}

	public boolean isSet(quickfix.field.UnderlyingSettlementType field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingSettlementType() {
		return isSetField(975);
	}

	public void set(quickfix.field.UnderlyingCashAmount value) {
		setField(value);
	}

	public quickfix.field.UnderlyingCashAmount get(quickfix.field.UnderlyingCashAmount value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingCashAmount getUnderlyingCashAmount() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingCashAmount());
	}

	public boolean isSet(quickfix.field.UnderlyingCashAmount field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingCashAmount() {
		return isSetField(973);
	}

	public void set(quickfix.field.UnderlyingCashType value) {
		setField(value);
	}

	public quickfix.field.UnderlyingCashType get(quickfix.field.UnderlyingCashType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingCashType getUnderlyingCashType() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingCashType());
	}

	public boolean isSet(quickfix.field.UnderlyingCashType field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingCashType() {
		return isSetField(974);
	}

	public void set(quickfix.field.UnderlyingPx value) {
		setField(value);
	}

	public quickfix.field.UnderlyingPx get(quickfix.field.UnderlyingPx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingPx getUnderlyingPx() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingPx());
	}

	public boolean isSet(quickfix.field.UnderlyingPx field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingPx() {
		return isSetField(810);
	}

	public void set(quickfix.field.UnderlyingDirtyPrice value) {
		setField(value);
	}

	public quickfix.field.UnderlyingDirtyPrice get(quickfix.field.UnderlyingDirtyPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingDirtyPrice getUnderlyingDirtyPrice() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingDirtyPrice());
	}

	public boolean isSet(quickfix.field.UnderlyingDirtyPrice field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingDirtyPrice() {
		return isSetField(882);
	}

	public void set(quickfix.field.UnderlyingEndPrice value) {
		setField(value);
	}

	public quickfix.field.UnderlyingEndPrice get(quickfix.field.UnderlyingEndPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingEndPrice getUnderlyingEndPrice() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingEndPrice());
	}

	public boolean isSet(quickfix.field.UnderlyingEndPrice field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingEndPrice() {
		return isSetField(883);
	}

	public void set(quickfix.field.UnderlyingStartValue value) {
		setField(value);
	}

	public quickfix.field.UnderlyingStartValue get(quickfix.field.UnderlyingStartValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingStartValue getUnderlyingStartValue() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingStartValue());
	}

	public boolean isSet(quickfix.field.UnderlyingStartValue field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingStartValue() {
		return isSetField(884);
	}

	public void set(quickfix.field.UnderlyingCurrentValue value) {
		setField(value);
	}

	public quickfix.field.UnderlyingCurrentValue get(quickfix.field.UnderlyingCurrentValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingCurrentValue getUnderlyingCurrentValue() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingCurrentValue());
	}

	public boolean isSet(quickfix.field.UnderlyingCurrentValue field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingCurrentValue() {
		return isSetField(885);
	}

	public void set(quickfix.field.UnderlyingEndValue value) {
		setField(value);
	}

	public quickfix.field.UnderlyingEndValue get(quickfix.field.UnderlyingEndValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingEndValue getUnderlyingEndValue() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingEndValue());
	}

	public boolean isSet(quickfix.field.UnderlyingEndValue field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingEndValue() {
		return isSetField(886);
	}

	public void set(quickfix.fix50sp2.component.UnderlyingStipulations component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.UnderlyingStipulations get(quickfix.fix50sp2.component.UnderlyingStipulations component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.UnderlyingStipulations getUnderlyingStipulations() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.UnderlyingStipulations());
	}

	public void set(quickfix.field.NoUnderlyingStips value) {
		setField(value);
	}

	public quickfix.field.NoUnderlyingStips get(quickfix.field.NoUnderlyingStips value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoUnderlyingStips getNoUnderlyingStips() throws FieldNotFound {
		return get(new quickfix.field.NoUnderlyingStips());
	}

	public boolean isSet(quickfix.field.NoUnderlyingStips field) {
		return isSetField(field);
	}

	public boolean isSetNoUnderlyingStips() {
		return isSetField(887);
	}

	public static class NoUnderlyingStips extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {888, 889, 0};

		public NoUnderlyingStips() {
			super(887, 888, ORDER);
		}
		
	public void set(quickfix.field.UnderlyingStipType value) {
		setField(value);
	}

	public quickfix.field.UnderlyingStipType get(quickfix.field.UnderlyingStipType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingStipType getUnderlyingStipType() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingStipType());
	}

	public boolean isSet(quickfix.field.UnderlyingStipType field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingStipType() {
		return isSetField(888);
	}

	public void set(quickfix.field.UnderlyingStipValue value) {
		setField(value);
	}

	public quickfix.field.UnderlyingStipValue get(quickfix.field.UnderlyingStipValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingStipValue getUnderlyingStipValue() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingStipValue());
	}

	public boolean isSet(quickfix.field.UnderlyingStipValue field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingStipValue() {
		return isSetField(889);
	}

	}

	public void set(quickfix.field.UnderlyingAdjustedQuantity value) {
		setField(value);
	}

	public quickfix.field.UnderlyingAdjustedQuantity get(quickfix.field.UnderlyingAdjustedQuantity value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingAdjustedQuantity getUnderlyingAdjustedQuantity() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingAdjustedQuantity());
	}

	public boolean isSet(quickfix.field.UnderlyingAdjustedQuantity field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingAdjustedQuantity() {
		return isSetField(1044);
	}

	public void set(quickfix.field.UnderlyingFXRate value) {
		setField(value);
	}

	public quickfix.field.UnderlyingFXRate get(quickfix.field.UnderlyingFXRate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingFXRate getUnderlyingFXRate() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingFXRate());
	}

	public boolean isSet(quickfix.field.UnderlyingFXRate field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingFXRate() {
		return isSetField(1045);
	}

	public void set(quickfix.field.UnderlyingFXRateCalc value) {
		setField(value);
	}

	public quickfix.field.UnderlyingFXRateCalc get(quickfix.field.UnderlyingFXRateCalc value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingFXRateCalc getUnderlyingFXRateCalc() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingFXRateCalc());
	}

	public boolean isSet(quickfix.field.UnderlyingFXRateCalc field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingFXRateCalc() {
		return isSetField(1046);
	}

	public void set(quickfix.field.UnderlyingCapValue value) {
		setField(value);
	}

	public quickfix.field.UnderlyingCapValue get(quickfix.field.UnderlyingCapValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingCapValue getUnderlyingCapValue() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingCapValue());
	}

	public boolean isSet(quickfix.field.UnderlyingCapValue field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingCapValue() {
		return isSetField(1038);
	}

	public void set(quickfix.fix50sp2.component.UndlyInstrumentParties component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.UndlyInstrumentParties get(quickfix.fix50sp2.component.UndlyInstrumentParties component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.UndlyInstrumentParties getUndlyInstrumentParties() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.UndlyInstrumentParties());
	}

	public void set(quickfix.field.NoUndlyInstrumentParties value) {
		setField(value);
	}

	public quickfix.field.NoUndlyInstrumentParties get(quickfix.field.NoUndlyInstrumentParties value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoUndlyInstrumentParties getNoUndlyInstrumentParties() throws FieldNotFound {
		return get(new quickfix.field.NoUndlyInstrumentParties());
	}

	public boolean isSet(quickfix.field.NoUndlyInstrumentParties field) {
		return isSetField(field);
	}

	public boolean isSetNoUndlyInstrumentParties() {
		return isSetField(1058);
	}

	public static class NoUndlyInstrumentParties extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {1059, 1060, 1061, 1062, 0};

		public NoUndlyInstrumentParties() {
			super(1058, 1059, ORDER);
		}
		
	public void set(quickfix.field.UnderlyingInstrumentPartyID value) {
		setField(value);
	}

	public quickfix.field.UnderlyingInstrumentPartyID get(quickfix.field.UnderlyingInstrumentPartyID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingInstrumentPartyID getUnderlyingInstrumentPartyID() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingInstrumentPartyID());
	}

	public boolean isSet(quickfix.field.UnderlyingInstrumentPartyID field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingInstrumentPartyID() {
		return isSetField(1059);
	}

	public void set(quickfix.field.UnderlyingInstrumentPartyIDSource value) {
		setField(value);
	}

	public quickfix.field.UnderlyingInstrumentPartyIDSource get(quickfix.field.UnderlyingInstrumentPartyIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingInstrumentPartyIDSource getUnderlyingInstrumentPartyIDSource() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingInstrumentPartyIDSource());
	}

	public boolean isSet(quickfix.field.UnderlyingInstrumentPartyIDSource field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingInstrumentPartyIDSource() {
		return isSetField(1060);
	}

	public void set(quickfix.field.UnderlyingInstrumentPartyRole value) {
		setField(value);
	}

	public quickfix.field.UnderlyingInstrumentPartyRole get(quickfix.field.UnderlyingInstrumentPartyRole value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingInstrumentPartyRole getUnderlyingInstrumentPartyRole() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingInstrumentPartyRole());
	}

	public boolean isSet(quickfix.field.UnderlyingInstrumentPartyRole field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingInstrumentPartyRole() {
		return isSetField(1061);
	}

	public void set(quickfix.fix50sp2.component.UndlyInstrumentPtysSubGrp component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.UndlyInstrumentPtysSubGrp get(quickfix.fix50sp2.component.UndlyInstrumentPtysSubGrp component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.UndlyInstrumentPtysSubGrp getUndlyInstrumentPtysSubGrp() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.UndlyInstrumentPtysSubGrp());
	}

	public void set(quickfix.field.NoUndlyInstrumentPartySubIDs value) {
		setField(value);
	}

	public quickfix.field.NoUndlyInstrumentPartySubIDs get(quickfix.field.NoUndlyInstrumentPartySubIDs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoUndlyInstrumentPartySubIDs getNoUndlyInstrumentPartySubIDs() throws FieldNotFound {
		return get(new quickfix.field.NoUndlyInstrumentPartySubIDs());
	}

	public boolean isSet(quickfix.field.NoUndlyInstrumentPartySubIDs field) {
		return isSetField(field);
	}

	public boolean isSetNoUndlyInstrumentPartySubIDs() {
		return isSetField(1062);
	}

	public static class NoUndlyInstrumentPartySubIDs extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {1063, 1064, 0};

		public NoUndlyInstrumentPartySubIDs() {
			super(1062, 1063, ORDER);
		}
		
	public void set(quickfix.field.UnderlyingInstrumentPartySubID value) {
		setField(value);
	}

	public quickfix.field.UnderlyingInstrumentPartySubID get(quickfix.field.UnderlyingInstrumentPartySubID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingInstrumentPartySubID getUnderlyingInstrumentPartySubID() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingInstrumentPartySubID());
	}

	public boolean isSet(quickfix.field.UnderlyingInstrumentPartySubID field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingInstrumentPartySubID() {
		return isSetField(1063);
	}

	public void set(quickfix.field.UnderlyingInstrumentPartySubIDType value) {
		setField(value);
	}

	public quickfix.field.UnderlyingInstrumentPartySubIDType get(quickfix.field.UnderlyingInstrumentPartySubIDType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingInstrumentPartySubIDType getUnderlyingInstrumentPartySubIDType() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingInstrumentPartySubIDType());
	}

	public boolean isSet(quickfix.field.UnderlyingInstrumentPartySubIDType field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingInstrumentPartySubIDType() {
		return isSetField(1064);
	}

	}

	}

	public void set(quickfix.field.UnderlyingSettlMethod value) {
		setField(value);
	}

	public quickfix.field.UnderlyingSettlMethod get(quickfix.field.UnderlyingSettlMethod value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingSettlMethod getUnderlyingSettlMethod() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingSettlMethod());
	}

	public boolean isSet(quickfix.field.UnderlyingSettlMethod field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingSettlMethod() {
		return isSetField(1039);
	}

	public void set(quickfix.field.UnderlyingPutOrCall value) {
		setField(value);
	}

	public quickfix.field.UnderlyingPutOrCall get(quickfix.field.UnderlyingPutOrCall value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingPutOrCall getUnderlyingPutOrCall() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingPutOrCall());
	}

	public boolean isSet(quickfix.field.UnderlyingPutOrCall field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingPutOrCall() {
		return isSetField(315);
	}

	}

	public void set(quickfix.field.PrevClosePx value) {
		setField(value);
	}

	public quickfix.field.PrevClosePx get(quickfix.field.PrevClosePx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PrevClosePx getPrevClosePx() throws FieldNotFound {
		return get(new quickfix.field.PrevClosePx());
	}

	public boolean isSet(quickfix.field.PrevClosePx field) {
		return isSetField(field);
	}

	public boolean isSetPrevClosePx() {
		return isSetField(140);
	}

	public void set(quickfix.field.QuoteRequestType value) {
		setField(value);
	}

	public quickfix.field.QuoteRequestType get(quickfix.field.QuoteRequestType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.QuoteRequestType getQuoteRequestType() throws FieldNotFound {
		return get(new quickfix.field.QuoteRequestType());
	}

	public boolean isSet(quickfix.field.QuoteRequestType field) {
		return isSetField(field);
	}

	public boolean isSetQuoteRequestType() {
		return isSetField(303);
	}

	public void set(quickfix.field.QuoteType value) {
		setField(value);
	}

	public quickfix.field.QuoteType get(quickfix.field.QuoteType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.QuoteType getQuoteType() throws FieldNotFound {
		return get(new quickfix.field.QuoteType());
	}

	public boolean isSet(quickfix.field.QuoteType field) {
		return isSetField(field);
	}

	public boolean isSetQuoteType() {
		return isSetField(537);
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

	public void set(quickfix.field.TradeOriginationDate value) {
		setField(value);
	}

	public quickfix.field.TradeOriginationDate get(quickfix.field.TradeOriginationDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TradeOriginationDate getTradeOriginationDate() throws FieldNotFound {
		return get(new quickfix.field.TradeOriginationDate());
	}

	public boolean isSet(quickfix.field.TradeOriginationDate field) {
		return isSetField(field);
	}

	public boolean isSetTradeOriginationDate() {
		return isSetField(229);
	}

	public void set(quickfix.field.Side value) {
		setField(value);
	}

	public quickfix.field.Side get(quickfix.field.Side value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Side getSide() throws FieldNotFound {
		return get(new quickfix.field.Side());
	}

	public boolean isSet(quickfix.field.Side field) {
		return isSetField(field);
	}

	public boolean isSetSide() {
		return isSetField(54);
	}

	public void set(quickfix.field.QtyType value) {
		setField(value);
	}

	public quickfix.field.QtyType get(quickfix.field.QtyType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.QtyType getQtyType() throws FieldNotFound {
		return get(new quickfix.field.QtyType());
	}

	public boolean isSet(quickfix.field.QtyType field) {
		return isSetField(field);
	}

	public boolean isSetQtyType() {
		return isSetField(854);
	}

	public void set(quickfix.fix50sp2.component.OrderQtyData component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.OrderQtyData get(quickfix.fix50sp2.component.OrderQtyData component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.OrderQtyData getOrderQtyData() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.OrderQtyData());
	}

	public void set(quickfix.field.OrderQty value) {
		setField(value);
	}

	public quickfix.field.OrderQty get(quickfix.field.OrderQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.OrderQty getOrderQty() throws FieldNotFound {
		return get(new quickfix.field.OrderQty());
	}

	public boolean isSet(quickfix.field.OrderQty field) {
		return isSetField(field);
	}

	public boolean isSetOrderQty() {
		return isSetField(38);
	}

	public void set(quickfix.field.CashOrderQty value) {
		setField(value);
	}

	public quickfix.field.CashOrderQty get(quickfix.field.CashOrderQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.CashOrderQty getCashOrderQty() throws FieldNotFound {
		return get(new quickfix.field.CashOrderQty());
	}

	public boolean isSet(quickfix.field.CashOrderQty field) {
		return isSetField(field);
	}

	public boolean isSetCashOrderQty() {
		return isSetField(152);
	}

	public void set(quickfix.field.OrderPercent value) {
		setField(value);
	}

	public quickfix.field.OrderPercent get(quickfix.field.OrderPercent value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.OrderPercent getOrderPercent() throws FieldNotFound {
		return get(new quickfix.field.OrderPercent());
	}

	public boolean isSet(quickfix.field.OrderPercent field) {
		return isSetField(field);
	}

	public boolean isSetOrderPercent() {
		return isSetField(516);
	}

	public void set(quickfix.field.RoundingDirection value) {
		setField(value);
	}

	public quickfix.field.RoundingDirection get(quickfix.field.RoundingDirection value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.RoundingDirection getRoundingDirection() throws FieldNotFound {
		return get(new quickfix.field.RoundingDirection());
	}

	public boolean isSet(quickfix.field.RoundingDirection field) {
		return isSetField(field);
	}

	public boolean isSetRoundingDirection() {
		return isSetField(468);
	}

	public void set(quickfix.field.RoundingModulus value) {
		setField(value);
	}

	public quickfix.field.RoundingModulus get(quickfix.field.RoundingModulus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.RoundingModulus getRoundingModulus() throws FieldNotFound {
		return get(new quickfix.field.RoundingModulus());
	}

	public boolean isSet(quickfix.field.RoundingModulus field) {
		return isSetField(field);
	}

	public boolean isSetRoundingModulus() {
		return isSetField(469);
	}

	public void set(quickfix.field.MinQty value) {
		setField(value);
	}

	public quickfix.field.MinQty get(quickfix.field.MinQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MinQty getMinQty() throws FieldNotFound {
		return get(new quickfix.field.MinQty());
	}

	public boolean isSet(quickfix.field.MinQty field) {
		return isSetField(field);
	}

	public boolean isSetMinQty() {
		return isSetField(110);
	}

	public void set(quickfix.field.SettlType value) {
		setField(value);
	}

	public quickfix.field.SettlType get(quickfix.field.SettlType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SettlType getSettlType() throws FieldNotFound {
		return get(new quickfix.field.SettlType());
	}

	public boolean isSet(quickfix.field.SettlType field) {
		return isSetField(field);
	}

	public boolean isSetSettlType() {
		return isSetField(63);
	}

	public void set(quickfix.field.SettlDate value) {
		setField(value);
	}

	public quickfix.field.SettlDate get(quickfix.field.SettlDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SettlDate getSettlDate() throws FieldNotFound {
		return get(new quickfix.field.SettlDate());
	}

	public boolean isSet(quickfix.field.SettlDate field) {
		return isSetField(field);
	}

	public boolean isSetSettlDate() {
		return isSetField(64);
	}

	public void set(quickfix.field.SettlDate2 value) {
		setField(value);
	}

	public quickfix.field.SettlDate2 get(quickfix.field.SettlDate2 value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SettlDate2 getSettlDate2() throws FieldNotFound {
		return get(new quickfix.field.SettlDate2());
	}

	public boolean isSet(quickfix.field.SettlDate2 field) {
		return isSetField(field);
	}

	public boolean isSetSettlDate2() {
		return isSetField(193);
	}

	public void set(quickfix.field.OrderQty2 value) {
		setField(value);
	}

	public quickfix.field.OrderQty2 get(quickfix.field.OrderQty2 value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.OrderQty2 getOrderQty2() throws FieldNotFound {
		return get(new quickfix.field.OrderQty2());
	}

	public boolean isSet(quickfix.field.OrderQty2 field) {
		return isSetField(field);
	}

	public boolean isSetOrderQty2() {
		return isSetField(192);
	}

	public void set(quickfix.field.Currency value) {
		setField(value);
	}

	public quickfix.field.Currency get(quickfix.field.Currency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Currency getCurrency() throws FieldNotFound {
		return get(new quickfix.field.Currency());
	}

	public boolean isSet(quickfix.field.Currency field) {
		return isSetField(field);
	}

	public boolean isSetCurrency() {
		return isSetField(15);
	}

	public void set(quickfix.field.SettlCurrency value) {
		setField(value);
	}

	public quickfix.field.SettlCurrency get(quickfix.field.SettlCurrency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SettlCurrency getSettlCurrency() throws FieldNotFound {
		return get(new quickfix.field.SettlCurrency());
	}

	public boolean isSet(quickfix.field.SettlCurrency field) {
		return isSetField(field);
	}

	public boolean isSetSettlCurrency() {
		return isSetField(120);
	}

	public void set(quickfix.fix50sp2.component.RateSource component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.RateSource get(quickfix.fix50sp2.component.RateSource component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.RateSource getRateSource() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.RateSource());
	}

	public void set(quickfix.field.NoRateSources value) {
		setField(value);
	}

	public quickfix.field.NoRateSources get(quickfix.field.NoRateSources value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoRateSources getNoRateSources() throws FieldNotFound {
		return get(new quickfix.field.NoRateSources());
	}

	public boolean isSet(quickfix.field.NoRateSources field) {
		return isSetField(field);
	}

	public boolean isSetNoRateSources() {
		return isSetField(1445);
	}

	public static class NoRateSources extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {1446, 1447, 1448, 0};

		public NoRateSources() {
			super(1445, 1446, ORDER);
		}
		
	public void set(quickfix.field.RateSource value) {
		setField(value);
	}

	public quickfix.field.RateSource get(quickfix.field.RateSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.RateSource getRateSource() throws FieldNotFound {
		return get(new quickfix.field.RateSource());
	}

	public boolean isSet(quickfix.field.RateSource field) {
		return isSetField(field);
	}

	public boolean isSetRateSource() {
		return isSetField(1446);
	}

	public void set(quickfix.field.RateSourceType value) {
		setField(value);
	}

	public quickfix.field.RateSourceType get(quickfix.field.RateSourceType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.RateSourceType getRateSourceType() throws FieldNotFound {
		return get(new quickfix.field.RateSourceType());
	}

	public boolean isSet(quickfix.field.RateSourceType field) {
		return isSetField(field);
	}

	public boolean isSetRateSourceType() {
		return isSetField(1447);
	}

	public void set(quickfix.field.ReferencePage value) {
		setField(value);
	}

	public quickfix.field.ReferencePage get(quickfix.field.ReferencePage value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ReferencePage getReferencePage() throws FieldNotFound {
		return get(new quickfix.field.ReferencePage());
	}

	public boolean isSet(quickfix.field.ReferencePage field) {
		return isSetField(field);
	}

	public boolean isSetReferencePage() {
		return isSetField(1448);
	}

	}

	public void set(quickfix.fix50sp2.component.Stipulations component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.Stipulations get(quickfix.fix50sp2.component.Stipulations component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.Stipulations getStipulations() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.Stipulations());
	}

	public void set(quickfix.field.NoStipulations value) {
		setField(value);
	}

	public quickfix.field.NoStipulations get(quickfix.field.NoStipulations value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoStipulations getNoStipulations() throws FieldNotFound {
		return get(new quickfix.field.NoStipulations());
	}

	public boolean isSet(quickfix.field.NoStipulations field) {
		return isSetField(field);
	}

	public boolean isSetNoStipulations() {
		return isSetField(232);
	}

	public static class NoStipulations extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {233, 234, 0};

		public NoStipulations() {
			super(232, 233, ORDER);
		}
		
	public void set(quickfix.field.StipulationType value) {
		setField(value);
	}

	public quickfix.field.StipulationType get(quickfix.field.StipulationType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.StipulationType getStipulationType() throws FieldNotFound {
		return get(new quickfix.field.StipulationType());
	}

	public boolean isSet(quickfix.field.StipulationType field) {
		return isSetField(field);
	}

	public boolean isSetStipulationType() {
		return isSetField(233);
	}

	public void set(quickfix.field.StipulationValue value) {
		setField(value);
	}

	public quickfix.field.StipulationValue get(quickfix.field.StipulationValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.StipulationValue getStipulationValue() throws FieldNotFound {
		return get(new quickfix.field.StipulationValue());
	}

	public boolean isSet(quickfix.field.StipulationValue field) {
		return isSetField(field);
	}

	public boolean isSetStipulationValue() {
		return isSetField(234);
	}

	}

	public void set(quickfix.field.Account value) {
		setField(value);
	}

	public quickfix.field.Account get(quickfix.field.Account value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Account getAccount() throws FieldNotFound {
		return get(new quickfix.field.Account());
	}

	public boolean isSet(quickfix.field.Account field) {
		return isSetField(field);
	}

	public boolean isSetAccount() {
		return isSetField(1);
	}

	public void set(quickfix.field.AcctIDSource value) {
		setField(value);
	}

	public quickfix.field.AcctIDSource get(quickfix.field.AcctIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.AcctIDSource getAcctIDSource() throws FieldNotFound {
		return get(new quickfix.field.AcctIDSource());
	}

	public boolean isSet(quickfix.field.AcctIDSource field) {
		return isSetField(field);
	}

	public boolean isSetAcctIDSource() {
		return isSetField(660);
	}

	public void set(quickfix.field.AccountType value) {
		setField(value);
	}

	public quickfix.field.AccountType get(quickfix.field.AccountType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.AccountType getAccountType() throws FieldNotFound {
		return get(new quickfix.field.AccountType());
	}

	public boolean isSet(quickfix.field.AccountType field) {
		return isSetField(field);
	}

	public boolean isSetAccountType() {
		return isSetField(581);
	}

	public void set(quickfix.fix50sp2.component.QuotReqLegsGrp component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.QuotReqLegsGrp get(quickfix.fix50sp2.component.QuotReqLegsGrp component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.QuotReqLegsGrp getQuotReqLegsGrp() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.QuotReqLegsGrp());
	}

	public void set(quickfix.field.NoLegs value) {
		setField(value);
	}

	public quickfix.field.NoLegs get(quickfix.field.NoLegs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoLegs getNoLegs() throws FieldNotFound {
		return get(new quickfix.field.NoLegs());
	}

	public boolean isSet(quickfix.field.NoLegs field) {
		return isSetField(field);
	}

	public boolean isSetNoLegs() {
		return isSetField(555);
	}

	public static class NoLegs extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {600, 601, 602, 603, 604, 607, 608, 609, 764, 610, 611, 1212, 248, 249, 250, 251, 252, 253, 257, 599, 596, 597, 598, 254, 612, 942, 613, 614, 1436, 1440, 999, 1224, 1421, 1422, 1001, 1420, 615, 616, 617, 618, 619, 620, 621, 622, 623, 624, 556, 740, 739, 955, 956, 1358, 1017, 566, 687, 685, 690, 587, 588, 683, 539, 676, 677, 678, 679, 680, 654, 0};

		public NoLegs() {
			super(555, 600, ORDER);
		}
		
	public void set(quickfix.fix50sp2.component.InstrumentLeg component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.InstrumentLeg get(quickfix.fix50sp2.component.InstrumentLeg component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.InstrumentLeg getInstrumentLeg() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.InstrumentLeg());
	}

	public void set(quickfix.field.LegSymbol value) {
		setField(value);
	}

	public quickfix.field.LegSymbol get(quickfix.field.LegSymbol value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegSymbol getLegSymbol() throws FieldNotFound {
		return get(new quickfix.field.LegSymbol());
	}

	public boolean isSet(quickfix.field.LegSymbol field) {
		return isSetField(field);
	}

	public boolean isSetLegSymbol() {
		return isSetField(600);
	}

	public void set(quickfix.field.LegSymbolSfx value) {
		setField(value);
	}

	public quickfix.field.LegSymbolSfx get(quickfix.field.LegSymbolSfx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegSymbolSfx getLegSymbolSfx() throws FieldNotFound {
		return get(new quickfix.field.LegSymbolSfx());
	}

	public boolean isSet(quickfix.field.LegSymbolSfx field) {
		return isSetField(field);
	}

	public boolean isSetLegSymbolSfx() {
		return isSetField(601);
	}

	public void set(quickfix.field.LegSecurityID value) {
		setField(value);
	}

	public quickfix.field.LegSecurityID get(quickfix.field.LegSecurityID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegSecurityID getLegSecurityID() throws FieldNotFound {
		return get(new quickfix.field.LegSecurityID());
	}

	public boolean isSet(quickfix.field.LegSecurityID field) {
		return isSetField(field);
	}

	public boolean isSetLegSecurityID() {
		return isSetField(602);
	}

	public void set(quickfix.field.LegSecurityIDSource value) {
		setField(value);
	}

	public quickfix.field.LegSecurityIDSource get(quickfix.field.LegSecurityIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegSecurityIDSource getLegSecurityIDSource() throws FieldNotFound {
		return get(new quickfix.field.LegSecurityIDSource());
	}

	public boolean isSet(quickfix.field.LegSecurityIDSource field) {
		return isSetField(field);
	}

	public boolean isSetLegSecurityIDSource() {
		return isSetField(603);
	}

	public void set(quickfix.fix50sp2.component.LegSecAltIDGrp component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.LegSecAltIDGrp get(quickfix.fix50sp2.component.LegSecAltIDGrp component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.LegSecAltIDGrp getLegSecAltIDGrp() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.LegSecAltIDGrp());
	}

	public void set(quickfix.field.NoLegSecurityAltID value) {
		setField(value);
	}

	public quickfix.field.NoLegSecurityAltID get(quickfix.field.NoLegSecurityAltID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoLegSecurityAltID getNoLegSecurityAltID() throws FieldNotFound {
		return get(new quickfix.field.NoLegSecurityAltID());
	}

	public boolean isSet(quickfix.field.NoLegSecurityAltID field) {
		return isSetField(field);
	}

	public boolean isSetNoLegSecurityAltID() {
		return isSetField(604);
	}

	public static class NoLegSecurityAltID extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {605, 606, 0};

		public NoLegSecurityAltID() {
			super(604, 605, ORDER);
		}
		
	public void set(quickfix.field.LegSecurityAltID value) {
		setField(value);
	}

	public quickfix.field.LegSecurityAltID get(quickfix.field.LegSecurityAltID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegSecurityAltID getLegSecurityAltID() throws FieldNotFound {
		return get(new quickfix.field.LegSecurityAltID());
	}

	public boolean isSet(quickfix.field.LegSecurityAltID field) {
		return isSetField(field);
	}

	public boolean isSetLegSecurityAltID() {
		return isSetField(605);
	}

	public void set(quickfix.field.LegSecurityAltIDSource value) {
		setField(value);
	}

	public quickfix.field.LegSecurityAltIDSource get(quickfix.field.LegSecurityAltIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegSecurityAltIDSource getLegSecurityAltIDSource() throws FieldNotFound {
		return get(new quickfix.field.LegSecurityAltIDSource());
	}

	public boolean isSet(quickfix.field.LegSecurityAltIDSource field) {
		return isSetField(field);
	}

	public boolean isSetLegSecurityAltIDSource() {
		return isSetField(606);
	}

	}

	public void set(quickfix.field.LegProduct value) {
		setField(value);
	}

	public quickfix.field.LegProduct get(quickfix.field.LegProduct value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegProduct getLegProduct() throws FieldNotFound {
		return get(new quickfix.field.LegProduct());
	}

	public boolean isSet(quickfix.field.LegProduct field) {
		return isSetField(field);
	}

	public boolean isSetLegProduct() {
		return isSetField(607);
	}

	public void set(quickfix.field.LegCFICode value) {
		setField(value);
	}

	public quickfix.field.LegCFICode get(quickfix.field.LegCFICode value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegCFICode getLegCFICode() throws FieldNotFound {
		return get(new quickfix.field.LegCFICode());
	}

	public boolean isSet(quickfix.field.LegCFICode field) {
		return isSetField(field);
	}

	public boolean isSetLegCFICode() {
		return isSetField(608);
	}

	public void set(quickfix.field.LegSecurityType value) {
		setField(value);
	}

	public quickfix.field.LegSecurityType get(quickfix.field.LegSecurityType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegSecurityType getLegSecurityType() throws FieldNotFound {
		return get(new quickfix.field.LegSecurityType());
	}

	public boolean isSet(quickfix.field.LegSecurityType field) {
		return isSetField(field);
	}

	public boolean isSetLegSecurityType() {
		return isSetField(609);
	}

	public void set(quickfix.field.LegSecuritySubType value) {
		setField(value);
	}

	public quickfix.field.LegSecuritySubType get(quickfix.field.LegSecuritySubType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegSecuritySubType getLegSecuritySubType() throws FieldNotFound {
		return get(new quickfix.field.LegSecuritySubType());
	}

	public boolean isSet(quickfix.field.LegSecuritySubType field) {
		return isSetField(field);
	}

	public boolean isSetLegSecuritySubType() {
		return isSetField(764);
	}

	public void set(quickfix.field.LegMaturityMonthYear value) {
		setField(value);
	}

	public quickfix.field.LegMaturityMonthYear get(quickfix.field.LegMaturityMonthYear value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegMaturityMonthYear getLegMaturityMonthYear() throws FieldNotFound {
		return get(new quickfix.field.LegMaturityMonthYear());
	}

	public boolean isSet(quickfix.field.LegMaturityMonthYear field) {
		return isSetField(field);
	}

	public boolean isSetLegMaturityMonthYear() {
		return isSetField(610);
	}

	public void set(quickfix.field.LegMaturityDate value) {
		setField(value);
	}

	public quickfix.field.LegMaturityDate get(quickfix.field.LegMaturityDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegMaturityDate getLegMaturityDate() throws FieldNotFound {
		return get(new quickfix.field.LegMaturityDate());
	}

	public boolean isSet(quickfix.field.LegMaturityDate field) {
		return isSetField(field);
	}

	public boolean isSetLegMaturityDate() {
		return isSetField(611);
	}

	public void set(quickfix.field.LegMaturityTime value) {
		setField(value);
	}

	public quickfix.field.LegMaturityTime get(quickfix.field.LegMaturityTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegMaturityTime getLegMaturityTime() throws FieldNotFound {
		return get(new quickfix.field.LegMaturityTime());
	}

	public boolean isSet(quickfix.field.LegMaturityTime field) {
		return isSetField(field);
	}

	public boolean isSetLegMaturityTime() {
		return isSetField(1212);
	}

	public void set(quickfix.field.LegCouponPaymentDate value) {
		setField(value);
	}

	public quickfix.field.LegCouponPaymentDate get(quickfix.field.LegCouponPaymentDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegCouponPaymentDate getLegCouponPaymentDate() throws FieldNotFound {
		return get(new quickfix.field.LegCouponPaymentDate());
	}

	public boolean isSet(quickfix.field.LegCouponPaymentDate field) {
		return isSetField(field);
	}

	public boolean isSetLegCouponPaymentDate() {
		return isSetField(248);
	}

	public void set(quickfix.field.LegIssueDate value) {
		setField(value);
	}

	public quickfix.field.LegIssueDate get(quickfix.field.LegIssueDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegIssueDate getLegIssueDate() throws FieldNotFound {
		return get(new quickfix.field.LegIssueDate());
	}

	public boolean isSet(quickfix.field.LegIssueDate field) {
		return isSetField(field);
	}

	public boolean isSetLegIssueDate() {
		return isSetField(249);
	}

	public void set(quickfix.field.LegRepoCollateralSecurityType value) {
		setField(value);
	}

	public quickfix.field.LegRepoCollateralSecurityType get(quickfix.field.LegRepoCollateralSecurityType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegRepoCollateralSecurityType getLegRepoCollateralSecurityType() throws FieldNotFound {
		return get(new quickfix.field.LegRepoCollateralSecurityType());
	}

	public boolean isSet(quickfix.field.LegRepoCollateralSecurityType field) {
		return isSetField(field);
	}

	public boolean isSetLegRepoCollateralSecurityType() {
		return isSetField(250);
	}

	public void set(quickfix.field.LegRepurchaseTerm value) {
		setField(value);
	}

	public quickfix.field.LegRepurchaseTerm get(quickfix.field.LegRepurchaseTerm value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegRepurchaseTerm getLegRepurchaseTerm() throws FieldNotFound {
		return get(new quickfix.field.LegRepurchaseTerm());
	}

	public boolean isSet(quickfix.field.LegRepurchaseTerm field) {
		return isSetField(field);
	}

	public boolean isSetLegRepurchaseTerm() {
		return isSetField(251);
	}

	public void set(quickfix.field.LegRepurchaseRate value) {
		setField(value);
	}

	public quickfix.field.LegRepurchaseRate get(quickfix.field.LegRepurchaseRate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegRepurchaseRate getLegRepurchaseRate() throws FieldNotFound {
		return get(new quickfix.field.LegRepurchaseRate());
	}

	public boolean isSet(quickfix.field.LegRepurchaseRate field) {
		return isSetField(field);
	}

	public boolean isSetLegRepurchaseRate() {
		return isSetField(252);
	}

	public void set(quickfix.field.LegFactor value) {
		setField(value);
	}

	public quickfix.field.LegFactor get(quickfix.field.LegFactor value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegFactor getLegFactor() throws FieldNotFound {
		return get(new quickfix.field.LegFactor());
	}

	public boolean isSet(quickfix.field.LegFactor field) {
		return isSetField(field);
	}

	public boolean isSetLegFactor() {
		return isSetField(253);
	}

	public void set(quickfix.field.LegCreditRating value) {
		setField(value);
	}

	public quickfix.field.LegCreditRating get(quickfix.field.LegCreditRating value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegCreditRating getLegCreditRating() throws FieldNotFound {
		return get(new quickfix.field.LegCreditRating());
	}

	public boolean isSet(quickfix.field.LegCreditRating field) {
		return isSetField(field);
	}

	public boolean isSetLegCreditRating() {
		return isSetField(257);
	}

	public void set(quickfix.field.LegInstrRegistry value) {
		setField(value);
	}

	public quickfix.field.LegInstrRegistry get(quickfix.field.LegInstrRegistry value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegInstrRegistry getLegInstrRegistry() throws FieldNotFound {
		return get(new quickfix.field.LegInstrRegistry());
	}

	public boolean isSet(quickfix.field.LegInstrRegistry field) {
		return isSetField(field);
	}

	public boolean isSetLegInstrRegistry() {
		return isSetField(599);
	}

	public void set(quickfix.field.LegCountryOfIssue value) {
		setField(value);
	}

	public quickfix.field.LegCountryOfIssue get(quickfix.field.LegCountryOfIssue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegCountryOfIssue getLegCountryOfIssue() throws FieldNotFound {
		return get(new quickfix.field.LegCountryOfIssue());
	}

	public boolean isSet(quickfix.field.LegCountryOfIssue field) {
		return isSetField(field);
	}

	public boolean isSetLegCountryOfIssue() {
		return isSetField(596);
	}

	public void set(quickfix.field.LegStateOrProvinceOfIssue value) {
		setField(value);
	}

	public quickfix.field.LegStateOrProvinceOfIssue get(quickfix.field.LegStateOrProvinceOfIssue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegStateOrProvinceOfIssue getLegStateOrProvinceOfIssue() throws FieldNotFound {
		return get(new quickfix.field.LegStateOrProvinceOfIssue());
	}

	public boolean isSet(quickfix.field.LegStateOrProvinceOfIssue field) {
		return isSetField(field);
	}

	public boolean isSetLegStateOrProvinceOfIssue() {
		return isSetField(597);
	}

	public void set(quickfix.field.LegLocaleOfIssue value) {
		setField(value);
	}

	public quickfix.field.LegLocaleOfIssue get(quickfix.field.LegLocaleOfIssue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegLocaleOfIssue getLegLocaleOfIssue() throws FieldNotFound {
		return get(new quickfix.field.LegLocaleOfIssue());
	}

	public boolean isSet(quickfix.field.LegLocaleOfIssue field) {
		return isSetField(field);
	}

	public boolean isSetLegLocaleOfIssue() {
		return isSetField(598);
	}

	public void set(quickfix.field.LegRedemptionDate value) {
		setField(value);
	}

	public quickfix.field.LegRedemptionDate get(quickfix.field.LegRedemptionDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegRedemptionDate getLegRedemptionDate() throws FieldNotFound {
		return get(new quickfix.field.LegRedemptionDate());
	}

	public boolean isSet(quickfix.field.LegRedemptionDate field) {
		return isSetField(field);
	}

	public boolean isSetLegRedemptionDate() {
		return isSetField(254);
	}

	public void set(quickfix.field.LegStrikePrice value) {
		setField(value);
	}

	public quickfix.field.LegStrikePrice get(quickfix.field.LegStrikePrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegStrikePrice getLegStrikePrice() throws FieldNotFound {
		return get(new quickfix.field.LegStrikePrice());
	}

	public boolean isSet(quickfix.field.LegStrikePrice field) {
		return isSetField(field);
	}

	public boolean isSetLegStrikePrice() {
		return isSetField(612);
	}

	public void set(quickfix.field.LegStrikeCurrency value) {
		setField(value);
	}

	public quickfix.field.LegStrikeCurrency get(quickfix.field.LegStrikeCurrency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegStrikeCurrency getLegStrikeCurrency() throws FieldNotFound {
		return get(new quickfix.field.LegStrikeCurrency());
	}

	public boolean isSet(quickfix.field.LegStrikeCurrency field) {
		return isSetField(field);
	}

	public boolean isSetLegStrikeCurrency() {
		return isSetField(942);
	}

	public void set(quickfix.field.LegOptAttribute value) {
		setField(value);
	}

	public quickfix.field.LegOptAttribute get(quickfix.field.LegOptAttribute value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegOptAttribute getLegOptAttribute() throws FieldNotFound {
		return get(new quickfix.field.LegOptAttribute());
	}

	public boolean isSet(quickfix.field.LegOptAttribute field) {
		return isSetField(field);
	}

	public boolean isSetLegOptAttribute() {
		return isSetField(613);
	}

	public void set(quickfix.field.LegContractMultiplier value) {
		setField(value);
	}

	public quickfix.field.LegContractMultiplier get(quickfix.field.LegContractMultiplier value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegContractMultiplier getLegContractMultiplier() throws FieldNotFound {
		return get(new quickfix.field.LegContractMultiplier());
	}

	public boolean isSet(quickfix.field.LegContractMultiplier field) {
		return isSetField(field);
	}

	public boolean isSetLegContractMultiplier() {
		return isSetField(614);
	}

	public void set(quickfix.field.LegContractMultiplierUnit value) {
		setField(value);
	}

	public quickfix.field.LegContractMultiplierUnit get(quickfix.field.LegContractMultiplierUnit value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegContractMultiplierUnit getLegContractMultiplierUnit() throws FieldNotFound {
		return get(new quickfix.field.LegContractMultiplierUnit());
	}

	public boolean isSet(quickfix.field.LegContractMultiplierUnit field) {
		return isSetField(field);
	}

	public boolean isSetLegContractMultiplierUnit() {
		return isSetField(1436);
	}

	public void set(quickfix.field.LegFlowScheduleType value) {
		setField(value);
	}

	public quickfix.field.LegFlowScheduleType get(quickfix.field.LegFlowScheduleType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegFlowScheduleType getLegFlowScheduleType() throws FieldNotFound {
		return get(new quickfix.field.LegFlowScheduleType());
	}

	public boolean isSet(quickfix.field.LegFlowScheduleType field) {
		return isSetField(field);
	}

	public boolean isSetLegFlowScheduleType() {
		return isSetField(1440);
	}

	public void set(quickfix.field.LegUnitOfMeasure value) {
		setField(value);
	}

	public quickfix.field.LegUnitOfMeasure get(quickfix.field.LegUnitOfMeasure value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegUnitOfMeasure getLegUnitOfMeasure() throws FieldNotFound {
		return get(new quickfix.field.LegUnitOfMeasure());
	}

	public boolean isSet(quickfix.field.LegUnitOfMeasure field) {
		return isSetField(field);
	}

	public boolean isSetLegUnitOfMeasure() {
		return isSetField(999);
	}

	public void set(quickfix.field.LegUnitOfMeasureQty value) {
		setField(value);
	}

	public quickfix.field.LegUnitOfMeasureQty get(quickfix.field.LegUnitOfMeasureQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegUnitOfMeasureQty getLegUnitOfMeasureQty() throws FieldNotFound {
		return get(new quickfix.field.LegUnitOfMeasureQty());
	}

	public boolean isSet(quickfix.field.LegUnitOfMeasureQty field) {
		return isSetField(field);
	}

	public boolean isSetLegUnitOfMeasureQty() {
		return isSetField(1224);
	}

	public void set(quickfix.field.LegPriceUnitOfMeasure value) {
		setField(value);
	}

	public quickfix.field.LegPriceUnitOfMeasure get(quickfix.field.LegPriceUnitOfMeasure value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegPriceUnitOfMeasure getLegPriceUnitOfMeasure() throws FieldNotFound {
		return get(new quickfix.field.LegPriceUnitOfMeasure());
	}

	public boolean isSet(quickfix.field.LegPriceUnitOfMeasure field) {
		return isSetField(field);
	}

	public boolean isSetLegPriceUnitOfMeasure() {
		return isSetField(1421);
	}

	public void set(quickfix.field.LegPriceUnitOfMeasureQty value) {
		setField(value);
	}

	public quickfix.field.LegPriceUnitOfMeasureQty get(quickfix.field.LegPriceUnitOfMeasureQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegPriceUnitOfMeasureQty getLegPriceUnitOfMeasureQty() throws FieldNotFound {
		return get(new quickfix.field.LegPriceUnitOfMeasureQty());
	}

	public boolean isSet(quickfix.field.LegPriceUnitOfMeasureQty field) {
		return isSetField(field);
	}

	public boolean isSetLegPriceUnitOfMeasureQty() {
		return isSetField(1422);
	}

	public void set(quickfix.field.LegTimeUnit value) {
		setField(value);
	}

	public quickfix.field.LegTimeUnit get(quickfix.field.LegTimeUnit value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegTimeUnit getLegTimeUnit() throws FieldNotFound {
		return get(new quickfix.field.LegTimeUnit());
	}

	public boolean isSet(quickfix.field.LegTimeUnit field) {
		return isSetField(field);
	}

	public boolean isSetLegTimeUnit() {
		return isSetField(1001);
	}

	public void set(quickfix.field.LegExerciseStyle value) {
		setField(value);
	}

	public quickfix.field.LegExerciseStyle get(quickfix.field.LegExerciseStyle value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegExerciseStyle getLegExerciseStyle() throws FieldNotFound {
		return get(new quickfix.field.LegExerciseStyle());
	}

	public boolean isSet(quickfix.field.LegExerciseStyle field) {
		return isSetField(field);
	}

	public boolean isSetLegExerciseStyle() {
		return isSetField(1420);
	}

	public void set(quickfix.field.LegCouponRate value) {
		setField(value);
	}

	public quickfix.field.LegCouponRate get(quickfix.field.LegCouponRate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegCouponRate getLegCouponRate() throws FieldNotFound {
		return get(new quickfix.field.LegCouponRate());
	}

	public boolean isSet(quickfix.field.LegCouponRate field) {
		return isSetField(field);
	}

	public boolean isSetLegCouponRate() {
		return isSetField(615);
	}

	public void set(quickfix.field.LegSecurityExchange value) {
		setField(value);
	}

	public quickfix.field.LegSecurityExchange get(quickfix.field.LegSecurityExchange value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegSecurityExchange getLegSecurityExchange() throws FieldNotFound {
		return get(new quickfix.field.LegSecurityExchange());
	}

	public boolean isSet(quickfix.field.LegSecurityExchange field) {
		return isSetField(field);
	}

	public boolean isSetLegSecurityExchange() {
		return isSetField(616);
	}

	public void set(quickfix.field.LegIssuer value) {
		setField(value);
	}

	public quickfix.field.LegIssuer get(quickfix.field.LegIssuer value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegIssuer getLegIssuer() throws FieldNotFound {
		return get(new quickfix.field.LegIssuer());
	}

	public boolean isSet(quickfix.field.LegIssuer field) {
		return isSetField(field);
	}

	public boolean isSetLegIssuer() {
		return isSetField(617);
	}

	public void set(quickfix.field.EncodedLegIssuerLen value) {
		setField(value);
	}

	public quickfix.field.EncodedLegIssuerLen get(quickfix.field.EncodedLegIssuerLen value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EncodedLegIssuerLen getEncodedLegIssuerLen() throws FieldNotFound {
		return get(new quickfix.field.EncodedLegIssuerLen());
	}

	public boolean isSet(quickfix.field.EncodedLegIssuerLen field) {
		return isSetField(field);
	}

	public boolean isSetEncodedLegIssuerLen() {
		return isSetField(618);
	}

	public void set(quickfix.field.EncodedLegIssuer value) {
		setField(value);
	}

	public quickfix.field.EncodedLegIssuer get(quickfix.field.EncodedLegIssuer value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EncodedLegIssuer getEncodedLegIssuer() throws FieldNotFound {
		return get(new quickfix.field.EncodedLegIssuer());
	}

	public boolean isSet(quickfix.field.EncodedLegIssuer field) {
		return isSetField(field);
	}

	public boolean isSetEncodedLegIssuer() {
		return isSetField(619);
	}

	public void set(quickfix.field.LegSecurityDesc value) {
		setField(value);
	}

	public quickfix.field.LegSecurityDesc get(quickfix.field.LegSecurityDesc value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegSecurityDesc getLegSecurityDesc() throws FieldNotFound {
		return get(new quickfix.field.LegSecurityDesc());
	}

	public boolean isSet(quickfix.field.LegSecurityDesc field) {
		return isSetField(field);
	}

	public boolean isSetLegSecurityDesc() {
		return isSetField(620);
	}

	public void set(quickfix.field.EncodedLegSecurityDescLen value) {
		setField(value);
	}

	public quickfix.field.EncodedLegSecurityDescLen get(quickfix.field.EncodedLegSecurityDescLen value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EncodedLegSecurityDescLen getEncodedLegSecurityDescLen() throws FieldNotFound {
		return get(new quickfix.field.EncodedLegSecurityDescLen());
	}

	public boolean isSet(quickfix.field.EncodedLegSecurityDescLen field) {
		return isSetField(field);
	}

	public boolean isSetEncodedLegSecurityDescLen() {
		return isSetField(621);
	}

	public void set(quickfix.field.EncodedLegSecurityDesc value) {
		setField(value);
	}

	public quickfix.field.EncodedLegSecurityDesc get(quickfix.field.EncodedLegSecurityDesc value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EncodedLegSecurityDesc getEncodedLegSecurityDesc() throws FieldNotFound {
		return get(new quickfix.field.EncodedLegSecurityDesc());
	}

	public boolean isSet(quickfix.field.EncodedLegSecurityDesc field) {
		return isSetField(field);
	}

	public boolean isSetEncodedLegSecurityDesc() {
		return isSetField(622);
	}

	public void set(quickfix.field.LegRatioQty value) {
		setField(value);
	}

	public quickfix.field.LegRatioQty get(quickfix.field.LegRatioQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegRatioQty getLegRatioQty() throws FieldNotFound {
		return get(new quickfix.field.LegRatioQty());
	}

	public boolean isSet(quickfix.field.LegRatioQty field) {
		return isSetField(field);
	}

	public boolean isSetLegRatioQty() {
		return isSetField(623);
	}

	public void set(quickfix.field.LegSide value) {
		setField(value);
	}

	public quickfix.field.LegSide get(quickfix.field.LegSide value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegSide getLegSide() throws FieldNotFound {
		return get(new quickfix.field.LegSide());
	}

	public boolean isSet(quickfix.field.LegSide field) {
		return isSetField(field);
	}

	public boolean isSetLegSide() {
		return isSetField(624);
	}

	public void set(quickfix.field.LegCurrency value) {
		setField(value);
	}

	public quickfix.field.LegCurrency get(quickfix.field.LegCurrency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegCurrency getLegCurrency() throws FieldNotFound {
		return get(new quickfix.field.LegCurrency());
	}

	public boolean isSet(quickfix.field.LegCurrency field) {
		return isSetField(field);
	}

	public boolean isSetLegCurrency() {
		return isSetField(556);
	}

	public void set(quickfix.field.LegPool value) {
		setField(value);
	}

	public quickfix.field.LegPool get(quickfix.field.LegPool value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegPool getLegPool() throws FieldNotFound {
		return get(new quickfix.field.LegPool());
	}

	public boolean isSet(quickfix.field.LegPool field) {
		return isSetField(field);
	}

	public boolean isSetLegPool() {
		return isSetField(740);
	}

	public void set(quickfix.field.LegDatedDate value) {
		setField(value);
	}

	public quickfix.field.LegDatedDate get(quickfix.field.LegDatedDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegDatedDate getLegDatedDate() throws FieldNotFound {
		return get(new quickfix.field.LegDatedDate());
	}

	public boolean isSet(quickfix.field.LegDatedDate field) {
		return isSetField(field);
	}

	public boolean isSetLegDatedDate() {
		return isSetField(739);
	}

	public void set(quickfix.field.LegContractSettlMonth value) {
		setField(value);
	}

	public quickfix.field.LegContractSettlMonth get(quickfix.field.LegContractSettlMonth value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegContractSettlMonth getLegContractSettlMonth() throws FieldNotFound {
		return get(new quickfix.field.LegContractSettlMonth());
	}

	public boolean isSet(quickfix.field.LegContractSettlMonth field) {
		return isSetField(field);
	}

	public boolean isSetLegContractSettlMonth() {
		return isSetField(955);
	}

	public void set(quickfix.field.LegInterestAccrualDate value) {
		setField(value);
	}

	public quickfix.field.LegInterestAccrualDate get(quickfix.field.LegInterestAccrualDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegInterestAccrualDate getLegInterestAccrualDate() throws FieldNotFound {
		return get(new quickfix.field.LegInterestAccrualDate());
	}

	public boolean isSet(quickfix.field.LegInterestAccrualDate field) {
		return isSetField(field);
	}

	public boolean isSetLegInterestAccrualDate() {
		return isSetField(956);
	}

	public void set(quickfix.field.LegPutOrCall value) {
		setField(value);
	}

	public quickfix.field.LegPutOrCall get(quickfix.field.LegPutOrCall value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegPutOrCall getLegPutOrCall() throws FieldNotFound {
		return get(new quickfix.field.LegPutOrCall());
	}

	public boolean isSet(quickfix.field.LegPutOrCall field) {
		return isSetField(field);
	}

	public boolean isSetLegPutOrCall() {
		return isSetField(1358);
	}

	public void set(quickfix.field.LegOptionRatio value) {
		setField(value);
	}

	public quickfix.field.LegOptionRatio get(quickfix.field.LegOptionRatio value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegOptionRatio getLegOptionRatio() throws FieldNotFound {
		return get(new quickfix.field.LegOptionRatio());
	}

	public boolean isSet(quickfix.field.LegOptionRatio field) {
		return isSetField(field);
	}

	public boolean isSetLegOptionRatio() {
		return isSetField(1017);
	}

	public void set(quickfix.field.LegPrice value) {
		setField(value);
	}

	public quickfix.field.LegPrice get(quickfix.field.LegPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegPrice getLegPrice() throws FieldNotFound {
		return get(new quickfix.field.LegPrice());
	}

	public boolean isSet(quickfix.field.LegPrice field) {
		return isSetField(field);
	}

	public boolean isSetLegPrice() {
		return isSetField(566);
	}

	public void set(quickfix.field.LegQty value) {
		setField(value);
	}

	public quickfix.field.LegQty get(quickfix.field.LegQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegQty getLegQty() throws FieldNotFound {
		return get(new quickfix.field.LegQty());
	}

	public boolean isSet(quickfix.field.LegQty field) {
		return isSetField(field);
	}

	public boolean isSetLegQty() {
		return isSetField(687);
	}

	public void set(quickfix.field.LegOrderQty value) {
		setField(value);
	}

	public quickfix.field.LegOrderQty get(quickfix.field.LegOrderQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegOrderQty getLegOrderQty() throws FieldNotFound {
		return get(new quickfix.field.LegOrderQty());
	}

	public boolean isSet(quickfix.field.LegOrderQty field) {
		return isSetField(field);
	}

	public boolean isSetLegOrderQty() {
		return isSetField(685);
	}

	public void set(quickfix.field.LegSwapType value) {
		setField(value);
	}

	public quickfix.field.LegSwapType get(quickfix.field.LegSwapType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegSwapType getLegSwapType() throws FieldNotFound {
		return get(new quickfix.field.LegSwapType());
	}

	public boolean isSet(quickfix.field.LegSwapType field) {
		return isSetField(field);
	}

	public boolean isSetLegSwapType() {
		return isSetField(690);
	}

	public void set(quickfix.field.LegSettlType value) {
		setField(value);
	}

	public quickfix.field.LegSettlType get(quickfix.field.LegSettlType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegSettlType getLegSettlType() throws FieldNotFound {
		return get(new quickfix.field.LegSettlType());
	}

	public boolean isSet(quickfix.field.LegSettlType field) {
		return isSetField(field);
	}

	public boolean isSetLegSettlType() {
		return isSetField(587);
	}

	public void set(quickfix.field.LegSettlDate value) {
		setField(value);
	}

	public quickfix.field.LegSettlDate get(quickfix.field.LegSettlDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegSettlDate getLegSettlDate() throws FieldNotFound {
		return get(new quickfix.field.LegSettlDate());
	}

	public boolean isSet(quickfix.field.LegSettlDate field) {
		return isSetField(field);
	}

	public boolean isSetLegSettlDate() {
		return isSetField(588);
	}

	public void set(quickfix.fix50sp2.component.LegStipulations component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.LegStipulations get(quickfix.fix50sp2.component.LegStipulations component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.LegStipulations getLegStipulations() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.LegStipulations());
	}

	public void set(quickfix.field.NoLegStipulations value) {
		setField(value);
	}

	public quickfix.field.NoLegStipulations get(quickfix.field.NoLegStipulations value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoLegStipulations getNoLegStipulations() throws FieldNotFound {
		return get(new quickfix.field.NoLegStipulations());
	}

	public boolean isSet(quickfix.field.NoLegStipulations field) {
		return isSetField(field);
	}

	public boolean isSetNoLegStipulations() {
		return isSetField(683);
	}

	public static class NoLegStipulations extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {688, 689, 0};

		public NoLegStipulations() {
			super(683, 688, ORDER);
		}
		
	public void set(quickfix.field.LegStipulationType value) {
		setField(value);
	}

	public quickfix.field.LegStipulationType get(quickfix.field.LegStipulationType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegStipulationType getLegStipulationType() throws FieldNotFound {
		return get(new quickfix.field.LegStipulationType());
	}

	public boolean isSet(quickfix.field.LegStipulationType field) {
		return isSetField(field);
	}

	public boolean isSetLegStipulationType() {
		return isSetField(688);
	}

	public void set(quickfix.field.LegStipulationValue value) {
		setField(value);
	}

	public quickfix.field.LegStipulationValue get(quickfix.field.LegStipulationValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegStipulationValue getLegStipulationValue() throws FieldNotFound {
		return get(new quickfix.field.LegStipulationValue());
	}

	public boolean isSet(quickfix.field.LegStipulationValue field) {
		return isSetField(field);
	}

	public boolean isSetLegStipulationValue() {
		return isSetField(689);
	}

	}

	public void set(quickfix.fix50sp2.component.NestedParties component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.NestedParties get(quickfix.fix50sp2.component.NestedParties component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.NestedParties getNestedParties() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.NestedParties());
	}

	public void set(quickfix.field.NoNestedPartyIDs value) {
		setField(value);
	}

	public quickfix.field.NoNestedPartyIDs get(quickfix.field.NoNestedPartyIDs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoNestedPartyIDs getNoNestedPartyIDs() throws FieldNotFound {
		return get(new quickfix.field.NoNestedPartyIDs());
	}

	public boolean isSet(quickfix.field.NoNestedPartyIDs field) {
		return isSetField(field);
	}

	public boolean isSetNoNestedPartyIDs() {
		return isSetField(539);
	}

	public static class NoNestedPartyIDs extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {524, 525, 538, 804, 0};

		public NoNestedPartyIDs() {
			super(539, 524, ORDER);
		}
		
	public void set(quickfix.field.NestedPartyID value) {
		setField(value);
	}

	public quickfix.field.NestedPartyID get(quickfix.field.NestedPartyID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NestedPartyID getNestedPartyID() throws FieldNotFound {
		return get(new quickfix.field.NestedPartyID());
	}

	public boolean isSet(quickfix.field.NestedPartyID field) {
		return isSetField(field);
	}

	public boolean isSetNestedPartyID() {
		return isSetField(524);
	}

	public void set(quickfix.field.NestedPartyIDSource value) {
		setField(value);
	}

	public quickfix.field.NestedPartyIDSource get(quickfix.field.NestedPartyIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NestedPartyIDSource getNestedPartyIDSource() throws FieldNotFound {
		return get(new quickfix.field.NestedPartyIDSource());
	}

	public boolean isSet(quickfix.field.NestedPartyIDSource field) {
		return isSetField(field);
	}

	public boolean isSetNestedPartyIDSource() {
		return isSetField(525);
	}

	public void set(quickfix.field.NestedPartyRole value) {
		setField(value);
	}

	public quickfix.field.NestedPartyRole get(quickfix.field.NestedPartyRole value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NestedPartyRole getNestedPartyRole() throws FieldNotFound {
		return get(new quickfix.field.NestedPartyRole());
	}

	public boolean isSet(quickfix.field.NestedPartyRole field) {
		return isSetField(field);
	}

	public boolean isSetNestedPartyRole() {
		return isSetField(538);
	}

	public void set(quickfix.fix50sp2.component.NstdPtysSubGrp component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.NstdPtysSubGrp get(quickfix.fix50sp2.component.NstdPtysSubGrp component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.NstdPtysSubGrp getNstdPtysSubGrp() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.NstdPtysSubGrp());
	}

	public void set(quickfix.field.NoNestedPartySubIDs value) {
		setField(value);
	}

	public quickfix.field.NoNestedPartySubIDs get(quickfix.field.NoNestedPartySubIDs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoNestedPartySubIDs getNoNestedPartySubIDs() throws FieldNotFound {
		return get(new quickfix.field.NoNestedPartySubIDs());
	}

	public boolean isSet(quickfix.field.NoNestedPartySubIDs field) {
		return isSetField(field);
	}

	public boolean isSetNoNestedPartySubIDs() {
		return isSetField(804);
	}

	public static class NoNestedPartySubIDs extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {545, 805, 0};

		public NoNestedPartySubIDs() {
			super(804, 545, ORDER);
		}
		
	public void set(quickfix.field.NestedPartySubID value) {
		setField(value);
	}

	public quickfix.field.NestedPartySubID get(quickfix.field.NestedPartySubID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NestedPartySubID getNestedPartySubID() throws FieldNotFound {
		return get(new quickfix.field.NestedPartySubID());
	}

	public boolean isSet(quickfix.field.NestedPartySubID field) {
		return isSetField(field);
	}

	public boolean isSetNestedPartySubID() {
		return isSetField(545);
	}

	public void set(quickfix.field.NestedPartySubIDType value) {
		setField(value);
	}

	public quickfix.field.NestedPartySubIDType get(quickfix.field.NestedPartySubIDType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NestedPartySubIDType getNestedPartySubIDType() throws FieldNotFound {
		return get(new quickfix.field.NestedPartySubIDType());
	}

	public boolean isSet(quickfix.field.NestedPartySubIDType field) {
		return isSetField(field);
	}

	public boolean isSetNestedPartySubIDType() {
		return isSetField(805);
	}

	}

	}

	public void set(quickfix.fix50sp2.component.LegBenchmarkCurveData component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.LegBenchmarkCurveData get(quickfix.fix50sp2.component.LegBenchmarkCurveData component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.LegBenchmarkCurveData getLegBenchmarkCurveData() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.LegBenchmarkCurveData());
	}

	public void set(quickfix.field.LegBenchmarkCurveCurrency value) {
		setField(value);
	}

	public quickfix.field.LegBenchmarkCurveCurrency get(quickfix.field.LegBenchmarkCurveCurrency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegBenchmarkCurveCurrency getLegBenchmarkCurveCurrency() throws FieldNotFound {
		return get(new quickfix.field.LegBenchmarkCurveCurrency());
	}

	public boolean isSet(quickfix.field.LegBenchmarkCurveCurrency field) {
		return isSetField(field);
	}

	public boolean isSetLegBenchmarkCurveCurrency() {
		return isSetField(676);
	}

	public void set(quickfix.field.LegBenchmarkCurveName value) {
		setField(value);
	}

	public quickfix.field.LegBenchmarkCurveName get(quickfix.field.LegBenchmarkCurveName value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegBenchmarkCurveName getLegBenchmarkCurveName() throws FieldNotFound {
		return get(new quickfix.field.LegBenchmarkCurveName());
	}

	public boolean isSet(quickfix.field.LegBenchmarkCurveName field) {
		return isSetField(field);
	}

	public boolean isSetLegBenchmarkCurveName() {
		return isSetField(677);
	}

	public void set(quickfix.field.LegBenchmarkCurvePoint value) {
		setField(value);
	}

	public quickfix.field.LegBenchmarkCurvePoint get(quickfix.field.LegBenchmarkCurvePoint value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegBenchmarkCurvePoint getLegBenchmarkCurvePoint() throws FieldNotFound {
		return get(new quickfix.field.LegBenchmarkCurvePoint());
	}

	public boolean isSet(quickfix.field.LegBenchmarkCurvePoint field) {
		return isSetField(field);
	}

	public boolean isSetLegBenchmarkCurvePoint() {
		return isSetField(678);
	}

	public void set(quickfix.field.LegBenchmarkPrice value) {
		setField(value);
	}

	public quickfix.field.LegBenchmarkPrice get(quickfix.field.LegBenchmarkPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegBenchmarkPrice getLegBenchmarkPrice() throws FieldNotFound {
		return get(new quickfix.field.LegBenchmarkPrice());
	}

	public boolean isSet(quickfix.field.LegBenchmarkPrice field) {
		return isSetField(field);
	}

	public boolean isSetLegBenchmarkPrice() {
		return isSetField(679);
	}

	public void set(quickfix.field.LegBenchmarkPriceType value) {
		setField(value);
	}

	public quickfix.field.LegBenchmarkPriceType get(quickfix.field.LegBenchmarkPriceType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegBenchmarkPriceType getLegBenchmarkPriceType() throws FieldNotFound {
		return get(new quickfix.field.LegBenchmarkPriceType());
	}

	public boolean isSet(quickfix.field.LegBenchmarkPriceType field) {
		return isSetField(field);
	}

	public boolean isSetLegBenchmarkPriceType() {
		return isSetField(680);
	}

	public void set(quickfix.field.LegRefID value) {
		setField(value);
	}

	public quickfix.field.LegRefID get(quickfix.field.LegRefID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegRefID getLegRefID() throws FieldNotFound {
		return get(new quickfix.field.LegRefID());
	}

	public boolean isSet(quickfix.field.LegRefID field) {
		return isSetField(field);
	}

	public boolean isSetLegRefID() {
		return isSetField(654);
	}

	}

	public void set(quickfix.fix50sp2.component.QuotQualGrp component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.QuotQualGrp get(quickfix.fix50sp2.component.QuotQualGrp component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.QuotQualGrp getQuotQualGrp() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.QuotQualGrp());
	}

	public void set(quickfix.field.NoQuoteQualifiers value) {
		setField(value);
	}

	public quickfix.field.NoQuoteQualifiers get(quickfix.field.NoQuoteQualifiers value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoQuoteQualifiers getNoQuoteQualifiers() throws FieldNotFound {
		return get(new quickfix.field.NoQuoteQualifiers());
	}

	public boolean isSet(quickfix.field.NoQuoteQualifiers field) {
		return isSetField(field);
	}

	public boolean isSetNoQuoteQualifiers() {
		return isSetField(735);
	}

	public static class NoQuoteQualifiers extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {695, 0};

		public NoQuoteQualifiers() {
			super(735, 695, ORDER);
		}
		
	public void set(quickfix.field.QuoteQualifier value) {
		setField(value);
	}

	public quickfix.field.QuoteQualifier get(quickfix.field.QuoteQualifier value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.QuoteQualifier getQuoteQualifier() throws FieldNotFound {
		return get(new quickfix.field.QuoteQualifier());
	}

	public boolean isSet(quickfix.field.QuoteQualifier field) {
		return isSetField(field);
	}

	public boolean isSetQuoteQualifier() {
		return isSetField(695);
	}

	}

	public void set(quickfix.field.QuotePriceType value) {
		setField(value);
	}

	public quickfix.field.QuotePriceType get(quickfix.field.QuotePriceType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.QuotePriceType getQuotePriceType() throws FieldNotFound {
		return get(new quickfix.field.QuotePriceType());
	}

	public boolean isSet(quickfix.field.QuotePriceType field) {
		return isSetField(field);
	}

	public boolean isSetQuotePriceType() {
		return isSetField(692);
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

	public void set(quickfix.field.ValidUntilTime value) {
		setField(value);
	}

	public quickfix.field.ValidUntilTime get(quickfix.field.ValidUntilTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ValidUntilTime getValidUntilTime() throws FieldNotFound {
		return get(new quickfix.field.ValidUntilTime());
	}

	public boolean isSet(quickfix.field.ValidUntilTime field) {
		return isSetField(field);
	}

	public boolean isSetValidUntilTime() {
		return isSetField(62);
	}

	public void set(quickfix.field.ExpireTime value) {
		setField(value);
	}

	public quickfix.field.ExpireTime get(quickfix.field.ExpireTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ExpireTime getExpireTime() throws FieldNotFound {
		return get(new quickfix.field.ExpireTime());
	}

	public boolean isSet(quickfix.field.ExpireTime field) {
		return isSetField(field);
	}

	public boolean isSetExpireTime() {
		return isSetField(126);
	}

	public void set(quickfix.field.TransactTime value) {
		setField(value);
	}

	public quickfix.field.TransactTime get(quickfix.field.TransactTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TransactTime getTransactTime() throws FieldNotFound {
		return get(new quickfix.field.TransactTime());
	}

	public boolean isSet(quickfix.field.TransactTime field) {
		return isSetField(field);
	}

	public boolean isSetTransactTime() {
		return isSetField(60);
	}

	public void set(quickfix.fix50sp2.component.SpreadOrBenchmarkCurveData component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.SpreadOrBenchmarkCurveData get(quickfix.fix50sp2.component.SpreadOrBenchmarkCurveData component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.SpreadOrBenchmarkCurveData getSpreadOrBenchmarkCurveData() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.SpreadOrBenchmarkCurveData());
	}

	public void set(quickfix.field.Spread value) {
		setField(value);
	}

	public quickfix.field.Spread get(quickfix.field.Spread value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Spread getSpread() throws FieldNotFound {
		return get(new quickfix.field.Spread());
	}

	public boolean isSet(quickfix.field.Spread field) {
		return isSetField(field);
	}

	public boolean isSetSpread() {
		return isSetField(218);
	}

	public void set(quickfix.field.BenchmarkCurveCurrency value) {
		setField(value);
	}

	public quickfix.field.BenchmarkCurveCurrency get(quickfix.field.BenchmarkCurveCurrency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.BenchmarkCurveCurrency getBenchmarkCurveCurrency() throws FieldNotFound {
		return get(new quickfix.field.BenchmarkCurveCurrency());
	}

	public boolean isSet(quickfix.field.BenchmarkCurveCurrency field) {
		return isSetField(field);
	}

	public boolean isSetBenchmarkCurveCurrency() {
		return isSetField(220);
	}

	public void set(quickfix.field.BenchmarkCurveName value) {
		setField(value);
	}

	public quickfix.field.BenchmarkCurveName get(quickfix.field.BenchmarkCurveName value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.BenchmarkCurveName getBenchmarkCurveName() throws FieldNotFound {
		return get(new quickfix.field.BenchmarkCurveName());
	}

	public boolean isSet(quickfix.field.BenchmarkCurveName field) {
		return isSetField(field);
	}

	public boolean isSetBenchmarkCurveName() {
		return isSetField(221);
	}

	public void set(quickfix.field.BenchmarkCurvePoint value) {
		setField(value);
	}

	public quickfix.field.BenchmarkCurvePoint get(quickfix.field.BenchmarkCurvePoint value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.BenchmarkCurvePoint getBenchmarkCurvePoint() throws FieldNotFound {
		return get(new quickfix.field.BenchmarkCurvePoint());
	}

	public boolean isSet(quickfix.field.BenchmarkCurvePoint field) {
		return isSetField(field);
	}

	public boolean isSetBenchmarkCurvePoint() {
		return isSetField(222);
	}

	public void set(quickfix.field.BenchmarkPrice value) {
		setField(value);
	}

	public quickfix.field.BenchmarkPrice get(quickfix.field.BenchmarkPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.BenchmarkPrice getBenchmarkPrice() throws FieldNotFound {
		return get(new quickfix.field.BenchmarkPrice());
	}

	public boolean isSet(quickfix.field.BenchmarkPrice field) {
		return isSetField(field);
	}

	public boolean isSetBenchmarkPrice() {
		return isSetField(662);
	}

	public void set(quickfix.field.BenchmarkPriceType value) {
		setField(value);
	}

	public quickfix.field.BenchmarkPriceType get(quickfix.field.BenchmarkPriceType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.BenchmarkPriceType getBenchmarkPriceType() throws FieldNotFound {
		return get(new quickfix.field.BenchmarkPriceType());
	}

	public boolean isSet(quickfix.field.BenchmarkPriceType field) {
		return isSetField(field);
	}

	public boolean isSetBenchmarkPriceType() {
		return isSetField(663);
	}

	public void set(quickfix.field.BenchmarkSecurityID value) {
		setField(value);
	}

	public quickfix.field.BenchmarkSecurityID get(quickfix.field.BenchmarkSecurityID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.BenchmarkSecurityID getBenchmarkSecurityID() throws FieldNotFound {
		return get(new quickfix.field.BenchmarkSecurityID());
	}

	public boolean isSet(quickfix.field.BenchmarkSecurityID field) {
		return isSetField(field);
	}

	public boolean isSetBenchmarkSecurityID() {
		return isSetField(699);
	}

	public void set(quickfix.field.BenchmarkSecurityIDSource value) {
		setField(value);
	}

	public quickfix.field.BenchmarkSecurityIDSource get(quickfix.field.BenchmarkSecurityIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.BenchmarkSecurityIDSource getBenchmarkSecurityIDSource() throws FieldNotFound {
		return get(new quickfix.field.BenchmarkSecurityIDSource());
	}

	public boolean isSet(quickfix.field.BenchmarkSecurityIDSource field) {
		return isSetField(field);
	}

	public boolean isSetBenchmarkSecurityIDSource() {
		return isSetField(761);
	}

	public void set(quickfix.field.PriceType value) {
		setField(value);
	}

	public quickfix.field.PriceType get(quickfix.field.PriceType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PriceType getPriceType() throws FieldNotFound {
		return get(new quickfix.field.PriceType());
	}

	public boolean isSet(quickfix.field.PriceType field) {
		return isSetField(field);
	}

	public boolean isSetPriceType() {
		return isSetField(423);
	}

	public void set(quickfix.field.Price value) {
		setField(value);
	}

	public quickfix.field.Price get(quickfix.field.Price value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Price getPrice() throws FieldNotFound {
		return get(new quickfix.field.Price());
	}

	public boolean isSet(quickfix.field.Price field) {
		return isSetField(field);
	}

	public boolean isSetPrice() {
		return isSetField(44);
	}

	public void set(quickfix.field.Price2 value) {
		setField(value);
	}

	public quickfix.field.Price2 get(quickfix.field.Price2 value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Price2 getPrice2() throws FieldNotFound {
		return get(new quickfix.field.Price2());
	}

	public boolean isSet(quickfix.field.Price2 field) {
		return isSetField(field);
	}

	public boolean isSetPrice2() {
		return isSetField(640);
	}

	public void set(quickfix.fix50sp2.component.YieldData component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.YieldData get(quickfix.fix50sp2.component.YieldData component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.YieldData getYieldData() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.YieldData());
	}

	public void set(quickfix.field.YieldType value) {
		setField(value);
	}

	public quickfix.field.YieldType get(quickfix.field.YieldType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.YieldType getYieldType() throws FieldNotFound {
		return get(new quickfix.field.YieldType());
	}

	public boolean isSet(quickfix.field.YieldType field) {
		return isSetField(field);
	}

	public boolean isSetYieldType() {
		return isSetField(235);
	}

	public void set(quickfix.field.Yield value) {
		setField(value);
	}

	public quickfix.field.Yield get(quickfix.field.Yield value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Yield getYield() throws FieldNotFound {
		return get(new quickfix.field.Yield());
	}

	public boolean isSet(quickfix.field.Yield field) {
		return isSetField(field);
	}

	public boolean isSetYield() {
		return isSetField(236);
	}

	public void set(quickfix.field.YieldCalcDate value) {
		setField(value);
	}

	public quickfix.field.YieldCalcDate get(quickfix.field.YieldCalcDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.YieldCalcDate getYieldCalcDate() throws FieldNotFound {
		return get(new quickfix.field.YieldCalcDate());
	}

	public boolean isSet(quickfix.field.YieldCalcDate field) {
		return isSetField(field);
	}

	public boolean isSetYieldCalcDate() {
		return isSetField(701);
	}

	public void set(quickfix.field.YieldRedemptionDate value) {
		setField(value);
	}

	public quickfix.field.YieldRedemptionDate get(quickfix.field.YieldRedemptionDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.YieldRedemptionDate getYieldRedemptionDate() throws FieldNotFound {
		return get(new quickfix.field.YieldRedemptionDate());
	}

	public boolean isSet(quickfix.field.YieldRedemptionDate field) {
		return isSetField(field);
	}

	public boolean isSetYieldRedemptionDate() {
		return isSetField(696);
	}

	public void set(quickfix.field.YieldRedemptionPrice value) {
		setField(value);
	}

	public quickfix.field.YieldRedemptionPrice get(quickfix.field.YieldRedemptionPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.YieldRedemptionPrice getYieldRedemptionPrice() throws FieldNotFound {
		return get(new quickfix.field.YieldRedemptionPrice());
	}

	public boolean isSet(quickfix.field.YieldRedemptionPrice field) {
		return isSetField(field);
	}

	public boolean isSetYieldRedemptionPrice() {
		return isSetField(697);
	}

	public void set(quickfix.field.YieldRedemptionPriceType value) {
		setField(value);
	}

	public quickfix.field.YieldRedemptionPriceType get(quickfix.field.YieldRedemptionPriceType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.YieldRedemptionPriceType getYieldRedemptionPriceType() throws FieldNotFound {
		return get(new quickfix.field.YieldRedemptionPriceType());
	}

	public boolean isSet(quickfix.field.YieldRedemptionPriceType field) {
		return isSetField(field);
	}

	public boolean isSetYieldRedemptionPriceType() {
		return isSetField(698);
	}

	public void set(quickfix.fix50sp2.component.Parties component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.Parties get(quickfix.fix50sp2.component.Parties component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.Parties getParties() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.Parties());
	}

	public void set(quickfix.field.NoPartyIDs value) {
		setField(value);
	}

	public quickfix.field.NoPartyIDs get(quickfix.field.NoPartyIDs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoPartyIDs getNoPartyIDs() throws FieldNotFound {
		return get(new quickfix.field.NoPartyIDs());
	}

	public boolean isSet(quickfix.field.NoPartyIDs field) {
		return isSetField(field);
	}

	public boolean isSetNoPartyIDs() {
		return isSetField(453);
	}

	public static class NoPartyIDs extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {448, 447, 452, 802, 0};

		public NoPartyIDs() {
			super(453, 448, ORDER);
		}
		
	public void set(quickfix.field.PartyID value) {
		setField(value);
	}

	public quickfix.field.PartyID get(quickfix.field.PartyID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PartyID getPartyID() throws FieldNotFound {
		return get(new quickfix.field.PartyID());
	}

	public boolean isSet(quickfix.field.PartyID field) {
		return isSetField(field);
	}

	public boolean isSetPartyID() {
		return isSetField(448);
	}

	public void set(quickfix.field.PartyIDSource value) {
		setField(value);
	}

	public quickfix.field.PartyIDSource get(quickfix.field.PartyIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PartyIDSource getPartyIDSource() throws FieldNotFound {
		return get(new quickfix.field.PartyIDSource());
	}

	public boolean isSet(quickfix.field.PartyIDSource field) {
		return isSetField(field);
	}

	public boolean isSetPartyIDSource() {
		return isSetField(447);
	}

	public void set(quickfix.field.PartyRole value) {
		setField(value);
	}

	public quickfix.field.PartyRole get(quickfix.field.PartyRole value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PartyRole getPartyRole() throws FieldNotFound {
		return get(new quickfix.field.PartyRole());
	}

	public boolean isSet(quickfix.field.PartyRole field) {
		return isSetField(field);
	}

	public boolean isSetPartyRole() {
		return isSetField(452);
	}

	public void set(quickfix.fix50sp2.component.PtysSubGrp component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.PtysSubGrp get(quickfix.fix50sp2.component.PtysSubGrp component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.PtysSubGrp getPtysSubGrp() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.PtysSubGrp());
	}

	public void set(quickfix.field.NoPartySubIDs value) {
		setField(value);
	}

	public quickfix.field.NoPartySubIDs get(quickfix.field.NoPartySubIDs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoPartySubIDs getNoPartySubIDs() throws FieldNotFound {
		return get(new quickfix.field.NoPartySubIDs());
	}

	public boolean isSet(quickfix.field.NoPartySubIDs field) {
		return isSetField(field);
	}

	public boolean isSetNoPartySubIDs() {
		return isSetField(802);
	}

	public static class NoPartySubIDs extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {523, 803, 0};

		public NoPartySubIDs() {
			super(802, 523, ORDER);
		}
		
	public void set(quickfix.field.PartySubID value) {
		setField(value);
	}

	public quickfix.field.PartySubID get(quickfix.field.PartySubID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PartySubID getPartySubID() throws FieldNotFound {
		return get(new quickfix.field.PartySubID());
	}

	public boolean isSet(quickfix.field.PartySubID field) {
		return isSetField(field);
	}

	public boolean isSetPartySubID() {
		return isSetField(523);
	}

	public void set(quickfix.field.PartySubIDType value) {
		setField(value);
	}

	public quickfix.field.PartySubIDType get(quickfix.field.PartySubIDType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PartySubIDType getPartySubIDType() throws FieldNotFound {
		return get(new quickfix.field.PartySubIDType());
	}

	public boolean isSet(quickfix.field.PartySubIDType field) {
		return isSetField(field);
	}

	public boolean isSetPartySubIDType() {
		return isSetField(803);
	}

	}

	}

	}

	public void set(quickfix.field.Text value) {
		setField(value);
	}

	public quickfix.field.Text get(quickfix.field.Text value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Text getText() throws FieldNotFound {
		return get(new quickfix.field.Text());
	}

	public boolean isSet(quickfix.field.Text field) {
		return isSetField(field);
	}

	public boolean isSetText() {
		return isSetField(58);
	}

	public void set(quickfix.field.EncodedTextLen value) {
		setField(value);
	}

	public quickfix.field.EncodedTextLen get(quickfix.field.EncodedTextLen value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EncodedTextLen getEncodedTextLen() throws FieldNotFound {
		return get(new quickfix.field.EncodedTextLen());
	}

	public boolean isSet(quickfix.field.EncodedTextLen field) {
		return isSetField(field);
	}

	public boolean isSetEncodedTextLen() {
		return isSetField(354);
	}

	public void set(quickfix.field.EncodedText value) {
		setField(value);
	}

	public quickfix.field.EncodedText get(quickfix.field.EncodedText value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EncodedText getEncodedText() throws FieldNotFound {
		return get(new quickfix.field.EncodedText());
	}

	public boolean isSet(quickfix.field.EncodedText field) {
		return isSetField(field);
	}

	public boolean isSetEncodedText() {
		return isSetField(355);
	}

}
