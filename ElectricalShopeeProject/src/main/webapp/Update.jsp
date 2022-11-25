<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.codeo.mp.Dao.ProductDaoImp" %>
    <%@page import="com.codeo.mp.Dao.ProductDao" %>
     <%@page import="com.codeo.mp.entity.Product" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%  

ProductDao prodimp = new ProductDaoImp();
Product product = null;
int id = Integer.parseInt(request.getParameter("id"));
product = prodimp.editProd(id);

while(product!=null)
{

	System.out.println(product.getProd_name());
	System.out.println(product.getProd_description());
	System.out.println(product.getProd_discount());
	System.out.println(product.getProd_imageName());
	System.out.println(product.getProd_price());
	System.out.println(product.getProd_quantity());
}


%>

</body>
</html>