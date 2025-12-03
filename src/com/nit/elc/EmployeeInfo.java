package com.nit.elc;

import java.util.Scanner;

import com.nit.blc.Employee;

public class EmployeeInfo {

	public static void main(String[] args) {
		Employee Rehan = new Employee();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Id");
		int Eid = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter Employee name");
		String EName = sc.nextLine();
		
		System.out.println("Enter Employee Salary");
		double ESalary = Double.parseDouble(sc.nextLine());
		
		Rehan.setEmployeeData(Eid, EName, ESalary);
		Rehan.getEmployeeData();
		sc.close();

	}

}
