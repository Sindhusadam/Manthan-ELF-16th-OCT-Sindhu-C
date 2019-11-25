package com.manthan.empwebapp.servletsofjsp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.manthan.empwebapp.dao.EmployeeDAO;
import com.manthan.empwebapp.dao.EmployeeDAOImpl;
@WebServlet("/deleteEmp")
public class DeleteEmployeeServlet extends HttpServlet{
	
	private EmployeeDAO dao = new EmployeeDAOImpl();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession session = req.getSession(false);
		
		if(session != null) {
            int empIdVal = Integer.parseInt(req.getParameter("empId"));
			
			if (dao.deleteEmployee(empIdVal)) {
				req.setAttribute("msg", "Employee deleted succesfully");
			}else {
				req.setAttribute("msg", "failed to delete emp record");
			}
			req.getRequestDispatcher("/deleteEmployeeForm").forward(req, resp);
			
			}else {
				req.setAttribute("msg", "plese login first");
				req.getRequestDispatcher("/loginForm").forward(req, resp);
			}
			
	}
	

	
}

