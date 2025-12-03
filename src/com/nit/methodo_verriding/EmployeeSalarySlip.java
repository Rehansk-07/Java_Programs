package com.nit.methodo_verriding;

import java.util.Scanner;
public class EmployeeSalarySlip{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choice=sc.nextInt();
        Employee e;

        if(choice==1){
            int id = sc.nextInt();
            sc.nextLine();
            String name= sc.next();
            double salary=sc.nextDouble();
            e=new FulltimeEmployee(id,name,salary);
            System.out.println(""+name+" Salary is : "+e.calculateSalary()+"");
        }
        else{
            int id =sc.nextInt();
            sc.nextLine();
            String name= sc.next();

            double rate = sc.nextDouble();
            int hoursWorked =sc.nextInt();
           
            e= new PartTimeEmployee(id,name,rate,hoursWorked);
            System.out.println(""+name+" Salary is :"+e.calculateSalary());
        }



    }
}



class Employee{

 protected int id;
 protected String name;

 public Employee(int id, String name){
    this. id=id;
    this.name=name;
 }

 public double calculateSalary(){
    return 0.0;
  }

 }

 class FulltimeEmployee extends Employee{
    protected double salary;

    public FulltimeEmployee(int id , String name, double salary){

        super(id,name);
        if(salary>0){
        this.salary=salary;
        }
        else{
            System.out.println("Salary can't be negative!!!");
            System.exit(0);
        }
    }

    public double calculateSalary(){
        return salary;
    }
 }

 class PartTimeEmployee extends Employee{
    protected double hourlyRate;
    protected int hoursWorked;

    public PartTimeEmployee(int id, String name, double hourlyRate,int hoursWorked){
        super(id,name);
        if(hourlyRate>0){

        this.hourlyRate=hourlyRate;
        }
        else{
            System.out.println("Employee hourly rate can't be zero OR Negative");
            System.exit(0);
        }
        this.hoursWorked=hoursWorked;
    }

    public double calculateSalary(){
        return hoursWorked*hourlyRate;
    }
 }
