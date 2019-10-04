package com.sapiens.model;

import java.util.Set;

import javax.persistence.*;



@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String firstName;
	private String lastName;
	private int age; 
	
	@OneToOne(mappedBy="empref1")
	private Address address;
	
	@OneToMany(cascade=CascadeType.ALL,orphanRemoval = true)
	private Set<Project> projref;

	public Set<Project> getProjref() {
		return projref;
	}

	public void setProjref(Set<Project> projref) {
		this.projref = projref;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
	}

public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	

	
}
