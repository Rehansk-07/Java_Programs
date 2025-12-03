package com.nit.inheritance;

import java.util.Scanner;

class Employee2{
	protected int employeeId;
	protected String employeeName;
	protected double employeeSalary;
	
	public Employee2(int employeeId, String employeeName, double employeeSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}	
}

class PermanentEmployee extends Employee2{
	protected double providentFund=super.employeeSalary*0.12;

	public PermanentEmployee(int employeeId, String employeeName, double employeeSalary) {
		super(employeeId, employeeName, employeeSalary);
		
	}

	@Override
	public String toString() {
		return "PermanentEmployee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + ", providentFund=" + providentFund + "]";
	}	
	public void netSalary() {
	double netSalary = employeeSalary+providentFund;
	System.out.println(netSalary);
	}
}

class ContractEmployee extends Employee2{
	protected int contractDuration;

	public ContractEmployee(int employeeId, String employeeName, double employeeSalary, int contractDuration) {
		super(employeeId, employeeName, employeeSalary);
		this.contractDuration = contractDuration;
	}

	@Override
	public String toString() {
		return "ContractEmployee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + ", contractDuration=" + contractDuration + "]";
	}
}

public class EmployeeHierarchicalInheritance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Permanent Employee Id:");
		int id = Integer.parseInt(sc.nextLine());
		System.out.print("Enter Permanet Employee Name:");
		String name = sc.nextLine();
		System.out.print("Enter Permanent Employee Salary:");
		double salary = Double.parseDouble(sc.nextLine());
		PermanentEmployee p1 = new PermanentEmployee(id, name, salary);
		System.out.println(p1.toString());
		p1.netSalary();
		
		
		
		System.out.print("Enter Contract Employee Id:");
		int cid = Integer.parseInt(sc.nextLine());
		System.out.print("Enter Contract Employee Name:");
		String cname = sc.nextLine();
		System.out.print("Enter Contract Employee Salary:");
		double csalary = Double.parseDouble(sc.nextLine());
		System.out.print("Enter Contract Employee Duration in year:");
		int duration = Integer.parseInt(sc.nextLine());
		
		ContractEmployee p2 = new ContractEmployee(cid, cname, csalary, duration);
		System.out.println(p2.toString());
		
	}

}
