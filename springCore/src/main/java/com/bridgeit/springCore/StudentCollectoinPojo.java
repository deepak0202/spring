package com.bridgeit.springCore;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class StudentCollectoinPojo 
{
	private String firstName;
	  private int age;
	  private Double weight;
	  private int[] marks;
	  private String[] project;
	  private List<Long> mobileNumber;
	  private Set<String> emailIds;
	  private Map<String, String> educations;
	  private Properties skills;
	  private Address address;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Double getWeight() {
		return weight;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	public String[] getProject() {
		return project;
	}
	public void setProject(String[] project) {
		this.project = project;
	}
	public List<Long> getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(List<Long> mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public Set<String> getEmailIds() {
		return emailIds;
	}
	public void setEmailIds(Set<String> emailIds) {
		this.emailIds = emailIds;
	}
	public Map<String, String> getEducations() {
		return educations;
	}
	public void setEducations(Map<String, String> educations) {
		this.educations = educations;
	}
	public Properties getSkills() {
		return skills;
	}
	public void setSkills(Properties skills) {
		this.skills = skills;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

}
