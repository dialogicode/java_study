package me.study;

public class Dollar3 {
	int amount;
	
	public Dollar3(int amount) { this.amount = amount; }
	
	Dollar3 times(int multiplier){ return new Dollar3(amount * multiplier); }

	@Override
	public boolean equals(Object obj) {
		Dollar3 dollar = (Dollar3) obj;
		return amount == dollar.amount;
	}
}