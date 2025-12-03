package com.nit.blc;

public class RoundedSum {
 public static int sumOfRoundedValues(int num1,int num2, int num3) {//23
	 num1=(num1%10<5)?(num1/10)*10:(num1/10+1)*10;
	 num2=(num2%10<5)?(num2/10)*10:(num2/10+1)*10;
	 num3=(num3%10<5)?(num3/10)*10:(num3/10+1)*10;
	 return num1+num2+num3;
 }
}
