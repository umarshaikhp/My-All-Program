<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>From Page</title>

<style>
.container {
	width: 30%;
	border: 3px solid black;
	margin: auto;
	padding: 20px;
	font-size: 18px;
}

#myform table tr td input {
	font-size: 18px;
}
</style>
</head>
<body>
	<div class="container">
		<h1>My Form</h1>
		<form action="RegisterServlet" method="post" id="myform">
			<table>
				<tr>
					<td>Enter Your Name :</td>
					<td><input type="text" name="user_name"
						placeholder="Enter Here" required="required" /></td>
				</tr>
				<tr>
					<td>Enter Your Password :</td>
					<td><input type="password" name="user_password"
						placeholder="Enter Here" required="required" /></td>
				</tr>
				<tr>
					<td>Enter Your Email :</td>
					<td><input type="email" name="user_email"
						placeholder="XYZ@Gmail.com" required="required" /></td>
				</tr>
				<tr>
					<td>Select Gender :</td>
					<td><input type="radio" name="user_gender" value="male">
						Male &nbsp; &nbsp; &nbsp; <input type="radio" name="user_gender"
						value="Female"> Female</td>
				</tr>
				<tr>
					<td>Select Your Course :</td>
					<td><select name="user_course">
							<option value="JAVA">JAVA</option>
							<option value="PHP">PHP</option>
							<option value="PYTHON">PYTHON</option>
							<option value="SPRING">SPRING</option>

					</select></td>
				<tr>
					<td style="text-align: right;"><input type="checkbox"
						value="checked" name="condition" /></td>
					<td>Agree term and conditions</td>
				</tr>
				<tr>
					<td></td>
					<td>
						<button type="submit">Register</button>
						<button type="reset">Reset</button>
					</td>
				</tr>
			</table>
		</form>

	</div>

</body>
</html>