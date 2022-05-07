package me.study;

public class Dollar7 extends Money7 {

	public Dollar7(int amount) { this.amount = amount; }

	Dollar7 times(int multiplier) { return new Dollar7(amount * multiplier); }

}