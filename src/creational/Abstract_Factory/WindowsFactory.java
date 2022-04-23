package creational.Abstract_Factory;

public class WindowsFactory extends ComponentFactory{

	@Override
	public Button createButton(String caption) {
		return new WindowsButton(caption);
	}

	@Override
	public CheckBox createCheckBox(boolean bChecked) {
		return new WindowsCheckBox(bChecked);
	}

	@Override
	public TextEditor creatTextEditor(String value) {
		return new WindowsTextEditor(value);
	}
	
}
