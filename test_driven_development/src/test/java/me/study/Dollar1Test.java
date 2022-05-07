package me.study;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Dollar1Test {
	@Test
	void testTimes() {
		Dollar1 five = new Dollar1(5);
		five.times(2);
		assertEquals(10, five.amount);
	}
}

/* 1장. 다중 통화를 지원하는 Money 객체

	종목 - 주식수 - 가격 - 합계 의 column을 가진 table

	1. 다중 통화를 지원하는 Money 객체를 만들기 위해
	- 통화 단위 추가 => 환율도 명시
	- 통화가 다른 두 금액을 환율에 맞게 변한 금액으로 결과 얻기 : 곱하기 필요
	- 주식수 * 주가 = 합계                                      : 곱하기 필요
		=> test 지정 소스에 곱하기 테스트 메서드 만들기

	2. 곱하기 테스트 하는 메서드 만들기 : 예시 => 컴파일 err 발생 : 테스트 불가능
	- Dollar 클래스가 없다.
	- Dollar 클래스의 생성자가 없다.
	- Dollar 클래스의 times(int) 메서드가 없다.
	- Dollar 클래스의 amount 필드가 없다.

	3. 컴파일 err 없애기
	- Dollar 클래스 만들기                     : Dollar 선언부분      빨간줄 제거
	- Dollar 클래스 생성자 만들기              : Dollar 객체 생성부분 빨간줄 제거
	- Dollar 클래스의 times(int) 메서드 만들기 : 객체.times(2)        빨간줄 제거
	- Dollar 클래스의 amount 필드 만들기       : 객체.amount          빨간줄 제거
		=> 컴파일 에러 사라짐                      : 테스트 가능
		=> 기대값고 실제값이 맞지 않음             : 테스트 실패
		=> 가장 최소한의 작업으로 테스트 성공 유도 : amount = 10 : 어떠한 짓을 저지르더라도

	4. 중복 제거 : 상수를 변수로 : 점진적인 일반화
	- int amount (= 10) = 5 * 2;
	- 객체 초기화 단계의 코드를 times 메서드 안으로 옮기기
		- int amount;
		- times(multiplier) { amount = 5 * 2; }
	- 5의 중복 제거
		- 생성자 { this.amount = amount; }
		- times(multiplier) { amount = amount * 2; }
	- 2의 중복 제거
		- times(multiplier) { amount = amount * multiplier; }

	5. 첫번재 테스트 완료

	요약
	1. 테스트를 할 메서드를 만든다
	2. 컴파일 불가능을 가능으로 만들기
	3. 테스트 실패를 성공으로 만들기 (무슨 짓을 하더라도)
	4. 중복 제거
		: 상수를 변수로
		: 일반화
	5. 테스트 완료
	
 */