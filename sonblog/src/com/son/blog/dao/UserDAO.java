package com.son.blog.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.son.blog.dto.UserDTO;
import com.son.blog.utils.DBHelper;

public class UserDAO implements IUserDAO {

	private DBHelper dbHelper;

	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	public UserDAO() {
		dbHelper = new DBHelper();
		conn = dbHelper.getConnection();
	}

	@Override
	public int saveUser(UserDTO user) {
		String query = " INSERT INTO user(username, password, email, address, userRole, createDate) "
				+ " VALUES(?, ?, ?, ?, ?, now()) ";
		int resultRow = 0;
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, user.getUsername());
			pstmt.setString(2, user.getPassword());
			pstmt.setString(3, user.getEmail());
			pstmt.setString(4, user.getAddress());
			pstmt.setString(5, user.getUserRole());
			resultRow = pstmt.executeUpdate();
		} catch (Exception e) {
			System.err.println("saveUser 함수에서 오류 발생");
			e.printStackTrace();
		}
		return resultRow;
	}

	@Override
	public UserDTO selectUserByUsernameAndPassword(String username, String password) {
		UserDTO resultUser = null;
		String query = " SELECT * FROM user WHERE username = ? AND password = ? ";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, username);
			pstmt.setString(2, password);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				UserDTO dto = new UserDTO();
				dto.setId(rs.getInt("Id"));
				dto.setUsername(rs.getString("username"));
				dto.setEmail(rs.getString("email"));
				System.out.println("나왓냐"+dto.getId());
				resultUser = dto;
			}
		} catch (Exception e) {
			System.err.println("userDAO 회원 찾는 중 에러발생");
			e.printStackTrace();
		}
		return resultUser;
	}
}
