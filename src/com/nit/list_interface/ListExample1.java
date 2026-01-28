package com.nit.list_interface;

import java.util.ArrayList;
import java.util.List;

public class ListExample1
{
	public static void main(String[] args)
	{
		List<String>languages = new ArrayList<>();
		languages.add("Java"); 
		languages.add("Python");
		languages.add("C");
		
		System.out.println("Languages: "+languages);
	}
}
