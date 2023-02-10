package ch04;

import java.util.Scanner;

public class IfMainTest2 {
//	main 함수
	public static void main(String[] args) {
		System.out.println("성적을 입력하세요");

		Scanner sc = new Scanner(System.in);
		int point = sc.nextInt();
//		100 이하 90 이상 : A학점입니다.
//		89 이하 80 이상 : B학점입니다.
//		79 이하 70 이상 : C학점입니다.
//		69 이하 60 이상 : D학점입니다.
//		나머지 : F학점입니다.
		char result = 'Z';

		if (point <= 100 && point >= 90) {
//			System.out.println("A학점입니다.");
			result = 'A';
		} else if (point <= 89 && point >= 80) {
//			System.out.println("B학점입니다.");
			result = 'B';
		} else if (point <= 79 && point >= 70) {
//			System.out.println("C학점입니다.");
			result = 'C';
		} else if (point <= 69 && point >= 60) {
//			System.out.println("D학점입니다.");
			result = 'D';
		}
//		} else {
////			System.out.println("F학점입니다.");
//			result = 'F';
//		}
		
//		방어적 코드를 작성
		if(result=='Z') {
			System.out.println("값을 잘못 입력 하였습니다.");
		} else {
			System.out.println(result + "학점입니다.");
		}
	} // end of main
}
