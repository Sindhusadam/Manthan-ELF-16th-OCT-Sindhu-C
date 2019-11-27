package com.manthan.musicplayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteSongs {

	public void deleteSongs(int c) {

		Connection con = null;
		PreparedStatement pstmt = null;
		int rs =0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Song_ID :");
		int SongId = sc.nextInt();

		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MusicPlayer?user=root&password=root");
			
			String query = "delete from MyFiles where Song_ID = ?";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1,SongId );

			rs = pstmt.executeUpdate();

			if (rs>0) {
			System.out.println("deleted");
			}
			else {
				System.out.println("not found");
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
