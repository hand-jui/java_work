package ch04;

public class Bus {

	int busNumber; // 버스 번호
	int passengerCount; // 승객 수
	int money; // 수익

	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}

//	기능
//	달린다
	public void run() {
		System.out.println("버스가 출발합니다.");
	}

//	승차시티다
	public void take(int count) {
//		this.passengerCount++;
//		this.money+=1_000;

		this.passengerCount += count;
		this.money += (1_000 * count);
	}

//	하차시키다
	public void takeOff(int count) {
		this.passengerCount -= count;
		System.out.println("승객 " + count + "명이 하차합니다.");
	}

	public void showInfo() {
		System.out.println("상태창");
		System.out.println("버스 노선번호 : " + this.busNumber);
		System.out.println("승객 수 : " + this.passengerCount);
		System.out.println("수익금 : " + this.money);
	}
}
