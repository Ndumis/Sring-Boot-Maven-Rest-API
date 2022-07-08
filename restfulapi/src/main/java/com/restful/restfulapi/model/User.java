package com.restful.restfulapi.model;

public class User {
	private Integer Id;
	private String firstName;
	private String lastName;
	private String contactNumber;	
	
	public User(Integer Id, String firstName, String lastName, String contactNumber) {
		super();
		this.Id = Id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.contactNumber = contactNumber;
	}
	
	public Integer getId() {
		return Id;
	}
	public void setId(Integer Id) {
		this.Id = Id;
	}
	public String getFirstname() {
		return firstName;
	}
	public void setFirstname(String firstname) {
		this.firstName = firstname;
	}
	public String getLastname() {
		return lastName;
	}
	public void setLastname(String lastname) {
		this.lastName = lastname;
	}
	public String getContactnumber() {
		return contactNumber;
	}
	public void setContactnumber(String contactnumber) {
		this.contactNumber = contactnumber;
	}
	
	
}
