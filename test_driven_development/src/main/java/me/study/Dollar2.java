package me.study;

public class Dollar2 {
	int amount;
	
	public Dollar2(int amount) { this.amount = amount; }
	
	Dollar2 times(int multiplier) { return new Dollar2(amount * multiplier); }
}