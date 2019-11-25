package com.manthan.empwebapp.servlets;

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
import com.manthan.empwebapp.util.EmployeeDAOImplManager;
@WebServlet("/addEmployee")

public class addEmployeeSevlet extends HttpServlet{

	EmployeeDAO dao = EmployeeDAOImplManager.getDaoInstance();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.print("<html>");
		out.print("<body>");
		
		HttpSession session = req.getSession(false);
		if (session!= null) {
			EmployeeInfoBean bean = (EmployeeInfoBean) session.getAttribute("employeeInfoBean");
			
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


		if (dao.addEmployee(employeeInfoBean)) {
			out.print("<h2>Record inserted succesfully..</h2>");
			out.print("<h3>Thanks"+bean.getEmpName() +"to add record");
		}else {
			out.print("<h2>sorry" + bean.getDesignation() + ",unable to add record</h2>");
		}
		
		}else {
			out.print("<h2>plese login first</h2>");
			req.getRequestDispatcher("./loginForm.html").include(req, resp);
		}
		out.print("</html>");
		out.print("</body>");

	}//end of method

}//end of class
