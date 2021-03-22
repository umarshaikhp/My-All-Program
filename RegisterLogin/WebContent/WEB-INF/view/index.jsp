<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@include file="./base.jsp"%>
</head>
<body>
	<div class="container mt-3">

		<div class="row">
			<div class="col-md-6 offset-md-3">

				<h1 class="text-center mb-3">Register Or Login</h1>


				<form action="login" method="post" modelAttribute="register">


					<div class="form-group">
						<label for="email">Email</label> <input type="email"
							class="form-control" id="email" name="email" autocomplete="off">
					</div>


					<div class="form-group">
						<label for="password">Password</label> <input type="password"
							class="form-control" id="password" name="password"
							autocomplete="off">
					</div>


					<div class="container text-center">

						<a href="login.jsp"><input type="submit" id="login" value="login"
							class="btn btn-primary" /> </a><br> 
							



					</div>
			</form>
			<form action="#"></form>
			<div class="container text-center" >
			<a href="register-form"><input
			type="submit"  value="register" class="btn btn-primary" /></a>
			
			</div>
		</div>
	</div>

</body>
</html>