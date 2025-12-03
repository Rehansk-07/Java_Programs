package com.nit.blc.encapsulation;

public class Loan {
  private double principle;
  private double interestRate;
  private int durationMonths;
  
  public Loan(double principle, double interestRate, int durationMonths) {
	  
    if(principle<=0 || interestRate<=0 || durationMonths<=0) {
	System.err.println("Invalid");
	System.exit(0);
	}
	this.principle = principle;
	this.interestRate = interestRate;
	this.durationMonths = durationMonths;
	
  }

  public double getPrinciple() {
	return principle;
  }

  public void setPrinciple(double principle) {
	this.principle = principle;
  }

  public double getInterestRate() {
	return interestRate;
  }

  public void setInterestRate(double interestRate) {
	this.interestRate = interestRate;
  }

  public int getDurationMonths() {
	return durationMonths;
  }

  public void setDurationMonths(int durationMonths) {
	this.durationMonths = durationMonths;
  } 
  
  
}
