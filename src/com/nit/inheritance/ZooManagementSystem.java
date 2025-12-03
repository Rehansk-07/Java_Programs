package com.nit.inheritance;

import java.util.Scanner;

class Annimal{
	private String name;

	public Annimal(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

class Mamal extends Annimal{
	private boolean hasFur;

	public Mamal(String name, boolean hasFur) {
		super(name);
		this.hasFur = hasFur;
	}

	public boolean isHasFur() {
		return hasFur;
	}

	public void setHasFur(boolean hasFur) {
		this.hasFur = hasFur;
	}	
}


class Cat extends Mamal{
	private String breed;

	public Cat(String name, boolean hasFur, String breed) {
		super(name, hasFur);
		this.breed = breed;
	}
	
	public String getBreed(){
		return breed;
	}
	public void setBreed(String breed) {
		this.breed=breed;
	}

	@Override
	public String toString() {
		return "Dog [breed=" + breed + ", getBreed()=" + getBreed() + ", isHasFur()=" + isHasFur() + ", getName()="
				+ getName() + "]";
	}
	
}
public class ZooManagementSystem {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = Integer.parseInt(sc.nextLine());
		if(number==1) {
			System.out.println("Enter a name");
			String name = sc.nextLine();
			Annimal an = new Annimal(name);
			System.out.println(an.getName());	
			System.exit(0);
		}
		else if(number==2) {
			System.out.println("Enter a name");
			String name = sc.nextLine();
			System.out.println("Enter  has fur or not");
			boolean fur=Boolean.parseBoolean(sc.nextLine());
			Mamal mam = new Mamal(name,fur);
			System.out.println(mam.getName()+" "+mam.isHasFur());
			System.exit(0);
		}
		else if(number==3) {
		System.out.println("Enter  name");
		String name = sc.nextLine();
		System.out.println("Enter  has fur or not");
		boolean fur=Boolean.parseBoolean(sc.nextLine());
		System.out.println("Enter  Breed");
		String breed = sc.nextLine();	
	 Cat cat = new Cat(name, fur, breed);
	 System.out.println(cat.toString());
	 System.exit(0);
		}	
		else {
			System.out.println("Invalid Choice");
			System.exit(0);
		}
	}

}
