package creational.singleton;

public class King {
	private static King self = null;

	private King() {}

	public synchronized static King getInstance() {
		if (self == null) self = new King();
		return self;
	}

	public void say() {
		System.out.println("I am only one...");
	}
}
