package com.nit.blc;

public class EmployeeNonStatic {
	String firstName;
	String lastName;
	int employeeId;
	double Salary;
	int noOfProject;
	
	public void setEmployeeData(String name , String Lname, int id, double salary, int projects) {
		firstName = name;
		lastName = Lname;
		employeeId = id;
		Salary = salary;
		noOfProject = projects;
	}
	public void CalculateSalary() {
		if (noOfProject>5 && noOfProject<10) {
			Salary = Salary + 5000;
		}
		else if (noOfProject >10 && noOfProject <20) {
			Salary = Salary + 10000;
		}
		else{
			Salary = Salary + 15000;
		}
	}
	public void getEmployeeDetails() {
		System.out.println("Employee First Name is :"+firstName);
		System.out.println("Employee Last Name is :"+lastName);
		System.out.println("Employee Id is :"+employeeId);
		System.out.println("Employee Salary is :"+Salary);
		System.out.println("Employee Projects is :"+noOfProject);
	}
}
