package com.spr.spr.bean;

import java.util.ArrayList;

public class ShowRoom {

	
	String shname;
	ArrayList <Car> cars=new ArrayList<Car>();
	public String getShname() {
		return shname;
	}
	public void setShname(String shname) {
		this.shname = shname;
	}
	public ArrayList<Car> getCars() {
		return cars;
	}
	public void setCars(ArrayList<Car> cars) {
		this.cars = cars;
	}
	@Override
	public String toString() {
		return "ShowRoom [shname=" + shname + ", cars=" + cars + "]";
	}
	public ShowRoom(String shname, ArrayList<Car> cars) {
		super();
		this.shname = shname;
		this.cars = cars;
	}
	public ShowRoom() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
