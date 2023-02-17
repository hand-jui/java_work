package ch02;

//sharedResource 상황을 구현해 보자
public class BankAccount {

	int money = 100_000;

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

//	출금, 입금
//	synchronized <-- 동기화 처리 진행
	public synchronized void saveMoney(int money) {
		int currentMoney = getMoney();
		System.out.println(currentMoney);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		setMoney(currentMoney + money);
		System.out.println("입금 후 계좌 잔액 : " + getMoney());
	}

//	synchronized 메서드
	public synchronized int widthDraw(int money) {
//		10만원 상태
//		synchronized 블록
		synchronized (this) {
			int currentMoney = getMoney();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (currentMoney >= money) {
				setMoney(currentMoney - money);
				System.out.println("출금 후 계좌 잔액 : " + getMoney());
				return money;
			} else {
				System.out.println("잔액이 부족합니다.");
				return 0;
			}
		}
	}

}

class Father extends Thread {
	BankAccount account;

	public Father(BankAccount account) {
		this.account = account;
	}

	@Override
	public void run() {
//		입금하기
		account.saveMoney(10_000);
	}
}

class Mother extends Thread {
	BankAccount account;

	public Mother(BankAccount account) {
		this.account = account;
	}

	@Override
	public void run() {
//		출금하기
		account.widthDraw(5_000);
	}
}