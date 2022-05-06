package me.gof_design_pattern.creational.abstractFactory.factory;

import me.gof_design_pattern.creational.abstractFactory.component.Button;
import me.gof_design_pattern.creational.abstractFactory.component.CheckBox;
import me.gof_design_pattern.creational.abstractFactory.component.LinuxButton;
import me.gof_design_pattern.creational.abstractFactory.component.LinuxCheckBox;
import me.gof_design_pattern.creational.abstractFactory.component.LinuxTextEditor;
import me.gof_design_pattern.creational.abstractFactory.component.TextEditor;

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
