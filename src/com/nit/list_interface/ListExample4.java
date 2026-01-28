
package com.nit.list_interface;
import java.util.*;
public class ListExample4 {

	public static void main(String[] args)
	{
		List<String> languages = new ArrayList<>();
		languages.add("English");
		languages.add("Urdu");
		languages.add("Hindi");
		
		System.out.println("Using for_each loop:");
		for(String lang : languages)
		{
			System.out.println(lang);
		}
		
		
	}

}
