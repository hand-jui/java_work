package ex12;

public abstract class Computer {

	public abstract void display();

	public abstract void typing();

	public void turnOn() {
		System.out.println("컴퓨터가 켜집니다.");
	}

	public void turnOff() {
		System.out.println("컴퓨터가 종료됩니다.");
	}

}
