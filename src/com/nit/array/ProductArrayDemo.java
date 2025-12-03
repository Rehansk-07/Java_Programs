package com.nit.array;

import java.util.Scanner;

public class ProductArrayDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Products");
		int size=Integer.parseInt(sc.nextLine());
		Product product[]=new Product[size];
		
		for(int i=0;i<size;i++) {
			
			System.out.println("Enter Details For Product :"+(i+1));
			System.out.println("Enter Product ID:");
			int id= Integer.parseInt(sc.nextLine());
			System.out.println("Enter Product Name:");
			String name= sc.nextLine();
			System.out.println("Enter Product Price:");
			double price=Double.parseDouble(sc.nextLine());
			product[i]=new Product(id, name, price);
		}
		System.out.println("Enter Id to search product:");
		int search=sc.nextInt();
		boolean found=false;
		
		for(int i=0;i<size;i++) {
			if(search==product[i].getId()) {
				System.out.println(product[i]);
				found=true;
			}
		}
		   if(found==false) {
			   System.out.println("Product Id "+search+"not found");
		   }
	}

}
