package ch04;

import java.util.Scanner;

public class ContinueMainTest2 {

	public static void main(String[] args) {

//		스캐너를 사용해서 정수 값을 입력 받아 배수의 객수를 출력하는 프로그램
//		테스트 값은 1000-> 3 입력하면 배수가 몇개인지
//		Scanner sc = new Scanner(System.in);
//		System.out.println("정수 값을 입력하세요");
//		int uNum = sc.nextInt();
//		int mc = 0;
//		for (int i = 1; i <= 1000; i++) {
//			if (i % uNum == 0) {
//				mc++;
//				continue;
//			}
//		}
//		System.out.println("입력한 수의 배수는 " + mc + "개 입니다.");

		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요.");
		final int MULTIPLE = scanner.nextInt();
		System.out.println("몇까지 확인 하겠습니까?");
		final int MAX = scanner.nextInt();

		int num = 0;
		int count = 0;

		for (num = 1; num < MAX; num++) {
//			만약 3의 배수이면 화면에 출력하지 마시오
			if (num % MULTIPLE == 0) {
//				count=coun+1;
				count++;
				continue;
			}
		}
		System.out.println(MULTIPLE+"의 배수의 갯수는 "+count+"개 입니다.");
	} // end of main
} // end of class
