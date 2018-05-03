package com.lowes.commerce.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lowes.commerce.model.User;
import com.lowes.commerce.model.Users;



public interface UsersRepository extends MongoRepository<Users, Integer>{

}
