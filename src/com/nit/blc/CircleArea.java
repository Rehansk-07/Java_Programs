package com.nit.blc;

public class CircleArea {
 public static String getArea(double radius) {
	 
	 
	 if(radius<=0)
	 {
		 return 0+"";
	 }
	 
	 final float PI =  3.14159f;
	 
		return PI * radius * radius +"";
 }
}
