package me.study.ch16_stream.ex1603_kinds;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntStreamEx {
	public static void main (String[] args) {

		int[] arr = {1, 2, 3, 4, 5};

		// Arrays.stream( int[] )
		System.out.println("Arrays.stream() IntStream 생성하기");
		IntStream intstream1 = Arrays.stream(arr);
		intstream1.forEach(s -> System.out.print(s + "\t"));
		System.out.println();

		// IntStream.of( int[] )
		System.out.println("IntStream.of() IntStream 생성하기");
		IntStream intstream2 = IntStream.of(arr);
		intstream2.forEach(s -> System.out.print(s + "\t"));
		System.out.println();

		// IntStream.range(시작값-이상, 끝값-미만)
		System.out.println("IntStream.range(1,6) IntStream 생성하기");
		IntStream intstream3 = IntStream.range(1, 6);
		intstream3.forEach(s -> System.out.print(s + "\t"));
		System.out.println();

		// IntStream.rangeClosed(시작값-이상, 끝값-이하)
		System.out.println("IntStream.rangeClosed(1,5) IntStream 생성하기");
		IntStream intstream4 = IntStream.rangeClosed(1, 5);
		intstream4.forEach(s -> System.out.print(s + "\t"));
		System.out.println();
	}
}

/* Stream 의 종류 */
// BaseStream
// - Stream
// - IntStream
// - LongStream
// - DoubleStream

/* Stream<T> 생성 방법 */
// Collection.stream()
// Collection.parallelStream()
// Arrays.stream( T[] )
// Stream.of( T[] )

/* IntStream 생성 방법 */
// Arrays.stream( int[] )
// IntStream.of( int[] )
// IntStream.range( int, int )
// IntStream.rangeClosed( int, int )
// Random.ints()

/* LongStream 생성 방법 */
// Arrays.stream( long[] )
// LongStream.of( long[] )
// LongStream.range( long, long )
// LongStream.rangeClosed( long, long )
// Random.longs()

/* DoubleStream 생성 방법 */
// Arrays.stream( double[] )
// DoubleStream.of( double[] )
// Random.doubles()
