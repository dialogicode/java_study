package me.study.ch18_iostream.ex1802_byteBasedInput;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx {
	public static void main (String[] args) {
		try {
			InputStream in = System.in;
			int data = 0;
			while ((data = in.read()) != -1) {
				System.out.print((char) data);
			}
		} catch (IOException e) {
		}
	}
}

/* 바이트 기반 입력 스트림 : 한글 불가능, 영어 가능 */

// 최상위 : InputStream
// - 하위 클래스에서 공통으로 사용하기 위한 입력 관련 추상 메서드가 포함

// 많이 사용되는 하위 클래스
// FileInputStream      파일에서 읽음
// ByteArrayInputStream 메모리에서 읽음
// FilterInputStream    보조 스트림의 상위 클래스

/* 제공 메서드 */
// int read()
// 입력 스트림으로부터 1바이트를 읽어 리턴, 읽은 데이터가 없으면 -1 리턴

// int read( byte[] b )
// 입력 스트림으로부터 읽은 바이트를 매개변수 바이트 배열에 저장
// 읽은 바이트 수를 리터, 읽은 데이터가 없으면 -1 리턴

// int read( byte[] b, int off, int len )
// 입력 스트림으로부터 len 개의 바이트만큼 읽어 배열 b[off] 부터 len 개까지 저장
// 실제로 읽은 바이트 수를 리턴, 읽은 데이터가 없으면 -1을 리턴

// void close()
// 사용한 리소스를 반납하고 스트림 닫음
