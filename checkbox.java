package com.mysrv.demos;

import java.io.IOException;
import java.io.PrintWriter;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/checkbox")
public class checkbox extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		
	    
	   
	    String data=request.getParameter("un");
	    response.setContentType("text/html");
	    out.println("<h1> <font color='red'> HELLO"+ data +" </font> </h1>");
	   
	   
	    String arr[]= request.getParameterValues("languagesKnown");
	   
	    for(String a:arr)
	    {
	   
	    out.println(a+"<br>");
	    }
	   
	   
	    }
	}


