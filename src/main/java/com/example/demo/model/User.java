package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class User {
	@Id
	
	private String username;
	private String password;
	
	public String getUser_name() {
		return username;
	}
	public void setUser_name(String user_name) {
		this.username = user_name;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
