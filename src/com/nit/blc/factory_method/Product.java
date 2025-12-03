package com.nit.blc.factory_method;

public class Product {
	private int productId;
	private String productName;
	private double productPrice;
	
	public Product(int Id, String Name, double Price) {
		super();
		this.productId = Id;
		this.productName = Name;
		this.productPrice = Price;
	}

	public String toString() {
		return "Product [Id=" + productId + ", Name=" + productName + ", Price=" + productPrice
				+ "]";
	}
	//Static factory method
	public static Product getProductObject( int Id , String Name, double Price) {
		return new Product (Id ,Name,Price);
	}
}
