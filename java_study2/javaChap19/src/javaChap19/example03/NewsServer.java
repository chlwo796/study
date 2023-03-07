package javaChap19.example03;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketAddress;
import java.util.Scanner;

public class NewsServer {
	private static DatagramSocket datagramSocket = null;

	public static void main(String[] args) {
		System.out.println("----------------------------------------------");
		System.out.println("서버를 종료하려면 q 또는 Q를 입력하고 Enter키를 입력하세요.");
		System.out.println("----------------------------------------------");
		startServer();

		Scanner sc = new Scanner(System.in);

		while (true) {
			String key = sc.nextLine();
			if (key.equalsIgnoreCase("q")) {
				break;
			}
		}
		sc.close();

		stopServer();
	}

	public static void startServer() {
		Thread thread = new Thread() {
			@Override
			public void run() {
				try {
					datagramSocket = new DatagramSocket(50001);
					System.out.println("[서버] 시작됨");

					while (true) {
						DatagramPacket receivePacket = new DatagramPacket(new byte[1024], 1024);
						datagramSocket.receive(receivePacket);
						String newsKind = new String(receivePacket.getData(), 0, receivePacket.getLength(), "UTF-8");

						SocketAddress socketAddress = receivePacket.getSocketAddress();
						for (int i = 0; i <= 10; i++) {
							String data = newsKind + " : 뉴스" + i;
							byte[] bytes = data.getBytes("UTF-8");
							DatagramPacket sendPacket = new DatagramPacket(bytes, 0, bytes.length, socketAddress);
							datagramSocket.send(sendPacket);
						}
					}
				} catch (IOException e) {
					System.out.println("[서버]" + e.getMessage());
				}
			}
		};
		thread.start();
	}

	public static void stopServer() {

		datagramSocket.close();
		System.out.println("[서버] 종료됨");
	}
}