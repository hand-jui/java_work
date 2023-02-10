package ch07;

public class Subway {

	int subwayLine;
	int subwayMoney;
	int passengerCount;

	public Subway(int subwayLine) {
		this.subwayLine = subwayLine;
	}

	public void take(int subwayMoney) {
		this.subwayMoney += subwayMoney;
		passengerCount++;
	}

	public void showInfo() {
		System.out.println(subwayLine + "호선 지하철에 " + passengerCount + "명이 탑승하였습니다.\n");
	}

}
