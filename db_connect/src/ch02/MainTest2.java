package ch02;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class MainTest2 {

	public static void main(String[] args) {
		ArrayList<UserTBL> list = new ArrayList<>();

//		코드 실행
		DBClient dbClient = new DBClient();
		DBClient.setDB_NAME("shopdb");
//		dbClient.setDB_NAME("shopdb");
//		mydb;

//		DB 접근 구현 코드 처리
//		자료 구조 선언, 담을 데이터를 클래스로 모델링

		Connection conn = dbClient.getConnection();
		try {
			Statement stmt = conn.createStatement();

			String queryStr = "SELECT * FROM userTBL ";
			ResultSet rs = stmt.executeQuery(queryStr);
			while (rs.next()) {
				UserTBL userTBL = new UserTBL(rs.getString("username"), rs.getInt("birthYear"), rs.getString("addr"),
						rs.getString("mobile"));

				list.add(userTBL);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
			System.out.println(list.get(i).getUsername());
		}
	} // end of main

} // end of class

class UserTBL {

	private String username;
	private int birthYear;
	private String addr;
	private String mobile;

	public UserTBL(String username, int birthYear, String addr, String mobile) {
		this.username = username;
		this.birthYear = birthYear;
		this.addr = addr;
		this.mobile = mobile;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "UserTBL [username=" + username + ", birthYear=" + birthYear + ", addr=" + addr + ", mobile=" + mobile
				+ "]";
	}

}  // end of class
