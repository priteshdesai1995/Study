package com.example.api.crud.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Aliean {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long aid;
	private String name;
	private String gender;

	public long getAid() {
		return aid;
	}

	public void setAid(long aid) {
		this.aid = aid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Aliean [aid=" + aid + ", name=" + name + ", gender=" + gender + "]";
	}

}
