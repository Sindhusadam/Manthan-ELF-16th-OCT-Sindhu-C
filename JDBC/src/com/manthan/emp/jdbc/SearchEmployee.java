package com.manthan.emp.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.Scanner;


public class SearchEmployee {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs =null;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee id :");
		int empId = sc.nextInt();

		try {
			//load driver
			Class.forName("com.mysql.jdbc.Driver");
//establish connection
			String dbUrl = "jdbc:mysql://localhost:3306/elf_employee_db";
			con = DriverManager.getConnection(dbUrl, "root", "root");

			String query = "select * from employee_info where emp_id = ?";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, empId);

			rs = pstmt.executeQuery();

			if (rs.next()) {
				System.out.println("Employee id Found...");
				System.out.println("name = " + rs.getString("emp_name"));
				System.out.println("salary = " + rs.getDouble("salary"));
			}
			else {
				System.out.println("not found");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}finally {

			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

		}//end of outer try catch finally


	}// End of main

}//End of class
