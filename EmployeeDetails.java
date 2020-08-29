package com.mysrv.demos;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EmployeeDetails")
public class EmployeeDetails extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter out=response.getWriter();
	response.setContentType("text/html");
	String a=request.getParameter("Empname");
	String b=request.getParameter("Empid");
	String c=request.getParameter("address");
	String d=request.getParameter("password");
	String e=request.getParameter("DOB");
	String f=request.getParameter("gender");
	String g=request.getParameter("Languagesknown");
	String h=request.getParameter("securityquestion");
	String i=request.getParameter("answerforquestion");
	
	out.print(a+"<br>");
	out.print(b+"<br>");
	out.print(c+"<br>");
	out.print(d+"<br>");
	out.print(e+"<br>");
	out.print(f+"<br>");
	out.print(g+"<br>");
	out.print(h+"<br>");
	out.print(i+"<br>");
   
   
    }
	
	
	
		
	}

