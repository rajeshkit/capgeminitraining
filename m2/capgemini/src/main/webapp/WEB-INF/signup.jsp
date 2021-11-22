<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to SignUp Registration Page</h1>
<form action="submitsignup">
	Enter your name:<input type="text" name="username"><br><br>
	Select Gender: <input type="radio" name="usergender" value="Male">Male
	<input type="radio" name="usergender" value="Female">Female<br><br>
	Enter the password:<input type="password" name="userpassword"><br><br>
	Enter your Email:<input type="email" name="useremail"><br><br>
	Enter your phone:<input type="number" name="userphone"><br><br>
	Enter your Address:<textarea rows="5" cols="25" name="useraddress"></textarea><br><br>
	Select your city:
		<select name="usercity">
			<option value="Chennai">Chennai</option>
			<option value="Chennai">Mumbai</option>
			<option value="Chennai">Kolkatta</option>
			<option value="Chennai">Nellore</option>
			<option value="Chennai">Metrocity</option>
		</select><br><br>
	<input type="submit">
	<input type="reset"> 
</form>
</body>
</html>