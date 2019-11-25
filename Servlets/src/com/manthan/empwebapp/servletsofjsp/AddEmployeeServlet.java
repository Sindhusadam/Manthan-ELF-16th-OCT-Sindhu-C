package com.manthan.empwebapp.servletsofjsp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.manthan.empwebapp.beans.EmployeeInfoBean;
import com.manthan.empwebapp.dao.EmployeeDAO;
import com.manthan.empwebapp.dao.EmployeeDAOImpl;
@WebServlet("/addEmp")
public class AddEmployeeServlet extends HttpServlet{
	
	private EmployeeDAO dao = new EmployeeDAOImpl();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	HttpSession session = req.getSession(false);
	
	if(session != null) {
		
			
		//get the form data
		int empId = Integer.parseInt(req.getParameter("empId"));
		String empName = req.getParameter("empName");
		int age = Integer.parseInt(req.getParameter("age"));
		double salary = Double.parseDouble(req.getParameter("salary"));
		long mobile  = Long.parseLong(req.getParameter("mobile"));
		String designation  = req.getParameter("designation");

		EmployeeInfoBean employeeInfoBean = new EmployeeInfoBean();
		
		employeeInfoBean.setEmpId(empId);
		employeeInfoBean.setEmpName(empName);
		employeeInfoBean.setAge(age);
		employeeInfoBean.setSalary(salary);
		employeeInfoBean.setMobile(mobile);
		employeeInfoBean.setDesignation(designation);
		
		if(dao.addEmployee(employeeInfoBean)) {
			req.setAttribute("msg", "Employee added succesfully");
		}else {
			req.setAttribute("msg", "failed to insert emp record");
		}
		req.getRequestDispatcher("/addEmployeeForm").forward(req, resp);

	}else {
		req.setAttribute("msg", "plese login first");
		req.getRequestDispatcher("/loginForm").forward(req, resp);
	}
	
	}

	}
