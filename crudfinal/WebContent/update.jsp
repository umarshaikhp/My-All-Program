<%@page import="com.serviceimple.ServiceImplement"%>
<%@page import="com.serviceinterface.ServiceInterface"%>
<%@page import="com.bean.BeanClass"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%@page import="com.serviceimple.ServiceImplement,com.bean.BeanClass"%>  
<%  
String Id=request.getParameter("id");  

ServiceInterface s=new ServiceImplement();
BeanClass u=s.getEmployeeById(Integer.parseInt(Id)); 
%> 

	<h1>update Employee</h1>
	<form action="UpdateController" method="post">
		<table>
		<tr>
           <td>Employee ID</td>
           <td><input type="hidden" name="id"  value="<%=u.getId()%>"></td>
       </tr>
			<tr>
				<td>Name:</td>
				<td><input type="text" name="name"  value="<%=u.getName() %>"/></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name="password"  value="<%=u.getPassword() %>"/></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><input type="email" name="email" value="<%=u.getEmail() %>" /></td>
			</tr>
			<tr>
				<td>Country:</td>
				<td><select name="country" style="width: 150px">
						<option>INDIA</option>
						<option>USA</option>
						<option>UK</option>
						<option>Other</option>
				</select></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Update" /></td>
			</tr>
	
				
			</table>
	</form>
</body>
</html>
