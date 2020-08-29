package com.mysev.demos;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myserv.dao.ProductDao;
import com.myserv.dbutil.DbConnection;
import com.myserv.model.Product;


@WebServlet("/displaypro")
public class displaypro extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String prodName1 = request.getParameter("prodName");

		PrintWriter out= response.getWriter();
		response.setContentType("text/html");

		ProductDao dao=new ProductDao();
		ArrayList<Product> productList1=dao.Getproductdao(prodName1);


		  for(Product product:productList1)
		  {
		   out.print(product.getProdId());
		   out.print(product.getProdName());
		out.print(product.getProdPrice());
		out.print(product.getMfd());
		out.print(product.getColour());
		out.print(product.getExpDate()); 
		}
	}





		dao class>>
		public ArrayList<Product> getProductByName(String prodName) {
		try {
		Connection connection = DbConnection.getConnect();
		String sql="select * from products where prod_name like '"+prodName+"%'";

		PreparedStatement stat=connection.prepareStatement(sql);


		ResultSet res= stat.executeQuery();

		ArrayList<Product> productList=new ArrayList<>();

		while(res.next()) {
		int prodId= res.getInt(1);
		String prodName1 = res.getString(2);
		float prodPrice= res.getFloat(3);

		Date mfg = res.getDate(4);

		String color= res.getString(5);
		Date expDate= res.getDate(6);

		Product product=new Product(prodId, prodName1, prodPrice, mfg, color, expDate);

		productList.add(product);
		}

		return productList;
		}
		catch (Exception e) {
		e.printStackTrace();
		}
		return null;
		}
}