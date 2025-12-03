package com.nit.elc.toString;

import java.util.Scanner;

import com.nit.blc.toString.Employee;

public class EmployeeDemo {

	public static void main(String[] args) {
		Employee em=new Employee();
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter id");
		int id=Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter Name");
		String name = sc.nextLine();
		
		System.out.println("Enter Salary");
		double salary=Double.parseDouble(sc.nextLine());
		
		System.out.println("------Salary Increament Details------");
		em.setEmployeeDetails(id, name, salary);
		System.out.println(em.toString());
		em.calculateSalaryIncrement();
		sc.close();

	}

}
