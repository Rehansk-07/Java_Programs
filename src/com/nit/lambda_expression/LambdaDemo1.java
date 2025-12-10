package com.nit.lambda_expression;

interface Vehicle{
	void run();
	
}

public class LambdaDemo1 {

	public static void main(String[] args) {
		Vehicle car = ()-> System.out.println("car is running");
		car.run();
		
		Vehicle bike = ()-> System.out.println("Bike is running");
		bike.run();

	}

}
