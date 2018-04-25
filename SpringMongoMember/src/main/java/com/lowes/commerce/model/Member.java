package com.lowes.commerce.model;

import org.springframework.data.annotation.Id;

public class Member {
	
	@Id
	private int member_id;
	private String type;
	private int state;
	private int optcounter;
	
	public int getMember_id() {
		return member_id;
	}
	public void setMember_id(int member_id) {
		this.member_id = member_id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public int getOptcounter() {
		return optcounter;
	}
	public void setOptcounter(int optcounter) {
		this.optcounter = optcounter;
	}
	
}
