package me.study.creational.abstractFactory.factory;

import me.study.creational.abstractFactory.component.Button;
import me.study.creational.abstractFactory.component.CheckBox;
import me.study.creational.abstractFactory.component.TextEditor;

public abstract class ComponentFactory { // interface 로 정의해도 된다
	public abstract Button createButton(String caption);

	public abstract CheckBox createCheckBox(boolean bChecked);

	public abstract TextEditor creatTextEditor(String value);
}
