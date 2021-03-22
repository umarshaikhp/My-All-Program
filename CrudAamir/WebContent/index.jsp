<%@page import="com.bean.BeanClass,java.util.*"%>
<%@page import="com.serviceimpl.ServiceImpliment"%>
<%@page import="com.service.ServiceInterface"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Add New Employee</h1>  
<form action="ServletController" method="post">  
<table>  
<tr><td>Name:</td><td><input type="text" name="name"/></td></tr>  
<tr><td>Age:</td><td><input type="text" name="age"/></td></tr>  
<tr><td>Address:</td><td><input type="text" name="address"/></td></tr>  
<tr><td>Mobile_Number:</td><td><input type="text" name="mobile_number"/></td></tr>  
<tr><td>Country:</td><td>  
<select name="country" style="width:150px">  
<option>India</option>  
<option>USA</option>  
<option>UK</option>  
<option>Other</option>  
</select>  
</td></tr></table>  
<table  align="center" border="7" cellpadding="3">
			<h1 style="text-align: center"><p style="color:#21421e;">List of Data</p></h1>
<tr>
<th>Id</th>
<th>name</th>
<th>age</th>
<th>address</th>
<th>mobile_number</th>
</tr>
<tr>
<%
ServiceInterface sc=new ServiceImpliment();
BeanClass e=new BeanClass();
List<BeanClass> list=sc.fetch();
Iterator <BeanClass> itr=list.iterator();
while(itr.hasNext()){
	e=itr.next();
%>
</tr>
<tr>
<td><%=e.getId()%></td>
<td><%=e.getName() %></td>
<td><%=e.getAge() %></td>
<td><%=e.getAddress() %></td>
<td><%=e.getMobile_number() %></td>
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