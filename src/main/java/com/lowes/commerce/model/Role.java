package com.lowes.commerce.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document(collection="role")
@Getter @Setter
public class Role {

	private int roleId;
	private String name;
	private String description;
	private int optCounter;
	
}
