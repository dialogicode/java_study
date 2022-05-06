package me.gof_design_pattern.creational.factory_method;

public class Bow implements Item {
	@Override
	public void use() {
		System.out.println("화살로 멀리서 쐈다.");
	}
}
