package me.study.ch16_stream.ex1602_create;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayToStream {
	public static void main (String[] args) {

		// 문자열 배열 객체 생성
		String[] arr = new String[]{"a", "b", "c", "d", "e", "f"};

		// 배열 전체 Stream 객체로 변환
		Stream<String> stream1 = Arrays.stream(arr);
		stream1.forEach(s -> System.out.print(s + " "));
		System.out.println();

		// 인덱스 지정해서 Stream 객체로 변환 (2이상, 5이하)
		Stream<String> stream2 = Arrays.stream(arr, 2, 5);
		stream2.forEach(s -> System.out.print(s + " "));
		System.out.println();

	}
}

// 스트림 생성 1 : 배열을 이용한 스트림 생성
