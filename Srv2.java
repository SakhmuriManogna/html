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




@WebServlet("/Srv2")
public class Srv2 extends HttpServlet {

@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

PrintWriter out=response.getWriter();
response.setContentType("text/html");
HttpSession session= request.getSession();
Employee employee=(Employee)session.getAttribute("employee");

out.print(employee);

out.print("<form action='Srv3'>");
out.print(" <input type='submit'>");
out.print(" </form>");



}

}
