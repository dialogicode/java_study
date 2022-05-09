package me.study.ch16_stream.ex1604_process.sorting;

import me.study.ch16_stream.ex1604_process.Circle;
import me.study.ch16_stream.ex1604_process.Rectangle;
import me.study.ch16_stream.ex1604_process.Shape;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamOrder3 {
	public static void main (String[] args) {

		// 둘레 기준으로 정렬하고 싶은 경우

		Shape s1 = new Rectangle(10, 3);
		Shape s2 = new Circle(10);
		Shape s3 = new Rectangle(20, 2);
		Shape s4 = new Circle(11);

		List<Shape> list = Arrays.asList(s1, s2, s3, s4);

		System.out.println("정렬하지 않고 출력");
		list.stream().forEach(System.out::println);

		System.out.println("둘레(length()) 순으로 정렬");
		System.out.println("함수적 인터페이스로 구현");
		list.stream().sorted(new Comparator<Shape>() {
			@Override
			public int compare (Shape s1, Shape s2) {
				return (int) (s1.length() - s2.length());
			}
		}).forEach(System.out::println);

		System.out.println("람다 표현식을 이용하여 둘레순으로 정렬");
		list.stream().sorted((a, b) -> (int) (a.length() - b.length())).forEach(System.out::println);
	}
}
