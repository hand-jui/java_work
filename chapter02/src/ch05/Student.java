package ch05;

public class Student {

	String name;
	int money;

	public Student(String name, int money) {
		this.name = name;
		this.money = money;
	}

//	학생이 버스를 탄다
	public void takeBus(Bus targetBus) {

		System.out.println("takeBus 메서드 실행됨");
//		요금을 넣어야 한다.
		targetBus.take(1_000);
		this.money = this.money - 1000;
	}

	public void takeAreaBus(Bus targetAreaBus) {
		System.out.println("takeAreaBus 메서드 실행됨");
		targetAreaBus.take(1_500);
		this.money -= 1500;
	}

//	학생이 지하철을 탄다
	public void takeSubway(Subway targetSubway) {
		System.out.println("takeSubway 메서드 실행됨");
		targetSubway.take(1_200);
		this.money = this.money - 1200;
	}

//	상태창
	public void showInfo() {
		System.out.println("학생의 이름 : " + this.name);
		System.out.println("학생의 소지금 : " + this.money);
		System.out.println("==================");
	}
}
