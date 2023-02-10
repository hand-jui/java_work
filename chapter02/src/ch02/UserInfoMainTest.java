package ch02;

public class UserInfoMainTest {

	public static void main(String[] args) {
//		기본 생성자는 사용자 정의 생성자가 있으면 만들어 주지 않는다.
//		1.
		System.out.println("-1-");
		UserInfo userInfo1 = new UserInfo("아이디", "이름", "1234");
		System.out.println(userInfo1.userId);
		System.out.println(userInfo1.userName);
		System.out.println(userInfo1.phone);

//		2.
		System.out.println("-2-");
		UserInfo userInfo2 = new UserInfo("id", "name");
		System.out.println(userInfo2.userId);
		System.out.println(userInfo2.userName);
		System.out.println(userInfo2.phone);

//		3.
		System.out.println("-3-");
		UserInfo userInfo3 = new UserInfo("아이듀ㅣ");
		System.out.println(userInfo3.userId);

//		4.
		System.out.println("-4-");
		UserInfo userInfo4 = new UserInfo();
		userInfo4.userId = "아뒤";
		userInfo4.userName = "dlfma";
		userInfo4.phone = "4567";

		System.out.println(userInfo4.userId);
		System.out.println(userInfo4.userName);
		System.out.println(userInfo4.phone);
	} // end of main
} // end of class