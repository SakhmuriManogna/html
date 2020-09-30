package com.myapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Emp {
	
	@Id
	String empid;
	int age;
	String fname;
	String lname;
	
	
	
	public Emp(int age, String fname, String lname) {
		super();
		this.age = age;
		this.fname = fname;
		this.lname = lname;
	}
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public Emp(String empid, int age, String fname, String lname) {
		super();
		this.empid = empid;
		this.age = age;
		this.fname = fname;
		this.lname = lname;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Emp [empid=" + empid + ", age=" + age + ", fname=" + fname + ", lname=" + lname + "]";
	}
	
	
	
	
	
	

}
