package me.study.ch16_stream.ex1602_create;

import java.util.stream.Stream;

public class StreamByIterator {
	public static void main (String[] args) {

		// iterate() 메서드로 Stream 객체 생성 : 매개변수 (초기값, 함수형인터페이스 람다 표현식)
		// 리미트 10개 생성 : 최대 개수 제한을 두지 않으면 무한반복
		Stream<Integer> stream = Stream.iterate(1, n -> n + 1).limit(10);

		// 내부 반복자로 출력
		stream.forEach(s -> System.out.println(s));
	}
}

// 스트림 생성 5 : iterate() 메서드를 이용한 스트림 생성
