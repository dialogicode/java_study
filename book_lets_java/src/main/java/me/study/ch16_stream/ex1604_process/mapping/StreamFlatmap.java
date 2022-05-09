package me.study.ch16_stream.ex1604_process.mapping;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class StreamFlatmap {
	public static void main (String[] args) {

		// 문자여을 공백으로 분리해서 매핑
		List<String> list1 = Arrays.asList("동해물과", "백두산이", "마르고 닳도록");
		list1.stream().flatMap(data -> Arrays.stream(data.split(" "))).forEach(word -> System.out.println(word));
		System.out.println();

		// 문자열을 ,로 분리해서 double 자료형으로 변환해서 매핑
		List<String> list2 = Arrays.asList("1.1, 2.2, 3.3", "4.4, 5.5, 6.6");
		DoubleStream dsr = list2.stream().flatMapToDouble(data -> {
			String[] strArr = data.split(",");
			double[] dArr = new double[strArr.length];
			for (int i = 0; i < dArr.length; i++) {
				dArr[i] = Double.parseDouble(strArr[i].trim());
			}
			return Arrays.stream(dArr);
		});
		dsr.forEach(n -> System.out.println(n));
		System.out.println();

		// 문자열을 ,로 분리해서 int 자료형으로 변환해서 매핑
		List<String> list3 = Arrays.asList("1, 2, 3", "4, 5, 6");
		IntStream isr = list3.stream().flatMapToInt(data -> {
			String[] strArr = data.split(",");
			int[] intArr = new int[strArr.length];
			for (int i = 0; i < strArr.length; i++) {
				intArr[i] = Integer.parseInt(strArr[i].trim());
			}
			return Arrays.stream(intArr);
		});
		isr.forEach(n -> System.out.println(n));
		System.out.println();
	}
}

/* 매핑 Mapping */
// 컬렉션 프레임워크에서 처럼 K,V로 매핑되어 있는 개념
// 스트림의 데이터를 매개변수로 받아 가공해 새로운 스트림을 만들어 리턴 : 데이터의 변환을 위한 기능

// 스트림에서 제공되는 메서드 : flatMapXXX(), mapXXX(), asDoubleStream(), asLongStream(), boxed()

/* flatMapXXX() 메서드 */
// flatMap( Function<T, Stream<R>> )                T 입력        Stream<R> 반환

// flatMap( IntFunction<IntStream> )                int 입력      IntStream 반환
// flatMapToInt( Function<T, IntStream> )           T 입력        IntStream 반환

// flatMap( LongFunction<LongStream> )              long 입력     LongStream 반환
// flatMapToLong( Function<T, LongStream> )         T 입력        LongStream 반환

// flatMap( DoubleFunction<DoubleStream> )          double 입력   DoubleStream 반환
// flatMapToDouble( Function<T, DoubleStream> )     T 입력        DoubleStream 반환
