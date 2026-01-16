package com.nit.oops;



class Employee
{
	int employeeId;
	String employeeName;
	double employeeSalary;
	char employeeGrade;
	
	
	public void setEmployeeData(int id, String name, double salary) {
		
		this.employeeId = id;
		this.employeeName = name;
		this.employeeSalary = salary;
		
	}
	
	public void getEmployeeData()
	{
		IO.println("Employee Id is : " +employeeId);
		IO.println("Employee Name is :"+employeeName);
		IO.println("Employee Salary is :"+employeeSalary);
		IO.println("Employee Grade is : "+employeeGrade);
		
	}
	
	public void calculate()
	{
		if(employeeSalary>=75000) 
		{
			employeeGrade = 'A';	
		}
		else if(employeeSalary>=5000)
		{
			employeeGrade = 'B';
		}
		else if(employeeSalary>=4000)
		{
			employeeGrade ='C';
			
		}
		else
		{
			employeeGrade = 'D';
		}	
	}	
}


public class EmployeDetails {

	public static void main(String[] args) {
		
		int id = Integer.parseInt(IO.readln("Enter your id:"));
		String name = IO.readln("Enter your name:");
		double salary = Double.parseDouble(IO.readln("Enter your salary:"));
		
		Employee e1 = new Employee();
		e1.setEmployeeData(id, name, salary);
		e1.calculate();
		e1.getEmployeeData();
	}

}
