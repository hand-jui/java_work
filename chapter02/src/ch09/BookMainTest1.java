package ch09;

public class BookMainTest1 {

	public static void main(String[] args) {
//		연관된 하나의 데이터를 통으로 관리하고 싶다면 - 배열(자료구조)
		Book[] books = new Book[10]; // 배열 선언(메모리공간 만들어 두기)
		books[0] = new Book("플러터UI실전", "김근호");
		books[1] = new Book("무궁화꽃이피었습니다", "김진명");
		books[2] = new Book("흐르는강물처럼", "파울로코엘료");
		books[3] = new Book("리딩으로리드하라", "이지성");
		books[4] = new Book("사피엔스", "유발하라리");

//		books[5]=new Book("홍길동전","허균"); java.lang.ArrayIndexOutOfBoundsException
//		System.out.println(books[0].getTitle());
//		System.out.println(books[4].getAuthor());

//		books.length -> 배열 길이->10
		for (int i = 0; i < books.length; i++) {
			if (books[i] != null) { // 방어적 코드 작성
				System.out.println(books[i].getTitle());
			}
		}
//		주의1
//		인덱스 크기는 n-1개다
//		배열의 길이와 인덱스의. 길이는 다르다

//		주의2
//		배열의 길이와 실제 들어가 있는 값의 갯수는 다를 수 있다.

//		Q1. double 배열 4개 선언하여 임의 값 넣고 출력
//		3번째 인덱스는 값을 할당 하지 마시오
//		출력은 for문
		double[] db = new double[4];
		db[0] = 8.2;
		db[1] = 12.0;
		db[2] = 95.86;

		for (int i = 0; i < db.length; i++) {
			if (db[i] != 0.0) {
				System.out.println(db[i]);
			}
		}

//		예제 books를 사용하라
//		Q2. 0번째 인덱스에 있는 값과 인덱스 2번째 값을 스왑해주세요
		Book temp;
		temp = books[0];
		books[0] = books[2];
		books[2] = temp;

		System.out.println(books[0].getTitle());
		System.out.println(books[2].getTitle());

		System.out.println("");

//		Q3. 인덱스 3번의 값을 삭제
		books[3] = null;
		for (int i = 0; i < 5; i++) {
			if (books[i] != null) {
				books[i].showInfo();
			}
		}

	}

}
