package me.study.ch19_network.ex1902;

import java.net.URL;
import java.net.URLConnection;

public class URLConnectionEx {
	public static void main (String[] args) {
		URL url = null;
		String address = "https://www.egovframe.go.kr/home/main.do";

		try {
			url = new URL(address);
			URLConnection conn = url.openConnection();
			System.out.println("conn.toString() : " + conn);
			System.out.println("getAllowUserInteraction() : " + conn.getAllowUserInteraction());
			System.out.println("getConnectTimeout() : " + conn.getConnectTimeout());
			System.out.println("getContent()" + conn.getContent());
			System.out.println("getContentEncoding() : " + conn.getContentEncoding());
			System.out.println("getContentLength h() : " + conn.getContentLength());
			System.out.println("getContentType() : " + conn.getContentType());
			System.out.println("getDate() : " + conn.getDate());
			System.out.println("getDefaultAllowUserInteraction() : " + conn.getAllowUserInteraction());
			System.out.println("getDefaultUseCaches() : " + conn.getDefaultUseCaches());
			System.out.println("getDoInput() : " + conn.getDoInput());
			System.out.println("getDoOutput() : " + conn.getDoOutput());
			System.out.println("getExpiration() : " + conn.getExpiration());
			System.out.println("getHeaderFields() : " + conn.getHeaderFields());
			System.out.println("getIfModifiedSince() : " + conn.getIfModifiedSince());
			System.out.println("getLastModified() : " + conn.getLastModified());
			System.out.println("getReadTimeout() : " + conn.getReadTimeout());
			System.out.println("getURL() : " + conn.getURL());
			System.out.println("getUseCaches() : " + conn.getUseCaches());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

/* URLConnection 클래스 */
// 설정된 URL 간의 연결 기능을 담당하는 추상 클래스
// 추상 클래스이므로 직접 객체 생성은 안되고 URL 클래스를 이용하여 객체화 생성이 가능

// 구현 클래스 : HttpURLConnection, JarURLConnection
// URL 프로토콜이 http 프로토콜이라면 openConnection() 은 HttpURLConnection 객체를 리턴

// URLConnection 을 사용해서 연결하고자 하는 자원에 접근하고 읽고 쓰기를 할 수 있다.

/* 제공 메서드 */
// void     addRequestProperty( String key, String value )
// void     connect()
// boolean  getAllowUserInteraction()
// int      getConnectTimeout()
// Object   getContent()
// Object   getContent( Class[] classes )
// String   getContentEncoding()
// int      getContentLength()
// String   getContentType()
// long     getDate()
// boolean  getDefaultAllowUserInteraction()
// String   getDefaultRequestProperty( String key )
// boolean  getDefaultUseCaches()
