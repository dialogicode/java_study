package me.study.ch17_thread.ex1704_threadState;

public class ThreadJoin {
	public static void main (String[] args) {
		Sum t1 = new Sum();
		Sum t2 = new Sum();

		t1.start();
		t2.start();

		try {
			// join() 메서드 : 스레드의 실행이 완료될때까지 기다리는 메서드
			t1.join(); // t1 스레드가 종료될 때까지 대기
			t2.join(); // t2 스레드가 종료될 때까지 대기
		} catch (InterruptedException e) {
		}

		// join() 메서드가 아니면 스레드 종료전 합계 과정 중간의 sum 값을 가져오게 된다
		System.out.println("두 스레드의 sum 합계 = " + (t1.sum + t2.sum));
	}
}

class Sum extends Thread {
	int sum = 0;

	@Override
	public void run () {
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
	}
}
