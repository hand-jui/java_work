package ch02;

public class Main {

	public static void main(String[] args) {

		Address address = new Address("부산진구 부전동", "부산", "아파트 806호", "12345");
		Person person = new Person("홍길동", 20, address);

		System.out.println("name: " + person.getName());
		System.out.println("Address: " + person.getAddress().toString());
//		Person 클래스에서 Address 클래스를 참조할 수 있다
//		Address 클래스는 Person 클래스를 참조할 수 없다

	} // end of main

} // end of class
