package me.study.ch16_stream.ex1604_process.iterating;

import me.study.ch16_stream.ex1604_process.Circle;
import me.study.ch16_stream.ex1604_process.Rectangle;
import me.study.ch16_stream.ex1604_process.Shape;

import java.util.Arrays;
import java.util.List;

public class StreamPeek {
	public static void main (String[] args) {
		Shape s1 = new Rectangle(10, 3);
		Shape s2 = new Circle(10);
		Shape s3 = new Rectangle(20, 2);
		Shape s4 = new Circle(11);

		List<Shape> list = Arrays.asList(s1, s2, s3, s4);

		// 최종 처리 메서드가 호출 되지 않았기 때문에 peek() 메서드 작동 안함
		// list.parallelStream().mapToDouble(value -> value.area()).peek(System.out::println);

		// 최종 처리 메서드인 sum() 이 호출되어 peek() 도 동작함
		list.parallelStream().mapToDouble(value -> value.area()).peek(System.out::println).sum();

		// sum() 메서드는 최종 처리 메스드이므로 forEach()는 호출할 수 없다.
	}
}

/* 요소 전체 반복자 */
// forEach()    최종 처리 반복자
// peek()       중간 단계 반복자 - 중간 단계에서 전체 요소를 반복하면서 추가 작업을 하기 위해 사용
//                             - 최종 처리 메서드가 호출 되어야 동작
