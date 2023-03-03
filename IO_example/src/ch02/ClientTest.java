package ch02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ClientTest {

//	통신을 하기 위해 소켓이 필요+ 주소(ip) + 포트번호
	Socket socket;
	final String IP = "192.168.0.76";
	final int PORT = 10000;
	BufferedReader reader;
	BufferedWriter writer;

	public ClientTest() {
		initData();
	}

	private void initData() {
		System.out.println("클라이언트에서 서버 접속 요청");
		try {
			socket = new Socket(IP, PORT);
//			클라이언트와 서버연결 완료

//			키보드에서 데이터를 입력받기
			reader = new BufferedReader(new InputStreamReader(System.in));

			String input = reader.readLine(); // 키보드에서 데이터 입력 받음

//			소켓 통신을 통해서 데이터를 출력
//			출력 스트림 연결 -> 대상 : 소켓
			writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

			writer.write(input);
			writer.newLine(); // 문자의 끝을 알려주어야함
			writer.flush();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
//			reader.close();
//			writer.close();
		}

	}

	public static void main(String[] args) {
		new ClientTest();
	} // end of main
} // end of class
