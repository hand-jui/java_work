package com.son.blog.controller;

import com.son.blog.Service.UserService;
import com.son.blog.dto.UserDTO;

public class UserController {

	private UserService userService;

	public UserController() {
		userService = new UserService();
	}

	public String requestSignUp(UserDTO user, String host) {
		String response = "외부에서는 회원가입이 불가합니더.";
		if (host.equals("localhost")) {
			response = userService.signUp(user);
		}
		return response;
	}

	public UserDTO requsetSignIn(String Username, String password) {
		UserDTO responseUserDTO = userService.checkUser(Username, password);
		return responseUserDTO;
	}
}
