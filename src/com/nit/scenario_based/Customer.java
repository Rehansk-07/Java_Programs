package com.nit.scenario_based;

public class Customer {
	private String customerName;
	private int creditPoints;
	
	public Customer(String customerName, int creditPoints) {
		this.customerName=customerName;
		this.creditPoints=creditPoints;
	
		}
	public int getCreditPoints() {
		return this.creditPoints;
	
		}
	public String toString() {
		return this.customerName;
	}
}
