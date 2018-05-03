package com.lowes.commerce.controller;

import javax.xml.ws.Response;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lowes.commerce.bean.RegistrationFormBean;

@RestController
@RequestMapping("/registration")
public class RegistrationController {

	@RequestMapping(value="/member/add", method= RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public String addNewMember(@RequestBody RegistrationFormBean registrationFormBean) {
		
		String firstName = registrationFormBean.getFirstName();
		String lastName = registrationFormBean.getLastName();
		
		String result = firstName+lastName;
		
		
		
		
		return result;
	}
}
