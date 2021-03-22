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
					<td><b>Enter Your Name :</b></td>
					<td><input type="text" name="user_name"
						placeholder="Enter Here" required="required" /></td>
				</tr>
				<tr>
					<td><b>Enter Your Email :</b></td>
					<td><input type="email" name="user_email"
						placeholder="XYZ@Gmail.com"  required="required" /></td>
				</tr>
				<tr>
					<td><b>Enter Your Password :</b></td>
					<td><input type="password" name="password"
						placeholder="Enter Here"  required="required" /></td>
				</tr>
				<tr>
					<td><b>Enter Con Password :</b></td>
					<td><input type="password" name="cnpassword"
						placeholder="Enter Here"  required="required" /></td>
				</tr>
				<tr>
					<td><b>Select Gender :</b></td>
					<td><input type="radio" name="user_gender" value="male">
						Male &nbsp; &nbsp; &nbsp; <input type="radio" name="user_gender"
						value="Female"> Female</td>
				</tr>
				<tr>
					<td><b>Select Your Course :</b></td>
					<td><select name="user_course">
							<option value="JAVA">JAVA</option>
							<option value="PHP">PHP</option>
							<option value="PYTHON">PYTHON</option>
							<option value="ANGULAR">ANGULAR</option>
							<option value="JAVA SCRIPT">JAVA SCRIPT</option>
							<option value="SPRING BOOT">SPRING BOOT</option>
							<option value="NODE JS">NODE JS</option>
							<option value="HTML">HTML</option>
							

					</select></td>
				<tr>
					<td style="text-align: right;"><input type="checkbox"
						value="checked" name="condition" /></td>
					<td><b>Agree term and conditions</b></td>
				</tr>
				<tr>
					<td></td>
					<td>
						<button type="submit"><b>Register</b></button>
						<button type="reset"><b>Reset</b></button>
					</td>
				</tr>
			</table>
			
		</form>
		<table align="center">
		<tr>
				<td><a href="index.html"><button type="submit"><b>Login</b></button></a></td>
			</tr>
		</table>

	</div>

</body>
</html>