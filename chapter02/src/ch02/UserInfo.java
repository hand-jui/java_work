package ch02;

public class UserInfo {

	String userId;
	String userName;
	String phone;

//	1. 사용자 정의 생성자를 만들어라. 매개 변수 3개 한번에 사용.
	public UserInfo(String userId, String userName, String phone) {
//		멤버변수 = 매개변수(지역변수)
		this.userId = userId;
		this.userName = userName;
		this.phone = phone;
	}

//	2. 사용자 정의 생성자 만들기 userId; userName;
	public UserInfo(String userId, String userName) {
		this.userId = userId;
		this.userName = userName;
//		필요하다면 외부에서 주입 받지 않고 바로 초기화 가능
		this.phone = "010-1234-1234";
	}

//	3. 사용자 정의 생성자 만들기 userId;
	public UserInfo(String userId) {
		this.userId = userId;
	}

//	4. 기본 생성자를 만들기
	public UserInfo() {

	}
}
