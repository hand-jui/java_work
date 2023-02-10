package ch04;

import java.util.Scanner;

public class WhileMainTest3 {
//	메인 작업자(메인 쓰래드)
	public static void main(String[] args) {

		int num;
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
//		사용자가 0을 입력하면 프로그램을 종료하도록 설계
//		0이 아니라면 사용자가 입력한 값을 계속 덧셈해서 sum에 담기
//		do-while로 코드 작성
		int userInput = -1;
		do {
			System.out.println("덧셈 정수값을 입력해주세요");
			userInput = scanner.nextInt();
			sum += userInput;
			System.out.println("연산된 값 : " + sum);
		} while (userInput != 0);
		System.out.println("연산된 결과는 " + sum + "입니다.");
		System.out.println("연산이 종료되었습니다.");
	} // end of main
} // end of class
