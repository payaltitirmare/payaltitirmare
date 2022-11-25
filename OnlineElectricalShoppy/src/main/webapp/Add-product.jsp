<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0, minimal-ui">
    <meta name="description" content="Apex admin is super flexible, powerful, clean &amp; modern responsive bootstrap 4 admin template with unlimited possibilities.">
    <meta name="keywords" content="admin template, Apex admin template, dashboard template, flat admin template, responsive admin template, web app">
    <meta name="author" content="PIXINVENT">
    <title>Basic DataTables - Apex responsive bootstrap 4 admin template</title>
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
    <link rel="stylesheet" type="text/css" href="app-assets/vendors/css/tables/datatable/datatables.min.css">
    <!-- END VENDOR CSS-->
    <!-- BEGIN APEX CSS-->
    <link rel="stylesheet" type="text/css" href="app-assets/css/app.css">
    <!-- END APEX CSS-->
    <!-- BEGIN Page Level CSS-->
    <!-- END Page Level CSS-->
    <!-- BEGIN Custom CSS-->
    <!-- END Custom CSS-->
  </head>
  
<body data-col="2-columns" class=" 2-columns ">
 
  <div class="wrapper nav-collapsed menu-collapsed">
  
<%@include file="Asidebar.jsp" %>

<%@include file="Navbar.jsp" %>
  <div class="main-panel">
        <div class="main-content">
          <div class="content-wrapper">
          
             <!-- Basic form layout section start -->
<section id="basic-form-layouts">
<div class="row justify-content-md-center">
		<div class="col-md-6">
			<div class="card">
				<div class="card-header">
					<h4 class="card-title" id="basic-layout-card-center"> Add New Product </h4>
					</div>
				<div class="card-body">
					<div class="px-3">
						<form class="form">
							<div class="form-body">

								<div class="form-group">
									<label for="eventRegInput1">Enter Product Name </label>
									<input type="text" id="eventRegInput1" class="form-control"  name="p_name">
								</div>
								
								<div class="form-group">
									<label for="eventRegInput1">Enter Product description </label>
									<textarea id="donationinput7" rows="5" class="form-control square" name="p_price" ></textarea>
								</div>
								
								<div class="form-group">
									<label for="eventRegInput1">Enter Product Price </label>
								    <input type="text" id="eventRegInput1" class="form-control"  name="p_name">
								</div>
								
								<div class="form-group">
									<label for="eventRegInput1">Enter Product Discount </label>
								    <input type="text" id="eventRegInput1" class="form-control"  name="p_name">
								</div>
								
								<div class="form-group">
									<label for="eventRegInput1">Enter Product Quntity </label>
								    <input type="text" id="eventRegInput1" class="form-control"  name="p_name">
								</div>
								
								<!-- this dropdown for selecting product 
								<div class="form-group">
									<select >
									<option> </option>
									
									</select>
								</div>
								 -->
								
								<div class="form-group">
									<label for="eventRegInput1">Select Product Image </label>
								<input type="file" id="eventRegInput1" class="form-control"  name="p_image" />
								</div>
								</div>
								
							<div class="form-actions center">
								<button type="button" class="btn btn-raised btn-warning mr-1">
									<i class="ft-x"></i> Cancel
								</button>
								<button type="submit" class="btn btn-raised btn-primary">
									<i class="fa fa-check-square-o"></i>Add Product
								</button>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	
</section>
     
<section id="shopping-cart">
    <div class="row">
        <div class="col-sm-12">
            <div class="card">
                <div class="card-header">
                    <h4 class="card-title">Shopping Cart</h4>
                </div>
                <div class="card-body">
                    <div class="card-block">
                        <table class="table table-responsive-md text-center">
                            <thead>
                                <tr>
                                
                                    <th>Image</th>
                                    <th>Description</th>
                                    <th>Weight</th>
                                    <th>Price</th>
                                    <th>Quantity</th>
                                    <th>Amount</th>
                                    <th>Delete</th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <td><img class="media-object round-media" src="app-assets/img/elements/01.png" alt="Generic placeholder image" style="height: 75px;"></td>
                                    <td>Product 1</td>
                                    <td>38.9 Ounce</td>
                                    <td>$9.97</td>
                                    <td>
                                        2
                                        <div class="btn-group ml-1">
                                            <a class="btn btn-info btn-raised font-medium-5" href="javascript:void(0)">-</a>
                                            <a class="btn btn-info btn-raised font-medium-5" href="javascript:void(0)">+</a>
                                        </div>
                                    </td>
                                    <td>$19.94</td>
                                    <td>
                                        <a class="danger" data-original-title="" title="">
                                            <i class="ft-trash font-medium-3"></i>
                                        </a>
                                    </td>
                                </tr>
                                <tr>
                                    <td><img class="media-object round-media" src="app-assets/img/elements/07.png" alt="Generic placeholder image" style="height: 75px;"></td>
                                    <td>Product 2</td>
                                    <td>15.9 Ounce</td>
                                    <td>$6.00</td>
                                    <td>
                                        2
                                        <div class="btn-group ml-1">
                                            <a class="btn btn-info btn-raised font-medium-5" href="javascript:void(0)">-</a>
                                            <a class="btn btn-info btn-raised font-medium-5" href="javascript:void(0)">+</a>
                                        </div>
                                    </td>
                                    <td>$12.00</td>
                                    <td>
                                        <a class="danger" data-original-title="" title="">
                                           <i class="ft-trash font-medium-3"></i>
                                        </a>
                                    </td>
                                </tr>
                                <tr>
                                    <td><img class="media-object round-media" src="app-assets/img/elements/11.png" alt="Generic placeholder image" style="height: 75px;"></td>
                                    <td>Product 3</td>
                                    <td>20.9 Ounce</td>
                                    <td>$15.78</td>
                                    <td>
                                        1
                                        <div class="btn-group ml-1">
                                            <a class="btn btn-info btn-raised font-medium-5" href="javascript:void(0)">-</a>
                                            <a class="btn btn-info btn-raised font-medium-5" href="javascript:void(0)">+</a>
                                        </div>
                                    </td>
                                    <td>$15.78</td>
                                    <td>
                                        <a class="danger" data-original-title="" title="">
                                           <i class="ft-trash font-medium-3"></i>
                                        </a>
                                    </td>
                                </tr>
                                <tr>
                                    <td><img class="media-object round-media" src="app-assets/img/elements/14.png" alt="Generic placeholder image" style="height: 75px;"></td>
                                    <td>Product 4</td>
                                    <td>90 Ounce</td>
                                    <td>$24.51</td>
                                    <td>
                                        3
                                        <div class="btn-group ml-1">
                                            <a class="btn btn-info btn-raised font-medium-5" href="javascript:void(0)">-</a>
                                            <a class="btn btn-info btn-raised font-medium-5" href="javascript:void(0)">+</a>
                                        </div>
                                    </td>
                                    <td>$73.53</td>
                                    <td>
                                        <a class="danger" data-original-title="" title="">
                                           <i class="ft-trash font-medium-3"></i>
                                        </a>
                                    </td>
                                </tr>
                                <tr>
                                    <td></td>
                                    <td></td>
                                    <td></td>
                                    <td></td>

                                    <td><b>Total</b></td>
                                    <td><b>$101.31</b></td>
                                    <td></td>
                                </tr>
                                <tr>
                                    <td></td>
                                    <td></td>
                                    <td></td>
                                    <td></td>
                                    <td></td>
                                    <td></td>
                                    <td><button class="btn btn-success btn-raised">Continue</button> </td>
                                </tr>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>


</div>
</div>
</div>
</div>
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
    <script src="app-assets/vendors/js/datatable/datatables.min.js" type="text/javascript"></script>
    <!-- END PAGE VENDOR JS-->
    <!-- BEGIN APEX JS-->
    <script src="app-assets/js/app-sidebar.js" type="text/javascript"></script>
    <script src="app-assets/js/notification-sidebar.js" type="text/javascript"></script>
    <script src="app-assets/js/customizer.js" type="text/javascript"></script>
    <!-- END APEX JS-->
    <!-- BEGIN PAGE LEVEL JS-->
    <script src="app-assets/js/data-tables/datatable-basic.js" type="text/javascript"></script>
    <!-- END PAGE LEVEL JS-->

<!--/ Zero configuration table -->

</body>
</html>