package com.userlogin.service;

import java.util.List;


import com.userlogin.entity.UserLoginEntity;

public interface UserLoginService {
	
	public List<UserLoginEntity> getUsers();
	
	public UserLoginEntity addUsers(UserLoginEntity ul);

}
