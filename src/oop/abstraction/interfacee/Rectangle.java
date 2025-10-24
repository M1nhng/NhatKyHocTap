package oop.abstraction.interfacee;

public class Rectangle implements IShape{
    private double radius;
    
    public Rectangle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return 3.14 * Math.pow(radius, 2);
    }

    public double getPerimeter() {
        return 3.14 * 2 * radius;
    }
}
