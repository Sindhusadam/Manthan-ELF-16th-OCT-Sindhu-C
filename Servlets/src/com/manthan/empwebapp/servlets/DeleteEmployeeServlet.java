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

@WebServlet("/deleteEmployee")
public class DeleteEmployeeServlet extends HttpServlet{
	
	 EmployeeDAO dao = EmployeeDAOImplManager.getDaoInstance();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.print("<html>");
		out.print("<body>");
		
		HttpSession session = req.getSession(false);
		if (session!= null) {
			
			//get the form data
			int empIdVal = Integer.parseInt(req.getParameter("empId"));
			
			if (dao.deleteEmployee(empIdVal)) {
				out.print("<h2>Record delete succesfully..</h2>");
			}else {
				out.print("<h2>Record not deleted...</h2>");
			}
			
			}else {
				out.print("<h2>plese login first</h2>");
				req.getRequestDispatcher("./loginForm.html").include(req, resp);
			}
			out.print("</html>");
			out.print("</body>");

		}//end of method



}
