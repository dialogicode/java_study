package me.study.creational.abstractFactory.factory;

import me.study.creational.abstractFactory.component.Button;
import me.study.creational.abstractFactory.component.CheckBox;
import me.study.creational.abstractFactory.component.LinuxButton;
import me.study.creational.abstractFactory.component.LinuxCheckBox;
import me.study.creational.abstractFactory.component.LinuxTextEditor;
import me.study.creational.abstractFactory.component.TextEditor;

public class LinuxFactory extends ComponentFactory {

	@Override
	public Button createButton(String caption) {
		return new LinuxButton(caption);
	}

	@Override
	public CheckBox createCheckBox(boolean bChecked) {
		return new LinuxCheckBox(bChecked);
	}

	@Override
	public TextEditor creatTextEditor(String value) {
		return new LinuxTextEditor(value);
	}

}
