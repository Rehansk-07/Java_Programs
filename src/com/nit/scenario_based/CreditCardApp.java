package com.nit.scenario_based;

import java.util.Scanner;

public class CreditCardApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Customer Name :");
		String name= sc.nextLine();
		
		System.out.print("Enter Customer Credit Point :");
		int creditPoint = Integer.parseInt(sc.nextLine());
		
		Customer c1 = new Customer(name,creditPoint);
		CardType offeredCard = CardOnOffer.getOfferedCard(c1);
		
		System.out.println(offeredCard);
		sc.close();
	}

}
