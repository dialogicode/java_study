package me.study;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class Franc5Test {
	@Test
	void testTimes() {
		Franc5 five = new Franc5(5);
		assertEquals(new Franc5(10), five.times(2));
		assertEquals(new Franc5(15), five.times(3));
	}

	@Test
	void testEquals() {
		assertTrue(new Franc5(5).equals(new Franc5(5)));
		assertFalse(new Franc5(5).equals(new Franc5(6)));
	}
}

/* 5장. 솔직히 말하자면
	- 다중 통화를 지원하기 위해 Fran 클래스 생성
		: Dollar 클래스를 복사	
*/