package me.study.creational.abstractFactory.factory;

import me.study.creational.abstractFactory.component.Button;
import me.study.creational.abstractFactory.component.CheckBox;
import me.study.creational.abstractFactory.component.TextEditor;
import me.study.creational.abstractFactory.component.WindowsButton;
import me.study.creational.abstractFactory.component.WindowsCheckBox;
import me.study.creational.abstractFactory.component.WindowsTextEditor;

public class WindowsFactory extends ComponentFactory {

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
