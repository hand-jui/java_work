package ch06;

public class MainTest2 {

//	메인 함수
//	스택 : 함수가 호출될 때 지역 변수들이 사용하는 메모리
	public static void main(String[] args) {
		int n1;
		int n2;
		n1=100;
//		함수 호출하는 순간 스택 메모리 생성
		hello();
	} // end of main

	
	public static void hello() {
		int a1;
	}
} // end of class
