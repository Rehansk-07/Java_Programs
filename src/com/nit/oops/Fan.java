package com.nit.oops;

public class Fan {
	String name,coil;
	int wings;
	
	public void switchOn() {
		System.out.println(name+" fan is on");
		System.out.println("coil is binding with "+coil);
		System.out.println("fan has "+wings+" wings");
	}
	 public void switchOff() {
		 System.err.println("This "+name+" fan is switch off");
	 }
	

}
