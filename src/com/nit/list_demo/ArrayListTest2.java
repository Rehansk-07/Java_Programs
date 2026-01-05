package com.nit.list_demo;
import java.util.*;
public class ArrayListTest2 {
public static void main(String[] args) {
	
	List<String> list = new ArrayList<String>();
	list.add("Orange");
	list.add(0,"Banana");
	
	ArrayList<String> arlist = new ArrayList<>();
	arlist.add("Apple");
	list.add("Grapes");
	list.addAll(3, arlist);
	System.out.println(list);
	
}
}
