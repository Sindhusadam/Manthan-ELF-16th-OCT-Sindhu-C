package com.manthan.Musicplayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.jdbc.Driver;
import com.mysql.jdbc.PreparedStatement;

public class Jdbc1 {
	
	public void displaySongs() {
		
	    	 
		     
				Connection con = null;
				Statement stmt = null;
				ResultSet rs =null;

				try {
					Class.forName("com.mysql.jdbc.Driver");


					//get the connection via driver
					con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MusicPlayer?user=root&password=root");
			
		 

						stmt = con.createStatement();
						rs = stmt.executeQuery("select * from MyFiles");

						//process the result
						while (rs.next()) {
							int Song_Id = rs.getInt("Song_ID");
							String Song_Title =rs.getString("Song_Title");
							String Artist_Name =rs.getString("Artist_Name");
							String Album_Name =rs.getString("album_Name");
							String Song_Location = rs.getString("Song_Location");
							String Description = rs.getString("Description");

							System.out.println("Song Id is = "+ Song_Id);
							System.out.println("Song Name is = "+ Song_Title);
							System.out.println("Artist Name is =" + Artist_Name);
							System.out.println("Album Name is =" + Album_Name);
							System.out.println("Song location is ="+ Song_Location);
							System.out.println("About ="+ Description);


						}//while loop ends
				

						
				} catch (SQLException e) {
					e.printStackTrace();
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
				}


	
    

    

	}//method ends
     
    
	}//class ends








