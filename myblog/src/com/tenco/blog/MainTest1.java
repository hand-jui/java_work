package com.tenco.blog;

import com.tenco.blog.controller.UserController;
import com.tenco.blog.dto.UserDTO;

public class MainTest1 {

	public static void main(String[] args) {

//		회원가입 진행을 mysql 서버까지 보내야한다.
		UserDTO userDTO = new UserDTO("홍길동", "5678", "b@nate.com", "부산");

		UserController userController = new UserController();

//		String result = userController.requestSignUp(userDTO, "localhost");
//
//		System.out.println(result);

//		로그인 요청
//		아이디 비밀번호
		UserDTO responseUser = userController.requestSingIn(userDTO.getUsername(), userDTO.getPassword());
		if (responseUser == null) {
			System.out.println("로그인에 실패 했습니다");
		} else {
			System.out.println("당신은 인종된 유저가 맞즙니다. 로그링 성공.");

		}
		System.out.println("결과 값 확인 : " + responseUser);

	}

}
