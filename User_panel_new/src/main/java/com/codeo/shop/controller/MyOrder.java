package com.codeo.shop.controller;

import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.codeo.shop.Dao.CustomerDao;


@WebServlet("/orderPlace")
public class MyOrder extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	String C_AddressId;
	String Payment_Mode;
	String U_id;
	String T_Price;
	String paymentId;
	String razopayOrderId;
	RequestDispatcher dispatcher = null;
	 
    public MyOrder() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession(); 
		
		C_AddressId = (String)session.getAttribute("addressId");
		paymentId=request.getParameter("paymentId");
		System.out.println("============="+paymentId);
		if(paymentId==null || paymentId=="") {
			Payment_Mode="Cash On Delivery";
		}else {
			Payment_Mode="Online Paid";
		}
		
		if(Payment_Mode==null) {
			session.setAttribute("incompleteinfo","No Payment");
			response.sendRedirect("checkout.jsp");
			return;
		}
		
		U_id=request.getParameter("user_id");
		T_Price=request.getParameter("tprice");
		
		 razopayOrderId=request.getParameter("razorpayOrdertId");
		 String Pid[]=request.getParameterValues("productIdO");
		 String Pname[]=request.getParameterValues("productNameO");
		 String Pquantity[]=request.getParameterValues("productQuantityO");
		 String Pprice[]=request.getParameterValues("productPriceO");
		
		CustomerDao cd=new CustomerDao();
		if(cd.placeOrder(razopayOrderId, C_AddressId, U_id, T_Price, Payment_Mode)) {
			int orderId=0;
			try {
				 orderId=cd.getOrderId();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(cd.orderPlace(Pid, Pname, Pquantity, Pprice, orderId)) {
				System.out.print("detail is inserted");
				session.setAttribute("orderSuccess"," Success");
				razopayOrderId=null;
				//razopayPaymentId=null;
				session.removeAttribute("o_id");
				session.removeAttribute("addressId");
				session.removeAttribute("razorpayPaymentId");
				response.sendRedirect("MyOrders.jsp");
			
			}
			} 
	}
	}

