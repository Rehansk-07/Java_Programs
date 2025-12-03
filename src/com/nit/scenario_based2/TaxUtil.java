package com.nit.scenario_based2;

public class TaxUtil {
	public double calculateTax(Employee e) {
		double salary=e.calculateGrossSalary();
		if(salary>50000) {
			return salary*0.20;
		}
		else {
			return salary*0.05;
		}
	}
	
	public double calculateTax(Manager m) {
		double salary=m.calculateGrossSalary();
		if(salary>50000) {
			return salary*0.20;
		}
		else {
			return salary*0.05;
		}
	}
	
	public double calculateTax(Trainer t) {
		double salary=t.calculateGrossSalary();
		if(salary>50000) {
			return salary*0.20;
		}
		else {
			return salary*0.05;
		}
	}
	
	public double calculateTax(Sourcing s) {
		double salary=s.calculateGrossSalary();
		if(salary>50000) {
			return salary*0.20;
		}
		else {
			return salary*0.05;
		}
	}
	
}
