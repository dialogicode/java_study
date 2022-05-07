package me.study.structural.composite;

public abstract class Unit {
	private final String name;

	public Unit(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return name + "(" + getSize() + ")";
	}

	public abstract int getSize();
}
