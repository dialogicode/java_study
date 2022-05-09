package me.study.ch15_lambda.ex1501_notion;

interface InterfaceEx {
	public int sum (int x, int y);
}

public class LambdaFunctionEx {

	public static void main (String[] args) {

		// 람다식 : 이름이 존재하지 않는 메서드
		// 람다식 : (타입 매개변수) -> { 코드 }

		InterfaceEx ie = (int x, int y) -> x + y;

		System.out.println(ie.sum(1, 2));
	}
}

/* 매개변수 */
// 타입 생략 가능
// 1개 : 소괄호 생략 가능
// 0개 : 소괄호 생략 불가능

/* 실행문 */
// 1개 : 중괄호 생략 가능, return 키워드 생략 가능

/* 자바에서 메서드 */
// 메서드만 따로 실행할 수 없고 객체를 통해서만 실행
// 람다식은 해당 메서드를 포함하고 있는 객체를 생성하는 것
// 그래서 람다식은 인터페이스 타입의 객체 변수를 생성할 때 많이 사용
