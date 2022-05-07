package me.study;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class Money7Test {
	@Test
	void testEquals() {
		assertTrue(new Dollar7(5).equals(new Dollar7(5)));
		assertFalse(new Dollar7(5).equals(new Dollar7(6)));
		assertTrue(new Franc7(5).equals(new Franc7(5)));
		assertFalse(new Franc7(5).equals(new Franc7(6)));
		assertFalse(new Dollar7(5).equals(new Franc7(5)));
	}
}

/* 7장. 사과와 오렌지
	- Dollar 와 Franc 을 비교하기
		: testEquals() 에 같은 값을 지닌 Dollar 와 Franc을 넣고 테스트
		: 다르다를 기대했는데 같다고 나와서 실패
			: and 조건으로 클래스까지 비교하게 만들어 테스트 성공
			: 지저분해 보이지만 일단 넘기기
*/