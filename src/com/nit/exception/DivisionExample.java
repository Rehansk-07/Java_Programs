package com.nit.exception;

public class DivisionExample {

	public static void main(String[] args) 
	{
		int divident = Integer.parseInt(IO.readln("Enter first integer :"));
		int divisor = Integer.parseInt(IO.readln("Enter second integer :"));
		performDivision(divident, divisor);
	}
	
	public static int performDivision(int divident,int divisor) 
	{
	try 
	{
		int result = divident/divisor;
		IO.println("Result of division :"+result);
		return 0;
	}
	catch(ArithmeticException e)
	{
		System.err.println("ArithmeticException caught: Division by zero: dividend="+divident+", divisor="+divisor+"");
	}
	return 0;
  }

}
