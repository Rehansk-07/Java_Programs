package com.nit.instanceof_optr;
class Alpha{
	
}
class Beta extends Alpha{
	
}
class Gamma extends Beta{
	
}
public class InstanceofDemo2 {

	public static void main(String[] args) {
		Gamma g = new Gamma();
		
		if(g instanceof Gamma) {
			System.out.println("g is pointing to Gamma ");
		}
		if(g instanceof Beta) {
			System.out.println("g is pointing to Beta ");

		}
		if(g instanceof Alpha) {
			System.out.println("g is pointing to Alpha ");

		}
		if(g instanceof Object) {
			System.out.println("g is pointing to Object class Object ");

		}
	}

}
