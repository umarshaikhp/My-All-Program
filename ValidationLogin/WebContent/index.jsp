<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>From Page</title>

<style>
.container {
	width: 31%;
	border: 3px solid black;
	margin: auto;
	padding: 20px;
	font-size: 18px;
	background-color: #82E0AA;
}

#myform table tr td input {
	font-size: 18px;
}
</style>
</head>
<body>
	<div class="container">
		<h1 align="center">My Form</h1>
		<form action="RegisterServlet" method="post" id="myform">
			<table>
				<tr>
					<td><b>Enter Your Email :</b></td>
					<td><input type="email" name="user_email"
						placeholder="XYZ@Gmail.com" required="required" /></td>
				</tr>
				<tr>
					<td><b>Enter Your Password :</b></td>
					<td><input type="password" name="password"
						placeholder="Enter Here" required="required" /></td>
				</tr>
				<tr>
					<td><b>Enter Con Password :</b></td>
					<td><input type="password" name="cnpassword"
						placeholder="Enter Here" required="required" /></td>
				</tr>


				<tr>

					<td>
						<button type="submit">
							<b>Register</b>
						</button>
						<button type="reset">
							<b>Reset</b>
						</button>
					</td>
				</tr>
			</table>

		</form>
		<table align="center">
			<tr>
				<td><a href="index.html"><button type="submit">
							<b>Login</b>
						</button></a></td>
			</tr>
		</table>

	</div>

</body>
</html>