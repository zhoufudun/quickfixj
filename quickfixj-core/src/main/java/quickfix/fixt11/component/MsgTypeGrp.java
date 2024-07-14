
package quickfix.fixt11.component;

import quickfix.FieldNotFound;

import quickfix.Group;

public class MsgTypeGrp extends quickfix.MessageComponent {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "";
	
	private int[] componentFields = {  };
	protected int[] getFields() { return componentFields; }
	private int[] componentGroups = { 384,  };
	protected int[] getGroupFields() { return componentGroups; }
	

	public MsgTypeGrp() {
		super();
	}
	
	public void set(quickfix.field.NoMsgTypes value) {
		setField(value);
	}

	public quickfix.field.NoMsgTypes get(quickfix.field.NoMsgTypes value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoMsgTypes getNoMsgTypes() throws FieldNotFound {
		return get(new quickfix.field.NoMsgTypes());
	}

	public boolean isSet(quickfix.field.NoMsgTypes field) {
		return isSetField(field);
	}

	public boolean isSetNoMsgTypes() {
		return isSetField(384);
	}

	public static class NoMsgTypes extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {372, 385, 1130, 1406, 1131, 1410, 0};

		public NoMsgTypes() {
			super(384, 372, ORDER);
		}
		
	public void set(quickfix.field.RefMsgType value) {
		setField(value);
	}

	public quickfix.field.RefMsgType get(quickfix.field.RefMsgType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.RefMsgType getRefMsgType() throws FieldNotFound {
		return get(new quickfix.field.RefMsgType());
	}

	public boolean isSet(quickfix.field.RefMsgType field) {
		return isSetField(field);
	}

	public boolean isSetRefMsgType() {
		return isSetField(372);
	}

	public void set(quickfix.field.MsgDirection value) {
		setField(value);
	}

	public quickfix.field.MsgDirection get(quickfix.field.MsgDirection value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MsgDirection getMsgDirection() throws FieldNotFound {
		return get(new quickfix.field.MsgDirection());
	}

	public boolean isSet(quickfix.field.MsgDirection field) {
		return isSetField(field);
	}

	public boolean isSetMsgDirection() {
		return isSetField(385);
	}

	public void set(quickfix.field.RefApplVerID value) {
		setField(value);
	}

	public quickfix.field.RefApplVerID get(quickfix.field.RefApplVerID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.RefApplVerID getRefApplVerID() throws FieldNotFound {
		return get(new quickfix.field.RefApplVerID());
	}

	public boolean isSet(quickfix.field.RefApplVerID field) {
		return isSetField(field);
	}

	public boolean isSetRefApplVerID() {
		return isSetField(1130);
	}

	public void set(quickfix.field.RefApplExtID value) {
		setField(value);
	}

	public quickfix.field.RefApplExtID get(quickfix.field.RefApplExtID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.RefApplExtID getRefApplExtID() throws FieldNotFound {
		return get(new quickfix.field.RefApplExtID());
	}

	public boolean isSet(quickfix.field.RefApplExtID field) {
		return isSetField(field);
	}

	public boolean isSetRefApplExtID() {
		return isSetField(1406);
	}

	public void set(quickfix.field.RefCstmApplVerID value) {
		setField(value);
	}

	public quickfix.field.RefCstmApplVerID get(quickfix.field.RefCstmApplVerID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.RefCstmApplVerID getRefCstmApplVerID() throws FieldNotFound {
		return get(new quickfix.field.RefCstmApplVerID());
	}

	public boolean isSet(quickfix.field.RefCstmApplVerID field) {
		return isSetField(field);
	}

	public boolean isSetRefCstmApplVerID() {
		return isSetField(1131);
	}

	public void set(quickfix.field.DefaultVerIndicator value) {
		setField(value);
	}

	public quickfix.field.DefaultVerIndicator get(quickfix.field.DefaultVerIndicator value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DefaultVerIndicator getDefaultVerIndicator() throws FieldNotFound {
		return get(new quickfix.field.DefaultVerIndicator());
	}

	public boolean isSet(quickfix.field.DefaultVerIndicator field) {
		return isSetField(field);
	}

	public boolean isSetDefaultVerIndicator() {
		return isSetField(1410);
	}

	}

}
