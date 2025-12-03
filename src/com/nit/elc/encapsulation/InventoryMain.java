package com.nit.elc.encapsulation;

import java.util.Scanner;

import com.nit.blc.encapsulation.InventoryItem;

public class InventoryMain {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Item Name:");
		String item=sc.nextLine();
		System.out.println("Enter Price Per Unit:");
		double price=Double.parseDouble(sc.nextLine());
		System.out.println("Enter Quantity In Stock");
		int stock = Integer.parseInt(sc.nextLine());
	
		InventoryItem e1 =new InventoryItem(item,price,stock);
		System.out.println("Inventory Item Details:");
		System.out.println("Item Name:"+e1.getItemName());
		System.out.println("Price Per Unit:"+e1.getPricePerUnit());
		System.out.println("Quantity in Stock:"+e1.getQuantityInStock());
	    System.out.println("Total Inventory Value:"+e1.calculateTotalValue());
	    
	    System.out.println("Any updation in Stock Price OR Quantity [yes/no]:");
	    String choice=sc.nextLine();
	    
	    if(choice.equalsIgnoreCase("yes")) {
		System.out.println("Enter Price Per Unit:");
		double newprice=Double.parseDouble(sc.nextLine());
		e1.setPricePerUnit(newprice);
		System.out.println("Enter Quantity In Stock");
		int newstock = Integer.parseInt(sc.nextLine());
		e1.setQuantityInStock(newstock);
		
		System.out.println("Inventory Item Details:");
		System.out.println("Item Name:"+e1.getItemName());
		System.out.println("Price Per Unit:"+e1.getPricePerUnit());
		System.out.println("Quantity in Stock:"+e1.getQuantityInStock());
	    System.out.println("Total Inventory Value:"+e1.calculateTotalValue());
	    }
	    else {
	    System.exit(0);
	    }

	}
	}

	
