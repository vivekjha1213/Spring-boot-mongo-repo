package com.springBoot.thirdProject.Model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "Employee")
public class Employee {

	@org.springframework.data.annotation.Id
	private String Id;
	private String firstName;
	private String lastName;
	private Address address;
	private int salary;

	public Employee() {
		super();
		
	}

	public Employee(String firstName, String lastName, Address address, int salary) {
		super();

		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.salary = salary;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
