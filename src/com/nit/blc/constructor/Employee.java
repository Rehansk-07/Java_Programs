package com.nit.blc.constructor;

public class Employee {
   private String firstName;
   private String lastName;
   private int employeeId;
   private double salary;
   private int noofProject;
   
   
   public Employee(String firstName, String lastName, int employeeId, double salary, int noofProject) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.employeeId = employeeId;
	this.salary = salary;
	if(noofProject > 5) {
	 this.noofProject = noofProject;
	}
	else {
		System.err.println("NoOfProject must be greater than 5");
		System.exit(0);
	}
	
   }
   
   public void calculateSalary() {
	   if(noofProject>5 && noofProject<10) {
		   salary+=5000;   
	   }
	   else if(noofProject>=10 && noofProject<20) {
		   salary+=10000;   
	   }
	   
	   else {
		   salary+=15000;
	   }
	   System.out.println("The updated salary is"+salary);
   }

   public String toString() {
	return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", employeeId=" + employeeId + ", salary="
			+ salary + ", NoofProject=" + noofProject + "]";
   }
   
   
   
   
}
