package me.study.ch16_stream.ex1601_intro;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorEx {
	public static void main (String[] args) {
		// 문자열 배열을 Arrays.asList() 통해 리스트로 변환
		List<String> list = Arrays.asList(new String[]{"홍길동", "김유신", "이순신", "유관순"});

		System.out.println("for문 이용");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("외부 반복자 이용");
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("내부 반복자 이용");
		list.stream().forEach(s -> System.out.println(s));
	}
}

/* 스트림 소개 */

// 스트림 이전 : for문
// - 단점 : 처리해야될 데이터가 많거나, 데이터가 복잡해질수록 코드양이 많아지고 시간이 많이 걸린다.

// 스트림 : 람다를 활용 내부반복자를 이용 - 시간과 코드의 양을 줄일 수 있다.
// - 추가 : 스트림으로 처리시 간단하게 병렬처리(multi threading)가 가능하다.

// 병렬 처리(parallel processing) : 하나의 작업을 둘 이상의 작업으로 잘게 나눠서 동시에 진행하는 것


/* 스트림 처리 단계 */
// 1. 생성하기 : 스트림 인스턴스 생성
// 2. 가공하기 : 필터링(filtering) 및 매핑(mapping) 등 원하는 결과를 만들어가는 중간 작업
// 3. 결과 만들기 : 최종적으로 결과를 만들어내는 작업.
