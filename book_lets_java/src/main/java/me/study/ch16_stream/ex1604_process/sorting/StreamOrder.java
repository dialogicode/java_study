package me.study.ch16_stream.ex1604_process.sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamOrder {
	public static void main (String[] args) {

		List<String> list = Arrays.asList("홍길동", "김유신", "이순신", "유관순");

		System.out.println("기본 정렬");
		list.stream().sorted().forEach(System.out::println);
		System.out.println();

		System.out.println("역순 정렬");
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		System.out.println();
	}
}

/* 정렬 Sorting */
// 스트림의 중간 단계에서 sorted 메서드를 이용하여 순서를 변경할 수 있다
// sorted() - Comparable 인터페이스를 구현한 클래스의 객체만 정렬이 가능
// String 은 Comparable 인터페이스를 구현한 클래스

// Comparator.reverseOrder() - Comparator 인터페이스의 static 메서드 : 기본 정렬의 역순
