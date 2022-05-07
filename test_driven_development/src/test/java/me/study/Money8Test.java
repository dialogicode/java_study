package me.study;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class Money8Test {
	@Test
	void testEquals() {
		assertTrue(Money8.dollar(5).equals(Money8.dollar(5)));
		assertFalse(Money8.dollar(5).equals(Money8.dollar(6)));
		assertTrue(Money8.franc(5).equals(Money8.franc(5)));
		assertFalse(Money8.franc(5).equals(Money8.franc(6)));
		assertFalse(Money8.dollar(5).equals(Money8.franc(5)));
	}

	@Test
	void testTimes() {
		Money8 dollarFive = Money8.dollar(5);
		assertEquals(Money8.dollar(10), dollarFive.times(2));
		assertEquals(Money8.dollar(15), dollarFive.times(3));
		
		Money8 francFive = Money8.franc(5);
		assertEquals(Money8.franc(10), francFive.times(2));
		assertEquals(Money8.franc(15), francFive.times(3));
	}
}

/* 8장. 객체 만들기
	- times() 조작
		: Dollar 와 Franc 클래스 모두 times()가 Money 클래스를 반환하게 만들기
		: 테스트 성공

	- Money에 Dollar 객체를 반환하는 factory method 도입
		: testTimes() 의 객체 생성 부분을 factory method 사용
		: Dollar, Franc 를 선언된 부분에  대입
		: 테스트 코드의 객체 생성부분에 도입하자

	- testTimes() 선언부
		: Money 로 선언
		: 테스트 실패 - Money 에는 times() 가 정의되지 않음
		: Money 클래스를 abstract 로 변경 + abstract Money times(int multiplier); 선언
*/