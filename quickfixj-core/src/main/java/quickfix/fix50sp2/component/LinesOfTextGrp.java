
package quickfix.fix50sp2.component;

import quickfix.FieldNotFound;

import quickfix.Group;

public class LinesOfTextGrp extends quickfix.MessageComponent {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "";
	
	private int[] componentFields = {  };
	protected int[] getFields() { return componentFields; }
	private int[] componentGroups = { 33,  };
	protected int[] getGroupFields() { return componentGroups; }
	

	public LinesOfTextGrp() {
		super();
	}
	
	public void set(quickfix.field.NoLinesOfText value) {
		setField(value);
	}

	public quickfix.field.NoLinesOfText get(quickfix.field.NoLinesOfText value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoLinesOfText getNoLinesOfText() throws FieldNotFound {
		return get(new quickfix.field.NoLinesOfText());
	}

	public boolean isSet(quickfix.field.NoLinesOfText field) {
		return isSetField(field);
	}

	public boolean isSetNoLinesOfText() {
		return isSetField(33);
	}

	public static class NoLinesOfText extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {58, 354, 355, 0};

		public NoLinesOfText() {
			super(33, 58, ORDER);
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

}
