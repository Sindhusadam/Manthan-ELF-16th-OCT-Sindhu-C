package com.mantahn.shoppingapp.dao;

import com.manthan.shoppingapp.bean.UserInfoBean;

public interface UserDao {


	public UserInfoBean authentication(String email,String password);

	public boolean registerUser(UserInfoBean UserInfoBean);
	
	public UserInfoBean SearchProduct (int ProductId); 
}
