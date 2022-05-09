package me.study.ch17_thread.ex1704_threadState;

public class ThreadSleep {
	public static void main (String[] args) {
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run () {

				for (int i = 0; i < 10; i++) {
					System.out.println("t1: " + i);
					try {
						// sleep() 메서드
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
				}

				System.out.println("스레드 실행 종료");
			}
		});

		t1.start();
	}
}

/* 스레드 상태 제어 */
// 스레드 프로그래밍이 어려운 부분 : 스레드의 상태 제어
// 스레드 상태 제어 실패 -> 프로그램이 멈추거나 중지, 버그 발생

/* Object 클래스의 메서드로 스레드 상태 제어 - 동기화 메서드 및 동기화 블록에서만 사용 가능 */

// notify()
// notifyAll()                      일시 정지 상태에서 실행 대기 상태로 변경

// wait()
// wait( long millis )
// wait( long millis, int nanos )   동기화 블록 내에서 일시 정지

/* 스레드 상태 제어 메서드 */

// sleep( long millis )
// sleep( long millis, int nanos )  매개변수 시간동안 스레드 일시 정지

// join()
// join( long millis )
// join( long millis, int nanos )   join() 메서드를 실행한 스레드가 일시 정지

// interrupt()                      일시 정지 상태에서 예외를 발생시켜 대기상태나 종료 상태로 처리 가능

// yeild()                          실행 중 우선순위가 동일한 다른 스레드에게 실행을 양보하고, 대기

/* 스레드 상태 제어 메서드에서 교착상태 문제로 deprecated */

// resume()
// stop()
// suspend()
