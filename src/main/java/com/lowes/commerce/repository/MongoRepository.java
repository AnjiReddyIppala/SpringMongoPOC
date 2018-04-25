package com.lowes.commerce.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;
import com.lowes.commerce.model.Mongo;

@Repository
public class MongoRepository {

	 @Autowired
	    private MongoTemplate mongoTemplate;

	    public Mongo addPessoa(Mongo mongo) {
	        mongoTemplate.save(mongo);
	        return  mongo;
	    }

	    public Mongo findById(int id) {
	    	Mongo pessoa = mongoTemplate.findById(id, Mongo.class);
	        return pessoa;
	    }

	    public List<Mongo> findAll() {
	        List<Mongo> pessoas = mongoTemplate.findAll(Mongo.class);
	        return pessoas;
	    }
}
