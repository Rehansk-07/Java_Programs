package com.nit.array;
import java.util.Scanner;

public class StudentArrayDemo {
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Please Enter Array Size:");
	  int size= Integer.parseInt(sc.nextLine());
	  Student1 student[]=new Student1[size];
	  
	  for(int i=0;i<size;i++) {
		  System.out.println("Enter Student Id:");
		  int id = Integer.parseInt(sc.nextLine());
		  System.out.println("Enter Student Name:");
		  String name= sc.nextLine();
		  System.out.println("Enter Student Marks:");
		  double marks = Double.parseDouble(sc.nextLine()); 
		  student[i]=new Student1(id, name, marks);  
	  }
	  System.out.println("OutPut :");
	  System.out.println("---------------");
	  for(int i=0;i<size;i++) {
		  System.out.println(student[i]);
	  }
	  
	  
	  
	  
  }
}
