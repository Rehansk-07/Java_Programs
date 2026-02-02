package com.nit.hash_set_demo;

import java.util.HashSet;

public class HashSetDemo2 {

	public static void main(String[] args) 
	{`
		HashSet<String> hs = new HashSet<>();
		hs.add("Ravi");
		hs.add("Vijy");
		hs.add(new String("Ravi"));
		hs.add("Ajay");
		hs.add("Plavi");
		hs.add("Shweta");
		hs.add(null);
		hs.add(null);
		hs.forEach(str-> System.out.println(str));
	}

}
