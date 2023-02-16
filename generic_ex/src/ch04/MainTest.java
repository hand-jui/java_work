package ch04;

public class MainTest {

	public static void main(String[] args) {

		GenericPrinter<Powder> genericPrinter1 = new GenericPrinter<>();
		GenericPrinter<Plastic> genericPrinter2 = new GenericPrinter<>();
		
//		T의 상속을 받지 않은 클래스는 제한
//		GenericPrinter<Water> genericPrinter2 = new GenericPrinter<>();

//		재료넣기
		genericPrinter1.setMaterial(new Powder());
		genericPrinter2.setMaterial(new Plastic());
		
//		Q. 제네릭을 활용한 프로그램을 작성하고 테스트 해주삼
		

	}
}
