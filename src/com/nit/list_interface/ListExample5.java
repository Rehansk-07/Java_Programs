package com.nit.list_interface;
import java.util.*;
public class ListExample5 {

	public static void main(String[] args) 
	{
		List<String>languages = new ArrayList<>();
		languages.add("Java");
		languages.add("Python");
		languages.add("C++");
		
		//Remove Element
		languages.remove("Python");
		System.out.println("After Removing Python:"+languages);
		
		IO.println("-----------------------------");
		
		//Update Element
		languages.set(1, "JavaScript"); //index 1 update
		System.out.println("After updating index 1: "+languages);
		
	}

}
