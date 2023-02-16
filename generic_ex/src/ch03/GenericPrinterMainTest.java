package ch03;

public class GenericPrinterMainTest {

	public static void main(String[] args) {

		Powder powder = new Powder();
		Plastic plastic = new Plastic();

//		사용방법
		GenericPrinter<Powder> genericPrinter = new GenericPrinter<>();  // 데이터 타입이 명시되는 시점

//		재료넣기
//		최상위 클래스인 Object를 활용하는 것 보다 안정적인 코드를 만들 수 있다
//		또한 가독성도 높아진다
//		genericPrinter.setMaterial(plastic);  // 컴파일 시점에 오류
		genericPrinter.setMaterial(powder);

//		재료꺼ㄴ기
//		다운 캐스팅을 할필요가 ㅇ부사
		Powder usePowder = genericPrinter.getMaterial();
//		Plastic usePowder = genericPrinter.getMaterial();
//		잘못된 데이터 타입을 대입하면 컴파일 시점ㄴ에 오률르 잡아 준다

//		결론 : 가독성이 보다 놓다 안정적인 프로그래밍을 만들 수 있다.
//		같은 변수이름 같은 기능이라면 제네릭 프로그래밍을 설계하면 된다

	} // end of main
} // end of class
