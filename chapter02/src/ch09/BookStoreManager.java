package ch09;

import java.util.Scanner;

public class BookStoreManager {

	public static void main(String[] args) {

//		책을 저장하는 기능 만들고
//		정보를 출력하는 프로그래밍 만들기

//		while문 사용하여 CRUD
//		1.저장 2.전체 조회 3.선택 조회 4. 전체 삭제 0. 프로그램 종료

		final int SAVE = 1;
		final int TOTAL_C = 2;
		final int SELECT_C = 3;
		final int TOTAL_D = 4;
		final int P_END = 0;

		String title;
		String author;
		int choice = -1;
		int lastIndex = 0;

		Scanner sc = new Scanner(System.in);

//		System.out.println("몇개를 저장하실?");
		int count = 100;
		Book[] books = new Book[count];
		do {
			System.out.println("1.저장\t2.전체 조회\t3.선택 조회\t4.전체 삭제\t0.프로그램 종료");
			choice = sc.nextInt();
			sc.nextLine();

			if (choice == SAVE) {
				System.out.println("제목 입력");
				title = sc.nextLine();

				System.out.println("저자 입력");
				author = sc.nextLine();
				books[lastIndex] = new Book(title, author);
				lastIndex++;
			}
			if (choice == TOTAL_C) {
				for (int i = 0; i < books.length; i++) {
					if (books[i] != null) {
						books[i].showInfo();
					}
				}
				if (books[0] == null) {
					System.out.println("조회할 정보가 없습니다.");
				}
			}
			if (choice == SELECT_C) {
				for (int i = 0; i < books.length; i++) {
					if (books[i] != null) {
						books[i].showInfo();
					}
				}

				System.out.println("원하는 저자명을 입력");
				author = sc.nextLine();
				for (int i = 0; i < books.length; i++) {
					if (books[i] != null) {
						if (books[i].getAuthor().equals(author)) {
							books[i].showInfo();
						}
					}
				}
			}
			if (choice == TOTAL_D) {
				for (int i = 0; i < count; i++) {
					books[i] = null;
				}
				System.out.println("모든 정보를 삭제합니다.");
			}
		} while (choice != P_END);
		System.out.println("프로그램을 종료합니다.");
	}
}
