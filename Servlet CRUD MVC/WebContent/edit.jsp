<%@page import="com.wcs.app.mvccrud.model.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Page</title>
</head>
<body>

<h1>This Is My Edit Page</h1>
<form action="updatedb">
<%Employee emp=(Employee) request.getAttribute("details"); %>


<input type="hidden" name="editid" value="<%=emp.getId()%>"><br>
Age:<input type="text" name="age" value="<%=emp.getAge()%>"><br>
Name<input type="text" name="ename" value="<%=emp.getName()%>"><br>
Address:<input type="text" name="address" value="<%=emp.getAddress()%>"><br>
Username:<input type="text" name="uname" value="<%=emp.getUsername()%>"><br>
Password:<input type="text" name="passwd" value="<%=emp.getPassword()%>"><br>

<input type="submit" value="UpdateData">
</form>
</body>
</html>