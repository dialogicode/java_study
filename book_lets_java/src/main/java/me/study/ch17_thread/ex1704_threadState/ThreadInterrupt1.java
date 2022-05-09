package me.study.ch17_thread.ex1704_threadState;

public class ThreadInterrupt1 {
	public static void main (String[] args) {

		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run () {
				try {
					int i = 1;
					while (true) {
						System.out.println("t1: " + i);

						// sleep을 넣지 않으면 interrupt 되지 않음
						Thread.sleep(1000);
						i++;
					}
				} catch (InterruptedException e) {
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
		// interrupt() 메서드는 일시정지 상태에서 예외를 발생시켜 대기상태나 종료상태로 처리
		// sleep() 으로 일시정지 상태로 만들어야 작동한다.
	}
}
