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
	<%if(msg!=null) { %>
	<%=msg %>
	<%} %>
	<fieldset>
		<legend>Employee Login</legend>

		<form action="./login2" method="post">
			<table>
				<tr>
					<td>Employee ID</td>
					<td><input type="text" name="empId" required></td>
				</tr>

				<tr>
					<td>Password</td>
					<td><input type="password" name="password" required></td>
				</tr>

				<tr>
					<td colspan="3"><br /> <input type="submit" value="Login"></td>
				</tr>

			</table>
	</fieldset>

	</form>
</body>
</html>