
package quickfix.fix50.component;

import quickfix.FieldNotFound;

import quickfix.Group;

public class ExpirationQty extends quickfix.MessageComponent {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "";
	
	private int[] componentFields = {  };
	protected int[] getFields() { return componentFields; }
	private int[] componentGroups = { 981,  };
	protected int[] getGroupFields() { return componentGroups; }
	

	public ExpirationQty() {
		super();
	}
	
	public void set(quickfix.field.NoExpiration value) {
		setField(value);
	}

	public quickfix.field.NoExpiration get(quickfix.field.NoExpiration value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoExpiration getNoExpiration() throws FieldNotFound {
		return get(new quickfix.field.NoExpiration());
	}

	public boolean isSet(quickfix.field.NoExpiration field) {
		return isSetField(field);
	}

	public boolean isSetNoExpiration() {
		return isSetField(981);
	}

	public static class NoExpiration extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {982, 983, 0};

		public NoExpiration() {
			super(981, 982, ORDER);
		}
		
	public void set(quickfix.field.ExpType value) {
		setField(value);
	}

	public quickfix.field.ExpType get(quickfix.field.ExpType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ExpType getExpType() throws FieldNotFound {
		return get(new quickfix.field.ExpType());
	}

	public boolean isSet(quickfix.field.ExpType field) {
		return isSetField(field);
	}

	public boolean isSetExpType() {
		return isSetField(982);
	}

	public void set(quickfix.field.ExpQty value) {
		setField(value);
	}

	public quickfix.field.ExpQty get(quickfix.field.ExpQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ExpQty getExpQty() throws FieldNotFound {
		return get(new quickfix.field.ExpQty());
	}

	public boolean isSet(quickfix.field.ExpQty field) {
		return isSetField(field);
	}

	public boolean isSetExpQty() {
		return isSetField(983);
	}

	}

}
