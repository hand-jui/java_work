package com.son.blog.dao;

import com.son.blog.dto.UserDTO;

public interface IUserDAO {
	
	int saveUser(UserDTO user);
	
	UserDTO selectUserByUsernameAndPassword(String username, String password);

}
