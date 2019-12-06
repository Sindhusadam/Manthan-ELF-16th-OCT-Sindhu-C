package com.manthan.shoppingapp.bean;

public class UserInfoBean {

	private int UserID;
	private String UserName;
	private String Email;
	private String Password;
	
	private int ProductId;
	private String ProductName;
	private double ProductCost;
	private String ProductColor;
	private String Description;
	private int NumberofProducts;
	
	public int getProductId() {
		return ProductId;
	}
	public void setProductId(int productId) {
		ProductId = productId;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public double getProductCost() {
		return ProductCost;
	}
	public void setProductCost(double productCost) {
		ProductCost = productCost;
	}
	public String getProductColor() {
		return ProductColor;
	}
	public void setProductColor(String productColor) {
		ProductColor = productColor;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public int getNumberofProducts() {
		return NumberofProducts;
	}
	public void setNumberofProducts(int numberofProducts) {
		NumberofProducts = numberofProducts;
	}
	public int getUserID() {
		return UserID;
	}
	public void setUserID(int userID) {
		UserID = userID;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	
	
}
