package me.study;

public class Dollar8 extends Money8 {

	public Dollar8(int amount) { this.amount = amount; }

	Money8 times(int multiplier) { return new Dollar8(amount * multiplier); }

}