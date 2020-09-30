package com.myapp.service;
import java.util.Date;

import com.myapp.dao.BookDao;
import com.myapp.model.Book;
import com.myapp.model.Publisher;
import com.myapp.model.Publisher2;

public class BookService {

public static void main(String[] args) {
	//Book book=new Book(11,"God Made","Kariga Nadh",new Date());
/*
Book book=new Book(101,"The Taj Mahal","Mahashivan ravi",new Date());

book.setCopiesOfBook(10);
Publisher publisher=new Publisher("1", "ABC publications");
book.setPublisher1(publisher);

ArrayList<Distributor> distList=new ArrayList();
distList.add(new Distributor(1, "Akbar", "Delhi"));
distList.add(new Distributor(2, "Salim", "Mumbai"));
book.setDistList(distList);
*/
	
	
	Book book=new Book(101,"My Book","Raghu",new Date());
	Book book1=new Book(102,"My Book1","Jyothi",new Date());
	Book book2=new Book(103,"My Book2","Satya",new Date());
	BookDao dao=new BookDao();
	dao.saveBook(book);
	dao.saveBook(book1);
	dao.saveBook(book2);

//	Publisher publisher=new Publisher("1", "ABC publications");
//	book.setPublisher1(publisher);
//
//	Publisher2 publisher2=new Publisher2(2,"DEF Publications");
//	book.setPublisher2(publisher2);
//
//	BookDao dao=new BookDao();
//	System.out.println(dao.saveBook(book));
//	System.out.println(dao.saveBook(book1));
//	System.out.println(dao.saveBook(book2));

//Publisher publish=new Publisher("1", "ABC publications");
//Publisher publish1=new Publisher("2", "DEF publications");
//book.setPublisher1(publish);
//book.setPublisher2(publish1);
//
//BookDao dao=new BookDao();
//
//System.out.println(dao.saveBook(book));
//
//
//	
//	/*Book book= dao.getBook(102);
//	System.out.println(book);
//	*/
//	
//	ArrayList<Book> books=(ArrayList<Book>)dao.getBooks();
//
//	for(Book book2:books){
//	System.out.println(book2);
//	}
//	
	
	
	
	
/*	ArrayList<Book> books=(ArrayList<Book>)dao.filterBooks();

	for(Book book1:books){
	System.out.println(book1);
	}
*/






}

}