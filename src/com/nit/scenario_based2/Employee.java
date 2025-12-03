package com.nit.scenario_based2;

public class Employee {
	private int employeeId;
	private String employeeName;
	private double basicSalary;
	private double hraPer;
    private	double daPer;
    
    public Employee(int employeeId, String employeeName,double basicSalary, double hraPer,double daPer) {
    
    	this.employeeId=employeeId;
    	this.employeeName=employeeName;
    	this.basicSalary=basicSalary;
    	this.hraPer=hraPer;
    	this.daPer=daPer;	
    }
    public double calculateGrossSalary() {
    	return this.basicSalary+this.hraPer+this.daPer;
    }
}
