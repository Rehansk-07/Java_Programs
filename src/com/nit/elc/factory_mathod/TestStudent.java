package com.nit.elc.factory_mathod;

import java.util.Scanner;

import com.nit.blc.factory_method.Student;

public class TestStudent {

	public static void main(String[] args) {
		while(true) {
			Scanner sc =new Scanner(System.in);
			                                                                                                                           
			System.out.println("Enter Student Name");
			String st= sc.nextLine();
			System.out.println("Enter Student age");
			int sa=Integer.parseInt(sc.nextLine());
			System.out.println("Enter student grade");
			String sg=sc.nextLine();
			
			Student s1= Student.createStudentObject(st, sa, sg);
			System.out.println(s1);
			
			System.out.println("Do you want to continue [yes/no]");
			String choice=sc.nextLine();
			
			if(choice.equalsIgnoreCase("no")) {
				break;
			}
		}
	}

}
