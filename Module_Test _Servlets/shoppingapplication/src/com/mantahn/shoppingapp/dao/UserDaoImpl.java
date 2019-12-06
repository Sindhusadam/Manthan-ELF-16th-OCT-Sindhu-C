package com.mantahn.shoppingapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.manthan.shoppingapp.bean.UserInfoBean;

public class UserDaoImpl implements UserDao{

	@Override
	public UserInfoBean authentication(String email, String password) {
		Connection con = null;
		PreparedStatement pstmt =null;
		ResultSet rs = null;

		UserInfoBean UserInfoBean =null;

		try {
			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/flipkart?user=root&password=root");

			String query = "select * from user_info where email = ? and password=?";

			pstmt =con.prepareStatement(query);
			pstmt.setString(1, email);
			pstmt.setString(2, password);
			rs=pstmt.executeQuery();



			if (rs.next()) {
				UserInfoBean = new UserInfoBean();

				UserInfoBean.setUserID(rs.getInt("User_ID"));
				UserInfoBean.setUserName(rs.getString("User_Name"));
				UserInfoBean.setEmail(rs.getString("email"));
				UserInfoBean.setPassword(rs.getString("password"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(rs!= null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pstmt!=null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				if (con!=null) {
					try {
						con.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}
		}


		return UserInfoBean;
	}


	@Override
	public boolean registerUser(UserInfoBean UserInfoBean) {

		Connection con = null;
		PreparedStatement pstmt = null;

		boolean isAdded = false;		
		try {

			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/flipkart?user=root&password=root");

			String query = "insert into user_info value(?,?,?,?)";

			pstmt =con.prepareStatement(query);

			pstmt.setInt(1, UserInfoBean.getUserID());
			pstmt.setString(2, UserInfoBean.getUserName());
			pstmt.setString(3, UserInfoBean.getEmail());
			pstmt.setString(4, UserInfoBean.getPassword());


			int n = pstmt.executeUpdate();

			if (n>0) {
				isAdded = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if (pstmt!=null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				if (con!=null) {
					try {
						con.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}
		}


		return isAdded;


	}


	@Override
	public UserInfoBean SearchProduct(int ProductId) {
		
		Connection con =null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		UserInfoBean userinfobean =null;

		try {

			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/flipkart?user=root&password=root");
			
			String query = "select * from product_info where product_id = ?";

			pstmt =con.prepareStatement(query);
			pstmt.setInt(1, ProductId);
			rs=pstmt.executeQuery();



			if (rs.next()) {
				userinfobean = new UserInfoBean();

				userinfobean.setProductId(rs.getInt("ProductId"));
				userinfobean.setProductName(rs.getString("procuctName"));
				userinfobean.setProductCost(rs.getDouble("productCost"));
				userinfobean.setProductColor(rs.getString("productColor"));
				userinfobean.setDescription(rs.getString("description"));
				userinfobean.setNumberofProducts(rs.getInt("numberofProducts"));

			}

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(rs!= null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pstmt!=null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				if (con!=null) {
					try {
						con.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}
		}


		return userinfobean;
	}

}
