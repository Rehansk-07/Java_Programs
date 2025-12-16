package com.nit.predicate;
import java.util.Scanner;
import java.util.function.Consumer;

public class ValueModifier {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Original value :");
		int ovalue = Integer.parseInt(sc.nextLine());
		System.out.print("Increatment value :");
		int ivalue = Integer.parseInt(sc.nextLine());
				
				
		Consumer<Integer>doubleValue = d-> System.out.println(d*2);
		Consumer<Integer>incrementBy = i-> System.out.println(i+ivalue);
		Consumer<Integer>squareValue = sq-> System.out.println(sq*sq);
		modifyValue(ovalue,doubleValue);
		modifyValue(ovalue,incrementBy);
		modifyValue(ovalue,squareValue);

  }
	public static void modifyValue(int value, Consumer<Integer>v1) {
		v1.accept(value);
	}
}
