package com.nit.methodo_verriding;
class Bird{
	public void sleep() {
		System.out.println("Bird is sleeping");
	}
}

class Hen extends Bird{
	public void sleep() {
		
		System.out.println("Hen is sleeping");
	}
}

class Chick extends Hen{
	
	public void sleep() {
		
		System.out.println("Chick is sleeping");
	}
}

public class MehtodOverridingDemo3 {

	public static void main(String[] args) {
		Bird bird = new Chick();
		bird.sleep();

	}

}
