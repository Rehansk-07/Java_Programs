package com.nit.elc;

import java.util.Scanner;

import com.nit.blc.RoundedSum;

public class FindRoundedSum {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter The Numbers");
		int num1 =sc.nextInt();
		int num2 =sc.nextInt();
		int num3 =sc.nextInt();
		
		int sumOfRoundedValues = RoundedSum.sumOfRoundedValues(num1,num2,num3);
		System.out.println(sumOfRoundedValues);

	}

}
