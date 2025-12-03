package com.nit.blc.toString;

public class Product {
	int id;
	String name;
	double price;
	
	public void setProductDetails(int id, String name, double price) {
		this.id=id;
		this.name=name;
		this.price=price;	
	}
	public void calculateDiscount() {
		double discount;
		
		if(price<1000) {
			discount=price*0.05;
			price-=discount;
		}
		else if(price>=1000 && price<=5000) {
			discount=price*0.1;
			price-=discount;
		}
		else {
			discount=price*0.15;
			price-=discount;
		}
		System.out.println("Discount Amount :"+discount);
		System.out.println("Price After Discount :"+price);
	}
	
	public String toString() {
		return "Product [productid=" + id + ", productname=" + name + ", productprice=" + price + "]";
	}
	
}
