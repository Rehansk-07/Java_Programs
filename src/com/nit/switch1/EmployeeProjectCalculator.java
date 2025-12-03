package com.nit.switch1;

import java.util.Scanner;

public class EmployeeProjectCalculator {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Employee Salary");
		double salary= Double.parseDouble(sc.nextLine());
		System.out.println("Enter Projects");
		int project=Integer.parseInt(sc.nextLine());
		
		switch(project) {
		case 5,6,7,8,9,10 ->  salary +=5000;  
		case 11,12,13,14,15,16,17,18,19,20 ->  salary+=10000;
		default -> salary+=15000;
		}	
		System.out.println("salary is "+salary);
		sc.close();
	}

}
