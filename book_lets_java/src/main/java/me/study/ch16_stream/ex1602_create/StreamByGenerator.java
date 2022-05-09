package me.study.ch16_stream.ex1602_create;

import java.util.stream.Stream;

public class StreamByGenerator {
	public static void main (String[] args) {

		// generate() 메서드로 Stream 객체 생성
		// 리미트 10개 생성
		Stream<String> stream = Stream.generate(() -> "애국가").limit(10);
		// 주의할점 : limit() 메서드로 갯수를 제한하지 않으면 무한 반복되며 출력된다

		// 내부 반복자로 출력
		stream.forEach(s -> System.out.println(s));
	}
}

// 스트림 생성 4 : generate() 메서드를 이용한 스트림 생성
