package com.Example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
//@Data

//@Getter
//@Setter
//@ToString
//@NoArgConstructor

public class Login {

	@Id
	private String email;
	private String password;
	public String id;
	public Login(String email, String password, String id) {
		super();
		this.email = email;
		this.password = password;
		this.id = id;
	}
	public Login(String email3, String password3) {
		
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Login [email=" + email + ", password=" + password + ", id=" + id + "]";
	}
	
}
