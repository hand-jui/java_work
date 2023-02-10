package ch03;

public class MainTest5 {

//	코드 시작점
	public static void main(String[] args) {

//		관계 연산자(비교 연산자)
//		관찰의 결과가 참, 거짓으로 판별
//		결과는 오직 true, false로 반환

		int num1 = 5;
		int num2 = 3;

//		5 > 3;
		System.out.println(5 > 3);
		boolean value1 = 5 > 3;
//		주어를 관계 연산자로 봐야 좋음
		System.out.println(value1);

		boolean value2 = 5 < 3;
		System.out.println(value2);

		boolean value3 = num1 == num2;
		System.out.println(value3);

		boolean value4 = num1 != num2;
		System.out.println(value4);

	} // end of main

} // end of class
