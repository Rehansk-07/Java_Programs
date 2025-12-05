package com.nit.abstraction_demo;

abstract class Car {
	protected int speed = 90;
	
	public Car() {
		System.out.println("Car class constructor");
	}
	public void getCarDetails() {
		System.out.println("It has 4 wheels");
	}
	public abstract void run();
}

class Honda extends Car{
	@Override
	public void run() {
		System.out.println("Honda car is running");
	}
}

public class AbstractDemo2 {

	public static void main(String[] args) {
		Car car = new Honda();
		System.out.println("Car speed is :" +car.speed);
		car.getCarDetails();
		car.run();
	}

}
