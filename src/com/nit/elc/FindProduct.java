package com.nit.elc;

import java.util.Scanner;

import com.nit.blc.Product;

public class FindProduct {

	public static void main(String[] args) {
		Product Dettol = new Product();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter product id :");	
		int pid=	Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter product Name :");
		String pname=sc.nextLine();
			
		System.out.println("Enter product price");
		double price=Double.parseDouble(sc.nextLine());
		
		Dettol.setProductData(pid, pname, price);
		Dettol.getProductInfo();
		sc.close();
		
		
	}

}
