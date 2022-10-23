<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>

</head>
<body>

<%  

try{
	Class.forName("com.mysql.cj.jdbc.Driver");
}
catch(ClassNotFoundException e)
{
	e.printStackTrace();
}

Connection con = null;
Statement stmt =null;
ResultSet resultset=null;

%>

<table border="13px" solid; cellspacing="10px"; cellpadding="20px";  >

<tr>

<th>sr<br>no</th>
<th>name </th>
<th>emailid</th>
<th>city no</th>
<th>mob no</th>
<th>age</th>
<th> delete</th>
</tr>

<% 
 String select_query="select * from  student_data";
 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_info", "root", "");

	stmt = con.createStatement();

 ResultSet rs = stmt.executeQuery(select_query);
 try{
	while(rs.next()) {
	  %>

<tr>
<td> <%=rs.getInt("id")%></td>
<td><%=rs.getString("name")%></td>
<td><%=rs.getString("emailid")%></td>
<td><%=rs.getString("city_name")%></td>
<td><%=rs.getString("mob_no")%></td>
<td><%=rs.getInt("age")  %></td>
<td><a href="delete.jsp?id=<%=rs.getString("id") %>"><button style="background-color:orange; border-radius:40px;">Delete</button></a></td>
</tr>

<%
	}
	}
 
 catch(Exception e)
 {
	 e.printStackTrace();
 }
%>

</table>

</body>
</html>