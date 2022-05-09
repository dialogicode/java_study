package me.study.ch17_thread.ex1703_threadPriority;

public class ThreadPriority {
	public static void main (String[] args) {

		Thread t1 = new Thread(() -> {
			System.out.println("t1 스레드 시작");
			for (int i = 0; i < 50; i++) {
				System.out.println("t1 : " + i);
			}
		});

		Thread t2 = new Thread(() -> {
			System.out.println("t2 스레드 시작");
			for (int i = 0; i < 50; i++) {
				System.out.println("t2 : " + i);
			}
		});

		// 우선순위 지정 (1이상 10이하 : 숫자가 클 수록 우선수위 높다)
		// - 우선순위 값은 상대적인 값
		// - 스레드를 실행하기 전에 지정해야 한다.
		// - main() 메서드에서 실행하는 스레드인 경우 기본값 5

		t1.setPriority(7);
		t2.setPriority(3);

		// 우선순위 지정시 직접 정수값을 설정하는 것보다 Thread 클래스의 static final field 값을 이용하는 것이 바람직
		// Windows 는 우선순위가 10까지, 다른 운영체제는 10이 아니라 7까지인 경우도 있다

		// .setPriority(Thread.MAX_PRIORITY);
		// .setPriority(Thread.NORM_PRIORITY);
		// .setPriority(Thread.MIN_PRIORITY);

		t1.start();
		t2.start();
	}
}
