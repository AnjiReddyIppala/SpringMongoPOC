package com.lowes.commerce.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document(collection="mbrrole")
@Getter @Setter
public class MemberRole {

	@Id
	private int memberId;
	private int roleId;
	private int orgentityId;
	private int optCounter;

}
