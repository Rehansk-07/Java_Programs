package com.nit.interface_Scenerio;

interface Printer{
	abstract public void print();
}

class PrintDemo{
	public Printer getPrinter() {
		Printer p1 = new Printer() {
			public void print() {
				System.out.println("Override print method");
			}
		};
		return p1;
	}
}



public class InterfaceImplementationByUsingAnonymous {

	public static void main(String[] args) {
		PrintDemo p2 = new PrintDemo();
		Printer printer = p2.getPrinter();
		printer.print();
	}

}
