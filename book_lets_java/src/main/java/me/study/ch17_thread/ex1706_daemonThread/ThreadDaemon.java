package me.study.ch17_thread.ex1706_daemonThread;

public class ThreadDaemon {
	public static void main (String[] args) {
		// 스레드 객체 생성
		DaemonThread dt1 = new DaemonThread();
		DaemonThread dt2 = new DaemonThread();

		// 데몬 스레드로 설정
		dt1.setDaemon(true);
		dt2.setDaemon(true);

		dt1.start();
		dt2.start();

		try {
			Thread.sleep(5000);
			// 데몬 메서드는 일반 스레드가 없으면 실행 되지 않기 때문에
			// main() 메서드의 일반 스레드를 5초동안 멈추는 명령어를 집어 넣어준다.
			// main() 메서드가 종료되며 일반 스레드가 종료되면 데몬 스레드도 같이 종료
		} catch (InterruptedException e) {
		}
		System.out.println("main 종료");
	}
}

class DaemonThread extends Thread {
	@Override
	public void run () {
		while (true) {
			System.out.println(getName());
			try {
				sleep(500);
			} catch (InterruptedException e) {
			}
		}
	}
}

/* 데몬 스레드 */
// 데몬 스레드 : 일반 스레드의 보조 기능을 하는 스레드
// 주로 무한 실행을 하면서 일반 스레드를 보조하는 역할
// 일반 스레드가 모두 종료되면 데몬 스레드도 함께 종료

// 데몬 스레드 설정시 반드시 start() 메서드 실행 전에
// setDaemon(true) 로 설정되어야 데몬 스로드로 실행이 가능
