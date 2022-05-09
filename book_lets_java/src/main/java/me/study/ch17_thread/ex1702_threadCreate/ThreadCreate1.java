package ch17_thread.ex1702_threadCreate;

public class ThreadCreate1 {
	public static void main (String[] args) {

		// Thread 상속받는 방법
		ThreadExtend t1 = new ThreadExtend();

		// Runnable 구현하는 방법
		Runnable r = new RunnableImple();
		// Thread 생성자의 매개변수로 전달
		Thread t2 = new Thread(r);

		t1.start();
		t2.start();
	}
}

class ThreadExtend extends Thread {
	@Override
	public void run () {
		System.out.println("Thread 상속받는 방법");
		for (int i = 0; i < 50; i++) {
			System.out.println("ThreadExtend: " + i);
		}
	}
}

class RunnableImple implements Runnable {
	@Override
	public void run () {
		System.out.println("Runnable 구현하는 방법");
		for (int i = 0; i < 50; i++) {
			System.out.println("RunnableImple: " + i);
		}
	}
}
/* Thread 생성 방법 2가지 */
// 1. Thread 클래스 상속
// 2. Runnable 인터페이스 구현 객체 -> Thread 객체에 주입 (일반적 방법)

/* 왜 2번을 일반적으로 사용하는가 */
// Java에서는 상속을 받을 수 있는 클래스를 하나만 지정 가능
// - Thread 클래스를 상속받으면 다른 클래스를 상속 받을 수 없게 된다.

// Runnable 인터페이스는 run() 메서드를 하나만 가지고 있는 FunctionalInterface
// 두 방식 모두 run() 메서드를 정의한다는 것은 동일

// Thread 생성 후 start() 메서드를 실행 - 한번 start() 실행되면 다시 실행할 수 없다.
// 한번 더 스레드를 실행 하려면 스레드 객체를 한번 더 생성한 후 start() 메서드를 실행해야 한다.
