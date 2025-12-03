package com.nit.array;

import java.util.Arrays;

public class ArrayDemo1 {

	public static void main(String[] args) {
		int arr[]=new int [10];
		arr[0]=100;
		System.out.println(Arrays.toString(arr));
		System.out.println(arr.getClass().getName());
		
		Integer x[]=new Integer[10];
		System.out.println(Arrays.toString(x));
		System.out.println(x.getClass().getName());
	}
}
