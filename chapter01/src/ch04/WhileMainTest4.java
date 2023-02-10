package ch04;

import java.util.Scanner;

public class WhileMainTest4 {
//	메인 작업자(메인 쓰래드)
	public static void main(String[] args) {

		int num = 1;
		int sum = 0;
//		상수 만들어 보기
		final int USER_INPUT;
		Scanner scanner = new Scanner(System.in);
		System.out.println("덧셈할 정수값을 입력해주세요");
		USER_INPUT = scanner.nextInt();
		while (num <= USER_INPUT) {
			sum +=num;
			num++;
		}
		System.out.println("결과값 : "+ sum);
//		사용자가 0을 입력하면 프로그램을 종료하도록 설계
//		0이 아니라면 사용자가 입력한 값을 계속 덧셈해서 sum에 담기
//		while로 코드 작성

//		int userInput = -1;
//		while (userInput != 0) {
//			userInput = scanner.nextInt();
//			sum += userInput;
//			System.out.println("덧셈 값 : " + sum);
//		}
//		System.out.println("연산의 결과값:" + sum);
//		System.out.println("연산이 종료되었습니다.");

	} // end of main
} // end of class
