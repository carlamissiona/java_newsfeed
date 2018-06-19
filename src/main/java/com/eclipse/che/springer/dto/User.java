package com.eclipse.che.springer.dto;


public class User {
	private int id = 0;
	private String firstname ="";
	private String lastname ="";
	private String email ="";
	private String password ="";
	private int isAdmin = 0;
	
	public int getIsAdmin() {
		return this.isAdmin;
	}
	public void setIsAdmin(int isAdmin) {
		this.isAdmin = isAdmin;
	}
	public int getId() {
		return this.id;
	}
	public void setId(int userid) {
		this.id = userid;
	}
	public String getFirstname() {
		return this.firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname  = firstname;
	}
	public String getLastname() {
		return this.lastname;
	}
	public void setLastname(String lastname) {
		this.lastname  = lastname;
	}
    public void setEmail(String email) {
		this.email  = email;
	}
	public String getEmail() {
		return this.email;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword() {
		return this.password;
	}
  
	
}
