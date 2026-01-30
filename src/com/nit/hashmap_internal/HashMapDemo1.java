package com.nit.hashmap_internal;

import java.util.HashMap;

public class HashMapDemo1 {

	public static void main(String[] args) 
	{
		HashMap<Integer,String> map = new HashMap<>();
		
		map.put(1, "Vanilla");
		map.put(2, "Butterscotch");
		map.put(3, "Cotton Candy");
		
		IO.println("HashMap entries are :");
		IO.println(map);
		
		IO.println("By using forEach method :");
		map.forEach((key,value)->IO.println("Key is :"+key+"Value is :"+value));
		
		String icecream = map.get(4);
		IO.println(icecream);
		
		icecream = map.getOrDefault(1, "This key is not existing");
		IO.println(icecream);
		
	}

}
