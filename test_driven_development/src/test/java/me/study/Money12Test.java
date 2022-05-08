package me.study;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Money12Test {
	@Test
	void testEquals() {
		assertTrue(Money12.dollar(5).equals(Money12.dollar(5)));
		assertFalse(Money12.dollar(5).equals(Money12.dollar(6)));
		assertFalse(Money12.dollar(5).equals(Money12.franc(5)));
	}

	@Test
	void testTimes() {
		Money12 dollarFive = Money12.dollar(5);
		assertEquals(Money12.dollar(10), dollarFive.times(2));
		assertEquals(Money12.dollar(15), dollarFive.times(3));

		Money12 francFive = Money12.franc(5);
		assertEquals(Money12.franc(10), francFive.times(2));
		assertEquals(Money12.franc(15), francFive.times(3));
	}

	@Test
	void testCurrency() {
		assertEquals("USD", Money12.dollar(1).currency());
		assertEquals("CHF", Money12.franc(1).currency());
	}

	@Test
	void testPlus() {
		//Money12 sum = Money12.dollar(5).plus(Money12.dollar(5));
		// 10USD = 5USD + 5USD
		//assertEquals(Money12.dollar(10), sum);
	}

	@Test
	void testPlus2() {
		Money12 five = Money12.dollar(5);
		Expression12 sum = five.plus(five);

		// Expression 테스트 - reduce는 expression 변수
		Bank12 bank = new Bank12();
		Money12 reduce = bank.reduce(sum, "USD");
		assertEquals(Money12.dollar(10), reduce);
	}
}

/* 12장. 드디어, 더하기
	- 더하기 테스트 추가
		: plus() 메서드 생성 필요

	- 다중 통화를 표현하는 방법
		: 한 가지 전략 - 모든 내부값을 참조통화로 전환하는 것
		: 또 다른 전략 - 객체와 외부 프로토콜이 같으면서 내부 구현은 다른 새로운 객체 만들기
			: Money와 비슷하게 동작하지만 사실은 두 Money의 합을 나타내는 객체를 만드는 것
			: Money의 합을 지갑처럼 취급하기
				: 연산의 결과로 Expression - 환율을 이용해서 결과 Expression을 단일 통화로 축약
				: Expression을 새로운 객체 bank에서 처리하게 만드는 새로운 테스트를 생성
					: bank 의 클래스와 reduce 메서드 생성이 필요하다
		: Expression 클래스의 sum 변수를 선언
		: sum은 Money.dollar(5).plus(Money.dollar(5))
			: 오류 발생
			: Expression 과 Bank 클래스가 필요
				: Money.plus() 는 Expression을 반환해야 한다.
				: Bank 에는 reduce() 가 있어야 한다.
					: 컴파일 성공, 테스트 실패
						: reduce 테스트에 실패했으므로 반환값을 Money.dollar(10)으로 만들어 우선 성공 시키자
	- 리팩토링 시작 : 13장
 */
