package com.manthan.emp.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateEmployee {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter employee id :");
		int empId = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter name :");
		String emp = sc.nextLine();

		try {
			Class.forName("com.mysql.jdbc.Driver");

			String dbUrl = "jdbc:mysql://localhost:3306/elf_employee_db";
			con = DriverManager.getConnection(dbUrl, "root", "root");

			String query = "update employee_info set emp_name = ? where emp_id =?";
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, emp);
			pstmt.setInt(2, empId);

			int n = pstmt.executeUpdate();

			if (n>0) {
				System.out.println("updated");
			}else {
				System.out.println("not updated");
			}
		}
		catch (Exception e) {
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
