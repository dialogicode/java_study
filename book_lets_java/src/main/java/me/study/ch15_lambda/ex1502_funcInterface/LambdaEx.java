package me.study.ch15_lambda.ex1502_funcInterface;

interface LambdaInterface {
	void print ();

	// void print2(); // 오류 발생
	// 인터페이스에 추상 메서드가 2개 이상이면 람다식 표현을 할 수 없게 된다.
}

public class LambdaEx {
	public static void main (String[] args) {

		// 인터페이스 변수 = 람다식;
		// 람다식이 인터페이스에 대입되는 구조 : 익명 구현 객체를 생성
		// 인터페이스는 직접 객체를 생성할 수 없고 구현 클래스로만 객체를 생성
		// 람다식이 구현 클래스의 객체를 생성하는 역할

		// 함수적 인터페이스 (Functional Interface) : 단 1개의 추상 메서드만 가지는 인터페이스
		// 함수적 인터페이스만 람다식으로 객체를 생성 가능

		// 추상 메서드가 2개 이상이면 람다식에서 정의한 메서드가 어느 추상 메서드인지 알 수 없기 때문

		LambdaInterface li = () -> {
			String str = "메서드 출력";
			System.out.println(str);
		};

		li.print();
	}
}
