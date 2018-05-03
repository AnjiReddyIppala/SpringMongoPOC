package com.lowes.commerce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;


import com.lowes.commerce.model.User;

public class UserRepository  {
	
	 @Autowired
	    private MongoTemplate mongoTemplate;
	 
	 public User registerUser(User user) {
	        mongoTemplate.save(user);
	        return user;
	    }


}
