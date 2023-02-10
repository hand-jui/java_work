package ch02;

import java.util.Scanner;

public class HumanMainTest2 {

	public static void main(String[] args) {

		Human human = new Human();
//		스캐너를 활용해서 값을 할당해 주세요
		Scanner sc = new Scanner(System.in);
//		sc.nextLine();
		System.out.println("이름을 입력하세요");
		human.name = sc.nextLine();
		System.out.println("키를 입력하세요");
		human.height = sc.nextInt();
		System.out.println("몸무게을 입력하세요");
		human.weight = sc.nextInt();
		System.out.println("성별을 입력하세요");
		human.isMan = sc.nextBoolean();
		
//		마지막에는 showInfo 메서드 호출해서 값을 확인해 주세요
		
		human.showInfo();
		
//		심화 0번 입력시에 showInfo 호출하는 기능
		
//		스캐너를 통해서 showInfo 메서드 호출기능 만들어 보기

	} // end of main
} // end of class
