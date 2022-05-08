package me.study;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Money6Test {
	@Test
	void testEquals() {
		assertTrue(new Dollar6(5).equals(new Dollar6(5)));
		assertFalse(new Dollar6(5).equals(new Dollar6(6)));
		assertTrue(new Franc6(5).equals(new Franc6(5)));
		assertFalse(new Franc6(5).equals(new Franc6(6)));
	}

	@Test
	void testTimes() {
		Dollar6 dollarFive = new Dollar6(5);
		assertEquals(new Dollar6(10), dollarFive.times(2));
		assertEquals(new Dollar6(15), dollarFive.times(3));

		Franc6 francFive = new Franc6(5);
		assertEquals(new Franc6(10), francFive.times(2));
		assertEquals(new Franc6(15), francFive.times(3));
	}
}

/* 6장. 돌아온 "모두를 위한 평등"
	- Dollar 와 Franc 의 중복 제거를 위해 공통 상위 클래스 찾아내기

	- Money 클래스 생성
		: 생성만 하면 테스트 여전히 성공

	- Money 클래스 값 변수 생성
		: private int amount 생성
		: 테스트 성공
		: 하위 클래스에서도 변수를 볼 수 있도록 protected 로 변경
		: 테스트 성공
		: 하위 클래스에서 amount 변수 제거

	- equals() 중복 제거
		: Dollar 와 Franc 변수 선언 부분 Money 클래스로 변경
		: 테스트 성공
		: 타입 변경부분을 Money 클래스로 변경
		: 테스트 성공
		: Dollar 와 Franc 의 equals() 를 Money 클래스로 이동
*/
