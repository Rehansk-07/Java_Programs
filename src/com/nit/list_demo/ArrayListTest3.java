package com.nit.list_demo;
import java.util.*;
public class ArrayListTest3 {
public static void main(String[] args) {
	
	ArrayList<String> list = new ArrayList<String>();
	list.add(null);
	list.add(0,"A");
	list.add(3,"B");
	list.add(1,"C");
	System.out.println(list);
}
}
