package ch01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyboardToFileExample {

	public static void main(String[] args) {

//		try {
////		입력 스트림 준비
//			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
////		출력 스트림 준비
//			BufferedWriter writer = new BufferedWriter(new FileWriter("ouput2.txt"));
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

//		오토 클로즈 - 자동으로 리소스를 닫아주는 녀석
//		불필요하게 닫아주는 코드를 작성할 피룡가 없다
//		식은 괄호안에 작성하면 됨 - 닫아줄 애들만 작성
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter writer = new BufferedWriter(new FileWriter("output2.txt"));) {
//			중괄호 안에는 수행시킬 코드 작성
			System.out.println("키보드로 입력 받아 데이터를 파일에 작성하기");

			String input = reader.readLine();
//			true->부정 --> !
//			사용자 입력 값이 quit 가 아니라면 true 가 됨다
			while (!(input.equals("quit"))) {
//				파일에 글 작성
				writer.write(input);
				writer.newLine();
//				키보드에서 데이터를 다시 입력 받기
				input = reader.readLine();
			}
//			quit -> 입력하게 되면  while문 종료
			System.out.println("출력이 완료되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}

	} // end of main

} // end of class
