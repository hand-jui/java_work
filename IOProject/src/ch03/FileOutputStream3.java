package ch03;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream3 {
	public static void main(String[] args) {
//		output3.txt
//		hello world 를 찍어주세요
		FileOutputStream fos = null;
//		파일이 없다면 FileOutputStream -> 파일을 먼저 생성해 준다
		try {
			byte[] bs = new byte[11];
//			byte myData = 65;
			fos = new FileOutputStream("output3.txt");
			fos.write(104);
			fos.write(101);
			fos.write(108);
			fos.write(108);
			fos.write(111);
			fos.write(32);
			fos.write(119);
			fos.write(111);
			fos.write(114);
			fos.write(108);
			fos.write(100);
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
}
// end of class
