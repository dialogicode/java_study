package me.study;

public class Franc8 extends Money8 {

	public Franc8(int amount) { this.amount = amount; }

	Money8 times(int multiplier) { return new Franc8(amount * multiplier); }

}
