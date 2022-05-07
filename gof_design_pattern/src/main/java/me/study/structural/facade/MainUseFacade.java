package me.study.structural.facade;

public class MainUseFacade {
	public static void main(String[] args) {
		Facade facade = new Facade();
		String name = "Dorosh";
		facade.run(name);
	}
}
