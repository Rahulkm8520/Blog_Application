package com.rahul.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rahul.enity.UsersEntity;
import com.rahul.repositories.UsersRepo;

@Service
public class UserService  {
	
	@Autowired
	private UsersRepo userRepo;
	
    public UsersEntity save(UsersEntity usersEntity) {
		
    	return userRepo.save(usersEntity);
    	
    }
}
