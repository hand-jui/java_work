package ch04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest {

//	클라이언트로 연결받는 소켓
	ServerSocket serverSocket;
//	실제 통신을 담당할 소켓 필요
	Socket socket;
//	입력 스트림 - 소켓을 담당
	BufferedReader reader;
//	출력 스트림
	BufferedWriter bufferedwriter;
//	서버 측에서 키보드 데이터를 받기 위해 입력 스트림이 필요
//	키보드에 대한 입력 데이터를 담당
	BufferedReader keyboardReader;

	public ServerTest() {
		initData();
	}

	private void initData() {
		try {
//			서버 소켓 생성
			serverSocket = new ServerSocket(10000);
//			클라이언트 접속 대기
			socket = serverSocket.accept(); // 대기하고 있음 -> 클라이언트가 접속하면 소켓을 반환
			System.out.println("클라이언트 연결 왐료");
//			입력 스트림 연결 -> 대상 : 소켓
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

//			키보드에 연결
			keyboardReader = new BufferedReader(new InputStreamReader(System.in));

//			클라이언트 측으로 데이터를 보내기 위해 출력 스트림 연결 - 대상 소켓
			bufferedwriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

//			새로운 작업자 생성해서 일하라고 명령하기
			WriterThread writerThread = new WriterThread();
//			Runnable 타입을 시작시키는 방법
			Thread thread = new Thread(writerThread);
			thread.start(); // run() 메서드 안에 코드가 동작

//			데이터 읽는 명령 - main 스레드
			while (true) {
				String msg = "클라이언트에서 온 메세지 : " + reader.readLine() + "\n";
				System.out.println(msg);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	} // end of initData

//	내부 클래스 생성
	class WriterThread implements Runnable {

//		새로운 작업자가 해야할 일을 정의한다
		@Override
		public void run() {
//			키보드에서 데이터를 입력받아 소켓 출력 스트림을 통해 데이터를 보내 주어야 한다
			while (true) {
				try {
					String serverMsg = "서버 : " + keyboardReader.readLine();
//				출력 스트림을 통해 데이터 보내기 <-- 소켓
					bufferedwriter.write(serverMsg + "\n");
					bufferedwriter.flush();
					System.out.println("서버가 작성한 문구 확인 : " + serverMsg);
				} catch (IOException e) {
					e.printStackTrace();
				} // 키보드 데이터를 받을 수 있다.
			}
		}
	}

	public static void main(String[] args) {
		new ServerTest();
	} // end of main
} // end of class
