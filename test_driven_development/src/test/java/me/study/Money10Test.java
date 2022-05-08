package me.study;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Money10Test {
	@Test
	void testEquals() {
		assertEquals(true, Money10.dollar(5).equals(Money10.dollar(5)));
		assertEquals(false, Money10.dollar(5).equals(Money10.dollar(6)));
		assertEquals(true, Money10.franc(5).equals(Money10.franc(5)));
		assertEquals(false, Money10.franc(5).equals(Money10.franc(6)));
		assertEquals(false, Money10.dollar(5).equals(Money10.franc(5)));
	}

	@Test
	void testTimes() {
		Money10 dollarFive = Money10.dollar(5);
		assertEquals(Money10.dollar(10), dollarFive.times(2));
		assertEquals(Money10.dollar(15), dollarFive.times(3));

		Money10 francFive = Money10.franc(5);
		assertEquals(Money10.franc(10), francFive.times(2));
		assertEquals(Money10.franc(15), francFive.times(3));
	}

	@Test
	void testCurrency() {
		assertEquals("USD", Money10.dollar(1).currency());
		assertEquals("CHF", Money10.franc(1).currency());
	}
}

/* 10장. 흥미로운 시간
	- times 메서드 중복 제거
		: 반환을 팩토리 메서드에서 생성자로 변경
		: 테스트 성공
		: 생성자를 반환할 때 currency 매개변수에 들어갈 문자열은 객체에 currency 변수로 가지고 있다.
		: 매개변수에 인스턴스 변수 currency 그대로 입력
		: 테스트 성공
		: 구현부의 생성자를 Money로 바꿔보자.
		: Money 클래스가 abstract라고 에러
		: abstract 제거 times 메서드 Money 클래스로 이동
		: 테스트 실패
			: equals 에서 class 일치 판별에서 다름이 나옴
			: equals 에서 class를 판별해야 하나 currency를 판별해야 하나 - currency
				: equals 메서드를 currency 를 판별하도록 변경
				: 테스트 성공
*/
