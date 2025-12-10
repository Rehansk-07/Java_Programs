package com.nit.interface_Scenerio;

sealed interface Payment{
	
	void makePayment(double amount);
	void makeRefund(double amount);
}	
	non-sealed class CreditCardPayment implements Payment{
	
	private String cardHolderName;
	 public CreditCardPayment(String cardHolderName) {
		this.cardHolderName=cardHolderName;
	}
	public void makePayment(double amount) {
		
	}
	public void makeRefund(double amount) {
		
	}
  }	



non-sealed class DebitCardPayment implements Payment{
	private String bankName;
	
	public DebitCardPayment(String bankName) {
		this.bankName=bankName;
	}
	
	public void makePayment(double amount) {
		
	}
	public void makeRefund(double amount) {
		
	}
 }


non-sealed class UPIPayment implements Payment{
	private String upiId;
	
	public UPIPayment(String upiId) {
		this.upiId=upiId;
	}
	public void makePayment(double amount) {
		
	}
	public void makeRefund(double amount) {
		
	}
}

class ShoppingCart{
	private double totalAmount;
	
	public ShoppingCart(double totalAmount) {
		this.totalAmount=totalAmount;
	}
	public void Checkout(Payment p) {
	System.out.println("starting checkout for amount RS :" +totalAmount);
	if( p instanceof CreditCardPayment c) {
		c.makePayment(totalAmount);
	}
	else if(p instanceof DebitCardPayment d) {
		d.makePayment(totalAmount);
	}
	else if(p instanceof UPIPayment u) {
		u.makePayment(totalAmount);
	}
		
  }
	public void cancelOrder(Payment p) {
		System.out.println("Order Canceled. Initiating Refund...");
		if(p instanceof CreditCardPayment c) {
			c.makeRefund(totalAmount);
		}
		else if(p instanceof DebitCardPayment d) {
			d.makeRefund(totalAmount);
		}
		else if(p instanceof UPIPayment u) {
			u.makeRefund(totalAmount);
		}
		
		
	}
}




public class Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
