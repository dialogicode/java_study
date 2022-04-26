package creational.abstractFactory.component;

public class WindowsTextEditor extends TextEditor {

	public WindowsTextEditor(String value) {
		super(value);
	}

	@Override
	public void render() {
		System.out.println("Windows 랜더링 API를 이용해 " + this.value + "값을 가진" + " 텍스트에디트를 그립니다.");
	}

}
