package com.son.blog;

import com.son.blog.controller.UserController;
import com.son.blog.dto.UserDTO;

public class MainTest {

	public static void main(String[] args) {
		UserDTO userDTO = new UserDTO("김오송", "1414", "osdscc@dong.a", "부산시 사하구");
		UserController userController = new UserController();
//		String result = userController.requestSignUp(userDTO, "localhost");
//		
//		System.out.println(result);

		UserDTO responseUser = userController.requsetSignIn(userDTO.getUsername(), userDTO.getPassword());
		if (responseUser == null) {
			System.out.println("로그인 실패");
		} else {
			System.out.println("로그인 성공");
		}
		System.out.println("결과 확인: " + responseUser);

	}

}
