package com.mysrv.demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.myserv.dao.ProductDao;
import com.myserv.model.Product;

/**
 * Servlet implementation class GetProducts
 */
@WebServlet("/GetProducts")
public class GetProducts extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public GetProducts() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProductDao dao=new ProductDao();
		ArrayList<Product> productList= dao.getAllProducts();
	    //System.out.println(productList.size());
	    
		

		HttpSession session= request.getSession();
		session.setAttribute("productList", productList);
        RequestDispatcher rd=  request.getRequestDispatcher("displayProduct.jsp");
		rd.forward(request, response);

	}

	
	
}
