package ch08;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class MyException {

	public static void main(String[] args) {

		TxtFileInputManager inputManager = new TxtFileInputManager("text.txt");
		try {
			String result = inputManager.readTxtFileData();
			System.out.println("result : " + result);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

class TxtFileInputManager {

//	외부 파일을 내 메모리 상으로 가져올 수 있는 녀석
	private FileInputStream fis;
	private String fileName;

	public TxtFileInputManager(String fileName) {
		this.fileName = fileName;
	}

	public String readTxtFileData() throws IOException {

//		IOException이 FileNotFoundException 보다 더 부모
//		계층구조 확인할 수 있음
		fis = new FileInputStream(this.fileName);
		Properties prop = new Properties();
		prop.load(fis);
//		KEY = VALUE <-- 데이터를 읽어주는 녀석
//		name = 홍길동 => 홍길동 => 추출
		String name = prop.getProperty("name");
		return name;
	}
}

class MyABException extends IOException {
//	사용자 정의 예외 클래스도 만들 수 있다
}