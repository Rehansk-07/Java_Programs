package com.nit.list_interface;
import java.util.*;
public class ListExample6 {

	public static void main(String[] args) 
	{
		List<String>cities = new LinkedList<>();
		cities.add("Mumbai");
		cities.add("Hyderabad");
		cities.add("Nagpur");
		
		System.out.println("Cities: "+cities);
		
		//add specific index
		cities.add(1,"Nashik");
		System.out.println("After adding city at index 1 :"+cities);
		IO.println("****************************************************");
		//Remove first and last
		cities.remove(0);
		cities.remove(cities.size()-1);
		System.out.println("After removing first and kast : "+cities);
	}

}
