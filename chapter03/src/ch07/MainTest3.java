package ch07;

public class MainTest3 {

	public static void main(String[] args) {
		Student student1 = new Student("홍길동", 1);
		Student student2 = new Student("홍길동", 2);
		Student student3 = new Student("티모", 3);
//		자식 객체에 존재하는 각각의 equals메서드 호츨이다
		student1.equals(student2);

		Boolean result1 = student1 == student2;
		System.out.println("result1: " + result1);
		if (student1.equals(student2)) {
			System.out.println("이름이 같아용");
		} else {
			System.out.println("이름이 달라용");
		}

	}
}
