package com.nit.predicate;
// verify name start with character p or not?

import java.util.function.Predicate;

public class PredicateDemo2 {

	public static void main(String[] args) {
		Predicate<String> p2 = name-> name.toLowerCase().startsWith("p");
		String name = IO.readln("Enter your name :");
		IO.println(name+" starting with Character p :" +p2.test(name));
		
	}

}
