package com.example.demo.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Student {
	private int id;
	private String stuName;
	private String phoneNumber;
	
	public Student() {
		System.out.println("Student object is Created");
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String displayMessage() {
		System.out.println("Laptop Display Message");
		return  "Laptop Display Message";
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", stuName=" + stuName + ", phoneNumber=" + phoneNumber + "]";
	}
}
