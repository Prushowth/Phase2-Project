<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
.myDiv {
  padding: 5px;
  border: 20px outset pink;
  background-color: light blue;
  text-align: center;
  margin: auto;
  width: 60%;

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

<div class="myDiv">
<br>
  <h3>User Login</h3>

<form name ="User login page" action="loginservlet" method ="post">
<b>USERNAME: </b><input type="text" name="username" id = "name" placeholder="Please enter your username"><br><br>
<b>PASSWORD: </b><input type="password" name="password" id ="pwd" placeholder="Please enter your password"><br><br>
<input type="submit" value="Login"><br><br>
</form>

</div>
<br><br><br>



</body>
</html>