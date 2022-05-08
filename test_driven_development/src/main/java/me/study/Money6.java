package me.study;

public class Money6 {
	protected int amount;

	@Override
	public boolean equals(Object obj) {
		Money6 money = (Money6) obj;
		return amount == money.amount;
	}
}

class Dollar6 extends Money6 {
	public Dollar6(int amount) {
		this.amount = amount;
	}

	Dollar6 times(int multiplier) {
		return new Dollar6(amount * multiplier);
	}
}

class Franc6 extends Money6 {
	public Franc6(int amount) {
		this.amount = amount;
	}

	Franc6 times(int multiplier) {
		return new Franc6(amount * multiplier);
	}
}
