package com.model;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Userr {

	@Id
	@GeneratedValue
	private int userrId;
	
	@NotNull
	@Column(name="userrName")
	private String userrName; 
	
	

	private String userrType;
	
	@Size(min=10,max=11)
	@Column(name="mobileNo")
	private String mobileNo;
	
	@Email
	@Column(name="emailId")
	private String emailId;
	
	
	public Userr() {}


	public int getUserrId() {
		return userrId;
	}


	public void setUserrId(int userrId) {
		this.userrId = userrId;
	}


	public String getUserrName() {
		return userrName;
	}


	public void setUserrName(String userrName) {
		this.userrName = userrName;
	}


	public String getUserrType() {
		return userrType;
	}


	public void setUserrType(String userrType) {
		this.userrType = userrType;
	}


	public String getMobileNo() {
		return mobileNo;
	}


	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}


	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	
	
}
