package me.study.ch16_stream.ex1604_process.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class StreamOptionalNoElm {
	public static void main (String[] args) {

		// 요소가 없는 빈 ArrayList 객체 생성
		List<Integer> list = new ArrayList<Integer>();

		long count = list.stream().count();
		System.out.println("요소들의 갯수 : " + count);

		int sum = list.stream().mapToInt(Integer::intValue).sum();
		System.out.println("요소들의 합 : " + sum);

		OptionalDouble avg = list.stream().mapToInt(Integer::intValue).average();
		// System.out.println("요소들의 평균 : " + avg.getAsDouble());// - 요소가 없으므로 평균을 구하려다 오류 발생

		// 요소가 존재하는 경우에만 평균 출력
		if (avg.isPresent()) {
			System.out.println("요소들의 평균 : " + avg.getAsDouble());
		}

		// 요소값이 없는 경우 기본값 설정
		// OptionalInt max = list.stream().mapToInt(Integer::intValue).max();
		int max = list.stream().mapToInt(Integer::intValue).max().orElse(0);
		System.out.println("요소들 중 최대 값 : " + max);

		// 요소값이 없는 경우 기본값 설정
		// OptionalInt min = list.stream().mapToInt(Integer::intValue).min();
		int min = list.stream().mapToInt(Integer::intValue).min().orElse(-1);
		System.out.println("요소들 중 최소 값 : " + min);


		// OptionalInt first = list.stream().mapToInt(Integer::intValue).findFirst();
		// System.out.println("요소들 중 첫번째 값 : " + first.getAsInt());

		// 요소가 존재하면 실행
		list.stream().mapToInt(Integer::intValue).findFirst()
				.ifPresent(a -> System.out.println("요소들 중 첫번째 값 : " + a));
	}
}

// boolean  isPresent()             값이 존재하는지 여부
// T        orElse(T)               기본값 설정
// void     ifPresent( Consumer )   값이 존재하는 경우 Consumer 에서 처리
