package com.nit.consumer;
import java.util.function.Consumer;

record Product(Integer id , String name , Double price) {
	
}

public class ConsumerDemo1 {

	public static void main(String[] args) {
		Consumer<Integer> c1 = num -> IO.println("Integer object :"+num);
		c1.accept(12);
		
		Consumer <Double> c2 = dbl -> IO.println("Double object :"+dbl);
		c2.accept(23d);
		
		Consumer<String> c3 = str -> IO.println("String object :"+str);
		c3.accept(new String("java"));
		
		Consumer<Product> c4 = prod -> IO.println("Product object :"+prod);
		c4.accept(new Product(1, "Laptop", 96000d));
	}

}
