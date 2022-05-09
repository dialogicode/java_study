package me.study.ch17_thread.ex1702_threadCreate;

public class ThreadCreate3 {
	public static void main (String[] args) {

		// Thread 객체를 생성하며 생성자의 매개변수로 run() 메서드를 정의

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

		t1.start();
		t2.start();
	}
}
