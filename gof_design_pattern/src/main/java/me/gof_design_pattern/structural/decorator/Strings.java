package me.gof_design_pattern.structural.decorator;

import java.util.ArrayList;

public class Strings extends Item {
	private final ArrayList<String> strings = new ArrayList<>();

	public void add(String item) {
		strings.add(item);
	}

	@Override
	public int getLinesCount() {
		return strings.size();
	}

	@Override
	public int getMaxLength() {
		int maxWidth = 0;

		for (String string : strings) {
			int width = string.length();
			if (width > maxWidth) maxWidth = width;
		}

		return maxWidth;
	}

	@Override
	public int getLength(int index) {
		return strings.get(index).length();
	}

	@Override
	public String getString(int index) {
		return strings.get(index);
	}
}
