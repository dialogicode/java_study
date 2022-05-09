package me.study.ch18_iostream.ex1802_byteBasedInput;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamEx3 {
	public static void main (String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("src/ch18_iostream/ex1802_byteBasedInput/InputStreamEx.java");
			int data = 0;
			byte[] buf = new byte[fis.available()];
			while ((data = fis.read(buf, 0, buf.length)) != -1) {
				// fis.read(byte[] b, int off, int len) - buf 배열의 off 인덱스부터 읽어서 len 길이만큼 읽음
				System.out.print(new String(buf, 0, data));
			}
		} catch (IOException e) {
		} finally {
			try { // close() 메서드에서 예외 발생 할 수 있으므로 try-catch 문
				fis.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}
