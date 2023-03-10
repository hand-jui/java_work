package ch06;

public class BankMainTest1 {

	public static void main(String[] args) {
		Bank bankB = new Bank();
		bankB.deposit(10_000);
		bankB.withdraw(6_000);

//		신입 개발자가 실수로 멤버 변수에 접근해서 수정 
//		실수 --> 입금(기능),출금(기능)
//		bankB.balance = 100_000;  // private 선언하는 순간 외부에서 접근 불가!!!
//		실수할 가능성이 생긴다.
//		예방 -> 접근 제어지시자를 할당한다 --> private
//		정보출력
		bankB.showInfo();

//		현재 금액에 대한 정보만
//		get 메서드 사용해보기
		int currentMoney = bankB.getBalance();
		System.out.println("currentMoney : " + currentMoney);
		
//		set 메서드 사용해보기
		bankB.setBalance(-200_000);
		bankB.showInfo();
	} // end of main
} // end of class
