package com.nit.elc;

import java.util.Scanner;

import com.nit.blc.EmployeeNonStatic;

public class EmoloyeeNonStaticDetails {

	public static void main(String[] args) {
		EmployeeNonStatic Et = new EmployeeNonStatic();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee first name");
		String Ename=sc.nextLine();
		
		System.out.println("Enter Employee Last Name");
		String Elname=sc.nextLine();
		
		System.out.println("Enter Employee Id ");
		int Eid= Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter Employee Salary");
		double Esal=Double.parseDouble(sc.nextLine());
		
		System.out.println("Enter Employee Projects");
		int Eproj=Integer.parseInt(sc.nextLine());
		
		Et.setEmployeeData(Ename, Elname, Eid, Esal, Eproj);
		Et.CalculateSalary();
		Et.getEmployeeDetails();
		sc.close();

	}

}
