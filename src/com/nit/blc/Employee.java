package com.nit.blc;

public class Employee {
	int EmployeeId;
	String EmployeeName;
	double EmployeeSalary;
	
	public void setEmployeeData(int id, String name, double salary )
	{
		EmployeeId = id;
		EmployeeName = name;
		EmployeeSalary = salary;	
	}
	public void getEmployeeData() {
		System.out.println("Employee Id is : "+EmployeeId);
		System.out.println("Employee Name is : "+EmployeeName);
		System.out.println("Employee Salary is : "+EmployeeSalary);
	}
	
}
