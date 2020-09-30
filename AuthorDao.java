package com.myspr.demo.dao;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import com.myspr.demo.Model.Author;

@Transactional
public class AuthorDao {


@Autowired
SessionFactory factory;


public AuthorDao() {
// TODO Auto-generated constructor stub
}


public AuthorDao(SessionFactory factory) {
super();
this.factory = factory;
}


public String saveAuthor(Author author){
try{
Session session=factory.getCurrentSession();
session.save(author);
return "Author Created";
}
catch (Exception e) {
// TODO: handle exception
e.printStackTrace();
}

return "cannot create Author";
}



public List<Author> getbyname(String authorName) {

try{
Session session=factory.getCurrentSession();
Criteria crit = session.createCriteria(Author.class);
Query query=session.createQuery("from Author b where b.authorName=:authorName");
query.setParameter("authorName", authorName);
ArrayList<Author> name=(ArrayList<Author>) query.list();

return name;

}
catch (Exception e) {
// TODO: handle exception
e.printStackTrace();
}
return null;



}
public List<Author> getbycity(String city) {

try{
Session session=factory.getCurrentSession();
Criteria crit = session.createCriteria(Author.class);
Query query=session.createQuery("from Author c where c.city=:city");
query.setParameter("city", city);
ArrayList<Author> bycity=(ArrayList<Author>) query.list();
return bycity;

}
catch (Exception e) {
// TODO: handle exception
e.printStackTrace();
}
return null;



}


public String delete(String authorName){
	try
	{

	String hql="delete from Author  a where a.authorName = :authorName";
	Session session= factory.openSession();
	Query query=(Query) session.createSQLQuery(hql);
	query.setParameter("authorName",authorName);
    int res=query.executeUpdate();
	if(res>0)
	return "deleted";
	}

	
	catch (Exception e) {
	e.printStackTrace();

	}

	return "can  not delete";
	}






}