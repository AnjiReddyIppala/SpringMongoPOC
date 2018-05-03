package com.lowes.commerce.model;

import java.sql.Timestamp;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document(collection="users")
@Setter @Getter
public class Users {

	@Id
	private int userId;
	private String dn;
	private String registerType;
	private String profileType;
	private int languageId; 
	private String field1;
	private String field2;
	private String field3;
	private String setccurr;
	private Timestamp registration;
	private Timestamp registrationUpdate;
	private Timestamp registrationCancel;
	private int status;
	private int plcyActtId;
	private String logonId;
	private String logonPassword;
	private int passwordExpired;
	private String challengeQuestion; 
	private String challengeAnswer;
	private int timeout;
	private int passwordRetries;
	private String salt;
	private Timestamp passwordCreation;
	private Timestamp passwordInvalid;
	private int optCounter;

}
