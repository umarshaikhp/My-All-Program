<%@ page language="java" contentType="text/html; charset=ISO-8859-1"

    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.Random" %>
     <%@ include file="header.jsp"  %>	
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1 style="color:red 	">
<%
	Random r=new Random();
int n=r.nextInt(10);
out.print("Random is:"+n);
%></h1>

</body>
</html>