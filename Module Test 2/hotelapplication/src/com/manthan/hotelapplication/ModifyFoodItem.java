package com.manthan.hotelapplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.jdbc.Driver;

public class ModifyFoodItem {

	public  void modifyItem() {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter item code :");
		int itemCode = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter item name :");
		String itemName = sc.nextLine();
		
		try {
			
			Driver driver = new Driver();//register driver
			DriverManager.registerDriver(driver);

			//get the connection
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_db?user=root&password=root");


			String query = "update hotel_bill set food_name = ? where item_code =?";
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, itemName);
			pstmt.setInt(2, itemCode);

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
