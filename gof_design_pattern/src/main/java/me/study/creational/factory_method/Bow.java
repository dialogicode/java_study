package me.study.creational.factory_method;

public class Bow implements Item {
	@Override
	public void use() {
		System.out.println("화살로 멀리서 쐈다.");
	}
}
