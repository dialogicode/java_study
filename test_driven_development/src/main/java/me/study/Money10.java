package me.study;

public class Money10 {
	protected int amount;
	protected String currency;

	public Money10(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}

	static Dollar10 dollar(int amount) {
		return new Dollar10(amount, "USD");
	}

	static Franc10 franc(int amount) {
		return new Franc10(amount, "CHF");
	}

	Money10 times(int multiplier) {
		return new Money10(amount * multiplier, currency);
	}

	String currency() {
		return currency;
	}

	@Override
	public boolean equals(Object obj) {
		Money10 money = (Money10) obj;
		return amount == money.amount && currency().equals(money.currency());
	}

	@Override
	public String toString() {
		return amount + " " + currency;
	}
}

class Dollar10 extends Money10 {
	public Dollar10(int amount, String currency) {
		super(amount, currency);
	}

}

class Franc10 extends Money10 {
	public Franc10(int amount, String currency) {
		super(amount, currency);
	}
}
