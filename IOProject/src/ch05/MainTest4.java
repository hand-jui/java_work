package ch05;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class MainTest4 {

	public static void main(String[] args) {

//		기반 + 보조 스트림(자료형 문자단위)
		FileReader fileReader = null;
		int count = 0;
		try {
			File file = new File("output2.txt");
			fileReader = new FileReader(file);
//			한줄씩 글자를 읽어라
			BufferedReader bufferedReader = new BufferedReader(fileReader);

//			파일에다 출력하기
			FileWriter writer = new FileWriter("myText.txt");
//			writer.write(bufferedReader.read()); // 한번에 한 글자
			writer.write(bufferedReader.readLine()); // 한번에 한 줄
			writer.flush(); // flush나 close를 버퍼에 저장되어있던게 내려옴
//			int i;
//			기반 스트림 사용(자료대상 - 문자열)
//			while ((i = fileReader.read()) != -1) {
//				System.out.println((char) i);
//				count++;
//			}
//			String temp = bufferedReader.read();
//			while ((i = bufferedReader.read()) != -1) {
//				System.out.println((char) i);
//				count++;
//			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
		System.out.println("반복 횟수 : " + count);

	} // end of main
} // end of class
