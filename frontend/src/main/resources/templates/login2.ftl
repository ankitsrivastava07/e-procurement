<!doctype html>
<html lang="en">
  <head>
  	<title>Login</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

	<link href="https://fonts.googleapis.com/css?family=Lato:300,400,700&display=swap" rel="stylesheet">

	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
	<link rel="stylesheet" href="css/style.css">
<script src="js/jquery.min.js"></script>
  <script src="login-form/js/popper.js"></script>
  <script src="login-form/js/bootstrap.min.js"></script>
  <script src="login-form/js/main.js"></script>
<script src="js/validate.js"></script>
<script src="js/jquery.cookie.js"></script>
<script src="/js/modal/login.js"></script>
	</head>
	<style>
	
	.error{
    font-size: 14px;
    color: #da534d;
    padding: 3px 0px;
}


.form-control{
display: block;
    width: 100%;
    padding: .375rem .75rem;
    font-size: 1rem;
    font-weight: 400;
    line-height: 1.5;
    color: #495057;
    background-color: #fff;
    background-clip: padding-box;
    border: 1px solid #ced4da;
}

.alert-danger{
background-color: #fdf6f6;
    border-color: #de7575;
    color: #c20707;
}

.alert{
    padding: 10px;
    /* margin-bottom: 20px; */
    /* border: 1px solid transparent; */
    border-radius: 4px;
    text-size-adjust: auto;
    font-size: 14px;
    text-align: center;
}

	</style>
	
	<body>
<form id="login-form" method="post" name="login-form">
	<section class="ftco-section">
		<div class="container">
			<div class="row justify-content-center">
				<div class="col-md-6 text-center mb-5">
				</div>
			</div>
			<div class="row justify-content-center">
				<div class="col-md-7 col-lg-5">
					<div class="login-wrap p-4 p-md-5">
		      	<div class="icon d-flex align-items-center justify-content-center">
		      		<span class="fa fa-user-o"></span>
		      	</div>
		      	<h3 class="text-center mb-4">Login</h3>
			<div class="modal-body" id="modal-body">
		      		<div class="form-group">
		      		<label for="recipient-name" class="col-form-label">Email ID / Username </label>
		      			<input type="text" class="form-control rounded-left" maxlength="100" name="userName" id="userName" autocomplete=off Placeholder="Enter your email/username">
		      		</div>
	            <div class="form-group">
	            <label for="recipient-name" class="col-form-label">Password</label>
	              <input type="password" class="form-control rounded-left" maxlength="20" name="password" id="password" Placeholder="Enter your password">
	            </div>
	            <div class="form-group">
	            	<button type="submit" class="form-control btn btn-primary rounded submit px-3">Login</button>
	            </div>
	            <div class="form-group d-md-flex">
	            	<div class="w-50">
	            		<label class="checkbox-wrap checkbox-primary">Remember Me
									  <input type="checkbox" checked>
									  <span class="checkmark"></span>
									</label>
								</div>
								<div class="w-50 text-md-right">
									<a href="#">Forgot Password</a>
								</div>
	            </div>
	          </form>
	        </div>
				</div>
			</div>
		</div>
		</div>
	</section>
	</body>
</html>

