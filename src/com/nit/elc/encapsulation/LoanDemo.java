package com.nit.elc.encapsulation;

import java.util.Scanner;

import com.nit.blc.encapsulation.Loan;

public class LoanDemo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Loan Amount:");
		double amount=Double.parseDouble(sc.nextLine());
		System.out.println("Enter Interest Rate:");
		double interst = Double.parseDouble(sc.nextLine());
		System.out.println("Enter number of months for loan");
		int month=Integer.parseInt(sc.nextLine());
		
		Loan l1=new Loan(amount,interst,month);
		System.out.println("Principle:"+l1.getPrinciple());
		System.out.println("Interest Rate (Yearly %):"+l1.getInterestRate());
	    System.out.println("Duration(months):"+l1.getDurationMonths());
	    sc.close();
	    
		
		
		
		
		
		

	}

}
