package jstl.demo;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.servlet4preview.RequestDispatcher;

@WebServlet("/First")
public class First extends HttpServlet {
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String playerNames="rohit,rahul,virat,dk,hardik,kedar";

		HttpSession session= request.getSession();
		session.setAttribute("playerList", playerNames);

		javax.servlet.RequestDispatcher rd= request.getRequestDispatcher("myfile.jsp");
		rd.forward(request, response);

		
		/*ArrayList<String> studNames=new ArrayList<>();

		studNames.add("Raj");
		studNames.add("Ram");
		studNames.add("Raja");
		studNames.add("Ramu");
		studNames.add("Raman");
		studNames.add("Rama");

		HttpSession session= request.getSession();

		session.setAttribute("studList", studNames);

		javax.servlet.RequestDispatcher rd= request.getRequestDispatcher("myfile.jsp");
		rd.forward(request, response);

		}
		*/

	}
	
	
}
