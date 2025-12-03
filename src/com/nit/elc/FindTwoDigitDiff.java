package com.nit.elc;

import java.util.Scanner;

import com.nit.blc.TwoDigitDifference;

public class FindTwoDigitDiff {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int sum=TwoDigitDifference.getDiffOfDigits(n);
  System.out.println(sum);
	}

}
