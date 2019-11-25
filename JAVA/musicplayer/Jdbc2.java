package com.manthan.Musicplayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Jdbc2 {

	public void updateSongs() {
	    	 
	    	    Connection con = null;
				PreparedStatement pstmt = null;

				Scanner sc = new Scanner(System.in);

				System.out.println("Enter Song_ID :");
				int Song_Id = sc.nextInt();
				sc.nextLine();

				System.out.println("Enter Artist_Name :");
				String Artist = sc.nextLine();

				try {
					Class.forName("com.mysql.jdbc.Driver");

					con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MusicPlayer?user=root&password=root");

					String query = "update myFiles set Artist_Name = ? where Song_Id =?";

					pstmt = con.prepareStatement(query);
					pstmt.setString(1, Artist);
					pstmt.setInt(2, Song_Id);
				
					int n = pstmt.executeUpdate();

					if (n>0) {
						System.out.println("updated");
					}else {
						System.out.println("not updated");
					}
					
				}catch (SQLException e) {
						e.printStackTrace();
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
					}


		
	    
	     }



		
	}


