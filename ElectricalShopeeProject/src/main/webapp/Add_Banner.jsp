<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0, minimal-ui">
    <meta name="description" content="Apex admin is super flexible, powerful, clean &amp; modern responsive bootstrap 4 admin template with unlimited possibilities.">
    <meta name="keywords" content="admin template, Apex admin template, dashboard template, flat admin template, responsive admin template, web app">
    <meta name="author" content="PIXINVENT">
    <title>Dashboard1 - Apex responsive bootstrap 4 admin template</title>
    <link rel="apple-touch-icon" sizes="60x60" href="app-assets/img/ico/apple-icon-60.html">
    <link rel="apple-touch-icon" sizes="76x76" href="app-assets/img/ico/apple-icon-76.html">
    <link rel="apple-touch-icon" sizes="120x120" href="app-assets/img/ico/apple-icon-120.html">
    <link rel="apple-touch-icon" sizes="152x152" href="app-assets/img/ico/apple-icon-152.html">
    <link rel="shortcut icon" type="image/x-icon" href="app-assets/img/ico/favicon.ico">
    <link rel="shortcut icon" type="image/png" href="app-assets/img/ico/favicon-32.png">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="apple-touch-fullscreen" content="yes">
    <meta name="apple-mobile-web-app-status-bar-style" content="default">
    <link href="https://fonts.googleapis.com/css?family=Rubik:300,400,500,700,900|Montserrat:300,400,500,600,700,800,900" rel="stylesheet">
    <!-- BEGIN VENDOR CSS-->
    <!-- font icons-->
    <link rel="stylesheet" type="text/css" href="app-assets/fonts/feather/style.min.css">
    <link rel="stylesheet" type="text/css" href="app-assets/fonts/simple-line-icons/style.css">
    <link rel="stylesheet" type="text/css" href="app-assets/fonts/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" type="text/css" href="app-assets/vendors/css/perfect-scrollbar.min.css">
    <link rel="stylesheet" type="text/css" href="app-assets/vendors/css/prism.min.css">
    <link rel="stylesheet" type="text/css" href="app-assets/vendors/css/chartist.min.css">
    <link rel="stylesheet" type="text/css" href="app-assets/css/app.css">

  </head>
 
<body data-col="2-columns" class=" 2-columns ">
 
  <div class="wrapper nav-collapsed menu-collapsed">
  
<%@include file="Asidebar.jsp" %>

<%@include file="Navbar.jsp" %>

<div class="main-panel">
        <div class="main-content">
          <div class="content-wrapper">
  
	<div class="row justify-content-md-center">
		<div class="col-md-6">
	        <div class="card">
	            <div class="card-header">
	                <h4 class="card-title" id="hidden-label-card-center"> <b>Add Banner </b></h4>
	                </div>
	            <div class="card-body">
	                <div class="px-3">
	                
						<form class="form" action="uploadServlet" method="post" enctype="multipart/form-data">
							<div class="form-body">
	                    		<div class="row">
	                    			<div class="form-group col-12 mb-2">
			                            <label ><b>Banner TagLine: </b></label>
			                            <input type="text" id="eventInput1" class="form-control"  name="banner_tagline">
			                        </div>
	                    		</div>
                              <!--  
	                    		<div class="row">
	                    			<div class="form-group col-12 mb-2">
			                            <label> <b>Banner Description</b></label>
			                            <input type="text" id="eventInput2" class="form-control" name="button_style">
			                        </div>
	                    		</div>   -->
        		
					<div class="form-group">
						<label for="Profile Photo">Profile Photo:</label>
						 <input type="file" name="Banner_img" size="50" multiple/>
					</div>
	                  
					<div class="form-group col-12 mb-2">
					                        	<label> <b>Status </b></label>
					                        	
					                           
					<div class="input-group">
										<div class="custom-control custom-radio display-inline-block">
                                            <input type="radio" id="customRadioInline2" name="status" class="custom-control-input" value="active">
                                            <label class="custom-control-label" for="customRadioInline2">Active</label>
                                        </div>
                                        <div class="custom-control custom-radio display-inline-block">
                                            <input type="radio" id="customRadioInline3"  name="status" class="custom-control-input" value="inactive">
                                            <label class="custom-control-label"for="customRadioInline2">InActive</label>
                                        </div>
									</div>
					</div>
                      </div>
							<div class="form-actions center">
	                            <button type="button" class="btn btn-raised btn-warning mr-1">
	                            	<i class="ft-x"></i> Cancel
	                            </button>
	                            <button type="submit" class="btn btn-raised btn-primary">
	                                <i class="fa fa-check-square-o"></i> Save
	                            </button>
	                        </div>
						</form>
	                </div>
	            </div>
	        </div>
	    </div>
	    
	  
	</div>
	</div>
	</div></div></div>
	   
    <!-- Theme customizer Ends-->
    <!-- BEGIN VENDOR JS-->
    <script src="app-assets/vendors/js/core/jquery-3.2.1.min.js" type="text/javascript"></script>
    <script src="app-assets/vendors/js/core/popper.min.js" type="text/javascript"></script>
    <script src="app-assets/vendors/js/core/bootstrap.min.js" type="text/javascript"></script>
    <script src="app-assets/vendors/js/perfect-scrollbar.jquery.min.js" type="text/javascript"></script>
    <script src="app-assets/vendors/js/prism.min.js" type="text/javascript"></script>
    <script src="app-assets/vendors/js/jquery.matchHeight-min.js" type="text/javascript"></script>
    <script src="app-assets/vendors/js/screenfull.min.js" type="text/javascript"></script>
    <script src="app-assets/vendors/js/pace/pace.min.js" type="text/javascript"></script>
    <!-- BEGIN VENDOR JS-->
    <!-- BEGIN PAGE VENDOR JS-->
    <script src="app-assets/vendors/js/chartist.min.js" type="text/javascript"></script>
    <!-- END PAGE VENDOR JS-->
    <!-- BEGIN APEX JS-->
    <script src="app-assets/js/app-sidebar.js" type="text/javascript"></script>
    <script src="app-assets/js/notification-sidebar.js" type="text/javascript"></script>
    <script src="app-assets/js/customizer.js" type="text/javascript"></script>
    <!-- END APEX JS-->
    <!-- BEGIN PAGE LEVEL JS-->
    <script src="app-assets/js/dashboard1.js" type="text/javascript"></script>
    <!-- END PAGE LEVEL JS-->
  
	
	
</body>
</html>