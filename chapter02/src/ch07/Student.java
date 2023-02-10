package ch07;

public class Student {

	String name;
	int money;

	public Student(String name, int money) {
		this.name = name;
		this.money = money;
	}

	public void takeBus(Bus targetBus) {
		System.out.println(targetBus.busNumber + "번 버스를 탑니다.");
		targetBus.take(1_000);
		this.money -= 1_000;
	}

	public void takeSubway(Subway targetSubway) {
		System.out.println(targetSubway.subwayLine + "호선 지하철을 탑니다.");
		targetSubway.take(1_200);
		this.money -= 1_200;
	}

	public void showInfo() {
		System.out.println("학생 이름: " + this.name);
		System.out.println("학생에게 남은 돈 : " + this.money);
		System.out.println("====================\n");
	}
}
