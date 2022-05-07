package me.study;

public class Money6 {
	protected int amount;

	@Override
	public boolean equals(Object obj) {
		Money6 money = (Money6) obj;
		return amount == money.amount;
	}
}