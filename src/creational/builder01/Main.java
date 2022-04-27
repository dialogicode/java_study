package creational.builder01;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		// 객체 생성 방식1
		Car car1 = new Car("V7", true, "Black", true, false);

		/* 객체 생성 방식2
		Builder 객체 생성 후 바로 메서드를 연속적으로 호출
		객체의 스펙을 하나하나 지정하고 객체 생성 시기를 조절
		이후 build 메서드로 원하는 객체 생성 */

		Car car2 = new CarBuilder()
				.setAEB(false)
				.setAirbag(false)
				.setCameraSensor(true)
				.setColor("White")
				.setEngine("V9")
				.build();

		CarBuilder builder = new CarBuilder()
				.setAEB(false)
				//.setAirbag(false)
				.setCameraSensor(true)
				.setColor("White")
				.setEngine("V9");
		//.build();

		Random random = new Random();
		Car car3 = builder
				// 50% 확률로 에어백 장착
				.setAirbag(random.nextInt(2) == 0)
				.build();

		System.out.println(car1);
		System.out.println(car2);
		System.out.println(car3);
	}
}
