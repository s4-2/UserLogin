package com.userlogin.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.userlogin.entity.UserLoginEntity;
import com.userlogin.repo.UserLoginRepository;

@Service
public class UserLoginServiceImpl implements UserLoginService{
	
	@Autowired
	UserLoginRepository userLoginRepository;
	
	@Override
	public List<UserLoginEntity> getUsers(){
		return userLoginRepository.findAll();
	}

	@Override
	public UserLoginEntity addUsers(UserLoginEntity ul) {
		return userLoginRepository.save(ul);
	}
}
