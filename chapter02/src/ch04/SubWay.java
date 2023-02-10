package ch04;

public class SubWay {
//	상태
	int lineNumber;
	int passengerCount;
	int money;

	public SubWay(int lineNumber) {
		this.lineNumber = lineNumber;
	}

//	기능
//	달린다
	public void take(int count) {
		this.passengerCount += count;
		this.money += (1_300 * count);
	}

	public void takeOff(int count) {
		this.passengerCount -= count;
		System.out.println(count + "명의 승객이 내립니다.");
	}

	public void showInfo() {
		System.out.println("상태 창");
		System.out.println("지하철 노선번호 : " + this.lineNumber);
		System.out.println("승객수 : " + this.passengerCount);
		System.out.println("수익 : " + this.money);
	}
}