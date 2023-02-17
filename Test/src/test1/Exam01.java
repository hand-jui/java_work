package test1;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {

		int input1 = 0;
		int input2 = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("정수를 입력하세요");
		input1 = sc.nextInt();
		System.out.println("정수값을 입력하세요");
		input2 = sc.nextInt();

		for (int j = 2; input1 <= input2; input1++) {
			for (int i = 1; i < 10; i++) {
				System.out.println(input1 + "*" + i + "=" + (input1 * i));
			}
			System.out.println("");
		}
	}
}
