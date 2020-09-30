package com.mysrv.demos;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;








@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {


@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   String data=request.getParameter("un");
	    response.setContentType("text/html");
	    PrintWriter out=response.getWriter();
	    out.print("<h1> <font color='#ab23ad'> Hello  "+ data +" !!!!</font> </h1>");
	    
	     String arr[]= request.getParameterValues("languagesKnown");

	    for(String a:arr)
	    {

	    out.println(a+"<br>");
	    }


	    }
		
	}


