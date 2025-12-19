package com.nit.predicate;
import java.util.function.Predicate;

record Student(Integer id, String name, double mark) {
	public String toString() {
		return ""+id+" : "+name+" : " +mark;
	}
}

public class PredicateDemo4 {

	public static void main(String[] args) {
		Predicate <Student> p4 = student -> student.mark()>=80;
		int id = Integer.parseInt(IO.readln("Enter your Id :"));
		String name = IO.readln("Enter your name :");
		double mark = Double.parseDouble(IO.readln("Enter your marks :"));
		
		Student s1 = new Student(id, name, mark);
		
		if(p4.test(s1)) {
			IO.println(s1+"PASS");
		}
		else {
			IO.println(s1+"Fail");
		}
	}

}
