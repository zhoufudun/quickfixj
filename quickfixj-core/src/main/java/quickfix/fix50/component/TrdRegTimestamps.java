
package quickfix.fix50.component;

import quickfix.FieldNotFound;

import quickfix.Group;

public class TrdRegTimestamps extends quickfix.MessageComponent {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "";
	
	private int[] componentFields = {  };
	protected int[] getFields() { return componentFields; }
	private int[] componentGroups = { 768,  };
	protected int[] getGroupFields() { return componentGroups; }
	

	public TrdRegTimestamps() {
		super();
	}
	
	public void set(quickfix.field.NoTrdRegTimestamps value) {
		setField(value);
	}

	public quickfix.field.NoTrdRegTimestamps get(quickfix.field.NoTrdRegTimestamps value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoTrdRegTimestamps getNoTrdRegTimestamps() throws FieldNotFound {
		return get(new quickfix.field.NoTrdRegTimestamps());
	}

	public boolean isSet(quickfix.field.NoTrdRegTimestamps field) {
		return isSetField(field);
	}

	public boolean isSetNoTrdRegTimestamps() {
		return isSetField(768);
	}

	public static class NoTrdRegTimestamps extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {769, 770, 771, 1033, 1034, 1035, 0};

		public NoTrdRegTimestamps() {
			super(768, 769, ORDER);
		}
		
	public void set(quickfix.field.TrdRegTimestamp value) {
		setField(value);
	}

	public quickfix.field.TrdRegTimestamp get(quickfix.field.TrdRegTimestamp value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TrdRegTimestamp getTrdRegTimestamp() throws FieldNotFound {
		return get(new quickfix.field.TrdRegTimestamp());
	}

	public boolean isSet(quickfix.field.TrdRegTimestamp field) {
		return isSetField(field);
	}

	public boolean isSetTrdRegTimestamp() {
		return isSetField(769);
	}

	public void set(quickfix.field.TrdRegTimestampType value) {
		setField(value);
	}

	public quickfix.field.TrdRegTimestampType get(quickfix.field.TrdRegTimestampType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TrdRegTimestampType getTrdRegTimestampType() throws FieldNotFound {
		return get(new quickfix.field.TrdRegTimestampType());
	}

	public boolean isSet(quickfix.field.TrdRegTimestampType field) {
		return isSetField(field);
	}

	public boolean isSetTrdRegTimestampType() {
		return isSetField(770);
	}

	public void set(quickfix.field.TrdRegTimestampOrigin value) {
		setField(value);
	}

	public quickfix.field.TrdRegTimestampOrigin get(quickfix.field.TrdRegTimestampOrigin value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TrdRegTimestampOrigin getTrdRegTimestampOrigin() throws FieldNotFound {
		return get(new quickfix.field.TrdRegTimestampOrigin());
	}

	public boolean isSet(quickfix.field.TrdRegTimestampOrigin field) {
		return isSetField(field);
	}

	public boolean isSetTrdRegTimestampOrigin() {
		return isSetField(771);
	}

	public void set(quickfix.field.DeskType value) {
		setField(value);
	}

	public quickfix.field.DeskType get(quickfix.field.DeskType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DeskType getDeskType() throws FieldNotFound {
		return get(new quickfix.field.DeskType());
	}

	public boolean isSet(quickfix.field.DeskType field) {
		return isSetField(field);
	}

	public boolean isSetDeskType() {
		return isSetField(1033);
	}

	public void set(quickfix.field.DeskTypeSource value) {
		setField(value);
	}

	public quickfix.field.DeskTypeSource get(quickfix.field.DeskTypeSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DeskTypeSource getDeskTypeSource() throws FieldNotFound {
		return get(new quickfix.field.DeskTypeSource());
	}

	public boolean isSet(quickfix.field.DeskTypeSource field) {
		return isSetField(field);
	}

	public boolean isSetDeskTypeSource() {
		return isSetField(1034);
	}

	public void set(quickfix.field.DeskOrderHandlingInst value) {
		setField(value);
	}

	public quickfix.field.DeskOrderHandlingInst get(quickfix.field.DeskOrderHandlingInst value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DeskOrderHandlingInst getDeskOrderHandlingInst() throws FieldNotFound {
		return get(new quickfix.field.DeskOrderHandlingInst());
	}

	public boolean isSet(quickfix.field.DeskOrderHandlingInst field) {
		return isSetField(field);
	}

	public boolean isSetDeskOrderHandlingInst() {
		return isSetField(1035);
	}

	}

}
