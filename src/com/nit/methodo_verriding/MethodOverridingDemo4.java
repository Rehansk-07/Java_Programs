package com.nit.methodo_verriding;

class Shape{
	public void Draw() {
		System.out.println("Generic Draw");
	} 
} 
class Square extends Shape{
	
	@Override
	public void Draw() {
	
		System.out.println("Square Draw");
	}
}
public class MethodOverridingDemo4 {

	public static void main(String[] args) {
		Shape s1 = new Square();
		s1.Draw();

	}

}
