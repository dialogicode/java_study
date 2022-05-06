package me.gof_design_pattern.behavioural.interpreter;

public interface Expression {
	boolean parse(Context context);
	boolean run();
}
