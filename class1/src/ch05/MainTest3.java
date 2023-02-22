package ch05;

import java.util.HashMap;

public class MainTest3 {

	public static void main(String[] args) {
//		Map 자료구조를 이용해서 전화번호를 저장해주세요
//		1 - String, String
//		2 - String, Object(Person)

		HashMap<String, String> phoneBook = new HashMap<>();

		phoneBook.put("홍길동", "010-1234-1234");
		phoneBook.put("김철수", "010-2222-2222");
		phoneBook.put("홍길동", "010-1234-1234");
		
			
//		전화번호 검색
		System.out.println(phoneBook);
	}
}
