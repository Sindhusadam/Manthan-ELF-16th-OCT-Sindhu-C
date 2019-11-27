package com.manthan.musicplayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class AddSongs {

	public void addSong() {
		Connection con = null;
		PreparedStatement pstmt =null;

		Scanner sc  =new Scanner(System.in);

		System.out.println("enter song id :");
		int songId = sc.nextInt();
		sc.nextLine();

		System.out.println("enter song_title :");
		String Title = sc.nextLine();
		
		System.out.println("enter Artist_Name :");
		String Artist_Name = sc.nextLine();
		
		System.out.println("enter Album_title :");
		String Album_title = sc.nextLine();
		
		System.out.println("enter Song_Location :");
		String Location = sc.nextLine();
		
		System.out.println("enter Song_Description :");
		String Description = sc.nextLine();

		
		try {
			//load the driver
			Class.forName("com.mysql.jdbc.Driver");

			//get the connection
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MusicPlayer?user=root&password=root");
			
			
			//issue sql query
			String query = "insert into myfiles values(?,?,?,?,?,?)";
			pstmt =con.prepareStatement(query);
			pstmt.setInt(1, songId);
			pstmt.setString(2, Title);
			pstmt.setString(3, Artist_Name);
			pstmt.setString(4, Album_title);
			pstmt.setString(5, Location);
			pstmt.setString(6, Description);

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


	}


