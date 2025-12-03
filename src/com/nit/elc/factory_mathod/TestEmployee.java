package com.nit.elc.factory_mathod;

import java.util.Scanner;

import com.nit.blc.factory_method.Employee;

public class TestEmployee {

	public static void main(String[] args) {
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Employee ID:");
			int eid=Integer.parseInt(sc.nextLine());
			System.out.println("Enter Employee name:");
			String ename=sc.nextLine();
			System.out.println("Enter Employee Monthly salary:");
			double esalary=Double.parseDouble(sc.nextLine());
			System.out.println("Enter Department(Sales, Engineering, HR, Other)");
			String edepartment=sc.nextLine();
			
			System.out.println("Enter Details for Employee 1");
			Employee e1= Employee.createEmployeeObject(ename, eid, edepartment, esalary);
			System.out.println(e1);
			
			
			System.out.println("Do you want to continue:");
			String choice=sc.nextLine();
		
			if(choice.equalsIgnoreCase("no")) {
				break;
			}
		}
	}

}
