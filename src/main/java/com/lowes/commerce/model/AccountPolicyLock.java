package com.lowes.commerce.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Document(collection="plcyacctlck")
public class AccountPolicyLock {

	@Id
	private int plcyacclckId;
	private int lockoutThreshold;
	private int waitTime;
	private int optCounter;

}
