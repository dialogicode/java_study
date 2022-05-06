package me.gof_design_pattern.structural.adapter;

import java.util.ArrayList;

public class MainEntry {
	public static void main(String[] args) {
		ArrayList<Animal> animals = new ArrayList<>();
		animals.add(new Dog("댕이"));
		animals.add(new Cat("솜털이"));
		animals.add(new Cat("츄츄"));

		// animals.add(new Tiger("타이온")); // 타이거 클래스를 바로 이용하지 못한다
		animals.add(new TigerAdapter("타이온"));

		animals.forEach(animal -> {
			animal.sound();
		});
	}
}
