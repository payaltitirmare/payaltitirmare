package com.codeo.mp.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.codeo.mp.Dao.BannerDAO;
import com.codeo.mp.Dao.BannerDAOImp;
import com.codeo.mp.entity.Banner;

@WebServlet("/uploadServlet")
@MultipartConfig

public class AddNewBanners extends HttpServlet {
	
	 BannerDAO bannerdao = null;
     
	
			protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
			           {
		       System.out.println("post method working properly");
		      
		       PrintWriter pw=response.getWriter();
		       String bannertagline=request.getParameter("banner_tagline");
		       String buttonstyle=request.getParameter("button_style");
		       String status=request.getParameter("status");
           
		       Part file=request.getPart("Banner_img");
		       String imageFileName= file.getSubmittedFileName();
		      
		       System.out.println(imageFileName);
		       
		       String uploadPath ="D:/java program/ElectricalShopeeProject/src/main/webapp/app-assets/img/"+imageFileName;
			   System.out.println("Upload Path: "+uploadPath);
		       
		       //upload our selected image in Images folder
		       try {
		       FileOutputStream fos=new FileOutputStream(uploadPath);
		       InputStream is=file.getInputStream();
		       
		       byte[] data=new byte[is.available()];
		       
		       is.read(data);
		       fos.write(data);
		       fos.close();
		       
		       Banner banner = new Banner(bannertagline,imageFileName,status);
		       
		       bannerdao = new BannerDAOImp();
		      
		       if(bannerdao.addbanner(banner))
		       {
		    	   System.out.println("data inserted");
		       }
		       }
		       catch(Exception e) {
		    	   e.printStackTrace();
		       }
		      
			}
}