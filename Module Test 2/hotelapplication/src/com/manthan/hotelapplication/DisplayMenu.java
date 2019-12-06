package com.manthan.hotelapplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class DisplayMenu {

	public void displayMenu(){

		Connection con = null;
		Statement stmt = null;
		ResultSet rs =null;


		try {
			//load the driver
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
				
			//get the connection via driver
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_db?user=root&password=root");
			
			//issue sql query
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from hotel_bill");
			
			//process the result
			while (rs.next()) {
				int item_code = rs.getInt("item_code");
				String name =rs.getString("food_name");
				double cost = rs.getInt("price");
				
				System.out.println("item code = " + item_code);
				System.out.println("name ="+ name);
				System.out.println("cost ="+ cost);
		
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
