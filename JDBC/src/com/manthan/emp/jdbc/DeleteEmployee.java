package com.manthan.emp.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteEmployee {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		int rs =0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee id :");
		int empId = sc.nextInt();

		try {
			Class.forName("com.mysql.jdbc.Driver");

			String dbUrl = "jdbc:mysql://localhost:3306/elf_employee_db";
			con = DriverManager.getConnection(dbUrl, "root", "root");

			String query = "delete from employee_info where emp_id = ?";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, empId);

			rs = pstmt.executeUpdate();

			if (rs>0) {
			System.out.println("deleted");
			}
			else {
				System.out.println("not found");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}finally {

			
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


	}

}
