package com.lowes.commerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lowes.commerce.model.Mongo;
import com.lowes.commerce.service.MongoService;

@RestController
@RequestMapping("/home")
public class MongoController {

	 @Autowired
	    private MongoService mongoService;

	 
	    @RequestMapping("/pessoa")
	  //  @ResponseBody("application/json")
	    public String home() {
	        return "Hello World!";
	    }

	    @RequestMapping(value="/pessoa/add", method= RequestMethod.POST)
	    public @ResponseBody Mongo addPessoa(@RequestParam("id") int id, @RequestParam("nome") String name, @RequestParam("idate") int date) {
	    	System.out.println("AnjiReddy "+id);
	    	Mongo mongo = new Mongo();
	    	mongo.setId(id);
	    	mongo.setNome(name);
	    	mongo.setIdade(date);
	        return mongoService.addPessoa(mongo);
	    }

	    @RequestMapping("/pessoa/findById/{pessoaId}")
	    public @ResponseBody Mongo findPersonById(@PathVariable("pessoaId") int pessoaId) {
	        return mongoService.findById(pessoaId);
	    }

	    @RequestMapping("/pessoa/all")
	    public @ResponseBody List findAll() {
	        return mongoService.findAll();
	    }
}
