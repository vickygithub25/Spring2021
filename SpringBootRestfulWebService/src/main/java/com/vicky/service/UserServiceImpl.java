package com.vicky.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.vicky.entity.User;
import com.vicky.exception.ResourceNotFoundException;
import com.vicky.repository.UserRepo;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepo userRepo;
	
	@Override
	public List<User> getAllUsers() {
		
		List<User> listuser = userRepo.findAll();
		return listuser;
	}

	@Override
	public User getUserbyId(Long id) {
		// TODO Auto-generated method stub
		
		return userRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("id not found"));
	}

	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return userRepo.save(user);
	}

}
