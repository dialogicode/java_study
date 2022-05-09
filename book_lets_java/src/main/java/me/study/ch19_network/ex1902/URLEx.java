package me.study.ch19_network.ex1902;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;

public class URLEx {
	public static void main (String[] args) {
		try {
			URL url = null;
			url = new URL("https://www.egovframe.go.kr/home/main.do");
			System.out.println("authority : " + url.getAuthority());
			System.out.println("content : " + url.getContent());
			System.out.println("protocol :" + url.getProtocol());
			System.out.println("host : " + url.getHost());
			System.out.println("port : " + url.getPort());
			System.out.println("path : " + url.getPath());
			System.out.println("file : " + url.getFile());
			System.out.println("query : " + url.getQuery());

			int data = 0;
			try {
				Reader is = new InputStreamReader(url.openStream());
				while ((data = is.read()) != -1) {
					System.out.print((char) data);
				}
				System.out.println();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

/* URL : Uniform Resource Location */
// 프로토콜://호스트명:포트번호/경로명/파일명?쿼리스트링
// 포트번호를 기본 포트번호를 사용하면 생략 가능
// http  기본 포트 : 80
// https 기본 포트 : 443
// 쿼리 스트링 : 파라미터1=값1&파라미터2=값2&...

/* URL 크래스에서 제공하는 메서드 */
// URL( String spec )                                           매개변수 문자열 정보의 URL 객체 생성
// URL( String protocol, String host, String file )             매개변수 문자열 정보의 URL 객체 생성
// URL( String protocol, String host, int port, String file )   매개변수 문자열 정보의 URL 객체 생성

// String   getAuthority()                      호스트명과 포트 리턴
// Object   getContent()                        URL Content 객체 리턴
// Object   getContent( Class[] classes )       URL Content 객체 리턴
// int      getDefaultPort()                    기본 포트 리턴
// String   getFile()                           파일명 리턴
// String   getHost()                           호스트명 리턴
// String   getPath()                           경로명 리턴
// int      getPort()                           포트 리턴
// String   getProtocol()                       프로토콜 리턴
// String   getQuery()                          쿼리 리턴
// String   getRef()                            참조 리턴
// String   getUserInfo()                       사용자 정보 리턴

// URLConnection    openConnection()                URL 과 연결된 객체 리턴
// URLConnection    openConnection( Proxy proxy )   URL 과 연결된 객체 리턴
// InputStream      openStream()                    URL 과 연결된 객체의 InputStream 리턴
// boolean          sameFile( URL other )           두 URL 이 같은지 여부

// void     set( String protocol, String host, int port, String file, String ref )              URL 객체 설정
// void     set( String protocol, String host, int port,
//               String authority, String userInfo, String path, String query, String ref )     URL 객체 설정

// String   toExternalForm()    URL 문자열로 리턴
// URI      toURI()             URL 을 URI 로 변환하여 리턴
