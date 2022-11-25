<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Register Form</title>

<!-- Font Icon -->
<link rel="stylesheet" href="fonts/material-icon/css/material-design-iconic-font.min.css">

<!-- Main css -->
<link rel="stylesheet" href="css/style.css">
</head>
<body>

	<div class="main">

		<section class="signup">
			<div class="container">
				<div class="signup-content">
					<div class="signup-form">
						<h2 class="form-title"> REGISTER </h2>
					
					
		<c:if test="${user != null}">
						<form action="update" method="post" class="register-form"  id="register-form">
						</c:if>
				
				  <c:if test="${user == null}">
				  
					<form action="insert" method="post" class="register-form"  id="register-form">
				</c:if>
				
				<c:if test="${user !=null }"> Edit user </c:if>
				
				<c:if test="${user == null }">  Add New User </c:if> 
				
						<div class="form-group">
								<label for="re-pass"><i class="zmdi zmdi-lock-outline"></i></label>
								<input type="hidden" name="id" id="re_pass"  value="<c:out value="${user.user_id}"></c:out>"/>
							</div>
							<div class="form-group">
								<label for="name"> <i class="zmdi zmdi-account material-icons-name"></i></label> <input
									type="text" name="name" id="name" placeholder="Your Name" value="<c:out value='${user.user_name }'></c:out>"/>
							</div>
							<div class="form-group">
								<label for="contact"><i class="zmdi zmdi-lock-outline"></i></label>
							<input type="text" name="contact" id="contact" placeholder="Mobile No" value="<c:out value='${user.user_mobno }'></c:out>" />
							</div>
							<div class="form-group">
								<label for="Address"><i class="zmdi zmdi-lock-outline"></i></label>
								<input type="text" name="Address" id="Address" placeholder="Address" value="<c:out value='${user.user_adderess }'></c:out>" />
							</div>
							<div class="form-group">
								<label for="email"><i class="zmdi zmdi-email"></i></label> <input
									type="email" name="email" id="email" placeholder="Your Email" value="<c:out value='${user.user_emailid }'></c:out>" />
							</div>
							<div class="form-group">
								<label for="pass"><i class="zmdi zmdi-lock"></i></label> <input
									type="password" name="pass" id="pass" placeholder="Password"  value="<c:out value='${user.user_pass }'></c:out>" />
							</div>
							<div class="form-group">
								<label for="re-pass"><i class="zmdi zmdi-lock-outline"></i></label>
								<input type="password" name="re_pass" id="re_pass"	placeholder="Confirm password" />
							</div>
						
							<div class="form-group">
								<input type="checkbox" name="agree-term" id="agree-term"
									class="agree-term" /> <label for="agree-term"
									class="label-agree-term"><span><span></span></span>I agree all statements in <a href="#" class="term-service">Terms	of service</a></label>
							</div>
							<div class="form-group form-button">
								<input type="submit" name="signup" id="signup"	class="form-submit" value="Register" />
							</div>
						</form>
					</div> 
					<div class="signup-image">
					<figure>
						 <img src="images/signup-image.jpg" alt="sing up image"/>
								</figure>
						<a href="loginfrom.jsp" class="signup-image-link">I am already Register</a>
					</div>
				</div>
			</div>
		</section>

	</div>
	<!-- JS -->
	<script src="vendor/jquery/jquery.min.js"></script>
	<script src="js/main.js"></script>

</body>
