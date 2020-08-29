package com.mysrv.demos;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {

@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

PrintWriter out=response.getWriter();
response.setContentType("text/html");

out.print("servlet 1");
String var= request.getParameter("somedata");
out.print(var);

HttpSession session= request.getSession();
session.setAttribute("sVar", var);


out.print("<form action='Servlet2'>");
out.print(" <input type='submit'>");
out.print(" </form>");


}

}