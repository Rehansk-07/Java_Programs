package com.nit.trycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleExceptionDemo {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			IO.println("Enter the value of a:");
			int a = sc.nextInt();
			IO.println("Enter the value of b:");
			int b = sc.nextInt();
			IO.println("You entered a = "+a+ " and b = "+b);
		}
		catch(InputMismatchException e) {
            //e.printStackTrace(); 
            //IO.println(e.getMessage());
            //IO.println(e.toString());
			System.err.println("Please Enter Valid Integer.");
		}
		
	}

}
