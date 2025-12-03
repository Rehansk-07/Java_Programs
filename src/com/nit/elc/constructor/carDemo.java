package com.nit.elc.constructor;

import java.util.Scanner;

import com.nit.blc.constructor.car;

public class carDemo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter car Model");
		String model = sc.nextLine();
		
		System.out.println("Enter Manufacturing Year");
		int year= Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter Car price");
		double price = Double.parseDouble(sc.nextLine());
		
		car c1 =new car(model ,year ,price );
	    System.out.println(c1);
		
		
		
		
		
		
		

	}

}
