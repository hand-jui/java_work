package ch04;

public class ForMainTest2 {

	public static void main(String[] args) {

//		이중 for 문을 이용하여 2~9단까지 구구단을 출력
//		for (int j = 2; j < 10; j++) {
//			for (int i = 1; i < 10; i++) {
//				System.out.println(j + "*" + i + "=" + i * j);
//			}
//			System.out.println("======");
//		}

		for (int a = 1; a < 4; a = a + 2) {
			for (int b = 1; b <= a; b++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	} // end of main
} // end of class
