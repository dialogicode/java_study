package me.study;

public class Money11 {
	protected int amount;
	protected String currency;

	public Money11(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}

	static Money11 dollar(int amount) {
		return new Money11(amount, "USD");
	}

	static Money11 franc(int amount) {
		return new Money11(amount, "CHF");
	}

	Money11 times(int multiplier) {
		return new Money11(amount * multiplier, currency);
	}

	String currency() {
		return currency;
	}

	// 동치성 테스트
	@Override
	public boolean equals(Object obj) {
		Money11 money = (Money11) obj;
		return amount == money.amount && currency().equals(money.currency());
	}

	// 딱히 필요하진 않지만 오류 정보를 보기 위해 작성
	@Override
	public String toString() {
		return amount + " " + currency;
	}
}
