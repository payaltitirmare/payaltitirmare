<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.codeo.connection.OperationDao" %>
    <%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>


</head>

<body>

<%String id = request.getParameter("id");

System.out.println("id inside the update.jsp is :"+id);

 OperationDao op= new OperationDao();
 Connection conn = OperationDao.getConnection();

Statement statement = conn.createStatement();

String select_query="select * from jspdata where id="+id;
ResultSet  rs=null;
rs  = statement.executeQuery(select_query);

System.out.println("resultset is :"+rs);
System.out.println("==================================");

while(rs.next())
{  
	%>
	<h1>Update form </h1>
<form action="Updatedata.jsp" method="post">
<label>Enter name</label>
<input type="hidden" name="id" value="<%=rs.getString("id") %> "><br>
<input type="text" name="name" value="<%=rs.getString("name") %>"><br><br>
<label>Enter emailid</label>
<input type="email" name="emailid"  value="<%=rs.getString("emailid") %>"><br><br>
<label>Enter gender :</label>
<input type="radio"  name="gender"  value="<%=rs.getString("gender")%>">Male
<input type="radio" name="gender"  value="<%=rs.getString("gender")%>">Female<br><br>

<input type="submit" value="update">
</form>
<%
}

%>

</body>
</html>