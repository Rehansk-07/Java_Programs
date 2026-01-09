package com.nit.collection_framework;
import java.util.*;

record Customer(Integer custId, String customerName,String pickupLocation,String dropLocation, Integer distance, String phone) {
	
}

class CustomerService{
	private ArrayList<Customer> customers;
	
	public CustomerService(ArrayList<Customer> customer) {
		customers=new ArrayList<>(customer);
	}
	public void addCustomer(Customer customer) {
		customers.add(customer);
	}
	private boolean isFirstCustomer(Customer customer) {
		boolean flag=false;
		for (Customer cust : customers) {
			if(customer.phone().equals(cust.phone())) {
				flag=true;
			}
		}
		if (!flag) {
			return true;
		} else {
            return false;
		}
		
	}
	public double calculateBill(Customer customer) {
		double fixedBill=80.0;
		if(isFirstCustomer(customer)) {
			if(customer.distance()<=4) {
				return fixedBill;
			}
			else if(customer.distance()>4) {
				return fixedBill+(4-customer.distance())*6;
			}
		}
		return 0.0;
	}


public void printBill() {
	for (Customer customer : customers) {
		
		IO.println(customer.customerName()+ " Please pay your bill of " +calculateBill(customer));
	}
}

}






public class CabCustomerServiceTester {

	public static void main(String[] args) {
		ArrayList<Customer> customers=new ArrayList<>();
		customers.add( new Customer(101,"jhon","Hyd", "Sec", 4, "9985689562"));
 Customer cust=new		Customer(101,"jhon","Hyd", "Sec", 4, "9985689562");

        CustomerService customerService=new CustomerService(customers);
       customerService.addCustomer(cust);
       // customerService.addCustomer(customers);

        customerService.printBill();
	}

}
