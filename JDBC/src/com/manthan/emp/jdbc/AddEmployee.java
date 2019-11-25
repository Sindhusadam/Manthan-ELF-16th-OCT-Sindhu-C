package com.manthan.emp.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class AddEmployee {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt =null;

		Scanner sc  =new Scanner(System.in);

		System.out.println("enter emp id :");
		int empId = sc.nextInt();
		sc.nextLine();

		System.out.println("enter name :");
		String name = sc.nextLine();

		System.out.println("enter age :");
		int age = sc.nextInt();

		System.out.println("enter salary :");
		Double salary = sc.nextDouble();
		sc.nextLine();

		System.out.println("enter Designation :");
		String designation = sc.nextLine();

		System.out.println("enter mobile :");
		long mobile = sc.nextLong();

		try {
			//load the driver
			Class.forName("com.mysql.jdbc.Driver");

			//get the connection
			String dbUrl = "jdbc:mysql://localhost:3306/elf_employee_db";
			con = DriverManager.getConnection(dbUrl, "root", "root");

			//issue sql query
			String query = "insert into employee_info values(?,?,?,?,?,?)";
			pstmt =con.prepareStatement(query);
			pstmt.setInt(1, empId);
			pstmt.setString(2, name);
			pstmt.setInt(3, age);
			pstmt.setDouble(4, salary);
			pstmt.setString(5, designation);
			pstmt.setLong(6, mobile);

			int n= pstmt.executeUpdate();

			//process the result
			if (n>0) {
				System.out.println("record inserted succsessfully...");
			}
			else {
				System.out.println("record not inserted");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(sc != null) {
				sc.close();
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

			
		
	}//end of outer try catch finally


}//End of Main

//End of class
