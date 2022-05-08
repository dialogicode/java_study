package me.study;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Dollar2Test {
	@Test
	void testTimes() {
		Dollar2 five = new Dollar2(5);
		Dollar2 product = five.times(2);
		assertEquals(10, product.amount);
		product = five.times(3);
		assertEquals(15, product.amount);
	}
}

/* 2장. 타락한 객체
	- 1장 테스트 성공뒤 : Dollar 객체의 값이 바뀌는 것이 이상 (타락한 객체)
	- times()를 호출한후 객체의 값이 바뀐다.
		=> times가 값을 바꾸지 않고 새로운 객체를 반환하게 한다.
*/
