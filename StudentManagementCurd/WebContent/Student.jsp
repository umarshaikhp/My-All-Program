<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>  
<html>  
<head>  
<meta charset="ISO-8859-1">  
<title>Insert title here</title>  
</head>  
<body>  
  
<h1>Add New Student</h1>  
<form action=StudentController method="post">  
<table>  
<tr><td>Name:</td><td><input type="text" name="Name"/></td></tr>  
<tr><td>Address:</td><td><input type="text" name="Address"/></td></tr>  
<tr><td>Email:</td><td><input type="email" name="Email"/></td></tr>  
<tr><td>Age:</td><td><input type="text" name="Age"/></td></tr>  
<tr><td>Mobile_no:</td><td><input type="text" name="Mobile_no"/></td></tr>  

<tr><td colspan="2"><input type="submit" value="Register Student"/></td></tr>  
</table>  
</form>   
  
</body>  
</html>  
