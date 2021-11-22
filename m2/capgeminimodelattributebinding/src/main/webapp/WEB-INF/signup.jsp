<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to SignUp Registration Page</h1>
<form:form action="submitsignup" modelAttribute="u" >
	Enter your name:<form:input type="text" path="userName"></form:input><br><br>
	Select Gender: 
	<form:radiobutton path="userGender" value="Male"></form:radiobutton>Male
	<form:radiobutton path="userGender" value="Female"></form:radiobutton>Female<br><br>
	Enter the password:<form:input type="password" path="userPassword"></form:input><br><br>
	Enter your Email:<form:input type="email" path="userEmail"></form:input><br><br>
	Enter your phone:<form:input type="number" path="userPhone"></form:input><br><br>
	Enter your Address:<form:textarea rows="5" cols="25" path="userAddress"></form:textarea><br><br>
	Select your city:
		<form:select path="userCity">
			<option value="Chennai">Chennai</option>
			<option value="Chennai">Mumbai</option>
			<option value="Chennai">Kolkatta</option>
			<option value="Chennai">Nellore</option>
			<option value="Chennai">Metrocity</option>
		</form:select><br><br>
	<input type="submit">
	<input type="reset"> 
</form:form>
</body>
</html>