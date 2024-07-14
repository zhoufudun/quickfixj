
package quickfix.fix50.component;

import quickfix.FieldNotFound;

import quickfix.Group;

public class HopGrp extends quickfix.MessageComponent {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "";
	
	private int[] componentFields = {  };
	protected int[] getFields() { return componentFields; }
	private int[] componentGroups = { 627,  };
	protected int[] getGroupFields() { return componentGroups; }
	

	public HopGrp() {
		super();
	}
	
	public void set(quickfix.field.NoHops value) {
		setField(value);
	}

	public quickfix.field.NoHops get(quickfix.field.NoHops value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoHops getNoHops() throws FieldNotFound {
		return get(new quickfix.field.NoHops());
	}

	public boolean isSet(quickfix.field.NoHops field) {
		return isSetField(field);
	}

	public boolean isSetNoHops() {
		return isSetField(627);
	}

	public static class NoHops extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {628, 629, 630, 0};

		public NoHops() {
			super(627, 628, ORDER);
		}
		
	public void set(quickfix.field.HopCompID value) {
		setField(value);
	}

	public quickfix.field.HopCompID get(quickfix.field.HopCompID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.HopCompID getHopCompID() throws FieldNotFound {
		return get(new quickfix.field.HopCompID());
	}

	public boolean isSet(quickfix.field.HopCompID field) {
		return isSetField(field);
	}

	public boolean isSetHopCompID() {
		return isSetField(628);
	}

	public void set(quickfix.field.HopSendingTime value) {
		setField(value);
	}

	public quickfix.field.HopSendingTime get(quickfix.field.HopSendingTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.HopSendingTime getHopSendingTime() throws FieldNotFound {
		return get(new quickfix.field.HopSendingTime());
	}

	public boolean isSet(quickfix.field.HopSendingTime field) {
		return isSetField(field);
	}

	public boolean isSetHopSendingTime() {
		return isSetField(629);
	}

	public void set(quickfix.field.HopRefID value) {
		setField(value);
	}

	public quickfix.field.HopRefID get(quickfix.field.HopRefID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.HopRefID getHopRefID() throws FieldNotFound {
		return get(new quickfix.field.HopRefID());
	}

	public boolean isSet(quickfix.field.HopRefID field) {
		return isSetField(field);
	}

	public boolean isSetHopRefID() {
		return isSetField(630);
	}

	}

}
