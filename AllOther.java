package com.myspr.demo.Model;

public class AllOther {
	String sname;
	String scity;
	String sdelete;
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getScity() {
		return scity;
	}
	public void setScity(String scity) {
		this.scity = scity;
	}
	public String getSdelete() {
		return sdelete;
	}
	public void setSdelete(String sdelete) {
		this.sdelete = sdelete;
	}
	public AllOther(String sname, String scity, String sdelete) {
		super();
		this.sname = sname;
		this.scity = scity;
		this.sdelete = sdelete;
	}
	public AllOther() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "AllOther [sname=" + sname + ", scity=" + scity + ", sdelete=" + sdelete + "]";
	}
	
	
	

}
