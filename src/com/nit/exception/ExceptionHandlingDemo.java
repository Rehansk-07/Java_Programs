package com.nit.exception;

public class ExceptionHandlingDemo {

	public static void main(String[] args) 
	{
		String str = IO.readln("Enter String :");
		handleException(str);
		handleException(null);
	}
	public static void handleException(String str) 
	{
		try {
			IO.println("Length of the input string:"+str.length());
			int n= Integer.parseInt(str);
			System.out.println("Converted to integer :"+n);
		}
		catch(NumberFormatException e)
		{
			System.err.println("Input is not a valid integer.");
		}
		catch (NullPointerException  e) 
		{
			System.err.println("Input is null.");
		}
	}

}
