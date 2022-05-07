package me.study;

public class Franc6 extends Money6 {

	public Franc6(int amount) { this.amount = amount; }

	Franc6 times(int multiplier) { return new Franc6(amount * multiplier); }

}
