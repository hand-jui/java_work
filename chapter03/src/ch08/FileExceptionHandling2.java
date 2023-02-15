package ch08;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileExceptionHandling2 {

	public static void main(String[] args) {
		MyFile file = new MyFile();
		try {
			file.inputData("하잉");
		} catch (FileNotFoundException e) {
			System.out.println("파일이 엄서용");
		}

	} // end of main
} // end of class

class MyFile {

//	throws 던지다 ->
//	누군가가 MyFile 클래스 사용할 때
//	inputData 오류가 날 수 있으니 예외 처리 흐름은 사용하는 사람이 알아서 구현해
	
	public void inputData(String str) throws FileNotFoundException {
		FileInputStream fis;

		fis = new FileInputStream("test1.txt");
	}
}