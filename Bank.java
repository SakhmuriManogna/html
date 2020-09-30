package com.mysub.mysub.bean;

public class Bank {
	
	String name;
	String branch;
	String address;
	public String getName() {
	return name;
	}
	public void setName(String name) {
	this.name = name;
	}
	public String getBranch() {
	return branch;
	}
	public void setBranch(String branch) {
	this.branch = branch;
	}
	public String getAddress() {
	return address;
	}
	public void setAddress(String address) {
	this.address = address;
	}
	@Override
	public String toString() {
	return "Bank [name=" + name + ", branch=" + branch + ", address=" + address + "]";
	}
	public Bank(String name, String branch, String address) {
	super();
	this.name = name;
	this.branch = branch;
	this.address = address;
	}

	public Bank() {
	// TODO Auto-generated constructor stub
	}

	
	
	

}
