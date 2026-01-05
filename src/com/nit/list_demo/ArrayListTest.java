package com.nit.list_demo;
import java.util.*;
public class ArrayListTest {
public static void main(String[] args) {
	
	List<String> list = new ArrayList<String>();
	list.add("Hyderabad");
	list.add(0,"New York");
	list.add("Mumbai");
	list.add(2,"Sydney");
	System.out.println(list);
	
}
}
