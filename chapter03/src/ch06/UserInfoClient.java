package ch06;

import java.util.Scanner;

public class UserInfoClient {

	static String dbName = "ORACLE";

//	main 함수 실해하는 코드 작성(사용 쪽 코드)
	public static void main(String[] args) {

//		UserInfoOracleDao 만들어주세요
//		스캐너를 통해서 사용자 이름, 사용자 비번을 입력 받기
		String inputUserName;
		String inputUserPw;
		int choice;
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		System.out.println("사용자 이름을 입력하세요");
		inputUserName = sc.nextLine();
		System.out.println("사용자 비번을 입력하세요");
		inputUserPw = sc.nextLine();

		UserInfo userinfo = new UserInfo(inputUserName, inputUserPw);
//		흐름 만들기
//		1. 저장 기능 2.수정 기능
//		dbName 변경해 가면서 코드 동작 확인

		IUserInfoDAO dao;
		System.out.println("1.저장 기능\t2.수정 기능");
		choice = sc.nextInt();
		if (choice == 1) {
			if (UserInfoClient.dbName.equals("ORACLE")) {
				dao = new UserInfoOracleDao();
			} else if (UserInfoClient.dbName.equals("MSSQL")) {
				dao = new UserInfoMsSqlDao();
			} else {
				dao = new UserInfoMysqlDao();
			}
			dao.insertUserInfo(userinfo);
		} else if (choice == 2) {
			if (UserInfoClient.dbName.equals("ORACLE")) {
				dao = new UserInfoOracleDao();
			} else if (UserInfoClient.dbName.equals("MSSQL")) {
				dao = new UserInfoMsSqlDao();
			} else {
				dao = new UserInfoMysqlDao();
			}
			dao.updateUserInfo(userinfo);
		}
	}
}
