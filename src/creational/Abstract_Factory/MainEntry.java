package creational.Abstract_Factory;

public class MainEntry {
	public static void main(String[] args) {
		ComponentFactory factory = new WindowsFactory();

		Button button = factory.createButton("확인");
		CheckBox checkBox = factory.createCheckBox(false);
		TextEditor textEditor = factory.creatTextEditor("디자인패턴");

		button.render();
		checkBox.render();
		textEditor.render();

		button.clickEvent();
		checkBox.setChecked(true);
		textEditor.setValue("GoF의 디자인 패턴");
	}
}
