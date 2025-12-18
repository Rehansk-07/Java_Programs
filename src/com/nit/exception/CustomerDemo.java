package com.nit.exception;

public class CustomerDemo {
	public static void main(String[] args) {
		try
		{
			IO.println("Welcome to this application");
			
			int x = Integer.parseInt(IO.readln("Enter your first number:"));
			int y = Integer.parseInt(IO.readln("Enter your second number"));
			
			int result = x/y;
			IO.println("Result is :"+result);
		}
		catch(Exception e)
		{
			System.err.println("Don't put zero here");
			
		}
		IO.println("Thank you for visiting. Please visit again.");
	}
	
}
