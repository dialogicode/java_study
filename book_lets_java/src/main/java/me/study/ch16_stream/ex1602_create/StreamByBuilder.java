package me.study.ch16_stream.ex1602_create;

import java.util.stream.Stream;

public class StreamByBuilder {
	public static void main (String[] args) {

		// builder() 메서드로 Builder 객체 생성
		// add() 메서드도 리턴타입이 Builder 객체이므로 메서드 체이닝 가능
		// build() 메서드로 Stream 객체 생성
		Stream stream = Stream.builder()
				.add("무궁화")
				.add("삼천리")
				.add("화려강산")
				.add("대한사람")
				.build();

		// 내부 반복자로 출력
		stream.forEach(s -> System.out.println(s + " "));
	}
}

// 스트림 생성 3 : build() 메서드를 이용한 스트림 생성
