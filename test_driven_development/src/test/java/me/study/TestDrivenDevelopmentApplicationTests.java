package me.study;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestDrivenDevelopmentApplicationTests {

	@Test
	void contextLoads() {
	}
}

/* Test Driven Development 주기

	1. 작은 테스트를 하나 추가한다.
	2. 모든 테스트를 실행해서 테스트가 실패하는 것을 확인한다.
	3. 조금 수정한다.
	4. 모든 테스트를 실행해서 테스트가 성공하는 것을 확인한다.
	5. 중복을 제거하기 위해 리팩토링을 한다.
	
*/