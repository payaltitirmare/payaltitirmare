package com.codeo.mp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.codeo.mp.Dao.CategoryDao;
import com.codeo.mp.entity.Category;

@WebServlet("/Addcategory")

public class AddCategory extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	PrintWriter pw = null;
	String Cat_title = null;
	String cat_description =null;
	CategoryDao cd = null;
	Category  category = null;
	String cat_id= null;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	pw = response.getWriter();
		
		Cat_title = request.getParameter("cattitle");
		
	   cat_description = request.getParameter("catdesc");

		 category = new Category(Cat_title,cat_description);
		 
		 cat_id = request.getParameter("id");
		 
		 System.out.println("id :"+ cat_id);
		 
		 cd = new CategoryDao();
		 
	 	boolean flag = false;
		
	 	
		flag = cd.addcategory(category);
		System.out.println(flag);
		if(flag==true)
		{
			response.sendRedirect("View_Category.jsp");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}	
	
	
	}

	
