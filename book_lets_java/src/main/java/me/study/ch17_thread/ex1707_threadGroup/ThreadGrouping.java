package me.study.ch17_thread.ex1707_threadGroup;

public class ThreadGrouping {
	public static void main (String[] args) {
		// 그룹 객체 생성
		ThreadGroup group = new ThreadGroup("Group1");
		MyThread t1 = new MyThread(group, "First");
		MyThread t2 = new MyThread(group, "Second");
		MyThread t3 = new MyThread(group, "Third");

		t1.start();
		t2.start();
		t3.start();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}

		// 모든 스레드 중지
		group.interrupt();
	}
}

class MyThread extends Thread {
	MyThread (ThreadGroup group, String name) {
		super(group, name);
	}

	@Override
	public void run () {
		while (true) {
			System.out.println(getName());
			try {
				sleep(500);
			} catch (InterruptedException e) {
				System.out.println(getName() + "interrupted 발생");
				break;
			}
		}
		System.out.println(getName() + "종료");
	}
}

/* 스레드 그룹 : 서로 관련된 스레드를 그룹핑해서 다루기 위한 것 */
// 그룹 안에 또 다른 그룹도 생성 가능
// 보안상의 이유로 자신이 속한 그룹이나 하위 그룹은 변경 할 수 있으나,
// 다른 그룹은 변경할 수 없다.

/* 스레드 그룹 관련 메서드 */

// interrupt()                  현재 그룹에 포함된 모든 스레드 중지
// destroy()                    현재 그룹 및 모든 하위 그룹 삭제
// isDestroy()                  현재 그룹이 삭제되었는지 여부 리턴

// list()                       현재 그룹에 포함된 스레드와 하위 그룹 정보 출력
// getName()                    현재 그룹의 이름 리턴
// getParent()                  현재 그룹의 부모 그룹 리턴
// parentOf( ThreadGroup g )    현재 그룹이 g 의 부모 그룹인지 여부 리턴

// checkAccess()                스레드 그룹을 변경할 권한이 있는 여부 리턴

// getMaxPriority()             현재 그룹의 스레드가 가질 수 있는 최대 우선순위 값 리턴
// setMaxPriority( int pri )    현재 그룹의 스레드가 가질 수 있는 최대 우선순위 값 설정

// isDaemon()                   현재 그룹이 데몬 그룹인지 여부 리턴
// setDaemon( boolean daemon )  현재 그룹을 데몬 그룹으로 설정

// activeCount()                현재 그룹 및 하위 그룹의 모든 스레드 수 리턴
// activeGroupCount()           현재 그룹의 모든 하위 그룹의 수 리턴
