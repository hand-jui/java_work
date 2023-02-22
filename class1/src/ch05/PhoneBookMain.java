package ch05;

import java.util.HashMap;
import java.util.Scanner;

public class PhoneBookMain {

	public static void main(String[] args) {
		HashMap<String, String> phoneBook = new HashMap<>();
		phoneBook.put("철이", "010-1111-1111");
		phoneBook.put("미애", "010-2222-2222");
		phoneBook.put("오송", "010-3333-3333");
		phoneBook.put("도손", "010-4444-4444");
		phoneBook.put("채체", "010-5555-5555");

//		while 0.종료 1.저장 2.전체조회 3.선택조회 4.선택삭제 5.전체삭제
		Scanner scanner = new Scanner(System.in);
		System.out.println(">> 기능을 선택해주세요 <<");
		String userInput = "-1";
		while (!userInput.equals(0)) {
			System.out.println("0.종료\t1.저장\t2.전체조회\t 3.선택조회\t4.선택삭제\t 5.전체삭제");
			userInput = scanner.nextLine();
			if (userInput.equals("1")) {
				System.out.println("이름");
				String name = scanner.nextLine();
				System.out.println("전화번호");
				String phoneNumber = scanner.nextLine();
				phoneBook.put(name, phoneNumber);
			} else if (userInput.equals("2")) {
				for (String key : phoneBook.keySet()) {
					System.out.println("이름: " + key);
					System.out.println("전화번호: " + phoneBook.get(key));
				}
			} else if (userInput.equals("3")) {
				System.out.println("검색할 이름을 정확히 적어주세요.");
				String name = scanner.nextLine();
				System.out.println("이름: " + name);
				System.out.println("전화번호: " + phoneBook.get(name));
			} else if (userInput.equals("4")) {
				System.out.println("삭제할 이름을 정확히 적어주세요.");
				String name = scanner.nextLine();
				phoneBook.remove(name);
				System.out.println("선택한 이름의 기록이 삭제되었습니다.");
			} else if (userInput.equals("5")) {
				phoneBook.clear();
				System.out.println("전체삭제 되었습니다.");
			}
		}
		System.out.println("프로그램 종료");
	}

}
