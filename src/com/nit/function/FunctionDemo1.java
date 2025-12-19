package com.nit.function;
import java.util.function.Function;
// find out the length of city 

public class FunctionDemo1 {

	public static void main(String[] args) {
		Function <String,Integer> f1 = str -> str.length();
		
		String cityName = IO.readln("Enter your city name :");
		IO.readln(cityName+" city length is :" +f1.apply(cityName));
	}

}
