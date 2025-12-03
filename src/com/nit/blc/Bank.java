package com.nit.blc;

public class Bank {
	private String customerName;
	private int accountNumber;
	private double currentBalance;
	static String  bankName;
	static String bankAddress;
	static String bankIFSCCode;
	
	public void setCustomerDetails(String name, int Ac, double balance) {
		
       
		if(balance<=0) {	
		  System.err.println("Invalid Balance");
		  System.exit(0);
		}
		else {
         	currentBalance =balance;
		}
		customerName = name;
		accountNumber = Ac;
	}
	public void withdraw(double amount) {
		if(amount > currentBalance) {
		System.err.println("You have Insufficient Balance");	
		System.exit(0);
		}
		currentBalance-=amount;
		System.out.println("withdraw amount is :"+amount);
	}
		
	public void deposit(double amount) {
		if(amount <= 0) {
			System.err.println("Error");	
			System.exit(0);
			}
			currentBalance+=amount;
			System.out.println("deposite amount is :"+amount);
		}
	public double getCurrentBalance() {
		return currentBalance;
	}
	
	public String displayDetails() {
	return "[Name ="+customerName+"AccountNumber ="+accountNumber+"Balance = "+currentBalance+"]";	
	}
 }

