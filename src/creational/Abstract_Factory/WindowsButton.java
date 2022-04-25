package creational.abstract_Factory;

public class WindowsButton extends Button {

	public WindowsButton(String caption) {
		super(caption);
	}

	@Override
	void render() {
		System.out.println("Windows 랜더링 API를 이용해 " + this.caption + " 버튼을 그립니다.");
	}
	
}
