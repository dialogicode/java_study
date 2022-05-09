package me.study.ch15_lambda.ex1502_funcInterface;

public class LambdaEx2 {
	public static void main (String[] args) {

		System.out.println("시작");

		Runnable run = () -> {
			for (int i = 1; i <= 10; i++) {
				System.out.println("첫번째: " + i);
			}
		};

		Runnable run2 = () -> {
			for (int i = 1; i <= 10; i++) {
				System.out.println("두번째: " + i);
			}
		};

		// run 과 run2 객체는 모두 람다식으로 정의
		// Runnable 은 하나의 추상 메서드를 갖고 있는 인터페이스

		Thread t = new Thread(run);
		Thread t2 = new Thread(run2);

		t.start();
		t2.start();

		System.out.println("종료");
	}
}
