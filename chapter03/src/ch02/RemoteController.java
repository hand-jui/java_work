package ch02;

public interface RemoteController {
//	모든 변수는 --> public static fainal
//	모든 메서드 --> 추상 메서드!!!

//	인터페이스란?
//	구현된 것이 아무것도 없는 밑그림만 있는 기본 설계도

//	특성
//	멤버 변수, 일반 구현 메서드를 가질 수 없고, 오직 추상 메서드와 상수만을 멤버 변수로 가질 수 있다.
//	인터페이스는 표준, 약속(강제성 있는 규칙)의 의미를 가진다

//	추상클래스보다 추상화가 더 높다.-->더 유연하게 설계가능

	public static final int SERIAL_Number = 100; // 상수만 가질 수 있다.

	public abstract void turnOn();

//	public abstract void turnOff();

//	메서드->추상 메서드
	void trunOff(); // abstract 생략 가능 -> 추상메서드라는 것을 인지

}
