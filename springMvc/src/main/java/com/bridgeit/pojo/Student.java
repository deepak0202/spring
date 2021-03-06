package com.bridgeit.pojo;

import javax.validation.constraints.Max;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;

public class Student 
{
	private String email;
	@Size(min=8,max=20)
	private String password;
//	@Pattern(regexp="[^0-9]*")
	private String firstName;
//	  @Pattern(regexp="[^0-9]*")
	private String lastName;
	@Range(min=1,max=100, message="enter a valid age")
	private int age;
//	@Pattern(regexp="\\d{10}")
	private long mobileNumber;
	
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
}
