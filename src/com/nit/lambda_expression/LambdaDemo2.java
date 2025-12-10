package com.nit.lambda_expression;

interface Calculate{
	void doSum(int x,int y);
}
public class LambdaDemo2 {

	public static void main(String[] args) {
		Calculate c1 = (c,d)-> System.out.println("Sum is :"+(c+d));
		c1.doSum(100, 50);
	}

}
