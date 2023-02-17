package ch02;

public class MainTest1 {

	public static void main(String[] args) {

//		현재 잔액 100_000원
		BankAccount bankAccount = new BankAccount();

		Father father = new Father(bankAccount);
		Mother mother = new Mother(bankAccount);
		
//		아버지 입금하기
		father.start();  // 3초 걸림
//		어머니가 출금
		mother.start();  //  
		
//		정상 처리 : 10만원 + 1만원 -5천원 = 10만 5천원<-- 정상 동작
	}
}
