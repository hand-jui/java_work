package com.tenco.blog.service;

import com.tenco.blog.dao.UserDAO;
import com.tenco.blog.dto.UserDTO;

//controller에서 service를 부르고 DAO를 부름
//	사용자와 관련된 로직들을 처리
public class UserService {

	private UserDAO userDAO;

	public UserService() {
		userDAO = new UserDAO();

	}

//	회원 가입 로직 처리
	public String signUp(UserDTO user) {

		String msg = "";
//		사용자가 던진 값이 유효한지 확인하는 것을 validation 처리
//		사용자가 이름 안넣고 요청
//		비밀번호 사이즈 확인
		if (user.getUsername().equals("")) {
			msg = "사용자 이름을 입력해주세요.";
			System.out.println(msg);
			return msg;
		}
//		USER_ROLE <-- 사용자가 알필요 X
		user.setUserRole("USER");
		int resultRow = userDAO.saveUser(user);
		return resultRow + "";
	}

//	회원 정보 찾기 - 로그인 기능
	public UserDTO checkUser(String username, String password) {
		boolean isValid = true;
		if (username.equals("")) {
			isValid = false;
		} else if (password.equals("")) {
			isValid = false;
		}

		UserDTO userDTO = null;
		if (isValid) {
			userDTO = userDAO.selectUserByUsernameAndPassword(username, password);
		}
		return userDTO;
	}

}
