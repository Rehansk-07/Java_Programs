package com.nit.predicate;

import java.util.function.Predicate;

//verify whether a person is eligible 4 voting or not

public class PredicateDemo1 {

	public static void main(String[] args) {
		Predicate<Integer> p1 = age-> age >= 18;
		int myAge = Integer.parseInt(IO.readln("Enter your age :"));
		IO.print("your age is "+myAge+" and your are eligible for voting :"+p1.test(myAge));
	}

}
