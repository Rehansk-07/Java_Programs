package com.nit.blc.encapsulation;

public class Rectangle {
private double width;
private double height;

public Rectangle(double width, double height) {
	super();
	this.width = width;
	this.height = height;
}
public double getArea() {
	return height*width;
}
public double getPerimeter() {
	return 2*(height+width);
	
 }
}
