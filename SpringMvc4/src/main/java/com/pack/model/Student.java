package com.pack.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class Student {
	@NotEmpty(message="Name should not be blank")
	@Size(min=6,max=15, message="Name should be between 6 and 15 characters")
  private String name;
	@NotNull(message ="Age cannot be empty")
	@Min(value=18,message="Age cannot be less than 18")
	@Max(value=45,message="Age cannot be more than 45")
  private Integer age;
	
	@NotEmpty(message="Address cannot br Empty")
  private String address;
	
	@NotEmpty(message="please select the gender")
  private String gender;
	
	@NotEmpty(message="please select the qualification")
  private String qualification;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Integer getAge() {
	return age;
}
public void setAge(Integer age) {
	this.age = age;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getQualification() {
	return qualification;
}
public void setQualification(String qualification) {
	this.qualification = qualification;
}
public Student(String name, Integer age, String address, String gender, String qualification) {
	super();
	this.name = name;
	this.age = age;
	this.address = address;
	this.gender = gender;
	this.qualification = qualification;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
  
}
