package com.myapp.service;

import java.util.ArrayList;

import com.myapp.dao.BookDao;
import com.myapp.dao.EmployeeDao;
import com.myapp.model.Employee;

public class EmployeeService {
	public static void main(String[]args) {
		
		
		
		
		
		
	/*
		Employee employee=new Employee();
		EmployeeDao dao=new EmployeeDao();
		System.out.println(dao.getAll());
		*/
		
		/*
		Employee employee=new Employee(10,"lavanya","Bangalore",47,"Hr");
		EmployeeDao dao=new EmployeeDao();
		System.out.println(dao.saveEmployee(employee));
		
		*/
/*		
	EmployeeDao dao=new EmployeeDao();
	ArrayList<Employee> age=(ArrayList<Employee>)dao.Age();

	for(Employee e:age){
	System.out.println(e);
	}
	
*/


/*
EmployeeDao dao=new EmployeeDao();
	 ArrayList<Employee> city = dao.cityBang();
System.out.println(city);
*/
	/*	
		EmployeeDao dao=new EmployeeDao();
		ArrayList<Employee> agecity=dao.getbyageandcity(40,"bangalore");
	System.out.println(agecity);
	
	
	*/
	/*
	EmployeeDao dao=new EmployeeDao();
	ArrayList<Employee> agedept=dao.getbyageanddept(40,"sales");
System.out.println(agedept);

*/




EmployeeDao dao=new EmployeeDao();
ArrayList<Employee> agedept=dao.SalesHr();
System.out.println(agedept);


 
/*
	EmployeeDao dao=new EmployeeDao();
	ArrayList<Employee> hs=(ArrayList<Employee>)dao.SalesHr();

	for(Employee e:hs){
	System.out.println(e);
	}
	
*/
	
		

}
}
