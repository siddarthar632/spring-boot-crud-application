package com.kodnest.crud.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodnest.crud.Entity.User;
import com.kodnest.crud.Repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository userRepo;
	public void createStudent(User us) {
		userRepo.save(us);
	}
}
