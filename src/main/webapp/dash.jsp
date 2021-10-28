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
background-color: red;
}
</style>
</head>

<body background="image1.png">
<h6>Developed by Prushowthaman Natarajan</h6>
<h2 text-align:center>Welcome to Learners Academy</h2>

<div class="myDiv">
<br>
  <h3>Choose below for the details</h3>

<label for="class">Choose the class:</label>
<form name ="detail" action="mainservlet" method = "post">
<select name="class" id="class">
<option value="none" selected disabled hidden>Choose the Class</option>
  <option value="8">8th Standard</option>
  <option value="9">9th Standard</option>
  <option value="10">10th Standard</option>
</select>
<br>
<br>
<input type="submit" value="Select">
</form>

</div>
<br><br><br>



</body>
</html>
