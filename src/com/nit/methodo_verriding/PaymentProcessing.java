package com.nit.methodo_verriding;

class Payment{
	
	public void processPayment() {
	System.out.println("Processing payment");
  }
}

class CreditCardPayment extends Payment{
	public void processPayment() {
		System.out.println("Processing credit card payment");
	}
}

class DebitCardPayment extends Payment{
	public void processPayment() {
		System.out.println("Processing Debit Card Payment.");
	}
}

class UPIPayment extends Payment{
	public void processPayment() {
		System.out.println("Processing UPI Payment");
	}
}

public class PaymentProcessing {
	public static void paymentGateway(Payment ...payments) {
		for(Payment p : payments) {
			p.processPayment();
		}
	}

	public static void main(String[] args) {
		Payment p1 = new CreditCardPayment();
		p1.processPayment();
		Payment p2= new DebitCardPayment();
		p2.processPayment();
		Payment p3 = new UPIPayment();
		p3.processPayment();

	}

}
