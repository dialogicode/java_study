package creational.Abstract_Factory;

public abstract class ComponentFactory { // interface 로 정의해도 된다
	public abstract Button createButton(String caption);
	public abstract CheckBox createCheckBox(boolean bChecked);
	public abstract TextEditor creatTextEditor(String value);
}
