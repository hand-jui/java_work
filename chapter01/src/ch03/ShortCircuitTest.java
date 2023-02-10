package ch03;

public class ShortCircuitTest {
//	코드의 시작점
	public static void main(String[] args) {
//		관계 논리곱-->F-->F, 논리합-->T-->T
		int num1 = 5;
		int i = 0;
//										 F	&&	T
		boolean value = ((num1 += 10) < 10) && ((i += 2) < 10);
		System.out.println(value);
		System.out.println("======");
		System.out.println(num1);
		System.out.println(i);
		
		System.out.println("======");
//						25	 ||	4  ->	T
		value=((num1+=10)<10)||((i+=2)<10);
		System.out.println(value);
		
//		Q. shortCircuit 평가 문제를 직접 2문제 만들기
			
		
		
	} // end of main

} // end of class
