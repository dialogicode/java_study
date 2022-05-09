package me.study.ch18_iostream.ex1805_charBasedOutput;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
	public static void main (String[] args) {
		try {
			// append 매개변수에 true 를 넣으면 기존 파일에 이어서 출력
			FileWriter fw = new FileWriter("test3.txt");

			// 문자 하나 출력
			fw.write('A');

			char[] buf = {'B', 'C', 'D'};

			// 문자 배열 출력
			fw.write(buf);

			// 문자 배열 off 부터 len 개수만큼 출력
			fw.write(buf, 1, 2);

			// 문자열 출력
			fw.write("저는 홍길동 입니다.");

			fw.flush();
			fw.close();

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}

/* 문자 기반 출력 스트림 */
// 최상위 : Write 클래스

// 하위
// FileWriter           문자 단위로 파일에 출력
// OutputStreamWriter   바이트 단위로 출력한 데이터를 문자로 변환해주는 보조 스트림
// BufferedWriter       문자로 출력할 때 배열을 제공하여 한번에 쓸 수 있는 기능을 제공. 보조 스트림.

/* 제공 메서드 */
// void write( int c )                          한문자 출력
// void write( char[] buf )                     buf 배열에 있는 데이터 출력
// void write( char[] buf, int off, int len )   off 위치부터 len 개수만큼 출력
// void write( String str )                     문자열 str
// void write( String str, int off, int len )   off 위치부터 len 개수만큼 출력
// void flush()                                 출력 버퍼를 강제로 비워 데이터 출력
// void close()                                 사용한 리소스를 반납하고 스트림을 닫음. 출력 버퍼 비워짐

/* FileWriter 생성자 */
// ~ ( String name )
// ~ ( String name, boolean append )
// ~ ( File f )
// ~ ( File f, boolean append )
