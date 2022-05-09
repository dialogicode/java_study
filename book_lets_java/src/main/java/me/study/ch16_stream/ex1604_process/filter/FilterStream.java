package me.study.ch16_stream.ex1604_process.filter;

import java.util.Arrays;
import java.util.List;

public class FilterStream {
	public static void main (String[] args) {

		// List 객체 생성
		List<String> list = Arrays.asList("홍길동", "김유신", "홍길동", "이순신", "홍길동", "유관순");

		// distinct() 메서드로 중복 제거 후 내부 반복자로 출력
		System.out.println("distinct()");
		list.stream().distinct().forEach(n -> System.out.println(n));
		System.out.println();

		// "홍" 으로 시작하는 문자열로 필터링 후 내부 반복자로 출력
		System.out.println("filter()");
		list.stream().filter(n -> n.startsWith("홍")).forEach(n -> System.out.println(n));
		System.out.println();

		// 중복제거 후 "홍" 으로 시작하는 문자열 내부 반복자로 출력
		System.out.println("distinct() + filter()");
		list.stream().distinct().filter(n -> n.startsWith("홍")).forEach(n -> System.out.println(n));
		System.out.println();
	}
}

/* 스트림 가공 */
// Reduction : 많은 양의 데이터를 분석, 가공, 축소 하는 것
// Reduction 을 위한 중간 처리 작업 : 필터링(Filtering), 매핑(Mapping), 정렬(Sorting), 그룹핑(Grouping)

/* 필터링 Filtering */
// Stream 내의 요소를 걸러내는 기능
// 주요 메서드 : distinct(), filter() - 모든 Stream 객체가 가지는 공통 메서드

// distinct() - 중복을 제거
// Stream, IntStream, LongStream, DoubleStream

// filter()         스트림의 각 요소를 1개씩 입력받아 boolean 을 리턴하는 표현식을 이용해
//                          true 를 리턴하는 데이터만 모아 새로운 스트림을 생성하여 리턴
// Stream           filter( Predicate )
// IntStream        filter( IntPredicate )
// LongStream       filter( LongPredicate )
// DoubleStream     filter( DoublePredicate )
