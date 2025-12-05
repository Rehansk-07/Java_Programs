package com.nit.methodo_verriding;

class Animal{
	public void eat() {
		System.out.println("Generic Eating");
	}
}

class Dog extends Animal{
	public void eat() {
		
		System.out.println("Dog i eating");
	}
}

public class MethodOverridindDemo1 {

	public static void main(String[] args) {
		Animal a1 = new Dog();
        a1.eat();

	}

}
