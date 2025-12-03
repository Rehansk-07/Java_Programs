package com.nit.elc.toString;

import java.util.Scanner;

import com.nit.blc.toString.Product;

public class productDemo {

	public static void main(String[] args) {
		Product pd=new Product();
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Product id");
		int pid=Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter Product name");
		String pname=sc.nextLine();
		
		System.out.println("Enter Product price");
		double pprice=Double.parseDouble(sc.nextLine());
		
		System.out.println("-------Product Details-------");
		pd.setProductDetails(pid, pname, pprice);
		System.out.println(pd.toString());
		pd.calculateDiscount();
		sc.close();

	}

}
