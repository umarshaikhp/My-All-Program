<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${object}
	<form onsubmit="return Payvalidation()" action="send" method="post">
		<table>
			<tr>
				<td>Name:</td>
				<td><input type="text" id="name" name="name"
					required="required"></td>
				<span id="nameError"></span>
			</tr>
			<tr>
				<td>Amount:</td>
				<td><input type="text" id="amount" name="amount"></td>
				<span id="amountError"></span>
			</tr>
			<tr>
				<td>AccountType:</td>
				<td><select name="account_type" id="student">
						<option>AccountType</option>
						<option value="undergraduate">UnderGraduate</option>
						<option value="graduate">Graduate</option>
						<option value="job">Job</option>
				</select></td>
			</tr>
			<tr>
				<td>Date:</td>
				<td><input type="date" name="date"></td>
			</tr>
			<tr>
				<td>RecivedBy</td>
				<td><input type="text" id="recived" name="recivedby"></td>
				<span id="recivedError"></span>
			</tr>
			<tr>
				<td>PaymentType</td>
				<td><select name="paymentmethod" id="type">
						<option>PaymentType</option>
						<option value="cash">Cash</option>
						<option value="online">Online</option>
				</select></td>
			</tr>
			<tr>
				<td><input type="submit" value="Send"></td>
			</tr>
		</table>
	</form>
</body>
<script>
	function Payvalidation() {
		var name1 = document.getElementById('name').value;
		var amount1 = document.getElementById('amount').value;
		var recived1 = document.getElementById('recived').value;

		var namecheck = /^[A-Za-z ]{1,30}$/;
		var amountcheck = /^[0-9.]{1,20}$/;
		var recivedcheck = /^[A-Za-z ]{1,30}$/;

		if (namecheck.test(name1)) {
			document.getElementById('nameError').innerHTML = "";

		} else {
			document.getElementById('nameError').innerHTML = "Invalid Name";
			return false;
		}
		if (amountcheck.test(amount1)) {
			document.getElementById('amountError').innerHTML = "";

		} else {
			document.getElementById('amountError').innerHTML = "Invalid Payment";
			return false;
		}
		if (recivedcheck.test(recived1)) {
			document.getElementById('recivedError').innerHTML = "";

		} else {
			document.getElementById('recivedError').innerHTML = "Invalid ReciverName";
			return false;
		}
	}
</script>
<a href="view">View</a>
</html>
