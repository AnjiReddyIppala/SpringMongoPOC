package com.lowes.commerce.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document(collection="member")
@Setter @Getter
public class Member {
	
	@Id
	private int memberId;
	private String type;
	private int state;
	private int optCounter;
	private List<Address> addressList = new ArrayList<Address>();
	
}
