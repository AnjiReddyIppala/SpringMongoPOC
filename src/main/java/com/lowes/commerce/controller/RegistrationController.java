package com.lowes.commerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lowes.commerce.model.Users;
import com.lowes.commerce.repository.UsersRepository;

@RestController
@RequestMapping("/")
public class RegistrationController {
	@Autowired
	private UsersRepository userRepository;
	
	

	@PostMapping(value="/member/add")
	public String addNewMember(@RequestBody Users users) {
		
		userRepository.save(users);
		
			
		return "User Registered Successfully";
	}
	
	
	@GetMapping("/member/{usersid}")
	
	public List<Users> getUserDetails()
	{
		
		return userRepository.findAll();
	}
	
}
