package oop;

import java.util.Scanner;

class Rectangle {
	private double length;
	private double width;
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	public double getLength() {
		return length;
	}

	public double getWidth() {
		return width;
	}

	public void setLength(double length){
		this.length = length;
	}

	public void setWidth(double width){
		this.width = width;
	}

	public double getArea() {
		return length * width;
	}
	
	public double getPerimeter() {
		return (length + width) * 2;
	}
	
	
	public static void main(String[] agrs) {
		Scanner scanner = new Scanner(System.in);
		double length = scanner.nextDouble();
		double width = scanner.nextDouble();
		Rectangle retangle = new Rectangle(length, width);
		
		System.out.println("Area: " + retangle.getArea()  + "\nPerimeter: " + retangle.getPerimeter());
	}
}




