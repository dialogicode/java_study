package me.study;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Dollar4Test {
	@Test
	void times() {
		Dollar4 five = new Dollar4(5);
		assertEquals(new Dollar4(10), five.times(2));
		assertEquals(new Dollar4(15), five.times(3));
	}

	@Test
	void testEquals() {
		assertTrue(new Dollar4(5).equals(new Dollar4(5)));
		assertFalse(new Dollar4(5).equals(new Dollar4(6)));
	}
}

/* 4장. 프라이버시
	- 중복 제거
		: testTimes()의 단언(assert)을 객체간의 비교로 바꾼다
			: 동치성 eqauls() 테스트 성공 이후
			: 주의) testEquals() 테스트가 실패하면 testTimes()도 실패

	- 테스트 고친 후 : Dollar의 amount 인스턴스 변수를 사용하는 코드는 Dollar 자신밖에 남지 않음
		: private로 변경
 */
