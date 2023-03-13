package com.tenco.blog;

import com.tenco.blog.controller.BlogController;
import com.tenco.blog.controller.UserController;
import com.tenco.blog.dto.UserDTO;

public class MainTest2 {

//	메인 함수
	public static void main(String[] args) {

//		UserDTO userDTO = new UserDTO("김오송", "1414", "osdscc@dong.a", "부산시 사하구");
		UserController userController = new UserController();

//		로그인 성공과 같음
		UserDTO loginUser = userController.requestSingIn("티모", "5678");
		System.out.println("userId : " + loginUser.getId());

//		id, title, content, readCount, userId
//		title, content, userId -> 1. String 하나씩 지정, 2. 클래스 만들어서 넘기는 방법

		BlogController blogController = new BlogController();
		
		if (loginUser.getId() != 0) {
			int response = blogController.reqSaveBoard("MVC패턴에 이해2", "Model-View-Controller", loginUser.getId());
			if(response==0) {
				System.out.println("글쓰기에 실패하였습니다");
			} else {
				System.out.println("글쓰기에 성공하였습지다");
			}
		}

	} // end of main

} // end of class
