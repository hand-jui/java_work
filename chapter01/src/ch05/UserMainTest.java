package ch05;

//클래스를 사용하는 쪽 코드 작성
public class UserMainTest {
//	메인 함수
	public static void main(String[] args) {

//		메모리에 올리고
//		값 할당
//		화면에 값 출력
		User user = new User();

		user.name = "쥥";
		user.id = "thswnld2";
		user.pw = 1234;
		user.level = 200;
		user.height = 162;
		user.phone = "010-xxxx-zzzz";
		user.eMail = "aaa@gmail.com";
		user.nation = "대한민국";

		System.out.println(user.name);
		System.out.println(user.id);
		System.out.println(user.pw);
		System.out.println(user.level);
		System.out.println(user.height);
		System.out.println(user.phone);
		System.out.println(user.eMail);
		System.out.println(user.nation);
	} // end of main
} // end of class
