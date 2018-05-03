package com.lowes.commerce.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document(collection="plcyactt")
@Setter @Getter
public class AccountPolicy {

	@Id
	private int plcyacctId;
	private int plcyacclckId;
	private int plcypasswdId;
	private int optCounter;

}
