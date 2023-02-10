package ch11;

import java.util.Random;

public class ToyMachine {

	static int randomNumber() {
		Random random = new Random();

		int resultNumber = random.nextInt(6);
		return resultNumber;
	}

	public static void main(String[] args) {
		Product product1 = new Lego();
		Product product2 = new Keyring();
		Product product3 = new Money();
		Product product4 = new Figure();
		Product product5 = new Car();

		Product[] products = new Product[6];
		products[0] = product1;
		products[1] = product2;
		products[2] = product3;
		products[3] = product4;
		products[4] = product5;
		products[5] = null;

		int random = randomNumber();

		if (random < 5) {
			System.out.println("축 당첨~");
			products[random].showInfo();
			if (products[random] instanceof Money) {
				String moneyMsg = ((Money) product3).msg;
				System.out.println(moneyMsg);
			}
		} else {
			System.out.println("다시 시도~");
		}
	}
}
