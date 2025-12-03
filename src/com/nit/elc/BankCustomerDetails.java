package com.nit.elc;

import java.util.Scanner;

import com.nit.blc.Bank;

public class BankCustomerDetails {

	public static void main(String[] args) {
		Bank bk= new Bank();
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Customer Name");
		String name=sc.nextLine();
		
		System.out.println("Enter Customer Account No ");
		int Acc=Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter Customer Balance");
		double balance=Double.parseDouble(sc.nextLine());
		bk.setCustomerDetails(name, Acc, balance);
		
		
       while(true)
       {
    	   System.out.println("Enter Your choice");
    	   int choice=Integer.parseInt(sc.nextLine());
    	   switch(choice)
    	   {
    	   case 1->{System.out.println("Enter Deposite Amount");
    	   double damount=Double.parseDouble(sc.nextLine());
    	   bk.deposit(damount);
    	   }
    	   
    	   case 2->{System.out.println("Enter Withdraw Amount");
    	   int wamount=Integer.parseInt(sc.nextLine());
    	   bk.withdraw(wamount);   
    	   }
    	   case 3->System.out.println("Current Balance is :"+bk.getCurrentBalance());
    	   
    	   case 4->System.out.println("Customer Detail is :"+bk.displayDetails());
    	   case 5->System.exit(0);
    	   default->System.out.println("Invalid choice...");
    	   }
    	    
    	   }
      
	}
}
