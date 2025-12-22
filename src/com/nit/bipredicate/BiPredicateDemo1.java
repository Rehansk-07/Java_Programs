package com.nit.bipredicate;
// check the two of integer is even or not ?

import java.util.function.*;

public class BiPredicateDemo1 {

	public static void main(String[] args) {
		BiPredicate<Integer,Integer> b1 = (a,b)->(a+b)%2==0;
		IO.println(b1.test(4, 4));
		IO.println(b1.test(5, 2));	
	}

}
