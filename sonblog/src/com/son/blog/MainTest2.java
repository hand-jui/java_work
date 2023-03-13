package com.son.blog;

import com.son.blog.controller.BlogController;
import com.son.blog.controller.UserController;
import com.son.blog.dto.UserDTO;

public class MainTest2 {

	public static void main(String[] args) {

		UserController userController = new UserController();
		
		UserDTO loginUser = userController.requsetSignIn("김오송", "1414");
		System.out.println("usdrId : "+ loginUser.getId());
		
		BlogController blogController = new BlogController();
		
		if(loginUser.getId()!=0) {
			int response = blogController.requestSaveBoard("집에", "갈래", loginUser.getId());
			if(response==0) {
				System.out.println("글쓰기 실패");
			} else {
				System.out.println("글쓰기 성공");
			}
		}
	}

}
