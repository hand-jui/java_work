package ch07;

public class Student {

//	학번과 이름을 정의
	private String name;
	private int id;
//	생성자 정의

	public Student(String name, int id) {
		this.name = name;
		this.id = id;
	}

//	Q1. toString --> 학번,이름이 화면에 출력되도록 설계
	@Override
	public String toString() {
		return this.name + "," + this.id;
	}
//	equals 메서드를 재정의 해주세요
//	이름이 같다면 동명이인입니다라고 출력

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student targetStudent = (Student) obj;
			if (this.name == targetStudent.name) {
				System.out.println("동명이인입니다.");
				return true;
			}
		}
		return false;
	}

}
