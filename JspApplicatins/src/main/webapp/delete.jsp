<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>

</head>
<body>

<%
String id=request.getParameter("id");
try{
//Register the driver
Class.forName("com.mysql.cj.jdbc.Driver");
//Establish the connection
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_info","root","");
Statement st=con.createStatement();
String query="delete from student_data where id="+id;
int i=st.executeUpdate(query);
st.close();
con.close();
}
catch(Exception e1 ){
	e1.printStackTrace();
}
finally{
	response.sendRedirect("Retrievedata.jsp");
}
%>

</body>
</html>