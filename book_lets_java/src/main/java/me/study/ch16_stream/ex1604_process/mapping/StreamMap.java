package me.study.ch16_stream.ex1604_process.mapping;

import java.util.Arrays;
import java.util.List;

public class StreamMap {
	public static void main (String[] args) {

		// 문자열 스트림 객체를 생성해
		// 문자열 길이 값으로 구성된 IntStream 객체를 생성한 후 내부반복자로 반복하면서
		// 해당 요소의 값(문자열의 길이)를 출력하는 예문

		List<String> list = Arrays.asList("동해물과", "백두산이", "마르고 닳도록");

		System.out.println("함수적 인터페이스 방식");
		list.stream().mapToInt(s -> s.length()).forEach(len -> System.out.println(len));
		System.out.println();

		System.out.println("메서드 참조 방식");
		list.stream().mapToInt(String::length).forEach(len -> System.out.println(len));
		System.out.println();
		// String::length = s - s.length()
	}
}

/* mapXXX() 메서드 */
// map( Function<T,R> )                     T 입력        Stream<R> 반환
// mapToObj( IntFunction<R> )               int 입력      Stream<R> 반환
// mapToObj( LongFunction<R> )              long 입력     Stream<R> 반환
// mapToObj( DoubleFunction<R> )            double 입력   Stream<R> 반환

// mapToInt( ToIntFunction<T> )             T 입력        IntStream 반환
// map( IntUnaryOperator )                  int 입력      IntStream 반환
// mapToInt( LongToIntFunction )            long 입력     IntStream 반환
// mapToInt( DoubleToIntFunction )          double 입력   IntStream 반환

// mapToLong( ToLongFunction<T> )           T 입력        LongStream 반환
// mapToLong( IntToLongFunction )           int 입력      LongStream 반환
// map( LongUnaryOperator )                 long 입력     LongStream 반환
// mapToLong( DoubleToLongFunction )        double 입력   LongStream 반환

// mapToDouble( ToDoubleFunction<T> )       T 입력        DoubleStream 반환
// mapToDouble( IntToDoubleFunction )       int 입력      DoubleStream 반환
// mapToDouble( LongToDoubleFunction )      long 입력     DoubleStream 반환
// map( DoubleUnaryOperator )               double 입력   DoubleStream 반환
