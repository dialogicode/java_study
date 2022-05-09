package me.study.ch18_iostream.ex1804_byteBasedOutput;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {
	public static void main (String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("test.txt", true);
			// test.txt 에 바이트 기반 출력 append 매개변수에 true 입력되면 기존 파일에 추가 입력
			// append 값 입력하지 않으면 기본값 false - 파일을 새로 작성
			fos.write(65); // A
			fos.write(66); // B
			fos.write(67); // C
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}

// OutputStream : 바이트 단위 출력 최상위 클래스

// 하위
// FileOutputStream         바이트 단위로 파일에 출력
// ByteArrayOutputStream    byte 배열에 바이트 단위로 출력
// FilterOutputStream       바이트 기간 스트림에서 제공하는 보조스트림의 상위 클래스

/* OutputStream 제공 메서드 */
// void write( int b )                      한 바이트 출력
// void write( byte[] b )                   b 배열에 있는 데이터 출력
// void write( byte[] b, int off, int len ) b 배열에 있는 데이터의 off 위치에서부터 len 개수만큼 출력
// void flush()                             출력 버퍼를 강제로 비워 데이터 출력
// void close()                             사용한 리소스를 반납하고 스트림을 닫음. 출력 버퍼 비워짐

/* FileOutputStream 생성자 */
// ~ ( String name )                    파일명을 매개변수로 출력 스트림 생성
// ~ ( String name, boolean append )    append 가 true 면 파일을 이어서 출력. 기본값 false
// ~ ( File f )                         File 객체를 매개변수로 받아 출력
// ~ ( File f, boolean append )         append 가 true 면 파일을 이어서 출력. 기본값 false
