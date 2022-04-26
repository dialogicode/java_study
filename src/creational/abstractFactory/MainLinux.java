package creational.abstractFactory;

import creational.abstractFactory.component.Button;
import creational.abstractFactory.component.CheckBox;
import creational.abstractFactory.component.TextEditor;
import creational.abstractFactory.factory.ComponentFactory;
import creational.abstractFactory.factory.LinuxFactory;

public class MainLinux {
	public static void main(String[] args) {
		ComponentFactory factory = new LinuxFactory();

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
