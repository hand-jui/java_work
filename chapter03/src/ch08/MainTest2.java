package ch08;

public class MainTest2 {
//	main 함수
	public static void main(String[] args) {

//		예외 처리 구문 작성
//		10/0 연산 시키고 예외 처리까지 작성해 주세요
//		1. try-catch 구문 작성
		try {
			int result1 = 10 / 0;
			System.out.println(result1);
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}

//		2. 클래스 설계 throws 활용
		calculator calculator = new calculator();
		try {
			int result = calculator.divide(10, 0);
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("0으로 나눌수 없다");
		}

	} // end of main

} // end of class

class calculator {

	public int divide(int a, int b) throws Exception {
		return a / b;
	}
}
