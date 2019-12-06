<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%String msg = (String)request.getAttribute("msg"); %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login page</title>
</head>
<body>
<%if(msg!=null) { %>
	<%=msg %>
	<%} %>
<fieldset>
<form action="./login" method="post">
<table>
<tr>
<td>Email</td>
<td><input type="email" name="emailID" required></td>
</tr>

<tr>
<td>Password</td>
<td><input type="password" name="password" required></td>
</tr>

<br>

<tr>
<td><input type="submit" value="Login"></td>
</tr>
</table>
</form>
</fieldset>
</body>
</html>