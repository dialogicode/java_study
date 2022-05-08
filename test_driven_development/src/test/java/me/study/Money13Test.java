package me.study;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Money13Test {
	@Test
	void testEquals() {
		assertTrue(Money13.dollar(5).equals(Money13.dollar(5)));
		assertFalse(Money13.dollar(5).equals(Money13.dollar(6)));
		assertFalse(Money13.dollar(5).equals(Money13.franc(5)));
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
}

/* 13장. 진짜로 만들기
	- 데이터 중복 제거
 */
