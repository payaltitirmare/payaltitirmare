 package com.codeo.shop.controller;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.codeo.shop.Dao.ProductDao;
import com.codeo.shop.Dao.ProductDaoImp;
import com.codeo.shop.entity.Product;

@WebServlet("/Productoperation")
@MultipartConfig
public class ProductOperationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	String prod_name = null;
	String prod_description = null;
	String prod_price = null;
	String prod_discount = null;
	String prod_quantity = null;
	String prod_imageName = null;
	PrintWriter pw = null;
	ProductDao productdao = null;
	Product product= null;
	RequestDispatcher dispatcher = null;
	
	public  ProductOperationServlet()
	{
		productdao = new ProductDaoImp();
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		prod_name = request.getParameter("p_name");
		prod_description = request.getParameter("p_desc");
		prod_price = request.getParameter("p_price");
		prod_discount = request.getParameter("p_discount");
		prod_quantity = request.getParameter("p_quntity");
		String id = request.getParameter("id");
		pw = response.getWriter();
		
		System.out.println(prod_name+" "+prod_price+" "+ prod_quantity);
		Part file = request.getPart("p_image");
		prod_imageName = file.getSubmittedFileName(); 
		String uploadFile ="C:/Users/cw/git/FirstProject/MegaProject/src/main/webapp/app-assets/img"+prod_imageName;
		
		//for writing into file 
		FileOutputStream fos = new FileOutputStream(uploadFile);
		//for reading
		InputStream is = file.getInputStream();
        System.out.println("image name is:"+ prod_imageName);
		
		byte[] data = new byte[is.available()] ;
	     is.read();
		fos.write(data);
		fos.close();
		System.out.println(uploadFile);
	 product = new Product(prod_name ,prod_description, prod_price, prod_discount, prod_quantity, prod_imageName);
		
		  if(id.isEmpty() || id == null)
		 {
			 if(productdao.addProduct(product))
			 {
				 System.out.println("data is inserted");
				 dispatcher = request.getRequestDispatcher("View_product.jsp");
					dispatcher.forward(request, response);
			 }
		 }
		 else
		 {
			  product.setId(Integer.parseInt(request.getParameter("id")));
			 if(productdao.update(product))
			 { 
	          request.setAttribute("NOTIFICATION", "product Updated Succefully"); 
	           }
		 }
		    listProduct(request, response);
		 }
  
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		  String action = request.getParameter("action");
				

					switch(action) {
					
					
					case "EDIT":
						getSingleProduct(request, response);
						break;
						
					case "DELETE":
						deleteProdct(request, response);
						break;
						
					default:
						listProduct(request, response);
						break;
					} 
					}
			
	
	
	private void getSingleProduct(HttpServletRequest request, HttpServletResponse response) {
		
		
	}

	private void deleteProdct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		String id = request.getParameter("id");
		if(productdao.delete(Integer.parseInt(id)))
		{
			dispatcher = request.getRequestDispatcher("View_product.jsp");
			dispatcher.forward(request, response);
		}
	}
	private void listProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		//List<Product> theList = productdao.getlist();
		//request.setAttribute("theList", theList);
		dispatcher = request.getRequestDispatcher("View_product.jsp");
	    dispatcher.forward(request, response);
        }
     }
