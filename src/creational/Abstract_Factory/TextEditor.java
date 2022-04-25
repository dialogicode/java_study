package creational.abstract_Factory;

public abstract class TextEditor {
	protected String value;

	public TextEditor(String value) {
		this.value = value;
	}

	public void setValue(String value) {
		this.value = value;
		render();
	}

	public abstract void render();
}
