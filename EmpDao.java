package com.myapp.dao;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.criterion.Order;
import javax.management.Query;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.type.OrderedMapType;

import com.myapp.model.Emp;
import com.myapp.model.Employee;
public class EmpDao {
	
	SessionFactory factory=new Configuration().configure().buildSessionFactory();

	
	public String generateEmpId(String fname,String lname){
		String emplId="";
		String seqNum="";
		int seqNumber=0;
		try{
		String sql="select emp_seq.nextval from dual";
		Session session= factory.openSession();
		Query query=(Query) session.createSQLQuery(sql);

		seqNumber=Integer.parseInt(((org.hibernate.query.Query) query).getSingleResult().toString());


		if(seqNumber < 100 && seqNumber >=10)
		seqNum="0"+seqNumber;
		else if(seqNumber<10)
		seqNum="00"+seqNumber;
		else
		seqNum=""+seqNumber;

		emplId=fname.substring(0,2)+lname.substring(0,2)+seqNum;

		return emplId;
		}
		catch (Exception e) {
		e.printStackTrace();
		}

		return "cannot generate";
		}



		public String saveEmployee(Emp emp)
		{

		try
		{
		Session session= factory.openSession();

		Transaction tx= session.beginTransaction();
		emp.setEmpid(generateEmpId(emp.getFname(),emp.getLname()));
		System.out.println(emp);
        session.save(emp);
		tx.commit();
		return "employee saved";
		}
		catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		}

		return "cannot create employee";
		}

	
	
	public List<Emp> DesAge(){
		try
		{
			int counter=0;
			
			Session session= factory.openSession();
			Transaction tx=session.beginTransaction();
			  Criteria ct=session.createCriteria(Emp.class);
			 
			  ct.addOrder( Order.desc("age"));
			  List<Emp> Age=(List<Emp>)ct.add(Restrictions.gt("age",49)).list();
			
			 counter++;
			       List<Emp> Des = ct.list();
			
		    tx.commit();
			

			 return  Des;
			
		}
			

	catch (Exception e) {
	// TODO: handle exception
	e.printStackTrace();
	}

	return null;
	}
		
	
		
	
	
	
	
	public ArrayList<Emp> three(){
		try {
		Session session= factory.openSession();
		Transaction tx=session.beginTransaction();
		 Criteria ct=session.createCriteria(Emp.class);
	ArrayList<Emp> three=(ArrayList<Emp>)ct.add(Restrictions.le("age",20)).list();
		     tx.commit();
			return three;
			}
			catch (Exception e) {
			e.printStackTrace();
			}
			finally {
			factory.close();
			}

		
		
		return null;
		
	}
	
	
	
	
	

}
