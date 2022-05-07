package me.study;

public class Dollar6 extends Money6 {

	public Dollar6(int amount) { this.amount = amount; }

	Dollar6 times(int multiplier) { return new Dollar6(amount * multiplier); }

}