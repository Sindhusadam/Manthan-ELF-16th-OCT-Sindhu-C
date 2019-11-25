package com.manthan.empwebapp.dao;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.manthan.empwebapp.beans.EmployeeInfoBean;
import com.manthan.empwebapp.util.EmployeeDAOImplManager;

@WebServlet("/searchEmployee2")
public class searchEmployeeServlet2 extends HttpServlet{

	private EmployeeDAO dao = EmployeeDAOImplManager.getDaoInstance();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int empIdVal = Integer.parseInt(req.getParameter("empId"));

		EmployeeInfoBean emploEmployeeInfoBean =dao.SearchEmployee(empIdVal);

		PrintWriter out =resp.getWriter();
		out.print("<html>");
		out.print("<body>");
		if (emploEmployeeInfoBean!= null) {
			out.print("<h2>Employee Id" + empIdVal + "Found-</h2>");
			out.print("Employee Name" + emploEmployeeInfoBean.getEmpName());
			out.print("<br>Age" + emploEmployeeInfoBean.getAge());
			out.print("<br>salary" + emploEmployeeInfoBean.getSalary());
		}else {
			out.print("<h2 style = 'color: red;'>Employee ID" + empIdVal +"Not Found</h2>");
		}
		out.print("</body>");
		out.print("</html>");
	}//end of doGet()



}//end of class
