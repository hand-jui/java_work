package ch06;

//Random 가지고 오다-->LottoGame.java 파일로
import java.util.Random;

public class LottoGame {

//	함수를 만들 때 반드시 어떠한 기능을 만들지 정의하고 코드 작성
//	랜덤 숫자 하나를 반환하는 기능 만들기
	static int randomNumber() {
//		JDK가 만들어준 도구 이용
		Random random = new Random();
//		랜덤 값을 하나 생성하여 반환--> 45
//		0부터 시작 --> 0~44 반환
		int resultNumber = random.nextInt(45) + 1;
		return resultNumber;
	}

//	코드 실행 메인함수
	public static void main(String[] args) {
//		System.out.println(randomNumber());
		int r1 = randomNumber();
		int r2 = randomNumber();
		int r3 = randomNumber();
		int r4 = randomNumber();
		int r5 = randomNumber();
		int r6 = randomNumber();
		
		System.out.println(r1+":"+r2+":"+r3+":"+r4+":"+r5+":"+r6);

	} // end of main
} // end of class
