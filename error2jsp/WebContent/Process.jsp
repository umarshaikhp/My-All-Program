<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page errorPage="error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>
<%
String Number1=request.getParameter("Nubmer1");
String Number2=request.getParameter("Number2");
int a=Integer.parseInt(Number1);
int b=Integer.parseInt(Number2);
int c=a/b;
out.println("Devide is:  "+c);
%>
</h1>

</body>
</html>