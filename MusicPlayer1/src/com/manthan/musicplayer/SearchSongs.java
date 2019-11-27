package com.manthan.musicplayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SearchSongs {

	public void searchSongs(int d) {

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs =null;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Song id :");
		int SongId = sc.nextInt();

		try {
			//load driver
			Class.forName("com.mysql.jdbc.Driver");
//establish connection
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MusicPlayer?user=root&password=root");
			
			String query = "select * from MyFiles where Song_id = ?";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, SongId);

			rs = pstmt.executeQuery();

			if (rs.next()) {
				System.out.println("Song Found...");
				System.out.println("Song name = " + rs.getString("Song_Title"));
				System.out.println("artist name = " + rs.getString("artist_name"));
				
			}
			else {
				System.out.println(" song not found");
			}

		} catch (Exception e) {
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
