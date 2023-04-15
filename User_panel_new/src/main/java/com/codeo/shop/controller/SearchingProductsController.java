package com.codeo.shop.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.codeo.shop.Dao.ProductDao;
import com.codeo.shop.Dao.ProductDaoImp;
import com.codeo.shop.dbutil.ConnectionProvider;
import com.codeo.shop.entity.Product;

@WebServlet("/SearchController")
public class SearchingProductsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	String search=request.getParameter("Search");
	
     System.out.println(search);
	
     // the logic for search product name  prod_id, prod_name, prod_description, prod_price, prod_discount, prod_quantity, prod_imageName, cid
     ProductDaoImp dao= new ProductDaoImp();
     
   List<Product> list= dao.getAllSearchProudcts(search);
     
	RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
    dispatcher.forward(request, response);
		
	}
	
	
	
	
	/*
	 * Connection con= ConnectionProvider.getconnection(); String query
	 * ="select prod_name from product_operation where prod_name like '%"+search+
	 * "%'";
	 * 
	 * try { Statement stmt = con.createStatement(); ResultSet rs =
	 * stmt.executeQuery(query);
	 * 
	 * while(rs.next()) { System.out.println(rs.getString(2)); }
	 * 
	 * 
	 * } catch (SQLException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); }
	 */
}
