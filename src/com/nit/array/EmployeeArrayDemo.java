package com.nit.array;

import java.util.Scanner;

public class EmployeeArrayDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Employees");
		int size=Integer.parseInt(sc.nextLine());
		Employee employee[]=new Employee[size];
		
		for(int i=0;i<size;i++) {
			System.out.println("Enter details for Employee:"+(i+1));
			System.out.print("Enter ID:");
			int id=Integer.parseInt(sc.nextLine());
			System.out.print("Enter Name:");
			String name=sc.nextLine();
			System.out.println("Enter Salary:");
			double salary=Double.parseDouble(sc.nextLine());
			employee[i]=new Employee(id, name, salary);	
		}
		System.out.println("=====Employee Details=====");
		for(int i=0;i<size;i++) {
			System.out.println(employee[i]);
		}

	}

}
