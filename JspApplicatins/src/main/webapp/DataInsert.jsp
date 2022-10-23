<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@page import="java.sql.*" %>
    <%@page import="com.codeo.connection.OperationDao" %>
    
<!DOCTYPE html>
<html>
<head>

</head>
<body>

<%! String name=null;
  String emailid=null;
  String gender = null;
 // String age =null;
  String hobbies[] =null;
%>

<%

name= request.getParameter("sname");
emailid=request.getParameter("emailid");
gender = request.getParameter("gender");
//age = request.getParameter("age");
hobbies    = request.getParameterValues("hobbies");
out.println("hobbies are");

//System.out.println(" age  DataInsert is :"+age);

for(int i=0;i<hobbies.length;i++)
{
	out.print(hobbies[i]+" ");
}
   OperationDao dd = new OperationDao();
   try{
   Connection conn=null;
   conn= OperationDao.getConnection();
     
     String insert_query="insert into jspdata(name, emailid, gender) values(?,?,?)";
     
     PreparedStatement psmt = null;
     psmt = conn.prepareStatement(insert_query);
     
     if(psmt!=null)
     {
    	 psmt.setString(1,name);
    	 psmt.setString(2,emailid);
    	 psmt.setString(3, gender);
    	// psmt.setString(4,age);
     }
     
     int result = psmt.executeUpdate();
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