package com.nit.scenario_based2;

import java.util.Scanner;

public class TaxCalculation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Employee id:");
		int eid=Integer.parseInt(sc.nextLine());
		System.out.print("Enter Employee Name:");
		String ename=sc.nextLine();
		System.out.print("Enter Employee Salary:");
		double esalary=Double.parseDouble(sc.nextLine());
		System.out.print("Enter Employee HRA:");
		double ehra=Double.parseDouble(sc.nextLine());
		System.out.print("Enter Employee DA;");
		double eda=Double.parseDouble(sc.nextLine());
		Employee emp=new Employee(eid, ename, esalary, ehra, eda);
		TaxUtil tax1 = new TaxUtil();
		System.out.println("Employee Tax:" +tax1.calculateTax(emp));
		
		System.out.println("======================================================");
		
		System.out.print("Enter Manager id:");
		int mid=Integer.parseInt(sc.nextLine());
		System.out.print("Enter Manager Name:");
		String mname=sc.nextLine();
		System.out.print("Enter Manager Salary:");
		double msalary=Double.parseDouble(sc.nextLine());
		System.out.print("Enter Manager HRA:");
		double mhra=Double.parseDouble(sc.nextLine());
		System.out.print("Enter Manager DA:");
		double mda=Double.parseDouble(sc.nextLine());
		System.out.print("Enter project Allowance:");
		double mpa=Double.parseDouble(sc.nextLine());
		Manager m = new Manager(mid, mname, msalary, mhra, mda, mpa);
		TaxUtil tax2 = new TaxUtil();
		System.out.print("Manager Tax:" +tax2.calculateTax(m));
		
		System.out.println("==============================================================");

		System.out.print("Enter Trainer id:");
		int tid=Integer.parseInt(sc.nextLine());
		System.out.print("Enter Trainer Name:");
		String tname=sc.nextLine();
		System.out.print("Enter Trainer Salary:");
		double tsalary=Double.parseDouble(sc.nextLine());
		System.out.print("Enter trainer HRA:");
		double thra=Double.parseDouble(sc.nextLine());
		System.out.print("Enter Trainer DA;");
		double tda=Double.parseDouble(sc.nextLine());
		System.out.print("Enter Trainer Batch Count:");
		Trainer t=new Trainer(tid, tname, tsalary, thra, mda, tid, tda); 
		TaxUtil tax3 = new TaxUtil();
		System.out.println("Trainer Tax:" +tax3.calculateTax(t));
		
		System.out.println("==============================================================");
		
	
		System.out.print("Enter Source id:");
		int sid=Integer.parseInt(sc.nextLine());
		System.out.print("Enter Source Name:");
		String sname=sc.nextLine();
		System.out.print("Enter Source Salary:");
		double ssalary=Double.parseDouble(sc.nextLine());
		System.out.print("Enter Source HRA:");
		double shra=Double.parseDouble(sc.nextLine());
		System.out.print("Enter Source DA;");
		double sda=Double.parseDouble(sc.nextLine());
		System.out.print("Enter Enrollment Targer:");
		int st=Integer.parseInt(sc.nextLine());
		System.out.print("Enter Enrollment Reached:");
		int sr=Integer.parseInt(sc.nextLine());
		System.out.print("Enter perkPerEnrollment");
		double skpe=Double.parseDouble(sc.nextLine());
		Sourcing s = new Sourcing(eid, ename, ssalary, shra, sda, st, sr, skpe);
		TaxUtil tax4 = new TaxUtil();
		System.out.print("Source Tax:" +tax4.calculateTax(s));
		
	}
}
