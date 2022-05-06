package me.gof_design_pattern.creational.abstractFactory.factory;

import me.gof_design_pattern.creational.abstractFactory.component.Button;
import me.gof_design_pattern.creational.abstractFactory.component.CheckBox;
import me.gof_design_pattern.creational.abstractFactory.component.TextEditor;
import me.gof_design_pattern.creational.abstractFactory.component.WindowsButton;
import me.gof_design_pattern.creational.abstractFactory.component.WindowsCheckBox;
import me.gof_design_pattern.creational.abstractFactory.component.WindowsTextEditor;

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
