package ch03;

public class MainTest2 {

	public static void main(String[] args) {

//		산술 연산자
		int number1 = 5 + 3;
		int number2 = 5 - 3;
		int number3 = 5 * 3;
//		double number4 = 5.0 / 4.0;
//		double number4 = (double) 5 / (double) 4;
		int number4 = (int) (5.0 / 4.0);
		int number5 = 5 % 3;

		System.out.println(number1);
		System.out.println(number2);
		System.out.println(number3);
		System.out.println(number4);
		System.out.println(number5);

		System.out.println("=======");

//		Q1. (12 + 3) / 3 을 화면에 출력
		System.out.println((12 + 3) / 3);
//		Q2. (25 % 2) 값을 화면에 출력
		System.out.println(25 % 2);
//		Q3. 3.0 / 5 를 정수값 result 변수에 담기
		int result = (int) 3.0 / 5;
		System.out.println(result);

	}

}
