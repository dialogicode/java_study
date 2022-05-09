package me.study.ch17_thread.ex1705_threadSync;

public class ThreadProducerConsumer {
	public static void main (String[] args) {

		// 통장 객체 생성
		Account acc = new Account();

		// 엄마, 아들 스레드 객체 생성
		Mother mother = new Mother(acc);
		Son son = new Son(acc);

		mother.start();
		son.start();

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
		}

		// 스레드 중지
		son.interrupt();
		mother.interrupt();
	}
}

class Account {
	int money;

	synchronized void withdraw () {
		while (money == 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				break;
			}
		}
		notifyAll();
		System.out.println(Thread.currentThread().getName() + money + "원 출금");
	}

	synchronized void deposit () {
		while (money > 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				break;
			}
		}
		// 랜덤 입금 1~5만원
		money = (int) ((Math.random() * 5) + 1) * 10000;
		notifyAll();
		System.out.println();
		System.out.println(Thread.currentThread().getName() + money + "원 입금");
	}
}

class Mother extends Thread {
	Account account;

	Mother (Account account) {
		super("엄마");
		this.account = account;
	}

	@Override
	public void run () {
		while (true) {
			try {
				account.deposit();
				sleep((int) (Math.random() * 2000));
			} catch (InterruptedException e) {
				break;
			}
		}
	}
}

class Son extends Thread {
	Account account;

	Son (Account account) {
		super("아들");
		this.account = account;
	}

	@Override
	public void run () {
		while (true) {
			try {
				account.withdraw();
				sleep((int) (Math.random() * 300));
			} catch (InterruptedException e) {
				break;
			}
		}
	}
}

// 생산자 스레드 : 데이터를 만들어 내고 - 데이터를 생성하고 소비하지 않으면 wait
// 소비자 스레드 : 데이터를 소비만 하고 - 데이터를 생산하지 않으면 생산 될때까지 wait
