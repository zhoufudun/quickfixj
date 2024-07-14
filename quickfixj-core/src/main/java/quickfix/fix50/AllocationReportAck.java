
package quickfix.fix50;

import quickfix.FieldNotFound;

import quickfix.Group;

public class AllocationReportAck extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "AT";
	

	public AllocationReportAck() {
		super();
		getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
	}
	
	public AllocationReportAck(quickfix.field.AllocReportID allocReportID, quickfix.field.AllocID allocID) {
		this();
		setField(allocReportID);
		setField(allocID);
	}
	
	public void set(quickfix.field.AllocReportID value) {
		setField(value);
	}

	public quickfix.field.AllocReportID get(quickfix.field.AllocReportID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.AllocReportID getAllocReportID() throws FieldNotFound {
		return get(new quickfix.field.AllocReportID());
	}

	public boolean isSet(quickfix.field.AllocReportID field) {
		return isSetField(field);
	}

	public boolean isSetAllocReportID() {
		return isSetField(755);
	}

	public void set(quickfix.field.AllocID value) {
		setField(value);
	}

	public quickfix.field.AllocID get(quickfix.field.AllocID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.AllocID getAllocID() throws FieldNotFound {
		return get(new quickfix.field.AllocID());
	}

	public boolean isSet(quickfix.field.AllocID field) {
		return isSetField(field);
	}

	public boolean isSetAllocID() {
		return isSetField(70);
	}

	public void set(quickfix.fix50.component.Parties component) {
		setComponent(component);
	}

	public quickfix.fix50.component.Parties get(quickfix.fix50.component.Parties component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50.component.Parties getParties() throws FieldNotFound {
		return get(new quickfix.fix50.component.Parties());
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

	public void set(quickfix.fix50.component.PtysSubGrp component) {
		setComponent(component);
	}

	public quickfix.fix50.component.PtysSubGrp get(quickfix.fix50.component.PtysSubGrp component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50.component.PtysSubGrp getPtysSubGrp() throws FieldNotFound {
		return get(new quickfix.fix50.component.PtysSubGrp());
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

	public void set(quickfix.field.SecondaryAllocID value) {
		setField(value);
	}

	public quickfix.field.SecondaryAllocID get(quickfix.field.SecondaryAllocID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SecondaryAllocID getSecondaryAllocID() throws FieldNotFound {
		return get(new quickfix.field.SecondaryAllocID());
	}

	public boolean isSet(quickfix.field.SecondaryAllocID field) {
		return isSetField(field);
	}

	public boolean isSetSecondaryAllocID() {
		return isSetField(793);
	}

	public void set(quickfix.field.TradeDate value) {
		setField(value);
	}

	public quickfix.field.TradeDate get(quickfix.field.TradeDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TradeDate getTradeDate() throws FieldNotFound {
		return get(new quickfix.field.TradeDate());
	}

	public boolean isSet(quickfix.field.TradeDate field) {
		return isSetField(field);
	}

	public boolean isSetTradeDate() {
		return isSetField(75);
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

	public void set(quickfix.field.AllocStatus value) {
		setField(value);
	}

	public quickfix.field.AllocStatus get(quickfix.field.AllocStatus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.AllocStatus getAllocStatus() throws FieldNotFound {
		return get(new quickfix.field.AllocStatus());
	}

	public boolean isSet(quickfix.field.AllocStatus field) {
		return isSetField(field);
	}

	public boolean isSetAllocStatus() {
		return isSetField(87);
	}

	public void set(quickfix.field.AllocRejCode value) {
		setField(value);
	}

	public quickfix.field.AllocRejCode get(quickfix.field.AllocRejCode value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.AllocRejCode getAllocRejCode() throws FieldNotFound {
		return get(new quickfix.field.AllocRejCode());
	}

	public boolean isSet(quickfix.field.AllocRejCode field) {
		return isSetField(field);
	}

	public boolean isSetAllocRejCode() {
		return isSetField(88);
	}

	public void set(quickfix.field.AllocReportType value) {
		setField(value);
	}

	public quickfix.field.AllocReportType get(quickfix.field.AllocReportType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.AllocReportType getAllocReportType() throws FieldNotFound {
		return get(new quickfix.field.AllocReportType());
	}

	public boolean isSet(quickfix.field.AllocReportType field) {
		return isSetField(field);
	}

	public boolean isSetAllocReportType() {
		return isSetField(794);
	}

	public void set(quickfix.field.AllocIntermedReqType value) {
		setField(value);
	}

	public quickfix.field.AllocIntermedReqType get(quickfix.field.AllocIntermedReqType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.AllocIntermedReqType getAllocIntermedReqType() throws FieldNotFound {
		return get(new quickfix.field.AllocIntermedReqType());
	}

	public boolean isSet(quickfix.field.AllocIntermedReqType field) {
		return isSetField(field);
	}

	public boolean isSetAllocIntermedReqType() {
		return isSetField(808);
	}

	public void set(quickfix.field.MatchStatus value) {
		setField(value);
	}

	public quickfix.field.MatchStatus get(quickfix.field.MatchStatus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MatchStatus getMatchStatus() throws FieldNotFound {
		return get(new quickfix.field.MatchStatus());
	}

	public boolean isSet(quickfix.field.MatchStatus field) {
		return isSetField(field);
	}

	public boolean isSetMatchStatus() {
		return isSetField(573);
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

	public void set(quickfix.fix50.component.AllocAckGrp component) {
		setComponent(component);
	}

	public quickfix.fix50.component.AllocAckGrp get(quickfix.fix50.component.AllocAckGrp component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50.component.AllocAckGrp getAllocAckGrp() throws FieldNotFound {
		return get(new quickfix.fix50.component.AllocAckGrp());
	}

	public void set(quickfix.field.NoAllocs value) {
		setField(value);
	}

	public quickfix.field.NoAllocs get(quickfix.field.NoAllocs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoAllocs getNoAllocs() throws FieldNotFound {
		return get(new quickfix.field.NoAllocs());
	}

	public boolean isSet(quickfix.field.NoAllocs field) {
		return isSetField(field);
	}

	public boolean isSetNoAllocs() {
		return isSetField(78);
	}

	public static class NoAllocs extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {79, 661, 366, 467, 776, 161, 360, 361, 989, 993, 992, 80, 539, 1047, 0};

		public NoAllocs() {
			super(78, 79, ORDER);
		}
		
	public void set(quickfix.field.AllocAccount value) {
		setField(value);
	}

	public quickfix.field.AllocAccount get(quickfix.field.AllocAccount value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.AllocAccount getAllocAccount() throws FieldNotFound {
		return get(new quickfix.field.AllocAccount());
	}

	public boolean isSet(quickfix.field.AllocAccount field) {
		return isSetField(field);
	}

	public boolean isSetAllocAccount() {
		return isSetField(79);
	}

	public void set(quickfix.field.AllocAcctIDSource value) {
		setField(value);
	}

	public quickfix.field.AllocAcctIDSource get(quickfix.field.AllocAcctIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.AllocAcctIDSource getAllocAcctIDSource() throws FieldNotFound {
		return get(new quickfix.field.AllocAcctIDSource());
	}

	public boolean isSet(quickfix.field.AllocAcctIDSource field) {
		return isSetField(field);
	}

	public boolean isSetAllocAcctIDSource() {
		return isSetField(661);
	}

	public void set(quickfix.field.AllocPrice value) {
		setField(value);
	}

	public quickfix.field.AllocPrice get(quickfix.field.AllocPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.AllocPrice getAllocPrice() throws FieldNotFound {
		return get(new quickfix.field.AllocPrice());
	}

	public boolean isSet(quickfix.field.AllocPrice field) {
		return isSetField(field);
	}

	public boolean isSetAllocPrice() {
		return isSetField(366);
	}

	public void set(quickfix.field.IndividualAllocID value) {
		setField(value);
	}

	public quickfix.field.IndividualAllocID get(quickfix.field.IndividualAllocID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.IndividualAllocID getIndividualAllocID() throws FieldNotFound {
		return get(new quickfix.field.IndividualAllocID());
	}

	public boolean isSet(quickfix.field.IndividualAllocID field) {
		return isSetField(field);
	}

	public boolean isSetIndividualAllocID() {
		return isSetField(467);
	}

	public void set(quickfix.field.IndividualAllocRejCode value) {
		setField(value);
	}

	public quickfix.field.IndividualAllocRejCode get(quickfix.field.IndividualAllocRejCode value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.IndividualAllocRejCode getIndividualAllocRejCode() throws FieldNotFound {
		return get(new quickfix.field.IndividualAllocRejCode());
	}

	public boolean isSet(quickfix.field.IndividualAllocRejCode field) {
		return isSetField(field);
	}

	public boolean isSetIndividualAllocRejCode() {
		return isSetField(776);
	}

	public void set(quickfix.field.AllocText value) {
		setField(value);
	}

	public quickfix.field.AllocText get(quickfix.field.AllocText value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.AllocText getAllocText() throws FieldNotFound {
		return get(new quickfix.field.AllocText());
	}

	public boolean isSet(quickfix.field.AllocText field) {
		return isSetField(field);
	}

	public boolean isSetAllocText() {
		return isSetField(161);
	}

	public void set(quickfix.field.EncodedAllocTextLen value) {
		setField(value);
	}

	public quickfix.field.EncodedAllocTextLen get(quickfix.field.EncodedAllocTextLen value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EncodedAllocTextLen getEncodedAllocTextLen() throws FieldNotFound {
		return get(new quickfix.field.EncodedAllocTextLen());
	}

	public boolean isSet(quickfix.field.EncodedAllocTextLen field) {
		return isSetField(field);
	}

	public boolean isSetEncodedAllocTextLen() {
		return isSetField(360);
	}

	public void set(quickfix.field.EncodedAllocText value) {
		setField(value);
	}

	public quickfix.field.EncodedAllocText get(quickfix.field.EncodedAllocText value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EncodedAllocText getEncodedAllocText() throws FieldNotFound {
		return get(new quickfix.field.EncodedAllocText());
	}

	public boolean isSet(quickfix.field.EncodedAllocText field) {
		return isSetField(field);
	}

	public boolean isSetEncodedAllocText() {
		return isSetField(361);
	}

	public void set(quickfix.field.SecondaryIndividualAllocID value) {
		setField(value);
	}

	public quickfix.field.SecondaryIndividualAllocID get(quickfix.field.SecondaryIndividualAllocID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SecondaryIndividualAllocID getSecondaryIndividualAllocID() throws FieldNotFound {
		return get(new quickfix.field.SecondaryIndividualAllocID());
	}

	public boolean isSet(quickfix.field.SecondaryIndividualAllocID field) {
		return isSetField(field);
	}

	public boolean isSetSecondaryIndividualAllocID() {
		return isSetField(989);
	}

	public void set(quickfix.field.AllocCustomerCapacity value) {
		setField(value);
	}

	public quickfix.field.AllocCustomerCapacity get(quickfix.field.AllocCustomerCapacity value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.AllocCustomerCapacity getAllocCustomerCapacity() throws FieldNotFound {
		return get(new quickfix.field.AllocCustomerCapacity());
	}

	public boolean isSet(quickfix.field.AllocCustomerCapacity field) {
		return isSetField(field);
	}

	public boolean isSetAllocCustomerCapacity() {
		return isSetField(993);
	}

	public void set(quickfix.field.IndividualAllocType value) {
		setField(value);
	}

	public quickfix.field.IndividualAllocType get(quickfix.field.IndividualAllocType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.IndividualAllocType getIndividualAllocType() throws FieldNotFound {
		return get(new quickfix.field.IndividualAllocType());
	}

	public boolean isSet(quickfix.field.IndividualAllocType field) {
		return isSetField(field);
	}

	public boolean isSetIndividualAllocType() {
		return isSetField(992);
	}

	public void set(quickfix.field.AllocQty value) {
		setField(value);
	}

	public quickfix.field.AllocQty get(quickfix.field.AllocQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.AllocQty getAllocQty() throws FieldNotFound {
		return get(new quickfix.field.AllocQty());
	}

	public boolean isSet(quickfix.field.AllocQty field) {
		return isSetField(field);
	}

	public boolean isSetAllocQty() {
		return isSetField(80);
	}

	public void set(quickfix.fix50.component.NestedParties component) {
		setComponent(component);
	}

	public quickfix.fix50.component.NestedParties get(quickfix.fix50.component.NestedParties component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50.component.NestedParties getNestedParties() throws FieldNotFound {
		return get(new quickfix.fix50.component.NestedParties());
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

	public void set(quickfix.fix50.component.NstdPtysSubGrp component) {
		setComponent(component);
	}

	public quickfix.fix50.component.NstdPtysSubGrp get(quickfix.fix50.component.NstdPtysSubGrp component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50.component.NstdPtysSubGrp getNstdPtysSubGrp() throws FieldNotFound {
		return get(new quickfix.fix50.component.NstdPtysSubGrp());
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

	public void set(quickfix.field.AllocPositionEffect value) {
		setField(value);
	}

	public quickfix.field.AllocPositionEffect get(quickfix.field.AllocPositionEffect value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.AllocPositionEffect getAllocPositionEffect() throws FieldNotFound {
		return get(new quickfix.field.AllocPositionEffect());
	}

	public boolean isSet(quickfix.field.AllocPositionEffect field) {
		return isSetField(field);
	}

	public boolean isSetAllocPositionEffect() {
		return isSetField(1047);
	}

	}

	public void set(quickfix.field.ClearingBusinessDate value) {
		setField(value);
	}

	public quickfix.field.ClearingBusinessDate get(quickfix.field.ClearingBusinessDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ClearingBusinessDate getClearingBusinessDate() throws FieldNotFound {
		return get(new quickfix.field.ClearingBusinessDate());
	}

	public boolean isSet(quickfix.field.ClearingBusinessDate field) {
		return isSetField(field);
	}

	public boolean isSetClearingBusinessDate() {
		return isSetField(715);
	}

	public void set(quickfix.field.AvgPxIndicator value) {
		setField(value);
	}

	public quickfix.field.AvgPxIndicator get(quickfix.field.AvgPxIndicator value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.AvgPxIndicator getAvgPxIndicator() throws FieldNotFound {
		return get(new quickfix.field.AvgPxIndicator());
	}

	public boolean isSet(quickfix.field.AvgPxIndicator field) {
		return isSetField(field);
	}

	public boolean isSetAvgPxIndicator() {
		return isSetField(819);
	}

	public void set(quickfix.field.Quantity value) {
		setField(value);
	}

	public quickfix.field.Quantity get(quickfix.field.Quantity value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Quantity getQuantity() throws FieldNotFound {
		return get(new quickfix.field.Quantity());
	}

	public boolean isSet(quickfix.field.Quantity field) {
		return isSetField(field);
	}

	public boolean isSetQuantity() {
		return isSetField(53);
	}

	public void set(quickfix.field.AllocTransType value) {
		setField(value);
	}

	public quickfix.field.AllocTransType get(quickfix.field.AllocTransType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.AllocTransType getAllocTransType() throws FieldNotFound {
		return get(new quickfix.field.AllocTransType());
	}

	public boolean isSet(quickfix.field.AllocTransType field) {
		return isSetField(field);
	}

	public boolean isSetAllocTransType() {
		return isSetField(71);
	}

}
