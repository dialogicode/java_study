package me.study.creational.builder02;

public class Data {
	private final String name;
	private final int age;

	public Data(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}
