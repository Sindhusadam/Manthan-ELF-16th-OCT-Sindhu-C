<%@page import="com.manthan.empwebapp.beans.EmployeeInfoBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <% EmployeeInfoBean employeeInfoBean = (EmployeeInfoBean)session.getAttribute("employeeInfoBean"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <h3 style="color: navy;">Hello <%=employeeInfoBean.getEmpName() %>!</h3>
  <a href="./search">Search Employee</a><br>
  <a href="./addEmployeeForm">Add Employee</a><br>
  <a href="./updateEmployeeForm">Update Employee</a><br>
  <a href="./deleteEmployeeForm">Delete Employee</a><br>
  <a href="./seeAllEmployees">See All Employees</a>
  <br>
  <a href="./logout">Logout</a><br>
  
</body>
</html>