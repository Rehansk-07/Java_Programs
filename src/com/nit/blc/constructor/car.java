package com.nit.blc.constructor;

public class car {
	private String model;
	private int year;
	private double price;
	
	public car(String model, int year, double price) {
		super();
		this.model = model;
		
		if(year>2010) {
		this.year = year;
		}
		else {
			System.err.println("Year must be greater than 2010");
			System.exit(0);
		}
		
		if(price>0) {
		this.price = price;
		}
		else {
			System.err.println("Price must be positive Integer");
			System.exit(0);
		}
	}


	public String toString() {
		return "car [model=" + model + ", year=" + year + ", price=" + price + "]";
	}
	
}
