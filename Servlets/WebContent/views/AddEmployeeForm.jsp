<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%String msg = (String)request.getAttribute("msg"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%if(msg != null && !msg.isEmpty()) {%>
<h3><%=msg %></h3>
<%} %>

<form action="./addEmp" method="post">
	<table>
	<tr>
		<td>Emp Id</td>
		<td> : </td>
		<td><input type ="number" name="empId" required"></td>
	</tr>
	<tr>
		<td>Emp Name</td>
		<td> : </td>
		<td><input type ="text" name="empName" required"></td>
	</tr>
	<tr>
		<td>Emp Age</td>
		<td> : </td>
		<td><input type ="number" name="age" required"></td>
	</tr>
	<tr>
		<td>Emp Salary</td>
		<td> : </td>
		<td><input type ="number" name="salary" required"></td>
	</tr><tr>
		<td>Emp Designation</td>
		<td> : </td>
		<td><input type ="text" name="designation" required"></td>
	</tr>
	<tr>
		<td>Emp Mobile</td>
		<td> : </td>
		<td><input type ="number" name="mobile" required"></td>
	</tr>
			</table>
			
			<input type="submit" name="add">
	</form>
</body>
</html>