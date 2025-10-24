package oop.abstraction.interfacee;

public class Circle implements IShape{
    private double length, width;
    

    public Circle(double length, double width) {
        this.length = length;
        this.width = width;
    }


    public double getArea(){
        return length * width;
    }

    public double getPerimeter(){
        return (length + width) * 2;
    }
}
