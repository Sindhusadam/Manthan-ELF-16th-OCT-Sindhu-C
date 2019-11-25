package com.manthan.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/searchEmployee")

public class SearchEmployeeServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String empIdVal = req.getParameter("empId");
		int empId = Integer.parseInt(empIdVal);

		Connection con =null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		PrintWriter out = resp.getWriter();

		try {
			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/elf_employee_db","root","root");

			String query = "select * from employee_info where emp_id =?";
			pstmt =con.prepareStatement(query);
			pstmt.setInt(1, empId);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				out.print("<html>");
				out.print("<body>");
				out.print("<h2>Employee Id"+ empId +"Found-</h2>");
				out.print("Name  =" + rs.getString("emp_name"));
				out.print("<br>Age  =" + rs.getInt("Age"));
				out.print("<br>Salary  =" + rs.getDouble("Salary"));
				out.print("<br> Designation =" + rs.getString("Designation"));
				out.print("<br>Mobile  =" + rs.getLong("mobile"));
				out.print("<body>");
				out.print("</html>");
				out.close();

			}else {
				System.out.println("empId" + empId + "not Found");

			}

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(rs!= null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if (pstmt!=null) {
					try {
						pstmt.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					if(con!=null) {
						try {
							con.close();
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}
		}


	}



}


