package me.study;

public class Franc5 {
	private int amount;

	public Franc5(int amount) { this.amount = amount; }

	Franc5 times(int multiplier) { return new Franc5(amount * multiplier); }

	@Override
	public boolean equals(Object obj) {
		Franc5 dollar = (Franc5) obj;
		return amount == dollar.amount;
	}
}