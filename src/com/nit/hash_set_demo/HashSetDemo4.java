package com.nit.hash_set_demo;

import java.util.HashSet;

public class HashSetDemo4 {

	public static void main(String[] args) 
	{
		HashSet<String> hs1 = new HashSet<>();
		hs1.add("Java");
		hs1.add(new String("Java"));
		IO.println(hs1.size());
		
		IO.println("..................");
		HashSet<StringBuilder> hs2  = new HashSet<StringBuilder>();
		hs2.add(new StringBuilder("Java"));
		hs2.add(new StringBuilder("Java"));
		IO.println(hs2.size());
		
	}

}
