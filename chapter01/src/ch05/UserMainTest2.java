package ch05;

import java.util.Scanner;

//클래스를 사용하는 쪽 코드 작성
public class UserMainTest2 {
//	메인 함수
	public static void main(String[] args) {
//		테스트 코드
		Scanner scanner = new Scanner(System.in);
//		입력장치(키보드 값을 받아주는 객체)
//		정수 값을 입력받을 때
		int userInput1 = scanner.nextInt();
//		100+엔터(개행문자 \n)
		scanner.nextLine(); // <--엔터키 소화

		User user1 = new User();
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력해주세요");
		user1.name = sc.nextLine();

//		스캐너를 활용해서 값을 입력 받고 화면에 뿌리기
//		정의한 클래스
		System.out.println("id를 입력해주세요");
		user1.id = sc.nextLine();

		System.out.println("패스워드를 입력해주세요");
		user1.pw = sc.nextInt();

		System.out.println("키를 입력해주세요");
		user1.height = sc.nextDouble();

		System.out.println("전화번호를 입력해주세요");
		sc.nextLine();
		user1.phone = sc.nextLine();

		System.out.println("이메일를 입력해주세요");
		user1.eMail = sc.nextLine();

		System.out.println("국가를 입력해주세요");
		user1.nation = sc.nextLine();

		System.out.println("====상태창====");
		System.out.println("name : " + user1.name);
		System.out.println("id : " + user1.id);
		System.out.println("pw : " + user1.pw);
		System.out.println("키 : " + user1.height);
		System.out.println("전화번호 : " + user1.phone);
		System.out.println("이메일 : " + user1.eMail);
		System.out.println("국가 : " + user1.nation);
	} // end of main
} // end of class
