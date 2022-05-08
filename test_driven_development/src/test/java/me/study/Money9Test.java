package me.study;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Money9Test {
	@Test
	void testEquals() {
		assertEquals(true, Money9.dollar(5).equals(Money9.dollar(5)));
		assertEquals(false, Money9.dollar(5).equals(Money9.dollar(6)));
		assertEquals(true, Money9.franc(5).equals(Money9.franc(5)));
		assertEquals(false, Money9.franc(5).equals(Money9.franc(6)));
		assertEquals(false, Money9.dollar(5).equals(Money9.franc(5)));
	}

	@Test
	void testTimes() {
		Money9 dollarFive = Money9.dollar(5);
		assertEquals(Money9.dollar(10), dollarFive.times(2));
		assertEquals(Money9.dollar(15), dollarFive.times(3));

		Money9 francFive = Money9.franc(5);
		assertEquals(Money9.franc(10), francFive.times(2));
		assertEquals(Money9.franc(15), francFive.times(3));
	}

	@Test
	void testCurrency() {
		assertEquals("USD", Money9.dollar(1).currency());
		assertEquals("CHF", Money9.franc(1).currency());
	}
}

/* 9장. 우리가 사는 시간
	- 통화 개념 테스트
		: testCurrency() 테스트 생성
			: currency() 메서드 에러
			: Money 클래스에 currency() 메서드를 선언
			: 테스트 성공
		: 두 클래스를 모두 포함할 수 있는 동일한 구현을 원함
			: 통화를 인스턴스 변수에 저장하고 메서드에서는 변수를 반환하게 만들기
			: 생성자에서 인스턴스 변수에 문자열 대입
			: 테스트 성공
		: 두 클래스의 인스턴스 변수 currency 와 currency() 메서드가 동일
			: Money 클래스로 올리자
			: 테스트 성공

	- 문자열 "USD" 와 "CHF" 정적 팩토리 메서드로 옮기기
		: Franc 와 Dollar 생성자에 String currency 매개변수 추가
		: 생성자 호출하는 곳에서 에러 발생
		: 팩토리 메서드 조정, times 반환 부분 조정
		: 테스트 성공

	- Franc 와 Dollar 생성자 정의 부분이 동일해짐
		: 구현을 상위 클래스 Money로 옮기기
*/
