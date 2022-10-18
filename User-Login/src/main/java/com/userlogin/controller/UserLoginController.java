package com.userlogin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.userlogin.entity.UserLoginEntity;
import com.userlogin.service.UserLoginServiceImpl;

@RestController
@RequestMapping("/user")
@CrossOrigin("http://localhost:4200")
public class UserLoginController {
	
	@Autowired
	UserLoginServiceImpl userLoginServiceImpl;
	
	@GetMapping("/getUsers")
	public List<UserLoginEntity> getUsers(){
		return userLoginServiceImpl.getUsers();
	}
	
	@PostMapping("/addUsers")
	public UserLoginEntity addUsers(@RequestBody UserLoginEntity ul) {
		return userLoginServiceImpl.addUsers(ul);
	}

}
