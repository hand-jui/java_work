package com.tenco.blog.dao;

import com.tenco.blog.dto.UserDTO;

public interface IUserDAO {

//	인터페이스 안에는 추상메서드만 활용 할 수 있다
//	public abstract가 생략되어 있음
	int saveUser(UserDTO user);  // insert

	UserDTO selectUserByUsernameAndPassword(String username, String password);
	
}
