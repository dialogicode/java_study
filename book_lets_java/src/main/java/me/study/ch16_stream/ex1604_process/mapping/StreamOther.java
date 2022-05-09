package me.study.ch16_stream.ex1604_process.mapping;

import java.util.Arrays;

public class StreamOther {
	public static void main (String[] args) {

		int[] intArr = {10, 20, 30, 40, 50, 60};

		// double 타입의 요소를 갖는 DoubleStream 으로 형변환
		Arrays.stream(intArr).asDoubleStream().forEach(d -> System.out.println(d));
		System.out.println();

		// int 타입의 요소를 갖는 Stream<Integer> 으로 형변환
		Arrays.stream(intArr).boxed().forEach(i -> System.out.println(i.getClass()));
		System.out.println();
	}
}

/* 매핑 중 flatMapXXX(), mapXXX() 제외한 매서드 */
// asLongStream()       IntStream             -> LongStream 으로 형변환
// asDoubleStream()     IntStream, LongStream -> DoubleStream 으로 형변환
// boxed()              IntStream -> Stream<Integer>, LongStream -> Steam<Long>, DoubleSteam -> Stream<Double>
