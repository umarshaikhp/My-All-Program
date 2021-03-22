<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!-- script let tab use for executing java source code -->
	<!-- here is out is the implicit object which is use for printing -->
	<%-- <%String name=request.getParameter("user_name");
	out.print("Welcome "+name);%> --%>

	<!-- expression tag use for print value of variable and method -->
	<!--here is request is an implicit object which is use for get the request  -->
	<%="welcome " + request.getParameter("user_name")%>

	<!-- declaration tag is use for variable and method declaration
	in script let tag we can declare only variables not method...inside the jspService() method...
	in declaration tag we can declare variable and method..outside the jspService() method...
	 -->
	<%!int a = 10;
	int b = 20;

	public int sum() {
		return a + b;
	}%>
	<%
		out.print(a);
	out.print(b);
	out.print(sum());
	%>
	<!-- here out is an implicit object of jspWriter for using print purpose -->
	<%out.print("Date and time is"+java.util.Calendar.getInstance().getTime()); %>
	
	<!-- here response is an implicit object of httpServletResponse
	 use for the send the response to another resources -->
	<%-- <%response.sendRedirect("https://www.google.com/"); %> --%>
</body>
</html>