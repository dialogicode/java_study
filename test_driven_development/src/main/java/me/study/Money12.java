package me.study;

interface Expression12 {

}

public class Money12 implements Expression12 {
	protected int amount;
	protected String currency;

	public Money12(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}

	static Money12 dollar(int amount) {
		return new Money12(amount, "USD");
	}

	static Money12 franc(int amount) {
		return new Money12(amount, "CHF");
	}

	Money12 times(int multiplier) {
		return new Money12(amount * multiplier, currency);
	}

	Expression12 plus(Money12 added) {
		return new Money12(amount + added.amount, currency);
	}

	String currency() {
		return currency;
	}

	// 동치성 테스트
	@Override
	public boolean equals(Object obj) {
		Money12 money = (Money12) obj;
		return amount == money.amount && currency().equals(money.currency());
	}

	// 딱히 필요하진 않지만 오류 정보를 보기 위해 작성
	@Override
	public String toString() {
		return amount + " " + currency;
	}
}

class Bank12 {
	Money12 reduce(Expression12 source, String to) {
		return Money12.dollar(10);
	}
}
