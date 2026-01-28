package com.nit.list_interface;

import java.util.ArrayList;
import java.util.List;

public class ListExample2 {

	public static void main(String[] args) {
		List<String> languages = new ArrayList<>();
		languages.add("java");
		languages.add(" js");
		languages.add("html");
		
		System.out.println("First language: "+languages.get(0));
		System.out.println("Second language: "+languages.get(1));
		
		for (int i=0; i<languages.size();i++)
		{
			System.out.println("Element of index: "+i+": "+ languages.get(i));
		}
	}

}
