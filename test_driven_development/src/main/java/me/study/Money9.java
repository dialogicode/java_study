package me.study;

public abstract class Money9 {
	protected int amount;
	protected String currency;

	public Money9(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}

	static Dollar9 dollar(int amount) {
		return new Dollar9(amount, "USD");
	}

	static Franc9 franc(int amount) {
		return new Franc9(amount, "CHF");
	}

	abstract Money9 times(int multiplier);

	String currency() {
		return currency;
	}

	@Override
	public boolean equals(Object obj) {
		Money9 money = (Money9) obj;
		return amount == money.amount && getClass().equals(money.getClass());
	}
}

class Dollar9 extends Money9 {
	public Dollar9(int amount, String currency) {
		super(amount, currency);
	}

	Money9 times(int multiplier) {
		return Money9.dollar(amount * multiplier);
	}
}

class Franc9 extends Money9 {
	public Franc9(int amount, String currency) {
		super(amount, currency);
	}

	Money9 times(int multiplier) {
		return Money9.franc(amount * multiplier);
	}
}
