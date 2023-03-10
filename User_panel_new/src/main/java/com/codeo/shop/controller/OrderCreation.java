package com.codeo.shop.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.json.*;
import com.razorpay.*;

/**
 * Servlet implementation class OrderCreation
 */
public class OrderCreation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public OrderCreation() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	//order creation code 
		
		RazorpayClient client = null;
		String orderId=null;
		
		try {
			client = new RazorpayClient("rzp_live_nWvxkcXxFc6NZ6","");
			
			JSONObject options = new JSONObject();
			options.put("razorpay_payment_id",request.getParameter("razorpay_payment_id"));
			options.put("razor_order_id",request.getParameter("razorpay_order_id"));
			
	
		}
	 catch(RazorpayException e)
		{
		 e.printStackTrace();
		}
	
	
	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
