package com.manthan.hotelapplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.jdbc.Driver;


public class AddFoodItem {

	public  void addItem() {

		Connection con = null;
		PreparedStatement pstmt = null;

		Scanner sc = new Scanner(System.in);

		System.out.println("enter Item_Code :");
		int Item_Code = sc.nextInt();
		sc.nextLine();

		System.out.println("enter Food Item Name :");
		String name = sc.nextLine();

		System.out.println("enter its price :");
		Double price = sc.nextDouble();

		try {
			
			Driver driver = new Driver();//register driver
			DriverManager.registerDriver(driver);

			//get the connection
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_db?user=root&password=root");

			//issue sql query
			String query = "insert into hotel_bill values(?,?,?)";
			pstmt =con.prepareStatement(query);
			pstmt.setInt(1, Item_Code);
			pstmt.setString(2, name);
			pstmt.setDouble(3, price);

			int n= pstmt.executeUpdate();

			if (n>0) {
				System.out.println("food item added succsessfully");
			} else {
				System.out.println("Food item not insterted");
			}

		} catch (SQLException e) {
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

	}
}
