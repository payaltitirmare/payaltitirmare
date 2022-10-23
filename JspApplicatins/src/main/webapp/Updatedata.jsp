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
String name= request.getParameter("name");
String emailid = request.getParameter("emailid");
String gender = request.getParameter("gender");

System.out.println("id inside the Updatedata is :"+id);

try{
Connection con = OperationDao.getConnection();

String update_query="update jspdata set name=? , emailid=?, gender=? where id="+id;

PreparedStatement psmt = con.prepareStatement(update_query);

System.out.println("psmt is "+psmt);

if(psmt!=null)
{
	psmt.setString(1, name);
	psmt.setString(2,emailid);
	psmt.setString(3,gender);
}
int result = 0;
if(psmt!=null)
{
	result = psmt.executeUpdate();
	
}
System.out.println("result is :"+result);
if(result!=0)
{
	out.println("data is updated");
}

else
{
	out.println("data is not updated");
}
}
catch(Exception e)
{
	e.printStackTrace();
}

finally{
	response.sendRedirect("ReadData.jsp");
}
%>
</body>
</html>