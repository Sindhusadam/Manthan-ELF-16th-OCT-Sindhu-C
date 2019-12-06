<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%  String addedMsg=(String)request.getAttribute("registeredMsg");%>     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% if(addedMsg!=null) { %>
<%= addedMsg %>
<% } %>

<form action="./register" method="post">
<div>
<label>User ID</label>
<input type="number" name="userid" required="required">
</div>
<br>
<div>
<label>User Name</label>
<input type="text" name="username" required="required">
</div>
<br>
<div>
<label>Email</label>
<input type="email" name="emailid" required="required">
</div>
<br>
<div>
<label>Password</label>
<input type="password" name="password" required="required">
</div>
<br>

<input type="submit" value="submit">
</form>
</body>
</html>