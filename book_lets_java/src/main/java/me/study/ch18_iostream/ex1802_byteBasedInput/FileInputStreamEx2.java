package me.study.ch18_iostream.ex1802_byteBasedInput;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamEx2 {
	public static void main (String[] args) {
		try {
			FileInputStream fis = new FileInputStream("src/ch18_iostream/ex1802_byteBasedInput/InputStreamEx.java");
			int data = 0;

			// 한글을 읽어올 수 있도록 수정
			// 바이트 배열을 선언하고 fis.available() 메서드로 파일의 읽기 가능 바이트만큼 배열 크기로 지정
			byte[] buf = new byte[fis.available()];

			while ((data = fis.read(buf)) != -1) {
				// String 객체 - 바이트 배열과 바이트의 수만큼 문자열로 변환
				System.out.print(new String(buf, 0, data));
			}
		} catch (IOException e) {
		}
	}
}

// FileInputStream : 파일에서 바이트 단위로 데이터를 읽을 수 있는 기능을 가진 크래스
// 생성자1 : 문자열을 매개변수로 받음 - 경로까지 포함된 파일명을 지정
// 생성자2 : 파일 객체를 매개변수로 받는 생성자
