package ch05;

public class Cloths extends Contents{

	@Override
	public String toString() {
		return "옷";
	}

	@Override
	public void doTake() {
		System.out.println("옷을 꺼냅니다");
	}
	
	
}
