package me.study.ch16_stream.ex1603_kinds;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class DirectoryToStream {
	public static void main (String[] args) {
		try {

			System.out.println("list() 메서드를 이용하여 스트림 생성하기");

			// src 디렉토리로 Path 객체 생성
			Path path = Paths.get("src");

			// src 경로의 모든 디렉토리와 파일 Stream 객체로 생성
			Stream<Path> sr1 = Files.list(path);
			sr1.forEach(p -> System.out.println(p.getFileName()));
			System.out.println();

			System.out.println("find() 메서드를 이용하여 스트림 생성하기");

			// src 디렉토리로 시작해서 10단계까지의 디렉토리 깊이까지 탐색
			Stream<Path> sr2 = Files.find(path, 10, (p, basicFileAttributes) -> {
				File file = p.toFile();
				// 디렉토리가 아니고 파일 이름에 Stream 이 포함된 파일명
				return !file.isDirectory() && file.getName().contains("Stream");
			});
			sr2.forEach(p -> System.out.println(p.getFileName()));

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
