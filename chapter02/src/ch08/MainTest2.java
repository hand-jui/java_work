package ch08;

public class MainTest2 {
//	메인 함수 - 코드의 시작점
	public static void main(String[] args) {

//		클래스 안의 멤버 변수를 사용하려면
//		반드시 먼저 메모리에 올려야 함 (프로그램 세상에 존재)

//		수행 요청 - 클래스 이름.
		System.out.println(NumberPrinter.waitNumber);
		NumberPrinter.waitNumber++;
		NumberPrinter.waitNumber++;
		NumberPrinter.waitNumber++;
		System.out.println(NumberPrinter.waitNumber);
		
//		static 은 문법적으로 class xxx {} 안에 작성을 하지만 
//		static 키워드를 가진 놈은 잠시 자리만 빌려 문법만 사용할 뿐 
//		메모리를 사용하는 영역은 미리 뜨는 static 영역이다.
	} // end of main
} // end of class
