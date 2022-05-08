package me.study;

interface Expression13 {

}

public class Money13 implements Expression13 {
	protected int amount;
	protected String currency;

	public Money13(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}

	static Money13 dollar(int amount) {
		return new Money13(amount, "USD");
	}

	static Money13 franc(int amount) {
		return new Money13(amount, "CHF");
	}

	Money13 times(int multiplier) {
		return new Money13(amount * multiplier, currency);
	}

	Expression13 plus(Money13 added) {
		return new Money13(amount + added.amount, currency);
	}

	String currency() {
		return currency;
	}

	// 동치성 테스트
	@Override
	public boolean equals(Object obj) {
		Money13 money = (Money13) obj;
		return amount == money.amount && currency().equals(money.currency());
	}

	// 딱히 필요하진 않지만 오류 정보를 보기 위해 작성
	@Override
	public String toString() {
		return amount + " " + currency;
	}
}

class Bank13 {
	Money13 reduce(Expression12 source, String to) {
		return Money13.dollar(10);
	}
}
