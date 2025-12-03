package com.nit.blc.factory_method;

public class Employee {
	private String name;
	private int id;
	private String department;
	private double salary;
	
	public Employee(String name, int id, String department, double salary) {
		this.name = name;
		this.id = id;
		this.department = department;
		this.salary = salary;
	}
	
	public static Employee createEmployeeObject(String name,int id,String department,double salary) {
		return new Employee(name,id, department,salary);
	}


	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", department=" + department + ", salary=" + salary +"Anual Salary=" +calculateAnnualSalary()+ "]";
	}
	
	public double calculateAnnualSalary() {
		double annualsal=salary*12;
		if(department.equalsIgnoreCase("sales")) {
			annualsal=annualsal*0.10+(annualsal);
		}
		else if(department.equalsIgnoreCase("Engineering")) {
			annualsal=annualsal*0.15+(annualsal);
		}
		else if(department.equalsIgnoreCase("HR")) {
			annualsal=annualsal*0.08+(annualsal);
		}
		else {
			annualsal=annualsal*0.05+(annualsal);
		}
		return annualsal;
	}
}
