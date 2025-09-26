package oop;

import java.util.Scanner;

class Rectangle {
	private double length;
	private double width;
	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}
	
	void getInfor() {
		System.out.println(getArea());
	
	}
	
	void display() {
		System.out.println(getArea());
	}

	public double getLength() {
		return length;
	}

	public double getWidth() {
		return width;
	}

	public double getArea() {
		return length * width;
	}
	
	public double getPerimeter() {
		return (length + width) * 2;
	}
	
	
	public static void main(String[] agrs) {
		Scanner scanner = new Scanner(System.in);
		Rectangle retangle = new Rectangle(scanner.nextDouble(), scanner.nextDouble());
		double findArea = retangle.getArea();
		double findPermimeter = retangle.getPerimeter();
		
		System.out.println(findArea + " " + findPermimeter);
		
		
	}
}




