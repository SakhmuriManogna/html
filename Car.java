package com.spr.spr.bean;

public class Car {
String name;
String brand;
String colour;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public String getColour() {
	return colour;
}
public void setColour(String colour) {
	this.colour = colour;
}
@Override
public String toString() {
	return "Car [name=" + name + ", brand=" + brand + ", colour=" + colour + "]";
}
public Car(String name, String brand, String colour) {
	super();
	this.name = name;
	this.brand = brand;
	this.colour = colour;
}
public Car() {
	super();
	// TODO Auto-generated constructor stub
}


	
	
	
}
