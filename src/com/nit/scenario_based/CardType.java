package com.nit.scenario_based;

public class CardType {
	private Customer customer;
	private String cardType;
	
	public CardType(Customer customer, String cardType) {
		this.customer=customer;
		this.cardType=cardType;	
	}
	public String toString() {
		return "The Customer '"+this.customer+"' Is Eligible For '"+this.cardType+"' Card.";
	}
}
