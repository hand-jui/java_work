package ch01;

public class Variable {
//	중괄호(블록)의 범위는 절대적이다.
//	main 이란: 프로그램의 시작점
	public static void main(String[] args) {
		// <-- 주석 (컴파일러가 무시) :프로그램 실행에 영향을 주지 않음
//		변수를 사용하는 방법
		int age;  // 변수를 선언
		int count;
		
		age=1;  // 초기화 한다.(값을 넣다.)
		count=100;  // 구문의 끝은 세미콜론으로 마무리한다.
		
//		화면에 age라는 변수에 담겨있는 값을 출력해줘!!!
		System.out.println(age);
		System.out.println("=====");
		System.out.println(count);
		
//		변할 수 있는 수를 의미한다.
		age=500;
		count=300;
		
		System.out.println(age);
		System.out.println("=====");
		System.out.println(count);
		
//		변수의 선언과 동시에 초기화하기 myAge;
		int myAge=800;  // 변수의 선언과 초기화
		System.out.println(myAge);  // sysout <-코드 힌트 사용해보기
		System.out.println(9000);  // ctrl+alt+ ↓ <- 라인복사
		
		
//		Tip
//		변수 사용시 데이터 타입은 크게 2가지만 기억
//		1.기본 데이터 타입과
//		2.참조 타입
		
	} // end of main

} // end of class
