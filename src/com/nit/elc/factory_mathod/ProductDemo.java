package com.nit.elc.factory_mathod;

import java.util.Scanner;

import com.nit.blc.factory_method.Product;

public class ProductDemo {

	public static void main(String[] args) {
		while(true) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter Product id");
		int id=Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter Product Name");
		String name =sc.nextLine();
		
		System.out.println("Enter Product Price");
		double price=Double.parseDouble(sc.nextLine());
		
		System.out.println("Enter Choice");
		Product p1=Product.getProductObject(id, name, price);
		System.out.println(p1);
		
	   System.out.println("Do you want to continue [yes/no]");
	   String choice=sc.nextLine();
	   
	   if(choice.equalsIgnoreCase("no"))
	    {
		   break;   
	    }
	   
	}
  }

 }
