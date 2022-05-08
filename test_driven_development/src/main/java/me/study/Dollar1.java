package me.study;

public class Dollar1 {
	int amount;

	public Dollar1(int amount) {
		this.amount = amount;
	}

	void times(int multiplier) {
		amount *= multiplier;
	}
}