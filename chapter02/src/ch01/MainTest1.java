package ch01;

public class MainTest1 {

//	메인 함수
	public static void main(String[] args) {
//		The local variable studentKim may not have been initialized
//		데이터 타입 - 사용자 정의 타입(대문자-->참조 타입)
		Student studentKim = new Student();
		studentKim.studentId = 1;
		studentKim.studentName = "홍길동";
		studentKim.adress = "부산시 해운대구";

		studentKim.study();
		studentKim.breakTime();

		studentKim.showInfo();
		System.out.println("--------------");

		Student studentLee = new Student();
		studentLee.studentName = "이순신";
		studentLee.studentId = 2;
		studentLee.adress = "부산시 진구";
		studentLee.study();
		studentLee.showInfo();

	} // end of main

} // end of class
