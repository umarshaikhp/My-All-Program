<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>First Jsp Page</h1>
	<%! 
	int a = 10;
	int b = 20;
	String name = "Aamir khan";

	public int sum() {
		return a + b;
	}

	public String reverse() {
		StringBuffer br = new StringBuffer(name);
		return br.reverse().toString();
	}
	%>
	
	
	<%
	out.println(a);
	out.println("<br>");
	out.println(b);
	out.println("<br>");
	out.println("sum is:"+sum());
	out.println("<br>");
	out.println(reverse());
	out.println("<br>");
	%>
	<h1>sum is: <%=sum() %></h1>
</body>
</html>