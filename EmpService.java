package com.myapp.service;

import com.myapp.dao.EmpDao;
import com.myapp.model.Emp;

public class EmpService {
	public static void main(String[]args) {
	//Emp emp=new Emp();
		//Emp emp=new Emp("",20,"Rohith","Sharma");
	EmpDao d=new EmpDao();
	//Emp emp=new Emp(20,"Swathi","Jannu");
	//System.out.println(d.saveEmployee(emp));
	//System.out.println(d.three());
	System.out.println(d.DesAge());
	
}
}