package me.study.ch16_stream.ex1603_kinds;

import java.util.stream.IntStream;

public class StrToStream {
	public static void main (String[] args) {

		String str = "자바 세상을 만들자";

		// Stream 객체 생성
		IntStream isr = str.chars();

		// System.out.print()
		isr.forEach(s -> System.out.print((char) s));
	}
}

// 문자열을 Stream 으로 처리하기 위해서는 chars() 메서드를 사용
// char 자료형은 문자 자료형이긴 하지만, 숫자이기 때문에 내부반복자로 처리 가능하다
