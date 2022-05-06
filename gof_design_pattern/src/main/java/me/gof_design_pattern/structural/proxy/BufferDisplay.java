package me.gof_design_pattern.structural.proxy;

import java.util.ArrayList;

public class BufferDisplay implements Display {
	private final ArrayList<String> buffer = new ArrayList<>();
	private final int bufferSize;
	private ScreenDisplay screen;

	public BufferDisplay(int bufferSize) {
		this.bufferSize = bufferSize;
	}

	@Override
	public void print(String content) {
		buffer.add(content);
		if (buffer.size() == bufferSize) {
			flush();
		}
	}

	public void flush() {
		if (screen == null) {
			screen = new ScreenDisplay();
		}
		String lines = String.join("\n", buffer);
		screen.print(lines);
		buffer.clear();
	}
}
