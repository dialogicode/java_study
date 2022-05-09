package me.study.ch17_thread.ex1701_process;

public class ProcessEx {
	public static void main (String[] args) {

		try {
			// 메모장 실행
			Process p1 = Runtime.getRuntime().exec("notepad.exe");

			// 그림판 실행
			Process p2 = Runtime.getRuntime().exec("mspaint.exe");

			p1.waitFor(); // p1 프로세스가 종료될 때까지 대기
			p2.destroy(); // p1 프로세스가 종료되면 실행 -> p2 종료

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

/* 프로세스와 스레드 */
// 프로세스 : 실행 중인 프로그램
// 프로그램을 실행 -> 프로그램에 필요한 메모리 할당 : 프로세스

// 스레드 : 프로그램 안에서 작업을 수행하는 것
// 모든 프로세스에는 하나 이상의 스레드가 존재 - 개별적인 메모리 필요
// 멀티 스레드 프로세스 : 두 개 이상의 스레드를 가진 프로세스
// -> 프로세스의 메모리 크기에 따라 생성할 수 있는 스레드 수가 결정

// ex) 채팅 프로그램 - 웹 서버가 많은 사용자의 요청을 개별로 응답해서 처리해줘야 함

/* 멀티 스레드의 장점 */
// CPU, 메모리를 효율적으로 사용
// 사용자에 대한 응답성이 높아짐
// 작업을 스레드 단위로 분리해 실행시간을 줄일 수 있다.

/* 멀티 스레드의 단점 */
// 여러 스레드 들이 메모리나 컴퓨터 자원을 공유해 사용하기 때문에 동기화가 제대로 되지 않거나
// 교착 상태에 빠질 수 있음

// 교착상태(deadlock) : 두 개 이상의 작업이 서로 상대방이 끝나기를 기다리고 있는 상태
// -> 결국 아무것도 완료되지 않는 상태
