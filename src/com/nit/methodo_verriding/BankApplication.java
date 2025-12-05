package com.nit.methodo_verriding;

import java.util.Scanner;

public class BankApplication{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        sc.nextLine();
        BankAccount b;
        switch(choice){
            case 1->{
            String accountHolderName = sc.nextLine();
            String accountNumber = sc.nextLine();
            double balance = sc.nextDouble();
            b = new SavingsAccount(accountHolderName,accountNumber,balance);
            b.displayAccountDetails();
            b.calculateInterest();


            
        }
        case 2 ->{
            String accountHolderName = sc.nextLine();
            String accountNumber = sc.nextLine();
            double balance = sc.nextDouble();

            b = new CurrentAccount(accountHolderName,accountNumber,balance);
            b.displayAccountDetails();
            b.calculateInterest();
            CurrentAccount c = (CurrentAccount)b;
            c.checkOverdraftLimit();

        }
        case 3 ->{
            String accountHolderName = sc.nextLine();
            String accountNumber = sc.nextLine();
            double balance = sc.nextDouble();
            int depositTerm = sc.nextInt();

            b = new FixedDepositAccount(accountHolderName,accountNumber,balance,depositTerm);
            b.displayAccountDetails();
            b.calculateInterest();
        }
      }
    }
}







class BankAccount{
    protected String accountHolderName;
    protected String accountNumber;
    protected double balance;
    public static final String IFSC_CODE="SBIHYD151285";

    public BankAccount(String accountHolderName,String accountNumber,double balance){
        this.accountHolderName=accountHolderName;
        if(accountHolderName.isEmpty()){
            System.out.println("Account Holder Name cannot be emplty.");
            System.exit(0);
        }

        this.accountNumber=accountNumber;
        if(accountNumber.isEmpty()){
            System.out.println("Account number cannot be emplty.");
            System.exit(0);
        }
        this.balance=balance;
        if(balance<0){
            System.out.println("Balance cannot be negative.");
            System.exit(0);
        }

    }

    public void calculateInterest(){
       System.out.println("Bank Account Interest Rs : 0.0");

    }
    public void displayAccountDetails(){
        System.out.println("Account Holder: "+accountHolderName+"");
        System.out.println("Account Number: "+accountNumber+"");
        System.out.println("Balance RS :"+balance+"");
        System.out.println("IFSC CODE :"+IFSC_CODE+"");
        
    }

}

class SavingsAccount extends BankAccount{
    protected double interestRate = 4.0;

    public SavingsAccount(String accountHolderName,String accountNumber,double balance){
        super(accountHolderName,accountNumber,balance);

    }
    public void calculateInterest(){
        double interest = balance*interestRate/100;
        System.out.println("Savings Account Interest RS :"+interest+"");
    }

}

class CurrentAccount extends BankAccount{
    protected double overdraftLimit = 5000.0;

    public CurrentAccount(String accountHolderName,String accountNumber,double balance){
        super(accountHolderName,accountNumber,balance);

    }

    public void checkOverdraftLimit(){
        System.out.println("Overdraft limit RS :"+overdraftLimit+"");

    }
    public void calculateInterest(){
        System.out.println("Current accounts do not earn interest.");
    }

}

class FixedDepositAccount extends BankAccount{
   protected double interestRate = 6.5; 
   protected int depositTerm;

   public FixedDepositAccount(String accountHolderName,String accountNumber,double balance, int depositTerm){
    super(accountHolderName,accountNumber,balance);
    this.depositTerm=depositTerm;
    if(depositTerm<0){
        System.out.println("Deposit term must be positive.");
        System.exit(0);
    }
   }
   public void calculateInterest(){
    double interest =balance*interestRate*depositTerm/100;
    System.out.println("Fixed Deposit Interest for 5 years RS :"+interest+"");
    
   }

}
