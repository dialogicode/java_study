package me.study;

public class Money7 {
	protected int amount;

	@Override
	public boolean equals(Object obj) {
		Money7 money = (Money7) obj;
		return amount == money.amount && getClass().equals(money.getClass());
	}
}

class Dollar7 extends Money7 {
	public Dollar7(int amount) {
		this.amount = amount;
	}

	Dollar7 times(int multiplier) {
		return new Dollar7(amount * multiplier);
	}
}

class Franc7 extends Money7 {
	public Franc7(int amount) {
		this.amount = amount;
	}

	Franc7 times(int multiplier) {
		return new Franc7(amount * multiplier);
	}
}
