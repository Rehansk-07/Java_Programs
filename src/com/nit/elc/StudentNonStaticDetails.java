package com.nit.elc;

import java.util.Scanner;

import com.nit.blc.StudentNonStatic;

public class StudentNonStaticDetails {

	public static void main(String[] args) {
		StudentNonStatic st = new StudentNonStatic();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Id");
		int sid = Integer.parseInt(sc.nextLine());
		
	    System.out.println("Enter Your Name");
	    String sname = sc.nextLine();
	    
	    System.out.println("Enter Your marks");
	    int smarks =Integer.parseInt(sc.nextLine());
	    
	    st.setStudentData(sid, sname, smarks);
	    st.getStudentDetails();
	    sc.close();
	    
	}

}
