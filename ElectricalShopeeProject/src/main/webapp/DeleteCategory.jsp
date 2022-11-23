<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.codeo.mp.connection.DbUtil" %>
     <%@page import="java.sql.*" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>delete</h1>

 <%
 
 String id = request.getParameter("id");

 try{
 Connection con = DbUtil.getconnection();
 Statement statement = null;
 String Delete_query ="delete from add_category where catId="+id;
 int result = 0;
 statement = con.createStatement();
 
 result = statement.executeUpdate(Delete_query);
 
 statement.close();
 con.close();
 }
 catch(SQLException e)
 {
	 e.printStackTrace();
 }
 catch(Exception e)
 {
	 e.printStackTrace();
 }
finally{
	
	response.sendRedirect("View_Category.jsp");
}
 
 
 %>

</body>
</html>