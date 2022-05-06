package me.gof_design_pattern.creational.abstractFactory.component;

public class WindowsButton extends Button {

	public WindowsButton(String caption) {
		super(caption);
	}

	@Override
	public void render() {
		System.out.println("Windows 랜더링 API를 이용해 " + this.caption + " 버튼을 그립니다.");
	}

}
