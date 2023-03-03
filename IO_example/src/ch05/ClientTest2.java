package ch05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientTest2 {

	Socket socket;
	final String IP = "192.168.0.80";
//	final String IP = "localhost";
	final int PORT = 10000;

	BufferedReader socketReader;
	BufferedWriter bufferedWriter;
	BufferedReader keyboardReader;

	public ClientTest2() {

		initData();
	}

	private void initData() {
		System.out.println("클라이언트>> 서버 접속 요청");
		try {
			socket = new Socket(IP, PORT);
			System.out.println("클라이언트>> 서버 접속 완료");
			keyboardReader = new BufferedReader(new InputStreamReader(System.in));

			bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

			socketReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			new Thread(new ReadThread()).start();

			while (true) {
//				System.out.println("클라이언트>> 키보드 입력대기");
				String input = keyboardReader.readLine();
				bufferedWriter.write(input);
				bufferedWriter.newLine();
				bufferedWriter.flush();
				System.out.println("클라이언트>>서버 " + input);
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	} // end of initData

	class ReadThread implements Runnable {

		@Override
		public void run() {
			while (true) {
				try {
					String serverMsg = socketReader.readLine();
					System.out.println("서버>>클라이언트 " + serverMsg);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

	public static void main(String[] args) {
		new ClientTest2();
	} // end of main

} // end of class
