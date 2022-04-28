package structural.decorator;

public class BoxDecorator extends Decorator {
	public BoxDecorator(Item item) {
		super(item);
	}

	@Override
	public int getLinesCount() {
		return item.getLinesCount() + 2;
	}

	@Override
	public int getMaxLength() {
		return item.getMaxLength() + 2;
	}

	@Override
	public int getLength(int index) {
		return item.getLength(index) + 2;
	}

	@Override
	public String getString(int index) {
		int maxWidth = this.getMaxLength();
		StringBuilder sb = new StringBuilder();

		if (index == 0 || index == getLinesCount() - 1) {
			sb.append('+');
			sb.append("-".repeat(maxWidth - 2));
			sb.append('+');
		} else {
			sb.append('|');
			sb.append(item.getString(index - 1));
			sb.append(" ".repeat(maxWidth - getLength(index - 1)));
			sb.append('|');

		}

		return sb.toString();
	}
}
