package com.manthan.hotelapplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.jdbc.Driver;

public class DeleteFoodItem {

	public void deleteItem() {

		Connection con = null;
		PreparedStatement pstmt = null;
		int rs = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter item code:");
		int Item_Code = sc.nextInt();
		
		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_db?user=root&password=root");
			

			String query = "delete from hotel_bill where item_code = ?";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, Item_Code);

			rs = pstmt.executeUpdate();

			if (rs>0) {
				System.out.println("item deleted");
			}
			else {
				System.out.println(" item not found");
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
