package ch05;

public class Toy extends Contents{

	@Override
	public String toString() {
		return "장난감입니당";
	}

	@Override
	public void doTake() {
		System.out.println("장난감을 꺼냅니당");
	} 
	
}
