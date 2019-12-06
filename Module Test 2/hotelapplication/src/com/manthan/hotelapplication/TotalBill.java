package com.manthan.hotelapplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.jdbc.Driver;

public class TotalBill {

	public void total() {

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter item code :");
		int itemCode = sc.nextInt();
		sc.nextLine();

		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);

			//get the connection via driver
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_db?user=root&password=root");

			String query = "select sum(Price) from hotel_bill where item_code = ?";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, itemCode);

			rs = pstmt.executeQuery();

			double cost = rs.getDouble("sum(Price)");
			System.out.println("cost ="+ cost);

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
