package com.sample.domain;

//import java.io.Serializable;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;

public class User {

	//private static final long serialVersionUID = 1L;
	
	@Length(min=3,max=20, message="{user.firstname.error}")
	private String firstName;
	@Length(min=3,max=20, message="{user.lastname.error}")
	private String lastName;
	@Pattern(regexp = "^[a-zA-Z]\\w{3,14}$", message="{user.password.error}")
	private String passWord;
	private String detail;
	private String birthDate;
	private String gender;
	private String country;
	private boolean smoking;
	@Email
	private String email;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public boolean isSmoking() {
		return smoking;
	}
	public void setSmoking(boolean smoking) {
		this.smoking = smoking;
	}	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
