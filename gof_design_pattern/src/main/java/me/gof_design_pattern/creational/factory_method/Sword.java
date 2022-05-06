package me.gof_design_pattern.creational.factory_method;

public class Sword implements Item {
	@Override
	public void use() {
		System.out.println("칼로 샥 베었다");
	}
}
