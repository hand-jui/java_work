package ch06;

public class MainTest1 {

//	1.리턴값이 int,매개변수 n1,n2,n3 이름은 intAdd
	static int intAdd(int n1, int n2, int n3) {
//		지역 변수
//		int result1 = n1 + n2 + n3;
//		return result1;
		return n1 + n2 + n3; // 매개 변수를 활용 연산 후 바로 리턴
	}

//	2.리턴값이 double 매개변수 n1,n2 이름은 doubleAdd
	static double doubleAdd(double n1, double n2) {
//		double result2 = n1 + n2;
//		return result2;
		return n1 + n2;
	}

//	3.리턴값이 void, 매개변수는 String article, 함수 이름은 printArticle 출력
	static void printArticle(String article) {
		System.out.println(article);
	}

//	테스트-실행코드 main
	public static void main(String[] args) {
//		호출해서 수행
//		1.
		System.out.println(intAdd(1, 2, 3));
//		2.
		System.out.println(doubleAdd(10, 10));
//		3.
//		오류 발생
//		System.out.println(printArticle("반가워~"));
		printArticle("반가워~");
	}
}
