package demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mydrv.model.Employee;


@WebServlet("/Srv1")
public class Srv1 extends HttpServlet {

@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

PrintWriter out=response.getWriter();
response.setContentType("text/html");

out.print("servlet 1");
int empId=Integer.parseInt(request.getParameter("empId"));
int empAge= Integer.parseInt(request.getParameter("empAge"));
String empName= request.getParameter("empName");
String empAddress= request.getParameter("empAddress");

Employee employee=new Employee(empId, empName, empAge, empAddress);

// out.print("Session data "+var+"<br>");


HttpSession session= request.getSession();
session.setAttribute("employee", employee);


out.print("<form action='Srv2'>");
out.print(" <input type='submit'>");
out.print(" </form>");

}
}
