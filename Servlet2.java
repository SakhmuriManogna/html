package com.mysrv.demos;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Servlet2")
public class Servlet2 extends HttpServlet {

@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

PrintWriter out=response.getWriter();
response.setContentType("text/html");

HttpSession session= request.getSession();
//String data=(String)session.getAttribute("sVar");
session.setMaxInactiveInterval(5); //to set timeout

String data=session.getAttribute("sVar").toString();



out.print("servlet 2");
out.print(data);
out.print("<form action='servelt3'>");
out.print(" <input type='submit'>");
out.print(" </form>");
}

}




