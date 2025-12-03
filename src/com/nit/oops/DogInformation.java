package com.nit.oops;

public class DogInformation {

	public static void main(String[] args) {
		Dog Rocky = new Dog();
		Rocky.name = "Rocky";
		Rocky.age =  3;
		Rocky.height = 4.5;
		
		Rocky.getDogInformation();
		Rocky.bark();

	}
}
