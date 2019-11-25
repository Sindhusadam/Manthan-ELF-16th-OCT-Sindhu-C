package com.manthan.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class getEmployee2 extends HttpServlet{

	@Override
	
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String empId = req.getParameter("empId");
		
		PrintWriter out = resp.getWriter();
		out.print("<html>");
		out.print("<body>");
		out.print("<h2>Employee "+ empId +"</h2>");
		out.print("Employee Name is = sindhu <br>");
		out.print("salary = 100000 <br>");
		out.print("</body>");
		out.print("</html>");
	
	
	 

	}
	

}
