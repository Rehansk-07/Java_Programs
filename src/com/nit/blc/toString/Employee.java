package com.nit.blc.toString;

public class Employee {
  private int id;
  private String name;
  private double salary;
  
  public void setEmployeeDetails(int id,String name, double salary) {
	  this.id=id;
	  this.name=name;
	  this.salary=salary;  
  }
  public void calculateSalaryIncrement() {
	 if(salary<50000) {
		double increament=salary*0.1;
		salary+=increament;
		System.out.println("Salary increament amount is:"+increament);
	 }
	 else if(salary<50000 && salary>80000) {
		double increament=salary *0.07;
		 salary+=increament;
		 System.out.println("Salary increament amount is:"+increament);
	 }
	 else{
		 double increament=salary *0.05;
		salary+=increament;
		System.out.println("Salary increament amount is:"+increament);
	 }
	 System.out.println(" Updated Salary is:"+salary);
	 
  }
 
  public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
  }
  
  
}
