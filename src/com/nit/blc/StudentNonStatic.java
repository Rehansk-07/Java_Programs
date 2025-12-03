package com.nit.blc;

public class StudentNonStatic {
	int StudentId;
	String StudentName;
	int StudentMarks;
	char StudentGrade;
	public void setStudentData(int id, String name, int marks) {
		StudentId=id;
		StudentName = name;
		StudentMarks = marks;	
	}
	public void getStudentDetails() {
		System.out.println("Student id is :"+StudentId);
		System.out.println("Student Name is  :"+StudentName);
		System.out.println("Student Marks is  :"+StudentMarks);
		
		if(StudentMarks>90){
			StudentGrade = 'A';
			System.out.println("Student Grade is "+StudentGrade);
		}
		else if (StudentMarks>81 && StudentMarks<90) {
			StudentGrade = 'B';
			System.out.println("Student Grade is : "+StudentGrade);
		}
		else if (StudentMarks>71 && StudentMarks<80) {
			StudentGrade = 'C';
			System.out.println("Student Grade is : "+StudentGrade);
		}
		else if (StudentMarks>61 && StudentMarks<70) {
			StudentGrade = 'D';
			System.out.println("Student Grade is : "+StudentGrade);
		}
		else {
			StudentGrade = 'E';
			System.out.println("Student Grade is : "+StudentGrade);
			
		}
	
	}

}
