package com.spr.spr.bean;

import java.util.Date;

public class Student {
	String name;
	String id;
	int sem;
	Date studDob;
	String [] preflocation;
	Address address;
	
public Date getStudDob() {
		return studDob;
	}
	public void setStudDob(Date studDob) {
		this.studDob = studDob;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String[] getPreflocation() {
		return preflocation;
	}
	public void setPreflocation(String[] preflocation) {
		this.preflocation = preflocation;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public int getSem() {
		return sem;
	}
	public void setSem(int sem) {
		this.sem = sem;
	}
	public Student(String name, String id, int sem) {
		super();
		this.name = name;
		this.id = id;
		//this.address = address;
		this.sem = sem;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id +  ", sem=" + sem + "]";
	}
	
	
	

}
