package com.nit.interface_Scenerio;

import java.util.Scanner;

interface Payments{
	
	abstract public void processPayment();
	abstract public void applyDiscount();
}


class CreditCardPayments implements Payments{

	@Override
	public void processPayment() {
		System.out.println("Initiating Credit Card payment");
		System.out.println("Processing Credit Card payment...");
}

	@Override
	public void applyDiscount() {
		System.out.println("Applying 10% discount for UPI paymen");	
	}	
}

class UPIPayments implements Payments{

	@Override
	public void processPayment() {
		System.out.println("Initiating UPI payment");
		System.out.println("Processing UPI payment...");
	}

	@Override
	public void applyDiscount() {
		System.out.println("Applying 5% discount for UPI paymen");
	}	
}

class PaymentGateway{
	public Payments initiatePayment(String PaymentType) {
		Payments p = null;
		if(PaymentType.equalsIgnoreCase("CreditCard")) {
			p = new CreditCardPayments();
			p.processPayment();
			p.applyDiscount();
		}
		
		else if(PaymentType.equalsIgnoreCase("UPIPayment")) {
			p = new UPIPayments();
			p.processPayment();
			p.applyDiscount();
		}
		else {
			
			System.out.println("Invalid payment type selected!");
		}
		
		
		return p;
	}
}

public class PaymentGatewayUsingInterface {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Payment Type [CreditCard / UPIPayment]:");
		
		String card = sc.nextLine();
		PaymentGateway p2 = new PaymentGateway();
		p2.initiatePayment(card);
		
		
	}

}
