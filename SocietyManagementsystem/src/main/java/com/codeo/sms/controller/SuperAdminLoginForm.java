package com.codeo.sms.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.codeo.smj.dao.SuperAdminDao;

@WebServlet("/adminloginform")

public class SuperAdminLoginForm extends HttpServlet {
	
	String username=null;
	String password=null;
	PrintWriter pw =null;
	SuperAdminDao saddao = null;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 username = request.getParameter("username");
		 password = request.getParameter("password");
		
	       pw = response.getWriter();
		
	       System.out.println(username +" "+password);
	       
	      saddao = new SuperAdminDao();
	      
	        saddao.loginServlet(username , password);
	      
	}
       
}
