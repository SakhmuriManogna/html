package com.myapp.service;

import java.util.Date;

import com.myapp.dao.userdao;
import com.myapp.model.User;

public class userservice {
	
	public static void main(String args[]) {
		
	User user=new User(100,"Ashok",new Date(),true);
	userdao d=new userdao();
	System.out.println(d.Saveuser(user));
	
	}
}
