package com.nit.scenario_based;

public class CardOnOffer 
	{
	public static CardType getOfferedCard(Customer obj)
	{
		int creditPoint = obj.getCreditPoints();
		
		if(creditPoint >=100 && creditPoint <=500)
		{
			return new CardType(obj,"silver");
		}
		else if(creditPoint >500 && creditPoint <=100)
		{
			return new CardType(obj,"Gold");
		}
		else if(creditPoint > 1000)
		{
			return new CardType(obj,"Platinum");	
		}
		else 
		{
			return new CardType(obj,"EMI");
		 }
	   }
	}
	
	
	

