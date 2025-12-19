package com.nit.trycatch;

 class Product {
	private int productId;
	private String productName;
	
	public Product(int productId, String productName) {
		super();
		this.productId = productId;
		this.productName = productName;
	}
	public boolean equals(Object obj) {
		if(obj instanceof Product) {
		Product p = (Product)obj;
		
		if(this.productId==p.productId && this.productName == p.productName) {
			return true;
		 }
		else {
			return false;
		}
		}
		else {
			return false;
	  }
	}
	public int hashCode() {
		return this.productId;
	}
}

public class ProductEquality{
	void main() {
	Product p = new Product(111, "Rehan");
	Product p1 = new Product(111, "Rehan");
	IO.println(p.equals(p1));
	IO.println(p.hashCode());
	IO.println(p.hashCode());
	}
}
