package com.myserv.emp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/EmpServlet")
public class EmpServlet extends HttpServlet {
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String data=request.getParameter("name");
		    response.setContentType("text/html");
		    
		   
		    String Empname  = request.getParameter("text");
		    String Empid= request.getParameter("id");
		    String Empadd  = request.getParameter("address");
		    String pass= request.getParameter("password");
		    String cpass  = request.getParameter("cpassword");
		    String gender= request.getParameter("gender");
		    String lang  = request.getParameter("language");
		    String dob= request.getParameter("dob");
		    String sq  = request.getParameter("sq");
		    String sa= request.getParameter("sa");
		   /* System.out.println("Employee Name: " + Empname);
	        System.out.println("Employee id: " + Empid);
	        System.out.println("Employee Address: " + Empadd);
	        System.out.println("Employee password: " + pass);
	        System.out.println("Employee confirm password: " + cpass);
	        System.out.println("Employee gender: " + gender);
	        System.out.println("Employee Language known: " + lang);
	        System.out.println("Employee Date of Birth: " + dob);
	        System.out.println("Employee security question: " + sq);
	        System.out.println("Employee security answer: " + sa);*/
	 
	 
	 
	 

		    PrintWriter writer = response.getWriter();
		    
		    
		    String r = "<html>";
	        r += "<h2>Your name is: " + Empname + "<br>";      
	        r += "Your id  is: " + Empid+ "<br>";
	        r += "Your Address is: " + Empadd + "<br>";      
	        r += "Your password is: " + pass+ "<br>"; 
	        r += "Your confirm password is: " + cpass + "<br>";      
	        r += "Your gender is: " + gender+ "<br>";  
	        r += "Your languages are: " + lang + "<br>";      
	        r += "Your Date of Birth  is: " + dob+ "<br>";   
	        r += "Your security question  is: " + sq + "<br>";      
	        r += "Your security answer is: " + sa+ "</h2>";    
	        r += "</html>";
	         
	        writer.println(r);


		    }
	}

	
	


