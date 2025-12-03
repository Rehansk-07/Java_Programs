package com.nit.array;

import java.util.Scanner;

public class ReadAndPrintArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int size = sc.nextInt();
		
		int arr[]=new int[size];
		System.out.println("Output : ");
		for(int i=0; i<arr.length;i++) {
			arr[i]=sc.nextInt();
			System.out.println(arr[i]+" ");
		}
	}

}
