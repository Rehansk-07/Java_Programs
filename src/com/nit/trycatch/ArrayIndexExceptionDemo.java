package com.nit.trycatch;

public class ArrayIndexExceptionDemo {

	public static void main(String[] args) {
		try {
			
			int a[] = new int[2];
		    a[3] = 10;
		    a[1] = 20;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			//e.printStackTrace();
			IO.println(e.toString());
			//IO.println(e.getMessage());
		}
	}

}
