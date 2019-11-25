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

<form action="./deleteEmp" method ="get">
<table>
<tr>
<td>emp ID</td>
<td>:</td>
<td><input type="number" name="empId"  required"></td>
</tr>

<input type="submit" name="Delete">


</table>



</form>
</body>
</html>