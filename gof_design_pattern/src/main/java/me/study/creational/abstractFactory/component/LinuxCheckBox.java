package me.study.creational.abstractFactory.component;

public class LinuxCheckBox extends CheckBox {

	public LinuxCheckBox(boolean bChecked) {
		super(bChecked);
	}

	@Override
	public void render() {
		System.out.println("Linux 랜더링 API를 이용해 " + (this.bChecked ? "체크된" : "체크 안된") + " 체크 박스를 그립니다.");
	}

}
