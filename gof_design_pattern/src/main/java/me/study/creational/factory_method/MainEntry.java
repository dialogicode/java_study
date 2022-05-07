package me.study.creational.factory_method;

public class MainEntry {
	public static void main(String[] args) {
		Factory factory = new ItemFactory();

		Item item1 = factory.create("sword");
		if (item1 != null) item1.use();

		Item item2 = factory.create("sword");
		if (item2 != null) item2.use();

		Item item3 = factory.create("sword");
		if (item3 != null) item3.use();

		Item item4 = factory.create("sword");
		if (item4 != null) item4.use();

		Item item5 = factory.create("sword");
		if (item5 != null) item5.use();

		System.out.println();
		
		Item item6 = factory.create("shield");
		if (item6 != null) item6.use();

		Item item7 = factory.create("shield");
		if (item7 != null) item7.use();

		Item item8 = factory.create("shield");
		if (item8 != null) item8.use();

		Item item9 = factory.create("shield");
		if (item9 != null) item9.use();

		System.out.println();

		Item item10 = factory.create("bow");
		if (item10 != null) item10.use();

		Item item11 = factory.create("bow");
		if (item11 != null) item11.use();

		Item item12 = factory.create("bow");
		if (item12 != null) item12.use();

		Item item13 = factory.create("bow");
		if (item13 != null) item13.use();
	}
}
