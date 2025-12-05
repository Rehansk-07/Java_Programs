package com.nit.methodo_verriding;

class Payment12{
	public void makePayment() {
		System.out.println("Generic Payment");
	}
}

class CreditCard extends Payment12{
	public void makePayment() {
		System.out.println("Payment through credit card");
	}
}

class DebitCard extends Payment12{
	public void makePayment() {
		System.out.println("Payment through Debit Card");
	}
}

class UPI extends Payment12{
	public void makePayment() {
		System.out.println("Payment though UPI");
	}
}
public class MethodOverridingDemo2 {

	public static void main(String[] args) {
		Payment12 p = null;
		
		p= new CreditCard();  p.makePayment();
		p= new DebitCard();   p.makePayment();
		p= new UPI();         p.makePayment();

	}

}
