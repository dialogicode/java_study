package me.study;

public class Dollar4 {

	private int amount;

	public Dollar4(int amount) { this.amount = amount; }

	Dollar4 times(int multiplier) { return new Dollar4(amount * multiplier); }

	@Override
	public boolean equals(Object obj) {
		Dollar4 dollar = (Dollar4) obj;
		return amount == dollar.amount;
	}
}