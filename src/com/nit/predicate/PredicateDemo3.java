package com.nit.predicate;
import java.util.function.Predicate;
// verify my name is Rehan or not
public class PredicateDemo3 {

	public static void main(String[] args) {
		Predicate<String> p3 = name -> name.equalsIgnoreCase("Rehan");
		String name = IO.readln("Enter your name :");
		IO.println("Are you Rehan :"+p3.test(name));
	}

}
