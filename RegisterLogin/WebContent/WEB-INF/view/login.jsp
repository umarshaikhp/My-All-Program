<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  <%@include file="./base.jsp" %>
  <%@page isELIgnored="false" %>
  
</head>
<body>

<div class="container">
  <h2 align="center">Registeration Data</h2>
  <p></p>
  <table class="table">
    <thead class="thead-dark">
      <tr>
      <th>Id</th>
        <th scope="col">Firstname</th>
        <th scope="col">Lastname</th>
        <th scope="col">Father Name</th>
        <th scope="col">Age</th>
        <th scope="col">Address</th>
        <th scope="col">Email</th>
        <th scope="col">Password</th>
        <th scope="col">Confirm Password</th>
        <th scope="col">Action</th>
      </tr>
    </thead>
   <tbody>
   <c:forEach items="${register1}" var="r">
    <tr>
    <td scope="row"> ${r.id}</td>
    <td>${r.firstName}</td>
    <td>${r.lastName}</td>
    <td>${r.fatherName}</td>
    <td>${r.age}</td>
    <td>${r.address}</td>
    <td>${r.email}</td>
    <td>${r.password}</td>
    <td>${r.confirmPassword}</td>
 <td>
    <a href="${pageContext.request.contextPath}/delete/${r.id }">delete</a>
    <a href="${pageContext.request.contextPath}/update${r.id}">update</a>
    
    </td>
    </tr>
   </c:forEach>
   </tbody>
  
  </table>
</div>
<div class="container text-center">
 <a href="logout"><input type="button" value="logout"></a>
</div>
</body>
</html>

    