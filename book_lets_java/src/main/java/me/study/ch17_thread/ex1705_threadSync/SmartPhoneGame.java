package me.study.ch17_thread.ex1705_threadSync;

class SmartPhoneGame {
	private int level;

	public int getLevel () {
		return this.level;
	}

	/* unSynchronized : 비동기화
	public void increaseLevel () {
		while (true) {
			this.level++; // 레벨 1씩 증가
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}

			// 현재 스레드의 이름과 레벨 출력
			System.out.println(Thread.currentThread().getName() + " Level : " + this.level);

			// 레벨이 10의 배수가 되면 종료
			if (this.level % 10 == 0) break;
		}
	}*/

	/* 동기화 영역 지정 방법1 : 동기화 메서드 - 메서드 선언부 synchronized
	public synchronized void increaseLevel () {
		while (true) {
			this.level++; // 레벨 1씩 증가
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}

			// 현재 스레드의 이름과 레벨 출력
			System.out.println(Thread.currentThread().getName() + " Level : " + this.level);

			// 레벨이 10의 배수가 되면 종료
			if (this.level % 10 == 0) break;
		}
	} */

	/* 동기화 영역 지정 방법2 : 동기화 블록 지정 - synchronized (this) {}
	public void increaseLevel () {
		synchronized (this) {
			while (true) {
				this.level++; // 레벨 1씩 증가
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}

				// 현재 스레드의 이름과 레벨 출력
				System.out.println(Thread.currentThread().getName() + " Level : " + this.level);

				// 레벨이 10의 배수가 되면 종료
				if (this.level % 10 == 0) break;
			}
		}
	} */

	/* */
	public synchronized void increaseLevel () {
		while (true) {
			this.level++; // 레벨 1씩 증가
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}

			// 현재 스레드의 이름과 레벨 출력
			System.out.println(Thread.currentThread().getName() + " Level : " + this.level);

			// 레벨이 10의 배수가 되면 종료
			if (this.level % 5 == 0) {
				notifyAll();
				try {
					wait();
				} catch (InterruptedException e) {

				}
				break;
			}

			if (this.level % 10 == 0) break;
		}
	}
}

/* 스레드 동기화 */

// 한  개의 스레드가 객체를 단독으로 사용 : 문제 없음
// 여러개의 스레드가 객체를 공통으로 사용 : 문제 발생
// 스레드가 객체의 값을 변경했을 때 그 객체를 이용하는 다른 스레드에서 문제가 발생

// 하나의 스레드가 작업이 끝날 때까지 해당 객체가 변경되지 못하도록 하는 것이 동기화(Synchronized) : 동시성
// 멀티 스레드를 프로그래밍을 할 때는 동기화를 처리하는 것이 매우 중요

/* 동기화 영역 지정 방법 */
// 1. 동기화 메서드
// 2. 동기화 블  록
// 동기화 영역을 지정하고 나면 해당 영역이 잠기게 되고,
// 다른 스레드는 이 영역을 실행할 수 없게 된다. 실행이 종료되면 잠금이 풀린다.

/* wait(), notify(), notifyAll() */
// wait()       현재 실행 중인 스레드를 대기 상태로 전환
// notify()     현재 대기 상태인 스레드 중 한개만 실행 중으로 변환 (직접 지정 불가)
// notifyAll()  현재 대기 상태인 스레드 중인 모든 스레드를 실행 중 상태로 변환 (JVM이 우선 순위 높은 스레드를 먼저)

// 스레드 간에 교대로 작업할 수 있도록 처리해야 하는 경우 - 스레드 간에 협업을 하게 만들어 주는 것
// 공유 객체를 이용해 wait() 메서드와 notify() 메서드를 함꼐 사용
// 한 스레드가 공유 객체를 잠그고 오래 기다리는 대신 wait() 메서드를 호출해 다른 스레드에게 제어권을 넘겨주고 대기
// 다른 스레드에 의해 notify() 메서드에 의해 호출되 다시 실행상태가 된다

// notify()는 객체를 기다리는 스레드 중의 하나만을 깨우고 notifyAll()은 모든 스레드를 깨운다
// 어차피 한번에 하나의 스레드만 객체를 사용하기 때문에 두 메서드는 별차이가 없다.
