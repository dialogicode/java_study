package me.study.ch18_iostream.ex1802_byteBasedInput;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamEx {
	public static void main (String[] args) {
		try {
			FileInputStream fis = new FileInputStream("src/ch18_iostream/ex1802_byteBasedInput/InputStreamEx.java");
			int data = 0;
			while ((data = fis.read()) != -1) {
				System.out.print((char) data);
			}
		} catch (IOException e) {
		}
	}
}

// FileInputStream : 파일에서 바이트 단위로 데이터를 읽을 수 있는 기능을 가진 크래스
// 생성자1 : 문자열을 매개변수로 받음 - 경로까지 포함된 파일명을 지정
// 생성자2 : 파일 객체를 매개변수로 받는 생성자

// 파일에 한글은 깨져서 출력
