package com.myapp.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.myapp.model.User;

public class userdao {
	public String Saveuser(User user)
	{
		SessionFactory factory=null;
	try
	{
	 factory=new Configuration().configure().buildSessionFactory();
	Session session= factory.openSession();
	Transaction tx=session.beginTransaction();
	session.save(user);
	tx.commit();
	return "user saved";
	}
	catch (Exception e) {
	
	e.printStackTrace();
	}

	return "cannot save user";
	}

}
