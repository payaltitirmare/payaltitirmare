<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<%@ page import="java.sql.*" %>

<html>
<head>

</head>
<body>


<%

     String name = null;
   String emailid = null;
   String city= null;
   String mob_no = null;
   int age= 0;
   
   name = request.getParameter("sname");
   emailid = request.getParameter("emailid");
  city= request.getParameter("cityname");
  mob_no = request.getParameter("mob_no");
  age = Integer.parseInt(request.getParameter("age"));
   
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con = null;
    try{
    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_info", "root", "");

    PreparedStatement psmt =null;
    String insert_query="insert into student_data(name, emailid, city_name, mob_no, age) values(?,?,?,?,?)";
    if(con!=null)
    {
    	psmt = con.prepareStatement(insert_query);
    }
    if(psmt!=null)
    {
    	psmt.setString(1, name);
    	psmt.setString(2, emailid);
    	psmt.setString(3, city);
    	psmt.setString(4, mob_no);
    	psmt.setInt(5,age);
    }
    int result=0;
    if(psmt!=null)
    {
    	result = psmt.executeUpdate();
    }
    
    if(result!=0)
    {
    	out.println("data inseted succefully");
    }
    else
    {
    	out.println("data is not inserted");
    }
    
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
    	response.sendRedirect("Retrievedata.jsp");
    }
%>

</body>
</html>