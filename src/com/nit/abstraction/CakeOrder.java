package com.nit.abstraction;

import java.util.Scanner;

abstract class Cake{
	private String shape;
	private String flavor;
	private int quantity;
	public static double price = 400;
	
	public Cake(String shape, String flavor,int quantity) {
		this.shape=shape;
		this.flavor=flavor;
		this.quantity=quantity;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String toString() {
		return "A "+getShape()+" "+getFlavor()+" Cake of"+getQuantity()+" Kg is Ready @ RS."+getQuantity()*price+"";
	}
}

class OrderedCake extends Cake{
	private String massage;
	
	public OrderedCake() {
		super("round","Vanilla",1);
	}
	
	public OrderedCake(String shape, String flavor,int quantity) {
		super(shape,flavor,quantity);
	}
	public OrderedCake(String shape, String flavor,int quantity,String massage) {
		super(shape,flavor,quantity);
		this.massage=massage;
	}
	public String toString() {
		if(massage!=null) {
		return "A  "+getShape()+" "+getFlavor()+"  of"+getQuantity()+"Kg is Ready with "+massage+" @ Rs."+getQuantity()*price+"";
		}
		else {
			return super.toString();
		}
		
	}
}


public class CakeOrder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Shape");
		String shape = sc.nextLine();
		System.out.println("Enter flavor");
		String flavor = sc.nextLine();
		System.out.println("Enter quantity");
		int quantity = Integer.parseInt(sc.nextLine());
		System.out.println("enter messege");
		String massage = sc.nextLine();
		
		
		Cake c1 = new OrderedCake();
		System.out.println(c1);
		
		c1=new OrderedCake(shape,flavor,quantity);
		System.out.println(c1);
		
		c1=new OrderedCake(shape,flavor,quantity,massage);
		System.out.println(c1);
		
	}

}
