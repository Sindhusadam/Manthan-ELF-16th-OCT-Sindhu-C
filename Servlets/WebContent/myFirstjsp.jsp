<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%!
    public void jspInit(){
    	System.out.println("inside jspInit()....");
    }
    
    public void jspDestroy(){
    	System.out.println("inside destroy()....");
    }
    
    %>
    <%
    System.out.println("inside -jspService...");
    //java code to generate dynamic date
    

     Date dateref = new Date();
  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Current system date & time-
<%=dateref %>
</h2>

</body>
</html>