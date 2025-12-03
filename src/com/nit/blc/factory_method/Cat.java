package com.nit.blc.factory_method;

public class Cat {
	private String catBreed;
	private int catAge;
	private double catPrice;
	
	public Cat(String breed, int age, double price ) {
		this.catBreed=breed;
		this.catAge=age;
		this.catPrice=price;
	}

	@Override
	public String toString() {
		return "Cat [catBreed=" + catBreed + ", catAge=" + catAge + ", catPrice=" + catPrice + "]";
	}
	public static Cat getCatObject(String breed, int age, double price) {
		return new Cat (breed,age,price);
	}
}
