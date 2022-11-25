<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Login Form</title>

<!-- Font Icon -->
<link rel="stylesheet"
	href="fonts/material-icon/css/material-design-iconic-font.min.css">

<!-- Main css -->
<link rel="stylesheet" href="css/style.css">
</head>
<body>

  <%
        String email=(String)session.getAttribute("email");
        
        //redirect user to home page if already logged in
        if(email!=null) {
            response.sendRedirect("index.jsp");
        }
 
        String status=request.getParameter("status");
        
        if(status!=null){
        	
        	if(status.equals("false")){
        		   out.print("Incorrect login details!");	           		
        	}
        	else{
        		out.print("Some error occurred!");
        	}
        }
        %>

	<div class="main" >

		<!-- Sing in  Form -->
		<section class="sign-in" >
			<div class="container">
				<div class="signin-content">
					
					</div>
           <div class="signin-image">
					<div class="signin-form" >
						<h2 class="form-title">Online Eletrical Shopee</h2>
						<form method="post" action="Logincont" class="register-form"	id="login-form" >
							<div class="form-group">
								<label for="username"><i
									class="zmdi zmdi-account material-icons-name"></i></label> <input
									type="text" name="Email" id="Email"
									placeholder="Email" />
							</div>
							<div class="form-group">
								<label for="password"><i class="zmdi zmdi-lock"></i></label> <input
									type="password" name="password" id="password"
									placeholder="Password" />
							</div>
							<div class="form-group">
								<input type="checkbox" name="remember-me" id="remember-me"
									class="agree-term" /> <label for="remember-me"
									class="label-agree-term"><span><span></span></span>Remember
									me</label>
									
							</div>
							<div class="form-group form-button">
								<input type="submit" name="signin" id="signin"
									class="form-submit" value="Log in" />
						<a href="registration.jsp" class="signup-image-link">Register</a>
							</div>
						</form>
						<div class="social-login">
							<span class="social-label">Or login with</span>
							<ul class="socials">
								<li><a href="#"><i
										class="display-flex-center zmdi zmdi-facebook"></i></a></li>
								<li><a href="#"><i
										class="display-flex-center zmdi zmdi-twitter"></i></a></li>
								<li><a href="#"><i
										class="display-flex-center zmdi zmdi-google"></i></a></li>
							</ul>
						</div>
					</div>
			</div>
			</div>
		</section>

	</div>

	<!-- JS -->
	<script src="vendor/jquery/jquery.min.js"></script>
	<script src="js/main.js"></script>
</body>
</html>