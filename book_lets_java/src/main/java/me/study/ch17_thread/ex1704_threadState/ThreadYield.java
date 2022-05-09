package me.study.ch17_thread.ex1704_threadState;

public class ThreadYield {
	public static void main (String[] args) {
		YieldThread t1 = new YieldThread();
		YieldThread t2 = new YieldThread();

		t1.start();
		t2.start();

		try {
			// 메인 메서드의 스레드가 1초간 멈춤
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}

		// t1 스레드가 멈추기 - Thread-1 만 출력
		t1.isContinue = false; // t1 양보

		try {
			// 메인 메서드의 스레드가 1초간 멈춤
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}

		// t1 스레드 다시 시작
		t1.isContinue = true; // t1 다시 실행

		try {
			// 메인 메서드 스레드 2초간 멈춤
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}

		// t1, t2 스레드 종료
		t1.isBreak = true;
		t2.isBreak = true;
	}
}

class YieldThread extends Thread {
	boolean isBreak = false;
	boolean isContinue = true;

	@Override
	public void run () {
		while (!isBreak) {
			if (isContinue) {
				System.out.println(getName() + "실행 중");
			} else {
				// yield 명령문이 없으면 isContinue=false 시 스레드의 while 문이 의미없이 반복되어 자원이 낭비
				// yield 명령문으로 효율적인 자원 사용을 할 수 있게 된다
				Thread.yield();
			}
		}
		System.out.println(getName() + " 종료");
	}
}
