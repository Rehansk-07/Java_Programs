package com.nit.exception;

public class TryDemo 
{
	void main() 
	{
		try 
		{
			int x = Integer.parseInt(IO.readln("Enter the velue of x:"));
			int y = Integer.parseInt(IO.readln("Enter the value of y:"));
			
			int result = x/y;
			IO.println("The result is :"+result);
			IO.println("End of try block");
		}
		catch(Exception e)
		{
			IO.println("Inside catch block");
			IO.print(e);
		}	
		IO.println("Main method completed");
	}
}
