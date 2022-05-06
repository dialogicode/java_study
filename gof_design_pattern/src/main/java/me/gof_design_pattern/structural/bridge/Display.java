package me.gof_design_pattern.structural.bridge;

public interface Display {
	void title(Draft draft);
	void author(Draft draft);
	void content(Draft draft);
}
