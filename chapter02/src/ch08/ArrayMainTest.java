package ch08;

public class ArrayMainTest {

	public static void main(String[] args) {
//		배열이란
//		!!연관된 데이터!!를 모아서 !!통으로!! 관리하기 위해 사용하는 !!데이터 타입!!
//		변수가 하나의 데이터를 저장하기 위한 것이라면 배열은 여러개의 데이터를 하나의 변수에 저장하기 위한 것

//		배열을 선언할 때 몇 칸의 공간을 사용할지 먼저 지정
		int[] arr = new int[5];

//		배열 안에 값을 넣는 방법(인덱스 연산 값 할당)
		arr[0] = 1;
		arr[1] = 100;
		arr[2] = 3;
		arr[3] = 5;
		arr[4] = 300;

//		값 확인하는 방법
		System.out.println(arr[2]);

//		String 배열 선언
		String[] arr1 = new String[3];
		arr1[0] = "엄마";
		arr1[1] = "왜";
		arr1[2] = "전화함?";
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
//		double 배열 선언
		double[] arr2 = new double[4];
		arr2[0] = 9.5;
		arr2[1] = 8.6;
		arr2[2] = 8.8;
		arr2[3] = 2.11;
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		System.out.println(arr2[3]);
	}

}
