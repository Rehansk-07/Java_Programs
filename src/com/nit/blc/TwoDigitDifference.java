package com.nit.blc;

public class TwoDigitDifference {
  public static int	getDiffOfDigits(int num) {//34
	  int first=num/10;//3
	  int last=num%10;//4
	  int sum=first-last;
	  return sum;
  }
}
