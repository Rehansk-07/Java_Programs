package com.nit.elc;

import java.text.DecimalFormat;
import java.util.Scanner;

import com.nit.blc.CircleArea;

public class FindCircleArea {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		double d = Double.parseDouble(sc.nextLine());
		
		DecimalFormat d1 = new DecimalFormat("00.00");
		System.out.println(d1.format(Double.parseDouble(CircleArea.getArea(d))));
	}
}
