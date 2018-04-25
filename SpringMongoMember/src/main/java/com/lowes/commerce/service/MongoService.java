package com.lowes.commerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lowes.commerce.model.Mongo;
import com.lowes.commerce.repository.MongoRepository;

@Service
public class MongoService {


    @Autowired
    private MongoRepository mongoRepository;

    public Mongo addPessoa(Mongo mongo) {
        return  mongoRepository.addPessoa(mongo);
    }

    public Mongo findById(int id) {
        return mongoRepository.findById(id);
    }

    public List<Mongo> findAll() {
        return mongoRepository.findAll();
    }
}
