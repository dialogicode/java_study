package me.study;

public class Money7 {
	protected int amount;

	@Override
	public boolean equals(Object obj) {
		Money7 money = (Money7) obj;
		return amount == money.amount && getClass().equals(money.getClass());
	}
}
