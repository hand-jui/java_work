package ch11;

public class FruitMainTest {

	public static void main(String[] args) {
//		다양한 형태로 클래스(타입)을 바라 볼 수 있다 -> 다형성
		Fruit fruit1 = new Banana(); // 업 캐스팅
//		컴파일 시점에는 컴파일러가 앞에 선언된 데이터 타입만 확인한다
		Fruit fruit2 = new Peach();

		Fruit[] fruits = new Fruit[2];
		fruits[0] = fruit1;
		fruits[1] = fruit2;

//		다운 캐스팅 개념을 아시오
		String bananaOrigin = ((Banana) fruit1).origin; // 강제 형 변화과 같아보이지만 아님
		System.out.println("다운 캐스팅 된 값 확인: " + bananaOrigin);

//		반복문
//		instanceof
		for (int i = 0; i < fruits.length; i++) {
			fruits[i].showInfo();
			if (fruits[i] instanceof Banana) {
//				바나나 타입이 맞다면 여기 코드 안으로 들어옴
//				다운 캐스팅 가능
				String origin = ((Banana) fruits[i]).origin;
				System.out.println("원산지: " + bananaOrigin);

			}
		}

	}
}
