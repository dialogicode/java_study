package me.gof_design_pattern.creational.abstractFactory;

import me.gof_design_pattern.creational.abstractFactory.component.Button;
import me.gof_design_pattern.creational.abstractFactory.component.CheckBox;
import me.gof_design_pattern.creational.abstractFactory.component.TextEditor;
import me.gof_design_pattern.creational.abstractFactory.factory.ComponentFactory;
import me.gof_design_pattern.creational.abstractFactory.factory.LinuxFactory;

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
