<!DOCTYPE html>  
<%@page import="com.Bean.BeanClass"%>
<%@page import="java.util.*"%>
<%@page import="com.serviceimple.ServiceImple"%>
<%@page import="com.serviceInter.ServiceInteface"%>
<html>  
<head>  
<meta charset="ISO-8859-1">  
<title>Insert title here</title>  
</head>  
<body>  
  
<h1>Add New Employee</h1>  
<form action="SaveServlet" method="post">  
<table>  
<tr><td>Name:</td><td><input type="text" name="name"/></td></tr>  
<tr><td>Password:</td><td><input type="password" name="password"/></td></tr>  
<tr><td>Email:</td><td><input type="email" name="email"/></td></tr>  
<tr><td>Country:</td><td>  
<select name="country" style="width:150px">  
<option>India</option>  
<option>USA</option>  
<option>UK</option>  
<option>Other</option>  
</select>  
</td></tr>  
<tr><td colspan="2"><input type="submit" value="Save Employee"/></td></tr>  
</table>  
<h1 style="text:align:center" align="center">List Of Data</h1>
<table align="center" border="3">
<tr>
<th>Id</th>
<th>Name</th>
<th>Password</th>
<th>Email</th>
</tr>
<tr>
<%
ServiceInteface sc=new ServiceImple();
BeanClass b=new BeanClass();
List<BeanClass> list=sc.fetch();
Iterator<BeanClass>itr=list.iterator();
while(itr.hasNext()){
b=itr.next();	
%>
</tr>
<tr>
<td><%=b.getId() %></td>
<td><%=b.getName() %></td>
<td><%=b.getPassword() %></td>
<td><%=b.getEmail()%></td>
</tr>
<tr>
<%
}
%>
</tr>
</table>
</form>  
</body>  
</html>  