package me.study;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class Money13Test {
	@Test
	void testEquals() {
		assertEquals(Money13.dollar(5), Money13.dollar(5));
		assertNotEquals(Money13.dollar(5), Money13.dollar(6));
		assertNotEquals(Money13.dollar(5), Money13.franc(5));
	}

	@Test
	void testTimes() {
		Money13 dollarFive = Money13.dollar(5);
		assertEquals(Money13.dollar(10), dollarFive.times(2));
		assertEquals(Money13.dollar(15), dollarFive.times(3));

		Money13 francFive = Money13.franc(5);
		assertEquals(Money13.franc(10), francFive.times(2));
		assertEquals(Money13.franc(15), francFive.times(3));
	}

	@Test
	void testCurrency() {
		assertEquals("USD", Money13.dollar(1).currency());
		assertEquals("CHF", Money13.franc(1).currency());
	}

	@Test
	void testPlus() {
		//Money12 sum = Money12.dollar(5).plus(Money12.dollar(5));
		// 10USD = 5USD + 5USD
		//assertEquals(Money12.dollar(10), sum);
	}

	@Test
	void testPlus2() {
		Money13 five = Money13.dollar(5);
		Expression13 sum = five.plus(five);

		// Expression 테스트 - reduce는 expression 변수
		Bank13 bank = new Bank13();
		Money13 reduce = bank.reduce(sum, "USD");
		assertEquals(Money13.dollar(10), reduce);
	}

	@Test
	void testPlus3() {
		Money13 five = Money13.dollar(5);
		Expression13 result = five.plus(five);
		Sum13 sum = (Sum13) result;
		assertEquals(five, sum.augend);
		assertEquals(five, sum.addend);
	}
}

/* 13장. 진짜로 만들기
	- reduce 의 가짜 구현 제거하기
		: Money.dollar(10)은 five.plus(five)
		: Money.plus() 는 Expression(sum)을 반환해야 한다.
		: 두 Money 의 합은 Sum 이어야 한다.
			: Sum 클래스 생성 augend (피가산수), addend (가산수)
		: Expression 의 plus() 는 Sum을 반환하도록 바꾼다
			: Sum의 생성자도 생성
			: Sum은 Expression의 일종 이어야 한다.
		: 컴파일 가능 상태
			: 생성자가 필드를 초기화 하도록 하자
 */
