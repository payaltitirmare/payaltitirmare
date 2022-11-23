package com.codeo.mp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.codeo.mp.Dao.LoginDao;
import com.codeo.mp.Dao.LoginDaoImpl;
import com.codeo.mp.entity.Login;

@WebServlet("/Logincont")

public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   LoginDao logindao = null;
   Login login = null;
    public LoginController() {
       
    	logindao = new LoginDaoImpl();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
	login = new Login();
	
		login.setEmail(request.getParameter("Email"));
		login.setPassword(request.getParameter("password"));
		
		System.out.println(login.getEmail());
		System.out.println(login.getPassword());
		String result = logindao.loginCheck(login);
		
		if(result.equals("true")){
			session.setAttribute("email",login.getEmail());
			response.sendRedirect("UserList.jsp");
		}
		if(result.equals("false")){
			response.sendRedirect("loginfrom.jsp?status=false");
		}
		 
		if(result.equals("error")){
		    response.sendRedirect("loginfrom.jsp?status=error");
		}
	}

}
