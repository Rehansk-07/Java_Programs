package com.nit.scenario_based;

import java.util.Scanner;

public class StudentGradeCalculator {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter Student Name :");
		String name=sc.nextLine();
		System.out.print("Enter Student marks :");
		int marks=Integer.parseInt(sc.nextLine());
		
		Student s1=new Student(name,marks);
		System.out.println(CalculateStudentGrade.CalculateStudentGrade(s1));	
	}

}
