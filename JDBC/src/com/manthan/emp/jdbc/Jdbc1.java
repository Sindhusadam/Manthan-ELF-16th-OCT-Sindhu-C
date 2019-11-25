package com.manthan.emp.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class Jdbc1 {

	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs =null;


		try {
			//load the driver
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
				
			//get the connection via driver
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/elf_employee_db?user=root&password=root");
			
			//issue sql query
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from employee_info");
			
			//process the result
			while (rs.next()) {
				int empId = rs.getInt("emp_id");
				String name =rs.getString("emp_name");
				int age = rs.getInt("age");
				double salary = rs.getDouble("salary");
				String designation = rs.getString("designation");
				long mobile =rs.getLong("mobile");

				System.out.println("id =" + empId);
				System.out.println("name ="+ name);
				System.out.println("age ="+ age);
				System.out.println("salary ="+ salary);
				System.out.println("mobile ="+ mobile);
				System.out.println("deisgnation ="+ designation);
			}



		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			
				if(rs != null) {
					try {
						rs.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				if(stmt != null) {
					try {
						stmt.close();
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


	}//end of main

}//End of class
