<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>

<h1>This is Login Page</h1>
<form action="login">

<table>
<tr>
<td>Username:</td>
<td><input type="text" name="username" placeholder="Enter username"></td>
</tr>
<tr>
<td>Password:</td>
<td><input type="text" name="password" placeholder="Enter password"></td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="Login"></td>
</tr>
</table>

Don't have an account?<a href="signup.jsp">signup</a>

</form>

</body>
</html>