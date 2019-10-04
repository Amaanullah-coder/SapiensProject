package com.sapiens.model;

import javax.persistence.*;

//@Entity
public class EmpForm {
	
	//@Id
	private Integer id;
	private String firstName;
	private String lastName;
	private Integer age;
	private String presentAddress;
	private int duration;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getProjectname() {
		return projectname;
	}
	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}
	private String status;
	
	private String projectname;
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
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getPresentAddress() {
		return presentAddress;
	}
	public void setPresentAddress(String presentAddress) {
		this.presentAddress = presentAddress;
	}
	@Override
	public String toString() {
		return "EmpForm [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", presentAddress="
				+ presentAddress + "]";
	}
	
	

}
