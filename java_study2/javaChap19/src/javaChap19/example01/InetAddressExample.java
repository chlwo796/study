package javaChap19.example01;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExample {
	public static void main(String[] args) throws UnknownHostException {
		InetAddress local = InetAddress.getLocalHost();
		System.out.println("내컴퓨터 IP주소 : " + local.getHostAddress());

		InetAddress[] iaArr = InetAddress.getAllByName("www.naver.com");
		for(InetAddress ia : iaArr) {
			System.out.println("www.naver.com IP 주소 : " + ia.getHostAddress());
		}
	}
}
