<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Payment</title>
</head>
<body>
	<h1>Payment List</h1>
	<table border="2" width="70%">
		<tr>
			<th>Payment_Id</th>
			<th>Name</th>
			<th>Amount</th>
			<th>Account_Type</th>
			<th>Date</th>
			<th>Recived_By</th>
			<th>PaymentMethod</th>
		</tr>
		<c:forEach items="${payment}" var="pay">

			<tr>
				<td>${pay.payment_id}</td>
				<td>${pay.name}</td>
				<td>${pay.amount}</td>
				<td>${pay.account_type}</td>
				<td>${pay.date}</td>
				<td>${pay.recivedby}</td>
				<td>${pay.paymentmethod}</td>
			</tr>
		</c:forEach>
	</table>


</body>
</html>