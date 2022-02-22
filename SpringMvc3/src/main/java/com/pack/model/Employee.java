package com.pack.model;

public class Employee {
 private String name;
 private Integer age;
 private String email;
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
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getQualification() {
	return qualification;
}
public void setQualification(String qualification) {
	this.qualification = qualification;
}
public Employee(String name, Integer age, String email, String qualification) {
	super();
	this.name = name;
	this.age = age;
	this.email = email;
	this.qualification = qualification;
}
public Employee() {
	super();
	
}
 
 
}
