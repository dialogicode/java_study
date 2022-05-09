package me.study.ch18_iostream.ex1803_charBasedInput;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamEx2 {
	public static void main (String[] args) {
		try {
			// InputStreamReader 객체 생성
			Reader in = new InputStreamReader(System.in);
			int data = 0;
			while ((data = in.read()) != -1) {
				System.out.print((char) data);
			}
		} catch (IOException e) {
		}
	}
}

/* 문자 기반 입력 스트림 */
// 최상위 : Reader
// - 문자단위 입력 (2byte 씩 읽기) : 한글이 깨지지 않는다

// 하  위
// FileReader           파일에서 문자 단위로 읽음
// InputStreamReader    바이트 단위로 읽은 문자열을 문자로 변환해주는 보조 스트림
// BufferedReader       문자로 읽을 때 readLine() 메서드 제공(줄단위로 읽을 수 있음)하여 한꺼번에 읽을 수 있는 보조 스트림

/* Reader 클래스 제공 메서드 */
// int read()                                   하나의 문자 읽어 리턴
// int read( char[] buf )                       buf 배열에 문자를 읽어 읽은 수만큼 리턴
// int read( char[] buf, int off, int len )     buf 배열의 off 위치에서부터
// void close()                                 사용한 리소스를 반납하고 스트림을 닫음
