package me.study;

public class Franc7 extends Money7 {

	public Franc7(int amount) { this.amount = amount; }

	Franc7 times(int multiplier) { return new Franc7(amount * multiplier); }

}
