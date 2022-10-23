Deletedata.jsp<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.*" %>
    <%@page import="com.codeo.connection.OperationDao" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
String id = request.getParameter("id");
 Connection con =null;
 try{
con = OperationDao.getConnection();

String query ="delete  from jspdata where id="+id ;

Statement stmt = con.createStatement();

int result = stmt.executeUpdate(query);

stmt.close();
con.close();

 }

 catch(Exception e){
	 e.printStackTrace();
 }

finally{
	response.sendRedirect("ReadData.jsp");
}
%>
</body>
</html>