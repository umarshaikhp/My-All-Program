<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ page errorPage="error.jsp" %>
	<h1>
		<%!int a = 200;
	int b = 0;%>
		<%
	int divide=a/b;			
		%>
		<%="Divide is "+divide %>
	</h1>

</body>
</html>