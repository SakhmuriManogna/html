package com.myapp.dao;

import java.awt.List;
import java.util.ArrayList;

import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Restrictions;

import com.myapp.model.Book;
import com.myapp.model.Employee;

public class EmployeeDao {
	
	
	
	SessionFactory factory=new Configuration().configure().buildSessionFactory();
	
	
	
	
	
	
	public String saveEmployee(Employee employee)
	{
		//SessionFactory factory=null;
	try
	{ 
		Session session= factory.openSession();
	Transaction tx=session.beginTransaction();
		Employee e= new Employee();
	Criteria crit = session.createCriteria(Employee.class);
	crit.add(Restrictions.or((Restrictions.eq(e.getDept(), "It")),Restrictions.eq(e.getDept(),"Hr")));   
	crit.add(Restrictions.or((Restrictions.eq(e.getDept(), "sales")),Restrictions.eq(e.getDept(),"marketing")));   
	session.save(employee);
	tx.commit();
	return "Employee Details Saved";
	}
	catch (Exception e) {
	// TODO: handle exception
	e.printStackTrace();
	}

	return "cannot save Employee Details";
	}

	
	public ArrayList<Employee> getAll()
	{
	//	SessionFactory factory=null;
	try
	{
		
	Session session= factory.openSession();
	Transaction tx=session.beginTransaction();

	ArrayList<Employee> all=(ArrayList<Employee>)session.createQuery("from Employee").list();


	tx.commit();
	return all;
	}
	catch (Exception e) {
	e.printStackTrace();
	}
	finally {
	factory.close();
	}

	return null;

	}
	
	
	
	
	
	
	
	
	
	public ArrayList<Employee> Age()
	{
		//SessionFactory factory=null;
	try
	{
	Session session= factory.openSession();
	Transaction tx=session.beginTransaction();
   Criteria ct=session.createCriteria(Employee.class);
	ArrayList<Employee> Age=(ArrayList<Employee>)ct.add(Restrictions.gt("age",40)).list();
     tx.commit();
	return Age;
	}
	catch (Exception e) {
	e.printStackTrace();
	}
	finally {
	factory.close();
	}

	return null;

	}
	
	
	
	
	
	public ArrayList<Employee> cityBang()
	{
	try
	{
		
	Session session= factory.openSession();
	Transaction tx=session.beginTransaction();
    Criteria ct=session.createCriteria(Employee.class);
    ArrayList<Employee> city=(ArrayList<Employee>) ct.add(Restrictions.like("city", "b%")).list();
     //ArrayList<Employee> city=(ArrayList<Employee>)ct.add(Restrictions.ilike("city", "bangalore")).list();
    tx.commit();
    return city;
	}  
	
   
	catch (Exception e) {
	e.printStackTrace();
	}
	finally {
	factory.close();
	}

	return null;

	}
	
	
	
	
	public ArrayList<Employee> SalesHr()
	{
		//SessionFactory factory=null;
	try
	{
		Employee e=new Employee();
	Session session= factory.openSession();
	Transaction tx=session.beginTransaction();
   Criteria ct=session.createCriteria(Employee.class);
   Criterion edept1=Restrictions.ilike("dept","s%");
   Criterion edept2= Restrictions.like("dept","H%");
   LogicalExpression Exp = Restrictions.or(edept1,edept2);
   ArrayList<Employee> Sh=(ArrayList<Employee>) ct.add(Exp).list();
     tx.commit();
	return Sh;
	}
	catch (Exception e) {
	e.printStackTrace();
	}
	finally {
	factory.close();
	}

	return null;

	}
	
	
	
	public ArrayList<Employee> getbyageandcity(int age,String city){
		try
		{
			Employee e=new Employee();
		Session session= factory.openSession();
		Transaction tx=session.beginTransaction();
	   Criteria ct=session.createCriteria(Employee.class);
	   Criterion eage=Restrictions.gt("age",40);
	   Criterion ecity= Restrictions.like("city","b%");
	   LogicalExpression Exp = Restrictions.and(eage,ecity);
	   ArrayList<Employee> ac=(ArrayList<Employee>) ct.add(Exp).list();
	  // ArrayList<Employee> ac=(ArrayList<Employee>) ct.add(Restrictions.and((Restrictions.gt("age", "40")),Restrictions.like("city", "b%"))).list();   
		
	     tx.commit();
		return ac;
		}
		catch (Exception e) {
		e.printStackTrace();
		}
		finally {
		factory.close();
		}

		return null;
		
		
		
	}
	
	
	
	
	public ArrayList<Employee> getbyageanddept(int age,String dept){
		try
		{
			Employee e=new Employee();
		Session session= factory.openSession();
		Transaction tx=session.beginTransaction();
	   Criteria ct=session.createCriteria(Employee.class);
	   Criterion eage=Restrictions.gt("age",40);
	   Criterion edept= Restrictions.like("dept","s%");
	   LogicalExpression Exp = Restrictions.and(eage,edept);
	   ArrayList<Employee> ad=(ArrayList<Employee>) ct.add(Exp).list();
	  // ArrayList<Employee> ac=(ArrayList<Employee>) ct.add(Restrictions.and((Restrictions.gt("age", "40")),Restrictions.like("city", "b%"))).list();   
		
	     tx.commit();
		return ad;
		}
		catch (Exception e) {
		e.printStackTrace();
		}
		finally {
		factory.close();
		}

		return null;
		
    	   
    	   
    	   
    	   
    	   
	}}


