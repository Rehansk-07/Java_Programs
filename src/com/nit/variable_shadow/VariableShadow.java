package com.nit.variable_shadow;

class Student{
  private int roll=101;
  private String name="jhony";
  public static String couse="java";
  
  public void accept(int roll) {
	  String name="Rahman";
	  String course ="css";  
	  
	  System.out.println("ROll no is :"+roll);
	  System.out.println("Name is"+name);
	  System.out.println("COurse is :"+course);
  }
}

public class VariableShadow {

	public static void main(String[] args) {
		Student s1 =new Student();
		s1.accept(202);
	}

}
