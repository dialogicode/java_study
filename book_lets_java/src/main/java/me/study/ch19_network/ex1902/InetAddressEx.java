package me.study.ch19_network.ex1902;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEx {
	public static void main (String[] args) {
		try {
			// getByName() 메서드로 InetAddress 객체 생성
			InetAddress ip = InetAddress.getByName("www.google.co.kr");
			System.out.println("hostname: " + ip.getHostName());
			System.out.println("ip: " + ip.getHostAddress());

			// getAllByName() 메서드로 InetAddress 객체 배열 생성
			InetAddress[] ips = InetAddress.getAllByName("www.google.co.kr");
			for (InetAddress i : ips) {
				System.out.println("ip 주소 : " + i);
			}

			// ip 주소값을 byte[] 배열로 리턴
			byte[] ipAddr = ip.getAddress();

			// byte 자료형의 표현 범위 : -128 ~ 127
			// 127 이상의 값은 음수로 표현됨
			for (byte b : ipAddr) {
				System.out.print(((b < 0) ? b + 256 : b) + ".");
			}
			System.out.println();

			// getLocalHost() 메서드로 InetAddress 객체 생성 호출
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("내 컴퓨터 IP : " + local);

			// getByAddress() 메서드로 InetAddress 객체 생성 호출
			InetAddress ip2 = InetAddress.getByAddress(ips[0].getAddress());
			System.out.println(ips[0].getHostAddress() + " 주소 : " + ip2);

		} catch (UnknownHostException e) {
			System.out.println(e.getMessage());
		}
	}
}

/* InetAddress 클래스 객체 생성 메서드 */
//          byte[]          getAddress()                    IP 주소를 byte 배열로 리턴
// static   InetAddress[]   getAllByName( String host )     호스트에 지정된 모든 호스트의 IP 주소를 배열로 리턴
// static   InetAddress     getByAddress( byte[] addr )     byte 배열을 통해 IP 주소를 얻음
// static   InetAddress     getByName( String host )        host 를 통해 IP 주소를 얻음
//          String          getCanonicalHostName()          FQDN(fully qualified domain name) 리턴
//          String          getHostAddress()                호스트의 IP 주소 리턴
//          String          getHostName()                   호스트의 이름 리턴
// static   InetAddress     getLocalHost()                  local IP 주소 리턴
//          boolean         isMulticastAddress()            IP 주소가 멀티캐스트 주소인지 여부
//          boolean         isLoopbackAddress()             IP 주소가 127.0.0.1 인지 여부
