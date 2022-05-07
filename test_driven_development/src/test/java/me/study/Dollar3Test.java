package me.study;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Dollar3Test {
	@Test
	void testTimes() {
		Dollar3 five = new Dollar3(5);
		Dollar3 product = five.times(2);
		assertEquals(10, product.amount);
		product = five.times(3);
		assertEquals(15, product.amount);
	}

	@Test
	void testEquals(){
		assertTrue(new Dollar3(5).equals(new Dollar3(5)));
		assertFalse(new Dollar3(5).equals(new Dollar3(6)));
	}
}

/* 3장. 모두를 위한 평등 : 동치성(equality) 일반화

	- 객체를 값처럼 쓸 수 있는 객체 : 값 객체 패턴 (value object pattern)
	- 값 객체의 제약사항 중 하나
		: 객체의 인스턴스 변수가 생성자를 통해 일단 설정된 후에는 결코 변하지 않는다.
	- 값 객체의 이점
		: 별칭 문제에 대해 걱정할 필요가 없다. (같은 값을 가진 다른 객체가 존재)
		: 값 객체가 암시
			: 2장 처럼 모든 연산은 새로운 객체를 반환해야 한다.
			: equals() 를 구현해야 한다 (같은 값을 가진 다른 객체끼리 equals()가 작동하도록)
				=> 테스트를 먼저 작성하도록 하자.

*/