package com.nit.methodo_verriding;

class Vehicle{
	public int tankCapacity() {
		return 80;
		
	}
	
	public void printTankCapacity() {
		System.out.println(this.tankCapacity());
	}
}

class Car extends Vehicle {
	
	@Override
	public int tankCapacity() {
		return 40;
	}
	public void printTankCapacity() {
		System.out.println(super.tankCapacity());
	}
}
public class PrintTankCapacity {

	public static void main(String[] args) {
		Vehicle vehicle = new Car();
		vehicle.printTankCapacity();

	}

}
