package com.lowes.commerce.model;

public class Role {

	private int role_id;
	private String name;
	private String description;
	private int optcounter;
	
	public int getRole_id() {
		return role_id;
	}
	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getOptcounter() {
		return optcounter;
	}
	public void setOptcounter(int optcounter) {
		this.optcounter = optcounter;
	}
	
}
