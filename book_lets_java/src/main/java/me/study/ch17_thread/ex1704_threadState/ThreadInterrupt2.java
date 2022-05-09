package me.study.ch17_thread.ex1704_threadState;

public class ThreadInterrupt2 {
	public static void main (String[] args) {

		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run () {
				int i = 1;
				while (true) {
					System.out.println("t1: " + i);
					i++;
					// sleep() 메서드를 호출하지 않고 중지하는 방법
					if (Thread.interrupted()) {
						// interrupt() 호출 확인하는 메서드
						break;
					}
				}
				System.out.println("스레드 실행 종료");
			}
		});

		t1.start();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
		}
		t1.interrupt();
	}
}
