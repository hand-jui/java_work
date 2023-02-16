package ch05;

import java.util.Scanner;

public class YoonYear {

//	윤년 계산

//	4의 배수의 해는 윤년
//	But 4의 배수이면서 100의 배수인 해는 윤년이 아님 ex)100,200,300,500,600,700,900,... a%4==0&&a%100==0
//	100의 배수이면서 400의 배수인 해는 윤년
	public static void main(String[] args) {

		int year;
		Scanner sc = new Scanner(System.in);
		System.out.println("알고싶은 년도를 입력하세요");
		year = sc.nextInt();

		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("윤년");
		} else {
			System.out.println("평년");
		}

	}

}
