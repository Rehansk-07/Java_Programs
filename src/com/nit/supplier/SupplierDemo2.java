package com.nit.supplier;
import java.util.function.Supplier;

record Player(Integer id, String name) {
	
}
public class SupplierDemo2 {

	public static void main(String[] args) {
		Supplier<Player> s2 =()->new Player(18, "Dhoni");
		Player player = s2.get();
		IO.println(player);
	}

}
