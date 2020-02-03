<%@page import="com.wcs.app.mvccrud.model.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success Page</title>

<script type="text/javascript">
	function delete_record() {
		alert("delete")
		document.myform.action = "delete"
		document.myform.submit();
	}
	function update_record() {
		alert("update")
		document.myform.action = "edit"
		document.myform.submit();
	}
</script>

</head>
<body>

	<h1 align="center">This is my Success Page</h1>

	<form name="myform">
		<table border="2">
			<tr>
				<th>Eid</th>
				<th>Age</th>
				<th>Name</th>
				<th>Address</th>
				<th>UserName</th>
				<th>Password</th>
			</tr>
			<tr>
				<%
					List<Employee> list = (List) request.getAttribute("data");
					for (Employee emp : list) {
				%>
				<td><input type="radio" name="eid" value="<%=emp.getId()%>"><%=emp.getId()%></td>
				<td><%=emp.getAge()%></td>
				<td><%=emp.getName()%></td>
				<td><%=emp.getAddress()%></td>
				<td><%=emp.getUsername()%></td>
				<td><%=emp.getPassword()%></td>
			</tr>
			<%
				}
			%>
			<tr>
				<td rowspan="2"><input type="button" value="delete"
					onclick="delete_record()"></td>
				<td><input type="button" value="update"
					onclick="update_record()"></td>

			</tr>
		</table>
	</form>


</body>
</html>