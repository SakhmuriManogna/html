package com.mysrv.demos;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/helloname")
public class helloname extends HttpServlet {
	
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 PrintWriter out=response.getWriter();
		String data=request.getParameter("username"); //used for get data from html file tthat is given by client
		response.setContentType("username");  //reponse bcoz it is given from client
		 
		    out.print("<h1> <font color='blue'> HELLO  "+ data +"!!" +" </font> </h1>"); 
	}

}
