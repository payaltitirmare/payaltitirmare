package com.codeo.sms.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;
import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.codeo.smj.dao.SuperAdminDao;
import com.codeo.smj.entity.SuperAdmin;
import com.codeo.sms.helper.EmailFunctionalityForSuperAdmin;

@WebServlet("/superadminFormSubmit")

public class SuperAdminController extends HttpServlet {
	
	// Servlet class (req , res )--> ( object creation of entity ==> initialize the
	// object ==> call persistence logic

	SuperAdminDao sadao = null;

	private static final long serialVersionUID = 1L;
	private String host = null;
	private String port = null;
	private String user = null;
	private String pass = null;

	EmailFunctionalityForSuperAdmin efsuperadmin = null;

	public void init() {
		// reads SMTP server setting from web.xml file
		ServletContext context = getServletContext();
		host = context.getInitParameter("host");
		port = context.getInitParameter("port");
		user = context.getInitParameter("user");
		pass = context.getInitParameter("pass");

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		PrintWriter pw = null;

		try {
			pw = response.getWriter();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		// Email Functionality:
		String message = "Hey " + name + " you have registered successfully";
		String subject = "Mailing you for successful registration Mr/Mrs. " + name;
		efsuperadmin = new EmailFunctionalityForSuperAdmin();
		
		
		try {
			efsuperadmin.sendEmail(host,port,user,password,email,message,subject);
		} catch (AddressException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// persistence logic

		SuperAdmin superadmin = new SuperAdmin(name, email, password);

		sadao = new SuperAdminDao();

		boolean result = false;

		try {
			result = sadao.insertsuperadmin(superadmin);

			if (result) {
				pw.println("<h1 style='color:green';>data is inserted</h1>");
			} else {
				pw.println("issue in data");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// whenever the client sends the request it goes to the controller(servlet)
	// controllar call the view by sending the model object
	// model object is the object which will have the data.
	// that model object will go to view then view will replace all the blank text
	// with actual data and we will get the page.

}
