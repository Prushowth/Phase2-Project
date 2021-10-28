<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="com.Student" %>
<%@ page import="java.sql.*"%>
<%@ page import="javax.sql.*"%>
<%@page import="java.util.*"%>
<%@ page isELIgnored="false" %>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Class details</title>

<style>
.myDiv {
  padding: 5px;
  border: 20px outset pink;
  background-color: light blue;
  text-align: center;
  margin: auto;
  width: 60%;

  align-items: center;

}
body {
background-image: url("image1.png");
background-repeat: no-repeat;
background-color: light blue;
}
</style>
</head>

<body background="image1.png">
<h6>Developed by Prushowthaman Natarajan</h6>
<h2>Welcome to Learners Academy</h2>


<div class="myDiv" >
<h3> Details of class ${classno}: </h3>

<h3> Student details </h3>
<table border="1" >
<thead>
<tr>
<td>ID</td>
<td>Student Name</td>
<td>Admission No.</td>
<td>Class</td>
</tr>
</thead>
<c:forEach items="${student}" var="element"> 
<tr>
<td>${element.id}</td>
<td>${element.stu_name}</td>
<td>${element.adm_no}</td>
<td>${element.class_id} </td>
</tr>
</c:forEach>
</table>
<br>

<h3> Subject and Teacher details </h3>
<table border="1" >
<thead>
<tr>
<td>ID</td>
<td>Subject Name</td>
<td>Class</td>
<td>Teacher</td>
</tr>
</thead>
<c:forEach items="${subject}" var="element"> 
<tr>
<td>${element.id}</td>
<td>${element.subject}</td>
<td>${element.class_id} </td>
<td>${element.teacher}</td>
</tr>
</c:forEach>
</table>

<form action="dash.jsp" >
<input type="submit" value="Back"><br>
</form>

</div>
<br><br><br>


</body>
</html>


</body>
</html>