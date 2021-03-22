<!DOCTYPE html>
<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<%@page import="com.bean.BeanClass"%>
<%@page import="com.serviceimple.ServiceImplement"%>
<%@page import="com.serviceinterface.ServiceInterface"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Add New Employee</h1>
	<form action="SaveServlet" method="post">
		<table>
			<tr>
				<td>Name:</td>
				<td><input type="text" name="name" /></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name="password" /></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><input type="email" name="email" /></td>
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
				<td colspan="2"><input type="submit" value="Save Employee" /></td>
			</tr>
			<table align="center" border="7" cellpadding="3">
				<h1 style="text-align: center">
					<p style="color: green;">List of Data</p>
				</h1>
					<tr>
						<th>Id</th>
						<th>Name</th>
						<th>Password</th>
						<th>Email</th>
						<th>Country</th>
					</tr>
					<tr>
						<%
							ServiceInterface sc = new ServiceImplement();

						List<BeanClass> list = sc.fetch();
						BeanClass b = new BeanClass();
						Iterator<BeanClass> itr = list.iterator();

						while (itr.hasNext()) {
							b = itr.next();
						%>
					</tr>
					<tr>
						<td><%=b.getId()%></td>
						<td><%=b.getName()%></td>
						<td><%=b.getPassword()%></td>
						<td><%=b.getEmail()%></td>
						<td><%=b.getCountry()%></td>
                 <td><a href="update.jsp?id=${u.getId()}">Edit</a></td>  
<td><a href="deleteuser.jsp?id=${u.getId()}">Delete</a></td></tr>  

					<tr>
						<%
			}
			%>
					</tr>
				</table>
			</table>
	</form>
</body>
</html>
