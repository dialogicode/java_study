package me.study.ch18_iostream.ex1803_charBasedInput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderEx {
	public static void main (String[] args) {
		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader("src/ch18_iostream/ex1802_byteBasedInput/InputStreamEx.java");
			br = new BufferedReader(fr);

			String txt = null;
			while ((txt = br.readLine()) != null) {
				System.out.println(txt);
			}
		} catch (IOException e) {
		} finally {
			try {
				fr.close();
				br.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}

// BufferedReader : 입력 스트림에 Buffer 를 가지고 있는 문자형 입력 스트림
// - 버퍼에 있는 내용을 한 줄씩 있는 readLine() 메서드를 가지고 있는 보조 스트림
// - 직접 데이터를 입출력하는 것은 아니만 스트림의 기능을 향상시키거나 새로운 기능을 추ㅏ
// - 스트림을 먼저 생성한 후 이를 이용해 보조스트림을 생성하는 형태로 사용
