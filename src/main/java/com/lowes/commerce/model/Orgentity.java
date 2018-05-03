package com.lowes.commerce.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.sun.istack.internal.NotNull;

import lombok.Getter;
import lombok.Setter;

@Document(collection="orgentity")
@Getter @Setter
public class Orgentity {

	@Id
	private int orgentityId;
	private String legalId;
	@NotNull
	private String orgentityType;
	private String businessCategory;
	private String description;
	private String field1;
	private int field2;
	private String field3;
	private String dn;
	private String status;
	private int optCounter;

}
