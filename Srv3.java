package demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mydrv.model.Employee;

/**
 * Servlet implementation class Srv3
 */
@WebServlet("/Srv3")
public class Srv3 extends HttpServlet {
private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Srv3() {
        super();
        // TODO Auto-generated constructor stub
    }

/**
* @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
*/
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
PrintWriter out=response.getWriter();
response.setContentType("text/html");

HttpSession session= request.getSession();
Employee employee=(Employee)session.getAttribute("employee");




out.print("servlet 3 ");
out.print(employee.getEmpName());
out.print("  ");
out.print(employee.getEmpId());
out.print("  ");
out.print(employee.getEmpAge());
out.print("  ");
out.print(employee.getEmpAddress());


}

/**
* @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
*/
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// TODO Auto-generated method stub
doGet(request, response);
}

}
