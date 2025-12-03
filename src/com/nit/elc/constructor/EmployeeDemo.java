package com.nit.elc.constructor;

import java.util.Scanner;

import com.nit.blc.constructor.Employee;
public class EmployeeDemo {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Employee first name");
		String fname=sc.nextLine();
		System.out.println("Enter Employee last name");
		String lname=sc.nextLine();
		System.out.println("Enter Employee Id");
		int eid= Integer.parseInt(sc.nextLine());
		System.out.println("Enter Employee Salary");
		double salary= Double.parseDouble(sc.nextLine());
		System.out.println("Enter Number Of Project");
		int nop=Integer.parseInt(sc.nextLine());
		
		Employee E1=new Employee(fname , lname , eid , salary , nop);
		System.out.println(E1);
		sc.close();
		
	}

}
