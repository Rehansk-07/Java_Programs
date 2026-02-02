package com.nit.stream_api;

import java.util.Arrays;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamCreationArrays 
{
	public static void main(String[] args)
	{
		//Case 1 Arrays.stream()
		
		String []fruits = {"Orange","Mango","Grapes","Apple","Pomogranate"};
		Stream<String> stream = Arrays.stream(fruits);
		stream.forEach(IO::println);
		
		IO.println("-----------------------------");
		
		long []longArr = {12L,90L,45L,34L};
		LongStream longstrm = Arrays.stream(longArr);
		longstrm.forEach(IO::println);
		
	}
}
