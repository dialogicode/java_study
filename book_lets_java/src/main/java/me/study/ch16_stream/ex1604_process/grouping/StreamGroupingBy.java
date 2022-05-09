package me.study.ch16_stream.ex1604_process.grouping;

import me.study.ch16_stream.ex1604_process.Circle;
import me.study.ch16_stream.ex1604_process.Rectangle;
import me.study.ch16_stream.ex1604_process.Shape;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamGroupingBy {
	public static void main (String[] args) {

		Shape s1 = new Rectangle(10, 3);
		Shape s2 = new Circle(10);
		Shape s3 = new Rectangle(20, 2);
		Shape s4 = new Circle(11);

		List<Shape> list = Arrays.asList(s1, s2, s3, s4);

		try {

			// 객체 타입으로 그룹핑 (Rectangle, Circle)
			Map<Object, List<Shape>> map = list.stream().collect(Collectors.groupingBy(f -> f.getClass()));

			System.out.println("사각형 출력");
			map.get(Class.forName("ch16_stream.ex1604_process.Rectangle")).stream().forEach(System.out::println);

			System.out.println("원 출력");
			map.get(Class.forName("ch16_stream.ex1604_process.Circle")).stream().forEach(System.out::println);

		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
}
