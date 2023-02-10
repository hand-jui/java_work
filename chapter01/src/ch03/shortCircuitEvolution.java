package ch03;

public class shortCircuitEvolution {
	public static void main(String[] args) {
		int a = 50;
		int b = 30;
		boolean value;
		
		// 논리합
		value = ((a *= 2) > 80) || ((b /= 2) < 20);
		// 	  = 100 > 80 -> 참이기 때문에 뒤의 항은 계산하지 않음
		System.out.println(value);
		System.out.println(a); // => 100
		System.out.println(b); // => 30
		
		// 논리곱
		value = ((b *= 4) < 100) && ((a /= 4) > 20);
		//    = 120 < 100 -> 거짓이기 때문에 뒤의 항은 계산하지 않음
		System.out.println(value);
		System.out.println(b); // => 120
		System.out.println(a); // => 100
	}

}
