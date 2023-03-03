package ch05;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainTest2 {

	public static void main(String[] args) {

		long millisecond = 0;

//		1
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("bubble.zip");
			fos = new FileOutputStream("bubblecopy.zip");
			int i;
			millisecond = System.currentTimeMillis();
			while ((i = fis.read()) != -1) {
//				zip 파일을 byte 타입으로 i 공간에 읽어들이는 중
				fos.write(i); // 쓰는 중
			}
			millisecond = System.currentTimeMillis() - millisecond;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("파일 복사 시 소요시간 : " + millisecond);
	} // end of main
} // end of class
