package com.vicky.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vicky.entity.User;
import com.vicky.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/all")
	public List<User> getalluser() {
		
		return userService.getAllUsers();
		
	}
	
	@GetMapping("/id/{id}")
	public User getbyuserid(@PathVariable("id") long userid) {
		
		return userService.getUserbyId(userid);
		
	}
	
	@GetMapping("/id1/{id}")
	public ResponseEntity<User> getbyuserid1(@PathVariable("id") long userid) {
		
		return new ResponseEntity<User>(userService.getUserbyId(userid),HttpStatus.OK);
		
	}
	
	@PostMapping("/save")
	public ResponseEntity<User> saveUser(@RequestBody User user) {
		
		return new ResponseEntity<User>(userService.saveUser(user),HttpStatus.OK);	
	}
}
