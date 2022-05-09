package me.study.ch17_thread.ex1705_threadSync;

// 플레이어2 스레드
class Player2 extends Thread {
	private SmartPhoneGame game;

	public void setSmartPhoneGame (SmartPhoneGame game) {
		this.setName("Player2");
		this.game = game;
	}

	@Override
	public void run () {
		game.increaseLevel();
	}
}
