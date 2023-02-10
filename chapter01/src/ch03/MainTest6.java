package ch03;

public class MainTest6 {
//	코드의 시작점
	public static void main(String[] args) {
//		논리 연산자 (&&,||)
//		&& <-- 논리 곱
//		|| <-- 논리 합
//		!  <-- 부정
//		연산의 결과 값은 true, false 이다.
//		보통 비교연산자와 함께 많이 사용

		int num1 = 10;
		int num2 = 20;

//		boolean flag1 = (num1 > 0) && (num2 > 0);
//		System.out.println(flag1);
		boolean flag1 = (num1 > 0) || (num2 > 0);
		System.out.println(flag1);

		flag1 = (num1 > 0) && (num1 < 0);
		System.out.println(!flag1);

		boolean flag2 = (num1 > 0) || (num2 < 0);
		System.out.println(flag2);

//		결론: 논리 곱에서는 하나라도 거짓이 있으면 연산 결과는 false
//	       : 논리 합에서는 하나라도 참이 있으면 연산 결과는 true

		System.out.println(!(5 > 3));

	} // end of main

} // end of class
