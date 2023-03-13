package com.son.blog;

import com.son.blog.controller.BlogController;
import com.son.blog.controller.UserController;
import com.son.blog.dto.UserDTO;

public class MainTest3 {

	public static void main(String[] args) {

		UserController userController = new UserController();
		BlogController blogController = new BlogController();
		
		UserDTO loginUser = userController.requsetSignIn("김오송", "1414");
		System.out.println("???"+loginUser);
		
		blogController.requestDeleteBoard(7, loginUser.getId());
		
	}

}
