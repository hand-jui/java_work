package ch07;

public class Bus {

	int busNumber;
	int busMoney;
	int passengerCount;

	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}

	public void take(int money) {
		this.busMoney += money;
		passengerCount++;
	}

	public void showInfo() {
		System.out.println(busNumber + "번 버스에 " + passengerCount + "명이 탑승하였습니다.\n");
	}
}
