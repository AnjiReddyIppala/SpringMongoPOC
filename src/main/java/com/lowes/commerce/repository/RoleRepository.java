package com.lowes.commerce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.lowes.commerce.model.Role;

@Repository
public class RoleRepository {

	@Autowired
	private MongoTemplate mongoTemplate;
	

	 public Role addRole(Role role) {
	        mongoTemplate.save(role);
	        return role;
	    }
	 
	 public Role findByRoleId(int id) {
		 Role role = mongoTemplate.findById(id, Role.class);
	        return role;
	    }
}
