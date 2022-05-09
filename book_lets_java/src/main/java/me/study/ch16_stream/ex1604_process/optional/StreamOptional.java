package me.study.ch16_stream.ex1604_process.optional;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class StreamOptional {
	public static void main (String[] args) {

		int[] arr = new int[100];
		for (int i = 0; i < 100; i++) {
			arr[i] = i + 1;
		}

		// 리턴값 long
		long count = Arrays.stream(arr).count();
		System.out.println("요소들의 갯수 : " + count);

		// 리턴값 int
		int sum = Arrays.stream(arr).sum();
		System.out.println("요소들의 합 : " + sum);

		OptionalInt first = Arrays.stream(arr).findFirst();
		System.out.println("요소들 중 첫번째 값 : " + first.getAsInt());

		OptionalInt max = Arrays.stream(arr).max();
		System.out.println("요소들 중 최대 값 : " + max.getAsInt());

		OptionalInt min = Arrays.stream(arr).min();
		System.out.println("요소들 중 최소 값 : " + min.getAsInt());

		OptionalDouble avg = Arrays.stream(arr).average();
		System.out.println("요소들의 평균 : " + avg.getAsDouble());
	}
}

/* 집계 메서드 */

// long             count()                 요소들의 갯수

// int              sum()                   IntStream 요소들의 합
// long             sum()                   LongStream 요소들의 합
// double           sum()                   DoubleStream 요소들의 합

// Optional<T>      max( Comparator<T> )    설정한 정렬에서 최대값 요소
// Optional<T>      min( Comparator<T> )    설정한 정렬에서 최소값 요소

// OptionalXXX      findFirst()             첫번째 요소
// OptionalXXX      max()                   기본 정렬에서 최대값 요소
// OptionalXXX      min()                   기본 정렬에서 최소값 요소

// OptionalDouble   average()               요소들의 평균

// OptionalXXX : Optional, OptionalInt, OptionalLong, OptionalDouble
