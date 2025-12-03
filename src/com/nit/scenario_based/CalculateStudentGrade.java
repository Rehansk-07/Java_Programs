package com.nit.scenario_based;

public class CalculateStudentGrade {
	public static StudentGrade CalculateStudentGrade(Student obj) {
		int marks=obj.getMarks();
		char grade = '0';
		
		 if(marks>=90 && marks<=100 ) {
			   grade='A';
		  }
		 else if(marks>=75 && marks <90) {
			 grade='B';
		 }
		 else if(marks>=60 && marks <75) {
			 grade='C';
		 }
		 else if(marks<60 ){
			 grade='D';
		 }
		 else {
			 System.err.println("Error");
		 }
		  return new StudentGrade(obj, grade);	
	}
}
