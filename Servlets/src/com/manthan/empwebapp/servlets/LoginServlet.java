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
@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	EmployeeDAO dao = EmployeeDAOImplManager.getDaoInstance();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


		int empId = Integer.parseInt(req.getParameter("empId"));
		String password = req.getParameter("password");

		EmployeeInfoBean employeeInfoBean =dao.authenticate(empId, password);

		PrintWriter out =resp.getWriter();
		out.print("<html>");
		out.print("<body>");

		if (employeeInfoBean!= null) {

			HttpSession session = req.getSession(true);
			session.setAttribute("employeeInfoBean", employeeInfoBean);
			session.setMaxInactiveInterval(30);  


			out.print("<h2>Welcome" + employeeInfoBean.getEmpName()+ "</h2>");
			out.print("<a href='./addEmployee.html'>Add new Employee</a><br>");
			out.print("<a href='./searchEmployee.html'>search Employee</a><br>");
			out.print("<a href='#'>Update Employee</a><br>");
			out.print("<a href='./deleteEmployee.html'>delete Employee</a><br>");
			out.print("<a href='./logout'>Logout</a>");


		}	else {
			out.print("Invalid Credentials...<br>");
			req.getRequestDispatcher("./loginForm.html").include(req, resp);
		}
		out.print("</body>");
		out.print("</html>");

	}//end of method()

}//end of class
