package ch05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest2 {

	ServerSocket serverSocket;
	Socket socket;
	BufferedReader socketReader;
	BufferedWriter bufferedWriter;
	BufferedReader keyboardReader;

	public ServerTest2() {
		initData();
	}

	private void initData() {
		try {
			serverSocket = new ServerSocket(10000);
			System.out.println("서버>>클라이언트 접속 대기");
			socket = serverSocket.accept();
			System.out.println("서버>>클라이언트 접속 완료");
			socketReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			keyboardReader = new BufferedReader(new InputStreamReader(System.in));
			bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

			new Thread(new WriteThread()).start();

			while (true) {
				String Msg = "클라이언트>>서버 " + socketReader.readLine();
				System.out.println(Msg);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	} // end of initData

	class WriteThread implements Runnable {

		@Override
		public void run() {

			while (true) {
				try {
					String serverMsg = keyboardReader.readLine();
					bufferedWriter.write(serverMsg + "\n");
					bufferedWriter.flush();
					System.out.println("서버>>" + serverMsg);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

	public static void main(String[] args) {
		new ServerTest2();
	} // end of main

} // end of class
