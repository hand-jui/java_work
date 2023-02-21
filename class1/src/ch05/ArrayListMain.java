package ch05;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListMain {

	public static void main(String[] args) {

//		List 계열
		List list0;
//		순서가 있고(인덱스) 중복이 가능하다

		ArrayList<Integer> list = new ArrayList<>(); // 자료구조 - 정수를 담을 수 있는 메모리 공간 선언
		ArrayList<Student> members = new ArrayList<>();
		ArrayList<String> strings = new ArrayList<>();

//		CRUD
//		값 추가 방법
		list.add(3); // 인덱스 0번
		list.add(null); // 인덱스 1번
		list.add(100); // 인덱스 2번
//		-> 3, null, 100
		list.add(1, 20); // 인덱스 번호, 값 할당
//		-> 3, 20, null, 100
//		arrayList add(index, value)  <-- 끼워 넣기
		System.out.println(list.toString());
		System.out.println(list.size()); // -> 4

//		값 삭제 방법
		list.remove(2); // 해당하는 요소에 접근해서 제거
		System.out.println(list.toString());
		System.out.println(list.size()); // -> 3
//		매번 삭제하려면 
//		list.clear(); // <-- 전체 삭제
		System.out.println(list.toString());
		System.out.println(list.size()); // -> 0

//		값을 화면에 출력하는 방법
		System.out.println("------------");
		System.out.println(list.get(2)); // 배열은 인덱스 연산처리, ArrayList .get() 연산을 호출
		System.out.println(list.get(0));
//		System.out.println(list.get(20));  // exception 발생

		System.out.println("------------");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		for (int abc상관없음변수명임 : list) { // -> initializedFor
			System.out.println("변수명" + abc상관없음변수명임);
		}

//		값 검색 기능 사용하기
//		리스트 안에 값이 있는지 없는지 확인하기
//		3,20,100 <-- 70
//		-70 --> int --> 자동으로 형변환 클래스 타입으로 Integer
//		contains 요소 안에 있는지 없는지 판별 - true, false 반환
		System.out.println(list.contains(70));
		System.out.println(list.contains(100));

//		값 100이 몇번째 인덱스에 있는지 
//		indexOf
		System.out.println(list.indexOf(100));
//		값이 있으면 해당하는 인덱스 번호를 리턴
		System.out.println(list.indexOf(10000));
//		값이 없으면 -1을 반환

//		추가
		Iterator<Integer> iter = list.iterator();  // 반복자로 형 변환 Iterator()
		while(iter.hasNext()) {
			System.out.println("값 확인 방법 : "+iter.next());
		}

	}
}

class Student {

}