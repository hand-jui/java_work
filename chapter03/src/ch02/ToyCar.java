package ch02;

public class ToyCar implements RemoteController {

	@Override
	public void turnOn() {
		System.out.println("장남감 자동차를 켭니다.");
	}

	@Override
	public void trunOff() {
		System.out.println("장남감 자동차를 끕니다.");

	}
}
