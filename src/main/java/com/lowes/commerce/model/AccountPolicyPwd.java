package com.lowes.commerce.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document(collection="plcypssswd")
@Getter @Setter
public class AccountPolicyPwd {

	@Id
	private int plcyPasswdId;
	private int minPasswdLength;
	private int minAlphabetic;
	private int minNumeric;
	private int maxInstances;
	private int maxConsecutiveType;
	private int maxLifeTime;
	private String matchUserId;
	private String reUsePassword;
	private int optCounter;

}
