package com.vicky.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vicky.entity.User;
import com.vicky.repository.UserRepo;

public interface UserService {
	
	public List<User> getAllUsers();
	//get the user object by id
	public User getUserbyId(Long id);
	//sve
	User saveUser(User user);
	
}
