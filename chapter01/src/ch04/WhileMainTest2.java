package ch04;

import java.util.Scanner;

public class WhileMainTest2 {
//	메인 작업자(메인 쓰래드)
	public static void main(String[] args) {

//		do {
//			조건에 관계 없이 한번은 수행되는 반복문
//		}while(조건식);

//		사용자가 0을 입력사면 프로그램을 종료하는 코드를 만들어라.
		System.out.println("값을 입력해 주세요");
		Scanner sc = new Scanner(System.in);
		int userInput = -1;

		int num = 1;
		int sum = 0;
		do {
			System.out.println("값을 입력해 주세요");
			userInput=sc.nextInt();
//			한번 코드를 수행하고
//			다시 사용자 입력값을 받고 싶다면 
			sum += userInput;
			System.out.println("연산된 값 : "+sum);
		} while (true);

		// 1>=10
//		while(true) {
//			System.out.println("--");
////			예외처리
//			try {
////				쓰래드
//				Thread.sleep(1000);
//			} catch (Exception e) {
//			}
//		}   // end of while

	} // end of main
} // end of class
