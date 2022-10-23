<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.*" %>
    <%@page import="com.codeo.connection.OperationDao" %>
<!DOCTYPE html>
<html>
<head>

</head>
<body>
<%
String id = request.getParameter("id");

OperationDao op = new OperationDao();
Connection conn = null;
Statement statement = null;

ResultSet rs = null;
%>

<center>
<h1>Table data </h1>
<table border="13px" solid; cellspacing="10px"; cellpadding="20px";>
<tr>
<th>sr<br>no</th>
<th>name </th>
<th>emailid</th>
<th>Gender </th>

<th>Delete</th>
<th>Update</th>
</tr>

<%
	
	
	conn= OperationDao.getConnection();
String query="select * from jspdata";
statement = conn.createStatement();

rs = statement.executeQuery(query);
try{
	
while(rs.next()){

%>

<tr>
<td><%=rs.getInt("id") %></td>
<td><%=rs.getString("name") %></td>
<td><%=rs.getString("emailid") %></td>
<td><%=rs.getString("gender") %>

<td><a href="Deletedata.jsp?id=<%=rs.getString("id") %>"><button style="background-color:orange; border-radius:40px;">Delete</button></a></td>
<td><a href="Update.jsp?id=<%=rs.getString("id") %>"><button style="background-color:orange; border-radius:40px;">Update</button></a></td>
</tr>


<% }
}
catch(Exception e)
{
	e.printStackTrace();
}

%>
</table>
</center>
</body>
</html>