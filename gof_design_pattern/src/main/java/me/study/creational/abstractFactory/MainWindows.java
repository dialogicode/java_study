package me.study.creational.abstractFactory;

import me.study.creational.abstractFactory.component.Button;
import me.study.creational.abstractFactory.component.CheckBox;
import me.study.creational.abstractFactory.component.TextEditor;
import me.study.creational.abstractFactory.factory.ComponentFactory;
import me.study.creational.abstractFactory.factory.WindowsFactory;

public class MainWindows {
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
