package com.nit.oops;

public class Car {
	int model;
	String name,color;
	
	public void getCarInformation() {
		System.out.println("This is a "+name+"car.");
		System.out.println("And the color is "+color);
		System.out.println("And model is "+model);
	}
	 public void drive() {
		 System.out.println("This "+name+"car is driven by Tom Cruise");
	 }

}
