package structural.flyweight;

public class MainEntry {
	public static void main(String[] args) {
		// normal();
		useFlyweight();
	}

	public static void normal() {
		Flyweight flyweight = null;

		flyweight = new Flyweight("A");
		System.out.println(flyweight);

		flyweight = new Flyweight("A");
		System.out.println(flyweight);

		flyweight = new Flyweight("A");
		System.out.println(flyweight);

		flyweight = new Flyweight("B");
		System.out.println(flyweight);

		flyweight = new Flyweight("B");
		System.out.println(flyweight);

		flyweight = new Flyweight("A");
		System.out.println(flyweight);
	}

	public static void useFlyweight() {
		FlyweightFactory factory = new FlyweightFactory();

		Flyweight flyweight = factory.getFlyweight("A");
		System.out.println(flyweight);

		flyweight = factory.getFlyweight("A");
		System.out.println(flyweight);

		flyweight = factory.getFlyweight("A");
		System.out.println(flyweight);

		flyweight = factory.getFlyweight("B");
		System.out.println(flyweight);

		flyweight = factory.getFlyweight("B");
		System.out.println(flyweight);

		flyweight = factory.getFlyweight("A");
		System.out.println(flyweight);
	}
}
