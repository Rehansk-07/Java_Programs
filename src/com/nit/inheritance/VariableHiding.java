//program for VariableHiding.java concept.

package com.nit.inheritance;

class Employee{
	protected double salary = 700000;
}
class Developer extends Employee{
	protected double salary = 900000;//Variable Hiding
	
	public void getSalaryInfo() {
		System.out.println("Employee Salary is :"+super.salary);
		System.out.println("Developer Salary is :"+this.salary);
	}
}

public class VariableHiding {

	public static void main(String[] args) {
		Developer developer = new Developer();
		developer.getSalaryInfo();
	}

}
