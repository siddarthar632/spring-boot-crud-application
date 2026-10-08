package com.kodnest.crud.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kodnest.crud.Entity.User;
import com.kodnest.crud.Service.UserService;

@RestController
public class UserController {
	@Autowired
	UserService userSev;
	
	@PostMapping("/create")
	public String createstd(@RequestBody User us) {
		userSev.createStudent(us);
		return "User created";
	}
}
