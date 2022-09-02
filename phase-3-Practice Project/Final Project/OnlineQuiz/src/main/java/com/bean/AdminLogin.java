package com.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AdminLogin {
	@Id
	private String emailid;
	private String password;
	
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "AdminLogin [emailid=" + emailid + ", password=" + password + "]";
	}
	
	
	
}
