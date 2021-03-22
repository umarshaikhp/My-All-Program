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
	<form action="success" method="get">
		<h1>payment successfully</h1>
		<a href="http://localhost:8181/InwardPayment/">Add More</a> <a
			href="http://localhost:8181/InwardPayment/view">View</a> 
			</form>
			<form action="checkview" method="get">
			<div class="small-3 columns">
          <input type="text" id ="txt" name="searchString" >
       </div>
			
			<div class="small-5 columns end">
          <button id="button-id" type="submit">Search Teams</button>
       </div>
			
			<div>
           ${keyword}
            ${listProducts.payment_id}
       </div>
	</form>

</body>
</html>
