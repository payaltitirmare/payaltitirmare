<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.codeo.shop.entity.User" %>
    <%@page import="java.sql.*" %>
      <%@page import="com.codeo.shop.dbutil.ConnectionProvider" %>
      <%@page import="com.codeo.shop.controller.RegistrationServlet" %>
       <%@page import="com.codeo.shop.Dao.UserDaoImpl" %>
       <%@page import="com.codeo.shop.Dao.UserDAO" %>
      
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<%

 request.getAttribute("user");

UserDAO userDAO = new UserDaoImpl();
int id = Integer.parseInt(request.getParameter("id"));
userDAO.edituser(id);



%>
</body>
</html>