package me.study.structural.decorator;

public class Main {
	public static void main(String[] args) {
		Strings strings = new Strings();
		strings.add("Hello~");
		strings.add("My Name is Kim Min Guk.");
		strings.add("Design-Pattern is powerful tool.");

		strings.print();
		System.out.println();
		
		Item decorator = null;
		decorator = new SideDecorator(strings, '\"');
		decorator.print();
		System.out.println();

		decorator = new LineNumberDecorator(decorator);
		decorator.print();
		System.out.println();

		decorator = new BoxDecorator(decorator);
		decorator.print();
	}
}
