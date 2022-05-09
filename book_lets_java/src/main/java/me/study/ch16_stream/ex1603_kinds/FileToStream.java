package me.study.ch16_stream.ex1603_kinds;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileToStream {
	public static void main (String[] args) {

		try {

			// Paths.get() 메서드 사용
			Path path = Paths.get("src/ch16/ex1603/StrToStream.java");
			Stream<String> stream = Files.lines(path, Charset.defaultCharset());

			stream.forEach(s -> System.out.println(s));
			stream.close();
			System.out.println();

			// BufferedReader 의 lines() 메소드 사용
			File file = path.toFile();
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			br.lines().forEach(s -> System.out.println(s));
			stream.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

// 외부 파일에서 스트림 객체를 생성하는 경우 String 타입으로 저장된다.

/* 외부 파일에서 스트림 객체를 생성하는 메서드 */
// Files.find( Path, int, BiPredicate, FileVisitOption )    - Stream<Path> 반환
// Files.list( Path )                                       - Stream<Path> 반환
// Files.lines( Path, Charset )                             - Stream<String> 반환
// BufferedReader.lines()                                   - Stream<String> 반환
