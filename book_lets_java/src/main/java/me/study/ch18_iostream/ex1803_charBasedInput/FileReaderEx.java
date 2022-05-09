package me.study.ch18_iostream.ex1803_charBasedInput;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
	public static void main (String[] args) {
		FileReader fr = null;
		try {
			fr = new FileReader("src/ch18_iostream/ex1802_byteBasedInput/InputStreamEx.java");
			int data = 0;
			while ((data = fr.read()) != -1) {
				System.out.print((char) data);
			}
		} catch (IOException e) {
		} finally {
			try {
				fr.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}

// FileReader : 파일 읽을 수 있는 기능 - 파일의 경로나 파일 객체를 생성자의 매개변수로 지정할 수 있다.
// - File 존재하지 않으면 FileNotFoundException 예외를 발생
