package com.nit.elc.factory_mathod;

import java.util.Scanner;

import com.nit.blc.factory_method.Cat;

public class CatDemo {

	public static void main(String[] args) {
		while(true) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Cat Breed");
		String breed = sc.nextLine();
		
		System.out.println("Enter Cat age");
		int age = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter Cat Price");
		double price = Double.parseDouble(sc.nextLine());
		
		System.out.println("Enter choice");
		Cat c1=Cat.getCatObject(breed, age, price);
		System.out.println(c1);
		
		System.out.println("Do you want to continue [yes/no]");
		String choice = sc.nextLine();
		if(choice.equalsIgnoreCase("no"));
		{
			System.err.println("Thank You");
			break;
		}
		
		}
	}

}
