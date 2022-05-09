package me.study.ch17_thread.ex1705_threadSync;

public class ThreadSynchronized {
	public static void main (String[] args) {

		// 게임 객체 생성
		SmartPhoneGame game = new SmartPhoneGame();

		// 플레이어1 객체 생성 후 스레드 실행
		Player1 p1 = new Player1();
		p1.setSmartPhoneGame(game);
		p1.start();

		// 플레이어2 객체 생성 후 스레드 실행
		Player2 p2 = new Player2();
		p2.setSmartPhoneGame(game);
		p2.start();
	}
}

// unSynchronized 시 객체의 레벨 증가를 두 스레드가 서로 호출
