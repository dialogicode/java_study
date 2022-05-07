package me.study.behavioural.interpreter;

public interface Expression {
	boolean parse(Context context);
	boolean run();
}
