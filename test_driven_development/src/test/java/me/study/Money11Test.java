package me.study;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Money11Test {
	@Test
	void testEquals() {
		assertEquals(true, Money11.dollar(5).equals(Money11.dollar(5)));
		assertEquals(false, Money11.dollar(5).equals(Money11.dollar(6)));
		assertEquals(false, Money11.dollar(5).equals(Money11.franc(5)));
	}

	@Test
	void testTimes() {
		Money11 dollarFive = Money11.dollar(5);
		assertEquals(Money11.dollar(10), dollarFive.times(2));
		assertEquals(Money11.dollar(15), dollarFive.times(3));

		Money11 francFive = Money11.franc(5);
		assertEquals(Money11.franc(10), francFive.times(2));
		assertEquals(Money11.franc(15), francFive.times(3));
	}

	@Test
	void testCurrency() {
		assertEquals("USD", Money11.dollar(1).currency());
		assertEquals("CHF", Money11.franc(1).currency());
	}
}

/* 11장. 모든 악의 근원
	- Money의 하위 클래스 Dollar와 Franc에는 달랑 생성자 밖에 없음
	- 생성자 때문에 하위 클라스를 남겨놓는 것은 불합리
		: Money.franc, Money.dollar를 고친다.
	- 하위 클래스를 지우기 전에 동치성 테스트를 하자
		: 테스트 성공
		: 하위 클래스 삭제
 */
