package me.study.ch18_iostream.ex1805_charBasedOutput;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterEx {
	public static void main (String[] args) {
		try {
			FileWriter fw = new FileWriter("test4.txt");
			BufferedWriter bw = new BufferedWriter(fw);

			// 문자 하나 출력
			bw.write('A');

			char[] buf = {'B', 'C', 'D'};

			// 문자 배열 출력
			bw.write(buf);

			//문자 배열 off 부터 len 개수만큼 출력
			bw.write(buf, 1, 2);

			// 문자열 출력
			bw.write("저는 홍길동입니다.");

			bw.flush();
			bw.close();

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}

/* Buffered 보조 스트림 사용 이유 */
// buffer 가 중간에서 임시로 저장하는 역할의 저장소의 의미
// 하나하나 읽어오고 저장하는게 아니라 특정 길이만큼 모아뒀다가 한꺼번에 처리 - 속도가 월등히 빠르다

/* Buffered 보조 스트림 종류 */
// BufferedInputStream      바이트 기반 입력 스트림에 버퍼링 기능 제공
// BufferedOutputStream     바이트 기반 출력 스트림에 버퍼링 기능 제공
// BufferedReader           문자 기반 입력 스트림에 버퍼링 기능 제공
// BufferedWriter           문자 기반 출력 스트림에 버퍼링 기능 제공
