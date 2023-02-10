package ch01;

public class Student {

//	상태(속성) (멤버 변수)
	int studentId;
	String studentName;
	String adress;
	double height; // 0.0
	boolean isMarried; // false

//	기능
//	공부한다
	public void study() {
		System.out.println(studentName + "학생이 공부를 합니다.");
	}

//	휴식한다
	public void breakTime() {
		System.out.println(studentName + "학생이 휴식을 취한다.");
	}

	public void showInfo() {
		System.out.println("=====상태창=====");
		System.out.println("학생의 ID값은 : " + studentId);
		System.out.println("학생의 이름은 : " + studentName);
		System.out.println("학생의 주소는 : " + adress);

		System.out.println("==============");
	}

//	함수와 메서드의 차이점
//	자바에서의 메서드란 객체의 기능을 구현하기 위해 클래서 내부에 구현되는 메서드
//	멤버 함수(member function)
//	결론 : 메서드는 자신의 변수를 활용하여 객체의 기능을 구현하는 것

//	학생의 기능(메서드) 3가지 정의

	public void goToSchool() {
		System.out.println(studentName + " 학생은 등교한다.");
	}

	public void test() {
		System.out.println(studentName + " 학생은 시험을 친다.");
	}

	public void sleep() {
		System.out.println(studentName + " 학생은 잠이 온다...");
	}

	public void subway() {
		System.out.println(studentName + " 학생은 지하철을 탄다.");
	}

	public void bus() {
		System.out.println(studentName + " 학생은 버스를 탄다.");
	}
} // end of class
