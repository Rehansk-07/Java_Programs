package com.nit.functional_interface_scenario;

import java.util.function.Function;

public class CalculateProductDiscount {

	void main() {
		record Product(Integer id, String name, Double price) {
			
		}
		Integer id = Integer.parseInt(IO.readln("Enter Product ID:"));
		String name = IO.readln("Enter Product Name:");
		Double price = Double.parseDouble(IO.readln("Enter Product Price:"));
		Product p1 = new Product(id,name,price);
		
		Function<Product,Double> prod = p->{
			if(p.price>=5000) {
				 Double discount = p.price*0.10;
				return p.price-discount;
			}
			else {
				Double discount1 = p.price*0.05;
				return p.price-discount1;	
			}
		};
			IO.println("Final price of the product is :"+prod.apply(p1));
	}

}
