
package quickfix.fix50sp2.component;

import quickfix.FieldNotFound;

import quickfix.Group;

public class AllocAckGrp extends quickfix.MessageComponent {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "";
	
	private int[] componentFields = {  };
	protected int[] getFields() { return componentFields; }
	private int[] componentGroups = { 78,  };
	protected int[] getGroupFields() { return componentGroups; }
	

	public AllocAckGrp() {
		super();
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
		private static final int[] ORDER = {79, 661, 366, 1047, 467, 776, 539, 161, 360, 361, 989, 993, 992, 80, 0};

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

	}

}
