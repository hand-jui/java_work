package ch03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream4 {
	public static void main(String[] args) {
		FileOutputStream fos = null;
//		파일이 없다면 FileOutputStream -> 파일을 먼저 생성해 준다
		try {
			byte[] bs = new byte[26];
			byte myData = 65;
			fos = new FileOutputStream("output4.txt", true); // true -> 추가적으로 글을 쓰는 동작을 함
//			파일에 A~Z까지 알파벳 출력하는 코드 작성 방법은?
//			반복 횟수 - for
			for (int i = 0; i < bs.length; i++) {
//				fos.write(myData);
				bs[i] = myData;
				myData++;
			}
			fos.write(bs);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	} // end of main
} // end of class
