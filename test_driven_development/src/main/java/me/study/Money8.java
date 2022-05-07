package me.study;

public abstract class Money8 {
	protected int amount;

	static Dollar8 dollar(int amount){
		return new Dollar8(amount);
	}

	static Franc8 franc(int amount){
		return new Franc8(amount);
	}

	abstract Money8 times(int multiplier);

	@Override
	public boolean equals(Object obj) {
		Money8 money = (Money8) obj;
		return amount == money.amount && getClass().equals(money.getClass());
	}
}
